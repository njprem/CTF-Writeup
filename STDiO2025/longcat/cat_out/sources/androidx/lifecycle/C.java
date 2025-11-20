package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class C {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0581n event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (activity instanceof InterfaceC0587u) {
            AbstractC0583p lifecycle = ((InterfaceC0587u) activity).getLifecycle();
            if (lifecycle instanceof w) {
                ((w) lifecycle).e(event);
            }
        }
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            E.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
