package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f334b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f333a = i2;
        this.f334b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f333a) {
            case 0:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9((TextFieldSelectionManager) this.f334b);
                break;
            default:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1((TransformedTextFieldState) this.f334b);
                break;
        }
    }
}
