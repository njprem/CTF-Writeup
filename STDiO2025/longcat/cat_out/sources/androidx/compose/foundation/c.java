package androidx.compose.foundation;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ LineBreakConfig.Builder a() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout e(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f2, float f3, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i3) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, f2, f3, metrics, z, truncateAt, i3, z2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener f(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder i() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback l(Object obj) {
        return (OnBackInvokedCallback) obj;
    }
}
