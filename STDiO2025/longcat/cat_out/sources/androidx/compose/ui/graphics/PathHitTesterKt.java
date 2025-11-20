package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"EmptyPath", "Landroidx/compose/ui/graphics/Path;", "PathHitTester", "Landroidx/compose/ui/graphics/PathHitTester;", "path", "tolerance", "", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathHitTesterKt {
    private static final Path EmptyPath = AndroidPath_androidKt.Path();

    public static final PathHitTester PathHitTester(Path path, float f2) {
        PathHitTester pathHitTester = new PathHitTester();
        pathHitTester.updatePath(path, f2);
        return pathHitTester;
    }

    public static /* synthetic */ PathHitTester PathHitTester$default(Path path, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.5f;
        }
        return PathHitTester(path, f2);
    }
}
