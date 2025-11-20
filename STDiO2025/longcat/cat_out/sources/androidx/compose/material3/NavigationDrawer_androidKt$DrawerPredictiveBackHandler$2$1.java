package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import b.C0599b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lb/b;", "Lkotlin/jvm/JvmSuppressWildcards;", "progress", "", "<anonymous>", "(Lkotlinx/coroutines/flow/Flow;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.android.kt", i = {}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT, 86, 86, 86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements Function2<Flow<C0599b>, Continuation<? super Unit>, Object> {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref.FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref.FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref.FloatRef $maxScaleYDistance;
    final /* synthetic */ CoroutineScope $scope;
    /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.android.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DrawerPredictiveBackState drawerPredictiveBackState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$drawerPredictiveBackState = drawerPredictiveBackState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$drawerPredictiveBackState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                float scaleXDistance = this.$drawerPredictiveBackState.getScaleXDistance();
                final DrawerPredictiveBackState drawerPredictiveBackState = this.$drawerPredictiveBackState;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.2.1.2.1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                        invoke(f2.floatValue(), f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2, float f3) {
                        drawerPredictiveBackState.setScaleXDistance(f2);
                    }
                };
                this.label = 1;
                anonymousClass2 = this;
                if (SuspendAnimationKt.animate$default(scaleXDistance, 0.0f, 0.0f, null, function2, anonymousClass2, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                anonymousClass2 = this;
            }
            anonymousClass2.$drawerPredictiveBackState.clear();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, CoroutineScope coroutineScope, DrawerState drawerState, boolean z, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.FloatRef floatRef3, Continuation<? super NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1> continuation) {
        super(2, continuation);
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
        this.$scope = coroutineScope;
        this.$drawerState = drawerState;
        this.$isRtl = z;
        this.$maxScaleXDistanceGrow = floatRef;
        this.$maxScaleXDistanceShrink = floatRef2;
        this.$maxScaleYDistance = floatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, continuation);
        navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r14.close(r13) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r14.close(r13) != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L32
            if (r0 == r5) goto L2b
            if (r0 == r4) goto L26
            if (r0 == r3) goto L26
            if (r0 == r2) goto L1d
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            java.lang.Object r0 = r13.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lc4
        L26:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L9c
        L2b:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            goto L51
        L2f:
            r0 = move-exception
            r14 = r0
            goto L9f
        L32:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.flow.Flow r14 = (kotlinx.coroutines.flow.Flow) r14
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$1 r7 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$1     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            androidx.compose.material3.DrawerPredictiveBackState r8 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            boolean r9 = r13.$isRtl     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Ref$FloatRef r10 = r13.$maxScaleXDistanceGrow     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Ref$FloatRef r11 = r13.$maxScaleXDistanceShrink     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Ref$FloatRef r12 = r13.$maxScaleYDistance     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            r7.<init>()     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            r13.label = r5     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            java.lang.Object r14 = r14.collect(r7, r13)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            if (r14 != r1) goto L51
            goto Lc3
        L51:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L69
            kotlinx.coroutines.CoroutineScope r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
        L69:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r4
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L9c
            goto Lc3
        L74:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2f
            r14.clear()     // Catch: java.lang.Throwable -> L2f
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L91
            kotlinx.coroutines.CoroutineScope r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
        L91:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r3
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L9c
            goto Lc3
        L9c:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L9f:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto Lb7
            kotlinx.coroutines.CoroutineScope r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
        Lb7:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.L$0 = r0
            r13.label = r2
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Flow<C0599b> flow, Continuation<? super Unit> continuation) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create(flow, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
