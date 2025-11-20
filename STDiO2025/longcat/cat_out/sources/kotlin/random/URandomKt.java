package kotlin.random;

import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a\u0011\u0010!\u001a\u00020\b*\u00020\rH\u0007¢\u0006\u0002\u0010\"\u001a\u001b\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$\u001a#\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URandomKt {
    /* renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m7711checkUIntRangeBoundsJ1ME1BU(int i2, int i3) {
        if (Integer.compare(i3 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m6587boximpl(i2), UInt.m6587boximpl(i3)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m7712checkULongRangeBoundseb3DHEI(long j2, long j3) {
        if (Long.compare(j3 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j2) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m6666boximpl(j2), ULong.m6666boximpl(j3)).toString());
        }
    }

    public static final byte[] nextUBytes(Random random, int i2) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m6569constructorimpl(random.nextBytes(i2));
    }

    /* renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m7713nextUBytesEVgfTAA(Random nextUBytes, byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m7714nextUBytesWvrt4B4(Random nextUBytes, byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i2, i3);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m7715nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UByteArray.m6575getSizeimpl(bArr);
        }
        return m7714nextUBytesWvrt4B4(random, bArr, i2, i3);
    }

    public static final int nextUInt(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m6593constructorimpl(random.nextInt());
    }

    /* renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m7716nextUInta8DCA5k(Random nextUInt, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m7711checkUIntRangeBoundsJ1ME1BU(i2, i3);
        return UInt.m6593constructorimpl(nextUInt.nextInt(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    /* renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m7717nextUIntqCasIEU(Random nextUInt, int i2) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m7716nextUInta8DCA5k(nextUInt, 0, i2);
    }

    public static final long nextULong(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m6672constructorimpl(random.nextLong());
    }

    /* renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m7718nextULongV1Xi4fY(Random nextULong, long j2) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m7719nextULongjmpaWc(nextULong, 0L, j2);
    }

    /* renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m7719nextULongjmpaWc(Random nextULong, long j2, long j3) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m7712checkULongRangeBoundseb3DHEI(j2, j3);
        return ULong.m6672constructorimpl(nextULong.nextLong(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    public static final int nextUInt(Random random, UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return Integer.compare(range.getLast() ^ Integer.MIN_VALUE, Integer.MAX_VALUE) < 0 ? m7716nextUInta8DCA5k(random, range.getFirst(), UInt.m6593constructorimpl(range.getLast() + 1)) : Integer.compare(range.getFirst() ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0 ? UInt.m6593constructorimpl(m7716nextUInta8DCA5k(random, UInt.m6593constructorimpl(range.getFirst() - 1), range.getLast()) + 1) : nextUInt(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long nextULong(Random random, ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compare(range.getLast() ^ Long.MIN_VALUE, LongCompanionObject.MAX_VALUE) < 0) {
            return m7719nextULongjmpaWc(random, range.getFirst(), ULong.m6672constructorimpl(ULong.m6672constructorimpl(1 & 4294967295L) + range.getLast()));
        }
        if (Long.compare(range.getFirst() ^ Long.MIN_VALUE, Long.MIN_VALUE) <= 0) {
            return nextULong(random);
        }
        long j2 = 1 & 4294967295L;
        return ULong.m6672constructorimpl(ULong.m6672constructorimpl(j2) + m7719nextULongjmpaWc(random, ULong.m6672constructorimpl(range.getFirst() - ULong.m6672constructorimpl(j2)), range.getLast()));
    }
}
