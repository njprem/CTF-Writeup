package x;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class i {
    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    public i() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new h(this);
        } else {
            this.mProvider = new g(this);
        }
    }

    public f createAccessibilityNodeInfo(int i2) {
        return null;
    }

    public List<f> findAccessibilityNodeInfosByText(String str, int i2) {
        return null;
    }

    public f findFocus(int i2) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        return false;
    }

    public i(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.mProvider = accessibilityNodeProvider;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i2, f fVar, String str, Bundle bundle) {
    }
}
