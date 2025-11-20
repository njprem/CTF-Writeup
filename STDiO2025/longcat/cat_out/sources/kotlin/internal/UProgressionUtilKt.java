package kotlin.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m7703differenceModuloWZ9TVnA(int i2, int i3, int i4) {
        long j2 = i4 & 4294967295L;
        int i5 = (int) ((i2 & 4294967295L) % j2);
        int i6 = (int) ((i3 & 4294967295L) % j2);
        int iCompare = Integer.compare(i5 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i6);
        int iM6593constructorimpl = UInt.m6593constructorimpl(i5 - i6);
        return iCompare >= 0 ? iM6593constructorimpl : UInt.m6593constructorimpl(iM6593constructorimpl + i4);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m7704differenceModulosambcqE(long j2, long j3, long j4) {
        if (j4 < 0) {
            if ((j2 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                j2 -= j4;
            }
        } else if (j2 >= 0) {
            j2 %= j4;
        } else {
            long j5 = j2 - ((((j2 >>> 1) / j4) << 1) * j4);
            j2 = j5 - ((j5 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? j4 : 0L);
        }
        if (j4 < 0) {
            if ((j3 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                j3 -= j4;
            }
        } else if (j3 >= 0) {
            j3 %= j4;
        } else {
            long j6 = j3 - ((((j3 >>> 1) / j4) << 1) * j4);
            j3 = j6 - ((j6 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? j4 : 0L);
        }
        int iCompare = Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
        long jM6672constructorimpl = ULong.m6672constructorimpl(j2 - j3);
        return iCompare >= 0 ? jM6672constructorimpl : ULong.m6672constructorimpl(jM6672constructorimpl + j4);
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m7705getProgressionLastElement7ftBX0g(long j2, long j3, long j4) {
        if (j4 > 0) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) >= 0 ? j3 : ULong.m6672constructorimpl(j3 - m7704differenceModulosambcqE(j3, j2, ULong.m6672constructorimpl(j4)));
        }
        if (j4 < 0) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) <= 0 ? j3 : ULong.m6672constructorimpl(j3 + m7704differenceModulosambcqE(j2, j3, ULong.m6672constructorimpl(-j4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m7706getProgressionLastElementNkh28Cs(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (Integer.compare(i2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i3) < 0) {
                return UInt.m6593constructorimpl(i3 - m7703differenceModuloWZ9TVnA(i3, i2, UInt.m6593constructorimpl(i4)));
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i3) > 0) {
                return UInt.m6593constructorimpl(i3 + m7703differenceModuloWZ9TVnA(i2, i3, UInt.m6593constructorimpl(-i4)));
            }
        }
        return i3;
    }
}
