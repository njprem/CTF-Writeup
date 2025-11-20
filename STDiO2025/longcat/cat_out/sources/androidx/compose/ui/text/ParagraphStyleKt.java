package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001af\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0018\u0010\"\u001a\u0004\u0018\u00010\n*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "fastMerge", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE();

    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m5630fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        long j3;
        int textAlign = i2;
        TextIndent textIndent2 = textIndent;
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m6118equalsimpl0(textAlign, companion.m6128getUnspecifiede0LSkKk()) || TextAlign.m6118equalsimpl0(textAlign, paragraphStyle.getTextAlign())) {
            if (TextUnitKt.m6444isUnspecifiedR2X_6o(j2)) {
                j3 = j2;
            } else {
                j3 = j2;
                if (TextUnit.m6423equalsimpl0(j3, paragraphStyle.getLineHeight())) {
                }
            }
            if ((textIndent2 == null || Intrinsics.areEqual(textIndent2, paragraphStyle.getTextIndent())) && ((TextDirection.m6132equalsimpl0(i3, TextDirection.INSTANCE.m6141getUnspecifieds_7Xco()) || TextDirection.m6132equalsimpl0(i3, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || Intrinsics.areEqual(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || Intrinsics.areEqual(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((LineBreak.m6041equalsimpl0(i4, LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k()) || LineBreak.m6041equalsimpl0(i4, paragraphStyle.getLineBreak())) && ((Hyphens.m6028equalsimpl0(i5, Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8()) || Hyphens.m6028equalsimpl0(i5, paragraphStyle.getHyphens())) && (textMotion == null || Intrinsics.areEqual(textMotion, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j3 = j2;
        }
        long lineHeight = TextUnitKt.m6444isUnspecifiedR2X_6o(j3) ? paragraphStyle.getLineHeight() : j3;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (TextAlign.m6118equalsimpl0(textAlign, companion.m6128getUnspecifiede0LSkKk())) {
            textAlign = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(textAlign, !TextDirection.m6132equalsimpl0(i3, TextDirection.INSTANCE.m6141getUnspecifieds_7Xco()) ? i3 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !LineBreak.m6041equalsimpl0(i4, LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k()) ? i4 : paragraphStyle.getLineBreak(), !Hyphens.m6028equalsimpl0(i5, Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8()) ? i5 : paragraphStyle.getHyphens(), textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (DefaultConstructorMarker) null);
    }

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f2) {
        int value = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m6115boximpl(paragraphStyle.getTextAlign()), TextAlign.m6115boximpl(paragraphStyle2.getTextAlign()), f2)).getValue();
        int value2 = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m6129boximpl(paragraphStyle.getTextDirection()), TextDirection.m6129boximpl(paragraphStyle2.getTextDirection()), f2)).getValue();
        long jM5677lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m5677lerpTextUnitInheritableC3pnCVY(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f2);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.getNone();
        }
        return new ParagraphStyle(value, value2, jM5677lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f2), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f2), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f2), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m6035boximpl(paragraphStyle.getLineBreak()), LineBreak.m6035boximpl(paragraphStyle2.getLineBreak()), f2)).getMask(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m6025boximpl(paragraphStyle.getHyphens()), Hyphens.m6025boximpl(paragraphStyle2.getHyphens()), f2)).getValue(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f2), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f2) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f2);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int textAlign = paragraphStyle.getTextAlign();
        TextAlign.Companion companion = TextAlign.INSTANCE;
        int iM6127getStarte0LSkKk = TextAlign.m6118equalsimpl0(textAlign, companion.m6128getUnspecifiede0LSkKk()) ? companion.m6127getStarte0LSkKk() : paragraphStyle.getTextAlign();
        int iM5767resolveTextDirectionIhaHGbI = TextStyleKt.m5767resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.getTextDirection());
        long lineHeight = TextUnitKt.m6444isUnspecifiedR2X_6o(paragraphStyle.getLineHeight()) ? DefaultLineHeight : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        LineBreak.Companion companion2 = LineBreak.INSTANCE;
        int iM6054getSimplerAG3T2k = LineBreak.m6041equalsimpl0(lineBreak, companion2.m6055getUnspecifiedrAG3T2k()) ? companion2.m6054getSimplerAG3T2k() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        Hyphens.Companion companion3 = Hyphens.INSTANCE;
        int iM6033getNonevmbZdU8 = Hyphens.m6028equalsimpl0(hyphens, companion3.m6034getUnspecifiedvmbZdU8()) ? companion3.m6033getNonevmbZdU8() : paragraphStyle.getHyphens();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        return new ParagraphStyle(iM6127getStarte0LSkKk, iM5767resolveTextDirectionIhaHGbI, lineHeight, textIndent2, platformStyle, lineHeightStyle, iM6054getSimplerAG3T2k, iM6033getNonevmbZdU8, textMotion, (DefaultConstructorMarker) null);
    }
}
