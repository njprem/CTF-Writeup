package v;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public g f1034a;

    /* renamed from: b, reason: collision with root package name */
    public f f1035b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1036c;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f1034a.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f1036c.post(new a(1, this.f1035b, objCall));
    }
}
