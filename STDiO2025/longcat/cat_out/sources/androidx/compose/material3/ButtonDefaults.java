package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010:\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010:\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJD\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010L\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010BJD\u0010N\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ\r\u0010P\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010P\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bQ\u0010BJD\u0010R\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010KJ\u0017\u0010#\u001a\u00020$2\b\b\u0002\u0010T\u001a\u00020UH\u0007¢\u0006\u0002\u0010VJ\r\u0010W\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010W\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010BJ\r\u0010Y\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010Y\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bZ\u0010BR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0016\u0010\u0019\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0016\u0010\u001c\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0018\u0010-\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0018\u00104\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0018\u00106\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0018\u00108\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ButtonWithIconContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getButtonWithIconContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconHorizontalStartPadding", "ContentPadding", "getContentPadding", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconHorizontalEndPadding", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledTonalShape", "getFilledTonalShape", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "textShape", "getTextShape", "defaultButtonColors", "Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3_release", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3_release", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3_release", "defaultTextButtonColors", "getDefaultTextButtonColors$material3_release", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    static {
        float fM6233constructorimpl = Dp.m6233constructorimpl(24);
        ButtonHorizontalPadding = fM6233constructorimpl;
        float f2 = 8;
        float fM6233constructorimpl2 = Dp.m6233constructorimpl(f2);
        ButtonVerticalPadding = fM6233constructorimpl2;
        PaddingValues paddingValuesM638PaddingValuesa9UjIt4 = PaddingKt.m638PaddingValuesa9UjIt4(fM6233constructorimpl, fM6233constructorimpl2, fM6233constructorimpl, fM6233constructorimpl2);
        ContentPadding = paddingValuesM638PaddingValuesa9UjIt4;
        float f3 = 16;
        float fM6233constructorimpl3 = Dp.m6233constructorimpl(f3);
        ButtonWithIconHorizontalStartPadding = fM6233constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m638PaddingValuesa9UjIt4(fM6233constructorimpl3, fM6233constructorimpl2, fM6233constructorimpl, fM6233constructorimpl2);
        float fM6233constructorimpl4 = Dp.m6233constructorimpl(12);
        TextButtonHorizontalPadding = fM6233constructorimpl4;
        TextButtonContentPadding = PaddingKt.m638PaddingValuesa9UjIt4(fM6233constructorimpl4, paddingValuesM638PaddingValuesa9UjIt4.getTop(), fM6233constructorimpl4, paddingValuesM638PaddingValuesa9UjIt4.getBottom());
        float fM6233constructorimpl5 = Dp.m6233constructorimpl(f3);
        TextButtonWithIconHorizontalEndPadding = fM6233constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m638PaddingValuesa9UjIt4(fM6233constructorimpl4, paddingValuesM638PaddingValuesa9UjIt4.getTop(), fM6233constructorimpl5, paddingValuesM638PaddingValuesa9UjIt4.getBottom());
        MinWidth = Dp.m6233constructorimpl(58);
        MinHeight = Dp.m6233constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m2877getIconSizeD9Ej5fM();
        IconSpacing = Dp.m6233constructorimpl(f2);
    }

    private ButtonDefaults() {
    }

    public final ButtonColors buttonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        ButtonColors defaultButtonColors$material3_release = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors$material3_release;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1441buttonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        long j6 = j2;
        ButtonColors buttonColorsM1436copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1436copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM1436copyjRlVdoo;
    }

    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1442buttonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledButtonTokens.INSTANCE.m2872getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledButtonTokens.INSTANCE.m2878getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilledButtonTokens.INSTANCE.m2875getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilledButtonTokens.INSTANCE.m2876getHoverContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            f6 = FilledButtonTokens.INSTANCE.m2874getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        float f8 = f6;
        float f9 = f4;
        ButtonElevation buttonElevation = new ButtonElevation(f2, f3, f9, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final ButtonColors elevatedButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:609)");
        }
        ButtonColors defaultElevatedButtonColors$material3_release = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedButtonColors$material3_release;
    }

    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1443elevatedButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:627)");
        }
        long j6 = j2;
        ButtonColors buttonColorsM1436copyjRlVdoo = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1436copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM1436copyjRlVdoo;
    }

    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1444elevatedButtonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = ElevatedButtonTokens.INSTANCE.m2791getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = ElevatedButtonTokens.INSTANCE.m2797getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = ElevatedButtonTokens.INSTANCE.m2794getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = ElevatedButtonTokens.INSTANCE.m2795getHoverContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            f6 = ElevatedButtonTokens.INSTANCE.m2793getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:829)");
        }
        float f8 = f6;
        float f9 = f4;
        ButtonElevation buttonElevation = new ButtonElevation(f2, f3, f9, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final ButtonColors filledTonalButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:655)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3_release = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalButtonColors$material3_release;
    }

    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1445filledTonalButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:674)");
        }
        long j6 = j2;
        ButtonColors buttonColorsM1436copyjRlVdoo = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1436copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM1436copyjRlVdoo;
    }

    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1446filledTonalButtonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledTonalButtonTokens.INSTANCE.m2895getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledTonalButtonTokens.INSTANCE.m2901getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilledTonalButtonTokens.INSTANCE.m2898getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilledTonalButtonTokens.INSTANCE.m2899getHoverContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            f6 = Dp.m6233constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:859)");
        }
        float f8 = f6;
        ButtonElevation buttonElevation = new ButtonElevation(f2, f3, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ButtonColors getDefaultButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached = colorScheme.getDefaultElevatedButtonColorsCached();
        if (defaultElevatedButtonColorsCached != null) {
            return defaultElevatedButtonColorsCached;
        }
        ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getLabelTextColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledContainerColor()), elevatedButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledLabelTextColor()), elevatedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached = colorScheme.getDefaultFilledTonalButtonColorsCached();
        if (defaultFilledTonalButtonColorsCached != null) {
            return defaultFilledTonalButtonColorsCached;
        }
        FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getLabelTextColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached = colorScheme.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM3827getTransparent0d7_KjU = companion.m3827getTransparent0d7_KjU();
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM3827getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getLabelTextColor()), companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultTextButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM3827getTransparent0d7_KjU = companion.m3827getTransparent0d7_KjU();
        TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM3827getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getLabelTextColor()), companion.m3827getTransparent0d7_KjU(), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    public final Shape getElevatedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:546)");
        }
        Shape value = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getFilledTonalShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:550)");
        }
        Shape value = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1447getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1448getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1449getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1450getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Deprecated(message = "Please use the version that takes an `enabled` param to get the `BorderStroke` with the correct opacity", replaceWith = @ReplaceWith(expression = "outlinedButtonBorder(enabled)", imports = {}))
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke borderStrokeM224BorderStrokecXLIe8U = BorderStrokeKt.m224BorderStrokecXLIe8U(outlinedButtonTokens.m2977getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM224BorderStrokecXLIe8U;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
        }
        Shape value = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        Shape value = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    public final Shape getTextShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        Shape value = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final BorderStroke outlinedButtonBorder(boolean z, Composer composer, int i2, int i3) {
        long jM3791copywmQWz5c$default;
        if ((i3 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        float fM2977getOutlineWidthD9Ej5fM = outlinedButtonTokens.m2977getOutlineWidthD9Ej5fM();
        if (z) {
            composer.startReplaceGroup(-855870548);
            jM3791copywmQWz5c$default = ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-855783004);
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke borderStrokeM224BorderStrokecXLIe8U = BorderStrokeKt.m224BorderStrokecXLIe8U(fM2977getOutlineWidthD9Ej5fM, jM3791copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM224BorderStrokecXLIe8U;
    }

    public final ButtonColors outlinedButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
        }
        ButtonColors defaultOutlinedButtonColors$material3_release = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedButtonColors$material3_release;
    }

    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1451outlinedButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
        }
        long j6 = j2;
        ButtonColors buttonColorsM1436copyjRlVdoo = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1436copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM1436copyjRlVdoo;
    }

    public final ButtonColors textButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        ButtonColors defaultTextButtonColors$material3_release = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextButtonColors$material3_release;
    }

    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1452textButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        long j6 = j2;
        ButtonColors buttonColorsM1436copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1436copyjRlVdoo(j6, j3, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM1436copyjRlVdoo;
    }
}
