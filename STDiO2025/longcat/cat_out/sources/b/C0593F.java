package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.InterfaceC0587u;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593F {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f620a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f621b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0621x f622c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f623d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f624e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f625f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f626g;

    public C0593F(Runnable runnable) {
        OnBackInvokedCallback c0589b;
        this.f620a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (i2 >= 34) {
                C0622y onBackStarted = new C0622y(this, 0);
                C0622y onBackProgressed = new C0622y(this, 1);
                C0623z onBackInvoked = new C0623z(this, 0);
                C0623z onBackCancelled = new C0623z(this, 1);
                Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
                Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
                Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
                Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
                c0589b = new C0589B(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
            } else {
                final C0623z onBackInvoked2 = new C0623z(this, 2);
                Intrinsics.checkNotNullParameter(onBackInvoked2, "onBackInvoked");
                c0589b = new OnBackInvokedCallback() { // from class: b.A
                    public final void onBackInvoked() {
                        onBackInvoked2.invoke();
                    }
                };
            }
            this.f623d = c0589b;
        }
    }

    public final void a(InterfaceC0587u owner, AbstractC0621x onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0583p lifecycle = owner.getLifecycle();
        if (((androidx.lifecycle.w) lifecycle).f598c == EnumC0582o.f586a) {
            return;
        }
        C0590C cancellable = new C0590C(this, lifecycle, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f658b.add(cancellable);
        e();
        onBackPressedCallback.f659c = new C0592E(0, this, C0593F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        AbstractC0621x abstractC0621xPrevious;
        AbstractC0621x abstractC0621x = this.f622c;
        if (abstractC0621x == null) {
            ArrayDeque arrayDeque = this.f621b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0621xPrevious = 0;
                    break;
                } else {
                    abstractC0621xPrevious = listIterator.previous();
                    if (((AbstractC0621x) abstractC0621xPrevious).f657a) {
                        break;
                    }
                }
            }
            abstractC0621x = abstractC0621xPrevious;
        }
        this.f622c = null;
        if (abstractC0621x != null) {
            abstractC0621x.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        AbstractC0621x abstractC0621xPrevious;
        AbstractC0621x abstractC0621x = this.f622c;
        if (abstractC0621x == null) {
            ArrayDeque arrayDeque = this.f621b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0621xPrevious = 0;
                    break;
                } else {
                    abstractC0621xPrevious = listIterator.previous();
                    if (((AbstractC0621x) abstractC0621xPrevious).f657a) {
                        break;
                    }
                }
            }
            abstractC0621x = abstractC0621xPrevious;
        }
        this.f622c = null;
        if (abstractC0621x != null) {
            abstractC0621x.b();
        } else {
            this.f620a.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f624e;
        OnBackInvokedCallback onBackInvokedCallback = this.f623d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.f625f) {
            AbstractC0604g.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f625f = true;
        } else {
            if (z || !this.f625f) {
                return;
            }
            AbstractC0604g.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f625f = false;
        }
    }

    public final void e() {
        boolean z = this.f626g;
        boolean z2 = false;
        ArrayDeque arrayDeque = this.f621b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0621x) it.next()).f657a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f626g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }
}
