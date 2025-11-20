package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import y.h;
import y.i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0081T¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroid/view/inputmethod/ExtractedText;", "toExtractedText", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Landroid/view/inputmethod/ExtractedText;", "Ly/i;", "Landroid/os/Bundle;", "extras", "Landroidx/compose/foundation/content/TransferableContent;", "toTransferableContent", "(Ly/i;Landroid/os/Bundle;)Landroidx/compose/foundation/content/TransferableContent;", "", "SIC_DEBUG", "Z", "getSIC_DEBUG$annotations", "()V", "", "STATELESS_TAG", "Ljava/lang/String;", "DEBUG_CLASS", StatelessInputConnection_androidKt.EXTRA_INPUT_CONTENT_INFO, "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatelessInputConnection_androidKt {
    private static final String DEBUG_CLASS = "StatelessInputConnection";
    private static final String EXTRA_INPUT_CONTENT_INFO = "EXTRA_INPUT_CONTENT_INFO";
    public static final boolean SIC_DEBUG = false;
    private static final String STATELESS_TAG = "StatelessIC";

    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m5719getMinimpl(textFieldCharSequence.getSelection());
        extractedText.selectionEnd = TextRange.m5718getMaximpl(textFieldCharSequence.getSelection());
        extractedText.flags = !StringsKt__StringsKt.contains$default((CharSequence) textFieldCharSequence, '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }

    public static final TransferableContent toTransferableContent(i iVar, Bundle bundle) {
        ClipDescription clipDescriptionA = iVar.f1063a.a();
        h hVar = iVar.f1063a;
        ClipEntry clipEntry = AndroidClipboardManager_androidKt.toClipEntry(new ClipData(clipDescriptionA, new ClipData.Item(hVar.c())));
        int iM299getKeyboardkB6V9T0 = TransferableContent.Source.INSTANCE.m299getKeyboardkB6V9T0();
        ClipMetadata clipMetadata = AndroidClipboardManager_androidKt.toClipMetadata(hVar.a());
        Uri uriE = hVar.e();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new TransferableContent(clipEntry, clipMetadata, iM299getKeyboardkB6V9T0, new PlatformTransferableContent(uriE, bundle), null);
    }
}
