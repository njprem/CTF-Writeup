package androidx.compose.foundation.gestures;

import j.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010%\u001a\u00020#26\u0010$\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020#0\u001fH\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010)\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001b¨\u0006*"}, d2 = {"Landroidx/compose/foundation/gestures/MapDraggableAnchors;", "T", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "Lj/T;", "anchors", "<init>", "(Lj/T;)V", "value", "", "positionOf", "(Ljava/lang/Object;)F", "", "hasAnchorFor", "(Ljava/lang/Object;)Z", "position", "closestAnchor", "(F)Ljava/lang/Object;", "searchUpwards", "(FZ)Ljava/lang/Object;", "minAnchor", "()F", "maxAnchor", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "anchor", "", "block", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lj/T;", "getSize", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final T anchors;

    public MapDraggableAnchors(T t) {
        this.anchors = t;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float position) {
        T t = this.anchors;
        Object[] objArr = t.f761b;
        float[] fArr = t.f762c;
        long[] jArr = t.f760a;
        int length = jArr.length - 2;
        T t2 = null;
        if (length >= 0) {
            float f2 = Float.POSITIVE_INFINITY;
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            float fAbs = Math.abs(position - fArr[i5]);
                            if (fAbs <= f2) {
                                f2 = fAbs;
                                t2 = (T) obj;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return t2;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return t2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MapDraggableAnchors) {
            return Intrinsics.areEqual(this.anchors, ((MapDraggableAnchors) other).anchors);
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public void forEach(Function2<? super T, ? super Float, Unit> block) {
        T t = this.anchors;
        Object[] objArr = t.f761b;
        float[] fArr = t.f762c;
        long[] jArr = t.f760a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(objArr[i5], Float.valueOf(fArr[i5]));
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.anchors.f764e;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasAnchorFor(T value) {
        return this.anchors.a(value) >= 0;
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxAnchor() {
        return AnchoredDraggableKt.maxValueOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minAnchor() {
        return AnchoredDraggableKt.minValueOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T value) {
        T t = this.anchors;
        int iA = t.a(value);
        if (iA >= 0) {
            return t.f762c[iA];
        }
        return Float.NaN;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float position, boolean searchUpwards) {
        T t = this.anchors;
        Object[] objArr = t.f761b;
        float[] fArr = t.f762c;
        long[] jArr = t.f760a;
        int length = jArr.length - 2;
        T t2 = null;
        if (length >= 0) {
            float f2 = Float.POSITIVE_INFINITY;
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            float f3 = fArr[i5];
                            float f4 = searchUpwards ? f3 - position : position - f3;
                            if (f4 < 0.0f) {
                                f4 = Float.POSITIVE_INFINITY;
                            }
                            if (f4 <= f2) {
                                f2 = f4;
                                t2 = (T) obj;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return t2;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return t2;
    }
}
