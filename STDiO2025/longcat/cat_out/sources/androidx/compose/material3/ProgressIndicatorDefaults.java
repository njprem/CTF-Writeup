package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R$\u0010\n\u001a\u00020\u000b8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R$\u0010\u0017\u001a\u00020\u000b8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020 8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020 8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0017\u0010%\u001a\u00020 8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010\"R \u0010'\u001a\u00020 8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\"R\u0017\u0010*\u001a\u00020 8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0017\u0010,\u001a\u00020 8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "()V", "CircularDeterminateStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getCircularDeterminateStrokeCap-KaPHkGw", "()I", "I", "CircularIndeterminateStrokeCap", "getCircularIndeterminateStrokeCap-KaPHkGw", "CircularIndicatorTrackGapSize", "Landroidx/compose/ui/unit/Dp;", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "getCircularIndicatorTrackGapSize-D9Ej5fM", "()F", "F", "CircularStrokeWidth", "getCircularStrokeWidth-D9Ej5fM", "LinearIndicatorTrackGapSize", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "getLinearIndicatorTrackGapSize-D9Ej5fM", "LinearStrokeCap", "getLinearStrokeCap-KaPHkGw", "LinearTrackStopIndicatorSize", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "getLinearTrackStopIndicatorSize-D9Ej5fM", "ProgressAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "circularColor", "Landroidx/compose/ui/graphics/Color;", "getCircularColor", "(Landroidx/compose/runtime/Composer;I)J", "circularDeterminateTrackColor", "getCircularDeterminateTrackColor", "circularIndeterminateTrackColor", "getCircularIndeterminateTrackColor", "circularTrackColor", "getCircularTrackColor$annotations", "getCircularTrackColor", "linearColor", "getLinearColor", "linearTrackColor", "getLinearTrackColor", "drawStopIndicator", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "stopSize", "color", "strokeCap", "drawStopIndicator-EgI2THU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJI)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    private static final int CircularDeterminateStrokeCap;
    private static final int CircularIndeterminateStrokeCap;
    private static final float CircularIndicatorTrackGapSize;
    private static final float CircularStrokeWidth;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float LinearIndicatorTrackGapSize;
    private static final int LinearStrokeCap;
    private static final float LinearTrackStopIndicatorSize;
    private static final SpringSpec<Float> ProgressAnimationSpec;

    static {
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.INSTANCE;
        CircularStrokeWidth = progressIndicatorTokens.m3100getTrackThicknessD9Ej5fM();
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        LinearStrokeCap = companion.m4145getRoundKaPHkGw();
        CircularDeterminateStrokeCap = companion.m4145getRoundKaPHkGw();
        CircularIndeterminateStrokeCap = companion.m4145getRoundKaPHkGw();
        LinearTrackStopIndicatorSize = progressIndicatorTokens.m3099getStopSizeD9Ej5fM();
        LinearIndicatorTrackGapSize = progressIndicatorTokens.m3096getActiveTrackSpaceD9Ej5fM();
        CircularIndicatorTrackGapSize = progressIndicatorTokens.m3096getActiveTrackSpaceD9Ej5fM();
        ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private ProgressIndicatorDefaults() {
    }

    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1986getCircularIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to circularDeterminateTrackColor or circularIndeterminateTrackColor", replaceWith = @ReplaceWith(expression = "ProgressIndicatorDefaults.circularIndeterminateTrackColor", imports = {}))
    public static /* synthetic */ void getCircularTrackColor$annotations() {
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1987getLinearIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1988getLinearTrackStopIndicatorSizeD9Ej5fM$annotations() {
    }

    /* renamed from: drawStopIndicator-EgI2THU, reason: not valid java name */
    public final void m1989drawStopIndicatorEgI2THU(DrawScope drawScope, float stopSize, long color, int strokeCap) {
        float fMin = Math.min(drawScope.mo334toPx0680j_4(stopSize), Size.m3617getHeightimpl(drawScope.mo4342getSizeNHjbRc()));
        float fM3617getHeightimpl = (Size.m3617getHeightimpl(drawScope.mo4342getSizeNHjbRc()) - fMin) / 2;
        if (!StrokeCap.m4140equalsimpl0(strokeCap, StrokeCap.INSTANCE.m4145getRoundKaPHkGw())) {
            DrawScope.m4336drawRectnJ9OG0$default(drawScope, color, OffsetKt.Offset((Size.m3620getWidthimpl(drawScope.mo4342getSizeNHjbRc()) - fMin) - fM3617getHeightimpl, (Size.m3617getHeightimpl(drawScope.mo4342getSizeNHjbRc()) - fMin) / 2.0f), SizeKt.Size(fMin, fMin), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        } else {
            float f2 = fMin / 2.0f;
            DrawScope.m4323drawCircleVaOC9Bg$default(drawScope, color, f2, OffsetKt.Offset((Size.m3620getWidthimpl(drawScope.mo4342getSizeNHjbRc()) - f2) - fM3617getHeightimpl, Size.m3617getHeightimpl(drawScope.mo4342getSizeNHjbRc()) / 2.0f), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    public final long getCircularColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getCircularDeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m1990getCircularDeterminateStrokeCapKaPHkGw() {
        return CircularDeterminateStrokeCap;
    }

    public final long getCircularDeterminateTrackColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2143778381, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:864)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getCircularIndeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m1991getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    public final long getCircularIndeterminateTrackColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947901123, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long jM3827getTransparent0d7_KjU = Color.INSTANCE.m3827getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM3827getTransparent0d7_KjU;
    }

    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m1992getCircularIndicatorTrackGapSizeD9Ej5fM() {
        return CircularIndicatorTrackGapSize;
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1993getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    public final long getCircularTrackColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:860)");
        }
        long jM3827getTransparent0d7_KjU = Color.INSTANCE.m3827getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM3827getTransparent0d7_KjU;
    }

    public final long getLinearColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m1994getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* renamed from: getLinearStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m1995getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    public final long getLinearTrackColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m1996getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }
}
