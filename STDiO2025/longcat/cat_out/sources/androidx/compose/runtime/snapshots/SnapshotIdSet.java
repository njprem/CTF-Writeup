package androidx.compose.runtime.snapshots;

import J.d;
import androidx.compose.animation.core.AnimationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J:\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002'\u0010\u0011\u001a#\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0012H\u0086\bJ\u001d\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0002J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096\u0002J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "and", "bits", "andNot", "clear", "bit", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, AnimationConstants.DefaultDurationMillis, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.yield(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            if (r13.yield(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:42:0x00f1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SnapshotIdSet(long j2, long j3, int i2, int[] iArr) {
        this.upperSet = j2;
        this.lowerSet = j3;
        this.lowerBound = i2;
        this.belowBound = iArr;
    }

    public final SnapshotIdSet and(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.areEqual(bits, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        int i2 = bits.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j2 = this.upperSet;
                long j3 = bits.upperSet;
                long j4 = j2 & j3;
                long j5 = this.lowerSet;
                long j6 = bits.lowerSet;
                return (j4 == 0 && (j5 & j6) == 0 && iArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j2 & j3, j5 & j6, i3, iArr2);
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        int i4 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    if (bits.get(i5)) {
                        snapshotIdSet2 = snapshotIdSet2.set(i5);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
            if (this.lowerSet != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    if ((this.lowerSet & (1 << i6)) != 0) {
                        int i7 = this.lowerBound + i6;
                        if (bits.get(i7)) {
                            snapshotIdSet3 = snapshotIdSet3.set(i7);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i4 < 64) {
                    if ((this.upperSet & (1 << i4)) != 0) {
                        int i8 = this.lowerBound + i4 + 64;
                        if (bits.get(i8)) {
                            snapshotIdSet3 = snapshotIdSet3.set(i8);
                        }
                    }
                    i4++;
                }
            }
            return snapshotIdSet3;
        }
        int[] iArr4 = bits.belowBound;
        if (iArr4 != null) {
            for (int i9 : iArr4) {
                if (get(i9)) {
                    snapshotIdSet2 = snapshotIdSet2.set(i9);
                }
            }
        }
        SnapshotIdSet snapshotIdSet4 = snapshotIdSet2;
        if (bits.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((bits.lowerSet & (1 << i10)) != 0) {
                    int i11 = bits.lowerBound + i10;
                    if (get(i11)) {
                        snapshotIdSet4 = snapshotIdSet4.set(i11);
                    }
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i4 < 64) {
                if ((bits.upperSet & (1 << i4)) != 0) {
                    int i12 = bits.lowerBound + i4 + 64;
                    if (get(i12)) {
                        snapshotIdSet4 = snapshotIdSet4.set(i12);
                    }
                }
                i4++;
            }
        }
        return snapshotIdSet4;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i2 = bits.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i3, iArr2);
            }
        }
        int[] iArr3 = bits.belowBound;
        if (iArr3 != null) {
            snapshotIdSetClear = this;
            for (int i4 : iArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(i4);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (bits.lowerSet != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((bits.lowerSet & (1 << i5)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(bits.lowerBound + i5);
                }
            }
        }
        if (bits.upperSet != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if ((bits.upperSet & (1 << i6)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(bits.lowerBound + i6 + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    public final SnapshotIdSet clear(int bit) {
        int[] iArr;
        int iBinarySearch;
        int i2 = this.lowerBound;
        int i3 = bit - i2;
        if (i3 >= 0 && i3 < 64) {
            long j2 = 1 << i3;
            long j3 = this.lowerSet;
            if ((j3 & j2) != 0) {
                return new SnapshotIdSet(this.upperSet, (~j2) & j3, i2, this.belowBound);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j4 = 1 << (i3 - 64);
            long j5 = this.upperSet;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet((~j4) & j5, this.lowerSet, i2, this.belowBound);
            }
        } else if (i3 < 0 && (iArr = this.belowBound) != null && (iBinarySearch = SnapshotIdSetKt.binarySearch(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i4];
            if (iBinarySearch > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, iBinarySearch);
            }
            if (iBinarySearch < i4) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, iBinarySearch, iBinarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Integer, SnapshotIdSet> operation) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i2 : iArr) {
                initial = operation.invoke(initial, Integer.valueOf(i2));
            }
        }
        if (this.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.lowerSet & (1 << i3)) != 0) {
                    initial = operation.invoke(initial, Integer.valueOf(this.lowerBound + i3));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((this.upperSet & (1 << i4)) != 0) {
                    initial = operation.invoke(initial, Integer.valueOf(this.lowerBound + i4 + 64));
                }
            }
        }
        return initial;
    }

    public final void fastForEach(Function1<? super Integer, Unit> block) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i2 : iArr) {
                block.invoke(Integer.valueOf(i2));
            }
        }
        if (this.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.lowerSet & (1 << i3)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i3));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((this.upperSet & (1 << i4)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i4 + 64));
                }
            }
        }
    }

    public final boolean get(int bit) {
        int[] iArr;
        int i2 = bit - this.lowerBound;
        return (i2 < 0 || i2 >= 64) ? (i2 < 64 || i2 >= 128) ? i2 <= 0 && (iArr = this.belowBound) != null && SnapshotIdSetKt.binarySearch(iArr, bit) >= 0 : ((1 << (i2 - 64)) & this.upperSet) != 0 : ((1 << i2) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return SequencesKt.sequence(new AnonymousClass1(null)).iterator();
    }

    public final int lowest(int i2) {
        int i3;
        int iNumberOfTrailingZeros;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j2 = this.lowerSet;
        if (j2 != 0) {
            i3 = this.lowerBound;
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        } else {
            long j3 = this.upperSet;
            if (j3 == 0) {
                return i2;
            }
            i3 = this.lowerBound + 64;
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        }
        return iNumberOfTrailingZeros + i3;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        int i2 = bits.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i3, iArr2);
            }
        }
        int i4 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    bits = bits.set(i5);
                }
            }
            if (this.lowerSet != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    if ((this.lowerSet & (1 << i6)) != 0) {
                        bits = bits.set(this.lowerBound + i6);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i4 < 64) {
                    if ((this.upperSet & (1 << i4)) != 0) {
                        bits = bits.set(this.lowerBound + i4 + 64);
                    }
                    i4++;
                }
            }
            return bits;
        }
        int[] iArr4 = bits.belowBound;
        if (iArr4 != null) {
            snapshotIdSet = this;
            for (int i7 : iArr4) {
                snapshotIdSet = snapshotIdSet.set(i7);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if ((bits.lowerSet & (1 << i8)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i8);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i4 < 64) {
                if ((bits.upperSet & (1 << i4)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i4 + 64);
                }
                i4++;
            }
        }
        return snapshotIdSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[PHI: r9
      0x0084: PHI (r9v5 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v7 java.util.ArrayList) binds: [B:24:0x0063, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.SnapshotIdSet set(int r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.set(int):androidx.compose.runtime.snapshots.SnapshotIdSet");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        return d.p(sb, ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), ']');
    }
}
