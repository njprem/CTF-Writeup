package androidx.compose.ui.focus;

import androidx.compose.runtime.changelist.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001c\u001a\u00020\u0002*\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "requestFocus", "requestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;", "requestFocusForChild", "childNode", "requestFocusForOwner", "requireActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.ongoingTransaction) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z = true;
            if (i2 == 1) {
                focusTargetNode.setFocusState(FocusStateImpl.Captured);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            } else if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            return z;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
            return true;
        }
        if (i2 == 2) {
            if (z) {
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z2) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
            return z;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!clearChildFocus(focusTargetNode, z, z2)) {
            return false;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Inactive);
        if (z2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.ongoingTransaction) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                } else {
                    focusTargetNode.setFocusState(FocusStateImpl.Active);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
            return z;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    private static final boolean grantFocus(final FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                focusTargetNode.fetchFocusProperties$ui_release();
            }
        });
        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 3 && i2 != 4) {
            return true;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Active);
        return true;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m3498performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        int i3 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i3 == 3) {
                CustomDestinationResult customDestinationResultM3498performCustomClearFocusMxy_nc0 = m3498performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i2);
                if (customDestinationResultM3498performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                    customDestinationResultM3498performCustomClearFocusMxy_nc0 = null;
                }
                return customDestinationResultM3498performCustomClearFocusMxy_nc0 == null ? m3500performCustomExitMxy_nc0(focusTargetNode, i2) : customDestinationResultM3498performCustomClearFocusMxy_nc0;
            }
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m3499performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m3460boximpl(i2));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.getDefault()) {
                    if (focusRequesterInvoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m3500performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m3460boximpl(i2));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.getDefault()) {
                    if (focusRequesterInvoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m3501performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        Modifier.Node nodePop;
        NodeChain nodes;
        int i3 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i3 == 1 || i3 == 2) {
            return CustomDestinationResult.None;
        }
        if (i3 == 3) {
            return m3498performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i2);
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
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
                                int i4 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
        if (i5 == 1) {
            return m3499performCustomEnterMxy_nc0(focusTargetNode2, i2);
        }
        if (i5 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i5 == 3) {
            return m3501performCustomRequestFocusMxy_nc0(focusTargetNode2, i2);
        }
        if (i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult customDestinationResultM3501performCustomRequestFocusMxy_nc0 = m3501performCustomRequestFocusMxy_nc0(focusTargetNode2, i2);
        CustomDestinationResult customDestinationResult = customDestinationResultM3501performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM3501performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? m3499performCustomEnterMxy_nc0(focusTargetNode2, i2) : customDestinationResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean performRequestFocus(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean requestFocus(FocusTargetNode focusTargetNode) {
        Boolean boolM3502requestFocusMxy_nc0 = m3502requestFocusMxy_nc0(focusTargetNode, FocusDirection.INSTANCE.m3470getEnterdhqQ8s());
        if (boolM3502requestFocusMxy_nc0 != null) {
            return boolM3502requestFocusMxy_nc0.booleanValue();
        }
        return false;
    }

    /* renamed from: requestFocus-Mxy_nc0, reason: not valid java name */
    public static final Boolean m3502requestFocusMxy_nc0(final FocusTargetNode focusTargetNode, int i2) {
        Boolean boolValueOf;
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (focusTargetNode.getNode().getIsAttached()) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
        };
        try {
            if (focusTransactionManagerRequireTransactionManager.ongoingTransaction) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            focusTransactionManagerRequireTransactionManager.cancellationListener.add(function0);
            int i3 = WhenMappings.$EnumSwitchMapping$0[m3501performCustomRequestFocusMxy_nc0(focusTargetNode, i2).ordinal()];
            if (i3 == 1) {
                boolValueOf = Boolean.valueOf(performRequestFocus(focusTargetNode));
            } else if (i3 != 2) {
                if (i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.TRUE;
            }
            return boolValueOf;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node nodePop;
        NodeChain nodes;
        NodeChain nodes2;
        int iM5355constructorimpl = NodeKind.m5355constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
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
                                int i2 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM5355constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.areEqual(nodePop, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i3 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetNode2);
            if (zGrantFocus) {
                focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
            }
            return zGrantFocus;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM5355constructorimpl2 = NodeKind.m5355constructorimpl(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent2 = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop4: while (true) {
                    if (layoutNodeRequireLayoutNode2 == null) {
                        break;
                    }
                    if ((a.b(layoutNodeRequireLayoutNode2) & iM5355constructorimpl2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iM5355constructorimpl2) != 0) {
                                Modifier.Node nodePop2 = parent2;
                                MutableVector mutableVector2 = null;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        node = nodePop2;
                                        break loop4;
                                    }
                                    if ((nodePop2.getKindSet() & iM5355constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                        int i4 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iM5355constructorimpl2) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nodePop2 = delegate2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector2.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                    parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
                    boolean zGrantFocus2 = grantFocus(focusTargetNode2);
                    if (zGrantFocus2) {
                        focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    }
                    return zGrantFocus2;
                }
                if (focusTargetNode3 == null || !requestFocusForChild(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zRequestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zRequestFocusForChild) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode3);
                }
                return zRequestFocusForChild;
            }
            requireActiveChild(focusTargetNode);
            if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo3484requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
