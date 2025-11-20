package androidx.compose.foundation.text.input.internal;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectGesture;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ GraphemeClusterSegmentFinder i(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder j(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture k(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture l(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof SelectGesture;
    }
}
