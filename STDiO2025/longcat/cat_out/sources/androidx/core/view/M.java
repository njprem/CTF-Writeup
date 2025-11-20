package androidx.core.view;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public float f467a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f468b;

    /* renamed from: c, reason: collision with root package name */
    public final long f469c;

    public M(Interpolator interpolator, long j2) {
        this.f468b = interpolator;
        this.f469c = j2;
    }

    public long a() {
        return this.f469c;
    }

    public float b() {
        Interpolator interpolator = this.f468b;
        return interpolator != null ? interpolator.getInterpolation(this.f467a) : this.f467a;
    }

    public void c(float f2) {
        this.f467a = f2;
    }
}
