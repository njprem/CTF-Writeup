package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0002*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a-\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\f\u001a(\u0010\u0007\u001a\u00020\b*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u001a-\u0010\r\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\f\u001a(\u0010\r\u001a\u00020\b*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u001a-\u0010\u000e\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0002\u0010\f\u001a(\u0010\u000e\u001a\u00020\b*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\n¨\u0006\u0010"}, d2 = {"findNearestAncestor", "T", "Landroidx/compose/ui/node/TraversableNode;", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "key", "", "traverseAncestors", "", "block", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)V", "traverseChildren", "traverseDescendants", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    public static final TraversableNode findNearestAncestor(DelegatableNode delegatableNode, Object obj) {
        NodeChain nodes;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM5355constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (Intrinsics.areEqual(obj, traversableNode.getTraverseKey())) {
                                    return traversableNode;
                                }
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
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void traverseAncestors(DelegatableNode delegatableNode, Object obj, Function1<? super TraversableNode, Boolean> function1) {
        NodeChain nodes;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM5355constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (!(Intrinsics.areEqual(obj, traversableNode.getTraverseKey()) ? function1.invoke(traversableNode).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0) && (delegatingNodePop instanceof DelegatingNode)) {
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
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void traverseChildren(androidx.compose.ui.node.DelegatableNode r10, java.lang.Object r11, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m5355constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto Lc4
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r10.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r10 = r1.isNotEmpty()
            if (r10 == 0) goto Lc3
            r10 = 1
            java.lang.Object r3 = androidx.compose.runtime.changelist.a.h(r1, r10)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r5 = r3.getAggregateChildKindSet()
            r5 = r5 & r0
            if (r5 != 0) goto L47
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L47:
            if (r3 == 0) goto L2f
            int r5 = r3.getKindSet()
            r5 = r5 & r0
            if (r5 == 0) goto Lbe
            r5 = 0
            r6 = r5
        L52:
            if (r3 == 0) goto L2f
            boolean r7 = r3 instanceof androidx.compose.ui.node.TraversableNode
            if (r7 == 0) goto L73
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.ui.node.TraversableNode) r3
            java.lang.Object r7 = r3.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r7)
            if (r7 == 0) goto L6f
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L70
        L6f:
            r3 = r10
        L70:
            if (r3 != 0) goto Lb9
            goto Lc3
        L73:
            int r7 = r3.getKindSet()
            r7 = r7 & r0
            if (r7 == 0) goto L7c
            r7 = r10
            goto L7d
        L7c:
            r7 = r4
        L7d:
            if (r7 == 0) goto Lb9
            boolean r7 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lb9
            r7 = r3
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r4
        L8b:
            if (r7 == 0) goto Lb6
            int r9 = r7.getKindSet()
            r9 = r9 & r0
            if (r9 == 0) goto L96
            r9 = r10
            goto L97
        L96:
            r9 = r4
        L97:
            if (r9 == 0) goto Lb1
            int r8 = r8 + 1
            if (r8 != r10) goto L9f
            r3 = r7
            goto Lb1
        L9f:
            if (r6 != 0) goto La8
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        La8:
            if (r3 == 0) goto Lae
            r6.add(r3)
            r3 = r5
        Lae:
            r6.add(r7)
        Lb1:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L8b
        Lb6:
            if (r8 != r10) goto Lb9
            goto L52
        Lb9:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L52
        Lbe:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            goto L47
        Lc3:
            return
        Lc4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "visitChildren called on an unattached node"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void traverseDescendants(DelegatableNode delegatableNode, Object obj, Function1<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> function1) {
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & iM5355constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM5355constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke = Intrinsics.areEqual(obj, traversableNode.getTraverseKey()) ? function1.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
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
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    public static final <T extends TraversableNode> T findNearestAncestor(T t) {
        NodeChain nodes;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(262144);
        if (t.getNode().getIsAttached()) {
            Modifier.Node parent = t.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t);
            while (layoutNodeRequireLayoutNode != null) {
                if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM5355constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = parent;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof TraversableNode) {
                                    T t2 = (T) delegatingNodePop;
                                    if (Intrinsics.areEqual(t.getTraverseKey(), t2.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t, t2)) {
                                        return t2;
                                    }
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
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final <T extends TraversableNode> void traverseAncestors(T t, Function1<? super T, Boolean> function1) {
        NodeChain nodes;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(262144);
        if (t.getNode().getIsAttached()) {
            Modifier.Node parent = t.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t);
            while (layoutNodeRequireLayoutNode != null) {
                if ((androidx.compose.runtime.changelist.a.b(layoutNodeRequireLayoutNode) & iM5355constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM5355constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = parent;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                boolean zBooleanValue = true;
                                if (delegatingNodePop instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                    if (Intrinsics.areEqual(t.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t, traversableNode)) {
                                        zBooleanValue = function1.invoke(traversableNode).booleanValue();
                                    }
                                    if (!zBooleanValue) {
                                        return;
                                    }
                                } else {
                                    if (((delegatingNodePop.getKindSet() & iM5355constructorimpl) != 0) && (delegatingNodePop instanceof DelegatingNode)) {
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
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(T r11, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m5355constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto Lcf
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r3 = r1.isNotEmpty()
            if (r3 == 0) goto Lce
            r3 = 1
            java.lang.Object r5 = androidx.compose.runtime.changelist.a.h(r1, r3)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r6 = r5.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L47
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L2f
        L47:
            if (r5 == 0) goto L2f
            int r6 = r5.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Lc8
            r6 = 0
            r7 = r6
        L52:
            if (r5 == 0) goto L2f
            boolean r8 = r5 instanceof androidx.compose.ui.node.TraversableNode
            if (r8 == 0) goto L7d
            androidx.compose.ui.node.TraversableNode r5 = (androidx.compose.ui.node.TraversableNode) r5
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r5.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L79
            boolean r8 = androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(r11, r5)
            if (r8 == 0) goto L79
            java.lang.Object r5 = r12.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L7a
        L79:
            r5 = r3
        L7a:
            if (r5 != 0) goto Lc3
            goto Lce
        L7d:
            int r8 = r5.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L86
            r8 = r3
            goto L87
        L86:
            r8 = r4
        L87:
            if (r8 == 0) goto Lc3
            boolean r8 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Lc3
            r8 = r5
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate()
            r9 = r4
        L95:
            if (r8 == 0) goto Lc0
            int r10 = r8.getKindSet()
            r10 = r10 & r0
            if (r10 == 0) goto La0
            r10 = r3
            goto La1
        La0:
            r10 = r4
        La1:
            if (r10 == 0) goto Lbb
            int r9 = r9 + 1
            if (r9 != r3) goto La9
            r5 = r8
            goto Lbb
        La9:
            if (r7 != 0) goto Lb2
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lb2:
            if (r5 == 0) goto Lb8
            r7.add(r5)
            r5 = r6
        Lb8:
            r7.add(r8)
        Lbb:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild()
            goto L95
        Lc0:
            if (r9 != r3) goto Lc3
            goto L52
        Lc3:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L52
        Lc8:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L47
        Lce:
            return
        Lcf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends TraversableNode> void traverseDescendants(T t, Function1<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> function1) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(262144);
        if (!t.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = t.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) androidx.compose.runtime.changelist.a.h(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & iM5355constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM5355constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (Intrinsics.areEqual(t.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t, traversableNode)) {
                                    traverseDescendantsActionInvoke = function1.invoke(traversableNode);
                                } else {
                                    traverseDescendantsActionInvoke = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
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
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
        }
    }
}
