package kotlinx.coroutines.stream;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StreamFlow<T> implements Flow<T> {
    private static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed");

    @Volatile
    private volatile int consumed = 0;
    private final Stream<T> stream;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {26}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StreamFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StreamFlow<T> streamFlow, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = streamFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public StreamFlow(Stream<T> stream) {
        this.stream = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.stream.StreamFlow.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = (kotlinx.coroutines.stream.StreamFlow.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.stream.StreamFlow r4 = (kotlinx.coroutines.stream.StreamFlow) r4
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            r7 = r2
            goto L56
        L36:
            r6 = move-exception
            goto L79
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = kotlinx.coroutines.stream.StreamFlow.consumed$FU
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto L7f
            java.util.stream.Stream<T> r7 = r5.stream     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L77
            r4 = r7
            r7 = r6
            r6 = r4
            r4 = r5
        L56:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L36
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r7.emit(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L56
            return r1
        L6f:
            java.util.stream.Stream<T> r6 = r4.stream
            r6.close()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L77:
            r6 = move-exception
            r4 = r5
        L79:
            java.util.stream.Stream<T> r7 = r4.stream
            r7.close()
            throw r6
        L7f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Stream.consumeAsFlow can be collected only once"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
