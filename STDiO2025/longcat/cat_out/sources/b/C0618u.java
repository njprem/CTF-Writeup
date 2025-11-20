package b;

import a.AbstractC0130a;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0618u extends C0617t {
    @Override // b.C0616s, a.AbstractC0131b
    public void y(C0597J statusBarStyle, C0597J navigationBarStyle, Window window, View view, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC0130a.p(window, false);
        statusBarStyle.getClass();
        window.setStatusBarColor(0);
        navigationBarStyle.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0130a i0Var = i2 >= 35 ? new i0(window) : i2 >= 30 ? new h0(window) : i2 >= 26 ? new g0(window) : new f0(window);
        i0Var.o(!z);
        i0Var.n(!z2);
    }
}
