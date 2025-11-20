package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001eJ\r\u0010'\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001eJ\r\u0010+\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101J\r\u00102\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u00102\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001eJ\u001f\u00104\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\u0006\u00105\u001a\u000200H\u0007¢\u0006\u0002\u00106J\r\u00107\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u00107\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010$J\u001e\u00109\u001a\u00020\n*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001e\u0010=\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001e\u0010@\u001a\u00020\n*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\bA\u0010<J\u001e\u0010B\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\bC\u0010?R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0014\u001a\u00020\u000f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "()V", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "defaultFilledIconButtonColors", "Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultFilledIconButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconButtonColors;", "defaultFilledIconToggleButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultFilledIconToggleButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconToggleButtonColors;", "defaultFilledTonalIconButtonColors", "getDefaultFilledTonalIconButtonColors$material3_release", "defaultFilledTonalIconToggleButtonColors", "getDefaultFilledTonalIconToggleButtonColors$material3_release", "filledIconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "filledIconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "filledIconToggleButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "filledIconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "iconButtonColors", "iconButtonColors-ro_MJ88", "iconToggleButtonColors", "iconToggleButtonColors-5tl4gsc", "outlinedIconButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "outlinedIconToggleButtonBorder", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "defaultIconButtonColors", "localContentColor", "defaultIconButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconButtonColors;", "defaultIconToggleButtonColors", "defaultIconToggleButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconToggleButtonColors;", "defaultOutlinedIconButtonColors", "defaultOutlinedIconButtonColors-4WTKRHQ$material3_release", "defaultOutlinedIconToggleButtonColors", "defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    /* renamed from: defaultIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m1769defaultIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached != null) {
            return defaultIconButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m3827getTransparent0d7_KjU(), j2, companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m1770defaultIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached = colorScheme.getDefaultIconToggleButtonColorsCached();
        if (defaultIconToggleButtonColorsCached != null) {
            return defaultIconToggleButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(companion.m3827getTransparent0d7_KjU(), j2, companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m3827getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, IconButtonTokens.INSTANCE.getSelectedIconColor()), null);
        colorScheme.setDefaultIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    /* renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultOutlinedIconButtonColorsCached = colorScheme.getDefaultOutlinedIconButtonColorsCached();
        if (defaultOutlinedIconButtonColorsCached != null) {
            return defaultOutlinedIconButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m3827getTransparent0d7_KjU(), j2, companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached = colorScheme.getDefaultIconToggleButtonColorsCached();
        if (defaultIconToggleButtonColorsCached != null) {
            return defaultIconToggleButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM3827getTransparent0d7_KjU = companion.m3827getTransparent0d7_KjU();
        long jM3827getTransparent0d7_KjU2 = companion.m3827getTransparent0d7_KjU();
        long jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM3827getTransparent0d7_KjU, j2, jM3827getTransparent0d7_KjU2, jM3791copywmQWz5c$default, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor())), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors filledIconButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1857395287, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
        }
        IconButtonColors defaultFilledIconButtonColors$material3_release = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconButtonColors$material3_release;
    }

    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1773filledIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = ColorSchemeKt.m1562contentColorForek8zF_U(j2, composer, i2 & 14);
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:736)");
        }
        long j6 = j2;
        IconButtonColors iconButtonColorsM1764copyjRlVdoo = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1764copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM1764copyjRlVdoo;
    }

    public final IconToggleButtonColors filledIconToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1554706367, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:766)");
        }
        IconToggleButtonColors defaultFilledIconToggleButtonColors$material3_release = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconToggleButtonColors$material3_release;
    }

    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1774filledIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM1562contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU5, composer, (i2 >> 12) & 14) : j7;
        if (ComposerKt.isTraceInProgress()) {
            j8 = jM3828getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1887173701, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:790)");
        } else {
            j8 = jM3828getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM1787copytNS2XkQ = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1787copytNS2XkQ(j8, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM1562contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM1787copytNS2XkQ;
    }

    public final IconButtonColors filledTonalIconButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1099140437, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:830)");
        }
        IconButtonColors defaultFilledTonalIconButtonColors$material3_release = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconButtonColors$material3_release;
    }

    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1775filledTonalIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = ColorSchemeKt.m1562contentColorForek8zF_U(j2, composer, i2 & 14);
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:848)");
        }
        long j6 = j2;
        IconButtonColors iconButtonColorsM1764copyjRlVdoo = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1764copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM1764copyjRlVdoo;
    }

    public final IconToggleButtonColors filledTonalIconToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(434219587, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:878)");
        }
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColors$material3_release = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconToggleButtonColors$material3_release;
    }

    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1776filledTonalIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM1562contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            j8 = jM3828getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-19426557, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:900)");
        } else {
            j8 = jM3828getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM1787copytNS2XkQ = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1787copytNS2XkQ(j8, jM1562contentColorForek8zF_U, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM1787copytNS2XkQ;
    }

    public final IconButtonColors getDefaultFilledIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached = colorScheme.getDefaultFilledIconButtonColorsCached();
        if (defaultFilledIconButtonColorsCached != null) {
            return defaultFilledIconButtonColorsCached;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor())), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached = colorScheme.getDefaultFilledIconToggleButtonColorsCached();
        if (defaultFilledIconToggleButtonColorsCached != null) {
            return defaultFilledIconToggleButtonColorsCached;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getToggleUnselectedColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor())), null);
        colorScheme.setDefaultFilledIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached = colorScheme.getDefaultFilledTonalIconButtonColorsCached();
        if (defaultFilledTonalIconButtonColorsCached != null) {
            return defaultFilledTonalIconButtonColorsCached;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor())), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached = colorScheme.getDefaultFilledTonalIconToggleButtonColorsCached();
        if (defaultFilledTonalIconToggleButtonColorsCached != null) {
            return defaultFilledTonalIconToggleButtonColorsCached;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor())), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getToggleSelectedColor()), null);
        colorScheme.setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final Shape getFilledShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
        }
        Shape value = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:588)");
        }
        Shape value = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final IconButtonColors iconButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-1519621781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519621781, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long jM3802unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl();
        IconButtonColors iconButtonColorsM1769defaultIconButtonColors4WTKRHQ$material3_release = m1769defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM3802unboximpl);
        if (Color.m3793equalsimpl0(iconButtonColorsM1769defaultIconButtonColors4WTKRHQ$material3_release.getContentColor(), jM3802unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM1769defaultIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM1761copyjRlVdoo$default = IconButtonColors.m1761copyjRlVdoo$default(iconButtonColorsM1769defaultIconButtonColors4WTKRHQ$material3_release, 0L, jM3802unboximpl, 0L, Color.m3791copywmQWz5c$default(jM3802unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM1761copyjRlVdoo$default;
    }

    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1777iconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        long jM3802unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl() : j3;
        long jM3828getUnspecified0d7_KjU = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3791copywmQWz5c$default = (i3 & 8) != 0 ? Color.m3791copywmQWz5c$default(jM3802unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
        }
        IconButtonColors iconButtonColorsM1764copyjRlVdoo = m1769defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl()).m1764copyjRlVdoo(j2, jM3802unboximpl, jM3828getUnspecified0d7_KjU, jM3791copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM1764copyjRlVdoo;
    }

    public final IconToggleButtonColors iconToggleButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-589987581);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-589987581, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
        }
        long jM3802unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM1770defaultIconToggleButtonColors4WTKRHQ$material3_release = m1770defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM3802unboximpl);
        if (Color.m3793equalsimpl0(iconToggleButtonColorsM1770defaultIconToggleButtonColors4WTKRHQ$material3_release.getContentColor(), jM3802unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM1770defaultIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM1786copytNS2XkQ$default = IconToggleButtonColors.m1786copytNS2XkQ$default(iconToggleButtonColorsM1770defaultIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM3802unboximpl, 0L, Color.m3791copywmQWz5c$default(jM3802unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM1786copytNS2XkQ$default;
    }

    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1778iconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM3791copywmQWz5c$default;
        long j9;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3802unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl() : j3;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j10 = jM3802unboximpl;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j10;
        } else {
            j8 = jM3802unboximpl;
            jM3791copywmQWz5c$default = j5;
        }
        long jM3828getUnspecified0d7_KjU3 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM3828getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-2020719549, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:685)");
        } else {
            j9 = jM3828getUnspecified0d7_KjU;
        }
        long j11 = j9;
        IconToggleButtonColors iconToggleButtonColorsM1787copytNS2XkQ = m1770defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl()).m1787copytNS2XkQ(j11, j8, jM3828getUnspecified0d7_KjU2, jM3791copywmQWz5c$default, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM1787copytNS2XkQ;
    }

    public final BorderStroke outlinedIconButtonBorder(boolean z, Composer composer, int i2) {
        long jM3791copywmQWz5c$default;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
        }
        if (z) {
            composer.startReplaceGroup(1186104514);
            jM3791copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1186170420);
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM3791copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m224BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m2988getUnselectedOutlineWidthD9Ej5fM(), jM3791copywmQWz5c$default);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final IconButtonColors outlinedIconButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(389287465);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(389287465, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:938)");
        }
        IconButtonColors iconButtonColorsM1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release = m1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl());
        long jM3802unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl();
        if (Color.m3793equalsimpl0(iconButtonColorsM1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release.getContentColor(), jM3802unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM1761copyjRlVdoo$default = IconButtonColors.m1761copyjRlVdoo$default(iconButtonColorsM1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release, 0L, jM3802unboximpl, 0L, Color.m3791copywmQWz5c$default(jM3802unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM1761copyjRlVdoo$default;
    }

    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1779outlinedIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        long jM3802unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl() : j3;
        long jM3828getUnspecified0d7_KjU = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3791copywmQWz5c$default = (i3 & 8) != 0 ? Color.m3791copywmQWz5c$default(jM3802unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:970)");
        }
        IconButtonColors iconButtonColorsM1764copyjRlVdoo = m1771defaultOutlinedIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl()).m1764copyjRlVdoo(j2, jM3802unboximpl, jM3828getUnspecified0d7_KjU, jM3791copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM1764copyjRlVdoo;
    }

    public final BorderStroke outlinedIconToggleButtonBorder(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
        }
        if (z2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        BorderStroke borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z, composer, (i2 & 14) | ((i2 >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return borderStrokeOutlinedIconButtonBorder;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-779749183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-779749183, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1000)");
        }
        long jM3802unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release = m1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM3802unboximpl);
        if (Color.m3793equalsimpl0(iconToggleButtonColorsM1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release.getContentColor(), jM3802unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM1786copytNS2XkQ$default = IconToggleButtonColors.m1786copytNS2XkQ$default(iconToggleButtonColorsM1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM3802unboximpl, 0L, Color.m3791copywmQWz5c$default(jM3802unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM1786copytNS2XkQ$default;
    }

    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1780outlinedIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM3791copywmQWz5c$default;
        long j9;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3802unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl() : j3;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j10 = jM3802unboximpl;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j10;
        } else {
            j8 = jM3802unboximpl;
            jM3791copywmQWz5c$default = j5;
        }
        long jM3828getUnspecified0d7_KjU3 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM1562contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU3, composer, (i2 >> 12) & 14) : j7;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM3828getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(2130592709, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1035)");
        } else {
            j9 = jM3828getUnspecified0d7_KjU;
        }
        long j11 = j9;
        IconToggleButtonColors iconToggleButtonColorsM1787copytNS2XkQ = m1772defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl()).m1787copytNS2XkQ(j11, j8, jM3828getUnspecified0d7_KjU2, jM3791copywmQWz5c$default, jM3828getUnspecified0d7_KjU3, jM1562contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM1787copytNS2XkQ;
    }
}
