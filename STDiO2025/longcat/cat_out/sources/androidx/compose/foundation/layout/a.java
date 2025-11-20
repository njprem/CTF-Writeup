package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ WindowInsetsAnimation.Bounds f(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation g(int i2, Interpolator interpolator, long j2) {
        return new WindowInsetsAnimation(i2, interpolator, j2);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation h(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimationControlListener i(Object obj) {
        return (WindowInsetsAnimationControlListener) obj;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimationController j(Object obj) {
        return (WindowInsetsAnimationController) obj;
    }

    public static /* synthetic */ void l() {
    }
}
