package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000°\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aØ\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u0010/\u001aØ\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u00101\u001a\u0080\u0002\u00102\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010%\u001a\u00020\u00112\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\t0\r2\u0011\u0010:\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\u0010>\u001ar\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001aj\u0010M\u001a\u00020'2\u0006\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020'2\u0006\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020'2\u0006\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\"\u0010W\u001a\u00020\u000f*\u00020\u000f2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002090\u00162\u0006\u0010<\u001a\u00020=H\u0000\u001a\u009a\u0001\u0010Y\u001a\u00020\t*\u00020Z2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020'2\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010`\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010^2\u0006\u0010b\u001a\u00020^2\b\u0010c\u001a\u0004\u0018\u00010^2\b\u0010d\u001a\u0004\u0018\u00010^2\u0006\u0010e\u001a\u00020^2\b\u0010f\u001a\u0004\u0018\u00010^2\u0006\u00106\u001a\u0002072\u0006\u0010%\u001a\u00020\u00112\u0006\u0010J\u001a\u0002072\u0006\u0010g\u001a\u00020h2\u0006\u0010<\u001a\u00020=H\u0002\u001a\u0014\u0010i\u001a\u00020'*\u00020'2\u0006\u0010j\u001a\u00020'H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-DHJA7U0", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "outlineCutout", "labelSize", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "substractConstraintSafely", "from", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m6233constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding;

    static {
        long jM3209getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m3209getBodySmallLineHeightXSAIIZE();
        TextUnitKt.m6439checkArithmeticR2X_6o(jM3209getBodySmallLineHeightXSAIIZE);
        OutlinedTextFieldTopPadding = TextUnitKt.pack(TextUnit.m6424getRawTypeimpl(jM3209getBodySmallLineHeightXSAIIZE), TextUnit.m6426getValueimpl(jM3209getBodySmallLineHeightXSAIIZE) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final java.lang.String r68, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r69, androidx.compose.ui.Modifier r70, boolean r71, boolean r72, androidx.compose.ui.text.TextStyle r73, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r74, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r75, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r77, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r78, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r79, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, float f2, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        float f3;
        Alignment.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        final float f4 = f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1408290209);
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function24) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(f4) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function27) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function28) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i5 |= composerStartRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i8 = i5;
        if ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function29 = function22;
            function210 = function28;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i7, i8, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z2 = ((i8 & 7168) == 2048) | ((i8 & 14) == 4) | ((234881024 & i7) == 67108864) | ((1879048192 & i7) == 536870912);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f4, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, outlinedTextFieldMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            function27.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 3) & 14));
            composerStartRestartGroup.startReplaceGroup(250370369);
            if (function23 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T = d.t(companion2, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T);
                }
                Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 12) & 14, function23);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250379492);
            if (function24 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T2 = d.t(companion2, composerM3285constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3285constructorimpl3, currentCompositionLocalMap3);
                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    d.v(currentCompositeKeyHash3, composerM3285constructorimpl3, currentCompositeKeyHash3, function2T2);
                }
                Updater.m3292setimpl(composerM3285constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 15) & 14, function24);
            }
            composerStartRestartGroup.endReplaceGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function23 != null) {
                i6 = 0;
                fCalculateStartPadding = Dp.m6233constructorimpl(RangesKt.coerceAtLeast(Dp.m6233constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6233constructorimpl(0)));
            } else {
                i6 = 0;
            }
            float fM6233constructorimpl = fCalculateStartPadding;
            if (function24 != null) {
                fCalculateEndPadding = Dp.m6233constructorimpl(RangesKt.coerceAtLeast(Dp.m6233constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6233constructorimpl(i6)));
            }
            composerStartRestartGroup.startReplaceGroup(250410106);
            if (function25 != null) {
                Modifier modifierM646paddingqDBjuR0$default = PaddingKt.m646paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fM6233constructorimpl, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T3 = d.t(companion2, composerM3285constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3285constructorimpl4, currentCompositionLocalMap4);
                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    d.v(currentCompositeKeyHash4, composerM3285constructorimpl4, currentCompositeKeyHash4, function2T3);
                }
                Updater.m3292setimpl(composerM3285constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 18) & 14, function25);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250422072);
            if (function26 != null) {
                f3 = fCalculateEndPadding;
                Modifier modifierM646paddingqDBjuR0$default2 = PaddingKt.m646paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f3, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T4 = d.t(companion2, composerM3285constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3285constructorimpl5, currentCompositionLocalMap5);
                if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    d.v(currentCompositeKeyHash5, composerM3285constructorimpl5, currentCompositeKeyHash5, function2T4);
                }
                Updater.m3292setimpl(composerM3285constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 21) & 14, function26);
            } else {
                f3 = fCalculateEndPadding;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(companion3, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fM6233constructorimpl = Dp.m6233constructorimpl(0);
            }
            Modifier modifierM646paddingqDBjuR0$default3 = PaddingKt.m646paddingqDBjuR0$default(modifierWrapContentHeight$default, fM6233constructorimpl, 0.0f, function26 == null ? f3 : Dp.m6233constructorimpl(0), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(250444361);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion3, TextFieldImplKt.PlaceholderId).then(modifierM646paddingqDBjuR0$default3), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion3, TextFieldImplKt.TextFieldId).then(modifierM646paddingqDBjuR0$default3);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            Function0<ComposeUiNode> constructor6 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T5 = d.t(companion2, composerM3285constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3285constructorimpl6, currentCompositionLocalMap6);
            if (composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                d.v(currentCompositeKeyHash6, composerM3285constructorimpl6, currentCompositeKeyHash6, function2T5);
            }
            Updater.m3292setimpl(composerM3285constructorimpl6, modifierMaterializeModifier6, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(250455481);
            if (function22 != null) {
                f4 = f2;
                Modifier modifierLayoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(companion3, DpKt.m6276lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f4), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.LabelId);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                Function0<ComposeUiNode> constructor7 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl7 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T6 = d.t(companion2, composerM3285constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3285constructorimpl7, currentCompositionLocalMap7);
                if (composerM3285constructorimpl7.getInserting()) {
                    companion = companion4;
                } else {
                    companion = companion4;
                    if (!Intrinsics.areEqual(composerM3285constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl7, modifierMaterializeModifier7, companion2.getSetModifier());
                    function29 = function22;
                    d.x(composerStartRestartGroup, (i7 >> 9) & 14, function29);
                }
                d.v(currentCompositeKeyHash7, composerM3285constructorimpl7, currentCompositeKeyHash7, function2T6);
                Updater.m3292setimpl(composerM3285constructorimpl7, modifierMaterializeModifier7, companion2.getSetModifier());
                function29 = function22;
                d.x(composerStartRestartGroup, (i7 >> 9) & 14, function29);
            } else {
                f4 = f2;
                companion = companion4;
                function29 = function22;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250473414);
            if (function28 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(companion3, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2303supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                Function0<ComposeUiNode> constructor8 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl8 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T7 = d.t(companion2, composerM3285constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3285constructorimpl8, currentCompositionLocalMap8);
                if (composerM3285constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    d.v(currentCompositeKeyHash8, composerM3285constructorimpl8, currentCompositeKeyHash8, function2T7);
                }
                Updater.m3292setimpl(composerM3285constructorimpl8, modifierMaterializeModifier8, companion2.getSetModifier());
                function210 = function28;
                d.x(composerStartRestartGroup, (i8 >> 6) & 14, function210);
            } else {
                function210 = function28;
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function211 = function210;
            final PaddingValues paddingValues3 = paddingValues2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function29, function23, function24, function25, function26, z, f4, function1, function27, function211, paddingValues3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m1984calculateHeightmKXJcVc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f2, long j2, float f3, PaddingValues paddingValues) {
        int iMaxOf = ComparisonsKt.maxOf(i6, i8, i4, i5, MathHelpersKt.lerp(i7, 0, f2));
        float top = paddingValues.getTop() * f3;
        return Math.max(Constraints.m6187getMinHeightimpl(j2), Math.max(i2, Math.max(i3, MathKt.roundToInt(MathHelpersKt.lerp(top, Math.max(top, i7 / 2.0f), f2) + iMaxOf + (paddingValues.getBottom() * f3)))) + i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    public static final int m1985calculateWidthDHJA7U0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2, long j2, float f3, PaddingValues paddingValues) {
        int i9 = i4 + i5;
        int iMax = Math.max(i6 + i9, Math.max(i8 + i9, MathHelpersKt.lerp(i7, 0, f2))) + i2 + i3;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(iMax, Math.max(MathKt.roundToInt((i7 + (Dp.m6233constructorimpl(paddingValues.mo594calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo593calculateLeftPaddingu2uoSUM(layoutDirection)) * f3)) * f2), Constraints.m6188getMinWidthimpl(j2)));
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    public static final Modifier outlineCutout(Modifier modifier, final Function0<Size> function0, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.outlineCutout.1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                long packedValue = function0.invoke().getPackedValue();
                float fM3620getWidthimpl = Size.m3620getWidthimpl(packedValue);
                if (fM3620getWidthimpl <= 0.0f) {
                    contentDrawScope.drawContent();
                    return;
                }
                float fMo334toPx0680j_4 = contentDrawScope.mo334toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float fMo334toPx0680j_42 = contentDrawScope.mo334toPx0680j_4(paddingValues.mo593calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo334toPx0680j_4;
                float f2 = 2;
                float fM3620getWidthimpl2 = (fMo334toPx0680j_4 * f2) + fM3620getWidthimpl + fMo334toPx0680j_42;
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fM3620getWidthimpl3 = iArr[layoutDirection.ordinal()] == 1 ? Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - fM3620getWidthimpl2 : RangesKt.coerceAtLeast(fMo334toPx0680j_42, 0.0f);
                if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fM3620getWidthimpl2 = Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - RangesKt.coerceAtLeast(fMo334toPx0680j_42, 0.0f);
                }
                float f3 = fM3620getWidthimpl2;
                float fM3617getHeightimpl = Size.m3617getHeightimpl(packedValue);
                float f4 = (-fM3617getHeightimpl) / f2;
                float f5 = fM3617getHeightimpl / f2;
                int iM3780getDifferencertfAjoo = ClipOp.INSTANCE.m3780getDifferencertfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo4266clipRectN_I0leg(fM3620getWidthimpl3, f4, f3, f5, iM3780getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    d.y(drawContext, jMo4263getSizeNHjbRc);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f2, boolean z, float f3, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable placeable10;
        boolean z2;
        int i4;
        int i5;
        Placeable.PlacementScope.m5184place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m6371getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f3);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f3);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f3;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            placeable10 = placeable6;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, MathKt.roundToInt(placeable == null ? 0.0f : (1 - f2) * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + iRoundToInt2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), iHeightOrZero) : iRoundToInt, -(placeable6.getHeight() / 2), f2), 0.0f, 4, null);
        } else {
            placeable10 = placeable6;
        }
        if (placeable3 != null) {
            i5 = iRoundToInt;
            i4 = iHeightOrZero;
            z2 = z;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable10, placeable3), 0.0f, 4, null);
        } else {
            z2 = z;
            i4 = iHeightOrZero;
            i5 = iRoundToInt;
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, iWidthOrZero, place$calculateVerticalPosition(z2, i4, i5, placeable10, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWidthOrZero, place$calculateVerticalPosition(z2, i4, i5, placeable10, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i3 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z2, i4, i5, placeable10, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i4), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i4, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (z) {
            i3 = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
        }
        return Math.max(i3, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r68, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r69, androidx.compose.ui.Modifier r70, boolean r71, boolean r72, androidx.compose.ui.text.TextStyle r73, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r74, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r75, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r77, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r78, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r79, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
