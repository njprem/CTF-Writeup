package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)2\b\b\u0002\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020)2\b\b\u0002\u0010:\u001a\u00020)2\b\b\u0002\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010=\u001a\u00020)2\b\b\u0002\u0010>\u001a\u00020)2\b\b\u0002\u0010?\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJÄ\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2#\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\u0006\u0010Q\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "TickSize", "Landroidx/compose/ui/unit/Dp;", "getTickSize-D9Ej5fM", "()F", "F", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawScope", "offset", "size", "color", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "height", "startThumbWidth", "endThumbWidth", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrackPath", "Landroidx/compose/ui/geometry/Size;", "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TickSize;
    private static final float TrackStopIndicatorSize;
    private static final Path trackPath;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackStopIndicatorSize = sliderTokens.m3131getStopIndicatorSizeD9Ej5fM();
        TickSize = sliderTokens.m3131getStopIndicatorSizeD9Ej5fM();
        trackPath = AndroidPath_androidKt.Path();
    }

    private SliderDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2122drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m4323drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo334toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2123drawTrackngJ0SCU(androidx.compose.ui.graphics.drawscope.DrawScope r31, float[] r32, float r33, float r34, long r35, long r37, long r39, long r41, float r43, float r44, float r45, float r46, float r47, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r48, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2123drawTrackngJ0SCU(androidx.compose.ui.graphics.drawscope.DrawScope, float[], float, float, long, long, long, long, float, float, float, float, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, boolean):void");
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2124drawTrackPathCx2C_VA(DrawScope drawScope, long j2, long j3, long j4, float f2, float f3) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f2, f2);
        long jCornerRadius2 = CornerRadiusKt.CornerRadius(f3, f3);
        RoundRect roundRectM3603RoundRectZAM2FJo = RoundRectKt.m3603RoundRectZAM2FJo(RectKt.m3591Recttz77jQw(OffsetKt.Offset(Offset.m3551getXimpl(j2), 0.0f), SizeKt.Size(Size.m3620getWidthimpl(j3), Size.m3617getHeightimpl(j3))), jCornerRadius, jCornerRadius2, jCornerRadius2, jCornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, roundRectM3603RoundRectZAM2FJo, null, 2, null);
        DrawScope.m4332drawPathLG529CI$default(drawScope, path, j4, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2125Thumb9LiSoMs(final androidx.compose.foundation.interaction.MutableInteractionSource r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.SliderColors r26, boolean r27, long r28, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2125Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015a  */
    @kotlin.Deprecated(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Track(final androidx.compose.material3.SliderPositions r18, androidx.compose.ui.Modifier r19, androidx.compose.material3.SliderColors r20, boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderPositions, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) = 
      (r2v11 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
      (r2v15 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
     binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2127Track4EFweAY(final androidx.compose.material3.SliderState r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.material3.SliderColors r28, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r29, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r30, float r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2127Track4EFweAY(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public final SliderColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i2, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSliderColors$material3_release;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2128colorsq0g_0yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i2, int i3, int i4) {
        long j12;
        long j13;
        long jM3828getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        long jM3828getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j8;
        long jM3828getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j9;
        long j14 = jM3828getUnspecified0d7_KjU;
        long jM3828getUnspecified0d7_KjU9 = (i4 & Fields.RotationX) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j10;
        long jM3828getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j11;
        if (ComposerKt.isTraceInProgress()) {
            j12 = jM3828getUnspecified0d7_KjU9;
            j13 = jM3828getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(885588574, i2, i3, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        } else {
            j12 = jM3828getUnspecified0d7_KjU9;
            j13 = jM3828getUnspecified0d7_KjU2;
        }
        SliderColors sliderColorsM2106copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2106copyK518z4(j14, j13, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, jM3828getUnspecified0d7_KjU7, jM3828getUnspecified0d7_KjU8, j12, jM3828getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sliderColorsM2106copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorKt.m3837compositeOverOWjLjI(Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledHandleColor()), sliderTokens.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2129getTickSizeD9Ej5fM() {
        return TickSize;
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2130getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void Track(final androidx.compose.material3.SliderState r15, androidx.compose.ui.Modifier r16, androidx.compose.material3.SliderColors r17, boolean r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void Track(final androidx.compose.material3.RangeSliderState r15, androidx.compose.ui.Modifier r16, androidx.compose.material3.SliderColors r17, boolean r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) = 
      (r2v11 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
      (r2v15 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
     binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2126Track4EFweAY(final androidx.compose.material3.RangeSliderState r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.material3.SliderColors r28, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r29, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r30, float r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2126Track4EFweAY(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
