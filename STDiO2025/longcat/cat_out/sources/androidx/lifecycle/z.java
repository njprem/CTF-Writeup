package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.A;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z {
    public static final void a(Activity activity, A.a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
