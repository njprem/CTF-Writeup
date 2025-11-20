package r;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f962a = 0;

    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static Typeface a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, new TypedValue(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r10, int r11, android.util.TypedValue r12, androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1 r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.k.b(android.content.Context, int, android.util.TypedValue, androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1):android.graphics.Typeface");
    }
}
