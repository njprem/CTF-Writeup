package androidx.compose.ui.unit;

import J.d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\tJ\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0015\u0010\u0006\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Constraints {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J?\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "Infinity", "", "fitPrioritizingHeight", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "fitPrioritizingHeight-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingWidth-Zbe2FdA", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "restrictConstraints", "prioritizeWidth", "", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m6193restrictConstraintsxF2OJ5Q$default(Companion companion, int i2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
            if ((i6 & 16) != 0) {
                z = true;
            }
            return companion.m6199restrictConstraintsxF2OJ5Q(i2, i3, i4, i5, z);
        }

        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m6194fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int iMin = Math.min(minHeight, 262142);
            int iMin2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int iMaxAllowedForSize = ConstraintsKt.maxAllowedForSize(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return ConstraintsKt.Constraints(Math.min(iMaxAllowedForSize, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(iMaxAllowedForSize, maxWidth) : Integer.MAX_VALUE, iMin, iMin2);
        }

        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m6195fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int iMin = Math.min(minWidth, 262142);
            int iMin2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int iMaxAllowedForSize = ConstraintsKt.maxAllowedForSize(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(iMaxAllowedForSize, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(iMaxAllowedForSize, maxHeight) : Integer.MAX_VALUE);
        }

        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m6196fixedJhjzzOo(int width, int height) {
            if (!(width >= 0 && height >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width(" + width + ") and height(" + height + ") must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, height, height);
        }

        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m6197fixedHeightOenEA2s(int height) {
            if (!(height >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height(" + height + ") must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, height, height);
        }

        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m6198fixedWidthOenEA2s(int width) {
            if (!(width >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width(" + width + ") must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        }

        @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m6199restrictConstraintsxF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
            return prioritizeWidth ? m6195fitPrioritizingWidthZbe2FdA(minWidth, maxWidth, minHeight, maxHeight) : m6194fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Constraints(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m6174boximpl(long j2) {
        return new Constraints(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6175constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m6176copyZbe2FdA(long j2, int i2, int i3, int i4, int i5) {
        if (!(i4 >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("minHeight(" + i4 + ") and minWidth(" + i2 + ") must be >= 0");
        }
        if (!(i3 >= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth(" + i3 + ") must be >= minWidth(" + i2 + ')');
        }
        if (!(i5 >= i4)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxHeight(" + i5 + ") must be >= minHeight(" + i4 + ')');
        }
        return ConstraintsKt.createConstraints(i2, i3, i4, i5);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m6177copyZbe2FdA$default(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = m6188getMinWidthimpl(j2);
        }
        int i7 = i2;
        if ((i6 & 2) != 0) {
            i3 = m6186getMaxWidthimpl(j2);
        }
        int i8 = i3;
        if ((i6 & 4) != 0) {
            i4 = m6187getMinHeightimpl(j2);
        }
        int i9 = i4;
        if ((i6 & 8) != 0) {
            i5 = m6185getMaxHeightimpl(j2);
        }
        return m6176copyZbe2FdA(j2, i7, i8, i9, i5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6178equalsimpl(long j2, Object obj) {
        return (obj instanceof Constraints) && j2 == ((Constraints) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6179equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m6180getFocusIndeximpl(long j2) {
        return (int) (j2 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m6181getHasBoundedHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m6182getHasBoundedWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        return (((int) (j2 >> 33)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m6183getHasFixedHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = ((int) (j2 >> (i3 + 15))) & i4;
        int i6 = ((int) (j2 >> (i3 + 46))) & i4;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m6184getHasFixedWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1;
        int i4 = ((int) (j2 >> 2)) & i3;
        int i5 = ((int) (j2 >> 33)) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m6185getMaxHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = ((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m6186getMaxWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (int) (j2 >> 33);
        int i4 = i3 & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m6187getMinHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return ((int) (j2 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m6188getMinWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        return ((int) (j2 >> 2)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6189hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m6190isZeroimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return (((int) (j2 >> 33)) & ((1 << (i3 + 13)) - 1)) - 1 == 0 || (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) - 1 == 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6191toStringimpl(long j2) {
        int iM6186getMaxWidthimpl = m6186getMaxWidthimpl(j2);
        String strValueOf = iM6186getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM6186getMaxWidthimpl);
        int iM6185getMaxHeightimpl = m6185getMaxHeightimpl(j2);
        String strValueOf2 = iM6185getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM6185getMaxHeightimpl) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m6188getMinWidthimpl(j2));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m6187getMinHeightimpl(j2));
        sb.append(", maxHeight = ");
        return d.p(sb, strValueOf2, ')');
    }

    public boolean equals(Object obj) {
        return m6178equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6189hashCodeimpl(this.value);
    }

    public String toString() {
        return m6191toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
