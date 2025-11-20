package y;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1;

/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatelessInputConnection$commitContentDelegateInputConnection$1 f1061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StatelessInputConnection$terminalInputConnection$1 statelessInputConnection$terminalInputConnection$1, StatelessInputConnection$commitContentDelegateInputConnection$1 statelessInputConnection$commitContentDelegateInputConnection$1) {
        super(statelessInputConnection$terminalInputConnection$1, false);
        this.f1061a = statelessInputConnection$commitContentDelegateInputConnection$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        Object[] objArr;
        ResultReceiver resultReceiver;
        StatelessInputConnection$commitContentDelegateInputConnection$1 statelessInputConnection$commitContentDelegateInputConnection$1 = this.f1061a;
        boolean zOnCommitContent = false;
        zOnCommitContent = false;
        zOnCommitContent = false;
        zOnCommitContent = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i2 = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        zOnCommitContent = statelessInputConnection$commitContentDelegateInputConnection$1.onCommitContent(new i(uri, clipDescription, uri2), i2, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zOnCommitContent ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (zOnCommitContent) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
