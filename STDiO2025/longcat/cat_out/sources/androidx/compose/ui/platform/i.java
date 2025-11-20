package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ RenderNode c() {
        return new RenderNode("Compose");
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession d(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
