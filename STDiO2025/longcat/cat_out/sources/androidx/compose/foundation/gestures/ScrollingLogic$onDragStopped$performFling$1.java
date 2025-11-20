package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {745, 748, 751}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m461invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m461invokesFctU(long j2, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m6461boximpl(j2), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1d
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r2
            r3 = r0
            r0 = r14
            goto L88
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            r0 = r14
            goto L68
        L2e:
            long r3 = r13.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            r0 = r14
            goto L4c
        L35:
            kotlin.ResultKt.throwOnFailure(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.m4869dispatchPreFlingQWom1Mo(r7, r13)
            if (r0 != r6) goto L4b
            goto L87
        L4b:
            r3 = r7
        L4c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.getPackedValue()
            long r7 = androidx.compose.ui.unit.Velocity.m6473minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m454doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L65
            goto L87
        L65:
            r11 = r7
            r7 = r3
            r2 = r11
        L68:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.getPackedValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            long r2 = androidx.compose.ui.unit.Velocity.m6473minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.m4867dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L88
        L87:
            return r6
        L88:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.getPackedValue()
            long r0 = androidx.compose.ui.unit.Velocity.m6473minusAH228Gc(r3, r0)
            long r0 = androidx.compose.ui.unit.Velocity.m6473minusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6461boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
