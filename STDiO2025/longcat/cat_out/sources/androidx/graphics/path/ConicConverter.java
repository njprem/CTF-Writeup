package androidx.graphics.path;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "", "conicPoints", "", "offset", "quadraticPoints", "", "weight", "tolerance", "internalConicToQuadratics", "([FI[FFF)I", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConicConverter {

    /* renamed from: a, reason: collision with root package name */
    public int f533a;

    /* renamed from: b, reason: collision with root package name */
    public int f534b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f535c;

    private final native int internalConicToQuadratics(float[] conicPoints, int offset, float[] quadraticPoints, float weight, float tolerance);

    public final void a(float f2, float f3, float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        int iInternalConicToQuadratics = internalConicToQuadratics(points, i2, this.f535c, f2, f3);
        this.f533a = iInternalConicToQuadratics;
        int i3 = (iInternalConicToQuadratics * 4) + 2;
        if (i3 > this.f535c.length) {
            float[] fArr = new float[i3];
            this.f535c = fArr;
            this.f533a = internalConicToQuadratics(points, i2, fArr, f2, f3);
        }
        this.f534b = 0;
    }

    public final void b(float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i3 = this.f534b;
        if (i3 < this.f533a) {
            int i4 = i3 * 4;
            float[] fArr = this.f535c;
            points[i2] = fArr[i4];
            points[i2 + 1] = fArr[i4 + 1];
            points[i2 + 2] = fArr[i4 + 2];
            points[i2 + 3] = fArr[i4 + 3];
            points[i2 + 4] = fArr[i4 + 4];
            points[i2 + 5] = fArr[i4 + 5];
            this.f534b = i3 + 1;
        }
    }
}
