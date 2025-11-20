package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0015\u001a\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathIterator;", "Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "hasNext", "()Z", "", "outPoints", "offset", "Landroidx/compose/ui/graphics/PathSegment$Type;", "next", "([FI)Landroidx/compose/ui/graphics/PathSegment$Type;", "Landroidx/compose/ui/graphics/PathSegment;", "()Landroidx/compose/ui/graphics/PathSegment;", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "F", "getTolerance", "()F", "segmentPoints", "[F", "LD/b;", "implementation", "LD/b;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidPathIterator implements PathIterator {
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final D.b implementation;
    private final Path path;
    private final float[] segmentPoints = new float[8];
    private final float tolerance;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        D.a aVar;
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f2;
        Path path2 = getPath();
        if (!(path2 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path2).getInternalPath();
        int i2 = WhenMappings.$EnumSwitchMapping$0[getConicEvaluation().ordinal()];
        if (i2 == 1) {
            aVar = D.a.f148a;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = D.a.f149b;
        }
        this.implementation = new D.b(internalPath, aVar, getTolerance());
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public int calculateSize(boolean includeConvertedConics) {
        return this.implementation.f151a.a(includeConvertedConics);
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public float getTolerance() {
        return this.tolerance;
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.f151a.b();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathSegment.Type next(float[] outPoints, int offset) {
        D.b bVar = this.implementation;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(outPoints, "points");
        return AndroidPathIterator_androidKt.toPathSegmentType(bVar.f151a.c(outPoints, offset));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.graphics.PathSegment next() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidPathIterator.next():androidx.compose.ui.graphics.PathSegment");
    }
}
