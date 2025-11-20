package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001e\u0010\u0018R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f²\u0006\f\u0010 \u001a\u0004\u0018\u00010!X\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/ChipElevation;", "", "elevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledElevation-D9Ej5fM", "()F", "F", "getDraggedElevation-D9Ej5fM", "getElevation-D9Ej5fM", "getFocusedElevation-D9Ej5fM", "getHoveredElevation-D9Ej5fM", "getPressedElevation-D9Ej5fM", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "material3_release", "lastInteraction", "Landroidx/compose/foundation/interaction/Interaction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ ChipElevation(float f2, float f3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7);
    }

    private final State<Dp> animateElevation(boolean z, InteractionSource interactionSource, Composer composer, int i2) {
        Animatable animatable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2071499570, i2, -1, "androidx.compose.material3.ChipElevation.animateElevation (Chip.kt:2179)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        boolean z2 = true;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i2 & 48) == 32;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z3 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, (i2 >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f2 = !z ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.elevation;
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            Object animatable2 = new Animatable(Dp.m6231boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            objRememberedValue4 = animatable2;
        }
        Animatable animatable3 = (Animatable) objRememberedValue4;
        Dp dpM6231boximpl = Dp.m6231boximpl(f2);
        boolean zChangedInstance = composer.changedInstance(animatable3) | composer.changed(f2);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(z)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z2 | composer.changedInstance(interaction);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
            animatable = animatable3;
            Object chipElevation$animateElevation$2$1 = new ChipElevation$animateElevation$2$1(animatable, f2, z, interaction, mutableState, null);
            composer.updateRememberedValue(chipElevation$animateElevation$2$1);
            objRememberedValue5 = chipElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(dpM6231boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer, 0);
        State<Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction animateElevation$lambda$2(MutableState<Interaction> mutableState) {
        return mutableState.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ChipElevation)) {
            return false;
        }
        ChipElevation chipElevation = (ChipElevation) other;
        return Dp.m6238equalsimpl0(this.elevation, chipElevation.elevation) && Dp.m6238equalsimpl0(this.pressedElevation, chipElevation.pressedElevation) && Dp.m6238equalsimpl0(this.focusedElevation, chipElevation.focusedElevation) && Dp.m6238equalsimpl0(this.hoveredElevation, chipElevation.hoveredElevation) && Dp.m6238equalsimpl0(this.disabledElevation, chipElevation.disabledElevation);
    }

    /* renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDisabledElevation() {
        return this.disabledElevation;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDraggedElevation() {
        return this.draggedElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusedElevation() {
        return this.focusedElevation;
    }

    /* renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHoveredElevation() {
        return this.hoveredElevation;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPressedElevation() {
        return this.pressedElevation;
    }

    public int hashCode() {
        return Dp.m6239hashCodeimpl(this.disabledElevation) + d.B(d.B(d.B(Dp.m6239hashCodeimpl(this.elevation) * 31, 31, this.pressedElevation), 31, this.focusedElevation), 31, this.hoveredElevation);
    }

    public final State<Dp> shadowElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1881877139, i2, -1, "androidx.compose.material3.ChipElevation.shadowElevation (Chip.kt:2171)");
        }
        State<Dp> stateAnimateElevation = animateElevation(z, interactionSource, composer, i2 & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateElevation;
    }

    private ChipElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.elevation = f2;
        this.pressedElevation = f3;
        this.focusedElevation = f4;
        this.hoveredElevation = f5;
        this.draggedElevation = f6;
        this.disabledElevation = f7;
    }
}
