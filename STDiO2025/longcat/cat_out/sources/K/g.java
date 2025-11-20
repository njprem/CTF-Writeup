package K;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.os.Bundle;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final L.b f240a;

    /* renamed from: b, reason: collision with root package name */
    public final e f241b;

    public g(L.b bVar) {
        this.f240a = bVar;
        this.f241b = new e(bVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void a(Bundle source) {
        L.b bVar = this.f240a;
        if (!bVar.f248e) {
            bVar.a();
        }
        ?? r1 = bVar.f244a;
        if (((w) r1.getLifecycle()).f598c.a(EnumC0582o.f589d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((w) r1.getLifecycle()).f598c).toString());
        }
        if (bVar.f250g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleO = null;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
            if (source.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleO = AbstractC0131b.o("androidx.lifecycle.BundlableSavedStateRegistry.key", source);
            }
        }
        bVar.f249f = bundleO;
        bVar.f250g = true;
    }

    public final void b(Bundle source) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        L.b bVar = this.f240a;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle value = AbstractC0130a.c((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Intrinsics.checkNotNullParameter(value, "source");
        Bundle from = bVar.f249f;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            value.putAll(from);
        }
        synchronized (bVar.f246c) {
            try {
                for (Map.Entry entry2 : bVar.f247d.entrySet()) {
                    String key = (String) entry2.getKey();
                    Bundle value2 = ((d) entry2.getValue()).a();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value.putBundle(key, value2);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Intrinsics.checkNotNullParameter(value, "source");
        if (value.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", value);
    }
}
