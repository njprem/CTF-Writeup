package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a5\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0007H\u0000\u001aA\u0010\u0012\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0002\u001a3\u0010\u001c\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u001d*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0000\u001a\u0016\u0010\"\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\"\u0010#\u001a\u00020$*\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\rH\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\n\u0010'\u001a\u00020(*\u00020\u0002\u001a\n\u0010)\u001a\u00020**\u00020\u0002\u001a\n\u0010+\u001a\u00020,*\u00020\u0002\u001a\n\u0010-\u001a\u00020.*\u00020\u0002\u001a\f\u0010/\u001a\u000200*\u00020\u0002H\u0000\u001a\f\u00101\u001a\u000202*\u00020\u0002H\u0000\u001aK\u00103\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\b\b\u0002\u00104\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a3\u00103\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\b\b\u0002\u00104\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u00107\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a)\u00107\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u0010:\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a)\u0010:\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u0010<\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b=\u00109\u001a)\u0010<\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001a3\u0010<\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\b\b\u0002\u00104\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aM\u0010>\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aA\u0010B\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\bC\u00109\u001aA\u0010D\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u00109\u001aA\u0010F\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\bG\u00109\u001a)\u0010F\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u0010H\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00010\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\bI\u00109\u001a)\u0010H\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0015H\u0080\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"isDelegationRoot", "", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "ancestors", "", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "asLayoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind", "kind", "block", "Lkotlin/Function1;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "has", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "nearestAncestor", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "mask", "", "pop", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireDensity", "Landroidx/compose/ui/unit/Density;", "requireGraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "visitAncestors", "includeSelf", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalAncestors", "visitLocalAncestors-6rFNWt0", "visitLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitSelfAndAncestors", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndChildren", "visitSelfAndChildren-6rFNWt0", "visitSelfAndLocalDescendants", "visitSelfAndLocalDescendants-6rFNWt0", "visitSubtree", "visitSubtree-6rFNWt0", "visitSubtreeIf", "visitSubtreeIf-6rFNWt0", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i2 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i2].getNodes().getHead());
                i2--;
            } while (i2 >= 0);
        }
    }

    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m5238ancestors64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet() & i2) != 0) {
                        for (Modifier.Node nodePop = parent$ui_release; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m5355constructorimpl(2) & node.getKindSet()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    delegate$ui_release = (!(delegate$ui_release instanceof DelegatingNode) || (NodeKind.m5355constructorimpl(2) & delegate$ui_release.getKindSet()) == 0) ? delegate$ui_release.getChild() : ((DelegatingNode) delegate$ui_release).getDelegate();
                }
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5239dispatchForKind6rFNWt0(Modifier.Node node, int i2, Function1<? super T, Unit> function1) {
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            function1.invoke(node);
            node = pop(null);
        }
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m5240has64DMado(DelegatableNode delegatableNode, int i2) {
        return (delegatableNode.getNode().getAggregateChildKindSet() & i2) != 0;
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet() & i2) != 0) {
                        return parent$ui_release;
                    }
                    parent$ui_release = parent$ui_release.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m5241nearestAncestor64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Object parent$ui_release = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (parent$ui_release != null) {
                    if ((((Modifier.Node) parent$ui_release).getKindSet() & i2) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        return (T) parent$ui_release;
                    }
                    parent$ui_release = (T) ((Modifier.Node) parent$ui_release).getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? (T) null : (T) nodes.getTail();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.isEmpty()) {
            return null;
        }
        return (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m5242requireCoordinator64DMado(DelegatableNode delegatableNode, int i2) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator$ui_release);
        if (coordinator$ui_release.getTail() != delegatableNode || !NodeKindKt.m5364getIncludeSelfInTraversalH91voCI(i2)) {
            return coordinator$ui_release;
        }
        NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped();
        Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m5242requireCoordinator64DMado(delegatableNode, NodeKind.m5355constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        throw androidx.compose.runtime.changelist.a.v("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        throw androidx.compose.runtime.changelist.a.v("This node does not have an owner.");
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i2, boolean z, Function1<? super Modifier.Node, Unit> function1) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i2) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i2, boolean z, Function1 function1, int i3, Object obj) {
        NodeChain nodes;
        if ((i3 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i2) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5243visitAncestorsYYKmho(DelegatableNode delegatableNode, int i2, boolean z, Function1<? super T, Unit> function1) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i2) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function1.invoke(nodePop);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5244visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i2, boolean z, Function1 function1, int i3, Object obj) {
        NodeChain nodes;
        if ((i3 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i2) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function1.invoke(nodePop);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child$ui_release2 = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((child$ui_release2.getAggregateChildKindSet() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, child$ui_release2);
            } else {
                while (true) {
                    if (child$ui_release2 == null) {
                        break;
                    }
                    if ((child$ui_release2.getKindSet() & i2) != 0) {
                        function1.invoke(child$ui_release2);
                        break;
                    }
                    child$ui_release2 = child$ui_release2.getChild();
                }
            }
        }
    }

    /* renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5245visitChildren6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((nodePop.getAggregateChildKindSet() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & i2) != 0) {
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function1.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
            if ((parent$ui_release.getKindSet() & i2) != 0) {
                function1.invoke(parent$ui_release);
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5246visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
            if ((parent$ui_release.getKindSet() & i2) != 0) {
                for (Modifier.Node nodePop = parent$ui_release; nodePop != null; nodePop = pop(null)) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    function1.invoke(nodePop);
                }
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i2, boolean z, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild();
        }
        while (node != null) {
            if ((node.getKindSet() & i2) != 0) {
                function1.invoke(node);
            }
            node = node.getChild();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild();
        }
        while (node != null) {
            if ((node.getKindSet() & i2) != 0) {
                function1.invoke(node);
            }
            node = node.getChild();
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5247visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node child$ui_release = node.getChild(); child$ui_release != null; child$ui_release = child$ui_release.getChild()) {
                if ((child$ui_release.getKindSet() & i2) != 0) {
                    for (Modifier.Node nodePop = child$ui_release; nodePop != null; nodePop = pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function1.invoke(nodePop);
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m5248visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i2, int i3, Function1<? super T, Unit> function1) {
        NodeChain nodes;
        Modifier.Node node = delegatableNode.getNode();
        int i4 = i2 | i3;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & i4) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i4) != 0) {
                        if (node2 != node && (node2.getKindSet() & i3) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & i2) != 0) {
                            for (Modifier.Node nodePop = node2; nodePop != null; nodePop = pop(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                function1.invoke(nodePop);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitSelfAndChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5249visitSelfAndChildren6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            Intrinsics.reifiedOperationMarker(3, "T");
            function1.invoke(node);
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((nodePop.getAggregateChildKindSet() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & i2) != 0) {
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function1.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5250visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) != 0) {
            while (node != null) {
                if ((node.getKindSet() & i2) != 0) {
                    for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function1.invoke(nodePop);
                    }
                }
                node = node.getChild();
            }
        }
    }

    public static final void visitSubtree(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child$ui_release.getAggregateChildKindSet() & i2) != 0) {
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet() & i2) != 0) {
                        function1.invoke(child$ui_release);
                    }
                    child$ui_release = child$ui_release.getChild();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            child$ui_release = null;
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    /* renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5251visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child$ui_release.getAggregateChildKindSet() & i2) != 0) {
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet() & i2) != 0) {
                        for (Modifier.Node nodePop = child$ui_release; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function1.invoke(nodePop);
                        }
                    }
                    child$ui_release = child$ui_release.getChild();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
            child$ui_release = null;
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & i2) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild()) {
                    if ((child$ui_release2.getKindSet() & i2) == 0 || function1.invoke(child$ui_release2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    /* renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5252visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & i2) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild()) {
                    if ((child$ui_release2.getKindSet() & i2) != 0) {
                        for (Modifier.Node nodePop = child$ui_release2; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (!function1.invoke(nodePop).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node child$ui_release = node.getChild(); child$ui_release != null; child$ui_release = child$ui_release.getChild()) {
                if ((child$ui_release.getKindSet() & i2) != 0) {
                    function1.invoke(child$ui_release);
                }
            }
        }
    }
}
