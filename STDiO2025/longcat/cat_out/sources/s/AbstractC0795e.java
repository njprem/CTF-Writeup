package s;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import j.C0635A;
import java.lang.reflect.Method;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0795e {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0130a f980a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0635A f981b;

    static {
        AbstractC0131b.d("TypefaceCompat static init");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f980a = new j();
        } else if (i2 >= 28) {
            f980a = new i();
        } else if (i2 >= 26) {
            f980a = new h();
        } else {
            Method method = C0797g.f989c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f980a = new C0797g();
            } else {
                f980a = new C0796f();
            }
        }
        f981b = new C0635A(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r9, r.e r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14, androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1 r15) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.AbstractC0795e.a(android.content.Context, r.e, android.content.res.Resources, int, java.lang.String, int, androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i2, String str, int i3) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + "-0";
    }
}
