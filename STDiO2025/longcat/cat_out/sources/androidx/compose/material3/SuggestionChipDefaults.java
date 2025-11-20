package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J8\u0010(\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u00104\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJN\u00106\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010'R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedSuggestionChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "elevatedSuggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedSuggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "disabledBorderColor", "borderWidth", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "suggestionChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "suggestionChipColors", "suggestionChipColors-5tl4gsc", "suggestionChipElevation", "suggestionChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m3138getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m3147getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    public final ChipColors elevatedSuggestionChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1857)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedSuggestionChipColors$material3_release;
    }

    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2168elevatedSuggestionChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1879)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColorsM1488copyFD3wquc = defaultElevatedSuggestionChipColors$material3_release.m1488copyFD3wquc(jM3828getUnspecified0d7_KjU, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, companion.m3828getUnspecified0d7_KjU(), jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, companion.m3828getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM1488copyFD3wquc;
    }

    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2169elevatedSuggestionChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = SuggestionChipTokens.INSTANCE.m3140getElevatedContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = SuggestionChipTokens.INSTANCE.m3144getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = SuggestionChipTokens.INSTANCE.m3142getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = SuggestionChipTokens.INSTANCE.m3143getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = SuggestionChipTokens.INSTANCE.m3139getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = SuggestionChipTokens.INSTANCE.m3141getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1932)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        ChipElevation chipElevation = new ChipElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached = colorScheme.getDefaultElevatedSuggestionChipColorsCached();
        if (defaultElevatedSuggestionChipColorsCached != null) {
            return defaultElevatedSuggestionChipColorsCached;
        }
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedContainerColor());
        long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor());
        long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor());
        Color.Companion companion = Color.INSTANCE;
        long jM3828getUnspecified0d7_KjU = companion.m3828getUnspecified0d7_KjU();
        long jFromToken4 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedDisabledContainerColor());
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jFromToken, jFromToken2, jFromToken3, jM3828getUnspecified0d7_KjU, Color.m3791copywmQWz5c$default(jFromToken4, assistChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), suggestionChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), assistChipTokens.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m3828getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2170getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2171getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1943)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @ReplaceWith(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m2172suggestionChipBorderd_3_b6Q(long j2, long j3, float f2, Composer composer, int i2, int i3) {
        long jM3791copywmQWz5c$default;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j2;
        if ((i3 & 2) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(suggestionChipTokens.getFlatDisabledOutlineColor(), composer, 6), suggestionChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j3;
        }
        float fM3146getFlatOutlineWidthD9Ej5fM = (i3 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m3146getFlatOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1845)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM3791copywmQWz5c$default, fM3146getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    /* renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m2173suggestionChipBorderh1eTWw(boolean z, long j2, long j3, float f2, Composer composer, int i2, int i3) {
        long jM3791copywmQWz5c$default;
        long value = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j2;
        if ((i3 & 4) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(suggestionChipTokens.getFlatDisabledOutlineColor(), composer, 6), suggestionChipTokens.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j3;
        }
        float fM3146getFlatOutlineWidthD9Ej5fM = (i3 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m3146getFlatOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1818)");
        }
        if (!z) {
            value = jM3791copywmQWz5c$default;
        }
        BorderStroke borderStrokeM224BorderStrokecXLIe8U = BorderStrokeKt.m224BorderStrokecXLIe8U(fM3146getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM224BorderStrokecXLIe8U;
    }

    public final ChipColors suggestionChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1739)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSuggestionChipColors;
    }

    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2174suggestionChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1761)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColorsM1488copyFD3wquc = defaultSuggestionChipColors.m1488copyFD3wquc(jM3828getUnspecified0d7_KjU, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, companion.m3828getUnspecified0d7_KjU(), jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, companion.m3828getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM1488copyFD3wquc;
    }

    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2175suggestionChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = SuggestionChipTokens.INSTANCE.m3145getFlatContainerElevationD9Ej5fM();
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
            f6 = SuggestionChipTokens.INSTANCE.m3139getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1792)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        ChipElevation chipElevation = new ChipElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }
}
