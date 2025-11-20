package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import stdio.cat.MainActivity;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0608k implements InterfaceExecutorC0607j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f643a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f644b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f646d;

    public ViewTreeObserverOnDrawListenerC0608k(MainActivity mainActivity) {
        this.f646d = mainActivity;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f645c) {
            return;
        }
        this.f645c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f644b = runnable;
        View decorView = this.f646d.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f645c) {
            decorView.postOnAnimation(new B.x(this, 6));
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f644b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f643a) {
                this.f645c = false;
                this.f646d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f644b = null;
        C0620w fullyDrawnReporter = this.f646d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f654a) {
            z = fullyDrawnReporter.f655b;
        }
        if (z) {
            this.f645c = false;
            this.f646d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f646d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
