package androidx.compose.ui.autofill;

import J.d;
import androidx.compose.runtime.changelist.a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "dataType", "", "constructor-impl", "(I)I", "getDataType", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class ContentDataType {
    private final int dataType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Text = m3410constructorimpl(1);
    private static final int List = m3410constructorimpl(3);
    private static final int Date = m3410constructorimpl(4);
    private static final int Toggle = m3410constructorimpl(2);
    private static final int None = m3410constructorimpl(0);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "()V", "Date", "Landroidx/compose/ui/autofill/ContentDataType;", "getDate-A48pgw8", "()I", "I", "List", "getList-A48pgw8", "None", "getNone-A48pgw8", "Text", "getText-A48pgw8", "Toggle", "getToggle-A48pgw8", "from", "value", "", "from-LGGHU18$ui_release", "(I)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: from-LGGHU18$ui_release, reason: not valid java name */
        public final int m3416fromLGGHU18$ui_release(int value) {
            if (value == 0) {
                return m3419getNoneA48pgw8();
            }
            if (value == 1) {
                return m3420getTextA48pgw8();
            }
            if (value == 2) {
                return m3421getToggleA48pgw8();
            }
            if (value == 3) {
                return m3418getListA48pgw8();
            }
            if (value == 4) {
                return m3417getDateA48pgw8();
            }
            throw new IllegalArgumentException(a.n("Invalid autofill type value: ", value));
        }

        /* renamed from: getDate-A48pgw8, reason: not valid java name */
        public final int m3417getDateA48pgw8() {
            return ContentDataType.Date;
        }

        /* renamed from: getList-A48pgw8, reason: not valid java name */
        public final int m3418getListA48pgw8() {
            return ContentDataType.List;
        }

        /* renamed from: getNone-A48pgw8, reason: not valid java name */
        public final int m3419getNoneA48pgw8() {
            return ContentDataType.None;
        }

        /* renamed from: getText-A48pgw8, reason: not valid java name */
        public final int m3420getTextA48pgw8() {
            return ContentDataType.Text;
        }

        /* renamed from: getToggle-A48pgw8, reason: not valid java name */
        public final int m3421getToggleA48pgw8() {
            return ContentDataType.Toggle;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ContentDataType(int i2) {
        this.dataType = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContentDataType m3409boximpl(int i2) {
        return new ContentDataType(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3410constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3411equalsimpl(int i2, Object obj) {
        return (obj instanceof ContentDataType) && i2 == ((ContentDataType) obj).m3415unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3412equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3413hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3414toStringimpl(int i2) {
        return d.m("ContentDataType(dataType=", i2, ')');
    }

    public boolean equals(Object obj) {
        return m3411equalsimpl(this.dataType, obj);
    }

    public final int getDataType() {
        return this.dataType;
    }

    public int hashCode() {
        return m3413hashCodeimpl(this.dataType);
    }

    public String toString() {
        return m3414toStringimpl(this.dataType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3415unboximpl() {
        return this.dataType;
    }
}
