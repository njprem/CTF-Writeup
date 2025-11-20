package androidx.graphics.path;

import D.a;
import D.d;
import D.e;
import D.f;
import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "LD/d;", "Landroid/graphics/Path;", "path", "", "conicEvaluation", "", "tolerance", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "internalPathIterator", "", "destroyInternalPathIterator", "(J)V", "", "internalPathIteratorHasNext", "(J)Z", "", "points", "offset", "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl extends d {

    /* renamed from: e, reason: collision with root package name */
    public final long f536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, a conicEvaluation, float f2) {
        super(path, conicEvaluation, f2);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.f536e = createInternalPathIterator(path, conicEvaluation.ordinal(), f2);
    }

    private final native long createInternalPathIterator(Path path, int conicEvaluation, float tolerance);

    private final native void destroyInternalPathIterator(long internalPathIterator);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long internalPathIterator);

    @FastNative
    private final native int internalPathIteratorNext(long internalPathIterator, float[] points, int offset);

    @FastNative
    private final native int internalPathIteratorPeek(long internalPathIterator);

    @FastNative
    private final native int internalPathIteratorRawSize(long internalPathIterator);

    @FastNative
    private final native int internalPathIteratorSize(long internalPathIterator);

    @Override // D.d
    public final int a(boolean z) {
        long j2 = this.f536e;
        if (z) {
            if (this.f155b != a.f148a) {
                return internalPathIteratorSize(j2);
            }
        }
        return internalPathIteratorRawSize(j2);
    }

    @Override // D.d
    public final boolean b() {
        return internalPathIteratorHasNext(this.f536e);
    }

    @Override // D.d
    public final f c(float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        return e.f158a[internalPathIteratorNext(this.f536e, points, i2)];
    }

    public final void finalize() {
        destroyInternalPathIterator(this.f536e);
    }
}
