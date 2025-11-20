package b;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615r extends AbstractC0131b {
    @Override // a.AbstractC0131b
    public void y(C0597J statusBarStyle, C0597J navigationBarStyle, Window window, View view, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC0130a.p(window, false);
        window.setStatusBarColor(z ? statusBarStyle.f630b : statusBarStyle.f629a);
        window.setNavigationBarColor(navigationBarStyle.f630b);
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 35 ? new i0(window) : i2 >= 30 ? new h0(window) : i2 >= 26 ? new g0(window) : new f0(window)).o(!z);
    }
}
