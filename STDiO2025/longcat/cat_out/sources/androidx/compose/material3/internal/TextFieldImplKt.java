package androidx.compose.material3.internal;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a5\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010P\u001a\u00020Q2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a×\u0001\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u00020?2\u0099\u0001\u0010M\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(`\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020.0[¢\u0006\u0002\b4H\u0083\bø\u0001\u0000¢\u0006\u0004\be\u0010f\u001aH\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\\2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010i\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0012\u0010n\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u0012\u0010q\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u001c\u0010r\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020?2\u0006\u0010s\u001a\u00020\u0001H\u0000\u001a\u001c\u0010t\u001a\u00020\b*\u00020\b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0012\u0010\u0005\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0019\u0010\u0005\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001d\u0010\u0005\"\u000e\u0010\u001e\u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b!\u0010\u0005\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y²\u0006\n\u0010z\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020?X\u008a\u0084\u0002"}, d2 = {"ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldAnimationDuration", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/internal/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "content", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextFieldTransitionScope", "inputState", "Landroidx/compose/material3/internal/InputPhase;", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelColor", "showLabel", "Lkotlin/Function5;", "Landroidx/compose/runtime/State;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "TextFieldTransitionScope-Jy8F4Js", "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "animateBorderStrokeAsState", "Landroidx/compose/foundation/BorderStroke;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "textFieldBackground", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "shape", "Landroidx/compose/ui/graphics/Shape;", "material3_release", "showPlaceholder", "showPrefixSuffix"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final int TextFieldAnimationDuration = 150;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m6233constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m6233constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m6233constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m6233constructorimpl(24);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        float f2 = 16;
        TextFieldPadding = Dp.m6233constructorimpl(f2);
        MinFocusedLabelLineHeight = Dp.m6233constructorimpl(f2);
        MinSupportingTextLineHeight = Dp.m6233constructorimpl(f2);
        float f3 = 48;
        IconDefaultSizeModifier = SizeKt.m671defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m6233constructorimpl(f3), Dp.m6233constructorimpl(f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:513:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommonDecorationBox(final androidx.compose.material3.internal.TextFieldType r48, final java.lang.String r49, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, final androidx.compose.ui.text.input.VisualTransformation r51, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, boolean r59, boolean r60, boolean r61, final androidx.compose.foundation.interaction.InteractionSource r62, final androidx.compose.foundation.layout.PaddingValues r63, final androidx.compose.material3.TextFieldColors r64, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r65, androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 2744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.internal.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m2609Decoration3JVO9M(long j2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        final long j3;
        final TextStyle textStyle2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1208685580);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function22 = function2;
            textStyle2 = textStyle;
            j3 = j2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208685580, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.m2535ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composerStartRestartGroup, i3 & 1022);
            j3 = j2;
            textStyle2 = textStyle;
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
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

                public final void invoke(Composer composer2, int i4) {
                    TextFieldImplKt.m2609Decoration3JVO9M(j3, textStyle2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m2610DecorationIv8Zu3U(final long j2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(660142980);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(j2)), function2, composerStartRestartGroup, (i3 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
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

                public final void invoke(Composer composer2, int i4) {
                    TextFieldImplKt.m2610DecorationIv8Zu3U(j2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m2611TextFieldTransitionScopeJy8F4Js(androidx.compose.material3.internal.InputPhase r21, long r22, long r24, long r26, boolean r28, kotlin.jvm.functions.Function7<? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>, ? super androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>, ? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.m2611TextFieldTransitionScopeJy8F4Js(androidx.compose.material3.internal.InputPhase, long, long, long, boolean, kotlin.jvm.functions.Function7, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m2614animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State<Color> stateRememberUpdatedState;
        State<Dp> stateRememberUpdatedState2;
        Composer composer2 = composer;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i2, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jM2288indicatorColorXeAY9LY$material3_release = textFieldColors.m2288indicatorColorXeAY9LY$material3_release(z, z2, z3);
        if (z) {
            composer2.startReplaceGroup(1023053998);
            stateRememberUpdatedState = SingleValueAnimationKt.m76animateColorAsStateeuL9pac(jM2288indicatorColorXeAY9LY$material3_release, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1023165505);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3782boximpl(jM2288indicatorColorXeAY9LY$material3_release), composer2, 0);
            composer2.endReplaceGroup();
        }
        State<Color> state = stateRememberUpdatedState;
        if (z) {
            composer2.startReplaceGroup(1023269417);
            stateRememberUpdatedState2 = AnimateAsStateKt.m90animateDpAsStateAjpBEmI(z3 ? f2 : f3, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1023478388);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Dp.m6231boximpl(f3), composer2, (i2 >> 15) & 14);
            composer2.endReplaceGroup();
        }
        State<BorderStroke> stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m224BorderStrokecXLIe8U(stateRememberUpdatedState2.getValue().m6247unboximpl(), state.getValue().m3802unboximpl()), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState3;
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline outlineMo245createOutlinePq9zytI = shape.mo245createOutlinePq9zytI(cacheDrawScope.m3441getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        OutlineKt.m4050drawOutlinewDX37Ww$default(drawScope, outlineMo245createOutlinePq9zytI, colorProducer2.mo1693invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
                    }
                });
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
