package i;

import androidx.lifecycle.InterfaceC0586t;
import androidx.lifecycle.v;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0586t f720a;

    /* renamed from: b, reason: collision with root package name */
    public final v f721b;

    /* renamed from: c, reason: collision with root package name */
    public c f722c;

    /* renamed from: d, reason: collision with root package name */
    public c f723d;

    public c(InterfaceC0586t interfaceC0586t, v vVar) {
        this.f720a = interfaceC0586t;
        this.f721b = vVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f720a.equals(cVar.f720a) && this.f721b.equals(cVar.f721b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f720a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f721b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f720a.hashCode() ^ this.f721b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f720a + "=" + this.f721b;
    }
}
