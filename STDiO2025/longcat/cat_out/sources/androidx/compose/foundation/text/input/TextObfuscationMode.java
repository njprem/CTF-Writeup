package androidx.compose.foundation.text.input;

import J.d;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/input/TextObfuscationMode;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Visible = m1083constructorimpl(0);
    private static final int RevealLastTyped = m1083constructorimpl(1);
    private static final int Hidden = m1083constructorimpl(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/input/TextObfuscationMode$Companion;", "", "()V", "Hidden", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "getHidden-vTwcZD0", "()I", "I", "RevealLastTyped", "getRevealLastTyped-vTwcZD0", "Visible", "getVisible-vTwcZD0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m1089getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m1090getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m1091getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextObfuscationMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m1082boximpl(int i2) {
        return new TextObfuscationMode(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1083constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1084equalsimpl(int i2, Object obj) {
        return (obj instanceof TextObfuscationMode) && i2 == ((TextObfuscationMode) obj).m1088unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1085equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1086hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1087toStringimpl(int i2) {
        return d.m("TextObfuscationMode(value=", i2, ')');
    }

    public boolean equals(Object obj) {
        return m1084equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1086hashCodeimpl(this.value);
    }

    public String toString() {
        return m1087toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1088unboximpl() {
        return this.value;
    }
}
