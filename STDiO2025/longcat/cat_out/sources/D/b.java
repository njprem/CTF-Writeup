package D;

import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import androidx.graphics.path.PathIteratorPreApi34Impl;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class b implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final d f151a;

    public b(Path path, a conicEvaluation, float f2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.f151a = Build.VERSION.SDK_INT >= 34 ? new c(path, conicEvaluation, f2) : new PathIteratorPreApi34Impl(path, conicEvaluation, f2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f151a.b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PointF[] pointFArr;
        PointF[] pointFArr2;
        d dVar = this.f151a;
        float[] fArr = dVar.f157d;
        f fVarC = dVar.c(fArr, 0);
        if (fVarC == f.f165g) {
            return h.f170a;
        }
        if (fVarC == f.f164f) {
            return h.f171b;
        }
        float f2 = fVarC == f.f162d ? fArr[6] : 0.0f;
        int iOrdinal = fVarC.ordinal();
        if (iOrdinal == 0) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1])};
        } else if (iOrdinal == 1) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                pointFArr2 = iOrdinal != 4 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
                return new g(fVarC, pointFArr2, f2);
            }
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        }
        pointFArr2 = pointFArr;
        return new g(fVarC, pointFArr2, f2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
