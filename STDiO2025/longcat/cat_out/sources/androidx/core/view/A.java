package androidx.core.view;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class A {
    public static float a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
