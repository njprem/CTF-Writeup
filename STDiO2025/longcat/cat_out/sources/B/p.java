package B;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class p implements k, t, J.f {

    /* renamed from: a, reason: collision with root package name */
    public Object f115a;

    public /* synthetic */ p(Object obj) {
        this.f115a = obj;
    }

    @Override // J.f
    public void b(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f115a).setResultCode(i2);
    }

    @Override // B.t
    public boolean c(CharSequence charSequence, int i2, int i3, C c2) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), (String) this.f115a)) {
            return true;
        }
        c2.f78c = (c2.f78c & 3) | 4;
        return false;
    }

    @Override // J.f
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // B.k
    public void e(final AbstractC0131b abstractC0131b) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0124a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: B.n
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = this.f110a;
                AbstractC0131b abstractC0131b2 = abstractC0131b;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                pVar.getClass();
                try {
                    z zVarD = AbstractC0130a.d((Context) pVar.f115a);
                    if (zVarD == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    y yVar = (y) zVarD.f141a;
                    synchronized (yVar.f135d) {
                        yVar.f137f = threadPoolExecutor2;
                    }
                    zVarD.f141a.e(new o(abstractC0131b2, threadPoolExecutor2));
                } catch (Throwable th) {
                    abstractC0131b2.t(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    public void f() {
        View view = (View) this.f115a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void g() {
        View viewFindViewById;
        View view = (View) this.f115a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new x(viewFindViewById, 4));
    }

    @Override // B.t
    public Object a() {
        return this;
    }
}
