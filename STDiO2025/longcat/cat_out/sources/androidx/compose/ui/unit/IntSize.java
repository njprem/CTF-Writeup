package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0013\u0010\u000bJ\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)I", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "div", "other", "div-YEO4UFw", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "times", "times-YEO4UFw", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class IntSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m6398constructorimpl(0);
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntSize;", "getZero-YbymL2g", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m6408getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntSize(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m6395boximpl(long j2) {
        return new IntSize(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m6396component1impl(long j2) {
        return m6403getWidthimpl(j2);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m6397component2impl(long j2) {
        return m6402getHeightimpl(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6398constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m6399divYEO4UFw(long j2, int i2) {
        return m6398constructorimpl(((((int) (j2 >> 32)) / i2) << 32) | ((((int) (j2 & 4294967295L)) / i2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6400equalsimpl(long j2, Object obj) {
        return (obj instanceof IntSize) && j2 == ((IntSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6401equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m6402getHeightimpl(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m6403getWidthimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6404hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m6405timesYEO4UFw(long j2, int i2) {
        return m6398constructorimpl(((((int) (j2 >> 32)) * i2) << 32) | ((((int) (j2 & 4294967295L)) * i2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6406toStringimpl(long j2) {
        return m6403getWidthimpl(j2) + " x " + m6402getHeightimpl(j2);
    }

    public boolean equals(Object obj) {
        return m6400equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6404hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6406toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
