package J;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f222b;

    public /* synthetic */ i(Context context, int i2) {
        this.f221a = i2;
        this.f222b = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        switch (this.f221a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i(this.f222b, 1));
                break;
            default:
                g.t(this.f222b, new e(), g.f209a, false);
                break;
        }
    }
}
