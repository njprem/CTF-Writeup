package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0785a f912b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0785a f913c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f914a;

    static {
        if (g.f925d) {
            f913c = null;
            f912b = null;
        } else {
            f913c = new C0785a(false, null);
            f912b = new C0785a(true, null);
        }
    }

    public C0785a(boolean z, CancellationException cancellationException) {
        this.f914a = cancellationException;
    }
}
