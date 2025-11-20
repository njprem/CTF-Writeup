package androidx.core.view;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import stdio.cat.R;

/* renamed from: androidx.core.view.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566y {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f528d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f529a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f530b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f531c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f529a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
