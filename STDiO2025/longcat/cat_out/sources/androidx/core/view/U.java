package androidx.core.view;

import a.AbstractC0131b;
import s.C0793c;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f477a;

    /* renamed from: b, reason: collision with root package name */
    public C0793c[] f478b;

    public U() {
        this(new e0());
    }

    public final void a() {
        C0793c[] c0793cArr = this.f478b;
        if (c0793cArr != null) {
            C0793c c0793cF = c0793cArr[0];
            C0793c c0793cF2 = c0793cArr[1];
            e0 e0Var = this.f477a;
            if (c0793cF2 == null) {
                c0793cF2 = e0Var.f500a.f(2);
            }
            if (c0793cF == null) {
                c0793cF = e0Var.f500a.f(1);
            }
            f(C0793c.a(c0793cF, c0793cF2));
            C0793c c0793c = this.f478b[AbstractC0131b.q(16)];
            if (c0793c != null) {
                e(c0793c);
            }
            C0793c c0793c2 = this.f478b[AbstractC0131b.q(32)];
            if (c0793c2 != null) {
                d(c0793c2);
            }
            C0793c c0793c3 = this.f478b[AbstractC0131b.q(64)];
            if (c0793c3 != null) {
                g(c0793c3);
            }
        }
    }

    public abstract e0 b();

    public void c(int i2, C0793c c0793c) {
        if (this.f478b == null) {
            this.f478b = new C0793c[10];
        }
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.f478b[AbstractC0131b.q(i3)] = c0793c;
            }
        }
    }

    public abstract void f(C0793c c0793c);

    public U(e0 e0Var) {
        this.f477a = e0Var;
    }

    public void d(C0793c c0793c) {
    }

    public void e(C0793c c0793c) {
    }

    public void g(C0793c c0793c) {
    }
}
