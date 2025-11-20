package androidx.core.view;

import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;

/* renamed from: androidx.core.view.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0545c {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper, androidx.compose.ui.graphics.layer.c cVar) {
        return Handler.createAsync(looper, cVar);
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
