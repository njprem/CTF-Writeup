package D;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f167a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF[] f168b;

    /* renamed from: c, reason: collision with root package name */
    public final float f169c;

    public g(f type, PointF[] points, float f2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f167a = type;
        this.f168b = points;
        this.f169c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        g gVar = (g) obj;
        return this.f167a == gVar.f167a && Arrays.equals(this.f168b, gVar.f168b) && this.f169c == gVar.f169c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f169c) + (((this.f167a.hashCode() * 31) + Arrays.hashCode(this.f168b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f167a);
        sb.append(", points=");
        String string = Arrays.toString(this.f168b);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(", weight=");
        return J.d.o(sb, this.f169c, ')');
    }
}
