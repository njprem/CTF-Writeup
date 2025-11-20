package j;

/* renamed from: j.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659l {

    /* renamed from: a, reason: collision with root package name */
    public final long f847a;

    public static long a(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0659l) {
            return this.f847a == ((C0659l) obj).f847a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f847a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j2 = this.f847a;
        sb.append((int) (j2 >> 32));
        sb.append(", ");
        return androidx.compose.runtime.changelist.a.o(sb, (int) (j2 & 4294967295L), ')');
    }
}
