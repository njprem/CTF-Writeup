package b;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0617t extends C0616s {
    @Override // a.AbstractC0131b
    public void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
