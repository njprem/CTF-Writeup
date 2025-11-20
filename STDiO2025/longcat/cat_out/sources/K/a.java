package K;

import a.AbstractC0130a;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f233a;

    public a(e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f233a = new LinkedHashSet();
        registry.b("androidx.savedstate.Restarter", this);
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
        List value = CollectionsKt.toList(this.f233a);
        Intrinsics.checkNotNullParameter("classes_to_restore", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<this>");
        source.putStringArrayList("classes_to_restore", value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        return source;
    }
}
