package B;

import android.os.Trace;

/* loaded from: classes.dex */
public final class q implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = u.b.f998a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.c()) {
                l.a().d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i3 = u.b.f998a;
            Trace.endSection();
            throw th;
        }
    }
}
