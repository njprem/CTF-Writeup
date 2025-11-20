package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\u0016\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\"\u0010=\u001a\u0002012\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\b\u0010D\u001a\u00020,H\u0002J\u000e\u0010E\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\u000e\u0010F\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\"\u0010G\u001a\u00020\u000b2\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010CJ\u0010\u0010I\u001a\u0002072\u0006\u0010<\u001a\u00020\u001fH\u0002J\u0010\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010L\u001a\u00020\u0003H\u0016JH\u0010M\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u00020!X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\"\u0010#\u001a\u00020$X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\u000209X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "cachedIntrinsicHeight", "cachedIntrinsicHeightInputWidth", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "didOverflow", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastDensity", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "J", "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "observeFontChanges", "", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "I", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "prevConstraints", "Landroidx/compose/ui/unit/Constraints;", "intrinsicHeight", "width", "layoutDirection", "layoutText", "constraints", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "layoutWithConstraints", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "markDirty", "maxIntrinsicWidth", "minIntrinsicWidth", "newLayoutWillBeDifferent", "newLayoutWillBeDifferent-K40F9xA", "setLayoutDirection", "slowCreateTextLayoutResultOrNull", "Landroidx/compose/ui/text/TextLayoutResult;", "toString", "update", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z, i3, i4);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final Paragraph m1266layoutTextK40F9xA(long constraints, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m5605Paragraph_EkL_Y(layoutDirection2, LayoutUtilsKt.m1255finalConstraintstfFHcEY(constraints, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1256finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m6164equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6172getEllipsisgIe3tQ8()));
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.INSTANCE.m6196fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m1267newLayoutWillBeDifferentK40F9xA(long constraints, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m6179equalsimpl0(constraints, this.prevConstraints)) {
            return false;
        }
        return Constraints.m6186getMaxWidthimpl(constraints) != Constraints.m6186getMaxWidthimpl(this.prevConstraints) || ((float) Constraints.m6185getMaxHeightimpl(constraints)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsicsParagraphIntrinsics$default = this.paragraphIntrinsics;
        if (paragraphIntrinsicsParagraphIntrinsics$default == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsicsParagraphIntrinsics$default.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            paragraphIntrinsicsParagraphIntrinsics$default = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, textStyleResolveDefaults, (List) null, (List) null, density, this.fontFamilyResolver, 12, (Object) null);
        }
        this.paragraphIntrinsics = paragraphIntrinsicsParagraphIntrinsics$default;
        return paragraphIntrinsicsParagraphIntrinsics$default;
    }

    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: getDidOverflow$foundation_release, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: getParagraph$foundation_release, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int width, LayoutDirection layoutDirection) {
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (width == i2 && i2 != -1) {
            return i3;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m1266layoutTextK40F9xA(ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1269layoutWithConstraintsK40F9xA(long constraints, LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2;
        boolean z = true;
        if (this.minLines > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            layoutDirection2 = layoutDirection;
            MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection2, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = minLinesConstrainerFrom;
            constraints = minLinesConstrainerFrom.m1258coerceMinLinesOh53vG4$foundation_release(constraints, this.minLines);
        } else {
            layoutDirection2 = layoutDirection;
        }
        boolean z2 = false;
        if (m1267newLayoutWillBeDifferentK40F9xA(constraints, layoutDirection2)) {
            Paragraph paragraphM1266layoutTextK40F9xA = m1266layoutTextK40F9xA(constraints, layoutDirection2);
            this.prevConstraints = constraints;
            this.layoutSize = ConstraintsKt.m6200constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraphM1266layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(paragraphM1266layoutTextK40F9xA.getHeight())));
            if (!TextOverflow.m6164equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6173getVisiblegIe3tQ8()) && (IntSize.m6403getWidthimpl(r9) < paragraphM1266layoutTextK40F9xA.getWidth() || IntSize.m6402getHeightimpl(r9) < paragraphM1266layoutTextK40F9xA.getHeight())) {
                z2 = true;
            }
            this.didOverflow = z2;
            this.paragraph = paragraphM1266layoutTextK40F9xA;
            return true;
        }
        if (!Constraints.m6179equalsimpl0(constraints, this.prevConstraints)) {
            Paragraph paragraph = this.paragraph;
            Intrinsics.checkNotNull(paragraph);
            this.layoutSize = ConstraintsKt.m6200constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
            if (TextOverflow.m6164equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6173getVisiblegIe3tQ8()) || (IntSize.m6403getWidthimpl(r2) >= paragraph.getWidth() && IntSize.m6402getHeightimpl(r2) >= paragraph.getHeight())) {
                z = false;
            }
            this.didOverflow = z;
            this.prevConstraints = constraints;
        }
        return false;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(Density density) {
        Density density2 = this.density;
        long jM1246constructorimpl = density != null ? InlineDensity.m1246constructorimpl(density) : InlineDensity.INSTANCE.m1254getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM1246constructorimpl;
        } else if (density == null || !InlineDensity.m1248equalsimpl0(this.lastDensity, jM1246constructorimpl)) {
            this.density = density;
            this.lastDensity = jM1246constructorimpl;
            markDirty();
        }
    }

    public final void setDidOverflow$foundation_release(boolean z) {
        this.didOverflow = z;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m1270setLayoutSizeozmzZPI$foundation_release(long j2) {
        this.layoutSize = j2;
    }

    public final void setParagraph$foundation_release(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle style) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, style, CollectionsKt.emptyList(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jM6177copyZbe2FdA$default, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, style, (List<AnnotatedString.Range<Placeholder>>) CollectionsKt.emptyList(), density, this.fontFamilyResolver), jM6177copyZbe2FdA$default, this.maxLines, TextOverflow.m6164equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6172getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m1252toStringimpl(this.lastDensity));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m1271updateL6sJoHM(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        markDirty();
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.lastDensity = InlineDensity.INSTANCE.m1254getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.prevConstraints = Constraints.INSTANCE.m6196fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.INSTANCE.m6171getClipgIe3tQ8() : i2, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? Integer.MAX_VALUE : i3, (i5 & 64) != 0 ? 1 : i4, null);
    }
}
