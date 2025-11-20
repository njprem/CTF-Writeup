package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u00043456B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aJ\u0014\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0016J\u0014\u0010!\u001a\u00020\f2\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0002J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0004J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J\u0018\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\u001c\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00132\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aH\u0004J\u001e\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001700H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010 \u001a\u00020(H\u0002J\b\u00102\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00067"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", "_queue", "", "value", "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueue", "task", "enqueueImpl", "processNextEvent", "rescheduleAllDelayed", "resetAll", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "scheduleImpl", "", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "shutdown", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {

    @Volatile
    private volatile Object _delayed;

    @Volatile
    private volatile int _isCompleted = 0;

    @Volatile
    private volatile Object _queue;
    private static final AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    private static final AtomicIntegerFieldUpdater _isCompleted$FU = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted");

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DelayedResumeTask extends DelayedTask {
        private final CancellableContinuation<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j2);
            this.cont = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(EventLoopImplBase.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DelayedRunnableTask extends DelayedTask {
        private final Runnable block;

        public DelayedRunnableTask(long j2, Runnable runnable) {
            super(j2);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.block;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010%\u001a\u00020&H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "nanoTime", "", "(J)V", "_heap", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {
        private volatile Object _heap;
        private int index = -1;
        public long nanoTime;

        public DelayedTask(long j2) {
            this.nanoTime = j2;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == EventLoop_commonKt.DISPOSED_TASK) {
                        return;
                    }
                    DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                    if (delayedTaskQueue != null) {
                        delayedTaskQueue.remove(this);
                    }
                    this._heap = EventLoop_commonKt.DISPOSED_TASK;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public ThreadSafeHeap<?> getHeap() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        public final int scheduleTask(long now, DelayedTaskQueue delayed, EventLoopImplBase eventLoop) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.DISPOSED_TASK) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        DelayedTask delayedTaskFirstImpl = delayed.firstImpl();
                        if (eventLoop.isCompleted()) {
                            return 1;
                        }
                        if (delayedTaskFirstImpl == null) {
                            delayed.timeNow = now;
                        } else {
                            long j2 = delayedTaskFirstImpl.nanoTime;
                            if (j2 - now < 0) {
                                now = j2;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j3 = this.nanoTime;
                        long j4 = delayed.timeNow;
                        if (j3 - j4 < 0) {
                            this.nanoTime = j4;
                        }
                        delayed.addImpl(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(ThreadSafeHeap<?> threadSafeHeap) {
            if (this._heap == EventLoop_commonKt.DISPOSED_TASK) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int i2) {
            this.index = i2;
        }

        public final boolean timeToExecute(long now) {
            return now - this.nanoTime >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        @Override // java.lang.Comparable
        public int compareTo(DelayedTask other) {
            long j2 = this.nanoTime - other.nanoTime;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long j2) {
            this.timeNow = j2;
        }
    }

    private final void closeQueue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                Symbol symbol = EventLoop_commonKt.CLOSED_EMPTY;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, symbol)) {
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).close();
                return;
            }
            if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                return;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            lockFreeTaskQueueCore.addLast((Runnable) obj);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    private final Runnable dequeue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                return (Runnable) obj;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
            Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
            if (objRemoveFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return (Runnable) objRemoveFirstOrNull;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
            LockFreeTaskQueueCore next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater3.get(this) == obj) {
            }
        }
    }

    private final boolean enqueueImpl(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, task)) {
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore.addLast((Runnable) obj);
                lockFreeTaskQueueCore.addLast(task);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
            int iAddLast = lockFreeTaskQueueCore2.addLast(task);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = _queue$FU;
                LockFreeTaskQueueCore next = lockFreeTaskQueueCore2.next();
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater4.get(this) == obj) {
                }
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return _isCompleted$FU.get(this) != 0;
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void rescheduleAllDelayed() {
        DelayedTask delayedTaskRemoveFirstOrNull;
        AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
        long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
            if (delayedTaskQueue == null || (delayedTaskRemoveFirstOrNull = delayedTaskQueue.removeFirstOrNull()) == null) {
                return;
            } else {
                reschedule(jNanoTime, delayedTaskRemoveFirstOrNull);
            }
        }
    }

    private final int scheduleImpl(long now, DelayedTask delayedTask) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$FU;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue == null) {
            DelayedTaskQueue delayedTaskQueue2 = new DelayedTaskQueue(now);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, delayedTaskQueue2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            Object obj = _delayed$FU.get(this);
            Intrinsics.checkNotNull(obj);
            delayedTaskQueue = (DelayedTaskQueue) obj;
        }
        return delayedTask.scheduleTask(now, delayedTaskQueue, this);
    }

    private final void setCompleted(boolean z) {
        _isCompleted$FU.set(this, z ? 1 : 0);
    }

    private final boolean shouldUnpark(DelayedTask task) {
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        return (delayedTaskQueue != null ? delayedTaskQueue.peek() : null) == task;
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j2, Continuation<? super Unit> continuation) {
        return Delay.DefaultImpls.delay(this, j2, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public final void mo8053dispatch(CoroutineContext context, Runnable block) {
        enqueue(block);
    }

    public void enqueue(Runnable task) {
        if (enqueueImpl(task)) {
            unpark();
        } else {
            DefaultExecutor.INSTANCE.enqueue(task);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public long getNextTime() {
        DelayedTask delayedTaskPeek;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return LongCompanionObject.MAX_VALUE;
                }
                return 0L;
            }
            if (!((LockFreeTaskQueueCore) obj).isEmpty()) {
                return 0L;
            }
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue == null || (delayedTaskPeek = delayedTaskQueue.peek()) == null) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j2 = delayedTaskPeek.nanoTime;
        AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
        return RangesKt.coerceAtLeast(j2 - (timeSource != null ? timeSource.nanoTime() : System.nanoTime()), 0L);
    }

    public DisposableHandle invokeOnTimeout(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.EventLoop
    public boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            return false;
        }
        Object obj = _queue$FU.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof LockFreeTaskQueueCore ? ((LockFreeTaskQueueCore) obj).isEmpty() : obj == EventLoop_commonKt.CLOSED_EMPTY;
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        DelayedTask delayedTaskRemoveAtImpl;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
            do {
                synchronized (delayedTaskQueue) {
                    try {
                        DelayedTask delayedTaskFirstImpl = delayedTaskQueue.firstImpl();
                        if (delayedTaskFirstImpl != null) {
                            DelayedTask delayedTask = delayedTaskFirstImpl;
                            delayedTaskRemoveAtImpl = delayedTask.timeToExecute(jNanoTime) ? enqueueImpl(delayedTask) : false ? delayedTaskQueue.removeAtImpl(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (delayedTaskRemoveAtImpl != null);
        }
        Runnable runnableDequeue = dequeue();
        if (runnableDequeue == null) {
            return getNextTime();
        }
        runnableDequeue.run();
        return 0L;
    }

    public final void resetAll() {
        _queue$FU.set(this, null);
        _delayed$FU.set(this, null);
    }

    public final void schedule(long now, DelayedTask delayedTask) {
        int iScheduleImpl = scheduleImpl(now, delayedTask);
        if (iScheduleImpl == 0) {
            if (shouldUnpark(delayedTask)) {
                unpark();
            }
        } else if (iScheduleImpl == 1) {
            reschedule(now, delayedTask);
        } else if (iScheduleImpl != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final DisposableHandle scheduleInvokeOnTimeout(long timeMillis, Runnable block) {
        long jDelayToNanos = EventLoop_commonKt.delayToNanos(timeMillis);
        if (jDelayToNanos >= DurationKt.MAX_MILLIS) {
            return NonDisposableHandle.INSTANCE;
        }
        AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
        long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
        DelayedRunnableTask delayedRunnableTask = new DelayedRunnableTask(jDelayToNanos + jNanoTime, block);
        schedule(jNanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo8054scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super Unit> continuation) {
        long jDelayToNanos = EventLoop_commonKt.delayToNanos(timeMillis);
        if (jDelayToNanos < DurationKt.MAX_MILLIS) {
            AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(jDelayToNanos + jNanoTime, continuation);
            schedule(jNanoTime, delayedResumeTask);
            CancellableContinuationKt.disposeOnCancellation(continuation, delayedResumeTask);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }
}
