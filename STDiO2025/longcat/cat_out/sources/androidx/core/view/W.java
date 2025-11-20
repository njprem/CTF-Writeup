package androidx.core.view;

import android.view.WindowInsets;
import s.C0793c;

/* loaded from: classes.dex */
public class W extends V {

    /* renamed from: n, reason: collision with root package name */
    public C0793c f489n;

    public W(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
        this.f489n = null;
    }

    @Override // androidx.core.view.b0
    public e0 b() {
        return e0.b(null, this.f483c.consumeStableInsets());
    }

    @Override // androidx.core.view.b0
    public e0 c() {
        return e0.b(null, this.f483c.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.b0
    public final C0793c i() {
        if (this.f489n == null) {
            WindowInsets windowInsets = this.f483c;
            this.f489n = C0793c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f489n;
    }

    @Override // androidx.core.view.b0
    public boolean m() {
        return this.f483c.isConsumed();
    }

    @Override // androidx.core.view.b0
    public void r(C0793c c0793c) {
        this.f489n = c0793c;
    }
}
