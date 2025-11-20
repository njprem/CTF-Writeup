package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0010$\u001a\u00060\tj\u0002`%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+J$\u0010,\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002J\u000e\u0010-\u001a\u00020\u0018*\u0004\u0018\u00010\u0007H\u0002R\t\u0010\u0003\u001a\u00020\u0004X\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\t\u0010\f\u001a\u00020\u0004X\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0004X\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006."}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "blockingTasksInBuffer", "Lkotlinx/atomicfu/AtomicInt;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize", "()I", "consumerIndex", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "size", "getSize$kotlinx_coroutines_core", "add", "task", "fair", "", "addLast", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "poll", "pollBlocking", "pollBuffer", "pollCpu", "pollTo", "queue", "pollWithExclusiveMode", "onlyBlocking", "stealWithExclusiveMode", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryExtractFromTheMiddle", "index", "trySteal", "", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "tryStealLastScheduled", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WorkQueue {

    @Volatile
    private volatile int blockingTasksInBuffer;
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);

    @Volatile
    private volatile int consumerIndex;

    @Volatile
    private volatile Object lastScheduledTask;

    @Volatile
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater lastScheduledTask$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater producerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater consumerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    public static /* synthetic */ Task add$default(WorkQueue workQueue, Task task, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return workQueue.add(task, z);
    }

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        int i2 = producerIndex$FU.get(this) & WorkQueueKt.MASK;
        while (this.buffer.get(i2) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i2, task);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task == null || task.taskContext.getTaskMode() != 1) {
            return;
        }
        blockingTasksInBuffer$FU.decrementAndGet(this);
    }

    private final int getBufferSize() {
        return producerIndex$FU.get(this) - consumerIndex$FU.get(this);
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$FU;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - producerIndex$FU.get(this) == 0) {
                return null;
            }
            int i3 = i2 & WorkQueueKt.MASK;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (andSet = this.buffer.getAndSet(i3, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(GlobalQueue queue) {
        Task taskPollBuffer = pollBuffer();
        if (taskPollBuffer == null) {
            return false;
        }
        queue.addLast(taskPollBuffer);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r0 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU.get(r5);
        r1 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r6 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU.get(r5) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r1 = r1 - 1;
        r3 = tryExtractFromTheMiddle(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.scheduling.Task pollWithExclusiveMode(boolean r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.scheduling.Task r1 = (kotlinx.coroutines.scheduling.Task) r1
            r2 = 0
            if (r1 != 0) goto Lc
            goto L27
        Lc:
            kotlinx.coroutines.scheduling.TaskContext r3 = r1.taskContext
            int r3 = r3.getTaskMode()
            r4 = 1
            if (r3 != r4) goto L16
            goto L17
        L16:
            r4 = 0
        L17:
            if (r4 != r6) goto L27
        L19:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L20
            return r1
        L20:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L19
            goto L0
        L27:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU
            int r0 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            int r1 = r1.get(r5)
        L33:
            if (r0 == r1) goto L49
            if (r6 == 0) goto L40
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            int r3 = r3.get(r5)
            if (r3 != 0) goto L40
            return r2
        L40:
            int r1 = r1 + (-1)
            kotlinx.coroutines.scheduling.Task r3 = r5.tryExtractFromTheMiddle(r1, r6)
            if (r3 == 0) goto L33
            return r3
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.WorkQueue.pollWithExclusiveMode(boolean):kotlinx.coroutines.scheduling.Task");
    }

    private final Task stealWithExclusiveMode(int stealingMode) {
        int i2 = consumerIndex$FU.get(this);
        int i3 = producerIndex$FU.get(this);
        boolean z = stealingMode == 1;
        while (i2 != i3) {
            if (z && blockingTasksInBuffer$FU.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i2, z);
            if (taskTryExtractFromTheMiddle != null) {
                return taskTryExtractFromTheMiddle;
            }
            i2 = i4;
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int index, boolean onlyBlocking) {
        int i2 = index & WorkQueueKt.MASK;
        Task task = this.buffer.get(i2);
        if (task != null) {
            if ((task.taskContext.getTaskMode() == 1) == onlyBlocking) {
                AtomicReferenceArray<Task> atomicReferenceArray = this.buffer;
                while (!atomicReferenceArray.compareAndSet(i2, task, null)) {
                    if (atomicReferenceArray.get(i2) != task) {
                    }
                }
                if (onlyBlocking) {
                    blockingTasksInBuffer$FU.decrementAndGet(this);
                }
                return task;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int stealingMode, Ref.ObjectRef<Task> stolenTaskRef) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lastScheduledTask$FU;
            ?? r1 = (Task) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.taskContext.getTaskMode() != 1 ? 2 : 1) & stealingMode) == 0) {
                return -2L;
            }
            long jNanoTime = TasksKt.schedulerTimeSource.nanoTime() - r1.submissionTime;
            long j2 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, r1, null)) {
                if (atomicReferenceFieldUpdater.get(this) != r1) {
                    break;
                }
            }
            stolenTaskRef.element = r1;
            return -1L;
        }
    }

    public final Task add(Task task, boolean fair) {
        if (fair) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (pollTo(globalQueue)) {
        }
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int stealingMode, Ref.ObjectRef<Task> stolenTaskRef) {
        T tPollBuffer = stealingMode == 3 ? pollBuffer() : stealWithExclusiveMode(stealingMode);
        if (tPollBuffer == 0) {
            return tryStealLastScheduled(stealingMode, stolenTaskRef);
        }
        stolenTaskRef.element = tPollBuffer;
        return -1L;
    }
}
