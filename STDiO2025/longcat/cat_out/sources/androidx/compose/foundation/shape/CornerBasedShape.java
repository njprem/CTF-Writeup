package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "getBottomEnd", "()Landroidx/compose/foundation/shape/CornerSize;", "getBottomStart", "getTopEnd", "getTopStart", "copy", "all", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i2 & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i2 & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i2 & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i2 & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize all) {
        return copy(all, all, all, all);
    }

    public abstract CornerBasedShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo908createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo245createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        float fMo916toPxTmRCtEA = this.topStart.mo916toPxTmRCtEA(size, density);
        float fMo916toPxTmRCtEA2 = this.topEnd.mo916toPxTmRCtEA(size, density);
        float fMo916toPxTmRCtEA3 = this.bottomEnd.mo916toPxTmRCtEA(size, density);
        float fMo916toPxTmRCtEA4 = this.bottomStart.mo916toPxTmRCtEA(size, density);
        float fM3619getMinDimensionimpl = Size.m3619getMinDimensionimpl(size);
        float f2 = fMo916toPxTmRCtEA + fMo916toPxTmRCtEA4;
        if (f2 > fM3619getMinDimensionimpl) {
            float f3 = fM3619getMinDimensionimpl / f2;
            fMo916toPxTmRCtEA *= f3;
            fMo916toPxTmRCtEA4 *= f3;
        }
        float f4 = fMo916toPxTmRCtEA2 + fMo916toPxTmRCtEA3;
        if (f4 > fM3619getMinDimensionimpl) {
            float f5 = fM3619getMinDimensionimpl / f4;
            fMo916toPxTmRCtEA2 *= f5;
            fMo916toPxTmRCtEA3 *= f5;
        }
        if (fMo916toPxTmRCtEA >= 0.0f && fMo916toPxTmRCtEA2 >= 0.0f && fMo916toPxTmRCtEA3 >= 0.0f && fMo916toPxTmRCtEA4 >= 0.0f) {
            return mo908createOutlineLjSzlW0(size, fMo916toPxTmRCtEA, fMo916toPxTmRCtEA2, fMo916toPxTmRCtEA3, fMo916toPxTmRCtEA4, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo916toPxTmRCtEA + ", topEnd = " + fMo916toPxTmRCtEA2 + ", bottomEnd = " + fMo916toPxTmRCtEA3 + ", bottomStart = " + fMo916toPxTmRCtEA4 + ")!").toString());
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
