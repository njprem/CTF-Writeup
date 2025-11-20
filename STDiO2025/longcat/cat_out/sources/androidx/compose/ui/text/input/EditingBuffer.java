package androidx.compose.ui.text.input;

import J.d;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\r\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J\r\u0010'\u001a\u00020%H\u0000¢\u0006\u0002\b(J\u001d\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b,J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\rH\u0080\u0002¢\u0006\u0002\b0J\r\u00101\u001a\u000202H\u0000¢\u0006\u0002\b3J%\u00104\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0007H\u0000¢\u0006\u0002\b5J%\u00104\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\b5J\u001d\u00106\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b7J\u001d\u00108\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0002\b;J\b\u0010<\u001a\u00020\u0003H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00058@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0016R$\u0010!\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "composition", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "compositionEnd", "getCompositionEnd$ui_text_release", "()I", "compositionStart", "getCompositionStart$ui_text_release", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "(I)V", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "length", "getLength$ui_text_release", "getSelection-d9O1mEE$ui_text_release", "()J", "value", "selectionEnd", "getSelectionEnd$ui_text_release", "setSelectionEnd", "selectionStart", "getSelectionStart$ui_text_release", "setSelectionStart", "cancelComposition", "", "cancelComposition$ui_text_release", "commitComposition", "commitComposition$ui_text_release", "delete", "start", "end", "delete$ui_text_release", "get", "", "index", "get$ui_text_release", "hasComposition", "", "hasComposition$ui_text_release", "replace", "replace$ui_text_release", "setComposition", "setComposition$ui_text_release", "setSelection", "setSelection$ui_text_release", "toAnnotatedString", "toAnnotatedString$ui_text_release", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2);
    }

    private final void setSelectionEnd(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Cannot set selectionEnd to a negative value: ", i2).toString());
        }
        this.selectionEnd = i2;
    }

    private final void setSelectionStart(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Cannot set selectionStart to a negative value: ", i2).toString());
        }
        this.selectionStart = i2;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int start, int end) {
        long jTextRange = TextRangeKt.TextRange(start, end);
        this.gapBuffer.replace(start, end, "");
        long jM5881updateRangeAfterDeletepWDy79M = EditingBufferKt.m5881updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m5719getMinimpl(jM5881updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m5718getMaximpl(jM5881updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM5881updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m5881updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m5715getCollapsedimpl(jM5881updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m5719getMinimpl(jM5881updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m5718getMaximpl(jM5881updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int index) {
        return this.gapBuffer.get(index);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m5879getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m5709boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getCompositionEnd$ui_text_release, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* renamed from: getCompositionStart$ui_text_release, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m5880getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    /* renamed from: getSelectionEnd$ui_text_release, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* renamed from: getSelectionStart$ui_text_release, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int start, int end, AnnotatedString text) {
        replace$ui_text_release(start, end, text.getText());
    }

    public final void setComposition$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbP = androidx.compose.runtime.changelist.a.p(start, "start (", ") offset is outside of text region ");
            sbP.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbP2 = androidx.compose.runtime.changelist.a.p(end, "end (", ") offset is outside of text region ");
            sbP2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (start >= end) {
            throw new IllegalArgumentException(d.n("Do not set reversed or empty range: ", start, end, " > "));
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void setCursor$ui_text_release(int i2) {
        setSelection$ui_text_release(i2, i2);
    }

    public final void setSelection$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbP = androidx.compose.runtime.changelist.a.p(start, "start (", ") offset is outside of text region ");
            sbP.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbP2 = androidx.compose.runtime.changelist.a.p(end, "end (", ") offset is outside of text region ");
            sbP2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(d.n("Do not set reversed range: ", start, end, " > "));
        }
        setSelectionStart(start);
        setSelectionEnd(end);
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    public final void replace$ui_text_release(int start, int end, String text) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbP = androidx.compose.runtime.changelist.a.p(start, "start (", ") offset is outside of text region ");
            sbP.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbP2 = androidx.compose.runtime.changelist.a.p(end, "end (", ") offset is outside of text region ");
            sbP2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(d.n("Do not set reversed range: ", start, end, " > "));
        }
        this.gapBuffer.replace(start, end, text);
        setSelectionStart(text.length() + start);
        setSelectionEnd(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    private EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m5719getMinimpl(j2);
        this.selectionEnd = TextRange.m5718getMaximpl(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM5719getMinimpl = TextRange.m5719getMinimpl(j2);
        int iM5718getMaximpl = TextRange.m5718getMaximpl(j2);
        if (iM5719getMinimpl >= 0 && iM5719getMinimpl <= annotatedString.length()) {
            if (iM5718getMaximpl < 0 || iM5718getMaximpl > annotatedString.length()) {
                StringBuilder sbP = androidx.compose.runtime.changelist.a.p(iM5718getMaximpl, "end (", ") offset is outside of text region ");
                sbP.append(annotatedString.length());
                throw new IndexOutOfBoundsException(sbP.toString());
            }
            if (iM5719getMinimpl > iM5718getMaximpl) {
                throw new IllegalArgumentException(d.n("Do not set reversed range: ", iM5719getMinimpl, iM5718getMaximpl, " > "));
            }
            return;
        }
        StringBuilder sbP2 = androidx.compose.runtime.changelist.a.p(iM5719getMinimpl, "start (", ") offset is outside of text region ");
        sbP2.append(annotatedString.length());
        throw new IndexOutOfBoundsException(sbP2.toString());
    }

    private EditingBuffer(String str, long j2) {
        this(new AnnotatedString(str, null, null, 6, null), j2, (DefaultConstructorMarker) null);
    }
}
