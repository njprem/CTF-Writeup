package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0012\u001a!\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001aË\u0001\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2>\b\u0002\u0010\u001f\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\n2>\b\u0002\u0010 \u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\n2\b\b\u0002\u0010!\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\"\u001a\u001e\u0010#\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001e\u0010#\u001a\u00020\r*\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010%\u001a\u0016\u0010(\u001a\u00020&*\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"F\u0010\u0000\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"F\u0010\f\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"NoOpOnDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "NoOpOnDragStopped", "", "velocity", "DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "onDragStarted", "onDragStopped", "reverseDirection", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "toValidVelocity", "toValidVelocity-TH1AsA0", "(J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    private static final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);
    private static final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    public static final DraggableState DraggableState(Function1<? super Float, Unit> function1) {
        return new DefaultDraggableState(function1);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z3) {
        return modifier.then(new DraggableElement(draggableState, orientation, z, mutableInteractionSource, z2, function3, function32, z3));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function32, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z4, mutableInteractionSource, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? NoOpOnDragStarted : function3, (i2 & 64) != 0 ? NoOpOnDragStopped : function32, (i2 & 128) != 0 ? false : z3);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> function1, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i2, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:136)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                    invoke(f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f2));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m407toFloat3MmeM6k(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m3552getYimpl(j2) : Offset.m3551getXimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m408toFloatsFctU(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m6471getYimpl(j2) : Velocity.m6470getXimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m409toValidVelocityTH1AsA0(long j2) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m6470getXimpl(j2)) ? 0.0f : Velocity.m6470getXimpl(j2), Float.isNaN(Velocity.m6471getYimpl(j2)) ? 0.0f : Velocity.m6471getYimpl(j2));
    }
}
