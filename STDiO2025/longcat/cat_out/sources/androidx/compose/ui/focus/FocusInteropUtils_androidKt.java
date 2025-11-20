package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a%\u0010\n\u001a\u00020\u000b*\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"toFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "androidDirection", "", "toLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "androidLayoutDirection", "calculateBoundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/View;", "requestInteropFocus", "", "direction", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "toAndroidFocusDirection", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    public static final Rect calculateBoundingRect(View view) {
        int[] tempCoordinates = FocusInteropUtils.INSTANCE.getTempCoordinates();
        view.getLocationInWindow(tempCoordinates);
        int i2 = tempCoordinates[0];
        return new Rect(i2, tempCoordinates[1], i2 + view.getWidth(), tempCoordinates[1] + view.getHeight());
    }

    public static final boolean requestInteropFocus(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m3477toAndroidFocusDirection3ESFkO8(int i2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m3463equalsimpl0(i2, companion.m3476getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m3463equalsimpl0(i2, companion.m3469getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m3463equalsimpl0(i2, companion.m3472getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m3463equalsimpl0(i2, companion.m3475getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m3463equalsimpl0(i2, companion.m3473getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m3463equalsimpl0(i2, companion.m3474getPreviousdhqQ8s()) ? 1 : null;
    }

    public static final FocusDirection toFocusDirection(int i2) {
        if (i2 == 1) {
            return FocusDirection.m3460boximpl(FocusDirection.INSTANCE.m3474getPreviousdhqQ8s());
        }
        if (i2 == 2) {
            return FocusDirection.m3460boximpl(FocusDirection.INSTANCE.m3473getNextdhqQ8s());
        }
        if (i2 == 17) {
            return FocusDirection.m3460boximpl(FocusDirection.INSTANCE.m3472getLeftdhqQ8s());
        }
        if (i2 == 33) {
            return FocusDirection.m3460boximpl(FocusDirection.INSTANCE.m3476getUpdhqQ8s());
        }
        if (i2 == 66) {
            return FocusDirection.m3460boximpl(FocusDirection.INSTANCE.m3475getRightdhqQ8s());
        }
        if (i2 != 130) {
            return null;
        }
        return FocusDirection.m3460boximpl(FocusDirection.INSTANCE.m3469getDowndhqQ8s());
    }

    public static final LayoutDirection toLayoutDirection(int i2) {
        if (i2 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i2 != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
