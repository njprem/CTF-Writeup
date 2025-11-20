package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/E;", "Landroid/app/Fragment;", "<init>", "()V", "B/p", "a", "androidx/lifecycle/C", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class E extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f546b = 0;

    /* renamed from: a, reason: collision with root package name */
    public B.p f547a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final D Companion = new D();

        @JvmStatic
        public static final void registerIn(Activity activity) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = E.f546b;
            C.a(activity, EnumC0581n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = E.f546b;
            C.a(activity, EnumC0581n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = E.f546b;
            C.a(activity, EnumC0581n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = E.f546b;
            C.a(activity, EnumC0581n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = E.f546b;
            C.a(activity, EnumC0581n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = E.f546b;
            C.a(activity, EnumC0581n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public final void a(EnumC0581n enumC0581n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            C.a(activity, enumC0581n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0581n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0581n.ON_DESTROY);
        this.f547a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0581n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B.p pVar = this.f547a;
        if (pVar != null) {
            ((B) pVar.f115a).a();
        }
        a(EnumC0581n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B.p pVar = this.f547a;
        if (pVar != null) {
            B b2 = (B) pVar.f115a;
            int i2 = b2.f538a + 1;
            b2.f538a = i2;
            if (i2 == 1 && b2.f541d) {
                b2.f543f.e(EnumC0581n.ON_START);
                b2.f541d = false;
            }
        }
        a(EnumC0581n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0581n.ON_STOP);
    }
}
