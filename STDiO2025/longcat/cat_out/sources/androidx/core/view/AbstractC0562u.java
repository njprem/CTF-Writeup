package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import stdio.cat.R;

/* renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0562u {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void b(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void c(View view, InterfaceC0556n interfaceC0556n) {
        ViewOnApplyWindowInsetsListenerC0561t viewOnApplyWindowInsetsListenerC0561t = interfaceC0556n != null ? new ViewOnApplyWindowInsetsListenerC0561t(view, interfaceC0556n) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC0561t);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC0561t != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0561t);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void d(View view) {
        view.stopNestedScroll();
    }
}
