package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public M f470a;

    public N(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f470a = new L(androidx.compose.foundation.layout.a.g(i2, interpolator, j2));
        } else {
            this.f470a = new J(interpolator, j2);
        }
    }
}
