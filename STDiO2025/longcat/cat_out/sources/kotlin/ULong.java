package kotlin;

import androidx.compose.runtime.changelist.a;
import kotlin.jvm.JvmInline;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b)\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010\u000bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0013\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b6\u0010\u001fJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b8\u0010\"J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010;J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010\u0013J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u000bJ\u0018\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bA\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bD\u0010\u001fJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bF\u0010\"J\u0018\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bN\u0010\u001dJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bO\u0010\u001fJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bQ\u0010\"J\u001b\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bX\u0010\u001dJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bZ\u0010\u000bJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0013\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0013\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0013\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u0018\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\u007f"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class ULong implements Comparable<ULong> {
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    private /* synthetic */ ULong(long j2) {
        this.data = j2;
    }

    /* renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m6665andVKZWuLQ(long j2, long j3) {
        return m6672constructorimpl(j2 & j3);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m6666boximpl(long j2) {
        return new ULong(j2);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m6667compareTo7apg3OU(long j2, byte b2) {
        return Long.compare(j2 ^ Long.MIN_VALUE, m6672constructorimpl(b2 & 255) ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m6668compareToVKZWuLQ(long j2) {
        return UnsignedKt.ulongCompare(getData(), j2);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m6670compareToWZ4Q5Ns(long j2, int i2) {
        return Long.compare(j2 ^ Long.MIN_VALUE, m6672constructorimpl(i2 & 4294967295L) ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m6671compareToxj2QHRw(long j2, short s2) {
        return Long.compare(j2 ^ Long.MIN_VALUE, m6672constructorimpl(s2 & 65535) ^ Long.MIN_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6672constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m6673decsVKNKU(long j2) {
        return m6672constructorimpl(j2 - 1);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m6674div7apg3OU(long j2, byte b2) {
        long jM6672constructorimpl = m6672constructorimpl(b2 & 255);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / jM6672constructorimpl;
        }
        long j3 = ((j2 >>> 1) / jM6672constructorimpl) << 1;
        return j3 + (((j2 - (j3 * jM6672constructorimpl)) ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m6675divVKZWuLQ(long j2, long j3) {
        return UnsignedKt.m6851ulongDivideeb3DHEI(j2, j3);
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m6676divWZ4Q5Ns(long j2, int i2) {
        long jM6672constructorimpl = m6672constructorimpl(i2 & 4294967295L);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / jM6672constructorimpl;
        }
        long j3 = ((j2 >>> 1) / jM6672constructorimpl) << 1;
        return j3 + (((j2 - (j3 * jM6672constructorimpl)) ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m6677divxj2QHRw(long j2, short s2) {
        long jM6672constructorimpl = m6672constructorimpl(s2 & 65535);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / jM6672constructorimpl;
        }
        long j3 = ((j2 >>> 1) / jM6672constructorimpl) << 1;
        return j3 + (((j2 - (j3 * jM6672constructorimpl)) ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6678equalsimpl(long j2, Object obj) {
        return (obj instanceof ULong) && j2 == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6679equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m6680floorDiv7apg3OU(long j2, byte b2) {
        long jM6672constructorimpl = m6672constructorimpl(b2 & 255);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / jM6672constructorimpl;
        }
        long j3 = ((j2 >>> 1) / jM6672constructorimpl) << 1;
        return j3 + (((j2 - (j3 * jM6672constructorimpl)) ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m6681floorDivVKZWuLQ(long j2, long j3) {
        if (j3 < 0) {
            return (j2 ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / j3;
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return j4 + (((j2 - (j4 * j3)) ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m6682floorDivWZ4Q5Ns(long j2, int i2) {
        long jM6672constructorimpl = m6672constructorimpl(i2 & 4294967295L);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / jM6672constructorimpl;
        }
        long j3 = ((j2 >>> 1) / jM6672constructorimpl) << 1;
        return j3 + (((j2 - (j3 * jM6672constructorimpl)) ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m6683floorDivxj2QHRw(long j2, short s2) {
        long jM6672constructorimpl = m6672constructorimpl(s2 & 65535);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / jM6672constructorimpl;
        }
        long j3 = ((j2 >>> 1) / jM6672constructorimpl) << 1;
        return j3 + (((j2 - (j3 * jM6672constructorimpl)) ^ Long.MIN_VALUE) < (jM6672constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6684hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m6685incsVKNKU(long j2) {
        return m6672constructorimpl(j2 + 1);
    }

    /* renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m6686invsVKNKU(long j2) {
        return m6672constructorimpl(~j2);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m6687minus7apg3OU(long j2, byte b2) {
        return m6672constructorimpl(j2 - m6672constructorimpl(b2 & 255));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m6688minusVKZWuLQ(long j2, long j3) {
        return m6672constructorimpl(j2 - j3);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m6689minusWZ4Q5Ns(long j2, int i2) {
        return m6672constructorimpl(j2 - m6672constructorimpl(i2 & 4294967295L));
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m6690minusxj2QHRw(long j2, short s2) {
        return m6672constructorimpl(j2 - m6672constructorimpl(s2 & 65535));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m6691mod7apg3OU(long j2, byte b2) {
        long jM6672constructorimpl = m6672constructorimpl(b2 & 255);
        if (jM6672constructorimpl < 0) {
            if ((j2 ^ Long.MIN_VALUE) >= (Long.MIN_VALUE ^ jM6672constructorimpl)) {
                j2 -= jM6672constructorimpl;
            }
        } else if (j2 >= 0) {
            j2 %= jM6672constructorimpl;
        } else {
            j2 -= (((j2 >>> 1) / jM6672constructorimpl) << 1) * jM6672constructorimpl;
            if ((j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl)) {
                jM6672constructorimpl = 0;
            }
            j2 -= jM6672constructorimpl;
        }
        return UByte.m6516constructorimpl((byte) j2);
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m6692modVKZWuLQ(long j2, long j3) {
        if (j3 < 0) {
            return (j2 ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? j2 : j2 - j3;
        }
        if (j2 >= 0) {
            return j2 % j3;
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if ((j4 ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE)) {
            j3 = 0;
        }
        return j4 - j3;
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m6693modWZ4Q5Ns(long j2, int i2) {
        long jM6672constructorimpl = m6672constructorimpl(i2 & 4294967295L);
        if (jM6672constructorimpl < 0) {
            if ((j2 ^ Long.MIN_VALUE) >= (Long.MIN_VALUE ^ jM6672constructorimpl)) {
                j2 -= jM6672constructorimpl;
            }
        } else if (j2 >= 0) {
            j2 %= jM6672constructorimpl;
        } else {
            j2 -= (((j2 >>> 1) / jM6672constructorimpl) << 1) * jM6672constructorimpl;
            if ((j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl)) {
                jM6672constructorimpl = 0;
            }
            j2 -= jM6672constructorimpl;
        }
        return UInt.m6593constructorimpl((int) j2);
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m6694modxj2QHRw(long j2, short s2) {
        long jM6672constructorimpl = m6672constructorimpl(s2 & 65535);
        if (jM6672constructorimpl < 0) {
            if ((j2 ^ Long.MIN_VALUE) >= (Long.MIN_VALUE ^ jM6672constructorimpl)) {
                j2 -= jM6672constructorimpl;
            }
        } else if (j2 >= 0) {
            j2 %= jM6672constructorimpl;
        } else {
            j2 -= (((j2 >>> 1) / jM6672constructorimpl) << 1) * jM6672constructorimpl;
            if ((j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl)) {
                jM6672constructorimpl = 0;
            }
            j2 -= jM6672constructorimpl;
        }
        return UShort.m6779constructorimpl((short) j2);
    }

    /* renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m6695orVKZWuLQ(long j2, long j3) {
        return m6672constructorimpl(j2 | j3);
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m6696plus7apg3OU(long j2, byte b2) {
        return m6672constructorimpl(m6672constructorimpl(b2 & 255) + j2);
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m6697plusVKZWuLQ(long j2, long j3) {
        return m6672constructorimpl(j2 + j3);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m6698plusWZ4Q5Ns(long j2, int i2) {
        return m6672constructorimpl(m6672constructorimpl(i2 & 4294967295L) + j2);
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m6699plusxj2QHRw(long j2, short s2) {
        return m6672constructorimpl(m6672constructorimpl(s2 & 65535) + j2);
    }

    /* renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m6700rangeToVKZWuLQ(long j2, long j3) {
        return new ULongRange(j2, j3, null);
    }

    /* renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m6701rangeUntilVKZWuLQ(long j2, long j3) {
        return URangesKt.m7767untileb3DHEI(j2, j3);
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m6702rem7apg3OU(long j2, byte b2) {
        long jM6672constructorimpl = m6672constructorimpl(b2 & 255);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl) ? j2 : j2 - jM6672constructorimpl;
        }
        if (j2 >= 0) {
            return j2 % jM6672constructorimpl;
        }
        long j3 = j2 - ((((j2 >>> 1) / jM6672constructorimpl) << 1) * jM6672constructorimpl);
        if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl)) {
            jM6672constructorimpl = 0;
        }
        return j3 - jM6672constructorimpl;
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m6703remVKZWuLQ(long j2, long j3) {
        return UnsignedKt.m6852ulongRemaindereb3DHEI(j2, j3);
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m6704remWZ4Q5Ns(long j2, int i2) {
        long jM6672constructorimpl = m6672constructorimpl(i2 & 4294967295L);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl) ? j2 : j2 - jM6672constructorimpl;
        }
        if (j2 >= 0) {
            return j2 % jM6672constructorimpl;
        }
        long j3 = j2 - ((((j2 >>> 1) / jM6672constructorimpl) << 1) * jM6672constructorimpl);
        if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl)) {
            jM6672constructorimpl = 0;
        }
        return j3 - jM6672constructorimpl;
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m6705remxj2QHRw(long j2, short s2) {
        long jM6672constructorimpl = m6672constructorimpl(s2 & 65535);
        if (jM6672constructorimpl < 0) {
            return (j2 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl) ? j2 : j2 - jM6672constructorimpl;
        }
        if (j2 >= 0) {
            return j2 % jM6672constructorimpl;
        }
        long j3 = j2 - ((((j2 >>> 1) / jM6672constructorimpl) << 1) * jM6672constructorimpl);
        if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ jM6672constructorimpl)) {
            jM6672constructorimpl = 0;
        }
        return j3 - jM6672constructorimpl;
    }

    /* renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m6706shlsVKNKU(long j2, int i2) {
        return m6672constructorimpl(j2 << i2);
    }

    /* renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m6707shrsVKNKU(long j2, int i2) {
        return m6672constructorimpl(j2 >>> i2);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m6708times7apg3OU(long j2, byte b2) {
        return a.e(b2 & 255, j2);
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m6709timesVKZWuLQ(long j2, long j3) {
        return m6672constructorimpl(j2 * j3);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m6710timesWZ4Q5Ns(long j2, int i2) {
        return a.e(i2 & 4294967295L, j2);
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m6711timesxj2QHRw(long j2, short s2) {
        return a.e(s2 & 65535, j2);
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m6712toByteimpl(long j2) {
        return (byte) j2;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m6713toDoubleimpl(long j2) {
        return UnsignedKt.ulongToDouble(j2);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m6714toFloatimpl(long j2) {
        return (float) UnsignedKt.ulongToDouble(j2);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m6715toIntimpl(long j2) {
        return (int) j2;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m6716toLongimpl(long j2) {
        return j2;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m6717toShortimpl(long j2) {
        return (short) j2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6718toStringimpl(long j2) {
        return UnsignedKt.ulongToString(j2, 10);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m6719toUBytew2LRezQ(long j2) {
        return UByte.m6516constructorimpl((byte) j2);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m6720toUIntpVg5ArA(long j2) {
        return UInt.m6593constructorimpl((int) j2);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m6721toULongsVKNKU(long j2) {
        return j2;
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m6722toUShortMh2AYeg(long j2) {
        return UShort.m6779constructorimpl((short) j2);
    }

    /* renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m6723xorVKZWuLQ(long j2, long j3) {
        return m6672constructorimpl(j2 ^ j3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object obj) {
        return m6678equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m6684hashCodeimpl(this.data);
    }

    public String toString() {
        return m6718toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m6669compareToVKZWuLQ(long j2, long j3) {
        return UnsignedKt.ulongCompare(j2, j3);
    }
}
