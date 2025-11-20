package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A, reason: collision with root package name */
    private static final float f349A = 0.008856452f;

    /* renamed from: B, reason: collision with root package name */
    private static final float f350B = 7.787037f;

    /* renamed from: C, reason: collision with root package name */
    private static final float f351C = 0.13793103f;

    /* renamed from: D, reason: collision with root package name */
    private static final float f352D = 0.20689656f;

    public Lab(String str, int i2) {
        super(str, ColorModel.INSTANCE.m4204getLabxdoWZVw(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v2) {
        float f2 = v2[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f3 = f2 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f4 = v2[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f5 = v2[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f3 > f349A ? (float) Math.cbrt(f3) : (f3 * f350B) + f351C;
        float fCbrt2 = f4 > f349A ? (float) Math.cbrt(f4) : (f4 * f350B) + f351C;
        float fCbrt3 = f5 > f349A ? (float) Math.cbrt(f5) : (f5 * f350B) + f351C;
        float f6 = (116.0f * fCbrt2) - 16.0f;
        float f7 = (fCbrt - fCbrt2) * 500.0f;
        float f8 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        v2[0] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        if (f7 > 128.0f) {
            f7 = 128.0f;
        }
        v2[1] = f7;
        if (f8 < -128.0f) {
            f8 = -128.0f;
        }
        v2[2] = f8 <= 128.0f ? f8 : 128.0f;
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v1 < -128.0f) {
            v1 = -128.0f;
        }
        if (v1 > 128.0f) {
            v1 = 128.0f;
        }
        float f2 = (v0 + 16.0f) / 116.0f;
        float f3 = (v1 * 0.002f) + f2;
        float f4 = f3 > f352D ? f3 * f3 * f3 : (f3 - f351C) * 0.12841855f;
        float f5 = f2 > f352D ? f2 * f2 * f2 : (f2 - f351C) * 0.12841855f;
        float f6 = f4 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        return (Float.floatToRawIntBits(f5 * r5.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v2) {
        float f2 = v2[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        v2[0] = f2;
        float f3 = v2[1];
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        v2[1] = f3;
        float f4 = v2[2];
        float f5 = f4 >= -128.0f ? f4 : -128.0f;
        float f6 = f5 <= 128.0f ? f5 : 128.0f;
        v2[2] = f6;
        float f7 = (f2 + 16.0f) / 116.0f;
        float f8 = (f3 * 0.002f) + f7;
        float f9 = f7 - (f6 * 0.005f);
        float f10 = f8 > f352D ? f8 * f8 * f8 : (f8 - f351C) * 0.12841855f;
        float f11 = f7 > f352D ? f7 * f7 * f7 : (f7 - f351C) * 0.12841855f;
        float f12 = f9 > f352D ? f9 * f9 * f9 : (f9 - f351C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v2[0] = f10 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v2[1] = f11 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v2[2] = f12 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v2 < -128.0f) {
            v2 = -128.0f;
        }
        if (v2 > 128.0f) {
            v2 = 128.0f;
        }
        float f2 = ((v0 + 16.0f) / 116.0f) - (v2 * 0.005f);
        return (f2 > f352D ? f2 * f2 * f2 : 0.12841855f * (f2 - f351C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4208xyzaToColorJlNiLsg$ui_graphics_release(float x2, float y2, float z, float a2, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f2 = x2 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f3 = y2 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f4 = z / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f2 > f349A ? (float) Math.cbrt(f2) : (f2 * f350B) + f351C;
        float fCbrt2 = f3 > f349A ? (float) Math.cbrt(f3) : (f3 * f350B) + f351C;
        float f5 = (116.0f * fCbrt2) - 16.0f;
        float f6 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f4 > f349A ? (float) Math.cbrt(f4) : (f4 * f350B) + f351C)) * 200.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 100.0f) {
            f5 = 100.0f;
        }
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        if (f6 > 128.0f) {
            f6 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f5, f6, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a2, colorSpace);
    }
}
