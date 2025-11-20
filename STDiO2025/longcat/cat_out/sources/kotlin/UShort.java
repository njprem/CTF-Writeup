package kotlin;

import androidx.compose.runtime.changelist.a;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b'\u0010\u0010J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b(\u0010\u0013J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b3\u0010\u0010J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b4\u0010\u0013J\u0018\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b:\u0010\u0013J\u0018\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b;\u0010\u001fJ\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b@\u0010\u0010J\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bA\u0010\u0013J\u0018\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bK\u0010\u0010J\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bL\u0010\u0013J\u0018\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bP\u0010\u0010J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bQ\u0010\u0013J\u0018\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0013\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0013\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class UShort implements Comparable<UShort> {
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    private /* synthetic */ UShort(short s2) {
        this.data = s2;
    }

    /* renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m6772andxj2QHRw(short s2, short s3) {
        return m6779constructorimpl((short) (s2 & s3));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m6773boximpl(short s2) {
        return new UShort(s2);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m6774compareTo7apg3OU(short s2, byte b2) {
        return Intrinsics.compare(s2 & MAX_VALUE, b2 & UByte.MAX_VALUE);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m6775compareToVKZWuLQ(short s2, long j2) {
        return Long.compare(ULong.m6672constructorimpl(s2 & 65535) ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m6776compareToWZ4Q5Ns(short s2, int i2) {
        return Integer.compare(UInt.m6593constructorimpl(s2 & MAX_VALUE) ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m6777compareToxj2QHRw(short s2) {
        return Intrinsics.compare(getData() & MAX_VALUE, s2 & MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m6779constructorimpl(short s2) {
        return s2;
    }

    /* renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m6780decMh2AYeg(short s2) {
        return m6779constructorimpl((short) (s2 - 1));
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m6781div7apg3OU(short s2, byte b2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) / (UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m6782divVKZWuLQ(short s2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(s2 & 65535);
        if (j2 < 0) {
            return (jM6672constructorimpl ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (jM6672constructorimpl >= 0) {
            return jM6672constructorimpl / j2;
        }
        long j3 = ((jM6672constructorimpl >>> 1) / j2) << 1;
        return j3 + (((jM6672constructorimpl - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m6783divWZ4Q5Ns(short s2, int i2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) / (i2 & 4294967295L));
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m6784divxj2QHRw(short s2, short s3) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) / (UInt.m6593constructorimpl(s3 & MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6785equalsimpl(short s2, Object obj) {
        return (obj instanceof UShort) && s2 == ((UShort) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6786equalsimpl0(short s2, short s3) {
        return s2 == s3;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m6787floorDiv7apg3OU(short s2, byte b2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) / (UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m6788floorDivVKZWuLQ(short s2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(s2 & 65535);
        if (j2 < 0) {
            return (jM6672constructorimpl ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (jM6672constructorimpl >= 0) {
            return jM6672constructorimpl / j2;
        }
        long j3 = ((jM6672constructorimpl >>> 1) / j2) << 1;
        return j3 + (((jM6672constructorimpl - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m6789floorDivWZ4Q5Ns(short s2, int i2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) / (i2 & 4294967295L));
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m6790floorDivxj2QHRw(short s2, short s3) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) / (UInt.m6593constructorimpl(s3 & MAX_VALUE) & 4294967295L));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6791hashCodeimpl(short s2) {
        return Short.hashCode(s2);
    }

    /* renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m6792incMh2AYeg(short s2) {
        return m6779constructorimpl((short) (s2 + 1));
    }

    /* renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m6793invMh2AYeg(short s2) {
        return m6779constructorimpl((short) (~s2));
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m6794minus7apg3OU(short s2, byte b2) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s2 & MAX_VALUE) - UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m6795minusVKZWuLQ(short s2, long j2) {
        return ULong.m6672constructorimpl(ULong.m6672constructorimpl(s2 & 65535) - j2);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m6796minusWZ4Q5Ns(short s2, int i2) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s2 & MAX_VALUE) - i2);
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m6797minusxj2QHRw(short s2, short s3) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s2 & MAX_VALUE) - UInt.m6593constructorimpl(s3 & MAX_VALUE));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m6798mod7apg3OU(short s2, byte b2) {
        return UByte.m6516constructorimpl((byte) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) % (UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m6799modVKZWuLQ(short s2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(s2 & 65535);
        if (j2 < 0) {
            return (jM6672constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2) ? jM6672constructorimpl : jM6672constructorimpl - j2;
        }
        if (jM6672constructorimpl >= 0) {
            return jM6672constructorimpl % j2;
        }
        long j3 = jM6672constructorimpl - ((((jM6672constructorimpl >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2)) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m6800modWZ4Q5Ns(short s2, int i2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) % (i2 & 4294967295L));
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m6801modxj2QHRw(short s2, short s3) {
        return m6779constructorimpl((short) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) % (UInt.m6593constructorimpl(s3 & MAX_VALUE) & 4294967295L)));
    }

    /* renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m6802orxj2QHRw(short s2, short s3) {
        return m6779constructorimpl((short) (s2 | s3));
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m6803plus7apg3OU(short s2, byte b2) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE) + UInt.m6593constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m6804plusVKZWuLQ(short s2, long j2) {
        return ULong.m6672constructorimpl(ULong.m6672constructorimpl(s2 & 65535) + j2);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m6805plusWZ4Q5Ns(short s2, int i2) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s2 & MAX_VALUE) + i2);
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m6806plusxj2QHRw(short s2, short s3) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s3 & MAX_VALUE) + UInt.m6593constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m6807rangeToxj2QHRw(short s2, short s3) {
        return new UIntRange(UInt.m6593constructorimpl(s2 & MAX_VALUE), UInt.m6593constructorimpl(s3 & MAX_VALUE), null);
    }

    /* renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m6808rangeUntilxj2QHRw(short s2, short s3) {
        return URangesKt.m7765untilJ1ME1BU(UInt.m6593constructorimpl(s2 & MAX_VALUE), UInt.m6593constructorimpl(s3 & MAX_VALUE));
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m6809rem7apg3OU(short s2, byte b2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) % (UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m6810remVKZWuLQ(short s2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(s2 & 65535);
        if (j2 < 0) {
            return (jM6672constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2) ? jM6672constructorimpl : jM6672constructorimpl - j2;
        }
        if (jM6672constructorimpl >= 0) {
            return jM6672constructorimpl % j2;
        }
        long j3 = jM6672constructorimpl - ((((jM6672constructorimpl >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2)) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m6811remWZ4Q5Ns(short s2, int i2) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) % (i2 & 4294967295L));
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m6812remxj2QHRw(short s2, short s3) {
        return (int) ((UInt.m6593constructorimpl(s2 & MAX_VALUE) & 4294967295L) % (UInt.m6593constructorimpl(s3 & MAX_VALUE) & 4294967295L));
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m6813times7apg3OU(short s2, byte b2) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(b2 & UByte.MAX_VALUE) * UInt.m6593constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m6814timesVKZWuLQ(short s2, long j2) {
        return a.e(s2 & 65535, j2);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m6815timesWZ4Q5Ns(short s2, int i2) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s2 & MAX_VALUE) * i2);
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m6816timesxj2QHRw(short s2, short s3) {
        return UInt.m6593constructorimpl(UInt.m6593constructorimpl(s3 & MAX_VALUE) * UInt.m6593constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m6817toByteimpl(short s2) {
        return (byte) s2;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m6818toDoubleimpl(short s2) {
        return UnsignedKt.uintToDouble(s2 & MAX_VALUE);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m6819toFloatimpl(short s2) {
        return (float) UnsignedKt.uintToDouble(s2 & MAX_VALUE);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m6820toIntimpl(short s2) {
        return s2 & MAX_VALUE;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m6821toLongimpl(short s2) {
        return s2 & 65535;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m6822toShortimpl(short s2) {
        return s2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6823toStringimpl(short s2) {
        return String.valueOf(s2 & MAX_VALUE);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m6824toUBytew2LRezQ(short s2) {
        return UByte.m6516constructorimpl((byte) s2);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m6825toUIntpVg5ArA(short s2) {
        return UInt.m6593constructorimpl(s2 & MAX_VALUE);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m6826toULongsVKNKU(short s2) {
        return ULong.m6672constructorimpl(s2 & 65535);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m6827toUShortMh2AYeg(short s2) {
        return s2;
    }

    /* renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m6828xorxj2QHRw(short s2, short s3) {
        return m6779constructorimpl((short) (s2 ^ s3));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m6785equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m6791hashCodeimpl(this.data);
    }

    public String toString() {
        return m6823toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m6778compareToxj2QHRw(short s2, short s3) {
        return Intrinsics.compare(s2 & MAX_VALUE, s3 & MAX_VALUE);
    }
}
