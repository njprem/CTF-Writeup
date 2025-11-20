package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u00192\b\b\u0001\u0010\u0013\u001a\u00020\u00192\b\b\u0003\u0010\u0014\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a1\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0082\b\u001a,\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001e\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0016\u0010/\u001a\u000200*\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0016\u00103\u001a\u00020\u0011*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a%\u00106\u001a\u00020\u0007*\u00020\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0016\u0010;\u001a\u00020\u0019*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"UnspecifiedColor", "Lkotlin/ULong;", "getUnspecifiedColor$annotations", "()V", "J", "isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "UncheckedColor", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r20, float r21, float r22, float r23, androidx.compose.ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f2, f3, f4, f5, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f2, f3, f4, f5, colorSpace);
    }

    private static final float compositeComponent(float f2, float f3, float f4, float f5, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f4) * (f3 * f5)) + (f2 * f4)) / f6;
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m3837compositeOverOWjLjI(long j2, long j3) {
        float f2;
        float f3;
        long jM3789convertvNxB06k = Color.m3789convertvNxB06k(j2, Color.m3796getColorSpaceimpl(j3));
        float fM3794getAlphaimpl = Color.m3794getAlphaimpl(j3);
        float fM3794getAlphaimpl2 = Color.m3794getAlphaimpl(jM3789convertvNxB06k);
        float f4 = 1.0f - fM3794getAlphaimpl2;
        float f5 = (fM3794getAlphaimpl * f4) + fM3794getAlphaimpl2;
        float fM3798getRedimpl = Color.m3798getRedimpl(jM3789convertvNxB06k);
        float fM3798getRedimpl2 = Color.m3798getRedimpl(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM3798getRedimpl2 * fM3794getAlphaimpl) * f4) + (fM3798getRedimpl * fM3794getAlphaimpl2)) / f5;
        }
        float fM3797getGreenimpl = Color.m3797getGreenimpl(jM3789convertvNxB06k);
        float fM3797getGreenimpl2 = Color.m3797getGreenimpl(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fM3797getGreenimpl2 * fM3794getAlphaimpl) * f4) + (fM3797getGreenimpl * fM3794getAlphaimpl2)) / f5;
        }
        float fM3795getBlueimpl = Color.m3795getBlueimpl(jM3789convertvNxB06k);
        float fM3795getBlueimpl2 = Color.m3795getBlueimpl(j3);
        if (f5 != 0.0f) {
            f6 = (((fM3795getBlueimpl2 * fM3794getAlphaimpl) * f4) + (fM3795getBlueimpl * fM3794getAlphaimpl2)) / f5;
        }
        return UncheckedColor(f2, f3, f6, f5, Color.m3796getColorSpaceimpl(j3));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m3838getComponents8_81llA(long j2) {
        return new float[]{Color.m3798getRedimpl(j2), Color.m3797getGreenimpl(j2), Color.m3795getBlueimpl(j2), Color.m3794getAlphaimpl(j2)};
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m3839isSpecified8_81llA(long j2) {
        return j2 != 16;
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m3840isSpecified8_81llA$annotations(long j2) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m3841isUnspecified8_81llA(long j2) {
        return j2 == 16;
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m3842isUnspecified8_81llA$annotations(long j2) {
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m3843lerpjxsXWHM(long j2, long j3, float f2) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM3789convertvNxB06k = Color.m3789convertvNxB06k(j2, oklab);
        long jM3789convertvNxB06k2 = Color.m3789convertvNxB06k(j3, oklab);
        float fM3794getAlphaimpl = Color.m3794getAlphaimpl(jM3789convertvNxB06k);
        float fM3798getRedimpl = Color.m3798getRedimpl(jM3789convertvNxB06k);
        float fM3797getGreenimpl = Color.m3797getGreenimpl(jM3789convertvNxB06k);
        float fM3795getBlueimpl = Color.m3795getBlueimpl(jM3789convertvNxB06k);
        float fM3794getAlphaimpl2 = Color.m3794getAlphaimpl(jM3789convertvNxB06k2);
        float fM3798getRedimpl2 = Color.m3798getRedimpl(jM3789convertvNxB06k2);
        float fM3797getGreenimpl2 = Color.m3797getGreenimpl(jM3789convertvNxB06k2);
        float fM3795getBlueimpl2 = Color.m3795getBlueimpl(jM3789convertvNxB06k2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return Color.m3789convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM3798getRedimpl, fM3798getRedimpl2, f2), MathHelpersKt.lerp(fM3797getGreenimpl, fM3797getGreenimpl2, f2), MathHelpersKt.lerp(fM3795getBlueimpl, fM3795getBlueimpl2, f2), MathHelpersKt.lerp(fM3794getAlphaimpl, fM3794getAlphaimpl2, f2), oklab), Color.m3796getColorSpaceimpl(j3));
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m3844luminance8_81llA(long j2) {
        ColorSpace colorSpaceM3796getColorSpaceimpl = Color.m3796getColorSpaceimpl(j2);
        if (!ColorModel.m4198equalsimpl0(colorSpaceM3796getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m4205getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m4201toStringimpl(colorSpaceM3796getColorSpaceimpl.getModel())));
        }
        Intrinsics.checkNotNull(colorSpaceM3796getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM3796getColorSpaceimpl).getEotfFunc();
        double dInvoke = eotfFunc$ui_graphics_release.invoke(Color.m3798getRedimpl(j2));
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m3795getBlueimpl(j2)) * 0.0722d) + (eotfFunc$ui_graphics_release.invoke(Color.m3797getGreenimpl(j2)) * 0.7152d) + (dInvoke * 0.2126d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m3845takeOrElseDxMtmZc(long j2, Function0<Color> function0) {
        return j2 != 16 ? j2 : function0.invoke().m3802unboximpl();
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m3846toArgb8_81llA(long j2) {
        return (int) ULong.m6672constructorimpl(Color.m3789convertvNxB06k(j2, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = 255;
        }
        return Color(i2, i3, i4, i5);
    }

    public static final long Color(int i2) {
        return Color.m3788constructorimpl(ULong.m6672constructorimpl(ULong.m6672constructorimpl(i2) << 32));
    }

    public static final long Color(long j2) {
        return Color.m3788constructorimpl(ULong.m6672constructorimpl(j2 << 32));
    }

    public static final long Color(int i2, int i3, int i4, int i5) {
        return Color(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }
}
