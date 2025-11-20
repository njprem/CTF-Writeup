package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class L extends M {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f466d;

    public L(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f466d = windowInsetsAnimation;
    }

    @Override // androidx.core.view.M
    public final long a() {
        return this.f466d.getDurationMillis();
    }

    @Override // androidx.core.view.M
    public final float b() {
        return this.f466d.getInterpolatedFraction();
    }

    @Override // androidx.core.view.M
    public final void c(float f2) {
        this.f466d.setFraction(f2);
    }
}
