package kotlinx.coroutines.internal;

import B.ThreadFactoryC0124a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J,\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R#\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", "index", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile long _state;
    private final AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");
    private static final AtomicLongFieldUpdater _state$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int addFailReason(long j2) {
            return (j2 & LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j2, int i2) {
            return wo(j2, LockFreeTaskQueueCore.HEAD_MASK) | i2;
        }

        public final long updateTail(long j2, int i2) {
            return wo(j2, LockFreeTaskQueueCore.TAIL_MASK) | (i2 << 30);
        }

        public final <T> T withState(long j2, Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (LockFreeTaskQueueCore.HEAD_MASK & j2)), Integer.valueOf((int) ((j2 & LockFreeTaskQueueCore.TAIL_MASK) >> 30)));
        }

        public final long wo(long j2, long j3) {
            return j2 & (~j3);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Placeholder {
        public final int index;

        public Placeholder(int i2) {
            this.index = i2;
        }
    }

    public LockFreeTaskQueueCore(int i2, boolean z) {
        this.capacity = i2;
        this.singleConsumer = z;
        int i3 = i2 - 1;
        this.mask = i3;
        this.array = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long state) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i2 = (int) (HEAD_MASK & state);
        int i3 = (int) ((TAIL_MASK & state) >> 30);
        while (true) {
            int i4 = this.mask;
            if ((i2 & i4) == (i3 & i4)) {
                _state$FU.set(lockFreeTaskQueueCore, INSTANCE.wo(state, FROZEN_MASK));
                return lockFreeTaskQueueCore;
            }
            Object placeholder = this.array.get(i4 & i2);
            if (placeholder == null) {
                placeholder = new Placeholder(i2);
            }
            lockFreeTaskQueueCore.array.set(lockFreeTaskQueueCore.mask & i2, placeholder);
            i2++;
        }
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$FU;
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreAllocateNextCopy = allocateNextCopy(state);
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, lockFreeTaskQueueCoreAllocateNextCopy) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int index, E element) {
        Object obj = this.array.get(this.mask & index);
        if (!(obj instanceof Placeholder) || ((Placeholder) obj).index != index) {
            return null;
        }
        this.array.set(index & this.mask, element);
        return this;
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final long markFrozen() {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & FROZEN_MASK) != 0) {
                return j2;
            }
            j3 = FROZEN_MASK | j2;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        return j3;
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        long j2;
        int i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            i2 = (int) (HEAD_MASK & j2);
            if ((FROZEN_MASK & j2) != 0) {
                return next();
            }
        } while (!_state$FU.compareAndSet(this, j2, INSTANCE.updateHead(j2, newHead)));
        this.array.set(this.mask & i2, null);
        return null;
    }

    private final void update$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1, Object obj) {
        while (true) {
            long j2 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j2, function1.invoke(Long.valueOf(j2)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final long updateAndGet$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1, Object obj) {
        while (true) {
            long j2 = atomicLongFieldUpdater.get(obj);
            Long lInvoke = function1.invoke(Long.valueOf(j2));
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j2, lInvoke.longValue())) {
                return lInvoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int addLast(E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r13 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE
            int r13 = r13.addFailReason(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.mask
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.singleConsumer
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.array
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.capacity
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE
            long r5 = r5.updateTail(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.array
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r2
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r3 = r1.get(r0)
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 & r5
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.fillPlaceholder(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueueCore.addLast(java.lang.Object):int");
    }

    public final boolean close() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, CLOSED_MASK | j2));
        return true;
    }

    public final int getSize() {
        long j2 = _state$FU.get(this);
        return (((int) ((j2 & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j2))) & MAX_CAPACITY_MASK;
    }

    public final boolean isClosed() {
        return (_state$FU.get(this) & CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j2 = _state$FU.get(this);
        return ((int) (HEAD_MASK & j2)) == ((int) ((j2 & TAIL_MASK) >> 30));
    }

    public final <R> List<R> map(Function1<? super E, ? extends R> transform) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j2 = _state$FU.get(this);
        int i2 = (int) (HEAD_MASK & j2);
        int i3 = (int) ((j2 & TAIL_MASK) >> 30);
        while (true) {
            int i4 = this.mask;
            if ((i2 & i4) == (i3 & i4)) {
                return arrayList;
            }
            ThreadFactoryC0124a threadFactoryC0124a = (Object) this.array.get(i4 & i2);
            if (threadFactoryC0124a != null && !(threadFactoryC0124a instanceof Placeholder)) {
                arrayList.add(transform.invoke(threadFactoryC0124a));
            }
            i2++;
        }
    }

    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK & j2) != 0) {
                return REMOVE_FROZEN;
            }
            int i2 = (int) (HEAD_MASK & j2);
            int i3 = (int) ((TAIL_MASK & j2) >> 30);
            int i4 = this.mask;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.array.get(i4 & i2);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i5 = (i2 + 1) & MAX_CAPACITY_MASK;
                if (_state$FU.compareAndSet(this, j2, INSTANCE.updateHead(j2, i5))) {
                    this.array.set(this.mask & i2, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreRemoveSlowPath = this;
                    do {
                        lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i2, i5);
                    } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                    return obj;
                }
            }
        }
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }
}
