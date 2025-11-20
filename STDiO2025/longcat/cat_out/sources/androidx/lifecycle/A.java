package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A extends AbstractC0575h {
    final /* synthetic */ B this$0;

    public static final class a extends AbstractC0575h {
        final /* synthetic */ B this$0;

        public a(B b2) {
            this.this$0 = b2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            B b2 = this.this$0;
            int i2 = b2.f538a + 1;
            b2.f538a = i2;
            if (i2 == 1 && b2.f541d) {
                b2.f543f.e(EnumC0581n.ON_START);
                b2.f541d = false;
            }
        }
    }

    public A(B b2) {
        this.this$0 = b2;
    }

    @Override // androidx.lifecycle.AbstractC0575h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = E.f546b;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((E) fragmentFindFragmentByTag).f547a = this.this$0.f545h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0575h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        B b2 = this.this$0;
        int i2 = b2.f539b - 1;
        b2.f539b = i2;
        if (i2 == 0) {
            Handler handler = b2.f542e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(b2.f544g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0575h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        B b2 = this.this$0;
        int i2 = b2.f538a - 1;
        b2.f538a = i2;
        if (i2 == 0 && b2.f540c) {
            b2.f543f.e(EnumC0581n.ON_STOP);
            b2.f541d = true;
        }
    }
}
