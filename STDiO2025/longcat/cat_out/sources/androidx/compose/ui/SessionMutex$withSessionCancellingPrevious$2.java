package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {66, 68}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> $session;
    final /* synthetic */ Function1<CoroutineScope, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionMutex$withSessionCancellingPrevious$2(Function1<? super CoroutineScope, ? extends T> function1, AtomicReference<SessionMutex.Session<T>> atomicReference, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super SessionMutex$withSessionCancellingPrevious$2> continuation) {
        super(2, continuation);
        this.$sessionInitializer = function1;
        this.$arg0 = atomicReference;
        this.$session = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, continuation);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r7.L$0
            androidx.compose.ui.SessionMutex$Session r0 = (androidx.compose.ui.SessionMutex.Session) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L17
            goto L70
        L17:
            r8 = move-exception
            goto L82
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.SessionMutex$Session r1 = (androidx.compose.ui.SessionMutex.Session) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5e
        L29:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            androidx.compose.ui.SessionMutex$Session r1 = new androidx.compose.ui.SessionMutex$Session
            kotlin.coroutines.CoroutineContext r5 = r8.getCoroutineContext()
            kotlinx.coroutines.Job r5 = kotlinx.coroutines.JobKt.getJob(r5)
            kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, T> r6 = r7.$sessionInitializer
            java.lang.Object r8 = r6.invoke(r8)
            r1.<init>(r5, r8)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r8 = r7.$arg0
            java.lang.Object r8 = r8.getAndSet(r1)
            androidx.compose.ui.SessionMutex$Session r8 = (androidx.compose.ui.SessionMutex.Session) r8
            if (r8 == 0) goto L5e
            kotlinx.coroutines.Job r8 = r8.getJob()
            if (r8 == 0) goto L5e
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.JobKt.cancelAndJoin(r8, r7)
            if (r8 != r0) goto L5e
            goto L6e
        L5e:
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r7.$session     // Catch: java.lang.Throwable -> L80
            java.lang.Object r4 = r1.getValue()     // Catch: java.lang.Throwable -> L80
            r7.L$0 = r1     // Catch: java.lang.Throwable -> L80
            r7.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.invoke(r4, r7)     // Catch: java.lang.Throwable -> L80
            if (r8 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r0 = r1
        L70:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r3 = r7.$arg0
        L72:
            boolean r1 = r3.compareAndSet(r0, r2)
            if (r1 == 0) goto L79
            return r8
        L79:
            java.lang.Object r1 = r3.get()
            if (r1 == r0) goto L72
            return r8
        L80:
            r8 = move-exception
            r0 = r1
        L82:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r1 = r7.$arg0
        L84:
            boolean r3 = r1.compareAndSet(r0, r2)
            if (r3 != 0) goto L91
            java.lang.Object r3 = r1.get()
            if (r3 != r0) goto L91
            goto L84
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
