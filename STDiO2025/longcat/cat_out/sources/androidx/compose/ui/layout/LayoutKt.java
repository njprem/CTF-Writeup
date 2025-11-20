package androidx.compose.ui.layout;

import J.d;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a \u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\r\u001a>\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00070\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001a;\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00070\u000fH\u0001¢\u0006\u0002\u0010\u0015\u001a3\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001a2\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010\u001d\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001a2\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"LargeDimension", "", "Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "contents", "", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/ExtensionFunctionType;", "modifierMaterializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "materializerOfWithCompositionLocalInjection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    public static final void Layout(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        int i4 = ((i2 << 6) & 896) | 6;
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
        Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
        }
        Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        d.x(composer, (i4 >> 6) & 14, function2);
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final MeasurePolicy measurePolicy, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(measurePolicy) ? Fields.RotationX : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i4, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:247)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i6 = ((i4 << 3) & 896) | 6;
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m3289initimpl(composerM3285constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            if (d.A(composerStartRestartGroup, (i6 >> 6) & 14, function2)) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
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

                public final void invoke(Composer composer2, int i7) {
                    LayoutKt.MultiMeasureLayout(modifier2, function2, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final Function2<Composer, Integer, Unit> combineAsVirtualLayouts(final List<? extends Function2<? super Composer, ? super Integer, Unit>> list) {
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953651383, i2, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:181)");
                }
                List<Function2<Composer, Integer, Unit>> list2 = list;
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Function2<Composer, Integer, Unit> function2 = list2.get(i3);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> virtualConstructor = companion.getVirtualConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(virtualConstructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    function2.invoke(composer, 0);
                    composer.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m5145invokeDeg8D_g(skippableUpdater.getComposer(), composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m5145invokeDeg8D_g(Composer composer, Composer composer2, int i2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-55743822, i2, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:227)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier modifierMaterializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m5144invokeDeg8D_g(skippableUpdater.getComposer(), composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m5144invokeDeg8D_g(Composer composer, Composer composer2, int i2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586257396, i2, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:204)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
        }
        composer.endNode();
    }

    public static final void Layout(List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z = (((i2 & 896) ^ 384) > 256 && composer.changed(multiContentMeasurePolicy)) || (i2 & 384) == 256;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
        Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
        }
        Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        function2CombineAsVirtualLayouts.invoke(composer, 0);
        composer.endNode();
    }
}
