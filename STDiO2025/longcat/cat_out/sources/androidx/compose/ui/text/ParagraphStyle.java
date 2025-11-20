package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B5\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015BM\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016Be\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0017Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0018Jr\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b<\u0010=J@\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?JX\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJp\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ|\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010I\u001a\u00020JH\u0016J\u0014\u0010K\u001a\u00020\u00002\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010L\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0087\u0002J\b\u0010M\u001a\u00020NH\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b5\u0010+R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b6\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getHyphens-vmbZdU8", "()I", "I", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-e0LSkKk", "getTextDirection-s_7X-co", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5607copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m6115boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m6129boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m5616copyElsmlbk(textAlign, textDirection, j2, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5608copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m6115boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m6129boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i2 & 64) != 0) {
            lineBreak = LineBreak.m6035boximpl(paragraphStyle.lineBreak);
        }
        if ((i2 & 128) != 0) {
            hyphens = Hyphens.m6025boximpl(paragraphStyle.hyphens);
        }
        if ((i2 & Fields.RotationX) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j3 = j2;
        return paragraphStyle.m5617copyNH1kkwU(textAlign, textDirection, j3, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5609copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m6115boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m6129boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i2 & 64) != 0) {
            lineBreak = LineBreak.m6035boximpl(paragraphStyle.lineBreak);
        }
        if ((i2 & 128) != 0) {
            hyphens = Hyphens.m6025boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j3 = j2;
        return paragraphStyle.m5618copyciSxzs0(textAlign, textDirection, j3, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5610copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m6115boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m6129boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j3 = j2;
        return paragraphStyle.m5619copyxPh5V4g(textAlign, textDirection, j3, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5611copyykzQM6k$default(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = paragraphStyle.textAlign;
        }
        if ((i6 & 2) != 0) {
            i3 = paragraphStyle.textDirection;
        }
        if ((i6 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i6 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i6 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i6 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i6 & 64) != 0) {
            i4 = paragraphStyle.lineBreak;
        }
        if ((i6 & 128) != 0) {
            i5 = paragraphStyle.hyphens;
        }
        if ((i6 & Fields.RotationX) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        int i7 = i5;
        TextMotion textMotion2 = textMotion;
        long j3 = j2;
        return paragraphStyle.m5620copyykzQM6k(i2, i3, j3, textIndent, platformParagraphStyle, lineHeightStyle, i4, i7, textMotion2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m5612getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m5613getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m5614getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m5615getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5616copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5617copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5618copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8(), this.textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5619copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m5620copyykzQM6k(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return TextAlign.m6118equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m6132equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m6423equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m6041equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m6028equalsimpl0(this.hyphens, paragraphStyle.hyphens) && Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m5621getHyphensEaSxIns() {
        return Hyphens.m6025boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name and from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m5623getLineBreakLgCVezo() {
        return LineBreak.m6035boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name and from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m5626getTextAlignbuA522U() {
        return TextAlign.m6115boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m5628getTextDirectionmmuk1to() {
        return TextDirection.m6129boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name and from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int iM6427hashCodeimpl = (TextUnit.m6427hashCodeimpl(this.lineHeight) + ((TextDirection.m6133hashCodeimpl(this.textDirection) + (TextAlign.m6119hashCodeimpl(this.textAlign) * 31)) * 31)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM6427hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iM6029hashCodeimpl = (Hyphens.m6029hashCodeimpl(this.hyphens) + ((LineBreak.m6045hashCodeimpl(this.lineBreak) + ((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31)) * 31)) * 31;
        TextMotion textMotion = this.textMotion;
        return iM6029hashCodeimpl + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final ParagraphStyle merge(ParagraphStyle other) {
        return other == null ? this : ParagraphStyleKt.m5630fastMergej5T8yCg(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public final ParagraphStyle plus(ParagraphStyle other) {
        return merge(other);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m6120toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m6134toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m6433toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m6046toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m6030toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent);
    }

    private ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this.textAlign = i2;
        this.textDirection = i3;
        this.lineHeight = j2;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i4;
        this.hyphens = i5;
        this.textMotion = textMotion;
        if (TextUnit.m6423equalsimpl0(j2, TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE()) || TextUnit.m6426getValueimpl(j2) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m6426getValueimpl(j2) + ')').toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        int iM6128getUnspecifiede0LSkKk = (i6 & 1) != 0 ? TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk() : i2;
        int iM6141getUnspecifieds_7Xco = (i6 & 2) != 0 ? TextDirection.INSTANCE.m6141getUnspecifieds_7Xco() : i3;
        long jM6437getUnspecifiedXSAIIZE = (i6 & 4) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2;
        TextIndent textIndent2 = (i6 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i6 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i6 & 32) != 0 ? null : lineHeightStyle;
        int iM6055getUnspecifiedrAG3T2k = (i6 & 64) != 0 ? LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k() : i4;
        int iM6034getUnspecifiedvmbZdU8 = (i6 & 128) != 0 ? Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8() : i5;
        this(iM6128getUnspecifiede0LSkKk, iM6141getUnspecifieds_7Xco, jM6437getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, iM6055getUnspecifiedrAG3T2k, iM6034getUnspecifiedvmbZdU8, (i6 & Fields.RotationX) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, (i2 & 4) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : textIndent, (i2 & 16) != 0 ? null : platformParagraphStyle, (i2 & 32) != 0 ? null : lineHeightStyle, (i2 & 64) != 0 ? null : lineBreak, (i2 & 128) != 0 ? null : hyphens, (i2 & Fields.RotationX) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, (i2 & 4) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), j2, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, (i2 & 4) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : textIndent, (i2 & 16) != 0 ? null : platformParagraphStyle, (i2 & 32) != 0 ? null : lineHeightStyle, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, (i2 & 4) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : textIndent, (i2 & 16) != 0 ? null : platformParagraphStyle, (i2 & 32) != 0 ? null : lineHeightStyle, (i2 & 64) != 0 ? null : lineBreak, (i2 & 128) == 0 ? hyphens : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m6128getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m6141getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m6055getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m6034getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
