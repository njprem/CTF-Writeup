package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/InputIdentifier;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class InputIdentifier {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int SingleDateInput = m1801constructorimpl(0);
    private static final int StartDateInput = m1801constructorimpl(1);
    private static final int EndDateInput = m1801constructorimpl(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/InputIdentifier$Companion;", "", "()V", "EndDateInput", "Landroidx/compose/material3/InputIdentifier;", "getEndDateInput-J2x2o4M", "()I", "I", "SingleDateInput", "getSingleDateInput-J2x2o4M", "StartDateInput", "getStartDateInput-J2x2o4M", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M, reason: not valid java name */
        public final int m1807getEndDateInputJ2x2o4M() {
            return InputIdentifier.EndDateInput;
        }

        /* renamed from: getSingleDateInput-J2x2o4M, reason: not valid java name */
        public final int m1808getSingleDateInputJ2x2o4M() {
            return InputIdentifier.SingleDateInput;
        }

        /* renamed from: getStartDateInput-J2x2o4M, reason: not valid java name */
        public final int m1809getStartDateInputJ2x2o4M() {
            return InputIdentifier.StartDateInput;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InputIdentifier(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m1800boximpl(int i2) {
        return new InputIdentifier(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1801constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1802equalsimpl(int i2, Object obj) {
        return (obj instanceof InputIdentifier) && i2 == ((InputIdentifier) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1803equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1804hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1805toStringimpl(int i2) {
        return m1803equalsimpl0(i2, SingleDateInput) ? "SingleDateInput" : m1803equalsimpl0(i2, StartDateInput) ? "StartDateInput" : m1803equalsimpl0(i2, EndDateInput) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1802equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1804hashCodeimpl(this.value);
    }

    public String toString() {
        return m1805toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
