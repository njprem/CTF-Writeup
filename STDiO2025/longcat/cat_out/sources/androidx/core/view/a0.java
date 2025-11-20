package androidx.core.view;

import android.view.WindowInsets;
import s.C0793c;

/* loaded from: classes.dex */
public final class a0 extends Z {

    /* renamed from: s, reason: collision with root package name */
    public static final e0 f495s = e0.b(null, WindowInsets.CONSUMED);

    public a0(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // androidx.core.view.Z, androidx.core.view.V, androidx.core.view.b0
    public C0793c f(int i2) {
        return C0793c.c(this.f483c.getInsets(d0.a(i2)));
    }

    @Override // androidx.core.view.Z, androidx.core.view.V, androidx.core.view.b0
    public C0793c g(int i2) {
        return C0793c.c(this.f483c.getInsetsIgnoringVisibility(d0.a(i2)));
    }

    @Override // androidx.core.view.Z, androidx.core.view.V, androidx.core.view.b0
    public boolean o(int i2) {
        return this.f483c.isVisible(d0.a(i2));
    }
}
