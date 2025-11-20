package androidx.compose.ui.text;

import J.d;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\n\u0010-\u001a\u00020.*\u00020.J\n\u0010-\u001a\u00020/*\u00020/J\u001e\u0010-\u001a\u000200*\u0002002\b\b\u0002\u00101\u001a\u00020(ø\u0001\u0000¢\u0006\u0004\b2\u00103J\n\u00104\u001a\u00020\u0005*\u00020\u0005J\n\u00105\u001a\u00020\u0005*\u00020\u0005J\n\u00106\u001a\u00020\n*\u00020\nJ\u0014\u00107\u001a\u000208*\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\n\u00107\u001a\u00020.*\u00020.J\n\u0010;\u001a\u00020\u0005*\u00020\u0005J\n\u0010<\u001a\u00020\u0005*\u00020\u0005J\n\u0010=\u001a\u00020\n*\u00020\nR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "startIndex", "", "endIndex", "startLineIndex", "endLineIndex", "top", "", "bottom", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "getBottom", "()F", "setBottom", "(F)V", "getEndIndex", "()I", "getEndLineIndex", "setEndLineIndex", "(I)V", "length", "getLength", "getParagraph", "()Landroidx/compose/ui/text/Paragraph;", "getStartIndex", "getStartLineIndex", "setStartLineIndex", "getTop", "setTop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "toGlobal", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "treatZeroAsNull", "toGlobal-xdX6-G0", "(JZ)J", "toGlobalIndex", "toGlobalLineIndex", "toGlobalYPosition", "toLocal", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocalIndex", "toLocalLineIndex", "toLocalYPosition", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        this.paragraph = paragraph;
        this.startIndex = i2;
        this.endIndex = i3;
        this.startLineIndex = i4;
        this.endLineIndex = i5;
        this.top = f2;
        this.bottom = f3;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i6 & 2) != 0) {
            i2 = paragraphInfo.startIndex;
        }
        if ((i6 & 4) != 0) {
            i3 = paragraphInfo.endIndex;
        }
        if ((i6 & 8) != 0) {
            i4 = paragraphInfo.startLineIndex;
        }
        if ((i6 & 16) != 0) {
            i5 = paragraphInfo.endLineIndex;
        }
        if ((i6 & 32) != 0) {
            f2 = paragraphInfo.top;
        }
        if ((i6 & 64) != 0) {
            f3 = paragraphInfo.bottom;
        }
        float f4 = f2;
        float f5 = f3;
        int i7 = i5;
        int i8 = i3;
        return paragraphInfo.copy(paragraph, i2, i8, i4, i7, f4, f5);
    }

    /* renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m5600toGlobalxdX6G0$default(ParagraphInfo paragraphInfo, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return paragraphInfo.m5601toGlobalxdX6G0(j2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component7, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
        return new ParagraphInfo(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) other;
        return Intrinsics.areEqual(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + d.b(d.c(this.endLineIndex, d.c(this.startLineIndex, d.c(this.endIndex, d.c(this.startIndex, this.paragraph.hashCode() * 31, 31), 31), 31), 31), 31, this.top);
    }

    public final void setBottom(float f2) {
        this.bottom = f2;
    }

    public final void setEndLineIndex(int i2) {
        this.endLineIndex = i2;
    }

    public final void setStartLineIndex(int i2) {
        this.startLineIndex = i2;
    }

    public final void setTop(float f2) {
        this.top = f2;
    }

    public final Rect toGlobal(Rect rect) {
        return rect.m3588translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m5601toGlobalxdX6G0(long j2, boolean z) {
        if (z) {
            TextRange.Companion companion = TextRange.INSTANCE;
            if (TextRange.m5714equalsimpl0(j2, companion.m5726getZerod9O1mEE())) {
                return companion.m5726getZerod9O1mEE();
            }
        }
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m5721getStartimpl(j2)), toGlobalIndex(TextRange.m5716getEndimpl(j2)));
    }

    public final int toGlobalIndex(int i2) {
        return i2 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i2) {
        return i2 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f2) {
        return f2 + this.top;
    }

    public final Rect toLocal(Rect rect) {
        return rect.m3588translatek4lQ0M(OffsetKt.Offset(0.0f, -this.top));
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m5602toLocalMKHz9U(long j2) {
        return OffsetKt.Offset(Offset.m3551getXimpl(j2), Offset.m3552getYimpl(j2) - this.top);
    }

    public final int toLocalIndex(int i2) {
        return RangesKt.coerceIn(i2, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int i2) {
        return i2 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f2) {
        return f2 - this.top;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.paragraph);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(", startLineIndex=");
        sb.append(this.startLineIndex);
        sb.append(", endLineIndex=");
        sb.append(this.endLineIndex);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", bottom=");
        return d.o(sb, this.bottom, ')');
    }

    public final Path toGlobal(Path path) {
        path.mo3687translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph, i2, i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) != 0 ? -1 : i5, (i6 & 32) != 0 ? -1.0f : f2, (i6 & 64) != 0 ? -1.0f : f3);
    }
}
