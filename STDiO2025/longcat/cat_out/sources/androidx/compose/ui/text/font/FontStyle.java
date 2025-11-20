package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Normal = m5828constructorimpl(0);
    private static final int Italic = m5828constructorimpl(1);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u001f\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle$Companion;", "", "()V", "Italic", "Landroidx/compose/ui/text/font/FontStyle;", "getItalic-_-LCdwA$annotations", "getItalic-_-LCdwA", "()I", "I", "Normal", "getNormal-_-LCdwA$annotations", "getNormal-_-LCdwA", "values", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m5834getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m5835getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m5836getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m5837getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return CollectionsKt.listOf((Object[]) new FontStyle[]{FontStyle.m5827boximpl(m5837getNormal_LCdwA()), FontStyle.m5827boximpl(m5836getItalic_LCdwA())});
        }

        private Companion() {
        }
    }

    @Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
    private /* synthetic */ FontStyle(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m5827boximpl(int i2) {
        return new FontStyle(i2);
    }

    @Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5828constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5829equalsimpl(int i2, Object obj) {
        return (obj instanceof FontStyle) && i2 == ((FontStyle) obj).m5833unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5830equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5831hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5832toStringimpl(int i2) {
        return m5830equalsimpl0(i2, Normal) ? "Normal" : m5830equalsimpl0(i2, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5829equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5831hashCodeimpl(this.value);
    }

    public String toString() {
        return m5832toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5833unboximpl() {
        return this.value;
    }
}
