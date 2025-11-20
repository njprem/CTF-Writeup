package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f455d;

    public H(View view, N n2, D d2, ValueAnimator valueAnimator) {
        this.f452a = view;
        this.f453b = n2;
        this.f454c = d2;
        this.f455d = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J.g(this.f452a, this.f453b, this.f454c);
        this.f455d.start();
    }
}
