package x;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class h extends g {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f1058a.addExtraDataToAccessibilityNodeInfo(i2, new f(accessibilityNodeInfo), str, bundle);
    }
}
