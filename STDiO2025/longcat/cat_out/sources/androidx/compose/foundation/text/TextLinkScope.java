package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001fJ>\u0010 \u001a\u00020\t2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\"\"\u0004\u0018\u00010\u00012\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00020\u0003H\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u001c\u0010,\u001a\u0004\u0018\u00010-2\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020)0/j\u0002`0H\u0002J\u001c\u00101\u001a\u0004\u0018\u0001022\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020)0/j\u0002`0H\u0002J\u001a\u00103\u001a\u0004\u0018\u000104*\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000104H\u0002J\u001c\u00106\u001a\u000207*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002R%\u0010\u0005\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0004R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006;²\u0006\n\u0010<\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "initialText", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotators", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/TextAnnotatorScope;", "", "Lkotlin/ExtensionFunctionType;", "getInitialText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "shouldMeasureLinks", "Lkotlin/Function0;", "", "getShouldMeasureLinks", "()Lkotlin/jvm/functions/Function0;", "text", "getText$foundation_release", "setText$foundation_release", "<set-?>", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setTextLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "textLayoutResult$delegate", "Landroidx/compose/runtime/MutableState;", "LinksComposables", "(Landroidx/compose/runtime/Composer;I)V", "StyleAnnotation", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "applyAnnotators", "applyAnnotators$foundation_release", "handleLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "uriHandler", "Landroidx/compose/ui/platform/UriHandler;", "pathForRangeInRangeCoordinates", "Landroidx/compose/ui/graphics/Path;", "range", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/foundation/text/LinkRange;", "shapeForRange", "Landroidx/compose/ui/graphics/Shape;", "mergeOrUse", "Landroidx/compose/ui/text/SpanStyle;", "other", "textRange", "Landroidx/compose/ui/Modifier;", "start", "", "end", "foundation_release", "isHovered", "isFocused", "isPressed"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLinkScope {
    public static final int $stable = 8;
    private final SnapshotStateList<Function1<TextAnnotatorScope, Unit>> annotators;
    private final AnnotatedString initialText;
    private AnnotatedString text;

    /* renamed from: textLayoutResult$delegate, reason: from kotlin metadata */
    private final MutableState textLayoutResult = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public TextLinkScope(AnnotatedString annotatedString) {
        SpanStyle style;
        this.initialText = annotatedString;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
        List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size = linkAnnotations.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i2);
            TextLinkStyles styles = range.getItem().getStyles();
            if (styles != null && (style = styles.getStyle()) != null) {
                builder.addStyle(style, range.getStart(), range.getEnd());
            }
        }
        this.text = builder.toAnnotatedString();
        this.annotators = SnapshotStateKt.mutableStateListOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinksComposables$lambda$13$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinksComposables$lambda$13$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinksComposables$lambda$13$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void StyleAnnotation(final Object[] objArr, final Function1<? super TextAnnotatorScope, Unit> function1, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2083052099);
        int i3 = (i2 & 48) == 0 ? (composerStartRestartGroup.changedInstance(function1) ? 32 : 16) | i2 : i2;
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? Fields.RotationX : 128;
        }
        composerStartRestartGroup.startMovableGroup(-416717687, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i3 |= composerStartRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:237)");
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(function1);
            spreadBuilder.addSpread(objArr);
            Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        this.this$0.annotators.add(function1);
                        final TextLinkScope textLinkScope = this.this$0;
                        final Function1<TextAnnotatorScope, Unit> function12 = function1;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                textLinkScope.annotators.remove(function12);
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(array, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope.StyleAnnotation.2
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
                    TextLinkScope textLinkScope = TextLinkScope.this;
                    Object[] objArr2 = objArr;
                    textLinkScope.StyleAnnotation(Arrays.copyOf(objArr2, objArr2.length), function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLink(LinkAnnotation link, UriHandler uriHandler) {
        LinkInteractionListener linkInteractionListener;
        Unit unit;
        if (!(link instanceof LinkAnnotation.Url)) {
            if (!(link instanceof LinkAnnotation.Clickable) || (linkInteractionListener = link.getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.onClick(link);
            return;
        }
        LinkInteractionListener linkInteractionListener2 = link.getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.onClick(link);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            try {
                uriHandler.openUri(((LinkAnnotation.Url) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle mergeOrUse(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleMerge;
        return (spanStyle == null || (spanStyleMerge = spanStyle.merge(spanStyle2)) == null) ? spanStyle2 : spanStyleMerge;
    }

    private final Path pathForRangeInRangeCoordinates(AnnotatedString.Range<LinkAnnotation> range) {
        Path pathForRange = null;
        if (!getShouldMeasureLinks().invoke().booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResult = getTextLayoutResult();
        if (textLayoutResult != null) {
            pathForRange = textLayoutResult.getPathForRange(range.getStart(), range.getEnd());
            Rect boundingBox = textLayoutResult.getBoundingBox(range.getStart());
            pathForRange.mo3687translatek4lQ0M(Offset.m3560unaryMinusF1C5BW0(OffsetKt.Offset(textLayoutResult.getLineForOffset(range.getStart()) == textLayoutResult.getLineForOffset(range.getEnd()) ? Math.min(textLayoutResult.getBoundingBox(range.getEnd() - 1).getLeft(), boundingBox.getLeft()) : 0.0f, boundingBox.getTop())));
        }
        return pathForRange;
    }

    private final Shape shapeForRange(AnnotatedString.Range<LinkAnnotation> range) {
        final Path pathPathForRangeInRangeCoordinates = pathForRangeInRangeCoordinates(range);
        if (pathPathForRangeInRangeCoordinates != null) {
            return new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo245createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Generic(pathPathForRangeInRangeCoordinates);
                }
            };
        }
        return null;
    }

    private final Modifier textRange(Modifier modifier, final int i2, final int i3) {
        return modifier.then(new TextRangeLayoutModifier(new TextRangeScopeMeasurePolicy() { // from class: androidx.compose.foundation.text.b
            @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
            public final TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
                return TextLinkScope.textRange$lambda$3(this.f318a, i2, i3, textRangeLayoutMeasureScope);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRangeLayoutMeasureResult textRange$lambda$3(TextLinkScope textLinkScope, int i2, int i3, TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        if (textLayoutResult == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$layoutResult$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ IntOffset invoke() {
                    return IntOffset.m6352boximpl(m1058invokenOccac());
                }

                /* renamed from: invoke-nOcc-ac, reason: not valid java name */
                public final long m1058invokenOccac() {
                    return IntOffset.INSTANCE.m6371getZeronOccac();
                }
            });
        }
        final IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(i2, i3).getBounds());
        return textRangeLayoutMeasureScope.layout(intRectRoundToIntRect.getWidth(), intRectRoundToIntRect.getHeight(), new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ IntOffset invoke() {
                return IntOffset.m6352boximpl(m1057invokenOccac());
            }

            /* renamed from: invoke-nOcc-ac, reason: not valid java name */
            public final long m1057invokenOccac() {
                return intRectRoundToIntRect.m6389getTopLeftnOccac();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void LinksComposables(Composer composer, final int i2) {
        int i3;
        Modifier modifierClip;
        Composer composerStartRestartGroup = composer.startRestartGroup(1154651354);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154651354, i3, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:152)");
            }
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            AnnotatedString annotatedString = this.text;
            ?? r11 = 0;
            List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
            int size = linkAnnotations.size();
            int i5 = 0;
            while (i5 < size) {
                final AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i5);
                Shape shapeShapeForRange = shapeForRange(range);
                if (shapeShapeForRange == null || (modifierClip = ClipKt.clip(Modifier.INSTANCE, shapeShapeForRange)) == null) {
                    modifierClip = Modifier.INSTANCE;
                }
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                Modifier modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(textRange(modifierClip, range.getStart(), range.getEnd()), mutableInteractionSource, r11, i4, null), PointerIcon.INSTANCE.getHand(), r11, i4, null);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(range) | composerStartRestartGroup.changedInstance(uriHandler);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.handleLink(range.getItem(), uriHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                BoxKt.Box(ClickableKt.m232combinedClickableXVZzFYc$default(modifierPointerHoverIcon$default, mutableInteractionSource, null, false, null, null, null, null, null, (Function0) objRememberedValue2, 252, null), composerStartRestartGroup, r11);
                final State<Boolean> stateCollectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource, composerStartRestartGroup, 6);
                final State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource, composerStartRestartGroup, 6);
                final State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6);
                Boolean boolValueOf = Boolean.valueOf(LinksComposables$lambda$13$lambda$9(stateCollectIsHoveredAsState));
                Boolean boolValueOf2 = Boolean.valueOf(LinksComposables$lambda$13$lambda$10(stateCollectIsFocusedAsState));
                Boolean boolValueOf3 = Boolean.valueOf(LinksComposables$lambda$13$lambda$11(stateCollectIsPressedAsState));
                TextLinkStyles styles = range.getItem().getStyles();
                SpanStyle style = styles != null ? styles.getStyle() : null;
                TextLinkStyles styles2 = range.getItem().getStyles();
                SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                TextLinkStyles styles3 = range.getItem().getStyles();
                SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                TextLinkStyles styles4 = range.getItem().getStyles();
                Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(range) | composerStartRestartGroup.changed(stateCollectIsFocusedAsState) | composerStartRestartGroup.changed(stateCollectIsHoveredAsState) | composerStartRestartGroup.changed(stateCollectIsPressedAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    Object obj = new Function1<TextAnnotatorScope, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatorScope textAnnotatorScope) {
                            invoke2(textAnnotatorScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextAnnotatorScope textAnnotatorScope) {
                            TextLinkStyles styles5;
                            TextLinkStyles styles6;
                            TextLinkStyles styles7;
                            TextLinkScope textLinkScope = this.this$0;
                            TextLinkStyles styles8 = range.getItem().getStyles();
                            SpanStyle pressedStyle = null;
                            SpanStyle spanStyleMergeOrUse = textLinkScope.mergeOrUse(textLinkScope.mergeOrUse(styles8 != null ? styles8.getStyle() : null, (!TextLinkScope.LinksComposables$lambda$13$lambda$10(stateCollectIsFocusedAsState) || (styles7 = range.getItem().getStyles()) == null) ? null : styles7.getFocusedStyle()), (!TextLinkScope.LinksComposables$lambda$13$lambda$9(stateCollectIsHoveredAsState) || (styles6 = range.getItem().getStyles()) == null) ? null : styles6.getHoveredStyle());
                            if (TextLinkScope.LinksComposables$lambda$13$lambda$11(stateCollectIsPressedAsState) && (styles5 = range.getItem().getStyles()) != null) {
                                pressedStyle = styles5.getPressedStyle();
                            }
                            SpanStyle spanStyleMergeOrUse2 = textLinkScope.mergeOrUse(spanStyleMergeOrUse, pressedStyle);
                            if (spanStyleMergeOrUse2 != null) {
                                AnnotatedString.Range<LinkAnnotation> range2 = range;
                                textAnnotatorScope.replaceStyle(spanStyleMergeOrUse2, range2.getStart(), range2.getEnd());
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                    objRememberedValue3 = obj;
                }
                StyleAnnotation(objArr, (Function1) objRememberedValue3, composerStartRestartGroup, (i3 << 6) & 896);
                i5++;
                i4 = 2;
                r11 = 0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope.LinksComposables.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    TextLinkScope.this.LinksComposables(composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public final AnnotatedString applyAnnotators$foundation_release() {
        AnnotatedString annotatedString;
        if (this.annotators.isEmpty()) {
            annotatedString = this.text;
        } else {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(this.initialText);
            TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(builder);
            SnapshotStateList<Function1<TextAnnotatorScope, Unit>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                snapshotStateList.get(i2).invoke(textAnnotatorScope);
            }
            annotatedString = builder.toAnnotatedString();
        }
        this.text = annotatedString;
        return annotatedString;
    }

    /* renamed from: getInitialText$foundation_release, reason: from getter */
    public final AnnotatedString getInitialText() {
        return this.initialText;
    }

    public final Function0<Boolean> getShouldMeasureLinks() {
        return new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextLinkScope$shouldMeasureLinks$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextLayoutInput layoutInput;
                AnnotatedString text = this.this$0.getText();
                TextLayoutResult textLayoutResult = this.this$0.getTextLayoutResult();
                return Boolean.valueOf(Intrinsics.areEqual(text, (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : layoutInput.getText()));
            }
        };
    }

    /* renamed from: getText$foundation_release, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult getTextLayoutResult() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void setText$foundation_release(AnnotatedString annotatedString) {
        this.text = annotatedString;
    }

    public final void setTextLayoutResult(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }
}
