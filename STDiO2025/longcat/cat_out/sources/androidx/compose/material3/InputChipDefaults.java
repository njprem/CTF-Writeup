package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010$J\u0094\u0001\u0010#\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\b\b\u0002\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u001b2\b\b\u0002\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u001b2\b\b\u0002\u0010.\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103JN\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "()V", "AvatarSize", "Landroidx/compose/ui/unit/Dp;", "getAvatarSize-D9Ej5fM", "()F", "F", "Height", "getHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultInputChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultInputChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "inputChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "Landroidx/compose/ui/graphics/Color;", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "inputChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "inputChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "inputChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m2926getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m2928getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m2924getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1794getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final SelectableChipColors getDefaultInputChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached = colorScheme.getDefaultInputChipColorsCached();
        if (defaultInputChipColorsCached != null) {
            return defaultInputChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM3827getTransparent0d7_KjU = companion.m3827getTransparent0d7_KjU();
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM3827getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedTrailingIconColor()), companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedContainerColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultInputChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1795getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1796getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i2, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1721)");
        }
        Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m1797inputChipBorder_7El2pE(boolean z, boolean z2, long j2, long j3, long j4, long j5, float f2, float f3, Composer composer, int i2, int i3) {
        long value = (i3 & 4) != 0 ? ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j2;
        long jM3827getTransparent0d7_KjU = (i3 & 8) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j3;
        long jM3791copywmQWz5c$default = (i3 & 16) != 0 ? Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM3827getTransparent0d7_KjU2 = (i3 & 32) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j5;
        float fM2931getUnselectedOutlineWidthD9Ej5fM = (i3 & 64) != 0 ? InputChipTokens.INSTANCE.m2931getUnselectedOutlineWidthD9Ej5fM() : f2;
        float fM2929getSelectedOutlineWidthD9Ej5fM = (i3 & 128) != 0 ? InputChipTokens.INSTANCE.m2929getSelectedOutlineWidthD9Ej5fM() : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
        }
        if (!z) {
            value = z2 ? jM3827getTransparent0d7_KjU2 : jM3791copywmQWz5c$default;
        } else if (z2) {
            value = jM3827getTransparent0d7_KjU;
        }
        if (z2) {
            fM2931getUnselectedOutlineWidthD9Ej5fM = fM2929getSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM224BorderStrokecXLIe8U = BorderStrokeKt.m224BorderStrokecXLIe8U(fM2931getUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM224BorderStrokecXLIe8U;
    }

    public final SelectableChipColors inputChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770375587, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1568)");
        }
        SelectableChipColors defaultInputChipColors$material3_release = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultInputChipColors$material3_release;
    }

    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m1798inputChipColorskwJvTHA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
        long j15;
        long j16;
        long jM3828getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        long jM3828getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j8;
        long jM3828getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j9;
        long j17 = jM3828getUnspecified0d7_KjU;
        long jM3828getUnspecified0d7_KjU9 = (i4 & Fields.RotationX) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j10;
        long jM3828getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j11;
        long jM3828getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j12;
        long jM3828getUnspecified0d7_KjU12 = (i4 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j13;
        long jM3828getUnspecified0d7_KjU13 = (i4 & 4096) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j14;
        if (ComposerKt.isTraceInProgress()) {
            j15 = jM3828getUnspecified0d7_KjU12;
            j16 = jM3828getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1312840646, i2, i3, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1605)");
        } else {
            j15 = jM3828getUnspecified0d7_KjU12;
            j16 = jM3828getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM2093copydaRQuJA = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2093copydaRQuJA(j17, j16, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, jM3828getUnspecified0d7_KjU7, jM3828getUnspecified0d7_KjU8, jM3828getUnspecified0d7_KjU9, jM3828getUnspecified0d7_KjU10, jM3828getUnspecified0d7_KjU11, j15, jM3828getUnspecified0d7_KjU13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM2093copydaRQuJA;
    }

    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1799inputChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = InputChipTokens.INSTANCE.m2925getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = f2;
        }
        if ((i3 & 4) != 0) {
            f4 = f2;
        }
        if ((i3 & 8) != 0) {
            f5 = f2;
        }
        if ((i3 & 16) != 0) {
            f6 = InputChipTokens.INSTANCE.m2927getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1672)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation;
    }
}
