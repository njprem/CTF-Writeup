package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001aN\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009f\u0001\u0010\u001a\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010\"\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010%\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!H\u0082\b\u001a\f\u0010'\u001a\u00020(*\u00020#H\u0002\u001a\u0011\u0010)\u001a\u00020**\u00020\u001dH\u0002¢\u0006\u0002\u0010+\u001a\u0011\u0010)\u001a\u00020**\u00020#H\u0002¢\u0006\u0002\u0010,\u001a\u0011\u0010-\u001a\u00020.*\u00020\u001dH\u0002¢\u0006\u0002\u0010+\u001a\u0011\u0010-\u001a\u00020.*\u00020#H\u0002¢\u0006\u0002\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"addOutline", "", "Landroidx/compose/ui/graphics/Path;", "outline", "Landroidx/compose/ui/graphics/Outline;", "drawOutline", "Landroidx/compose/ui/graphics/Canvas;", "paint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutlineHelper", "drawRectBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "rect", "Lkotlin/ExtensionFunctionType;", "drawRoundedRectBlock", "Landroidx/compose/ui/geometry/RoundRect;", "rrect", "drawPathBlock", "path", "hasSameCornerRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Rect;)J", "(Landroidx/compose/ui/geometry/RoundRect;)J", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
        } else if (outline instanceof Outline.Rounded) {
            Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.m4061addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                canvas.drawPath(roundRectPath, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m3526getXimpl(rounded.getRoundRect().m3599getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m3527getYimpl(rounded.getRoundRect().m3599getBottomLeftCornerRadiuskKHJgLs()), paint);
            }
        }
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m4047drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo4254drawRectAsUm42w(brush, topLeft(rect), size(rect), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo4250drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f2, drawStyle, colorFilter, i2);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath = rounded.getRoundRectPath();
        if (roundRectPath != null) {
            drawScope.mo4250drawPathGBMwjPU(roundRectPath, brush, f2, drawStyle, colorFilter, i2);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        drawScope.mo4256drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m3526getXimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f2, drawStyle, colorFilter, i2);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m4048drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i3 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i3 & 32) != 0) {
            i2 = DrawScope.INSTANCE.m4344getDefaultBlendMode0nO6VwU();
        }
        m4047drawOutlinehn5TExg(drawScope, outline, brush, f3, drawStyle2, colorFilter2, i2);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m4049drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo4255drawRectnJ9OG0(j2, topLeft(rect), size(rect), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo4251drawPathLG529CI(((Outline.Generic) outline).getPath(), j2, f2, drawStyle, colorFilter, i2);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath = rounded.getRoundRectPath();
        if (roundRectPath != null) {
            drawScope.mo4251drawPathLG529CI(roundRectPath, j2, f2, drawStyle, colorFilter, i2);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        drawScope.mo4257drawRoundRectuAw5IA(j2, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m3526getXimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), drawStyle, f2, colorFilter, i2);
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m4050drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i3 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        m4049drawOutlinewDX37Ww(drawScope, outline, j2, f3, drawStyle2, colorFilter, (i3 & 32) != 0 ? DrawScope.INSTANCE.m4344getDefaultBlendMode0nO6VwU() : i2);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, Function2<? super DrawScope, ? super Rect, Unit> function2, Function2<? super DrawScope, ? super RoundRect, Unit> function22, Function2<? super DrawScope, ? super Path, Unit> function23) {
        if (outline instanceof Outline.Rectangle) {
            function2.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            function23.invoke(drawScope, ((Outline.Generic) outline).getPath());
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                function23.invoke(drawScope, roundRectPath);
            } else {
                function22.invoke(drawScope, rounded.getRoundRect());
            }
        }
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((CornerRadius.m3526getXimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m3526getXimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3526getXimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m3526getXimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3526getXimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m3526getXimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3526getXimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3526getXimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3526getXimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m3526getXimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3526getXimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3526getXimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((CornerRadius.m3527getYimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m3527getYimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3527getYimpl(roundRect.m3599getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m3527getYimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3527getYimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m3527getYimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3527getYimpl(roundRect.m3600getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3527getYimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3527getYimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m3527getYimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3527getYimpl(roundRect.m3602getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3527getYimpl(roundRect.m3601getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }
}
