package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u00102J¦\u0002\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b82\u0006\u0010%\u001a\u00020&2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010?\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010@\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010A\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010B\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010C\u001a\u00020D2\u0013\b\u0002\u0010E\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b8H\u0007¢\u0006\u0002\u0010FJ\r\u0010,\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010GJÂ\u0003\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020I2\b\b\u0002\u0010M\u001a\u00020I2\b\b\u0002\u0010N\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020I2\b\b\u0002\u0010P\u001a\u00020I2\b\b\u0002\u0010Q\u001a\u00020I2\b\b\u0002\u0010R\u001a\u00020I2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010U\u001a\u00020I2\b\b\u0002\u0010V\u001a\u00020I2\b\b\u0002\u0010W\u001a\u00020I2\b\b\u0002\u0010X\u001a\u00020I2\b\b\u0002\u0010Y\u001a\u00020I2\b\b\u0002\u0010Z\u001a\u00020I2\b\b\u0002\u0010[\u001a\u00020I2\b\b\u0002\u0010\\\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020I2\b\b\u0002\u0010^\u001a\u00020I2\b\b\u0002\u0010_\u001a\u00020I2\b\b\u0002\u0010`\u001a\u00020I2\b\b\u0002\u0010a\u001a\u00020I2\b\b\u0002\u0010b\u001a\u00020I2\b\b\u0002\u0010c\u001a\u00020I2\b\b\u0002\u0010d\u001a\u00020I2\b\b\u0002\u0010e\u001a\u00020I2\b\b\u0002\u0010f\u001a\u00020I2\b\b\u0002\u0010g\u001a\u00020I2\b\b\u0002\u0010h\u001a\u00020I2\b\b\u0002\u0010i\u001a\u00020I2\b\b\u0002\u0010j\u001a\u00020I2\b\b\u0002\u0010k\u001a\u00020I2\b\b\u0002\u0010l\u001a\u00020I2\b\b\u0002\u0010m\u001a\u00020I2\b\b\u0002\u0010n\u001a\u00020I2\b\b\u0002\u0010o\u001a\u00020I2\b\b\u0002\u0010p\u001a\u00020I2\b\b\u0002\u0010q\u001a\u00020I2\b\b\u0002\u0010r\u001a\u00020I2\b\b\u0002\u0010s\u001a\u00020I2\b\b\u0002\u0010t\u001a\u00020IH\u0007ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ8\u0010w\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b|\u0010}J8\u0010~\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010}J<\u0010\u0080\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010}J<\u0010\u0082\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010}J<\u0010\u0084\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010}J<\u0010\u0086\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010}JM\u0010\u0088\u0001\u001a\u00020+*\u00020+2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "defaultTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6233constructorimpl(56);
    private static final float MinWidth = Dp.m6233constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float fM6233constructorimpl = Dp.m6233constructorimpl(1);
        UnfocusedIndicatorThickness = fM6233constructorimpl;
        float fM6233constructorimpl2 = Dp.m6233constructorimpl(2);
        FocusedIndicatorThickness = fM6233constructorimpl2;
        UnfocusedBorderThickness = fM6233constructorimpl;
        FocusedBorderThickness = fM6233constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2297contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2308contentPaddingWithLabela9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2298contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2309contentPaddingWithoutLabela9UjIt4(f2, f3, f4, f5);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2299getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2300getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2301indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            f2 = FocusedIndicatorThickness;
        }
        return textFieldDefaults.m2316indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f2, (i2 & 32) != 0 ? UnfocusedIndicatorThickness : f3);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2302outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2317outlinedTextFieldPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2303supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6233constructorimpl(0);
        }
        return textFieldDefaults.m2318supportingTextPaddinga9UjIt4$material3_release(f2, f3, f4, f5);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2304textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2319textFieldWithLabelPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2305textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2320textFieldWithoutLabelPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2306Container4EFweAY(final boolean r22, final boolean r23, final androidx.compose.foundation.interaction.InteractionSource r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.TextFieldColors r26, androidx.compose.ui.graphics.Shape r27, float r28, float r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m2306Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @kotlin.ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ContainerBox(final boolean r21, final boolean r22, final androidx.compose.foundation.interaction.InteractionSource r23, final androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(final java.lang.String r36, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, final boolean r38, final boolean r39, final androidx.compose.ui.text.input.VisualTransformation r40, final androidx.compose.foundation.interaction.InteractionSource r41, boolean r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, androidx.compose.ui.graphics.Shape r50, androidx.compose.material3.TextFieldColors r51, androidx.compose.foundation.layout.PaddingValues r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final TextFieldColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i2, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2307colors0hiis_0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long j44;
        TextSelectionColors textSelectionColors2;
        long jM3828getUnspecified0d7_KjU = (i7 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i7 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i7 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i7 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i7 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        long jM3828getUnspecified0d7_KjU6 = (i7 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j7;
        long jM3828getUnspecified0d7_KjU7 = (i7 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j8;
        long j45 = jM3828getUnspecified0d7_KjU;
        long jM3828getUnspecified0d7_KjU8 = (i7 & 128) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j9;
        long jM3828getUnspecified0d7_KjU9 = (i7 & Fields.RotationX) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j10;
        long jM3828getUnspecified0d7_KjU10 = (i7 & 512) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j11;
        TextSelectionColors textSelectionColors3 = (i7 & 1024) != 0 ? null : textSelectionColors;
        long jM3828getUnspecified0d7_KjU11 = (i7 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j12;
        long jM3828getUnspecified0d7_KjU12 = (i7 & 4096) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j13;
        long jM3828getUnspecified0d7_KjU13 = (i7 & 8192) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j14;
        long jM3828getUnspecified0d7_KjU14 = (i7 & Fields.Clip) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j15;
        long jM3828getUnspecified0d7_KjU15 = (32768 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j16;
        long jM3828getUnspecified0d7_KjU16 = (65536 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j17;
        long jM3828getUnspecified0d7_KjU17 = (131072 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j18;
        long jM3828getUnspecified0d7_KjU18 = (262144 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j19;
        long jM3828getUnspecified0d7_KjU19 = (524288 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j20;
        long jM3828getUnspecified0d7_KjU20 = (1048576 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j21;
        long jM3828getUnspecified0d7_KjU21 = (2097152 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j22;
        long jM3828getUnspecified0d7_KjU22 = (4194304 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j23;
        long jM3828getUnspecified0d7_KjU23 = (8388608 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j24;
        long jM3828getUnspecified0d7_KjU24 = (16777216 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j25;
        long jM3828getUnspecified0d7_KjU25 = (33554432 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j26;
        long jM3828getUnspecified0d7_KjU26 = (67108864 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j27;
        long jM3828getUnspecified0d7_KjU27 = (134217728 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j28;
        long jM3828getUnspecified0d7_KjU28 = (268435456 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j29;
        long jM3828getUnspecified0d7_KjU29 = (536870912 & i7) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j30;
        long jM3828getUnspecified0d7_KjU30 = (i7 & 1073741824) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j31;
        long jM3828getUnspecified0d7_KjU31 = (i8 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j32;
        long jM3828getUnspecified0d7_KjU32 = (i8 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j33;
        long jM3828getUnspecified0d7_KjU33 = (i8 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j34;
        long jM3828getUnspecified0d7_KjU34 = (i8 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j35;
        long jM3828getUnspecified0d7_KjU35 = (i8 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j36;
        long jM3828getUnspecified0d7_KjU36 = (i8 & 32) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j37;
        long jM3828getUnspecified0d7_KjU37 = (i8 & 64) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j38;
        long jM3828getUnspecified0d7_KjU38 = (i8 & 128) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j39;
        long jM3828getUnspecified0d7_KjU39 = (i8 & Fields.RotationX) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j40;
        long jM3828getUnspecified0d7_KjU40 = (i8 & 512) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j41;
        long jM3828getUnspecified0d7_KjU41 = (i8 & 1024) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j42;
        long jM3828getUnspecified0d7_KjU42 = (i8 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j43;
        if (ComposerKt.isTraceInProgress()) {
            j44 = jM3828getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1513344955, i2, i3, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        } else {
            j44 = jM3828getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors textFieldColorsM2244copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i6 >> 6) & 112).m2244copyejIjP34(j45, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5, jM3828getUnspecified0d7_KjU6, jM3828getUnspecified0d7_KjU7, jM3828getUnspecified0d7_KjU8, jM3828getUnspecified0d7_KjU9, jM3828getUnspecified0d7_KjU10, textSelectionColors2, jM3828getUnspecified0d7_KjU11, jM3828getUnspecified0d7_KjU12, jM3828getUnspecified0d7_KjU13, jM3828getUnspecified0d7_KjU14, jM3828getUnspecified0d7_KjU15, jM3828getUnspecified0d7_KjU16, jM3828getUnspecified0d7_KjU17, jM3828getUnspecified0d7_KjU18, jM3828getUnspecified0d7_KjU19, jM3828getUnspecified0d7_KjU20, jM3828getUnspecified0d7_KjU21, jM3828getUnspecified0d7_KjU22, jM3828getUnspecified0d7_KjU23, jM3828getUnspecified0d7_KjU24, jM3828getUnspecified0d7_KjU25, jM3828getUnspecified0d7_KjU26, jM3828getUnspecified0d7_KjU27, jM3828getUnspecified0d7_KjU28, jM3828getUnspecified0d7_KjU29, jM3828getUnspecified0d7_KjU30, jM3828getUnspecified0d7_KjU31, jM3828getUnspecified0d7_KjU32, jM3828getUnspecified0d7_KjU33, jM3828getUnspecified0d7_KjU34, jM3828getUnspecified0d7_KjU35, jM3828getUnspecified0d7_KjU36, jM3828getUnspecified0d7_KjU37, jM3828getUnspecified0d7_KjU38, jM3828getUnspecified0d7_KjU39, jM3828getUnspecified0d7_KjU40, jM3828getUnspecified0d7_KjU41, j44);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM2244copyejIjP34;
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2308contentPaddingWithLabela9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m638PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2309contentPaddingWithoutLabela9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m638PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors getDefaultTextFieldColors(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        composer.startReplaceGroup(27085453);
        if (defaultTextFieldColorsCached == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            TextFieldColors textFieldColors = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), filledTextFieldTokens.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), filledTextFieldTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), filledTextFieldTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), filledTextFieldTokens.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), filledTextFieldTokens.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m3791copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(textFieldColors);
            defaultTextFieldColorsCached = textFieldColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColorsCached;
    }

    public final Shape getFilledShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape = getShape(composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2310getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2311getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2312getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2313getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2314getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2315getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2316indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f2, final float f3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                d.k(z2, d.k(z, inspectorInfo.getProperties(), "enabled", inspectorInfo), "isError", inspectorInfo).set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                d.j(f2, inspectorInfo.getProperties(), "focusedIndicatorLineThickness", inspectorInfo).set("unfocusedIndicatorLineThickness", Dp.m6231boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceGroup(-891038934);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i2, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, TextFieldImplKt.m2614animateBorderStrokeAsStateNuRrP5Q(z, z2, FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, 0).getValue().booleanValue(), textFieldColors, f2, f3, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2317outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m1977contentPaddinga9UjIt4(start, top, end, bottom);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m2318supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m638PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2319textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return m2308contentPaddingWithLabela9UjIt4(start, end, top, bottom);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2320textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return m2309contentPaddingWithoutLabela9UjIt4(start, top, end, bottom);
    }
}
