package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Density extends FontScaling {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6219roundToPxR2X_6o(Density density, long j2) {
            return Density.super.mo327roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6220roundToPx0680j_4(Density density, float f2) {
            return Density.super.mo328roundToPx0680j_4(f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6221toDpGaN1DYA(Density density, long j2) {
            return Density.super.mo329toDpGaN1DYA(j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6223toDpu2uoSUM(Density density, int i2) {
            return Density.super.mo331toDpu2uoSUM(i2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6224toDpSizekrfVVM(Density density, long j2) {
            return Density.super.mo332toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6225toPxR2X_6o(Density density, long j2) {
            return Density.super.mo333toPxR2X_6o(j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6226toPx0680j_4(Density density, float f2) {
            return Density.super.mo334toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6227toSizeXkaWNTQ(Density density, long j2) {
            return Density.super.mo335toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6228toSp0xMU5do(Density density, float f2) {
            return Density.super.mo336toSp0xMU5do(f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6230toSpkPz2Gy4(Density density, int i2) {
            return Density.super.mo338toSpkPz2Gy4(i2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6222toDpu2uoSUM(Density density, float f2) {
            return Density.super.mo330toDpu2uoSUM(f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6229toSpkPz2Gy4(Density density, float f2) {
            return Density.super.mo337toSpkPz2Gy4(f2);
        }
    }

    float getDensity();

    /* renamed from: roundToPx--R2X_6o */
    default int mo327roundToPxR2X_6o(long j2) {
        return Math.round(mo333toPxR2X_6o(j2));
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo328roundToPx0680j_4(float f2) {
        float fMo334toPx0680j_4 = mo334toPx0680j_4(f2);
        if (Float.isInfinite(fMo334toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo334toPx0680j_4);
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo331toDpu2uoSUM(int i2) {
        return Dp.m6233constructorimpl(i2 / getDensity());
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo332toDpSizekrfVVM(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m6255DpSizeYgX7TsA(mo330toDpu2uoSUM(Size.m3620getWidthimpl(j2)), mo330toDpu2uoSUM(Size.m3617getHeightimpl(j2))) : DpSize.INSTANCE.m6340getUnspecifiedMYxV2XQ();
    }

    /* renamed from: toPx--R2X_6o */
    default float mo333toPxR2X_6o(long j2) {
        if (TextUnitType.m6454equalsimpl0(TextUnit.m6425getTypeUIouoOA(j2), TextUnitType.INSTANCE.m6459getSpUIouoOA())) {
            return mo334toPx0680j_4(mo329toDpGaN1DYA(j2));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    /* renamed from: toPx-0680j_4 */
    default float mo334toPx0680j_4(float f2) {
        return getDensity() * f2;
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo334toPx0680j_4(dpRect.m6316getLeftD9Ej5fM()), mo334toPx0680j_4(dpRect.m6318getTopD9Ej5fM()), mo334toPx0680j_4(dpRect.m6317getRightD9Ej5fM()), mo334toPx0680j_4(dpRect.m6315getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo335toSizeXkaWNTQ(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.Size(mo334toPx0680j_4(DpSize.m6331getWidthD9Ej5fM(j2)), mo334toPx0680j_4(DpSize.m6329getHeightD9Ej5fM(j2))) : Size.INSTANCE.m3628getUnspecifiedNHjbRc();
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo338toSpkPz2Gy4(int i2) {
        return mo336toSp0xMU5do(mo331toDpu2uoSUM(i2));
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo337toSpkPz2Gy4(float f2) {
        return mo336toSp0xMU5do(mo330toDpu2uoSUM(f2));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo330toDpu2uoSUM(float f2) {
        return Dp.m6233constructorimpl(f2 / getDensity());
    }
}
