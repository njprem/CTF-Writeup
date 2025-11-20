package B;

import a.AbstractC0131b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f95a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f96b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97c;

    public j(List list, int i2, Throwable th) {
        AbstractC0131b.h(list, "initCallbacks cannot be null");
        this.f95a = new ArrayList(list);
        this.f97c = i2;
        this.f96b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f95a;
        int size = arrayList.size();
        int i2 = 0;
        if (this.f97c != 1) {
            while (i2 < size) {
                ((i) arrayList.get(i2)).onFailed(this.f96b);
                i2++;
            }
        } else {
            while (i2 < size) {
                ((i) arrayList.get(i2)).onInitialized();
                i2++;
            }
        }
    }
}
