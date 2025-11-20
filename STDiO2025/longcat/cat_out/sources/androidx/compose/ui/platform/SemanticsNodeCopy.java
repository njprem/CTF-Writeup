package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import j.AbstractC0662o;
import j.C0640F;
import j.r;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeCopy;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lj/o;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Lj/o;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Lj/F;", "children", "Lj/F;", "getChildren", "()Lj/F;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsNodeCopy {
    public static final int $stable = 8;
    private final C0640F children;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNodeCopy(SemanticsNode semanticsNode, AbstractC0662o abstractC0662o) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig();
        int[] iArr = r.f861a;
        this.children = new C0640F();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
            if (abstractC0662o.a(semanticsNode2.getId())) {
                this.children.b(semanticsNode2.getId());
            }
        }
    }

    public final C0640F getChildren() {
        return this.children;
    }

    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
