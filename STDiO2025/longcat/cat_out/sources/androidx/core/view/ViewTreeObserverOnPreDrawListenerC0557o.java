package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0557o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f519a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f520b;

    /* renamed from: c, reason: collision with root package name */
    public final H f521c;

    public ViewTreeObserverOnPreDrawListenerC0557o(View view, H h2) {
        this.f519a = view;
        this.f520b = view.getViewTreeObserver();
        this.f521c = h2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f520b.isAlive();
        View view = this.f519a;
        if (zIsAlive) {
            this.f520b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f521c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f520b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f520b.isAlive();
        View view2 = this.f519a;
        if (zIsAlive) {
            this.f520b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
