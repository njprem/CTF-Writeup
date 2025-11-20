package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f499b;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f500a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            f499b = a0.f495s;
        } else if (i2 >= 30) {
            f499b = Z.f493r;
        } else {
            f499b = b0.f496b;
        }
    }

    public e0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            this.f500a = new a0(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.f500a = new Z(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f500a = new Y(this, windowInsets);
        } else if (i2 >= 28) {
            this.f500a = new X(this, windowInsets);
        } else {
            this.f500a = new W(this, windowInsets);
        }
    }

    public static e0 b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        e0 e0Var = new e0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = AbstractC0567z.f532a;
            e0 e0VarA = AbstractC0563v.a(view);
            b0 b0Var = e0Var.f500a;
            b0Var.q(e0VarA);
            b0Var.d(view.getRootView());
            b0Var.s(view.getWindowSystemUiVisibility());
        }
        return e0Var;
    }

    public final WindowInsets a() {
        b0 b0Var = this.f500a;
        if (b0Var instanceof V) {
            return ((V) b0Var).f483c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return Objects.equals(this.f500a, ((e0) obj).f500a);
    }

    public final int hashCode() {
        b0 b0Var = this.f500a;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.hashCode();
    }

    public e0() {
        this.f500a = new b0(this);
    }
}
