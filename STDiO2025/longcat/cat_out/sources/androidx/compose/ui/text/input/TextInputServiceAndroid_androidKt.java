package androidx.compose.ui.text.input;

import B.l;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import y.c;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new a(runnable, 0));
    }

    private static final boolean hasFlag(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int iM5914getImeActioneUduSuo = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i2 = 6;
        if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5898getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5902getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5900getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5901getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5903getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5904getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5905getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m5885equalsimpl0(iM5914getImeActioneUduSuo, companion.m5899getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM5915getKeyboardTypePjHm6EE = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5959getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5952getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5955getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5958getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5961getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5954getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5957getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5956getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m5938equalsimpl0(iM5915getKeyboardTypePjHm6EE, companion2.m5953getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= Fields.RenderEffect;
            if (ImeAction.m5885equalsimpl0(imeOptions.getImeAction(), companion.m5898getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM5913getCapitalizationIUNYP9k = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m5921equalsimpl0(iM5913getCapitalizationIUNYP9k, companion3.m5930getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m5921equalsimpl0(iM5913getCapitalizationIUNYP9k, companion3.m5934getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m5921equalsimpl0(iM5913getCapitalizationIUNYP9k, companion3.m5932getSentencesIUNYP9k())) {
                editorInfo.inputType |= Fields.Clip;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= Fields.CompositingStrategy;
            }
        }
        editorInfo.initialSelStart = TextRange.m5721getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m5716getEndimpl(textFieldValue.getSelection());
        c.a(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (l.c()) {
            l.a().f(editorInfo);
        }
    }
}
