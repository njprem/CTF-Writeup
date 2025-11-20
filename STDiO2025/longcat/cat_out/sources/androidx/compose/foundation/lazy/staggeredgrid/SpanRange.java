package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\n\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u0088\u0001\u0007¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "lane", "", "span", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "end", "getEnd-impl", "(J)I", "getPackedValue", "()J", "size", "getSize-impl", "start", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m862boximpl(long j2) {
        return new SpanRange(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m864constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m865equalsimpl(long j2, Object obj) {
        return (obj instanceof SpanRange) && j2 == ((SpanRange) obj).m872unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m866equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m867getEndimpl(long j2) {
        return (int) (j2 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m868getSizeimpl(long j2) {
        return ((int) (4294967295L & j2)) - ((int) (j2 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m869getStartimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m870hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m871toStringimpl(long j2) {
        return "SpanRange(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m865equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m870hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m871toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m872unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m863constructorimpl(int i2, int i3) {
        return m864constructorimpl(((i3 + i2) & 4294967295L) | (i2 << 32));
    }
}
