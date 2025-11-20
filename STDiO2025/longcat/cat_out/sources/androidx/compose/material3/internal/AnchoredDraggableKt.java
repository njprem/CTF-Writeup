package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001d\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0000\u001a\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002H\u0002\u001aF\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0082@¢\u0006\u0002\u0010\u0012\u001aH\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000\u001a0\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u001f\u001a\u0002H\u00022\b\b\u0002\u0010 \u001a\u00020!H\u0080@¢\u0006\u0002\u0010\"\u001ar\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182H\u0010$\u001aD\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\u0004\u0012\u0002H\u00020+0\u0010H\u0000\u001a&\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u001f\u001a\u0002H\u0002H\u0080@¢\u0006\u0002\u0010-¨\u0006."}, d2 = {"DraggableAnchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "T", "", "builder", "Lkotlin/Function1;", "Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "emptyDraggableAnchors", "Landroidx/compose/material3/internal/MapDraggableAnchors;", "restartable", "I", "inputs", "Lkotlin/Function0;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchoredDraggable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "animateTo", "targetValue", "velocity", "", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggableAnchors", "anchors", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "size", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Pair;", "snapTo", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01011(AnchoredDraggableState<T> anchoredDraggableState, float f2, Continuation<? super C01011> continuation) {
                super(2, continuation);
                this.$state = anchoredDraggableState;
                this.$velocity = f2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01011(this.$state, this.$velocity, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                    float f2 = this.$velocity;
                    this.label = 1;
                    if (anchoredDraggableState.settle(f2, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$state = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f2, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f2.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C01011(this.$state, this.F$0, null), 3, null);
            return Unit.INSTANCE;
        }

        public final Object invoke(CoroutineScope coroutineScope, float f2, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
            anonymousClass1.L$0 = coroutineScope;
            anonymousClass1.F$0 = f2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {685}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnchoredDraggableState<T> anchoredDraggableState, float f2, Continuation<? super AnonymousClass2> continuation) {
            super(4, continuation);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f2;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_animateTo, this.$velocity, continuation);
            anonymousClass2.L$0 = anchoredDragScope;
            anonymousClass2.L$1 = draggableAnchors;
            anonymousClass2.L$2 = t;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    floatRef.element = offset;
                    float f2 = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                    Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt.animateTo.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Float f3, Float f4) {
                            invoke(f3.floatValue(), f4.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f3, float f4) {
                            anchoredDragScope.dragTo(f3, f4);
                            floatRef.element = f3;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(offset, fPositionOf, f2, animationSpec, function2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {713}, m = "restartable", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    public static final class C04751<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C04751(Continuation<? super C04751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    public static final class C04762 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {722}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            public static final class C01022 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C01022(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i2, CoroutineScope coroutineScope, Continuation<? super C01022> continuation) {
                    super(2, continuation);
                    this.$block = function2;
                    this.$latestInputs = i2;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01022(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.$block;
                        I i3 = this.$latestInputs;
                        this.label = 1;
                        if (function2.invoke(i3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CoroutineScopeKt.cancel(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.$previousDrag = objectRef;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C04762.AnonymousClass1) r0
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.ResultKt.throwOnFailure(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r9 = r7.$previousDrag
                    T r9 = r9.element
                    kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material3.internal.AnchoredDragFinishedSignal r2 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r9 = r0.$previousDrag
                    kotlinx.coroutines.CoroutineScope r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.$block
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.C04762.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04762(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04762> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04762 c04762 = new C04762(this.$inputs, this.$block, continuation);
            c04762.L$0 = obj;
            return c04762;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, coroutineScope, this.$block);
                this.label = 1;
                if (flowSnapshotFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    public static final class C04772<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C04772(Continuation<? super C04772> continuation) {
            super(4, continuation);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            C04772 c04772 = new C04772(continuation);
            c04772.L$0 = anchoredDragScope;
            c04772.L$1 = draggableAnchors;
            c04772.L$2 = t;
            return c04772.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, continuation);
        }
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3_release());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState(), orientation, z, mutableInteractionSource, anchoredDraggableState.isAnimationRunning(), null, new AnonymousClass1(anchoredDraggableState, null), z2, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z3, z4, mutableInteractionSource);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, float f2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnonymousClass2(anchoredDraggableState, f2, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            f2 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f2, continuation);
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, Function2<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> function2) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, function2, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(MapsKt.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(kotlin.jvm.functions.Function0<? extends I> r4, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt.C04751
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C04751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.restartable(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new C04772(null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }
}
