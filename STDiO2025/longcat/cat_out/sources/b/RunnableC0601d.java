package b;

import kotlin.jvm.internal.Intrinsics;
import stdio.cat.MainActivity;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0601d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f637b;

    public /* synthetic */ RunnableC0601d(MainActivity mainActivity, int i2) {
        this.f636a = i2;
        this.f637b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f636a) {
            case 0:
                this.f637b.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!Intrinsics.areEqual(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!Intrinsics.areEqual(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
