package androidx.core.view;

import a.AbstractC0130a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class h0 extends AbstractC0130a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f507a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f508b;

    public h0(Window window) {
        this.f507a = window.getInsetsController();
        this.f508b = window;
    }

    @Override // a.AbstractC0130a
    public final void n(boolean z) {
        Window window = this.f508b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f507a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f507a.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0130a
    public final void o(boolean z) {
        Window window = this.f508b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f507a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f507a.setSystemBarsAppearance(0, 8);
    }
}
