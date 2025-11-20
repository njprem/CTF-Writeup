package G;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f178a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f179b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f180c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f181d;

    /* renamed from: e, reason: collision with root package name */
    public final a f182e;

    public b(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f178a = MapsKt.toMutableMap(initialState);
        this.f179b = new LinkedHashMap();
        this.f180c = new LinkedHashMap();
        this.f181d = new LinkedHashMap();
        this.f182e = new a(this, 0);
    }

    public final void a(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f178a.put(key, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f180c.get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.f181d.get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }
}
