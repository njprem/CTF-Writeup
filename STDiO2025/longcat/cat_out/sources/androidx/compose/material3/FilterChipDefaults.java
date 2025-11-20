package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010=\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010%JN\u0010?\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010/R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultFilterChipColors$material3_release", "elevatedFilterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m2905getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m2921getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    public final SelectableChipColors elevatedFilterChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3_release = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedFilterChipColors$material3_release;
    }

    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1741elevatedFilterChipColorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        long j14;
        long j15;
        long jM3828getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        long jM3828getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j8;
        long jM3828getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j9;
        long j16 = jM3828getUnspecified0d7_KjU;
        long jM3828getUnspecified0d7_KjU9 = (i4 & Fields.RotationX) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j10;
        long jM3828getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j11;
        long jM3828getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j12;
        long jM3828getUnspecified0d7_KjU12 = (i4 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j13;
        if (ComposerKt.isTraceInProgress()) {
            j14 = jM3828getUnspecified0d7_KjU11;
            j15 = jM3828getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-915841711, i2, i3, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
        } else {
            j14 = jM3828getUnspecified0d7_KjU11;
            j15 = jM3828getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM2093copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2093copydaRQuJA(j16, j15, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, jM3828getUnspecified0d7_KjU7, jM3828getUnspecified0d7_KjU8, jM3828getUnspecified0d7_KjU9, jM3828getUnspecified0d7_KjU10, j14, jM3828getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM2093copydaRQuJA;
    }

    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1742elevatedFilterChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilterChipTokens.INSTANCE.m2907getElevatedContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilterChipTokens.INSTANCE.m2911getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilterChipTokens.INSTANCE.m2909getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilterChipTokens.INSTANCE.m2910getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = FilterChipTokens.INSTANCE.m2906getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = FilterChipTokens.INSTANCE.m2908getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
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

    /* renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m1743filterChipBorder_7El2pE(boolean z, boolean z2, long j2, long j3, long j4, long j5, float f2, float f3, Composer composer, int i2, int i3) {
        long jM3791copywmQWz5c$default;
        long value = (i3 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j2;
        long jM3827getTransparent0d7_KjU = (i3 & 8) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j3;
        if ((i3 & 16) != 0) {
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filterChipTokens.getFlatDisabledUnselectedOutlineColor(), composer, 6), filterChipTokens.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j4;
        }
        long jM3827getTransparent0d7_KjU2 = (i3 & 32) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j5;
        float fM2919getFlatUnselectedOutlineWidthD9Ej5fM = (i3 & 64) != 0 ? FilterChipTokens.INSTANCE.m2919getFlatUnselectedOutlineWidthD9Ej5fM() : f2;
        float fM2915getFlatSelectedOutlineWidthD9Ej5fM = (i3 & 128) != 0 ? FilterChipTokens.INSTANCE.m2915getFlatSelectedOutlineWidthD9Ej5fM() : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
        }
        if (!z) {
            value = z2 ? jM3827getTransparent0d7_KjU2 : jM3791copywmQWz5c$default;
        } else if (z2) {
            value = jM3827getTransparent0d7_KjU;
        }
        if (z2) {
            fM2919getFlatUnselectedOutlineWidthD9Ej5fM = fM2915getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM224BorderStrokecXLIe8U = BorderStrokeKt.m224BorderStrokecXLIe8U(fM2919getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM224BorderStrokecXLIe8U;
    }

    public final SelectableChipColors filterChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
        }
        SelectableChipColors defaultFilterChipColors$material3_release = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilterChipColors$material3_release;
    }

    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1744filterChipColorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        long j14;
        long j15;
        long jM3828getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        long jM3828getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j8;
        long jM3828getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j9;
        long j16 = jM3828getUnspecified0d7_KjU;
        long jM3828getUnspecified0d7_KjU9 = (i4 & Fields.RotationX) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j10;
        long jM3828getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j11;
        long jM3828getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j12;
        long jM3828getUnspecified0d7_KjU12 = (i4 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j13;
        if (ComposerKt.isTraceInProgress()) {
            j14 = jM3828getUnspecified0d7_KjU11;
            j15 = jM3828getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-1831479801, i2, i3, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
        } else {
            j14 = jM3828getUnspecified0d7_KjU11;
            j15 = jM3828getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM2093copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2093copydaRQuJA(j16, j15, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, jM3828getUnspecified0d7_KjU7, jM3828getUnspecified0d7_KjU8, jM3828getUnspecified0d7_KjU9, jM3828getUnspecified0d7_KjU10, j14, jM3828getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM2093copydaRQuJA;
    }

    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1745filterChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilterChipTokens.INSTANCE.m2912getFlatContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilterChipTokens.INSTANCE.m2916getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilterChipTokens.INSTANCE.m2913getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilterChipTokens.INSTANCE.m2914getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = FilterChipTokens.INSTANCE.m2906getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
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

    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached = colorScheme.getDefaultElevatedFilterChipColorsCached();
        if (defaultElevatedFilterChipColorsCached != null) {
            return defaultElevatedFilterChipColorsCached;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), filterChipTokens.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached = colorScheme.getDefaultFilterChipColorsCached();
        if (defaultFilterChipColorsCached != null) {
            return defaultFilterChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM3827getTransparent0d7_KjU = companion.m3827getTransparent0d7_KjU();
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM3827getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLeadingIconColor()), companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), filterChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), filterChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), filterChipTokens.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1746getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1747getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i2, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
