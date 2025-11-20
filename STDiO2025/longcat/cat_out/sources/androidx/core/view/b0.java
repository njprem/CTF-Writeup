package androidx.core.view;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import s.C0793c;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f496b;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f497a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f496b = (i2 >= 34 ? new T() : i2 >= 30 ? new S() : i2 >= 29 ? new P() : new O()).b().f500a.a().f500a.b().f500a.c();
    }

    public b0(e0 e0Var) {
        this.f497a = e0Var;
    }

    public e0 a() {
        return this.f497a;
    }

    public e0 b() {
        return this.f497a;
    }

    public e0 c() {
        return this.f497a;
    }

    public void d(View view) {
    }

    public C0547e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return n() == b0Var.n() && m() == b0Var.m() && Objects.equals(k(), b0Var.k()) && Objects.equals(i(), b0Var.i()) && Objects.equals(e(), b0Var.e());
    }

    public C0793c f(int i2) {
        return C0793c.f974e;
    }

    public C0793c g(int i2) {
        if ((i2 & 8) == 0) {
            return C0793c.f974e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C0793c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public C0793c i() {
        return C0793c.f974e;
    }

    public C0793c j() {
        return k();
    }

    public C0793c k() {
        return C0793c.f974e;
    }

    public C0793c l() {
        return k();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i2) {
        return true;
    }

    public void q(e0 e0Var) {
    }

    public void s(int i2) {
    }

    public void p(C0793c[] c0793cArr) {
    }

    public void r(C0793c c0793c) {
    }
}
