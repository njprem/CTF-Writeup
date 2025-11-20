package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UArraySortingKt {
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m6953partitionnroSd4(long[] jArr, int i2, int i3) {
        long j2;
        long jM6732getsVKNKU = ULongArray.m6732getsVKNKU(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                j2 = jM6732getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(ULongArray.m6732getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, j2) >= 0) {
                    break;
                }
                i2++;
            }
            while (Long.compare(ULongArray.m6732getsVKNKU(jArr, i3) ^ Long.MIN_VALUE, j2) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                long jM6732getsVKNKU2 = ULongArray.m6732getsVKNKU(jArr, i2);
                ULongArray.m6737setk8EXiF4(jArr, i2, ULongArray.m6732getsVKNKU(jArr, i3));
                ULongArray.m6737setk8EXiF4(jArr, i3, jM6732getsVKNKU2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m6954partition4UcCI2c(byte[] bArr, int i2, int i3) {
        int i4;
        byte bM6574getw2LRezQ = UByteArray.m6574getw2LRezQ(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int iM6574getw2LRezQ = UByteArray.m6574getw2LRezQ(bArr, i2) & UByte.MAX_VALUE;
                i4 = bM6574getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM6574getw2LRezQ, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UByteArray.m6574getw2LRezQ(bArr, i3) & UByte.MAX_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                byte bM6574getw2LRezQ2 = UByteArray.m6574getw2LRezQ(bArr, i2);
                UByteArray.m6579setVurrAj0(bArr, i2, UByteArray.m6574getw2LRezQ(bArr, i3));
                UByteArray.m6579setVurrAj0(bArr, i3, bM6574getw2LRezQ2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m6955partitionAa5vz7o(short[] sArr, int i2, int i3) {
        int i4;
        short sM6837getMh2AYeg = UShortArray.m6837getMh2AYeg(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int iM6837getMh2AYeg = UShortArray.m6837getMh2AYeg(sArr, i2) & UShort.MAX_VALUE;
                i4 = sM6837getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM6837getMh2AYeg, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UShortArray.m6837getMh2AYeg(sArr, i3) & UShort.MAX_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                short sM6837getMh2AYeg2 = UShortArray.m6837getMh2AYeg(sArr, i2);
                UShortArray.m6842set01HTLdE(sArr, i2, UShortArray.m6837getMh2AYeg(sArr, i3));
                UShortArray.m6842set01HTLdE(sArr, i3, sM6837getMh2AYeg2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m6956partitionoBK06Vg(int[] iArr, int i2, int i3) {
        int i4;
        int iM6653getpVg5ArA = UIntArray.m6653getpVg5ArA(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                i4 = iM6653getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(UIntArray.m6653getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Integer.compare(UIntArray.m6653getpVg5ArA(iArr, i3) ^ Integer.MIN_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                int iM6653getpVg5ArA2 = UIntArray.m6653getpVg5ArA(iArr, i2);
                UIntArray.m6658setVXSXFK8(iArr, i2, UIntArray.m6653getpVg5ArA(iArr, i3));
                UIntArray.m6658setVXSXFK8(iArr, i3, iM6653getpVg5ArA2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m6957quickSortnroSd4(long[] jArr, int i2, int i3) {
        int iM6953partitionnroSd4 = m6953partitionnroSd4(jArr, i2, i3);
        int i4 = iM6953partitionnroSd4 - 1;
        if (i2 < i4) {
            m6957quickSortnroSd4(jArr, i2, i4);
        }
        if (iM6953partitionnroSd4 < i3) {
            m6957quickSortnroSd4(jArr, iM6953partitionnroSd4, i3);
        }
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m6958quickSort4UcCI2c(byte[] bArr, int i2, int i3) {
        int iM6954partition4UcCI2c = m6954partition4UcCI2c(bArr, i2, i3);
        int i4 = iM6954partition4UcCI2c - 1;
        if (i2 < i4) {
            m6958quickSort4UcCI2c(bArr, i2, i4);
        }
        if (iM6954partition4UcCI2c < i3) {
            m6958quickSort4UcCI2c(bArr, iM6954partition4UcCI2c, i3);
        }
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m6959quickSortAa5vz7o(short[] sArr, int i2, int i3) {
        int iM6955partitionAa5vz7o = m6955partitionAa5vz7o(sArr, i2, i3);
        int i4 = iM6955partitionAa5vz7o - 1;
        if (i2 < i4) {
            m6959quickSortAa5vz7o(sArr, i2, i4);
        }
        if (iM6955partitionAa5vz7o < i3) {
            m6959quickSortAa5vz7o(sArr, iM6955partitionAa5vz7o, i3);
        }
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m6960quickSortoBK06Vg(int[] iArr, int i2, int i3) {
        int iM6956partitionoBK06Vg = m6956partitionoBK06Vg(iArr, i2, i3);
        int i4 = iM6956partitionoBK06Vg - 1;
        if (i2 < i4) {
            m6960quickSortoBK06Vg(iArr, i2, i4);
        }
        if (iM6956partitionoBK06Vg < i3) {
            m6960quickSortoBK06Vg(iArr, iM6956partitionoBK06Vg, i3);
        }
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m6961sortArraynroSd4(long[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6957quickSortnroSd4(array, i2, i3 - 1);
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m6962sortArray4UcCI2c(byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6958quickSort4UcCI2c(array, i2, i3 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m6963sortArrayAa5vz7o(short[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6959quickSortAa5vz7o(array, i2, i3 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m6964sortArrayoBK06Vg(int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6960quickSortoBK06Vg(array, i2, i3 - 1);
    }
}
