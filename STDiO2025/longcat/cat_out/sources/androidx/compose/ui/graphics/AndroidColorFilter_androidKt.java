package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\b\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\b\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u001a\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0001*\f\b\u0000\u0010\u001c\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"actualColorMatrixColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroid/graphics/ColorFilter;", "actualColorMatrixFromFilter", "filter", "(Landroid/graphics/ColorFilter;)[F", "actualLightingColorFilter", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "actualLightingColorFilter--OWjLjI", "(JJ)Landroid/graphics/ColorFilter;", "actualTintColorFilter", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "actualTintColorFilter-xETnrds", "(JI)Landroid/graphics/ColorFilter;", "supportsColorMatrixQuery", "", "supportsLightingColorFilterQuery", "asAndroidColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "asComposeColorFilter", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m3656actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m3872getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m3657actualLightingColorFilterOWjLjI(long j2, long j3) {
        return new android.graphics.LightingColorFilter(ColorKt.m3846toArgb8_81llA(j2), ColorKt.m3846toArgb8_81llA(j3));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m3658actualTintColorFilterxETnrds(long j2, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m3738BlendModeColorFilterxETnrds(j2, i2) : new PorterDuffColorFilter(ColorKt.m3846toArgb8_81llA(j2), AndroidBlendMode_androidKt.m3644toPorterDuffModes9anfk8(i2));
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter();
    }

    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        if (29 <= Build.VERSION.SDK_INT && b.n(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(b.g(colorFilter));
        }
        if (!(colorFilter instanceof android.graphics.LightingColorFilter) || !supportsLightingColorFilterQuery()) {
            return ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) ? new ColorMatrixColorFilter(null, colorFilter, null) : new ColorFilter(colorFilter);
        }
        android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
        return new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
    }

    public static final boolean supportsColorMatrixQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }
}
