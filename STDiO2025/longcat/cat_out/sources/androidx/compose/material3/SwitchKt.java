package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001al\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001aR\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u000b\"\u0010\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\r\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u000b¨\u0006%"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SnapSpec", "Landroidx/compose/animation/core/SnapSpec;", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/material3/SwitchColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final SnapSpec<Float> SnapSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float UncheckedThumbDiameter;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float fM3153getSelectedHandleWidthD9Ej5fM = switchTokens.m3153getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = fM3153getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m3160getUnselectedHandleWidthD9Ej5fM();
        SwitchWidth = switchTokens.m3158getTrackWidthD9Ej5fM();
        float fM3156getTrackHeightD9Ej5fM = switchTokens.m3156getTrackHeightD9Ej5fM();
        SwitchHeight = fM3156getTrackHeightD9Ej5fM;
        ThumbPadding = Dp.m6233constructorimpl(Dp.m6233constructorimpl(fM3156getTrackHeightD9Ej5fM - fM3153getSelectedHandleWidthD9Ej5fM) / 2);
        SnapSpec = new SnapSpec<>(0, 1, null);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(final boolean r19, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r20, androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, boolean r23, androidx.compose.material3.SwitchColors r24, androidx.compose.foundation.interaction.MutableInteractionSource r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(final Modifier modifier, boolean z, final boolean z2, final SwitchColors switchColors, final Function2<? super Composer, ? super Integer, Unit> function2, final InteractionSource interactionSource, final Shape shape, Composer composer, final int i2) {
        int i3;
        final boolean z3 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594099146);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(switchColors) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594099146, i3, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:144)");
            }
            long jM2207trackColorWaAFU9c$material3_release = switchColors.m2207trackColorWaAFU9c$material3_release(z2, z3);
            long jM2206thumbColorWaAFU9c$material3_release = switchColors.m2206thumbColorWaAFU9c$material3_release(z2, z3);
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape value = ShapesKt.getValue(switchTokens.getTrackShape(), composerStartRestartGroup, 6);
            int i4 = i3;
            Modifier modifierM196backgroundbw27NRU = BackgroundKt.m196backgroundbw27NRU(BorderKt.m208borderxT4_qwU(modifier, switchTokens.m3157getTrackOutlineWidthD9Ej5fM(), switchColors.m2187borderColorWaAFU9c$material3_release(z2, z3), value), jM2207trackColorWaAFU9c$material3_release, value);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM196backgroundbw27NRU);
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
            Modifier modifierM196backgroundbw27NRU2 = BackgroundKt.m196backgroundbw27NRU(IndicationKt.indication(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion.getCenterStart()).then(new ThumbElement(interactionSource, z3)), interactionSource, RippleKt.m2040rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6233constructorimpl(switchTokens.m3155getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), jM2206thumbColorWaAFU9c$material3_release, shape);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM196backgroundbw27NRU2);
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
            Function2 function2T2 = d.t(companion2, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3285constructorimpl2, currentCompositionLocalMap2);
            if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
            }
            Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(1163457794);
            z3 = z;
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(switchColors.m2205iconColorWaAFU9c$material3_release(z2, z3))), function2, composerStartRestartGroup, ProvidedValue.$stable | ((i4 >> 9) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt.SwitchImpl.2
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

                public final void invoke(Composer composer2, int i5) {
                    SwitchKt.SwitchImpl(modifier, z3, z2, switchColors, function2, interactionSource, shape, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
