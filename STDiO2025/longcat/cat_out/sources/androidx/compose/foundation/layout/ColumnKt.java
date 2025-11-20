package androidx.compose.foundation.layout;

import J.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aJ\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\b¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0000¢\u0006\u0002\u0010\u001f\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, d2 = {"DefaultColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "Column", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "createColumnConstraints", "Landroidx/compose/ui/unit/Constraints;", "isPrioritizing", "", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "(ZIIII)J", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy = new ColumnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart());

    public static final void Column(Modifier modifier, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 4) != 0) {
            horizontal = Alignment.INSTANCE.getStart();
        }
        MeasurePolicy measurePolicyColumnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i2 >> 3) & 126);
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
        Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
        }
        Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        function3.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
        composer.endNode();
    }

    public static final MeasurePolicy columnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Composer composer, int i2) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i2, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:105)");
        }
        if (Intrinsics.areEqual(vertical, Arrangement.INSTANCE.getTop()) && Intrinsics.areEqual(horizontal, Alignment.INSTANCE.getStart())) {
            composer.startReplaceGroup(345884104);
            composer.endReplaceGroup();
            measurePolicy = DefaultColumnMeasurePolicy;
        } else {
            composer.startReplaceGroup(345937951);
            boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i2 & 48) == 32);
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ColumnMeasurePolicy(vertical, horizontal);
                composer.updateRememberedValue(objRememberedValue);
            }
            measurePolicy = (ColumnMeasurePolicy) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final long createColumnConstraints(boolean z, int i2, int i3, int i4, int i5) {
        return !z ? ConstraintsKt.Constraints(i3, i5, i2, i4) : Constraints.INSTANCE.m6194fitPrioritizingHeightZbe2FdA(i3, i5, i2, i4);
    }

    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return DefaultColumnMeasurePolicy;
    }

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}
