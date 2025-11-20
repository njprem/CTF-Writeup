package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589B implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0622y f609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0622y f610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0623z f611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0623z f612d;

    public C0589B(C0622y c0622y, C0622y c0622y2, C0623z c0623z, C0623z c0623z2) {
        this.f609a = c0622y;
        this.f610b = c0622y2;
        this.f611c = c0623z;
        this.f612d = c0623z2;
    }

    public final void onBackCancelled() {
        this.f612d.invoke();
    }

    public final void onBackInvoked() {
        this.f611c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f610b.invoke(new C0599b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f609a.invoke(new C0599b(backEvent));
    }
}
