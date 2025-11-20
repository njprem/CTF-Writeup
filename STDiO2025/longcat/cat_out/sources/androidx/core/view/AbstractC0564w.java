package androidx.core.view;

import android.view.View;

/* renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0564w {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }
}
