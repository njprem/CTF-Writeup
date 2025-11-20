package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import b.AbstractActivityC0612o;
import b.AbstractC0604g;
import b.C0593F;
import b.RunnableC0601d;
import e.C0629a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.core.view.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0549g implements InterfaceC0585s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f504c;

    public /* synthetic */ C0549g(int i2, Object obj, Object obj2) {
        this.f502a = i2;
        this.f503b = obj;
        this.f504c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0585s
    public final void onStateChanged(InterfaceC0587u interfaceC0587u, EnumC0581n event) {
        Integer num;
        Object parcelable;
        switch (this.f502a) {
            case 0:
                C0551i c0551i = (C0551i) this.f503b;
                c0551i.getClass();
                EnumC0581n.Companion.getClass();
                EnumC0582o state = (EnumC0582o) this.f504c;
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                EnumC0581n enumC0581n = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0581n.ON_RESUME : EnumC0581n.ON_START : EnumC0581n.ON_CREATE;
                RunnableC0601d runnableC0601d = c0551i.f509a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0551i.f510b;
                if (event == enumC0581n) {
                    copyOnWriteArrayList.add(null);
                    runnableC0601d.run();
                    return;
                }
                EnumC0581n enumC0581n2 = EnumC0581n.ON_DESTROY;
                if (event == enumC0581n2) {
                    c0551i.a();
                    return;
                }
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal2 = state.ordinal();
                if (iOrdinal2 != 2) {
                    enumC0581n2 = iOrdinal2 != 3 ? iOrdinal2 != 4 ? null : EnumC0581n.ON_PAUSE : EnumC0581n.ON_STOP;
                }
                if (event == enumC0581n2) {
                    copyOnWriteArrayList.remove((Object) null);
                    runnableC0601d.run();
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(interfaceC0587u, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0581n.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = AbstractC0604g.a((AbstractActivityC0612o) this.f504c);
                    C0593F c0593f = (C0593F) this.f503b;
                    c0593f.getClass();
                    Intrinsics.checkNotNullParameter(invoker, "invoker");
                    c0593f.f624e = invoker;
                    c0593f.d(c0593f.f626g);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(interfaceC0587u, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                EnumC0581n enumC0581n3 = EnumC0581n.ON_START;
                e.h hVar = (e.h) this.f503b;
                Object objB = null;
                Bundle bundle = hVar.f708g;
                LinkedHashMap linkedHashMap = hVar.f707f;
                LinkedHashMap linkedHashMap2 = hVar.f706e;
                String key = (String) this.f504c;
                if (enumC0581n3 == event) {
                    Intrinsics.checkNotNullParameter(null, "callback");
                    Intrinsics.checkNotNullParameter(null, "contract");
                    linkedHashMap2.put(key, new e.d());
                    if (linkedHashMap.containsKey(key)) {
                        linkedHashMap.get(key);
                        linkedHashMap.remove(key);
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = AbstractC0604g.b(key, bundle);
                    } else {
                        parcelable = bundle.getParcelable(key);
                        if (!C0629a.class.isInstance(parcelable)) {
                            parcelable = null;
                        }
                    }
                    if (((C0629a) parcelable) == null) {
                        return;
                    }
                    bundle.remove(key);
                    throw null;
                }
                if (EnumC0581n.ON_STOP == event) {
                    linkedHashMap2.remove(key);
                    return;
                }
                if (EnumC0581n.ON_DESTROY == event) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    if (!hVar.f705d.contains(key) && (num = (Integer) hVar.f703b.remove(key)) != null) {
                        hVar.f702a.remove(num);
                    }
                    linkedHashMap2.remove(key);
                    if (linkedHashMap.containsKey(key)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + linkedHashMap.get(key));
                        linkedHashMap.remove(key);
                    }
                    if (bundle.containsKey(key)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            objB = AbstractC0604g.b(key, bundle);
                        } else {
                            Parcelable parcelable2 = bundle.getParcelable(key);
                            if (C0629a.class.isInstance(parcelable2)) {
                                objB = parcelable2;
                            }
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C0629a) objB));
                        bundle.remove(key);
                    }
                    LinkedHashMap linkedHashMap3 = hVar.f704c;
                    e.e eVar = (e.e) linkedHashMap3.get(key);
                    if (eVar != null) {
                        ArrayList arrayList = eVar.f700b;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            eVar.f699a.b((InterfaceC0585s) obj);
                        }
                        arrayList.clear();
                        linkedHashMap3.remove(key);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
