package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class X extends W {
    public X(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // androidx.core.view.b0
    public e0 a() {
        return e0.b(null, this.f483c.consumeDisplayCutout());
    }

    @Override // androidx.core.view.b0
    public C0547e e() {
        DisplayCutout displayCutout = this.f483c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0547e(displayCutout);
    }

    @Override // androidx.core.view.V, androidx.core.view.b0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x2 = (X) obj;
        return Objects.equals(this.f483c, x2.f483c) && Objects.equals(this.f487g, x2.f487g) && V.A(this.f488h, x2.f488h);
    }

    @Override // androidx.core.view.b0
    public int hashCode() {
        return this.f483c.hashCode();
    }
}
