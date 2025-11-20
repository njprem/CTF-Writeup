package x;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final i f1058a;

    public g(i iVar) {
        this.f1058a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        f fVarCreateAccessibilityNodeInfo = this.f1058a.createAccessibilityNodeInfo(i2);
        if (fVarCreateAccessibilityNodeInfo == null) {
            return null;
        }
        return fVarCreateAccessibilityNodeInfo.f1055a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        List<f> listFindAccessibilityNodeInfosByText = this.f1058a.findAccessibilityNodeInfosByText(str, i2);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(listFindAccessibilityNodeInfosByText.get(i3).f1055a);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        f fVarFindFocus = this.f1058a.findFocus(i2);
        if (fVarFindFocus == null) {
            return null;
        }
        return fVarFindFocus.f1055a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f1058a.performAction(i2, i3, bundle);
    }
}
