package androidx.compose.ui.unit;

import J.d;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001a-\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0082\b\u001a\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0002\u001a\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001a\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001a\u0011\u0010,\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010-\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0082\b\u001a\u001c\u0010.\u001a\u00020\u0015*\u00020\u00152\u0006\u0010/\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001e\u0010.\u001a\u000202*\u00020\u00152\u0006\u0010\u001f\u001a\u000202H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00101\u001a\u001e\u00104\u001a\u00020\u0003*\u00020\u00152\u0006\u00105\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u001e\u00108\u001a\u00020\u0003*\u00020\u00152\u0006\u00109\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u00107\u001a\u001e\u0010;\u001a\u00020<*\u00020\u00152\u0006\u0010\u001f\u001a\u000202H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a*\u0010?\u001a\u00020\u0015*\u00020\u00152\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010C\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"FocusMask", "", "Infinity", "", "MaxAllowedForMaxFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxAllowedForMinFocusBits", "MaxAllowedForMinNonFocusBits", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinNonFocusBits", "MinNonFocusMask", "Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "bitsNeedForSizeUnchecked", "size", "createConstraints", "heightMask", "bitOffset", "indexToBitOffset", "index", "invalidConstraint", "", "widthVal", "heightVal", "invalidSize", "", "maxAllowedForSize", "minHeightOffsets", "widthMask", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusHeight = 0;
    private static final int MaxFocusMask = 262143;
    private static final int MaxFocusWidth = 3;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusHeight = 1;
    private static final int MinFocusMask = 65535;
    private static final int MinFocusWidth = 2;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    public static final long Constraints(int i2, int i3, int i4, int i5) {
        boolean z = false;
        if (!(i3 >= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')');
        }
        if (!(i5 >= i4)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')');
        }
        if (i2 >= 0 && i4 >= 0) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0");
        }
        return createConstraints(i2, i3, i4, i5);
    }

    public static /* synthetic */ long Constraints$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i2, i3, i4, i5);
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : RangesKt.coerceAtLeast(i2 + i3, 0);
    }

    private static final int bitsNeedForSizeUnchecked(int i2) {
        if (i2 < MaxNonFocusMask) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < MinFocusMask) {
            return 16;
        }
        if (i2 < MaxFocusMask) {
            return MaxFocusBits;
        }
        return 255;
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m6200constrain4WqzIAM(long j2, long j3) {
        return IntSizeKt.IntSize(RangesKt.coerceIn(IntSize.m6403getWidthimpl(j3), Constraints.m6188getMinWidthimpl(j2), Constraints.m6186getMaxWidthimpl(j2)), RangesKt.coerceIn(IntSize.m6402getHeightimpl(j3), Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(j2)));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m6201constrainN9IONVI(long j2, long j3) {
        return Constraints(RangesKt.coerceIn(Constraints.m6188getMinWidthimpl(j3), Constraints.m6188getMinWidthimpl(j2), Constraints.m6186getMaxWidthimpl(j2)), RangesKt.coerceIn(Constraints.m6186getMaxWidthimpl(j3), Constraints.m6188getMinWidthimpl(j2), Constraints.m6186getMaxWidthimpl(j2)), RangesKt.coerceIn(Constraints.m6187getMinHeightimpl(j3), Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(j2)), RangesKt.coerceIn(Constraints.m6185getMaxHeightimpl(j3), Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(j2)));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m6202constrainHeightK40F9xA(long j2, int i2) {
        return RangesKt.coerceIn(i2, Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(j2));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m6203constrainWidthK40F9xA(long j2, int i2) {
        return RangesKt.coerceIn(i2, Constraints.m6188getMinWidthimpl(j2), Constraints.m6186getMaxWidthimpl(j2));
    }

    public static final long createConstraints(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i6);
        int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i7);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            invalidConstraint(i7, i6);
        }
        int i8 = i3 + 1;
        int i9 = i8 & (~(i8 >> 31));
        int i10 = i5 + 1;
        int i11 = i10 & (~(i10 >> 31));
        int i12 = 0;
        if (iBitsNeedForSizeUnchecked2 != 13) {
            if (iBitsNeedForSizeUnchecked2 == MaxFocusBits) {
                i12 = 3;
            } else if (iBitsNeedForSizeUnchecked2 == 15) {
                i12 = 1;
            } else if (iBitsNeedForSizeUnchecked2 == 16) {
                i12 = 2;
            }
        }
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        return Constraints.m6175constructorimpl((i9 << 33) | i12 | (i2 << 2) | (i4 << (i13 + 15)) | (i11 << (i13 + 46)));
    }

    private static final int heightMask(int i2) {
        return (1 << (18 - i2)) - 1;
    }

    private static final int indexToBitOffset(int i2) {
        return (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
    }

    private static final void invalidConstraint(int i2, int i3) {
        throw new IllegalArgumentException("Can't represent a width of " + i2 + " and height of " + i3 + " in Constraints");
    }

    private static final Void invalidSize(int i2) {
        throw new IllegalArgumentException(d.l(i2, "Can't represent a size of ", " in Constraints"));
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m6204isSatisfiedBy4WqzIAM(long j2, long j3) {
        int iM6188getMinWidthimpl = Constraints.m6188getMinWidthimpl(j2);
        int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
        int iM6403getWidthimpl = IntSize.m6403getWidthimpl(j3);
        if (iM6188getMinWidthimpl > iM6403getWidthimpl || iM6403getWidthimpl > iM6186getMaxWidthimpl) {
            return false;
        }
        int iM6187getMinHeightimpl = Constraints.m6187getMinHeightimpl(j2);
        int iM6185getMaxHeightimpl = Constraints.m6185getMaxHeightimpl(j2);
        int iM6402getHeightimpl = IntSize.m6402getHeightimpl(j3);
        return iM6187getMinHeightimpl <= iM6402getHeightimpl && iM6402getHeightimpl <= iM6185getMaxHeightimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxAllowedForSize(int i2) {
        if (i2 < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i2 < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i2 < MinFocusMask) {
            return MaxAllowedForMinFocusBits;
        }
        if (i2 < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        invalidSize(i2);
        throw new KotlinNothingValueException();
    }

    private static final int minHeightOffsets(int i2) {
        return i2 + 15;
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m6205offsetNN6EwU(long j2, int i2, int i3) {
        return Constraints(RangesKt.coerceAtLeast(Constraints.m6188getMinWidthimpl(j2) + i2, 0), addMaxWithMinimum(Constraints.m6186getMaxWidthimpl(j2), i2), RangesKt.coerceAtLeast(Constraints.m6187getMinHeightimpl(j2) + i3, 0), addMaxWithMinimum(Constraints.m6185getMaxHeightimpl(j2), i3));
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m6206offsetNN6EwU$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return m6205offsetNN6EwU(j2, i2, i3);
    }

    private static final int widthMask(int i2) {
        return (1 << (i2 + 13)) - 1;
    }
}
