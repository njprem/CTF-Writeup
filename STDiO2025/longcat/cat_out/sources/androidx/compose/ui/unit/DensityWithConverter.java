package androidx.compose.ui.unit;

import J.d;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÂ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0019*\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/unit/DensityWithConverter;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "converter", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "(FFLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "getDensity", "()F", "getFontScale", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DensityWithConverter implements Density {
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    public DensityWithConverter(float f2, float f3, FontScaleConverter fontScaleConverter) {
        this.density = f2;
        this.fontScale = f3;
        this.converter = fontScaleConverter;
    }

    /* renamed from: component3, reason: from getter */
    private final FontScaleConverter getConverter() {
        return this.converter;
    }

    public static /* synthetic */ DensityWithConverter copy$default(DensityWithConverter densityWithConverter, float f2, float f3, FontScaleConverter fontScaleConverter, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = densityWithConverter.density;
        }
        if ((i2 & 2) != 0) {
            f3 = densityWithConverter.fontScale;
        }
        if ((i2 & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f2, f3, fontScaleConverter);
    }

    /* renamed from: component1, reason: from getter */
    public final float getDensity() {
        return this.density;
    }

    /* renamed from: component2, reason: from getter */
    public final float getFontScale() {
        return this.fontScale;
    }

    public final DensityWithConverter copy(float density, float fontScale, FontScaleConverter converter) {
        return new DensityWithConverter(density, fontScale, converter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) other;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && Intrinsics.areEqual(this.converter, densityWithConverter.converter);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return this.converter.hashCode() + d.b(Float.hashCode(this.density) * 31, 31, this.fontScale);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo329toDpGaN1DYA(long j2) {
        if (TextUnitType.m6454equalsimpl0(TextUnit.m6425getTypeUIouoOA(j2), TextUnitType.INSTANCE.m6459getSpUIouoOA())) {
            return Dp.m6233constructorimpl(this.converter.convertSpToDp(TextUnit.m6426getValueimpl(j2)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo336toSp0xMU5do(float f2) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f2));
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
