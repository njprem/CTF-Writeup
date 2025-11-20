package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import s.C0793c;

/* loaded from: classes.dex */
public final class F implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f449e;

    public F(N n2, e0 e0Var, e0 e0Var2, int i2, View view) {
        this.f445a = n2;
        this.f446b = e0Var;
        this.f447c = e0Var2;
        this.f448d = i2;
        this.f449e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        N n2 = this.f445a;
        n2.f470a.c(animatedFraction);
        float fB = n2.f470a.b();
        PathInterpolator pathInterpolator = J.f458d;
        int i2 = Build.VERSION.SDK_INT;
        e0 e0Var = this.f446b;
        U t = i2 >= 34 ? new T(e0Var) : i2 >= 30 ? new S(e0Var) : i2 >= 29 ? new P(e0Var) : new O(e0Var);
        int i3 = 1;
        while (i3 <= 512) {
            int i4 = this.f448d & i3;
            b0 b0Var = e0Var.f500a;
            if (i4 == 0) {
                t.c(i3, b0Var.f(i3));
                f2 = fB;
            } else {
                C0793c c0793cF = b0Var.f(i3);
                C0793c c0793cF2 = this.f447c.f500a.f(i3);
                int i5 = c0793cF.f975a;
                float f3 = 1.0f - fB;
                int i6 = (int) (((i5 - c0793cF2.f975a) * f3) + 0.5d);
                int i7 = c0793cF2.f976b;
                int i8 = c0793cF.f976b;
                f2 = fB;
                int i9 = (int) (((i8 - i7) * f3) + 0.5d);
                int i10 = c0793cF2.f977c;
                int i11 = c0793cF.f977c;
                int i12 = (int) (((i11 - i10) * f3) + 0.5d);
                int i13 = c0793cF2.f978d;
                int i14 = c0793cF.f978d;
                int i15 = (int) (((i14 - i13) * f3) + 0.5d);
                int iMax = Math.max(0, i5 - i6);
                int iMax2 = Math.max(0, i8 - i9);
                int iMax3 = Math.max(0, i11 - i12);
                int iMax4 = Math.max(0, i14 - i15);
                t.c(i3, (iMax == i6 && iMax2 == i9 && iMax3 == i12 && iMax4 == i15) ? c0793cF : C0793c.b(iMax, iMax2, iMax3, iMax4));
            }
            i3 <<= 1;
            fB = f2;
        }
        J.f(this.f449e, t.b(), Collections.singletonList(n2));
    }
}
