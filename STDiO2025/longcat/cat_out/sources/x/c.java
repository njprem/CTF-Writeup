package x;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.Fields;
import b.AbstractC0598a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f1042c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f1043d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f1044e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f1045f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f1046g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f1047h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f1048i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f1049j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1051b;

    static {
        new c(null, 1, null, null);
        new c(null, 2, null, null);
        new c(null, 4, null, null);
        new c(null, 8, null, null);
        new c(null, 16, null, null);
        new c(null, 32, null, null);
        f1042c = new c(null, 64, null, null);
        f1043d = new c(null, 128, null, null);
        new c(null, Fields.RotationX, null, j.class);
        new c(null, 512, null, j.class);
        new c(null, 1024, null, k.class);
        new c(null, Fields.CameraDistance, null, k.class);
        f1044e = new c(null, 4096, null, null);
        f1045f = new c(null, 8192, null, null);
        new c(null, Fields.Clip, null, null);
        new c(null, Fields.CompositingStrategy, null, null);
        new c(null, 65536, null, null);
        new c(null, Fields.RenderEffect, null, o.class);
        new c(null, 262144, null, null);
        new c(null, 524288, null, null);
        new c(null, 1048576, null, null);
        new c(null, 2097152, null, p.class);
        int i2 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, m.class);
        f1046g = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f1047h = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f1048i = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f1049j = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, n.class);
        new c(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, l.class);
        new c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new c(i2 >= 34 ? AbstractC0598a.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public c(Object obj, int i2, String str, Class cls) {
        this.f1051b = i2;
        if (obj == null) {
            this.f1050a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f1050a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f1050a;
        Object obj3 = this.f1050a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1050a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strC = f.c(this.f1051b);
        if (strC.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1050a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strC = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strC);
        return sb.toString();
    }
}
