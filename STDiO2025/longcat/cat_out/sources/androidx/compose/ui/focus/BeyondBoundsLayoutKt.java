package androidx.compose.ui.focus;

import androidx.compose.runtime.changelist.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m3459searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i2, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        Modifier.Node nodePop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int iM5106getBeforehoxUOeE;
        NodeChain nodes;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM5355constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet() & iM5355constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
        if ((focusTargetNode2 != null && Intrinsics.areEqual(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m3463equalsimpl0(i2, companion.m3476getUpdhqQ8s())) {
            iM5106getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5104getAbovehoxUOeE();
        } else if (FocusDirection.m3463equalsimpl0(i2, companion.m3469getDowndhqQ8s())) {
            iM5106getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5107getBelowhoxUOeE();
        } else if (FocusDirection.m3463equalsimpl0(i2, companion.m3472getLeftdhqQ8s())) {
            iM5106getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5108getLefthoxUOeE();
        } else if (FocusDirection.m3463equalsimpl0(i2, companion.m3475getRightdhqQ8s())) {
            iM5106getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5109getRighthoxUOeE();
        } else if (FocusDirection.m3463equalsimpl0(i2, companion.m3473getNextdhqQ8s())) {
            iM5106getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5105getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m3463equalsimpl0(i2, companion.m3474getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iM5106getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m5106getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo795layouto7g1Pn8(iM5106getBeforehoxUOeE, function1);
    }
}
