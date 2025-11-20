package androidx.compose.foundation.layout;

import J.d;
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
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001aJ\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\b¢\u0006\u0002\u0010\u001f\u001a,\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\b2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002\u001a\u0018\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0010H\u0001\u001a\u001d\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010$\u001a<\u0010%\u001a\u00020\u0014*\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\bX\u0082\u0004¢\u0006\u0002\n\u0000\"*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006/"}, d2 = {"DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "cache1", "Ljava/util/HashMap;", "Landroidx/compose/ui/Alignment;", "Lkotlin/collections/HashMap;", "cache2", "boxChildDataNode", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "Landroidx/compose/ui/layout/Measurable;", "getBoxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "matchesParentSize", "", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "contentAlignment", "propagateMinConstraints", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cacheFor", "maybeCachedBoxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxKt {
    private static final HashMap<Alignment, MeasurePolicy> cache1 = cacheFor(true);
    private static final HashMap<Alignment, MeasurePolicy> cache2 = cacheFor(false);
    private static final MeasurePolicy DefaultBoxMeasurePolicy = new BoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
            return MeasureScope.layout$default(measureScope, Constraints.m6188getMinWidthimpl(j2), Constraints.m6187getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
    };

    public static final void Box(Modifier modifier, Alignment alignment, boolean z, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            alignment = Alignment.INSTANCE.getTopStart();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = maybeCachedBoxMeasurePolicy(alignment, z);
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
        Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
        }
        Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        function3.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
        composer.endNode();
    }

    private static final HashMap<Alignment, MeasurePolicy> cacheFor(boolean z) {
        HashMap<Alignment, MeasurePolicy> map = new HashMap<>(9);
        Alignment.Companion companion = Alignment.INSTANCE;
        cacheFor$lambda$1$putAlignment(map, z, companion.getTopStart());
        cacheFor$lambda$1$putAlignment(map, z, companion.getTopCenter());
        cacheFor$lambda$1$putAlignment(map, z, companion.getTopEnd());
        cacheFor$lambda$1$putAlignment(map, z, companion.getCenterStart());
        cacheFor$lambda$1$putAlignment(map, z, companion.getCenter());
        cacheFor$lambda$1$putAlignment(map, z, companion.getCenterEnd());
        cacheFor$lambda$1$putAlignment(map, z, companion.getBottomStart());
        cacheFor$lambda$1$putAlignment(map, z, companion.getBottomCenter());
        cacheFor$lambda$1$putAlignment(map, z, companion.getBottomEnd());
        return map;
    }

    private static final void cacheFor$lambda$1$putAlignment(HashMap<Alignment, MeasurePolicy> map, boolean z, Alignment alignment) {
        map.put(alignment, new BoxMeasurePolicy(alignment, z));
    }

    private static final BoxChildDataNode getBoxChildDataNode(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildDataNode) {
            return (BoxChildDataNode) parentData;
        }
        return null;
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null) {
            return boxChildDataNode.getMatchParentSize();
        }
        return false;
    }

    public static final MeasurePolicy maybeCachedBoxMeasurePolicy(Alignment alignment, boolean z) {
        MeasurePolicy measurePolicy = (z ? cache1 : cache2).get(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z) : measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i2, int i3, Alignment alignment) {
        Alignment alignment2;
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        Placeable.PlacementScope.m5184place70tqf50$default(placementScope, placeable, ((boxChildDataNode == null || (alignment2 = boxChildDataNode.getAlignment()) == null) ? alignment : alignment2).mo3397alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i2, i3), layoutDirection), 0.0f, 2, null);
    }

    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean z, Composer composer, int i2) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i2, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)");
        }
        if (!Intrinsics.areEqual(alignment, Alignment.INSTANCE.getTopStart()) || z) {
            composer.startReplaceGroup(-1710100211);
            boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(alignment)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(z)) || (i2 & 48) == 32);
            Object objRememberedValue = composer.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new BoxMeasurePolicy(alignment, z);
                composer.updateRememberedValue(objRememberedValue);
            }
            measurePolicy = (BoxMeasurePolicy) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1710139705);
            composer.endReplaceGroup();
            measurePolicy = DefaultBoxMeasurePolicy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final void Box(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-211209833);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i3, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt.Box.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BoxKt.Box(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
