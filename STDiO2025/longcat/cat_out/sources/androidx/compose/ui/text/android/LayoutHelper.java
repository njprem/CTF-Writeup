package androidx.compose.ui.text.android;

import J.d;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010#J\u000e\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u0010\u0010%\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u001a\u0010&\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010'\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0018\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", "offset", "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getLineBidiRuns", "", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "lineIndex", "getLineBidiRuns$ui_text_release", "(I)[Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "getLineVisibleEnd", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "lineStart", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i2, int i3, boolean z) {
            this.start = i2;
            this.end = i3;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = bidiRun.start;
            }
            if ((i4 & 2) != 0) {
                i3 = bidiRun.end;
            }
            if ((i4 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i2, i3, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public final BidiRun copy(int start, int end, boolean isRtl) {
            return new BidiRun(start, end, isRtl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRtl) + d.c(this.end, Integer.hashCode(this.start) * 31, 31);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(this.layout.getText(), '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.layout.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int offset, boolean primary) {
        int iCoerceAtMost = RangesKt.coerceAtMost(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        return primary ? this.layout.getPrimaryHorizontal(iCoerceAtMost) : this.layout.getSecondaryHorizontal(iCoerceAtMost);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i2, z);
    }

    private final int lineEndToVisibleEnd(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && isLineEndSpace(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.bidiProcessedParagraphs
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r10.paragraphEnds
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r10.paragraphEnds
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.isRtlParagraph(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            r0.set(r11, r3)
            boolean[] r0 = r10.bidiProcessedParagraphs
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.tmpBuffer
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.tmpBuffer = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection, boolean upstream) {
        int iLineEndToVisibleEnd = offset;
        if (!upstream) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, iLineEndToVisibleEnd, upstream);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        if (iLineEndToVisibleEnd == 0 || iLineEndToVisibleEnd == this.layout.getText().length()) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, upstream);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i2 = lineStart - paragraphStart;
        int i3 = iLineEndToVisibleEnd2 - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i2, i3) : null;
        boolean z = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (iLineEndToVisibleEnd == lineStart) {
                z = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z = true;
            }
            Layout layout = this.layout;
            return z ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            bidiRunArr[i4] = new BidiRun(bidiCreateLineBidi.getRunStart(i4) + lineStart, bidiCreateLineBidi.getRunLimit(i4) + lineStart, bidiCreateLineBidi.getRunLevel(i4) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i5 = 0; i5 < runCount2; i5++) {
            bArr[i5] = (byte) bidiCreateLineBidi.getRunLevel(i5);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i6 = -1;
        if (iLineEndToVisibleEnd == lineStart) {
            int i7 = 0;
            while (true) {
                if (i7 >= runCount) {
                    break;
                }
                if (bidiRunArr[i7].getStart() == iLineEndToVisibleEnd) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            BidiRun bidiRun = bidiRunArr[i6];
            if (usePrimaryDirection || zIsRtlParagraph == bidiRun.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            return (i6 == 0 && zIsRtlParagraph) ? this.layout.getLineLeft(lineForOffset) : (i6 != ArraysKt.getLastIndex(bidiRunArr) || zIsRtlParagraph) ? zIsRtlParagraph ? this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getStart()) : this.layout.getLineRight(lineForOffset);
        }
        if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
            iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= runCount) {
                break;
            }
            if (bidiRunArr[i8].getEnd() == iLineEndToVisibleEnd) {
                i6 = i8;
                break;
            }
            i8++;
        }
        BidiRun bidiRun2 = bidiRunArr[i6];
        if (!usePrimaryDirection && zIsRtlParagraph != bidiRun2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        return (i6 == 0 && zIsRtlParagraph) ? this.layout.getLineLeft(lineForOffset) : (i6 != ArraysKt.getLastIndex(bidiRunArr) || zIsRtlParagraph) ? zIsRtlParagraph ? this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getEnd()) : this.layout.getLineRight(lineForOffset);
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final BidiRun[] getLineBidiRuns$ui_text_release(int lineIndex) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(lineIndex);
        int lineEnd = this.layout.getLineEnd(lineIndex);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i2 = lineStart - paragraphStart;
        int i3 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(i2, i3)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            int runStart = bidiCreateLineBidi.getRunStart(i4) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i4) + lineStart;
            boolean z = true;
            if (bidiCreateLineBidi.getRunLevel(i4) % 2 != 1) {
                z = false;
            }
            bidiRunArr[i4] = new BidiRun(runStart, runLimit, z);
        }
        return bidiRunArr;
    }

    public final int getLineVisibleEnd(int lineIndex) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(int paragraphIndex) {
        return this.paragraphEnds.get(paragraphIndex).intValue();
    }

    public final int getParagraphForOffset(int offset, boolean upstream) {
        int iBinarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, (Object) null);
        int i2 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (upstream && i2 > 0) {
            int i3 = i2 - 1;
            if (offset == this.paragraphEnds.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final boolean isLineEndSpace(char c2) {
        if (c2 == ' ' || c2 == '\n' || c2 == 5760) {
            return true;
        }
        return (Intrinsics.compare((int) c2, 8192) >= 0 && Intrinsics.compare((int) c2, 8202) <= 0 && c2 != 8199) || c2 == 8287 || c2 == 12288;
    }

    public final boolean isRtlParagraph(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(paragraphIndex))) == -1;
    }
}
