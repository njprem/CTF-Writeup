package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a:\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        if (CornerRadius.m3526getXimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m3526getXimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) > roundRect.getWidth()) {
            return false;
        }
        if (CornerRadius.m3526getXimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) + CornerRadius.m3526getXimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) > roundRect.getWidth()) {
            return false;
        }
        if (CornerRadius.m3527getYimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m3527getYimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
            return CornerRadius.m3527getYimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) + CornerRadius.m3527getYimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
        }
        return false;
    }

    public static final boolean isInOutline(Outline outline, float f2, float f3, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f2, f3);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f2, f3, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f2, f3, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f2, float f3, Path path, Path path2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f2, f3, path, path2);
    }

    private static final boolean isInPath(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo3684opN5in7k0(path, path2, PathOperation.INSTANCE.m4084getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f2, float f3) {
        return rect.getLeft() <= f2 && f2 < rect.getRight() && rect.getTop() <= f3 && f3 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f2, float f3, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f2 < roundRect.getLeft() || f2 >= roundRect.getRight() || f3 < roundRect.getTop() || f3 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f2, f3, path, path2);
        }
        float fM3526getXimpl = CornerRadius.m3526getXimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float fM3527getYimpl = CornerRadius.m3527getYimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - CornerRadius.m3526getXimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs());
        float fM3527getYimpl2 = CornerRadius.m3527getYimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - CornerRadius.m3526getXimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - CornerRadius.m3527getYimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - CornerRadius.m3527getYimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs());
        float fM3526getXimpl2 = CornerRadius.m3526getXimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f2 < fM3526getXimpl && f3 < fM3527getYimpl) {
            return m5507isWithinEllipseVE1yxkc(f2, f3, roundRect.m3601getTopLeftCornerRadiuskKHJgLs(), fM3526getXimpl, fM3527getYimpl);
        }
        if (f2 < fM3526getXimpl2 && f3 > bottom2) {
            return m5507isWithinEllipseVE1yxkc(f2, f3, roundRect.m3599getBottomLeftCornerRadiuskKHJgLs(), fM3526getXimpl2, bottom2);
        }
        if (f2 > right && f3 < fM3527getYimpl2) {
            return m5507isWithinEllipseVE1yxkc(f2, f3, roundRect.m3602getTopRightCornerRadiuskKHJgLs(), right, fM3527getYimpl2);
        }
        if (f2 <= right2 || f3 <= bottom) {
            return true;
        }
        return m5507isWithinEllipseVE1yxkc(f2, f3, roundRect.m3600getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m5507isWithinEllipseVE1yxkc(float f2, float f3, long j2, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fM3526getXimpl = CornerRadius.m3526getXimpl(j2);
        float fM3527getYimpl = CornerRadius.m3527getYimpl(j2);
        return ((f7 * f7) / (fM3527getYimpl * fM3527getYimpl)) + ((f6 * f6) / (fM3526getXimpl * fM3526getXimpl)) <= 1.0f;
    }
}
