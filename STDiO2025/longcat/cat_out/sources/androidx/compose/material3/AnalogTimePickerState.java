package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.runtime.snapshots.Snapshot;
import j.AbstractC0660m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\u0007J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0017*\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010+R\"\u00103\u001a\u00020.8\u0016@\u0016X\u0096\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00106\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010>\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u00100\"\u0004\b=\u00102R$\u0010A\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u00100\"\u0004\b@\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Landroidx/compose/material3/TimePickerState;", "state", "<init>", "(Landroidx/compose/material3/TimePickerState;)V", "", "animateToCurrent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onGestureEnd", "", "angle", "", "animate", "rotateTo", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUpdated", "()Z", "new", "endValueForAnimation", "(F)F", "updateBaseStateMinute", "()V", "normalize", "", "toHour", "(F)I", "toMinute", "offsetAngle", "Landroidx/compose/material3/TimePickerState;", "getState", "()Landroidx/compose/material3/TimePickerState;", "hourAngle", "F", "minuteAngle", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "anim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/foundation/MutatorMutex;", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "is24hour", "set24hour", "(Z)V", "isAfternoon", "setAfternoon", "Landroidx/compose/material3/TimePickerSelectionMode;", "getSelection-yecRtBI", "()I", "setSelection-6_8s6DQ", "(I)V", "selection", "getCurrentAngle", "()F", "currentAngle", "Lj/m;", "getClockFaceValues", "()Lj/m;", "clockFaceValues", "value", "getMinute", "setMinute", "minute", "getHour", "setHour", "hour", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 8;
    private Animatable<Float, AnimationVector1D> anim;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex = new MutatorMutex();
    private final TimePickerState state;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", i = {}, l = {738}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$end = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new AnonymousClass2(this.$end, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Animatable animatable = AnalogTimePickerState.this.anim;
            Float fBoxFloat = Boxing.boxFloat(this.$end);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null);
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, this, 12, null);
            return objAnimateTo$default == coroutine_suspended ? coroutine_suspended : objAnimateTo$default;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", i = {}, l = {789}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2, reason: invalid class name and case insensitive filesystem */
    public static final class C03492 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03492(float f2, Continuation<? super C03492> continuation) {
            super(1, continuation);
            this.$end = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C03492(this.$end, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Animatable animatable = AnalogTimePickerState.this.anim;
            Float fBoxFloat = Boxing.boxFloat(this.$end);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, this, 12, null);
            return objAnimateTo$default == coroutine_suspended ? coroutine_suspended : objAnimateTo$default;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
            return ((C03492) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", i = {}, l = {803, 806}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$rotateTo$2, reason: invalid class name and case insensitive filesystem */
    public static final class C03502 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ float $angle;
        final /* synthetic */ boolean $animate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03502(float f2, boolean z, Continuation<? super C03502> continuation) {
            super(1, continuation);
            this.$angle = f2;
            this.$animate = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C03502(this.$angle, this.$animate, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        
            if (r12.snapTo(r1, r11) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r12)
                return r12
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.ResultKt.throwOnFailure(r12)
                goto La9
            L1f:
                kotlin.ResultKt.throwOnFailure(r12)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                int r12 = r12.mo1392getSelectionyecRtBI()
                androidx.compose.material3.TimePickerSelectionMode$Companion r1 = androidx.compose.material3.TimePickerSelectionMode.INSTANCE
                int r1 = r1.m2384getHouryecRtBI()
                boolean r12 = androidx.compose.material3.TimePickerSelectionMode.m2380equalsimpl0(r12, r1)
                if (r12 == 0) goto L67
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toHour(r12, r1)
                r4 = 12
                int r1 = r1 % r4
                float r1 = (float) r1
                r5 = 1057360530(0x3f060a92, float:0.5235988)
                float r1 = r1 * r5
                androidx.compose.material3.AnalogTimePickerState.access$setHourAngle$p(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r12 = r12.getState()
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                float r5 = androidx.compose.material3.AnalogTimePickerState.access$getHourAngle$p(r1)
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toHour(r1, r5)
                int r1 = r1 % r4
                androidx.compose.material3.AnalogTimePickerState r5 = androidx.compose.material3.AnalogTimePickerState.this
                boolean r5 = r5.isAfternoon()
                if (r5 == 0) goto L61
                goto L62
            L61:
                r4 = 0
            L62:
                int r1 = r1 + r4
                r12.setHour(r1)
                goto L8a
            L67:
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r12, r1)
                float r1 = (float) r1
                r4 = 1037465424(0x3dd67750, float:0.10471976)
                float r1 = r1 * r4
                androidx.compose.material3.AnalogTimePickerState.access$setMinuteAngle$p(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r12 = r12.getState()
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                float r4 = androidx.compose.material3.AnalogTimePickerState.access$getMinuteAngle$p(r1)
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r1, r4)
                r12.setMinute(r1)
            L8a:
                boolean r12 = r11.$animate
                if (r12 != 0) goto Lac
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.animation.core.Animatable r12 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r12)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                float r2 = r11.$angle
                float r1 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r1, r2)
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
                r11.label = r3
                java.lang.Object r12 = r12.snapTo(r1, r11)
                if (r12 != r0) goto La9
                goto Ld9
            La9:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            Lac:
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                float r1 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r12, r1)
                float r12 = androidx.compose.material3.AnalogTimePickerState.access$endValueForAnimation(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.animation.core.Animatable r3 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r1)
                java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
                r12 = 1143930880(0x442f0000, float:700.0)
                r1 = 4
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                androidx.compose.animation.core.SpringSpec r5 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r5, r12, r6, r1, r6)
                r11.label = r2
                r7 = 0
                r9 = 12
                r10 = 0
                r8 = r11
                java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto Lda
            Ld9:
                return r0
            Lda:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnalogTimePickerState.C03502.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((C03502) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AnalogTimePickerState(TimePickerState timePickerState) {
        this.state = timePickerState;
        this.hourAngle = ((timePickerState.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (timePickerState.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float endValueForAnimation(float f2) {
        float fFloatValue = this.anim.getValue().floatValue() - f2;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.anim.getValue().floatValue() - fFloatValue;
    }

    private final boolean isUpdated() {
        int iMo1392getSelectionyecRtBI = mo1392getSelectionyecRtBI();
        TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.INSTANCE;
        if (TimePickerSelectionMode.m2380equalsimpl0(iMo1392getSelectionyecRtBI, companion.m2384getHouryecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.hourAngle)) {
            return false;
        }
        return (TimePickerSelectionMode.m2380equalsimpl0(mo1392getSelectionyecRtBI(), companion.m2385getMinuteyecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.minuteAngle)) ? false : true;
    }

    private final float normalize(float f2) {
        double d2 = f2 % 6.283185307179586d;
        if (d2 < 0.0d) {
            d2 += 6.283185307179586d;
        }
        return (float) d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetAngle(float angle) {
        float f2 = angle + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    public static /* synthetic */ Object rotateTo$default(AnalogTimePickerState analogTimePickerState, float f2, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return analogTimePickerState.rotateTo(f2, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f2) {
        return ((int) ((f2 + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f2) {
        return ((int) ((f2 + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    private final void updateBaseStateMinute() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            this.state.setMinute(getMinute());
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final Object animateToCurrent(Continuation<? super Unit> continuation) {
        if (!isUpdated()) {
            return Unit.INSTANCE;
        }
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new AnonymousClass2(TimePickerSelectionMode.m2380equalsimpl0(mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI()) ? endValueForAnimation(this.hourAngle) : endValueForAnimation(this.minuteAngle), null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    public final AbstractC0660m getClockFaceValues() {
        return TimePickerSelectionMode.m2380equalsimpl0(mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    public final float getCurrentAngle() {
        return this.anim.getValue().floatValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI, reason: not valid java name */
    public int mo1392getSelectionyecRtBI() {
        return this.state.mo1392getSelectionyecRtBI();
    }

    public final TimePickerState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.state.is24hour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return this.state.isAfternoon();
    }

    public final Object onGestureEnd(Continuation<? super Unit> continuation) {
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C03492(endValueForAnimation(TimePickerSelectionMode.m2380equalsimpl0(mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI()) ? this.hourAngle : this.minuteAngle), null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    public final Object rotateTo(float f2, boolean z, Continuation<? super Unit> continuation) {
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new C03502(f2, z, null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z) {
        this.state.set24hour(z);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z) {
        this.state.setAfternoon(z);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i2) {
        this.hourAngle = ((i2 % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(i2);
        if (TimePickerSelectionMode.m2380equalsimpl0(mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i2) {
        this.minuteAngle = (i2 * 0.10471976f) - 1.5707964f;
        this.state.setMinute(i2);
        if (TimePickerSelectionMode.m2380equalsimpl0(mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
        }
        updateBaseStateMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo1393setSelection6_8s6DQ(int i2) {
        this.state.mo1393setSelection6_8s6DQ(i2);
    }
}
