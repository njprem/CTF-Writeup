package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a&\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0001\u001a\u0012\u0010\r\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0006\u001a\u0012\u0010\u000f\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"TextFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "initialValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "rememberTextFieldState", "initialText", "", "initialSelection", "Landroidx/compose/ui/text/TextRange;", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;", "clearText", "", "setTextAndPlaceCursorAtEnd", "text", "setTextAndSelectAll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldStateKt {
    public static final TextFieldState TextFieldState(TextFieldValue textFieldValue) {
        return new TextFieldState(textFieldValue.getText(), textFieldValue.getSelection(), (DefaultConstructorMarker) null);
    }

    public static final void clearText(TextFieldState textFieldState) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            TextFieldBufferKt.delete(textFieldBufferStartEdit, 0, textFieldBufferStartEdit.getLength());
            TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m1072rememberTextFieldStateLepunE(final String str, final long j2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        if ((i3 & 2) != 0) {
            j2 = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1125389485, i2, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:620)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(str)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(j2)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TextFieldState>() { // from class: androidx.compose.foundation.text.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TextFieldState invoke() {
                    return new TextFieldState(str, j2, (DefaultConstructorMarker) null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m3378rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldState;
    }

    public static final void setTextAndPlaceCursorAtEnd(TextFieldState textFieldState, String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
            TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(TextFieldState textFieldState, String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
        try {
            textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
            TextFieldBufferKt.selectAll(textFieldBufferStartEdit);
            textFieldState.commitEdit(textFieldBufferStartEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }
}
