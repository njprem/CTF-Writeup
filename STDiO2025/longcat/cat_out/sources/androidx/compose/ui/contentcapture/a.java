package androidx.compose.ui.contentcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ScrollCaptureSession g(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget h(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationCallback l(Object obj) {
        return (ViewTranslationCallback) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder m(AutofillId autofillId, long j2) {
        return new ViewTranslationRequest.Builder(autofillId, j2);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse o(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void q() {
    }
}
