package L;

import B.C0127d;
import K.f;
import K.h;
import android.os.Bundle;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.w;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f244a;

    /* renamed from: b, reason: collision with root package name */
    public final f f245b;

    /* renamed from: c, reason: collision with root package name */
    public final C0127d f246c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f247d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f248e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f249f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f250g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f251h;

    public b(h owner, f onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f244a = owner;
        this.f245b = onAttach;
        this.f246c = new C0127d(10);
        this.f247d = new LinkedHashMap();
        this.f251h = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void a() {
        ?? r0 = this.f244a;
        if (((w) r0.getLifecycle()).f598c != EnumC0582o.f587b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f248e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f245b.invoke();
        r0.getLifecycle().a(new a(this, 0));
        this.f248e = true;
    }
}
