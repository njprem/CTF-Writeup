package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.runtime.changelist.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import j.C0643I;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B¬\u0001\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012:\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jg\u0010!\u001a\u00020\u0004\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0018*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J3\u0010%\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\"*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0082\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u0004\u0018\u00010&*\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(J\u001a\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J&\u00100\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J$\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\u0017J\u0017\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u00107J2\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J:\u0010D\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\u000b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\r0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ(\u0010H\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010,J\u0017\u0010M\u001a\u00020\r2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020@H\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020RH\u0016¢\u0006\u0004\bP\u0010SJ\u0017\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020TH\u0016¢\u0006\u0004\bP\u0010UJ\u0011\u0010V\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bV\u0010WRH\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010XR/\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ZR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ZR\"\u0010[\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010QR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010i\u001a\u00020h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006t"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", "name", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Landroidx/compose/ui/unit/LayoutDirection;", "onLayoutDirection", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "invalidateOwnerFocusState", "()V", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "onPreVisit", "onVisit", "onPostVisit", "traverseAncestorsIncludingSelf-QFhIj7k", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "traverseAncestorsIncludingSelf", "", "nearestAncestorIncludingSelf-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "nearestAncestorIncludingSelf", "Landroidx/compose/ui/Modifier$Node;", "lastLocalKeyInputNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "validateKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "validateKeyEvent", "requestFocusForOwner-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestFocusForOwner", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "releaseFocus", "force", "clearFocus", "(Z)V", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "moveFocus-3ESFkO8", "(I)Z", "moveFocus", "focusedRect", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Lj/I;", "keysCurrentlyDown", "Lj/I;", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private final FocusInvalidationManager focusInvalidationManager;
    private C0643I keysCurrentlyDown;
    private final Function0<Unit> onClearFocusForOwner;
    private final Function0<Rect> onFocusRectInterop;
    private final Function0<LayoutDirection> onLayoutDirection;
    private final Function1<FocusDirection, Boolean> onMoveFocusInterop;
    private final Function2<FocusDirection, Rect, Boolean> onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode();
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = FocusPropertiesKt.focusProperties(Modifier.INSTANCE, new Function1<FocusProperties, Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusProperties focusProperties) {
            focusProperties.setCanFocus(false);
        }
    }).then(new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.getRootFocusNode().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create */
        public FocusTargetNode getNode() {
            return this.this$0.getRootFocusNode();
        }
    });

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super FocusDirection, ? super Rect, Boolean> function2, Function1<? super FocusDirection, Boolean> function12, Function0<Unit> function0, Function0<Rect> function02, Function0<? extends LayoutDirection> function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(1024) | NodeKind.m5355constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & iM5355constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM5355constructorimpl) != 0) {
                    if ((NodeKind.m5355constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }

    /* renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m3486nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Object node = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (node != null) {
                    if ((((Modifier.Node) node).getKindSet() & i2) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        return (T) node;
                    }
                    node = (T) ((Modifier.Node) node).getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? (T) null : (T) nodes.getTail();
        }
        return null;
    }

    /* renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m3487traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        int size;
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i2) != 0) {
                        for (Modifier.Node nodePop = parent; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i3 = size - 1;
                function1.invoke((Object) arrayList.get(size));
                if (i3 < 0) {
                    break;
                } else {
                    size = i3;
                }
            }
        }
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = DelegatableNodeKt.pop(null)) {
            Intrinsics.reifiedOperationMarker(3, "T");
            function1.invoke(node);
        }
        function0.invoke();
        for (Modifier.Node node2 = delegatableNode.getNode(); node2 != null; node2 = DelegatableNodeKt.pop(null)) {
            Intrinsics.reifiedOperationMarker(3, "T");
            function12.invoke(node2);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                function12.invoke((Object) arrayList.get(i4));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r3 = r5.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r5.f738e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (((r5.f874a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (r5.f876c <= 8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e6, code lost:
    
        if (java.lang.Long.compare(androidx.compose.runtime.changelist.a.e(r5.f877d, 32) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(r5.f876c, 25) ^ Long.MIN_VALUE) > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        r3 = r5.f874a;
        r6 = r5.f876c;
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r7 >= r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r9 = r7 >> 3;
        r10 = (r7 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fe, code lost:
    
        if (((r3[r9] >> r10) & 255) != 254) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0100, code lost:
    
        r13 = r5.f874a;
        r14 = r6;
        r19 = r7;
        r13[r9] = (r13[r9] & (~(255 << r10))) | (128 << r10);
        r6 = r5.f876c;
        r7 = ((r19 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r13[r6] = ((~(255 << r7)) & r13[r6]) | (128 << r7);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0132, code lost:
    
        r14 = r6;
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0135, code lost:
    
        r7 = r19 + 1;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        r5.f738e += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0142, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
    
        r3 = j.d0.b(r5.f876c);
        r6 = r5.f874a;
        r7 = r5.f875b;
        r8 = r5.f876c;
        r5.c(r3);
        r3 = r5.f875b;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0157, code lost:
    
        if (r9 >= r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0166, code lost:
    
        if (((r6[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0168, code lost:
    
        r13 = r7[r9];
        r10 = java.lang.Long.hashCode(r13) * (-862048943);
        r10 = r10 ^ (r10 << 16);
        r17 = r15;
        r15 = r5.b(r10 >>> 7);
        r16 = r6;
        r19 = r7;
        r6 = r10 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        r10 = r5.f874a;
        r20 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r10[r20] = (r10[r20] & (~(255 << r23))) | (r6 << r23);
        r6 = r5.f876c;
        r7 = ((r15 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r10[r6] = (r10[r6] & (~(255 << r7))) | (r6 << r7);
        r3[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
    
        r19 = r7;
        r17 = r15;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c2, code lost:
    
        r9 = r9 + 1;
        r6 = r16;
        r15 = r17;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cb, code lost:
    
        r3 = r5.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01cf, code lost:
    
        r15 = r3;
        r5.f877d++;
        r3 = r5.f738e;
        r4 = r5.f874a;
        r6 = r15 >> 3;
        r7 = r4[r6];
        r9 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
    
        if (((r7 >> r9) & 255) != r17) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ea, code lost:
    
        r22 = r29 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ec, code lost:
    
        r5.f738e = r3 - r22;
        r4[r6] = (r7 & (~(255 << r9))) | (r11 << r9);
        r3 = r5.f876c;
        r6 = ((r15 - 7) & r3) + (r3 & 7);
        r3 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r4[r3] = (r4[r3] & (~(255 << r6))) | (r11 << r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029f, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a1, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m3488validateKeyEventZmokQxo(android.view.KeyEvent r38) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.m3488validateKeyEventZmokQxo(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        mo3480clearFocusI7lrPNg(force, true, true, FocusDirection.INSTANCE.m3471getExitdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    public boolean mo3480clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zClearFocus;
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                focusTransactionManager.cancellationListener.add(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
            }
            if (!force) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m3498performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()];
                zClearFocus = (i2 == 1 || i2 == 2 || i2 == 3) ? false : FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents);
            }
            if (zClearFocus && clearOwnerFocus) {
                this.onClearFocusForOwner.invoke();
            }
            return zClearFocus;
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo3481dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM5355constructorimpl = NodeKind.m5355constructorimpl(Fields.RenderEffect);
            if (!focusTargetNodeFindActiveFocusNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindActiveFocusNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iM5355constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = node;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i2 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNodePop;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int iM5355constructorimpl2 = NodeKind.m5355constructorimpl(Fields.RenderEffect);
            if (!softKeyboardInterceptionModifierNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = softKeyboardInterceptionModifierNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((a.b(layoutNodeRequireLayoutNode2) & iM5355constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM5355constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM5355constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM5355constructorimpl2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo4537onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            DelegatingNode node2 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node2).mo4537onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM5355constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node2.getDelegate();
                    int i5 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM5355constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.add(node2);
                                    node2 = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).mo4536onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iM5355constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node3.getDelegate();
                    int i6 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM5355constructorimpl2) != 0) {
                            i6++;
                            if (i6 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.add(node3);
                                    node3 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i6 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i7)).mo4536onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo3482dispatchKeyEventYhN2O0w(android.view.KeyEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo3482dispatchKeyEventYhN2O0w(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM5355constructorimpl = NodeKind.m5355constructorimpl(Fields.Clip);
            if (!focusTargetNodeFindActiveFocusNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindActiveFocusNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iM5355constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = node;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i2 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNodePop;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int iM5355constructorimpl2 = NodeKind.m5355constructorimpl(Fields.Clip);
            if (!rotaryInputModifierNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = rotaryInputModifierNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((a.b(layoutNodeRequireLayoutNode2) & iM5355constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM5355constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM5355constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM5355constructorimpl2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            DelegatingNode node2 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM5355constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node2.getDelegate();
                    int i5 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM5355constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.add(node2);
                                    node2 = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node3 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iM5355constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node3.getDelegate();
                    int i6 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM5355constructorimpl2) != 0) {
                            i6++;
                            if (i6 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.add(node3);
                                    node3 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i6 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((RotaryInputModifierNode) arrayList.get(i7)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    public Boolean mo3483focusSearchULY8qGw(int focusDirection, Rect focusedRect, final Function1<? super FocusTargetNode, Boolean> onFound) {
        final FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            FocusRequester focusRequesterM3503customFocusSearchOMvw8 = FocusTraversalKt.m3503customFocusSearchOMvw8(focusTargetNodeFindActiveFocusNode, focusDirection, this.onLayoutDirection.invoke());
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.areEqual(focusRequesterM3503customFocusSearchOMvw8, companion.getCancel())) {
                return null;
            }
            if (!Intrinsics.areEqual(focusRequesterM3503customFocusSearchOMvw8, companion.getDefault())) {
                return Boolean.valueOf(focusRequesterM3503customFocusSearchOMvw8.findFocusTargetNode$ui_release(onFound));
            }
        } else {
            focusTargetNodeFindActiveFocusNode = null;
        }
        return FocusTraversalKt.m3504focusSearch0X8WOeE(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.areEqual(focusTargetNode, focusTargetNodeFindActiveFocusNode)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = onFound.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo3478moveFocus3ESFkO8(final int focusDirection) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Boolean.FALSE;
        Boolean boolMo3483focusSearchULY8qGw = mo3483focusSearchULY8qGw(focusDirection, this.onFocusRectInterop.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = FocusTransactionsKt.m3502requestFocusMxy_nc0(focusTargetNode, focusDirection);
                Boolean bool = objectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        if (boolMo3483focusSearchULY8qGw == null || objectRef.element == 0) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolMo3483focusSearchULY8qGw, bool) && Intrinsics.areEqual(objectRef.element, bool)) {
            return true;
        }
        return FocusOwnerImplKt.m3489is1dFocusSearch3ESFkO8(focusDirection) ? mo3480clearFocusI7lrPNg(false, true, false, focusDirection) && mo3485takeFocusaToIllA(focusDirection, null) : this.onMoveFocusInterop.invoke(FocusDirection.m3460boximpl(focusDirection)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.ongoingTransaction) {
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.beginTransaction();
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: requestFocusForOwner-7o62pno */
    public boolean mo3484requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public boolean mo3485takeFocusaToIllA(final int focusDirection, Rect previouslyFocusedRect) {
        Boolean boolMo3483focusSearchULY8qGw = mo3483focusSearchULY8qGw(focusDirection, previouslyFocusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolM3502requestFocusMxy_nc0 = FocusTransactionsKt.m3502requestFocusMxy_nc0(focusTargetNode, focusDirection);
                return Boolean.valueOf(boolM3502requestFocusMxy_nc0 != null ? boolM3502requestFocusMxy_nc0.booleanValue() : false);
            }
        });
        if (boolMo3483focusSearchULY8qGw != null) {
            return boolMo3483focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }
}
