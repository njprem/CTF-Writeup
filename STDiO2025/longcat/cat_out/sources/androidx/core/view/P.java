package androidx.core.view;

import android.view.WindowInsets;
import s.C0793c;

/* loaded from: classes.dex */
public class P extends U {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f476c;

    public P() {
        this.f476c = androidx.compose.ui.text.android.b.c();
    }

    @Override // androidx.core.view.U
    public e0 b() {
        a();
        e0 e0VarB = e0.b(null, this.f476c.build());
        e0VarB.f500a.p(this.f478b);
        return e0VarB;
    }

    @Override // androidx.core.view.U
    public void d(C0793c c0793c) {
        this.f476c.setMandatorySystemGestureInsets(c0793c.d());
    }

    @Override // androidx.core.view.U
    public void e(C0793c c0793c) {
        this.f476c.setSystemGestureInsets(c0793c.d());
    }

    @Override // androidx.core.view.U
    public void f(C0793c c0793c) {
        this.f476c.setSystemWindowInsets(c0793c.d());
    }

    @Override // androidx.core.view.U
    public void g(C0793c c0793c) {
        this.f476c.setTappableElementInsets(c0793c.d());
    }

    public P(e0 e0Var) {
        WindowInsets.Builder builderC;
        super(e0Var);
        WindowInsets windowInsetsA = e0Var.a();
        if (windowInsetsA != null) {
            builderC = androidx.compose.ui.text.android.b.d(windowInsetsA);
        } else {
            builderC = androidx.compose.ui.text.android.b.c();
        }
        this.f476c = builderC;
    }
}
