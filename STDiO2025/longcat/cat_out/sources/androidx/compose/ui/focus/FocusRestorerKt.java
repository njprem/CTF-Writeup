package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0001\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\tH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"PrevFocusedChild", "", "focusRestorer", "Landroidx/compose/ui/Modifier;", "onRestoreFailed", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "pinFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/ui/focus/FocusTargetNode;", "restoreFocusedChild", "", "saveFocusedChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRestorerKt {
    private static final String PrevFocusedChild = "previouslyFocusedChildHash";

    public static final Modifier focusRestorer(Modifier modifier, Function0<FocusRequester> function0) {
        return modifier.then(new FocusRestorerElement(function0));
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        return focusRestorer(modifier, function0);
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNodeFindActiveFocusNode, PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0059, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean saveFocusedChild(final androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r11.getFocusState()
            boolean r0 = r0.getHasFocus()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m5355constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r11.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto Ld9
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r2.<init>(r4, r1)
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            if (r4 != 0) goto L37
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4)
            goto L3a
        L37:
            r2.add(r4)
        L3a:
            boolean r4 = r2.isNotEmpty()
            if (r4 == 0) goto Ld8
            r4 = 1
            java.lang.Object r5 = androidx.compose.runtime.changelist.a.h(r2, r4)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r6 = r5.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L52
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r5)
            goto L3a
        L52:
            if (r5 == 0) goto L3a
            int r6 = r5.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Ld2
            r6 = 0
            r7 = r6
        L5d:
            if (r5 == 0) goto L3a
            boolean r8 = r5 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r8 == 0) goto L91
            androidx.compose.ui.focus.FocusTargetNode r5 = (androidx.compose.ui.focus.FocusTargetNode) r5
            androidx.compose.ui.focus.FocusStateImpl r8 = r5.getFocusState()
            boolean r8 = r8.getHasFocus()
            if (r8 == 0) goto Lcd
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r5)
            int r0 = r0.getCompositeKeyHash()
            r11.setPreviouslyFocusedChildHash(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L90
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>()
            java.lang.String r11 = "previouslyFocusedChildHash"
            r0.registerProvider(r11, r1)
        L90:
            return r4
        L91:
            int r8 = r5.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto Lcd
            boolean r8 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Lcd
            r8 = r5
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate()
            r9 = r1
        La4:
            if (r8 == 0) goto Lca
            int r10 = r8.getKindSet()
            r10 = r10 & r0
            if (r10 == 0) goto Lc5
            int r9 = r9 + 1
            if (r9 != r4) goto Lb3
            r5 = r8
            goto Lc5
        Lb3:
            if (r7 != 0) goto Lbc
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r3]
            r7.<init>(r10, r1)
        Lbc:
            if (r5 == 0) goto Lc2
            r7.add(r5)
            r5 = r6
        Lc2:
            r7.add(r8)
        Lc5:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild()
            goto La4
        Lca:
            if (r9 != r4) goto Lcd
            goto L5d
        Lcd:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L5d
        Ld2:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L52
        Ld8:
            return r1
        Ld9:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
