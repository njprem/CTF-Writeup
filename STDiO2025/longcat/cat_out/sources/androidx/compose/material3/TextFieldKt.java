package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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

@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aØ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001aØ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020-2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001aì\u0001\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\u00109\u001ar\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001aR\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001a\u0010R\u001a\u00020\f*\u00020\f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TH\u0000\u001a\u009a\u0001\u0010V\u001a\u00020\u0006*\u00020W2\u0006\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\b\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010b\u001a\u00020[2\b\u0010c\u001a\u0004\u0018\u00010[2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020$2\u0006\u0010e\u001a\u00020$2\u0006\u00103\u001a\u0002042\u0006\u0010E\u001a\u000204H\u0002\u001a\u0080\u0001\u0010f\u001a\u00020\u0006*\u00020W2\u0006\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020$2\u0006\u0010g\u001a\u00020[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\b\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010b\u001a\u00020[2\b\u0010c\u001a\u0004\u0018\u00010[2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002\u001a\u0014\u0010h\u001a\u00020$*\u00020$2\u0006\u0010i\u001a\u00020$H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m6233constructorimpl(8);

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
    /* JADX WARN: Removed duplicated region for block: B:271:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
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
    public static final void TextField(final java.lang.String r65, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r66, androidx.compose.ui.Modifier r67, boolean r68, boolean r69, androidx.compose.ui.text.TextStyle r70, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r73, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r74, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r75, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r77, boolean r78, androidx.compose.ui.text.input.VisualTransformation r79, androidx.compose.foundation.text.KeyboardOptions r80, androidx.compose.foundation.text.KeyboardActions r81, boolean r82, int r83, int r84, androidx.compose.foundation.interaction.MutableInteractionSource r85, androidx.compose.ui.graphics.Shape r86, androidx.compose.material3.TextFieldColors r87, androidx.compose.runtime.Composer r88, final int r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final void TextFieldLayout(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, final float f2, final Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        float f3;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1830307184);
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? Fields.CameraDistance : 1024;
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
            i4 |= composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function28) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            paddingValues2 = paddingValues;
            i5 |= composerStartRestartGroup.changed(paddingValues2) ? Fields.RotationX : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i8 = i5;
        if ((i7 & 306783379) == 306783378 && (i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function29 = function2;
            function210 = function28;
            function32 = function3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i7, i8, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z2 = ((1879048192 & i7) == 536870912) | ((234881024 & i7) == 67108864) | ((i8 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f2, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m3292setimpl(composerM3285constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            function27.invoke(composerStartRestartGroup, Integer.valueOf(i8 & 14));
            composerStartRestartGroup.startReplaceGroup(1341517187);
            if (function23 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
                Function2 function2T = d.t(companion, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T);
                }
                Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 12) & 14, function23);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341526310);
            if (function24 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
                Function2 function2T2 = d.t(companion, composerM3285constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3285constructorimpl3, currentCompositionLocalMap3);
                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    d.v(currentCompositeKeyHash3, composerM3285constructorimpl3, currentCompositeKeyHash3, function2T2);
                }
                Updater.m3292setimpl(composerM3285constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
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
            composerStartRestartGroup.startReplaceGroup(1341556924);
            if (function25 != null) {
                Modifier modifierM646paddingqDBjuR0$default = PaddingKt.m646paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fM6233constructorimpl, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor4 = companion.getConstructor();
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
                Function2 function2T3 = d.t(companion, composerM3285constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3285constructorimpl4, currentCompositionLocalMap4);
                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    d.v(currentCompositeKeyHash4, composerM3285constructorimpl4, currentCompositeKeyHash4, function2T3);
                }
                Updater.m3292setimpl(composerM3285constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 18) & 14, function25);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341568890);
            if (function26 != null) {
                float f4 = fCalculateEndPadding;
                Modifier modifierM646paddingqDBjuR0$default2 = PaddingKt.m646paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f4, 0.0f, 10, null);
                f3 = f4;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
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
                Function2 function2T4 = d.t(companion, composerM3285constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3285constructorimpl5, currentCompositionLocalMap5);
                if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    d.v(currentCompositeKeyHash5, composerM3285constructorimpl5, currentCompositeKeyHash5, function2T4);
                }
                Updater.m3292setimpl(composerM3285constructorimpl5, modifierMaterializeModifier5, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 21) & 14, function26);
            } else {
                f3 = fCalculateEndPadding;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341581092);
            if (function22 != null) {
                Modifier modifierM646paddingqDBjuR0$default3 = PaddingKt.m646paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId), DpKt.m6276lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f2), 0.0f, 2, null), null, false, 3, null), fM6233constructorimpl, 0.0f, f3, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default3);
                Function0<ComposeUiNode> constructor6 = companion.getConstructor();
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
                Function2 function2T5 = d.t(companion, composerM3285constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3285constructorimpl6, currentCompositionLocalMap6);
                if (composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    d.v(currentCompositeKeyHash6, composerM3285constructorimpl6, currentCompositeKeyHash6, function2T5);
                }
                Updater.m3292setimpl(composerM3285constructorimpl6, modifierMaterializeModifier6, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                d.x(composerStartRestartGroup, (i7 >> 6) & 14, function22);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fM6233constructorimpl = Dp.m6233constructorimpl(0);
            }
            Modifier modifierM646paddingqDBjuR0$default4 = PaddingKt.m646paddingqDBjuR0$default(modifierWrapContentHeight$default, fM6233constructorimpl, 0.0f, function26 == null ? f3 : Dp.m6233constructorimpl(0), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(1341611627);
            if (function3 != null) {
                function32 = function3;
                function32.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM646paddingqDBjuR0$default4), composerStartRestartGroup, Integer.valueOf((i7 >> 6) & 112));
            } else {
                function32 = function3;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM646paddingqDBjuR0$default4);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), true);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            Function0<ComposeUiNode> constructor7 = companion.getConstructor();
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
            Function2 function2T6 = d.t(companion, composerM3285constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3285constructorimpl7, currentCompositionLocalMap7);
            if (composerM3285constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                d.v(currentCompositeKeyHash7, composerM3285constructorimpl7, currentCompositeKeyHash7, function2T6);
            }
            Updater.m3292setimpl(composerM3285constructorimpl7, modifierMaterializeModifier7, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            function29 = function2;
            function29.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1341622624);
            if (function28 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m675heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2303supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                Function0<ComposeUiNode> constructor8 = companion.getConstructor();
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
                Function2 function2T7 = d.t(companion, composerM3285constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3285constructorimpl8, currentCompositionLocalMap8);
                if (composerM3285constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    d.v(currentCompositeKeyHash8, composerM3285constructorimpl8, currentCompositeKeyHash8, function2T7);
                }
                Updater.m3292setimpl(composerM3285constructorimpl8, modifierMaterializeModifier8, companion.getSetModifier());
                function210 = function28;
                d.x(composerStartRestartGroup, (i8 >> 3) & 14, function210);
            } else {
                function210 = function28;
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33 = function32;
            final PaddingValues paddingValues3 = paddingValues2;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function210;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
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
                    TextFieldKt.TextFieldLayout(modifier, function211, function22, function33, function23, function24, function25, function26, z, f2, function27, function212, paddingValues3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m2323calculateHeightmKXJcVc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f2, long j2, float f3, PaddingValues paddingValues) {
        boolean z = i3 > 0;
        float fM6233constructorimpl = Dp.m6233constructorimpl(paddingValues.getBottom() + paddingValues.getTop()) * f3;
        if (z) {
            fM6233constructorimpl = MathHelpersKt.lerp(Dp.m6233constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f3, fM6233constructorimpl, f2);
        }
        return Math.max(Constraints.m6187getMinHeightimpl(j2), Math.max(i4, Math.max(i5, MathKt.roundToInt(fM6233constructorimpl + MathHelpersKt.lerp(0, i3, f2) + ComparisonsKt.maxOf(i2, i8, i6, i7, MathHelpersKt.lerp(i3, 0, f2))))) + i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2324calculateWidthyeHjK3Y(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int i9 = i4 + i5;
        return Math.max(Math.max(i6 + i9, Math.max(i8 + i9, i7)) + i2 + i3, Constraints.m6188getMinWidthimpl(j2));
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final State<BorderStroke> state) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
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
                contentDrawScope.drawContent();
                float fMo334toPx0680j_4 = contentDrawScope.mo334toPx0680j_4(state.getValue().getWidth());
                float fM3617getHeightimpl = Size.m3617getHeightimpl(contentDrawScope.mo4342getSizeNHjbRc()) - (fMo334toPx0680j_4 / 2);
                DrawScope.m4327drawLine1RTmtNc$default(contentDrawScope, state.getValue().getBrush(), OffsetKt.Offset(0.0f, fM3617getHeightimpl), OffsetKt.Offset(Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()), fM3617getHeightimpl), fMo334toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i4, int i5, float f2, float f3) {
        Placeable.PlacementScope.m5184place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m6371getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i3 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z ? Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero) : MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f3)) - MathKt.roundToInt((r1 - i4) * f2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable6) + TextFieldImplKt.widthOrZero(placeable4);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, i5, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iWidthOrZero, i5, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i2 - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i5, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f2, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5184place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m6371getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i3 - TextFieldImplKt.heightOrZero(placeable8);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable5), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable5) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i2 - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i2, int i3, Placeable placeable) {
        return z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : i3;
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
    /* JADX WARN: Removed duplicated region for block: B:271:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
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
    public static final void TextField(final androidx.compose.ui.text.input.TextFieldValue r65, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r66, androidx.compose.ui.Modifier r67, boolean r68, boolean r69, androidx.compose.ui.text.TextStyle r70, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r73, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r74, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r75, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r77, boolean r78, androidx.compose.ui.text.input.VisualTransformation r79, androidx.compose.foundation.text.KeyboardOptions r80, androidx.compose.foundation.text.KeyboardActions r81, boolean r82, int r83, int r84, androidx.compose.foundation.interaction.MutableInteractionSource r85, androidx.compose.ui.graphics.Shape r86, androidx.compose.material3.TextFieldColors r87, androidx.compose.runtime.Composer r88, final int r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
