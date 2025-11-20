package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import j.C0645K;
import j.U;
import j.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "", "key", "", "getIndex", "(Ljava/lang/Object;)I", "index", "getKey", "(I)Ljava/lang/Object;", "Lj/U;", "map", "Lj/U;", "", "keys", "[Ljava/lang/Object;", "keysStartIndex", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 8;
    private final Object[] keys;
    private final int keysStartIndex;
    private final U map;

    public NearestRangeKeyIndexMap(IntRange intRange, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        IntervalList<Interval> intervals = lazyLayoutIntervalContent.getIntervals();
        final int first = intRange.getFirst();
        if (first < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        final int iMin = Math.min(intRange.getLast(), intervals.getSize() - 1);
        if (iMin < first) {
            C0645K c0645k = V.f770a;
            Intrinsics.checkNotNull(c0645k, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.map = c0645k;
            this.keys = new Object[0];
            this.keysStartIndex = 0;
            return;
        }
        int i2 = (iMin - first) + 1;
        this.keys = new Object[i2];
        this.keysStartIndex = first;
        final C0645K c0645k2 = new C0645K(i2);
        intervals.forEach(first, iMin, new Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
                invoke2(interval);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r7.getValue()
                    androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
                    kotlin.jvm.functions.Function1 r0 = r0.getKey()
                    int r1 = r1
                    int r2 = r7.getStartIndex()
                    int r1 = java.lang.Math.max(r1, r2)
                    int r2 = r2
                    int r3 = r7.getStartIndex()
                    int r4 = r7.getSize()
                    int r4 = r4 + r3
                    int r4 = r4 + (-1)
                    int r2 = java.lang.Math.min(r2, r4)
                    if (r1 > r2) goto L57
                L27:
                    if (r0 == 0) goto L39
                    int r3 = r7.getStartIndex()
                    int r3 = r1 - r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r3 = r0.invoke(r3)
                    if (r3 != 0) goto L3d
                L39:
                    java.lang.Object r3 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(r1)
                L3d:
                    j.K r4 = r3
                    r4.g(r1, r3)
                    androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r4
                    java.lang.Object[] r4 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeys$p(r4)
                    androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r5 = r4
                    int r5 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeysStartIndex$p(r5)
                    int r5 = r1 - r5
                    r4[r5] = r3
                    if (r1 == r2) goto L57
                    int r1 = r1 + 1
                    goto L27
                L57:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.invoke2(androidx.compose.foundation.lazy.layout.IntervalList$Interval):void");
            }
        });
        this.map = c0645k2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object key) {
        U u2 = this.map;
        int iA = u2.a(key);
        if (iA >= 0) {
            return u2.f767c[iA];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int index) {
        Object[] objArr = this.keys;
        int i2 = index - this.keysStartIndex;
        if (i2 < 0 || i2 > ArraysKt.getLastIndex(objArr)) {
            return null;
        }
        return objArr[i2];
    }
}
