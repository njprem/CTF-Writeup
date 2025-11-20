package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import java.util.WeakHashMap;
import stdio.cat.R;

/* renamed from: androidx.core.view.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0567z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f532a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, AbstractC0544b abstractC0544b) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC0544b.getBridge());
    }

    public static void b(View view, E e2) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(e2 != null ? new K(e2) : null);
            return;
        }
        PathInterpolator pathInterpolator = J.f458d;
        View.OnApplyWindowInsetsListener i2 = e2 != null ? new I(view, e2) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, i2);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(i2);
        }
    }
}
