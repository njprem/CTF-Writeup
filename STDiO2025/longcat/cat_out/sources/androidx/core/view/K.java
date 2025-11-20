package androidx.core.view;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class K extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final E f462a;

    /* renamed from: b, reason: collision with root package name */
    public List f463b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f464c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f465d;

    public K(E e2) {
        super(e2.getDispatchMode());
        this.f465d = new HashMap();
        this.f462a = e2;
    }

    public final N a(WindowInsetsAnimation windowInsetsAnimation) {
        N n2 = (N) this.f465d.get(windowInsetsAnimation);
        if (n2 == null) {
            n2 = new N(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                n2.f470a = new L(windowInsetsAnimation);
            }
            this.f465d.put(windowInsetsAnimation, n2);
        }
        return n2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f462a.onEnd(a(windowInsetsAnimation));
        this.f465d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f462a.onPrepare(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f464c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f464c = arrayList2;
            this.f463b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationH = androidx.compose.foundation.layout.a.h(list.get(size));
            N nA = a(windowInsetsAnimationH);
            nA.f470a.c(windowInsetsAnimationH.getFraction());
            this.f464c.add(nA);
        }
        return this.f462a.onProgress(e0.b(null, windowInsets), this.f463b).a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        D dOnStart = this.f462a.onStart(a(windowInsetsAnimation), new D(bounds));
        dOnStart.getClass();
        androidx.compose.foundation.layout.a.l();
        return androidx.compose.foundation.layout.a.f(dOnStart.f443a.d(), dOnStart.f444b.d());
    }
}
