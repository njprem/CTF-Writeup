package l;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0783a {
    public static PathBuilder a(float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f2, f3);
        return pathBuilder;
    }

    public static List b(PathBuilder pathBuilder, float f2, float f3, float f4, float f5) {
        pathBuilder.reflectiveCurveToRelative(f2, f3, f4, f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void c(PathBuilder pathBuilder, float f2, float f3, float f4, float f5) {
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineToRelative(f5);
    }
}
