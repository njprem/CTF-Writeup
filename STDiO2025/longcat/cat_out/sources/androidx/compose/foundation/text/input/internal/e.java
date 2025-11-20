package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture f(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture g(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture h(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture i(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture j(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture k(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return JoinOrSplitGesture.class;
    }
}
