package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4, Density density, boolean z) {
        long jM6425getTypeUIouoOA = TextUnit.m6425getTypeUIouoOA(spanStyle.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m6454equalsimpl0(jM6425getTypeUIouoOA, companion.m6459getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo333toPxR2X_6o(spanStyle.getFontSize()));
        } else if (TextUnitType.m6454equalsimpl0(jM6425getTypeUIouoOA, companion.m6458getEmUIouoOA())) {
            androidTextPaint.setTextSize(TextUnit.m6426getValueimpl(spanStyle.getFontSize()) * androidTextPaint.getTextSize());
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = spanStyle.getFontStyle();
            FontStyle fontStyleM5827boximpl = FontStyle.m5827boximpl(fontStyle != null ? fontStyle.m5833unboximpl() : FontStyle.INSTANCE.m5837getNormal_LCdwA());
            FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
            androidTextPaint.setTypeface(function4.invoke(fontFamily, fontWeight, fontStyleM5827boximpl, FontSynthesis.m5838boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m5847getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.areEqual(spanStyle.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(spanStyle.getTextGeometricTransform().getScaleX() * androidTextPaint.getTextScaleX());
            androidTextPaint.setTextSkewX(spanStyle.getTextGeometricTransform().getSkewX() + androidTextPaint.getTextSkewX());
        }
        androidTextPaint.m5987setColor8_81llA(spanStyle.m5671getColor0d7_KjU());
        androidTextPaint.m5985setBrush12SF9DM(spanStyle.getBrush(), Size.INSTANCE.m3628getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getBackground());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m6454equalsimpl0(TextUnit.m6425getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m6459getSpUIouoOA()) && TextUnit.m6426getValueimpl(spanStyle.getLetterSpacing()) != 0.0f) {
            float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
            float fMo333toPxR2X_6o = density.mo333toPxR2X_6o(spanStyle.getLetterSpacing());
            if (textScaleX != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo333toPxR2X_6o / textScaleX);
            }
        } else if (TextUnitType.m6454equalsimpl0(TextUnit.m6425getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m6458getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m6426getValueimpl(spanStyle.getLetterSpacing()));
        }
        return m6001generateFallbackSpanStyle62GTOB8(spanStyle.getLetterSpacing(), z, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z);
    }

    public static final float correctBlurRadius(float f2) {
        if (f2 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f2;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m6001generateFallbackSpanStyle62GTOB8(long j2, boolean z, long j3, BaselineShift baselineShift) {
        long jM3828getUnspecified0d7_KjU = j3;
        boolean z2 = false;
        boolean z3 = z && TextUnitType.m6454equalsimpl0(TextUnit.m6425getTypeUIouoOA(j2), TextUnitType.INSTANCE.m6459getSpUIouoOA()) && TextUnit.m6426getValueimpl(j2) != 0.0f;
        Color.Companion companion = Color.INSTANCE;
        boolean z4 = (Color.m3793equalsimpl0(jM3828getUnspecified0d7_KjU, companion.m3828getUnspecified0d7_KjU()) || Color.m3793equalsimpl0(jM3828getUnspecified0d7_KjU, companion.m3827getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m6009equalsimpl0(baselineShift.m6012unboximpl(), BaselineShift.INSTANCE.m6016getNoney9eOQZs())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long jM6437getUnspecifiedXSAIIZE = z3 ? j2 : TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE();
        if (!z4) {
            jM3828getUnspecified0d7_KjU = companion.m3828getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM6437getUnspecifiedXSAIIZE, z2 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM3828getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int linearity = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m6154equalsimpl0(linearity, companion.m6159getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m6154equalsimpl0(linearity, companion.m6158getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m6154equalsimpl0(linearity, companion.m6160getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
