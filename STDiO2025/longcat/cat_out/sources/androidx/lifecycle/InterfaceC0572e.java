package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0572e extends InterfaceC0586t {
    default void onCreate(InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onDestroy(InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onPause(InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    void onResume(InterfaceC0587u interfaceC0587u);

    default void onStart(InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStop(InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
