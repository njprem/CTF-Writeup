package androidx.compose.ui.text.input;

import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "lengthBeforeCursor", "", "lengthAfterCursor", "(II)V", "getLengthAfterCursor", "()I", "getLengthBeforeCursor", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i2, int i3) {
        this.lengthBeforeCursor = i2;
        this.lengthAfterCursor = i3;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer buffer) {
        int i2 = this.lengthBeforeCursor;
        int i3 = 0;
        int i4 = 0;
        int selectionStart = 0;
        while (true) {
            if (i4 < i2) {
                int i5 = selectionStart + 1;
                if (buffer.getSelectionStart() <= i5) {
                    selectionStart = buffer.getSelectionStart();
                    break;
                } else {
                    selectionStart = EditCommandKt.isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionStart() - i5) + (-1)), buffer.get$ui_text_release(buffer.getSelectionStart() - i5)) ? selectionStart + 2 : i5;
                    i4++;
                }
            } else {
                break;
            }
        }
        int i6 = this.lengthAfterCursor;
        int length$ui_text_release = 0;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i7 = length$ui_text_release + 1;
            if (buffer.getSelectionEnd() + i7 >= buffer.getLength$ui_text_release()) {
                length$ui_text_release = buffer.getLength$ui_text_release() - buffer.getSelectionEnd();
                break;
            } else {
                length$ui_text_release = EditCommandKt.isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionEnd() + i7) + (-1)), buffer.get$ui_text_release(buffer.getSelectionEnd() + i7)) ? length$ui_text_release + 2 : i7;
                i3++;
            }
        }
        buffer.delete$ui_text_release(buffer.getSelectionEnd(), buffer.getSelectionEnd() + length$ui_text_release);
        buffer.delete$ui_text_release(buffer.getSelectionStart() - selectionStart, buffer.getSelectionStart());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return androidx.compose.runtime.changelist.a.o(sb, this.lengthAfterCursor, ')');
    }
}
