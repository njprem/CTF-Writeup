package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j.C0644J;
import j.T;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a[\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0010\u001a>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u0000*\u00020\u00112\u001d\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a(\u0010\u001b\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u001aF\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\"\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b#\u0010$\u001a(\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b#\u0010\u001c\u001a0\u0010%\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0087@¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)\u001aH\u00100\u001a\u00020\u0014\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\"\u0010/\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140.\u0012\u0006\u0012\u0004\u0018\u00010\u00110-H\u0082@¢\u0006\u0004\b0\u00101\u001a\u001b\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b3\u00104\u001a\u001f\u00107\u001a\u00020\u001d\"\u0004\b\u0000\u00105*\b\u0012\u0004\u0012\u00028\u000006H\u0002¢\u0006\u0004\b7\u00108\u001a\u001f\u00109\u001a\u00020\u001d\"\u0004\b\u0000\u00105*\b\u0012\u0004\u0012\u00028\u000006H\u0002¢\u0006\u0004\b9\u00108\u001a\u001e\u0010<\u001a\u00020\u00142\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0+H\u0082\b¢\u0006\u0004\b<\u0010=\" \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "", "reverseDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "startDragImmediately", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Z)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Z)Landroidx/compose/ui/Modifier;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableAnchors;", "targetValue", "snapTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "velocity", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchoredDragScope", "anchors", "latestTarget", "animateTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLandroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToWithDecay", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "target", "coerceToTarget", "(FF)F", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "restartable", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/MapDraggableAnchors;", "emptyDraggableAnchors", "()Landroidx/compose/foundation/gestures/MapDraggableAnchors;", "K", "Lj/T;", "minValueOrNaN", "(Lj/T;)F", "maxValueOrNaN", "", "generateMsg", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "AlwaysDrag", "Lkotlin/jvm/functions/Function1;", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    private static final Function1<PointerInputChange, Boolean> AlwaysDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };
    private static final boolean DEBUG = false;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1022}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4, reason: invalid class name */
    public static final class AnonymousClass4<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass4> continuation) {
            super(4, continuation);
            this.$this_animateTo = anchoredDraggableState;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_animateTo, continuation);
            anonymousClass4.L$0 = anchoredDragScope;
            anonymousClass4.L$1 = draggableAnchors;
            anonymousClass4.L$2 = t;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
                float lastVelocity = anchoredDraggableState.getLastVelocity();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnchoredDraggableKt.animateTo(anchoredDraggableState, lastVelocity, anchoredDragScope, draggableAnchors, obj2, this) == coroutine_suspended) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1049}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1059, 1077, 1092}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.FloatRef $remainingVelocity;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnchoredDraggableState<T> anchoredDraggableState, float f2, Ref.FloatRef floatRef, Continuation<? super AnonymousClass2> continuation) {
            super(4, continuation);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f2;
            this.$remainingVelocity = floatRef;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_animateToWithDecay, this.$velocity, this.$remainingVelocity, continuation);
            anonymousClass2.L$0 = anchoredDragScope;
            anonymousClass2.L$1 = draggableAnchors;
            anonymousClass2.L$2 = t;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        
            if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r1, r3, false, r3, r23, 2, null) == r7) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r15, r0, r4, r8, r23) == r7) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r12, r0, r4, r8, r23) == r7) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {1116}, m = "restartable", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01951<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01951(Continuation<? super C01951> continuation) {
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
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1119}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    public static final class C01962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1125}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            public static final class C00142 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00142(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i2, CoroutineScope coroutineScope, Continuation<? super C00142> continuation) {
                    super(2, continuation);
                    this.$block = function2;
                    this.$latestInputs = i2;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00142(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation);
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
                    return ((C00142) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
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
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C01962.AnonymousClass1) r0
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
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
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
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C01962.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01962(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C01962> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C01962 c01962 = new C01962(this.$inputs, this.$block, continuation);
            c01962.L$0 = obj;
            return c01962;
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
            return ((C01962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    public static final class C01972<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C01972(Continuation<? super C01972> continuation) {
            super(4, continuation);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            C01972 c01972 = new C01972(continuation);
            c01972.L$0 = anchoredDragScope;
            c01972.L$1 = draggableAnchors;
            c01972.L$2 = t;
            return c01972.invokeSuspend(Unit.INSTANCE);
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
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, Boolean.valueOf(z), mutableInteractionSource, z3, overscrollEffect));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, z, orientation, z2, (i2 & 16) != 0 ? null : mutableInteractionSource, (i2 & 32) != 0 ? null : overscrollEffect, (i2 & 64) != 0 ? anchoredDraggableState.isAnimationRunning() : z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f2, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(fPositionOf)) {
            float f3 = floatRef.element;
            if (f3 != fPositionOf && (objAnimate = SuspendAnimationKt.animate(f3, fPositionOf, f2, anchoredDraggableState.getSnapAnimationSpec(), new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Float f4, Float f5) {
                    invoke(f4.floatValue(), f5.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f4, float f5) {
                    anchoredDragScope.dragTo(f4, f5);
                    floatRef.element = f4;
                }
            }, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objAnimate;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState<T> r8, T r9, float r10, kotlin.coroutines.Continuation<? super java.lang.Float> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            float r10 = r5.F$0
            java.lang.Object r8 = r5.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L5c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.jvm.internal.Ref$FloatRef r11 = new kotlin.jvm.internal.Ref$FloatRef
            r11.<init>()
            r11.element = r10
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r1 = 0
            r4.<init>(r8, r10, r11, r1)
            r5.L$0 = r11
            r5.F$0 = r10
            r5.label = r2
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L5b
            return r0
        L5b:
            r8 = r11
        L5c:
            float r8 = r8.element
            float r10 = r10 - r8
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? RangesKt.coerceAtMost(f2, f3) : RangesKt.coerceAtLeast(f2, f3);
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(new C0644J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K> float maxValueOrNaN(T t) {
        if (t.f764e == 1) {
            return Float.NaN;
        }
        float[] fArr = t.f762c;
        long[] jArr = t.f760a;
        int length = jArr.length - 2;
        float f2 = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            float f3 = fArr[(i2 << 3) + i4];
                            if (f3 >= f2) {
                                f2 = f3;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return f2;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K> float minValueOrNaN(T t) {
        if (t.f764e == 1) {
            return Float.NaN;
        }
        float[] fArr = t.f762c;
        long[] jArr = t.f760a;
        int length = jArr.length - 2;
        float f2 = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            float f3 = fArr[(i2 << 3) + i4];
                            if (f3 <= f2) {
                                f2 = f3;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return f2;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(kotlin.jvm.functions.Function0<? extends I> r4, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C01951
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C01951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new C01972(null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        MutableInteractionSource mutableInteractionSource2 = (i2 & 8) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i2 & 16) != 0 ? null : overscrollEffect;
        if ((i2 & 32) != 0) {
            z2 = anchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z3, mutableInteractionSource2, overscrollEffect2, z2);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, z2, overscrollEffect));
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnonymousClass4(anchoredDraggableState, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }
}
