package androidx.core.view;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class g0 extends f0 {
    @Override // a.AbstractC0130a
    public final void n(boolean z) {
        Window window = this.f501a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
