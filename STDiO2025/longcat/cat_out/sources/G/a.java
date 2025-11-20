package G;

import K.d;
import a.AbstractC0130a;
import android.os.Bundle;
import b.AbstractActivityC0612o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import stdio.cat.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f176a = i2;
        this.f177b = obj;
    }

    @Override // K.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f176a) {
            case 0:
                b bVar = (b) this.f177b;
                for (Map.Entry entry : MapsKt__MapsKt.toMap(bVar.f181d).entrySet()) {
                    bVar.a((String) entry.getKey(), ((MutableStateFlow) entry.getValue()).getValue());
                }
                for (Map.Entry entry2 : MapsKt__MapsKt.toMap(bVar.f179b).entrySet()) {
                    bVar.a((String) entry2.getKey(), ((d) entry2.getValue()).a());
                }
                Map map = bVar.f178a;
                if (map.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry3 : map.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle source = AbstractC0130a.c((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source, "source");
                return source;
            default:
                return AbstractActivityC0612o.c((MainActivity) this.f177b);
        }
    }
}
