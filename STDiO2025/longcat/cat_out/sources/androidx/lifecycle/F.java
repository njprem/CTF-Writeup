package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final G.b f548a;

    public F(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        new LinkedHashMap();
        this.f548a = new G.b(initialState);
    }

    public F() {
        new LinkedHashMap();
        this.f548a = new G.b(MapsKt.emptyMap());
    }
}
