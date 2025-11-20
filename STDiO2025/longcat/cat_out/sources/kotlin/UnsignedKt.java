package kotlin;

import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0081\b¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0081\b¢\u0006\u0002\u0010\f\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000eH\u0001\u001a\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b\u001a\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b\u001a\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b\u001a\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0081\b\u001a\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b¢\u0006\u0002\u0010\u001e\u001a\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0019H\u0001\u001a\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b$\u0010\"\u001a\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0019H\u0001\u001a\u0011\u0010&\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0019H\u0081\b\u001a\u0011\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0019H\u0081\b\u001a\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000eH\u0000¨\u0006("}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "value", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "floatToUInt", "", "(F)I", "floatToULong", "(F)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "uintToFloat", "uintToLong", "", "uintToString", "", "base", "uintToULong", "(I)J", "ulongCompare", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToFloat", "ulongToString", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnsignedKt {
    public static final int doubleToUInt(double d2) {
        if (Double.isNaN(d2) || d2 <= uintToDouble(0)) {
            return 0;
        }
        if (d2 >= uintToDouble(-1)) {
            return -1;
        }
        if (d2 <= 2.147483647E9d) {
            return UInt.m6593constructorimpl((int) d2);
        }
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(Integer.MAX_VALUE) + UInt.m6593constructorimpl((int) (d2 - Integer.MAX_VALUE)));
    }

    public static final long doubleToULong(double d2) {
        if (Double.isNaN(d2) || d2 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d2 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d2 < 9.223372036854776E18d ? ULong.m6672constructorimpl((long) d2) : ULong.m6672constructorimpl(ULong.m6672constructorimpl((long) (d2 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    private static final int floatToUInt(float f2) {
        return doubleToUInt(f2);
    }

    private static final long floatToULong(float f2) {
        return doubleToULong(f2);
    }

    public static final int uintCompare(int i2, int i3) {
        return Intrinsics.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m6849uintDivideJ1ME1BU(int i2, int i3) {
        return UInt.m6593constructorimpl((int) ((i2 & 4294967295L) / (i3 & 4294967295L)));
    }

    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m6850uintRemainderJ1ME1BU(int i2, int i3) {
        return UInt.m6593constructorimpl((int) ((i2 & 4294967295L) % (i3 & 4294967295L)));
    }

    public static final double uintToDouble(int i2) {
        return (((i2 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i2);
    }

    private static final float uintToFloat(int i2) {
        return (float) uintToDouble(i2);
    }

    private static final long uintToLong(int i2) {
        return i2 & 4294967295L;
    }

    private static final String uintToString(int i2) {
        return String.valueOf(i2 & 4294967295L);
    }

    private static final long uintToULong(int i2) {
        return ULong.m6672constructorimpl(i2 & 4294967295L);
    }

    public static final int ulongCompare(long j2, long j3) {
        return Intrinsics.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m6851ulongDivideeb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) < 0 ? ULong.m6672constructorimpl(0L) : ULong.m6672constructorimpl(1L);
        }
        if (j2 >= 0) {
            return ULong.m6672constructorimpl(j2 / j3);
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return ULong.m6672constructorimpl(j4 + (Long.compare(ULong.m6672constructorimpl(j2 - (j4 * j3)) ^ Long.MIN_VALUE, ULong.m6672constructorimpl(j3) ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m6852ulongRemaindereb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) < 0 ? j2 : ULong.m6672constructorimpl(j2 - j3);
        }
        if (j2 >= 0) {
            return ULong.m6672constructorimpl(j2 % j3);
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (Long.compare(ULong.m6672constructorimpl(j4) ^ Long.MIN_VALUE, ULong.m6672constructorimpl(j3) ^ Long.MIN_VALUE) < 0) {
            j3 = 0;
        }
        return ULong.m6672constructorimpl(j4 - j3);
    }

    public static final double ulongToDouble(long j2) {
        return ((j2 >>> 11) * Fields.CameraDistance) + (j2 & 2047);
    }

    private static final float ulongToFloat(long j2) {
        return (float) ulongToDouble(j2);
    }

    private static final String ulongToString(long j2) {
        return ulongToString(j2, 10);
    }

    private static final String uintToString(int i2, int i3) {
        return ulongToString(i2 & 4294967295L, i3);
    }

    public static final String ulongToString(long j2, int i2) {
        if (j2 >= 0) {
            String string = Long.toString(j2, CharsKt.checkRadix(i2));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j3 = i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j4, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j5, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
