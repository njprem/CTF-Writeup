package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float Hairline = m6233constructorimpl(0.0f);
    private static final float Infinity = m6233constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m6233constructorimpl(Float.NaN);
    private final float value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6248getHairlineD9Ej5fM$annotations() {
        }

        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6249getInfinityD9Ej5fM$annotations() {
        }

        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6250getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m6251getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m6252getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m6253getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Dp(float f2) {
        this.value = f2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m6231boximpl(float f2) {
        return new Dp(f2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m6233constructorimpl(float f2) {
        return f2;
    }

    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m6234div0680j_4(float f2, float f3) {
        return f2 / f3;
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6235divu2uoSUM(float f2, float f3) {
        return m6233constructorimpl(f2 / f3);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6237equalsimpl(float f2, Object obj) {
        return (obj instanceof Dp) && Float.compare(f2, ((Dp) obj).m6247unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6238equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6239hashCodeimpl(float f2) {
        return Float.hashCode(f2);
    }

    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m6240minus5rwHm24(float f2, float f3) {
        return m6233constructorimpl(f2 - f3);
    }

    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m6241plus5rwHm24(float f2, float f3) {
        return m6233constructorimpl(f2 + f3);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6242timesu2uoSUM(float f2, float f3) {
        return m6233constructorimpl(f2 * f3);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6244toStringimpl(float f2) {
        if (Float.isNaN(f2)) {
            return "Dp.Unspecified";
        }
        return f2 + ".dp";
    }

    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m6245unaryMinusD9Ej5fM(float f2) {
        return m6233constructorimpl(-f2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m6246compareTo0680j_4(dp.m6247unboximpl());
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m6246compareTo0680j_4(float f2) {
        return m6232compareTo0680j_4(this.value, f2);
    }

    public boolean equals(Object obj) {
        return m6237equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6239hashCodeimpl(this.value);
    }

    public String toString() {
        return m6244toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m6247unboximpl() {
        return this.value;
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m6232compareTo0680j_4(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6236divu2uoSUM(float f2, int i2) {
        return m6233constructorimpl(f2 / i2);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6243timesu2uoSUM(float f2, int i2) {
        return m6233constructorimpl(f2 * i2);
    }
}
