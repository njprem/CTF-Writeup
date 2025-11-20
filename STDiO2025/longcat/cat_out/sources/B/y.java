package B;

import a.AbstractC0131b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f132a;

    /* renamed from: b, reason: collision with root package name */
    public final v.e f133b;

    /* renamed from: c, reason: collision with root package name */
    public final C0127d f134c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f135d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f136e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f137f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f138g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0131b f139h;

    public y(Context context, v.e eVar) {
        C0127d c0127d = z.f140d;
        this.f135d = new Object();
        AbstractC0131b.h(context, "Context cannot be null");
        this.f132a = context.getApplicationContext();
        this.f133b = eVar;
        this.f134c = c0127d;
    }

    public final void a() {
        synchronized (this.f135d) {
            try {
                this.f139h = null;
                Handler handler = this.f136e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f136e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f138g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f137f = null;
                this.f138g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v.k b() {
        try {
            C0127d c0127d = this.f134c;
            Context context = this.f132a;
            v.e eVar = this.f133b;
            c0127d.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            v.j jVarA = v.d.a(context, Collections.unmodifiableList(arrayList));
            int i2 = jVarA.f1025a;
            if (i2 != 0) {
                throw new RuntimeException(J.d.l(i2, "fetchFonts failed (", ")"));
            }
            v.k[] kVarArr = (v.k[]) jVarA.f1026b.get(0);
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // B.k
    public final void e(AbstractC0131b abstractC0131b) {
        synchronized (this.f135d) {
            this.f139h = abstractC0131b;
        }
        synchronized (this.f135d) {
            try {
                if (this.f139h == null) {
                    return;
                }
                if (this.f137f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0124a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f138g = threadPoolExecutor;
                    this.f137f = threadPoolExecutor;
                }
                this.f137f.execute(new x(this, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
