package androidx.core.view;

import android.view.View;

/* renamed from: androidx.core.view.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0554l {
    void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4);

    void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6);

    void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr);

    void onNestedScrollAccepted(View view, View view2, int i2, int i3);

    boolean onStartNestedScroll(View view, View view2, int i2, int i3);

    void onStopNestedScroll(View view, int i2);
}
