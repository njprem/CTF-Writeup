package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import b.C0599b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lb/b;", "Lkotlin/jvm/JvmSuppressWildcards;", "progress", "", "<anonymous>", "(Lkotlinx/coroutines/flow/Flow;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", f = "SearchBar.android.kt", i = {}, l = {ComposerKt.compositionLocalMapKey}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$2$1 extends SuspendLambda implements Function2<Flow<C0599b>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<C0599b> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<C0599b> $firstBackEvent;
    final /* synthetic */ MutatorMutex $mutatorMutex;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", f = "SearchBar.android.kt", i = {}, l = {205, 216}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
        final /* synthetic */ MutableState<C0599b> $currentBackEvent;
        final /* synthetic */ MutableFloatState $finalBackProgress;
        final /* synthetic */ MutableState<C0599b> $firstBackEvent;
        final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
        final /* synthetic */ Flow<C0599b> $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(MutableFloatState mutableFloatState, Flow<C0599b> flow, Animatable<Float, AnimationVector1D> animatable, Function1<? super Boolean, Unit> function1, MutableState<C0599b> mutableState, MutableState<C0599b> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$finalBackProgress = mutableFloatState;
            this.$progress = flow;
            this.$animationProgress = animatable;
            this.$onExpandedChange = function1;
            this.$firstBackEvent = mutableState;
            this.$currentBackEvent = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r9, 12, null) != r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 2143289344(0x7fc00000, float:NaN)
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                kotlin.ResultKt.throwOnFailure(r13)
                r9 = r12
                goto L78
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.util.concurrent.CancellationException -> L5d
                goto L40
            L21:
                kotlin.ResultKt.throwOnFailure(r13)
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.setFloatValue(r2)     // Catch: java.util.concurrent.CancellationException -> L5d
                kotlinx.coroutines.flow.Flow<b.b> r13 = r12.$progress     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1$1 r1 = new androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1$1     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.runtime.MutableState<b.b> r5 = r12.$firstBackEvent     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.runtime.MutableState<b.b> r6 = r12.$currentBackEvent     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7 = r12.$animationProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                r1.<init>()     // Catch: java.util.concurrent.CancellationException -> L5d
                r12.label = r4     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r13 = r13.collect(r1, r12)     // Catch: java.util.concurrent.CancellationException -> L5d
                if (r13 != r0) goto L40
                r9 = r12
                goto L77
            L40:
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r1 = r12.$animationProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r1 = r1.getValue()     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.util.concurrent.CancellationException -> L5d
                float r1 = r1.floatValue()     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.setFloatValue(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r13 = r12.$onExpandedChange     // Catch: java.util.concurrent.CancellationException -> L5d
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.invoke(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                r9 = r12
                goto L88
            L5d:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r13)
                androidx.compose.animation.core.FiniteAnimationSpec r6 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p()
                r12.label = r3
                r7 = 0
                r8 = 0
                r10 = 12
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L78
            L77:
                return r0
            L78:
                androidx.compose.runtime.MutableFloatState r13 = r9.$finalBackProgress
                r13.setFloatValue(r2)
                androidx.compose.runtime.MutableState<b.b> r13 = r9.$firstBackEvent
                r0 = 0
                r13.setValue(r0)
                androidx.compose.runtime.MutableState<b.b> r13 = r9.$currentBackEvent
                r13.setValue(r0)
            L88:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$SearchBar$2$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable, Function1<? super Boolean, Unit> function1, MutableState<C0599b> mutableState, MutableState<C0599b> mutableState2, Continuation<? super SearchBar_androidKt$SearchBar$2$1> continuation) {
        super(2, continuation);
        this.$mutatorMutex = mutatorMutex;
        this.$finalBackProgress = mutableFloatState;
        this.$animationProgress = animatable;
        this.$onExpandedChange = function1;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, continuation);
        searchBar_androidKt$SearchBar$2$1.L$0 = obj;
        return searchBar_androidKt$SearchBar$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = (Flow) this.L$0;
            MutatorMutex mutatorMutex = this.$mutatorMutex;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$finalBackProgress, flow, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, anonymousClass1, this, 1, null) == coroutine_suspended) {
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
    public final Object invoke(Flow<C0599b> flow, Continuation<? super Unit> continuation) {
        return ((SearchBar_androidKt$SearchBar$2$1) create(flow, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
