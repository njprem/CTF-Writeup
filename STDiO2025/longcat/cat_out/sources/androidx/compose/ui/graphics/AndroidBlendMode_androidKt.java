package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import android.os.Build;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                android.graphics.BlendMode unused = android.graphics.BlendMode.CLEAR;
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                android.graphics.BlendMode unused3 = android.graphics.BlendMode.SRC;
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                android.graphics.BlendMode unused5 = android.graphics.BlendMode.DST;
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                android.graphics.BlendMode unused7 = android.graphics.BlendMode.SRC_OVER;
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                android.graphics.BlendMode unused9 = android.graphics.BlendMode.DST_OVER;
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                android.graphics.BlendMode unused11 = android.graphics.BlendMode.SRC_IN;
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                android.graphics.BlendMode unused13 = android.graphics.BlendMode.DST_IN;
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                android.graphics.BlendMode unused15 = android.graphics.BlendMode.SRC_OUT;
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                android.graphics.BlendMode unused17 = android.graphics.BlendMode.DST_OUT;
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                android.graphics.BlendMode unused19 = android.graphics.BlendMode.SRC_ATOP;
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                android.graphics.BlendMode unused21 = android.graphics.BlendMode.DST_ATOP;
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                android.graphics.BlendMode unused23 = android.graphics.BlendMode.XOR;
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                android.graphics.BlendMode unused25 = android.graphics.BlendMode.PLUS;
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                android.graphics.BlendMode unused27 = android.graphics.BlendMode.MODULATE;
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                android.graphics.BlendMode unused29 = android.graphics.BlendMode.SCREEN;
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                android.graphics.BlendMode unused31 = android.graphics.BlendMode.OVERLAY;
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                android.graphics.BlendMode unused33 = android.graphics.BlendMode.DARKEN;
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                android.graphics.BlendMode unused35 = android.graphics.BlendMode.LIGHTEN;
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                android.graphics.BlendMode unused37 = android.graphics.BlendMode.COLOR_DODGE;
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                android.graphics.BlendMode unused39 = android.graphics.BlendMode.COLOR_BURN;
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                android.graphics.BlendMode unused41 = android.graphics.BlendMode.HARD_LIGHT;
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                android.graphics.BlendMode unused43 = android.graphics.BlendMode.SOFT_LIGHT;
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                android.graphics.BlendMode unused45 = android.graphics.BlendMode.DIFFERENCE;
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                android.graphics.BlendMode unused47 = android.graphics.BlendMode.EXCLUSION;
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                android.graphics.BlendMode unused49 = android.graphics.BlendMode.MULTIPLY;
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                android.graphics.BlendMode unused51 = android.graphics.BlendMode.HUE;
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                android.graphics.BlendMode unused53 = android.graphics.BlendMode.SATURATION;
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                android.graphics.BlendMode unused55 = android.graphics.BlendMode.COLOR;
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                android.graphics.BlendMode unused57 = android.graphics.BlendMode.LUMINOSITY;
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused58) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m3642isSupporteds9anfk8(int i2) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m3703equalsimpl0(i2, BlendMode.INSTANCE.m3734getSrcOver0nO6VwU()) || m3644toPorterDuffModes9anfk8(i2) != PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m3643toAndroidBlendModes9anfk8(int i2) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m3703equalsimpl0(i2, companion.m3707getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m3703equalsimpl0(i2, companion.m3730getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m3703equalsimpl0(i2, companion.m3713getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m3703equalsimpl0(i2, companion.m3734getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m3703equalsimpl0(i2, companion.m3717getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m3703equalsimpl0(i2, companion.m3732getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m3703equalsimpl0(i2, companion.m3715getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m3703equalsimpl0(i2, companion.m3733getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m3703equalsimpl0(i2, companion.m3716getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m3703equalsimpl0(i2, companion.m3731getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m3703equalsimpl0(i2, companion.m3714getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m3703equalsimpl0(i2, companion.m3735getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m3703equalsimpl0(i2, companion.m3726getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m3703equalsimpl0(i2, companion.m3723getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m3703equalsimpl0(i2, companion.m3728getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m3703equalsimpl0(i2, companion.m3725getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m3703equalsimpl0(i2, companion.m3711getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m3703equalsimpl0(i2, companion.m3721getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m3703equalsimpl0(i2, companion.m3710getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m3703equalsimpl0(i2, companion.m3709getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m3703equalsimpl0(i2, companion.m3719getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m3703equalsimpl0(i2, companion.m3729getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m3703equalsimpl0(i2, companion.m3712getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m3703equalsimpl0(i2, companion.m3718getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m3703equalsimpl0(i2, companion.m3724getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m3703equalsimpl0(i2, companion.m3720getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m3703equalsimpl0(i2, companion.m3727getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m3703equalsimpl0(i2, companion.m3708getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m3703equalsimpl0(i2, companion.m3722getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.INSTANCE.m3707getClear0nO6VwU();
            case 2:
                return BlendMode.INSTANCE.m3730getSrc0nO6VwU();
            case 3:
                return BlendMode.INSTANCE.m3713getDst0nO6VwU();
            case 4:
                return BlendMode.INSTANCE.m3734getSrcOver0nO6VwU();
            case 5:
                return BlendMode.INSTANCE.m3717getDstOver0nO6VwU();
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                return BlendMode.INSTANCE.m3732getSrcIn0nO6VwU();
            case 7:
                return BlendMode.INSTANCE.m3715getDstIn0nO6VwU();
            case 8:
                return BlendMode.INSTANCE.m3733getSrcOut0nO6VwU();
            case 9:
                return BlendMode.INSTANCE.m3716getDstOut0nO6VwU();
            case 10:
                return BlendMode.INSTANCE.m3731getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.INSTANCE.m3714getDstAtop0nO6VwU();
            case Matrix.TranslateX /* 12 */:
                return BlendMode.INSTANCE.m3735getXor0nO6VwU();
            case Matrix.TranslateY /* 13 */:
                return BlendMode.INSTANCE.m3726getPlus0nO6VwU();
            case Matrix.TranslateZ /* 14 */:
                return BlendMode.INSTANCE.m3723getModulate0nO6VwU();
            case 15:
                return BlendMode.INSTANCE.m3728getScreen0nO6VwU();
            case 16:
                return BlendMode.INSTANCE.m3725getOverlay0nO6VwU();
            case 17:
                return BlendMode.INSTANCE.m3711getDarken0nO6VwU();
            case 18:
                return BlendMode.INSTANCE.m3721getLighten0nO6VwU();
            case 19:
                return BlendMode.INSTANCE.m3710getColorDodge0nO6VwU();
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return BlendMode.INSTANCE.m3709getColorBurn0nO6VwU();
            case 21:
                return BlendMode.INSTANCE.m3719getHardlight0nO6VwU();
            case 22:
                return BlendMode.INSTANCE.m3729getSoftlight0nO6VwU();
            case 23:
                return BlendMode.INSTANCE.m3712getDifference0nO6VwU();
            case 24:
                return BlendMode.INSTANCE.m3718getExclusion0nO6VwU();
            case 25:
                return BlendMode.INSTANCE.m3724getMultiply0nO6VwU();
            case 26:
                return BlendMode.INSTANCE.m3720getHue0nO6VwU();
            case 27:
                return BlendMode.INSTANCE.m3727getSaturation0nO6VwU();
            case 28:
                return BlendMode.INSTANCE.m3708getColor0nO6VwU();
            case 29:
                return BlendMode.INSTANCE.m3722getLuminosity0nO6VwU();
            default:
                return BlendMode.INSTANCE.m3734getSrcOver0nO6VwU();
        }
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m3644toPorterDuffModes9anfk8(int i2) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m3703equalsimpl0(i2, companion.m3707getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : BlendMode.m3703equalsimpl0(i2, companion.m3730getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : BlendMode.m3703equalsimpl0(i2, companion.m3713getDst0nO6VwU()) ? PorterDuff.Mode.DST : BlendMode.m3703equalsimpl0(i2, companion.m3734getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : BlendMode.m3703equalsimpl0(i2, companion.m3717getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : BlendMode.m3703equalsimpl0(i2, companion.m3732getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : BlendMode.m3703equalsimpl0(i2, companion.m3715getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : BlendMode.m3703equalsimpl0(i2, companion.m3733getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : BlendMode.m3703equalsimpl0(i2, companion.m3716getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : BlendMode.m3703equalsimpl0(i2, companion.m3731getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.m3703equalsimpl0(i2, companion.m3714getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : BlendMode.m3703equalsimpl0(i2, companion.m3735getXor0nO6VwU()) ? PorterDuff.Mode.XOR : BlendMode.m3703equalsimpl0(i2, companion.m3726getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : BlendMode.m3703equalsimpl0(i2, companion.m3728getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : BlendMode.m3703equalsimpl0(i2, companion.m3725getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : BlendMode.m3703equalsimpl0(i2, companion.m3711getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : BlendMode.m3703equalsimpl0(i2, companion.m3721getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : BlendMode.m3703equalsimpl0(i2, companion.m3723getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
