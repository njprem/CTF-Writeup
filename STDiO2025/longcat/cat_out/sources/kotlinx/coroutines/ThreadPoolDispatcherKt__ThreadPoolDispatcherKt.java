package kotlinx.coroutines;

import J.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
/* loaded from: classes2.dex */
final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i2, final String str) {
        if (i2 < 1) {
            throw new IllegalArgumentException(d.l(i2, "Expected at least one thread, but ", " specified").toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return ExecutorsKt.from((ExecutorService) Executors.newScheduledThreadPool(i2, new ThreadFactory() { // from class: kotlinx.coroutines.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(i2, str, atomicInteger, runnable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(int i2, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i2 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
