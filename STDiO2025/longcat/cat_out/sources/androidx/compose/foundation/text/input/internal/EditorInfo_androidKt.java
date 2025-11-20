package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a@\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "contentMimeTypes", "", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m1102updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i2 = 3;
        int i3 = 6;
        if (ImeAction.m5885equalsimpl0(imeAction, companion.m5898getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i3 = 0;
            }
        } else if (ImeAction.m5885equalsimpl0(imeAction, companion.m5902getNoneeUduSuo())) {
            i3 = 1;
        } else if (ImeAction.m5885equalsimpl0(imeAction, companion.m5900getGoeUduSuo())) {
            i3 = 2;
        } else if (ImeAction.m5885equalsimpl0(imeAction, companion.m5901getNexteUduSuo())) {
            i3 = 5;
        } else if (ImeAction.m5885equalsimpl0(imeAction, companion.m5903getPreviouseUduSuo())) {
            i3 = 7;
        } else if (ImeAction.m5885equalsimpl0(imeAction, companion.m5904getSearcheUduSuo())) {
            i3 = 3;
        } else if (ImeAction.m5885equalsimpl0(imeAction, companion.m5905getSendeUduSuo())) {
            i3 = 4;
        } else if (!ImeAction.m5885equalsimpl0(imeAction, companion.m5899getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i3;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int i4 = Build.VERSION.SDK_INT;
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5959getTextPjHm6EE())) {
            i2 = 1;
        } else if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5952getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5955getNumberPjHm6EE())) {
            i2 = 2;
        } else if (!KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5958getPhonePjHm6EE())) {
            if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5961getUriPjHm6EE())) {
                i2 = 17;
            } else if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5954getEmailPjHm6EE())) {
                i2 = 33;
            } else if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5957getPasswordPjHm6EE())) {
                i2 = 129;
            } else if (KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5956getNumberPasswordPjHm6EE())) {
                i2 = 18;
            } else {
                if (!KeyboardType.m5938equalsimpl0(keyboardType, companion2.m5953getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i2 = 8194;
            }
        }
        editorInfo.inputType = i2;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= Fields.RenderEffect;
            if (ImeAction.m5885equalsimpl0(imeOptions.getImeAction(), companion.m5898getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m5921equalsimpl0(capitalization, companion3.m5930getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m5921equalsimpl0(capitalization, companion3.m5934getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m5921equalsimpl0(capitalization, companion3.m5932getSentencesIUNYP9k())) {
                editorInfo.inputType |= Fields.Clip;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= Fields.CompositingStrategy;
            }
        }
        editorInfo.initialSelStart = TextRange.m5721getStartimpl(j2);
        editorInfo.initialSelEnd = TextRange.m5716getEndimpl(j2);
        y.c.a(editorInfo, charSequence);
        if (strArr != null) {
            if (i4 >= 25) {
                editorInfo.contentMimeTypes = strArr;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            }
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m5938equalsimpl0(imeOptions.getKeyboardType(), companion2.m5957getPasswordPjHm6EE()) || KeyboardType.m5938equalsimpl0(imeOptions.getKeyboardType(), companion2.m5956getNumberPasswordPjHm6EE())) {
            y.c.b(editorInfo, false);
        } else {
            y.c.b(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m1103updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            strArr = null;
        }
        m1102updatepLxbY9I(editorInfo, charSequence, j2, imeOptions, strArr);
    }
}
