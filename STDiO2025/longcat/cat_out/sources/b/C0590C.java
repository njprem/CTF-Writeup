package b;

import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590C implements InterfaceC0585s, InterfaceC0600c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0583p f613a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0621x f614b;

    /* renamed from: c, reason: collision with root package name */
    public C0591D f615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0593F f616d;

    public C0590C(C0593F c0593f, AbstractC0583p lifecycle, AbstractC0621x onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f616d = c0593f;
        this.f613a = lifecycle;
        this.f614b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // b.InterfaceC0600c
    public final void cancel() {
        this.f613a.b(this);
        AbstractC0621x abstractC0621x = this.f614b;
        abstractC0621x.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        abstractC0621x.f658b.remove(this);
        C0591D c0591d = this.f615c;
        if (c0591d != null) {
            c0591d.cancel();
        }
        this.f615c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0585s
    public final void onStateChanged(InterfaceC0587u source, EnumC0581n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != EnumC0581n.ON_START) {
            if (event != EnumC0581n.ON_STOP) {
                if (event == EnumC0581n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0591D c0591d = this.f615c;
                if (c0591d != null) {
                    c0591d.cancel();
                    return;
                }
                return;
            }
        }
        C0593F c0593f = this.f616d;
        AbstractC0621x onBackPressedCallback = this.f614b;
        c0593f.getClass();
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        c0593f.f621b.add(onBackPressedCallback);
        C0591D cancellable = new C0591D(c0593f, onBackPressedCallback);
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f658b.add(cancellable);
        c0593f.e();
        onBackPressedCallback.f659c = new C0592E(0, c0593f, C0593F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f615c = cancellable;
    }
}
