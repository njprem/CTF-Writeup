package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G implements InterfaceC0585s, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f549a;

    /* renamed from: b, reason: collision with root package name */
    public final F f550b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f551c;

    public G(String key, F handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f549a = key;
        this.f550b = handle;
    }

    public final void a(K.e registry, AbstractC0583p lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f551c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f551c = true;
        lifecycle.a(this);
        registry.b(this.f549a, this.f550b.f548a.f182e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0585s
    public final void onStateChanged(InterfaceC0587u source, EnumC0581n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0581n.ON_DESTROY) {
            this.f551c = false;
            source.getLifecycle().b(this);
        }
    }
}
