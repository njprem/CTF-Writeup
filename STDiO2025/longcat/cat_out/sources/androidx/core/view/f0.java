package androidx.core.view;

import a.AbstractC0130a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class f0 extends AbstractC0130a {

    /* renamed from: a, reason: collision with root package name */
    public final Window f501a;

    public f0(Window window) {
        this.f501a = window;
    }

    @Override // a.AbstractC0130a
    public final void o(boolean z) {
        Window window = this.f501a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
