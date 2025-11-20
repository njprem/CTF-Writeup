package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J=\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "()V", "ops", "Landroidx/compose/foundation/text/input/internal/OpArray;", "[I", "opsSize", "", "map", "Landroidx/compose/ui/text/TextRange;", "offset", "fromSource", "", "map-fzxv0v0", "(IZ)J", "mapFromDest", "mapFromDest--jx7JFs", "(I)J", "mapFromSource", "mapFromSource--jx7JFs", "mapStep", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "recordEditOperation", "", "sourceStart", "sourceEnd", "newLength", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m1138constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m1133mapfzxv0v0(int offset, boolean fromSource) {
        int i2;
        int iMin;
        int[] iArr = this.ops;
        int i3 = this.opsSize;
        if (i3 >= 0) {
            if (fromSource) {
                int i4 = 0;
                iMin = offset;
                while (i4 < i3) {
                    int i5 = i4 * 3;
                    int i6 = iArr[i5];
                    int i7 = iArr[i5 + 1];
                    int i8 = iArr[i5 + 2];
                    long jM1134mapStepC6uMEY = m1134mapStepC6uMEY(iMin, i6, i7, i8, fromSource);
                    long jM1134mapStepC6uMEY2 = m1134mapStepC6uMEY(offset, i6, i7, i8, fromSource);
                    int iMin2 = Math.min(TextRange.m5721getStartimpl(jM1134mapStepC6uMEY), TextRange.m5721getStartimpl(jM1134mapStepC6uMEY2));
                    int iMax = Math.max(TextRange.m5716getEndimpl(jM1134mapStepC6uMEY), TextRange.m5716getEndimpl(jM1134mapStepC6uMEY2));
                    i4++;
                    iMin = iMin2;
                    offset = iMax;
                }
            } else {
                int i9 = i3 - 1;
                iMin = offset;
                while (-1 < i9) {
                    int i10 = i9 * 3;
                    int i11 = iArr[i10];
                    int i12 = iArr[i10 + 1];
                    int i13 = iArr[i10 + 2];
                    boolean z = fromSource;
                    long jM1134mapStepC6uMEY3 = m1134mapStepC6uMEY(iMin, i11, i12, i13, z);
                    long jM1134mapStepC6uMEY4 = m1134mapStepC6uMEY(offset, i11, i12, i13, z);
                    iMin = Math.min(TextRange.m5721getStartimpl(jM1134mapStepC6uMEY3), TextRange.m5721getStartimpl(jM1134mapStepC6uMEY4));
                    offset = Math.max(TextRange.m5716getEndimpl(jM1134mapStepC6uMEY3), TextRange.m5716getEndimpl(jM1134mapStepC6uMEY4));
                    i9--;
                    fromSource = z;
                }
            }
            i2 = offset;
            offset = iMin;
        } else {
            i2 = offset;
        }
        return TextRangeKt.TextRange(offset, i2);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m1134mapStepC6uMEY(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i2 = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        return offset < opOffset ? TextRangeKt.TextRange(offset) : offset == opOffset ? i2 == 0 ? TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange(opOffset) : offset < opOffset + i2 ? untransformedLen == 0 ? TextRangeKt.TextRange(opOffset) : TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange((offset - i2) + untransformedLen);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m1135mapFromDestjx7JFs(int offset) {
        return m1133mapfzxv0v0(offset, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m1136mapFromSourcejx7JFs(int offset) {
        return m1133mapfzxv0v0(offset, true);
    }

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (newLength < 0) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected newLen to be ≥ 0, was ", newLength).toString());
        }
        int iMin = Math.min(sourceStart, sourceEnd);
        int iMax = Math.max(iMin, sourceEnd) - iMin;
        if (iMax >= 2 || iMax != newLength) {
            int i2 = this.opsSize + 1;
            if (i2 > OpArray.m1145getSizeimpl(this.ops)) {
                this.ops = OpArray.m1140copyOfpSmdads(this.ops, Math.max(i2 * 2, OpArray.m1145getSizeimpl(this.ops) * 2));
            }
            OpArray.m1147setimpl(this.ops, this.opsSize, iMin, iMax, newLength);
            this.opsSize = i2;
        }
    }
}
