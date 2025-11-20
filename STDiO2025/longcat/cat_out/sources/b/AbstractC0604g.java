package b;

import android.app.Activity;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import e.C0629a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0604g {
    public static OnBackInvokedDispatcher a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0629a.class);
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void e(Object dispatcher, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    public static void f(Object dispatcher, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
