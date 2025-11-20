package B;

import a.AbstractC0131b;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class o extends AbstractC0131b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0131b f113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f114f;

    public o(AbstractC0131b abstractC0131b, ThreadPoolExecutor threadPoolExecutor) {
        this.f113e = abstractC0131b;
        this.f114f = threadPoolExecutor;
    }

    @Override // a.AbstractC0131b
    public final void t(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f114f;
        try {
            this.f113e.t(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.AbstractC0131b
    public final void u(B b2) {
        ThreadPoolExecutor threadPoolExecutor = this.f114f;
        try {
            this.f113e.u(b2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
