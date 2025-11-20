package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import stdio.cat.R;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f458d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final E.a f459e = new E.a(E.a.f172c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f460f = new DecelerateInterpolator(1.5f);

    /* renamed from: g, reason: collision with root package name */
    public static final AccelerateInterpolator f461g = new AccelerateInterpolator(1.5f);

    public static void d(View view, N n2) {
        E eI = i(view);
        if (eI != null) {
            eI.onEnd(n2);
            if (eI.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                d(viewGroup.getChildAt(i2), n2);
            }
        }
    }

    public static void e(View view, N n2, e0 e0Var, boolean z) {
        E eI = i(view);
        if (eI != null) {
            eI.mDispachedInsets = e0Var;
            if (!z) {
                eI.onPrepare(n2);
                z = eI.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), n2, e0Var, z);
            }
        }
    }

    public static void f(View view, e0 e0Var, List list) {
        E eI = i(view);
        if (eI != null) {
            e0Var = eI.onProgress(e0Var, list);
            if (eI.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), e0Var, list);
            }
        }
    }

    public static void g(View view, N n2, D d2) {
        E eI = i(view);
        if (eI != null) {
            eI.onStart(n2, d2);
            if (eI.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), n2, d2);
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static E i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof I) {
            return ((I) tag).f456a;
        }
        return null;
    }
}
