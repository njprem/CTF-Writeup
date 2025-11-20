package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, f2, i2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3761createShaderuvyYCjk(long size) {
        float fM3620getWidthimpl;
        float fM3617getHeightimpl;
        if (OffsetKt.m3572isUnspecifiedk4lQ0M(this.center)) {
            long jM3630getCenteruvyYCjk = SizeKt.m3630getCenteruvyYCjk(size);
            fM3620getWidthimpl = Offset.m3551getXimpl(jM3630getCenteruvyYCjk);
            fM3617getHeightimpl = Offset.m3552getYimpl(jM3630getCenteruvyYCjk);
        } else {
            fM3620getWidthimpl = Offset.m3551getXimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m3620getWidthimpl(size) : Offset.m3551getXimpl(this.center);
            fM3617getHeightimpl = Offset.m3552getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m3617getHeightimpl(size) : Offset.m3552getYimpl(this.center);
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jOffset = OffsetKt.Offset(fM3620getWidthimpl, fM3617getHeightimpl);
        float fM3619getMinDimensionimpl = this.radius;
        if (fM3619getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM3619getMinDimensionimpl = Size.m3619getMinDimensionimpl(size) / 2;
        }
        return ShaderKt.m4108RadialGradientShader8uybcMk(jOffset, fM3619getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) other;
        return Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m3548equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m4160equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f2 = this.radius;
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            return Size.INSTANCE.m3628getUnspecifiedNHjbRc();
        }
        float f3 = this.radius;
        float f4 = 2;
        return SizeKt.Size(f3 * f4, f3 * f4);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return TileMode.m4161hashCodeimpl(this.tileMode) + J.d.b((Offset.m3553hashCodeimpl(this.center) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31, this.radius);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m3570isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m3559toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f2 = this.radius;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m4162toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? null : list2, j2, f2, (i3 & 16) != 0 ? TileMode.INSTANCE.m4164getClamp3opZhB0() : i2, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j2, float f2, int i2) {
        this.colors = list;
        this.stops = list2;
        this.center = j2;
        this.radius = f2;
        this.tileMode = i2;
    }
}
