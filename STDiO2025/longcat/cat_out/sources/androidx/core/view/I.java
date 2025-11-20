package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import s.C0793c;

/* loaded from: classes.dex */
public final class I implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final E f456a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f457b;

    public I(View view, E e2) {
        e0 e0VarB;
        this.f456a = e2;
        int i2 = AbstractC0567z.f532a;
        e0 e0VarA = AbstractC0563v.a(view);
        if (e0VarA != null) {
            int i3 = Build.VERSION.SDK_INT;
            e0VarB = (i3 >= 34 ? new T(e0VarA) : i3 >= 30 ? new S(e0VarA) : i3 >= 29 ? new P(e0VarA) : new O(e0VarA)).b();
        } else {
            e0VarB = null;
        }
        this.f457b = e0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        b0 b0Var;
        boolean z = true;
        if (!view.isLaidOut()) {
            this.f457b = e0.b(view, windowInsets);
            return J.h(view, windowInsets);
        }
        e0 e0VarB = e0.b(view, windowInsets);
        if (this.f457b == null) {
            int i2 = AbstractC0567z.f532a;
            this.f457b = AbstractC0563v.a(view);
        }
        if (this.f457b == null) {
            this.f457b = e0VarB;
            return J.h(view, windowInsets);
        }
        E eI = J.i(view);
        if (eI != null && Objects.equals(eI.mDispachedInsets, e0VarB)) {
            return J.h(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        e0 e0Var = this.f457b;
        int i3 = 1;
        while (true) {
            b0Var = e0VarB.f500a;
            if (i3 > 512) {
                break;
            }
            C0793c c0793cF = b0Var.f(i3);
            C0793c c0793cF2 = e0Var.f500a.f(i3);
            int i4 = c0793cF.f975a;
            int i5 = c0793cF2.f975a;
            int i6 = c0793cF.f978d;
            int i7 = c0793cF.f977c;
            int i8 = c0793cF.f976b;
            int i9 = c0793cF2.f978d;
            boolean z2 = z;
            int i10 = c0793cF2.f977c;
            int i11 = c0793cF2.f976b;
            boolean z3 = (i4 > i5 || i8 > i11 || i7 > i10 || i6 > i9) ? z2 : false;
            if (z3 != ((i4 < i5 || i8 < i11 || i7 < i10 || i6 < i9) ? z2 : false)) {
                if (z3) {
                    iArr[0] = iArr[0] | i3;
                } else {
                    iArr2[0] = iArr2[0] | i3;
                }
            }
            i3 <<= 1;
            z = z2;
        }
        int i12 = iArr[0];
        int i13 = iArr2[0];
        int i14 = i12 | i13;
        if (i14 == 0) {
            this.f457b = e0VarB;
            return J.h(view, windowInsets);
        }
        e0 e0Var2 = this.f457b;
        N n2 = new N(i14, (i12 & 8) != 0 ? J.f458d : (i13 & 8) != 0 ? J.f459e : (i12 & 519) != 0 ? J.f460f : (i13 & 519) != 0 ? J.f461g : null, (i14 & 8) != 0 ? 160L : 250L);
        n2.f470a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n2.f470a.a());
        C0793c c0793cF3 = b0Var.f(i14);
        C0793c c0793cF4 = e0Var2.f500a.f(i14);
        int iMin = Math.min(c0793cF3.f975a, c0793cF4.f975a);
        int i15 = c0793cF3.f976b;
        int i16 = c0793cF4.f976b;
        int iMin2 = Math.min(i15, i16);
        int i17 = c0793cF3.f977c;
        int i18 = c0793cF4.f977c;
        int iMin3 = Math.min(i17, i18);
        int i19 = c0793cF3.f978d;
        int i20 = c0793cF4.f978d;
        D d2 = new D(C0793c.b(iMin, iMin2, iMin3, Math.min(i19, i20)), C0793c.b(Math.max(c0793cF3.f975a, c0793cF4.f975a), Math.max(i15, i16), Math.max(i17, i18), Math.max(i19, i20)));
        J.e(view, n2, e0VarB, false);
        duration.addUpdateListener(new F(n2, e0VarB, e0Var2, i14, view));
        duration.addListener(new G(view, n2));
        ViewTreeObserverOnPreDrawListenerC0557o viewTreeObserverOnPreDrawListenerC0557o = new ViewTreeObserverOnPreDrawListenerC0557o(view, new H(view, n2, d2, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0557o);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0557o);
        this.f457b = e0VarB;
        return J.h(view, windowInsets);
    }
}
