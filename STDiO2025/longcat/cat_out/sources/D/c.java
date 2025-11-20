package D;

import android.graphics.Path;
import android.graphics.PathIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.graphics.path.ConicConverter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    public final PathIterator f152e;

    /* renamed from: f, reason: collision with root package name */
    public final ConicConverter f153f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Path path, a conicEvaluation, float f2) {
        super(path, conicEvaluation, f2);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        PathIterator pathIterator = path.getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator, "path.pathIterator");
        this.f152e = pathIterator;
        ConicConverter conicConverter = new ConicConverter();
        conicConverter.f535c = new float[130];
        this.f153f = conicConverter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    @Override // D.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(boolean r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto Lb
            D.a r8 = D.a.f149b
            D.a r1 = r7.f155b
            if (r1 != r8) goto Lb
            r8 = 1
            goto Lc
        Lb:
            r8 = r0
        Lc:
            android.graphics.Path r1 = r7.f154a
            android.graphics.PathIterator r1 = r1.getPathIterator()
            java.lang.String r2 = "path.pathIterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 8
            float[] r2 = new float[r2]
            r3 = r0
        L1c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3c
            int r4 = r1.next(r2, r0)
            r5 = 3
            if (r4 != r5) goto L39
            if (r8 == 0) goto L39
            r4 = 6
            r4 = r2[r4]
            androidx.graphics.path.ConicConverter r5 = r7.f153f
            float r6 = r7.f156c
            r5.a(r4, r6, r2, r0)
            int r4 = r5.f533a
            int r3 = r3 + r4
            goto L1c
        L39:
            int r3 = r3 + 1
            goto L1c
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: D.c.a(boolean):int");
    }

    @Override // D.d
    public final boolean b() {
        return this.f152e.hasNext();
    }

    @Override // D.d
    public final f c(float[] points, int i2) {
        f fVar;
        Intrinsics.checkNotNullParameter(points, "points");
        ConicConverter conicConverter = this.f153f;
        int i3 = conicConverter.f534b;
        int i4 = conicConverter.f533a;
        f fVar2 = f.f161c;
        if (i3 < i4) {
            conicConverter.b(points, i2);
            return fVar2;
        }
        int next = this.f152e.next(points, i2);
        f[] fVarArr = e.f158a;
        f fVar3 = f.f162d;
        switch (next) {
            case 0:
                fVar = f.f159a;
                break;
            case 1:
                fVar = f.f160b;
                break;
            case 2:
                fVar = fVar2;
                break;
            case 3:
                fVar = fVar3;
                break;
            case 4:
                fVar = f.f163e;
                break;
            case 5:
                fVar = f.f164f;
                break;
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                fVar = f.f165g;
                break;
            default:
                throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Unknown path segment type ", next));
        }
        if (fVar == fVar3) {
            if (this.f155b == a.f149b) {
                conicConverter.a(points[i2 + 6], this.f156c, points, i2);
                if (conicConverter.f533a > 0) {
                    conicConverter.b(points, i2);
                }
                return fVar2;
            }
        }
        return fVar;
    }
}
