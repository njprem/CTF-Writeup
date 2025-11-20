package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B implements InterfaceC0587u {

    /* renamed from: i, reason: collision with root package name */
    public static final B f537i = new B();

    /* renamed from: a, reason: collision with root package name */
    public int f538a;

    /* renamed from: b, reason: collision with root package name */
    public int f539b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f542e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f540c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f541d = true;

    /* renamed from: f, reason: collision with root package name */
    public final w f543f = new w(this);

    /* renamed from: g, reason: collision with root package name */
    public final B.x f544g = new B.x(this, 5);

    /* renamed from: h, reason: collision with root package name */
    public final B.p f545h = new B.p(this);

    public final void a() {
        int i2 = this.f539b + 1;
        this.f539b = i2;
        if (i2 == 1) {
            if (this.f540c) {
                this.f543f.e(EnumC0581n.ON_RESUME);
                this.f540c = false;
            } else {
                Handler handler = this.f542e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f544g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0587u
    public final AbstractC0583p getLifecycle() {
        return this.f543f;
    }
}
