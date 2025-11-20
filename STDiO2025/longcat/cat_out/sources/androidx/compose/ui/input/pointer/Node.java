package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import j.AbstractC0672z;
import j.C0646L;
import j.C0671y;
import java.util.List;
import k.AbstractC0673a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010!\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J5\u0010%\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006?"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "oldEvent", "newEvent", "", "hasPositionChanged", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "", "clearCache", "()V", "Lkotlin/Function0;", "block", "dispatchIfNeeded", "(Lkotlin/jvm/functions/Function0;)Z", "", "pointerIdValue", "Lj/L;", "hitNodes", "removeInvalidPointerIdsAndChanges", "(JLj/L;)V", "Lj/y;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "dispatchMainEventPass", "(Lj/y;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "buildCache", "dispatchCancel", "markIsIn", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "relevantChanges", "Lj/y;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "wasIn", "Z", "isIn", "hasExited", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final C0671y relevantChanges = new C0671y(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        C0671y c0671y = this.relevantChanges;
        int i2 = c0671y.f882d;
        Object[] objArr = c0671y.f881c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c0671y.f882d = 0;
        c0671y.f879a = false;
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> block) {
        if ((this.relevantChanges.c() == 0) || !this.modifierNode.getIsAttached()) {
            return false;
        }
        block.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Offset.m3548equalsimpl0(oldEvent.getChanges().get(i2).getPosition(), newEvent.getChanges().get(i2).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0269  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean buildCache(j.C0671y r39, androidx.compose.ui.layout.LayoutCoordinates r40, androidx.compose.ui.input.pointer.InternalPointerEvent r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(j.y, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            boolean pressed = pointerInputChange.getPressed();
            boolean zM4920activeHoverEvent0FcD4WY = internalPointerEvent.m4920activeHoverEvent0FcD4WY(pointerInputChange.getId());
            boolean z = this.isIn;
            if ((!pressed && !zM4920activeHoverEvent0FcD4WY) || (!pressed && !z)) {
                this.pointerIds.m5087remove0FcD4WY(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m4940equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m4945getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i2 = 0;
            do {
                content[i2].dispatchCancel();
                i2++;
            } while (i2 < size);
        }
        DelegatingNode delegatingNodePop = this.modifierNode;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).onCancelPointerInput();
            } else if ((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i3 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                        i3++;
                        if (i3 == 1) {
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
                if (i3 == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!(this.relevantChanges.c() == 0) && this.modifierNode.getIsAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            long jMo5128getSizeYbymL2g = layoutCoordinates.mo5128getSizeYbymL2g();
            DelegatingNode delegatingNodePop = this.modifierNode;
            int iM5355constructorimpl = NodeKind.m5355constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNodePop != 0) {
                if (delegatingNodePop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop).mo170onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo5128getSizeYbymL2g);
                } else if ((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                    int i3 = 0;
                    delegatingNodePop = delegatingNodePop;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                            i3++;
                            if (i3 == 1) {
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
                    if (i3 == 1) {
                    }
                }
                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i2].dispatchFinalEventPass(internalPointerEvent);
                    i2++;
                } while (i2 < size);
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(C0671y changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> children;
        int size;
        if ((this.relevantChanges.c() == 0) || !this.modifierNode.getIsAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates);
        long jMo5128getSizeYbymL2g = layoutCoordinates.mo5128getSizeYbymL2g();
        DelegatingNode delegatingNodePop = this.modifierNode;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).mo170onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo5128getSizeYbymL2g);
            } else if ((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
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
        if (this.modifierNode.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            int i3 = 0;
            do {
                Node node = content[i3];
                C0671y c0671y = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(c0671y, layoutCoordinates2, internalPointerEvent, isInBounds);
                i3++;
            } while (i3 < size);
        }
        if (this.modifierNode.getIsAttached()) {
            DelegatingNode delegatingNodePop2 = this.modifierNode;
            int iM5355constructorimpl2 = NodeKind.m5355constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNodePop2 != 0) {
                if (delegatingNodePop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop2).mo170onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo5128getSizeYbymL2g);
                } else if ((delegatingNodePop2.getKindSet() & iM5355constructorimpl2) != 0 && (delegatingNodePop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate2 = delegatingNodePop2.getDelegate();
                    int i4 = 0;
                    delegatingNodePop2 = delegatingNodePop2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & iM5355constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                delegatingNodePop2 = delegate2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop2 != 0) {
                                    mutableVector2.add(delegatingNodePop2);
                                    delegatingNodePop2 = 0;
                                }
                                mutableVector2.add(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        delegatingNodePop2 = delegatingNodePop2;
                    }
                    if (i4 == 1) {
                    }
                }
                delegatingNodePop2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, C0646L hitNodes) {
        int i2 = 0;
        if (this.pointerIds.contains(pointerIdValue)) {
            Object[] objArr = hitNodes.f773a;
            int i3 = hitNodes.f774b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    i4 = -1;
                    break;
                } else if (equals(objArr[i4])) {
                    break;
                } else {
                    i4++;
                }
            }
            if (!(i4 >= 0)) {
                this.pointerIds.remove(pointerIdValue);
                C0671y c0671y = this.relevantChanges;
                int iB = AbstractC0673a.b(c0671y.f880b, c0671y.f882d, pointerIdValue);
                if (iB >= 0) {
                    Object[] objArr2 = c0671y.f881c;
                    Object obj = objArr2[iB];
                    Object obj2 = AbstractC0672z.f883a;
                    if (obj != obj2) {
                        objArr2[iB] = obj2;
                        c0671y.f879a = true;
                    }
                }
            }
        }
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            do {
                content[i2].removeInvalidPointerIdsAndChanges(pointerIdValue, hitNodes);
                i2++;
            } while (i2 < size);
        }
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
