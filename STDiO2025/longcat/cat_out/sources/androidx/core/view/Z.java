package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import s.C0793c;

/* loaded from: classes.dex */
public class Z extends Y {

    /* renamed from: r, reason: collision with root package name */
    public static final e0 f493r = e0.b(null, WindowInsets.CONSUMED);

    public Z(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // androidx.core.view.V, androidx.core.view.b0
    public final void d(View view) {
    }

    @Override // androidx.core.view.V, androidx.core.view.b0
    public C0793c f(int i2) {
        return C0793c.c(this.f483c.getInsets(c0.a(i2)));
    }

    @Override // androidx.core.view.V, androidx.core.view.b0
    public C0793c g(int i2) {
        return C0793c.c(this.f483c.getInsetsIgnoringVisibility(c0.a(i2)));
    }

    @Override // androidx.core.view.V, androidx.core.view.b0
    public boolean o(int i2) {
        return this.f483c.isVisible(c0.a(i2));
    }
}
