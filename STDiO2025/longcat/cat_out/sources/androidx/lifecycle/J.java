package androidx.lifecycle;

import a.AbstractC0130a;
import android.os.Bundle;
import b.AbstractActivityC0612o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J implements K.d {

    /* renamed from: a, reason: collision with root package name */
    public final K.e f556a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f557b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f558c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f559d;

    public J(K.e savedStateRegistry, AbstractActivityC0612o viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f556a = savedStateRegistry;
        this.f559d = LazyKt.lazy(new K.f(viewModelStoreOwner, 1));
    }

    @Override // K.d
    public final Bundle a() {
        Pair[] pairArr;
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
        Bundle source = AbstractC0130a.c((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from = this.f558c;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        for (Map.Entry entry2 : ((K) this.f559d.getValue()).f560b.entrySet()) {
            String key = (String) entry2.getKey();
            Bundle value = ((F) entry2.getValue()).f548a.f182e.a();
            Intrinsics.checkNotNullParameter(value, "source");
            if (!value.isEmpty()) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                source.putBundle(key, value);
            }
        }
        this.f557b = false;
        return source;
    }
}
