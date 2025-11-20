package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "()V", "defaultNavigationBarItemColors", "Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationBarItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    public final NavigationBarItemColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:311)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3_release = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationBarItemColors$material3_release;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m1904colors69fazGs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i2, int i3) {
        long j9;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        long jM3828getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j8;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM3828getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-1618564327, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:336)");
        } else {
            j9 = jM3828getUnspecified0d7_KjU;
        }
        NavigationBarItemColors navigationBarItemColorsM1893copy4JmcsL4 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1893copy4JmcsL4(j9, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, jM3828getUnspecified0d7_KjU7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColorsM1893copy4JmcsL4;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m1905colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j3;
        long value3 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j4;
        long value4 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j5;
        long value5 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:378)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(value, value2, value3, value4, value5, Color.m3791copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached = colorScheme.getDefaultNavigationBarItemColorsCached();
        if (defaultNavigationBarItemColorsCached != null) {
            return defaultNavigationBarItemColorsCached;
        }
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors);
        return navigationBarItemColors;
    }
}
