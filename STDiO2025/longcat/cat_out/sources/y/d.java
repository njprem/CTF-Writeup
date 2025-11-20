package y;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatelessInputConnection$commitContentDelegateInputConnection$1 f1060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StatelessInputConnection$terminalInputConnection$1 statelessInputConnection$terminalInputConnection$1, StatelessInputConnection$commitContentDelegateInputConnection$1 statelessInputConnection$commitContentDelegateInputConnection$1) {
        super(statelessInputConnection$terminalInputConnection$1, false);
        this.f1060a = statelessInputConnection$commitContentDelegateInputConnection$1;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        i iVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            iVar = new i(new g(inputContentInfo));
        }
        if (onCommitContent(iVar, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
