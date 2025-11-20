package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "()V", "defaultNavigationRailItemColors", "Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationRailItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationRailItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    public final NavigationRailItemColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014332261, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:308)");
        }
        NavigationRailItemColors defaultNavigationRailItemColors$material3_release = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationRailItemColors$material3_release;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationRailItemColors m1966colors69fazGs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i2, int i3) {
        long j9;
        long jM3791copywmQWz5c$default;
        long j10;
        long jM3791copywmQWz5c$default2;
        long j11;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j3;
        long value3 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j4;
        long value4 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j5;
        long value5 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j6;
        if ((i3 & 32) != 0) {
            long j12 = value4;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j9 = j12;
        } else {
            j9 = value4;
            jM3791copywmQWz5c$default = j7;
        }
        if ((i3 & 64) != 0) {
            long j13 = value5;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j10 = j13;
        } else {
            j10 = value5;
            jM3791copywmQWz5c$default2 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            j11 = value;
            ComposerKt.traceEventStart(-2104358508, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:333)");
        } else {
            j11 = value;
        }
        NavigationRailItemColors navigationRailItemColorsM1955copy4JmcsL4 = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1955copy4JmcsL4(j11, value2, value3, j9, j10, jM3791copywmQWz5c$default, jM3791copywmQWz5c$default2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColorsM1955copy4JmcsL4;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationRailItemColors m1967colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j3;
        long value3 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j4;
        long value4 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j5;
        long value5 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:376)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(value, value2, value3, value4, value5, Color.m3791copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColors$material3_release(ColorScheme colorScheme) {
        NavigationRailItemColors defaultNavigationRailItemColorsCached = colorScheme.getDefaultNavigationRailItemColorsCached();
        if (defaultNavigationRailItemColorsCached != null) {
            return defaultNavigationRailItemColorsCached;
        }
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveLabelTextColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationRailItemColorsCached$material3_release(navigationRailItemColors);
        return navigationRailItemColors;
    }
}
