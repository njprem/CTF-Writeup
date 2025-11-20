package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0082\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u001bJ=\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "clamp", "", "x", "fromXyz", "", "v", "getMaxValue", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    public Xyz(String str, int i2) {
        super(str, ColorModel.INSTANCE.m4206getXyzxdoWZVw(), i2, null);
    }

    private final float clamp(float x2) {
        if (x2 < -2.0f) {
            x2 = -2.0f;
        }
        if (x2 > 2.0f) {
            return 2.0f;
        }
        return x2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v2) {
        float f2 = v2[0];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        v2[0] = f2;
        float f3 = v2[1];
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        v2[1] = f3;
        float f4 = v2[2];
        float f5 = f4 >= -2.0f ? f4 : -2.0f;
        v2[2] = f5 <= 2.0f ? f5 : 2.0f;
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        if (v0 < -2.0f) {
            v0 = -2.0f;
        }
        if (v0 > 2.0f) {
            v0 = 2.0f;
        }
        if (v1 < -2.0f) {
            v1 = -2.0f;
        }
        return (Float.floatToRawIntBits(v0) << 32) | (Float.floatToRawIntBits(v1 <= 2.0f ? v1 : 2.0f) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v2) {
        float f2 = v2[0];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        v2[0] = f2;
        float f3 = v2[1];
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        v2[1] = f3;
        float f4 = v2[2];
        float f5 = f4 >= -2.0f ? f4 : -2.0f;
        v2[2] = f5 <= 2.0f ? f5 : 2.0f;
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        if (v2 < -2.0f) {
            v2 = -2.0f;
        }
        if (v2 > 2.0f) {
            return 2.0f;
        }
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4208xyzaToColorJlNiLsg$ui_graphics_release(float x2, float y2, float z, float a2, ColorSpace colorSpace) {
        if (x2 < -2.0f) {
            x2 = -2.0f;
        }
        if (x2 > 2.0f) {
            x2 = 2.0f;
        }
        if (y2 < -2.0f) {
            y2 = -2.0f;
        }
        if (y2 > 2.0f) {
            y2 = 2.0f;
        }
        if (z < -2.0f) {
            z = -2.0f;
        }
        return ColorKt.Color(x2, y2, z <= 2.0f ? z : 2.0f, a2, colorSpace);
    }
}
