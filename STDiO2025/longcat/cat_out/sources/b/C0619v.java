package b;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619v extends C0618u {
    @Override // b.C0617t, a.AbstractC0131b
    public void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
