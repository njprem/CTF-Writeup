package kotlin;

import androidx.compose.runtime.changelist.a;
import kotlin.jvm.JvmInline;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b%\u0010\u000fJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b&\u0010\u000bJ\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0013\u0010+\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u0005J\u0013\u0010-\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b.\u0010\u0005J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b0\u0010\u000fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b1\u0010\u000bJ\u0018\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b2\u0010\u001dJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b3\u0010\u0016J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b8\u0010\u001dJ\u0018\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b>\u0010\u000fJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b@\u0010\u001dJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bA\u0010\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bG\u0010EJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bI\u0010\u000fJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bJ\u0010\u000bJ\u0018\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bK\u0010\u001dJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bL\u0010\u0016J\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bS\u0010\u000fJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bT\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bU\u0010\u001dJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bV\u0010\u0016J\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\\H\u0087\b¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020`H\u0087\b¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bd\u0010\u0005J\u0010\u0010e\u001a\u00020fH\u0087\b¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020jH\u0087\b¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\u0013\u0010q\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\br\u0010ZJ\u0013\u0010s\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bt\u0010\u0005J\u0013\u0010u\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bv\u0010hJ\u0013\u0010w\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bx\u0010lJ\u0018\u0010y\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bz\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006|"}, d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-WZ4Q5Ns", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class UInt implements Comparable<UInt> {
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    private /* synthetic */ UInt(int i2) {
        this.data = i2;
    }

    /* renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m6586andWZ4Q5Ns(int i2, int i3) {
        return m6593constructorimpl(i2 & i3);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m6587boximpl(int i2) {
        return new UInt(i2);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m6588compareTo7apg3OU(int i2, byte b2) {
        return Integer.compare(i2 ^ Integer.MIN_VALUE, m6593constructorimpl(b2 & UByte.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m6589compareToVKZWuLQ(int i2, long j2) {
        return Long.compare(ULong.m6672constructorimpl(i2 & 4294967295L) ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m6590compareToWZ4Q5Ns(int i2) {
        return UnsignedKt.uintCompare(getData(), i2);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m6592compareToxj2QHRw(int i2, short s2) {
        return Integer.compare(i2 ^ Integer.MIN_VALUE, m6593constructorimpl(s2 & UShort.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6593constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m6594decpVg5ArA(int i2) {
        return m6593constructorimpl(i2 - 1);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m6595div7apg3OU(int i2, byte b2) {
        return (int) ((i2 & 4294967295L) / (m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m6596divVKZWuLQ(int i2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(i2 & 4294967295L);
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
    private static final int m6597divWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m6849uintDivideJ1ME1BU(i2, i3);
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m6598divxj2QHRw(int i2, short s2) {
        return (int) ((i2 & 4294967295L) / (m6593constructorimpl(s2 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6599equalsimpl(int i2, Object obj) {
        return (obj instanceof UInt) && i2 == ((UInt) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6600equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m6601floorDiv7apg3OU(int i2, byte b2) {
        return (int) ((i2 & 4294967295L) / (m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m6602floorDivVKZWuLQ(int i2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(i2 & 4294967295L);
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
    private static final int m6603floorDivWZ4Q5Ns(int i2, int i3) {
        return (int) ((i2 & 4294967295L) / (i3 & 4294967295L));
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m6604floorDivxj2QHRw(int i2, short s2) {
        return (int) ((i2 & 4294967295L) / (m6593constructorimpl(s2 & UShort.MAX_VALUE) & 4294967295L));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6605hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m6606incpVg5ArA(int i2) {
        return m6593constructorimpl(i2 + 1);
    }

    /* renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m6607invpVg5ArA(int i2) {
        return m6593constructorimpl(~i2);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m6608minus7apg3OU(int i2, byte b2) {
        return m6593constructorimpl(i2 - m6593constructorimpl(b2 & UByte.MAX_VALUE));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m6609minusVKZWuLQ(int i2, long j2) {
        return ULong.m6672constructorimpl(ULong.m6672constructorimpl(i2 & 4294967295L) - j2);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m6610minusWZ4Q5Ns(int i2, int i3) {
        return m6593constructorimpl(i2 - i3);
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m6611minusxj2QHRw(int i2, short s2) {
        return m6593constructorimpl(i2 - m6593constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m6612mod7apg3OU(int i2, byte b2) {
        return UByte.m6516constructorimpl((byte) ((i2 & 4294967295L) % (m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m6613modVKZWuLQ(int i2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(i2 & 4294967295L);
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
    private static final int m6614modWZ4Q5Ns(int i2, int i3) {
        return (int) ((i2 & 4294967295L) % (i3 & 4294967295L));
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m6615modxj2QHRw(int i2, short s2) {
        return UShort.m6779constructorimpl((short) ((i2 & 4294967295L) % (m6593constructorimpl(s2 & UShort.MAX_VALUE) & 4294967295L)));
    }

    /* renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m6616orWZ4Q5Ns(int i2, int i3) {
        return m6593constructorimpl(i2 | i3);
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m6617plus7apg3OU(int i2, byte b2) {
        return m6593constructorimpl(m6593constructorimpl(b2 & UByte.MAX_VALUE) + i2);
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m6618plusVKZWuLQ(int i2, long j2) {
        return ULong.m6672constructorimpl(ULong.m6672constructorimpl(i2 & 4294967295L) + j2);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m6619plusWZ4Q5Ns(int i2, int i3) {
        return m6593constructorimpl(i2 + i3);
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m6620plusxj2QHRw(int i2, short s2) {
        return m6593constructorimpl(m6593constructorimpl(s2 & UShort.MAX_VALUE) + i2);
    }

    /* renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m6621rangeToWZ4Q5Ns(int i2, int i3) {
        return new UIntRange(i2, i3, null);
    }

    /* renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m6622rangeUntilWZ4Q5Ns(int i2, int i3) {
        return URangesKt.m7765untilJ1ME1BU(i2, i3);
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m6623rem7apg3OU(int i2, byte b2) {
        return (int) ((i2 & 4294967295L) % (m6593constructorimpl(b2 & UByte.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m6624remVKZWuLQ(int i2, long j2) {
        long jM6672constructorimpl = ULong.m6672constructorimpl(i2 & 4294967295L);
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
    private static final int m6625remWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m6850uintRemainderJ1ME1BU(i2, i3);
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m6626remxj2QHRw(int i2, short s2) {
        return (int) ((i2 & 4294967295L) % (m6593constructorimpl(s2 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m6627shlpVg5ArA(int i2, int i3) {
        return m6593constructorimpl(i2 << i3);
    }

    /* renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m6628shrpVg5ArA(int i2, int i3) {
        return m6593constructorimpl(i2 >>> i3);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m6629times7apg3OU(int i2, byte b2) {
        return m6593constructorimpl(m6593constructorimpl(b2 & UByte.MAX_VALUE) * i2);
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m6630timesVKZWuLQ(int i2, long j2) {
        return a.e(i2 & 4294967295L, j2);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m6631timesWZ4Q5Ns(int i2, int i3) {
        return m6593constructorimpl(i2 * i3);
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m6632timesxj2QHRw(int i2, short s2) {
        return m6593constructorimpl(m6593constructorimpl(s2 & UShort.MAX_VALUE) * i2);
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m6633toByteimpl(int i2) {
        return (byte) i2;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m6634toDoubleimpl(int i2) {
        return UnsignedKt.uintToDouble(i2);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m6635toFloatimpl(int i2) {
        return (float) UnsignedKt.uintToDouble(i2);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m6636toIntimpl(int i2) {
        return i2;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m6637toLongimpl(int i2) {
        return i2 & 4294967295L;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m6638toShortimpl(int i2) {
        return (short) i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6639toStringimpl(int i2) {
        return String.valueOf(i2 & 4294967295L);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m6640toUBytew2LRezQ(int i2) {
        return UByte.m6516constructorimpl((byte) i2);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m6641toUIntpVg5ArA(int i2) {
        return i2;
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m6642toULongsVKNKU(int i2) {
        return ULong.m6672constructorimpl(i2 & 4294967295L);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m6643toUShortMh2AYeg(int i2) {
        return UShort.m6779constructorimpl((short) i2);
    }

    /* renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m6644xorWZ4Q5Ns(int i2, int i3) {
        return m6593constructorimpl(i2 ^ i3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(getData(), uInt.getData());
    }

    public boolean equals(Object obj) {
        return m6599equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m6605hashCodeimpl(this.data);
    }

    public String toString() {
        return m6639toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m6591compareToWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3);
    }
}
