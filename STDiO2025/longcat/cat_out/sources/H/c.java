package H;

import B.C0127d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends b {
    public c(b initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f184a;
        Intrinsics.checkNotNullParameter(initialExtras2, "initialExtras");
        this.f184a.putAll(initialExtras2);
    }

    public final void a(C0127d key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f184a.put(key, obj);
    }
}
