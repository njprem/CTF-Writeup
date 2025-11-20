package b;

import android.graphics.Typeface;
import androidx.core.view.C0549g;
import stdio.cat.MainActivity;

/* renamed from: b.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0611n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f651c;

    public /* synthetic */ RunnableC0611n(int i2, Object obj, Object obj2) {
        this.f649a = i2;
        this.f650b = obj;
        this.f651c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f649a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f650b;
                mainActivity.getLifecycle().a(new C0549g(1, (C0593F) this.f651c, mainActivity));
                break;
            default:
                ((r.j) this.f650b).onFontRetrieved((Typeface) this.f651c);
                break;
        }
    }
}
