package v;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f1004a;

    /* renamed from: b, reason: collision with root package name */
    public String f1005b;

    /* renamed from: c, reason: collision with root package name */
    public List f1006c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f1004a, cVar.f1004a) && Objects.equals(this.f1005b, cVar.f1005b) && Objects.equals(this.f1006c, cVar.f1006c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1004a, this.f1005b, this.f1006c);
    }
}
