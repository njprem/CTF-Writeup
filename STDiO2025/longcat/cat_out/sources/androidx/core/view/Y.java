package androidx.core.view;

import android.view.WindowInsets;
import s.C0793c;

/* loaded from: classes.dex */
public class Y extends X {

    /* renamed from: o, reason: collision with root package name */
    public C0793c f490o;

    /* renamed from: p, reason: collision with root package name */
    public C0793c f491p;

    /* renamed from: q, reason: collision with root package name */
    public C0793c f492q;

    public Y(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
        this.f490o = null;
        this.f491p = null;
        this.f492q = null;
    }

    @Override // androidx.core.view.b0
    public C0793c h() {
        if (this.f491p == null) {
            this.f491p = C0793c.c(this.f483c.getMandatorySystemGestureInsets());
        }
        return this.f491p;
    }

    @Override // androidx.core.view.b0
    public C0793c j() {
        if (this.f490o == null) {
            this.f490o = C0793c.c(this.f483c.getSystemGestureInsets());
        }
        return this.f490o;
    }

    @Override // androidx.core.view.b0
    public C0793c l() {
        if (this.f492q == null) {
            this.f492q = C0793c.c(this.f483c.getTappableElementInsets());
        }
        return this.f492q;
    }

    @Override // androidx.core.view.W, androidx.core.view.b0
    public void r(C0793c c0793c) {
    }
}
