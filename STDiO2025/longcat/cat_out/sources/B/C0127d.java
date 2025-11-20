package B;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import java.io.Serializable;

/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0127d implements J.f {

    /* renamed from: b, reason: collision with root package name */
    public static C0127d f87b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88a;

    public Signature[] a(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // J.f
    public void b(int i2, Serializable serializable) {
        String str;
        switch (this.f88a) {
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                break;
            default:
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
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    public boolean c(CharSequence charSequence) {
        return false;
    }

    @Override // J.f
    public void d() {
        switch (this.f88a) {
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    private final void e() {
    }

    private final void f(int i2, Serializable serializable) {
    }
}
