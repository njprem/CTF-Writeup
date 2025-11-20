package v;

import android.os.Process;

/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f1032a;

    public l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f1032a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f1032a);
        super.run();
    }
}
