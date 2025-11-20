package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÍ\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00122\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0090\u0001\u0010.\u001a\u00020\u00102\u0006\u0010*\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0006\u0010(\u001a\u00020)2\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00142\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a6\u00106\u001a\u000207*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aF\u0010A\u001a\u000207*\u0002082\u0006\u0010B\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aV\u0010E\u001a\u000207*\u0002082\u0006\u0010B\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"IconLayoutIdTag", "", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "Landroidx/compose/ui/unit/Dp;", "F", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationItemMinHeight", "getNavigationItemMinHeight", "()F", "NavigationItemMinWidth", "getNavigationItemMinWidth", "NavigationItem", "", "selected", "", "onClick", "Lkotlin/Function0;", NavigationItemKt.IconLayoutIdTag, "Landroidx/compose/runtime/Composable;", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "indicatorShape", "Landroidx/compose/ui/graphics/Shape;", "indicatorWidth", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "startIconToLabelHorizontalPadding", "topIconItemVerticalPadding", "colors", "Landroidx/compose/material3/NavigationItemColors;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", NavigationItemKt.LabelLayoutIdTag, "badge", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "NavigationItem-SHbi2eg", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationItemLayout", "Landroidx/compose/foundation/interaction/InteractionSource;", "indicatorColor", "Landroidx/compose/ui/graphics/Color;", "animationProgress", "", "NavigationItemLayout-KmRX-Dg", "(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;FFFFFLandroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndStartIcon", "labelPlaceable", "placeLabelAndStartIcon-nru01g4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndTopIcon", "placeLabelAndTopIcon-qoqLrGI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "itemWidth"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationItemKt {
    private static final String IconLayoutIdTag = "icon";
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationItemMinWidth = NavigationRailKt.getNavigationRailItemWidth();
    private static final float NavigationItemMinHeight = NavigationRailKt.getNavigationRailItemHeight();
    private static final float IndicatorVerticalOffset = Dp.m6233constructorimpl(12);

    /* renamed from: NavigationItem-SHbi2eg, reason: not valid java name */
    public static final void m1944NavigationItemSHbi2eg(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Shape shape, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final int i2, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i4) {
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        boolean z3;
        MutableInteractionSource mutableInteractionSource2;
        InteractionSource interactionSource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(547979956);
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            function24 = function2;
            i5 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
        } else {
            function24 = function2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= composerStartRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(f5) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(f6) ? 536870912 : 268435456;
        }
        int i7 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (composerStartRestartGroup.changed(f7) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(navigationItemColors) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function23) ? Fields.RenderEffect : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        int i8 = i6;
        if ((i7 & 306783379) == 306783378 && (4793491 & i8) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547979956, i7, i8, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-44329638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-44329638, i9, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:255)");
                    }
                    long jM1933iconColorWaAFU9c = navigationItemColors.m1933iconColorWaAFU9c(z, z2);
                    Modifier modifierClearAndSetSemantics = function22 != null ? SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }) : Modifier.INSTANCE;
                    Function2<Composer, Integer, Unit> function26 = function25;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierClearAndSetSemantics);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer3);
                    Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(jM1933iconColorWaAFU9c)), function26, composer3, ProvidedValue.$stable);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1735402128);
            if (function23 != null) {
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1836184859, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1836184859, i9, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                        }
                        final Function2<Composer, Integer, Unit> function26 = function23;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(870803363, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope boxScope, Composer composer4, int i10) {
                                if ((i10 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(870803363, i10, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function26.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final Function2<Composer, Integer, Unit> function27 = composableLambdaRememberComposableLambda;
                        BadgeKt.BadgedBox(composableLambdaRememberComposableLambda2, null, ComposableLambdaKt.rememberComposableLambda(-1365557663, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope boxScope, Composer composer4, int i10) {
                                if ((i10 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1365557663, i10, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function27.invoke(composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1735395524);
            ComposableLambda composableLambdaRememberComposableLambda2 = null;
            if (function22 == null) {
                z3 = true;
            } else {
                z3 = true;
                composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-254668050, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-254668050, i9, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                        }
                        ProvideContentColorTextStyleKt.m2535ProvideContentColorTextStyle3JVO9M(navigationItemColors.m1934textColorWaAFU9c(z, z2), textStyle, function22, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            ComposableLambda composableLambda2 = composableLambdaRememberComposableLambda2;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            mutableInteractionSource2 = mutableInteractionSource;
            Modifier modifierM671defaultMinSizeVpY3zN4 = SizeKt.m671defaultMinSizeVpY3zN4(SelectableKt.m893selectableO2vRcR0(modifier, z, mutableInteractionSource2, null, z2, Role.m5524boximpl(Role.INSTANCE.m5537getTabo7Vup1c()), function0), NavigationItemMinWidth, NavigationItemMinHeight);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m1953invokeozmzZPI(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m1953invokeozmzZPI(long j2) {
                        mutableIntState.setIntValue(IntSize.m6403getWidthimpl(j2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM671defaultMinSizeVpY3zN4, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), z3);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.startReplaceGroup(-1634400795);
            if (NavigationItemIconPosition.m1938equalsimpl0(i2, NavigationItemIconPosition.INSTANCE.m1943getTopxw1Ddg())) {
                long jOffset = OffsetKt.Offset((mutableIntState.getIntValue() - r1.mo328roundToPx0680j_4(f2)) / 2, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(IndicatorVerticalOffset));
                Unit unit = Unit.INSTANCE;
                boolean zChanged = ((i8 & 29360128) == 8388608) | composerStartRestartGroup.changed(jOffset);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MappedInteractionSource(mutableInteractionSource2, jOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                interactionSource = (MappedInteractionSource) objRememberedValue3;
            } else {
                interactionSource = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (interactionSource == null) {
                interactionSource = mutableInteractionSource2;
            }
            long selectedIndicatorColor = navigationItemColors.getSelectedIndicatorColor();
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return stateAnimateFloatAsState.getValue();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int i9 = i7 << 3;
            m1945NavigationItemLayoutKmRXDg(interactionSource, selectedIndicatorColor, shape, composableLambda, i2, composableLambda2, (Function0) objRememberedValue4, f3, f4, f5, f6, f7, composerStartRestartGroup, ((i7 >> 6) & 896) | ((i8 >> 6) & 57344) | (i9 & 29360128) | (234881024 & i9) | (i9 & 1879048192), ((i7 >> 27) & 14) | ((i8 << 3) & 112));
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    NavigationItemKt.m1944NavigationItemSHbi2eg(z, function0, function2, textStyle, shape, f2, f3, f4, f5, f6, f7, navigationItemColors, modifier, z2, function22, function23, i2, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    public static final void m1945NavigationItemLayoutKmRXDg(final InteractionSource interactionSource, final long j2, final Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, final int i2, final Function2<? super Composer, ? super Integer, Unit> function22, Function0<Float> function0, final float f2, final float f3, final float f4, final float f5, final float f6, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        MeasurePolicy topIconOrIconOnlyMeasurePolicy;
        Composer composer2;
        final Function0<Float> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757687417);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(interactionSource) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(shape) ? Fields.RotationX : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? Fields.CameraDistance : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? Fields.Clip : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(f3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(f4) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (composerStartRestartGroup.changed(f5) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
        }
        int i9 = i6;
        if ((i5 & 306783379) == 306783378 && (i9 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757687417, i5, i9, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if (function22 == null || NavigationItemIconPosition.m1938equalsimpl0(i2, NavigationItemIconPosition.INSTANCE.m1943getTopxw1Ddg())) {
                i7 = 0;
                i8 = i5;
                composer2 = composerStartRestartGroup;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(function22 != null, function0, f2, f3, f4, f6, null);
                function02 = function0;
            } else {
                i7 = 0;
                i8 = i5;
                function02 = function0;
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(function02, f2, f3, f5, null);
                composer2 = composerStartRestartGroup;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, i7);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
            Function2 function2T = d.t(companion2, composerM3285constructorimpl, topIconOrIconOnlyMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            composerStartRestartGroup = composer2;
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(companion, IndicatorRippleLayoutIdTag), shape), interactionSource, RippleKt.m2040rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 0);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IndicatorLayoutIdTag);
            boolean z = (i8 & 3670016) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setAlpha(function02.invoke().floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(BackgroundKt.m196backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId, (Function1) objRememberedValue), j2, shape), composerStartRestartGroup, 0);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
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
            Function2 function2T2 = d.t(companion2, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
            if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
            }
            Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 9) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-776741606);
            if (function22 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
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
                Function2 function2T3 = d.t(companion2, composerM3285constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3285constructorimpl3, currentCompositionLocalMap3);
                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    d.v(currentCompositeKeyHash3, composerM3285constructorimpl3, currentCompositeKeyHash3, function2T3);
                }
                Updater.m3292setimpl(composerM3285constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                d.x(composerStartRestartGroup, (i8 >> 15) & 14, function22);
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Float> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    NavigationItemKt.m1945NavigationItemLayoutKmRXDg(interactionSource, j2, shape, function2, i2, function22, function03, f2, f3, f4, f5, f6, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    public static final float getNavigationItemMinHeight() {
        return NavigationItemMinHeight;
    }

    public static final float getNavigationItemMinWidth() {
        return NavigationItemMinWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m1950placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        int iM6203constrainWidthK40F9xA = ConstraintsKt.m6203constrainWidthK40F9xA(j2, placeable2.getWidth());
        int iM6202constrainHeightK40F9xA = ConstraintsKt.m6202constrainHeightK40F9xA(j2, placeable2.getHeight());
        final int iC = d.C(placeable3, iM6203constrainWidthK40F9xA, 2);
        final int iH = d.h(placeable3, iM6202constrainHeightK40F9xA, 2);
        final int iC2 = d.C(placeable, iM6203constrainWidthK40F9xA, 2);
        final int iH2 = d.h(placeable, iM6202constrainHeightK40F9xA, 2);
        final int iC3 = d.C(placeable2, iM6203constrainWidthK40F9xA, 2);
        final int iH3 = d.h(placeable2, iM6202constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM6203constrainWidthK40F9xA, iM6202constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iC, iH, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iC2, iH2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iC3, iH3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    public static final MeasureResult m1951placeLabelAndStartIconnru01g4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, float f2) {
        int iM6203constrainWidthK40F9xA = ConstraintsKt.m6203constrainWidthK40F9xA(j2, placeable3.getWidth());
        int iM6202constrainHeightK40F9xA = ConstraintsKt.m6202constrainHeightK40F9xA(j2, placeable3.getHeight());
        final int iC = d.C(placeable4, iM6203constrainWidthK40F9xA, 2);
        final int iH = d.h(placeable4, iM6202constrainHeightK40F9xA, 2);
        final int iH2 = d.h(placeable2, iM6202constrainHeightK40F9xA, 2);
        final int iH3 = d.h(placeable, iM6202constrainHeightK40F9xA, 2);
        final int width = (iM6203constrainWidthK40F9xA - (placeable.getWidth() + (measureScope.mo328roundToPx0680j_4(f2) + placeable2.getWidth()))) / 2;
        final int iMo328roundToPx0680j_4 = measureScope.mo328roundToPx0680j_4(f2) + placeable2.getWidth() + width;
        final int iC2 = d.C(placeable3, iM6203constrainWidthK40F9xA, 2);
        final int iH4 = d.h(placeable3, iM6202constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM6203constrainWidthK40F9xA, iM6202constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, iC, iH, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iMo328roundToPx0680j_4, iH3, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, iH2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iC2, iH4, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    public static final MeasureResult m1952placeLabelAndTopIconqoqLrGI(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, float f2, float f3, float f4) {
        int iM6203constrainWidthK40F9xA = ConstraintsKt.m6203constrainWidthK40F9xA(j2, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int iM6202constrainHeightK40F9xA = ConstraintsKt.m6202constrainHeightK40F9xA(j2, MathKt.roundToInt((measureScope.mo334toPx0680j_4(f4) * 2) + measureScope.mo334toPx0680j_4(f2) + placeable3.getHeight() + placeable.getHeight()));
        final int iMo328roundToPx0680j_4 = measureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(f4 + f3));
        final int iC = d.C(placeable2, iM6203constrainWidthK40F9xA, 2);
        final int iC2 = d.C(placeable4, iM6203constrainWidthK40F9xA, 2);
        final int iMo328roundToPx0680j_42 = iMo328roundToPx0680j_4 - measureScope.mo328roundToPx0680j_4(f3);
        final int iC3 = d.C(placeable, iM6203constrainWidthK40F9xA, 2);
        final int iMo328roundToPx0680j_43 = measureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(f2 + f3)) + placeable2.getHeight() + iMo328roundToPx0680j_4;
        final int iC4 = d.C(placeable3, iM6203constrainWidthK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM6203constrainWidthK40F9xA, iM6202constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, iC2, iMo328roundToPx0680j_42, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iC3, iMo328roundToPx0680j_43, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iC, iMo328roundToPx0680j_4, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iC4, iMo328roundToPx0680j_42, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
