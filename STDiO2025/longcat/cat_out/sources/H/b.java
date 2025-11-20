package H;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f184a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof b) && Intrinsics.areEqual(this.f184a, ((b) obj).f184a);
    }

    public final int hashCode() {
        return this.f184a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f184a + ')';
    }
}
