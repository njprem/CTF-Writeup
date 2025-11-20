package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt", "kotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThreadPoolDispatcherKt {
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int i2, String str) {
        return ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext(i2, str);
    }

    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String str) {
        return ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(str);
    }
}
