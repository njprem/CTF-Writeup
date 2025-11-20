package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u00012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003\u001aZ\u0010\f\u001a\u00020\u00012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\u000e\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0014\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001a\u0010\u001c\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001e\u001a\u00020\u000b*\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!\u001a\u001a\u0010\"\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"TransformableState", "Landroidx/compose/foundation/gestures/TransformableState;", "onTransformation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "rememberTransformableState", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "animatePanBy", "offset", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateRotateBy", "degrees", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateZoomBy", "zoomFactor", "panBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTransformation", "terminationPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zoomBy", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformableStateKt {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref.FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.FloatRef floatRef, float f2, AnimationSpec<Float> animationSpec, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$previous = floatRef;
            this.$degrees = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$previous, this.$degrees, this.$animationSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = Boxing.boxFloat(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previous;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m470transformByd4ec7I$default(transformScope, 0.0f, 0L, animationScope.getValue().floatValue() - floatRef.element, 3, null);
                        floatRef.element = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, function1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref.FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Ref.FloatRef floatRef, float f2, AnimationSpec<Float> animationSpec, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$previous = floatRef;
            this.$zoomFactor = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$previous, this.$zoomFactor, this.$animationSpec, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = Boxing.boxFloat(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previous;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m470transformByd4ec7I$default(transformScope, floatRef.element == 0.0f ? 1.0f : animationScope.getValue().floatValue() / floatRef.element, 0L, 0.0f, 6, null);
                        floatRef.element = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, function1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2, reason: invalid class name and case insensitive filesystem */
    public static final class C02292 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02292(float f2, Continuation<? super C02292> continuation) {
            super(2, continuation);
            this.$degrees = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C02292 c02292 = new C02292(this.$degrees, continuation);
            c02292.L$0 = obj;
            return c02292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((C02292) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.L$0).mo365transformByd4ec7I(1.0f, Offset.INSTANCE.m3567getZeroF1C5BW0(), this.$degrees);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2, reason: invalid class name and case insensitive filesystem */
    public static final class C02302 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        int label;

        public C02302(Continuation<? super C02302> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C02302(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((C02302) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2, reason: invalid class name and case insensitive filesystem */
    public static final class C02312 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02312(float f2, Continuation<? super C02312> continuation) {
            super(2, continuation);
            this.$zoomFactor = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C02312 c02312 = new C02312(this.$zoomFactor, continuation);
            c02312.L$0 = obj;
            return c02312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((C02312) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.L$0).mo365transformByd4ec7I(this.$zoomFactor, Offset.INSTANCE.m3567getZeroF1C5BW0(), 0.0f);
            return Unit.INSTANCE;
        }
    }

    public static final TransformableState TransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> function3) {
        return new DefaultTransformableState(function3);
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m474animatePanByubNVwUQ(TransformableState transformableState, long j2, AnimationSpec<Offset> animationSpec, Continuation<? super Unit> continuation) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = Offset.INSTANCE.m3567getZeroF1C5BW0();
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(longRef, j2, animationSpec, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m475animatePanByubNVwUQ$default(TransformableState transformableState, long j2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m474animatePanByubNVwUQ(transformableState, j2, animationSpec, continuation);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f2, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new AnonymousClass2(new Ref.FloatRef(), f2, animationSpec, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f2, animationSpec, continuation);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f2, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0");
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new AnonymousClass3(floatRef, f2, animationSpec, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f2, animationSpec, continuation);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m476panByd4ec7I(TransformableState transformableState, long j2, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j2, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    public static final TransformableState rememberTransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> function3, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i2, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function3, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = TransformableState(new Function3<Float, Offset, Float, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f2, Offset offset, Float f3) {
                    m477invoked4ec7I(f2.floatValue(), offset.getPackedValue(), f3.floatValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m477invoked4ec7I(float f2, long j2, float f3) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f2), Offset.m3540boximpl(j2), Float.valueOf(f3));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState;
    }

    public static final Object rotateBy(TransformableState transformableState, float f2, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C02292(f2, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, Continuation<? super Unit> continuation) {
        Object objTransform = transformableState.transform(mutatePriority, new C02302(null), continuation);
        return objTransform == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform : Unit.INSTANCE;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, continuation);
    }

    public static final Object zoomBy(TransformableState transformableState, float f2, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C02312(f2, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }
}
