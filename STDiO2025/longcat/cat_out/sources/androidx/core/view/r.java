package androidx.core.view;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final B.p f524a;

    public r(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f524a = new B.p(view);
            return;
        }
        C0559q c0559q = new C0559q(view);
        c0559q.f523b = view;
        this.f524a = c0559q;
    }
}
