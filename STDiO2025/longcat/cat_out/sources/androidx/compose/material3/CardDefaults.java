package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJN\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010(\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJN\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u00101\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJN\u00103\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010'R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "()V", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "defaultCardColors", "Landroidx/compose/material3/CardColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultElevatedCardColors", "getDefaultElevatedCardColors$material3_release", "defaultOutlinedCardColors", "getDefaultOutlinedCardColors$material3_release", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    public final CardColors cardColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCardColors$material3_release;
    }

    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1461cardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        long jM3791copywmQWz5c$default;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM1562contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j7 = jM1562contentColorForek8zF_U;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j6 = j7;
        } else {
            j6 = jM1562contentColorForek8zF_U;
            jM3791copywmQWz5c$default = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsM1456copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1456copyjRlVdoo(jM3828getUnspecified0d7_KjU, j6, jM3828getUnspecified0d7_KjU2, jM3791copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM1456copyjRlVdoo;
    }

    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1462cardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledCardTokens.INSTANCE.m2879getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledCardTokens.INSTANCE.m2885getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilledCardTokens.INSTANCE.m2882getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilledCardTokens.INSTANCE.m2883getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = FilledCardTokens.INSTANCE.m2881getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = FilledCardTokens.INSTANCE.m2880getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i2, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        CardElevation cardElevation = new CardElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors elevatedCardColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors defaultElevatedCardColors$material3_release = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedCardColors$material3_release;
    }

    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1463elevatedCardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        long jM3791copywmQWz5c$default;
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM1562contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j7 = jM1562contentColorForek8zF_U;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j6 = j7;
        } else {
            j6 = jM1562contentColorForek8zF_U;
            jM3791copywmQWz5c$default = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
        }
        CardColors cardColorsM1456copyjRlVdoo = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1456copyjRlVdoo(jM3828getUnspecified0d7_KjU, j6, jM3828getUnspecified0d7_KjU2, jM3791copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM1456copyjRlVdoo;
    }

    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1464elevatedCardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = ElevatedCardTokens.INSTANCE.m2798getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = ElevatedCardTokens.INSTANCE.m2804getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = ElevatedCardTokens.INSTANCE.m2801getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = ElevatedCardTokens.INSTANCE.m2802getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = ElevatedCardTokens.INSTANCE.m2800getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = ElevatedCardTokens.INSTANCE.m2799getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        CardElevation cardElevation = new CardElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors getDefaultCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m3837compositeOverOWjLjI(Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), filledCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color.m3791copywmQWz5c$default(ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultElevatedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached = colorScheme.getDefaultElevatedCardColorsCached();
        if (defaultElevatedCardColorsCached != null) {
            return defaultElevatedCardColorsCached;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), ColorKt.m3837compositeOverOWjLjI(Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), elevatedCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor())), Color.m3791copywmQWz5c$default(ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultOutlinedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached = colorScheme.getDefaultOutlinedCardColorsCached();
        if (defaultOutlinedCardColorsCached != null) {
            return defaultOutlinedCardColorsCached;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.m1561contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final Shape getElevatedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i2, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i2, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i2, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final BorderStroke outlinedCardBorder(boolean z, Composer composer, int i2, int i3) {
        long jM3837compositeOverOWjLjI;
        if ((i3 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z) {
            composer.startReplaceGroup(-134409770);
            jM3837compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-134330379);
            jM3837compositeOverOWjLjI = ColorKt.m3837compositeOverOWjLjI(Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM3837compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m224BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m2984getOutlineWidthD9Ej5fM(), jM3837compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final CardColors outlinedCardColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors defaultOutlinedCardColors$material3_release = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedCardColors$material3_release;
    }

    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1465outlinedCardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM1562contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3791copywmQWz5c$default = (i3 & 8) != 0 ? Color.m3791copywmQWz5c$default(ColorSchemeKt.m1562contentColorForek8zF_U(jM3828getUnspecified0d7_KjU, composer, i2 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColorsM1456copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1456copyjRlVdoo(jM3828getUnspecified0d7_KjU, jM1562contentColorForek8zF_U, jM3828getUnspecified0d7_KjU2, jM3791copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM1456copyjRlVdoo;
    }

    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1466outlinedCardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = OutlinedCardTokens.INSTANCE.m2978getContainerElevationD9Ej5fM();
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
            f6 = OutlinedCardTokens.INSTANCE.m2980getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = OutlinedCardTokens.INSTANCE.m2979getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        CardElevation cardElevation = new CardElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }
}
