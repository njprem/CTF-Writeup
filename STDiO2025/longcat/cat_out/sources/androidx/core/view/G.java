package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f451b;

    public G(View view, N n2) {
        this.f450a = n2;
        this.f451b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        N n2 = this.f450a;
        n2.f470a.c(1.0f);
        J.d(this.f451b, n2);
    }
}
