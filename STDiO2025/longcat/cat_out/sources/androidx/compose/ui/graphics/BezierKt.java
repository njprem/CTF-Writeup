package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.util.MathHelpersKt;
import j.AbstractC0672z;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b'\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0005\u001a \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\n\u001a/\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u000f\u001a2\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010#\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b&\u0010'\u001a)\u0010(\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b(\u0010'\u001aA\u0010+\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010/\u001a\u00020!*\u00020-2\u0006\u0010.\u001a\u00020-H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u001c\u0010/\u001a\u00020!*\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b/\u00101\u001a\u0018\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b3\u00104\u001a'\u00105\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b5\u00106\u001a'\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010;\u001a'\u0010?\u001a\u00020!2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@\u001a7\u0010C\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0000¢\u0006\u0004\bC\u0010D\u001a7\u0010F\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010G\u001a\u001f\u0010J\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0002¢\u0006\u0004\bJ\u0010K\u001a'\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bN\u0010O\u001a\u001f\u0010P\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010\u0016\u001a7\u0010R\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0000¢\u0006\u0004\bR\u0010D\u001a/\u0010S\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\bS\u0010T\u001a'\u0010W\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u0019H\u0002¢\u0006\u0004\bW\u0010X\u001a\u001f\u0010Z\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u0019H\u0002¢\u0006\u0004\bZ\u0010K\u001a7\u0010]\u001a\u00020M2\u0006\u0010L\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^\u001aO\u0010d\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0000¢\u0006\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010g\"\u0014\u0010h\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010g\"\u0014\u0010i\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010j\"\u0019\u0010m\u001a\u00020\u0002*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l\"\u0018\u0010o\u001a\u00020\u0002*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010l\"\u0019\u0010q\u001a\u00020\u0002*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010l\"\u0018\u0010s\u001a\u00020\u0002*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010l¨\u0006t"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "segment", "", "t", "evaluateX", "(Landroidx/compose/ui/graphics/PathSegment;F)F", "evaluateY", "p0y", "p1y", "evaluateLine", "(FFF)F", "p0", "p1", "p2", "evaluateQuadratic", "(FFFF)F", "p3", "evaluateCubic", "(FFFFF)F", "fraction", "findFirstRoot", "findFirstLineRoot", "(FF)F", "findFirstQuadraticRoot", "findFirstCubicRoot", "", "roots", "", "index", "findLineRoot", "(FF[FI)I", "findQuadraticRoots", "(FFF[FI)I", "", "horizontal", "findDerivativeRoots", "(Landroidx/compose/ui/graphics/PathSegment;Z[FI)I", "Lj/z;", "computeHorizontalBounds", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "p2y", "p3y", "computeCubicVerticalBounds", "(FFFF[FI)J", "", "b", "closeTo", "(DD)Z", "(FF)Z", "r", "clampValidRootInUnitRange", "(F)F", "writeValidRootInUnitRange", "(F[FI)I", "points", "x", "y", "lineWinding", "([FFF)I", "y0", "y1", "y2", "isQuadraticMonotonic", "(FFF)Z", "tmpQuadratics", "tmpRoots", "quadraticWinding", "([FFF[F[F)I", "offset", "monotonicQuadraticWinding", "([FIFF[F)I", "quadratic", "dst", "quadraticToMonotonicQuadratics", "([F[F)I", "src", "", "splitQuadraticAt", "([F[FF)V", "unitDivide", "tmpCubics", "cubicWinding", "monotonicCubicWinding", "([FIFF)I", "cubic", "tmpRoot", "cubicToMonotonicCubics", "([F[F[F)I", "dstRoots", "findCubicExtremaY", "srcOffset", "dstOffset", "splitCubicAt", "([FI[FIF)V", "x0", "x1", "x2", "x3", "y3", "cubicArea", "(FFFFFFFF)F", "Tau", "D", "Epsilon", "FloatEpsilon", "F", "getStartX", "(Landroidx/compose/ui/graphics/PathSegment;)F", "startX", "getEndX", "endX", "getStartY", "startY", "getEndY", "endY", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 8.34465E-7f;
    private static final double Tau = 6.283185307179586d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final float clampValidRootInUnitRange(float f2) {
        return f2 < 0.0f ? f2 >= -8.34465E-7f ? 0.0f : Float.NaN : f2 > 1.0f ? f2 <= 1.0000008f ? 1.0f : Float.NaN : f2;
    }

    public static final boolean closeTo(double d2, double d3) {
        return Math.abs(d2 - d3) < Epsilon;
    }

    public static final long computeCubicVerticalBounds(float f2, float f3, float f4, float f5, float[] fArr, int i2) {
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        float f8 = (f5 - f4) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f6, f7, f8, fArr, i2);
        float f9 = (f7 - f6) * 2.0f;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((-f9) / (((f8 - f7) * 2.0f) - f9), fArr, i2 + iFindQuadraticRoots) + iFindQuadraticRoots;
        float fMin = Math.min(f2, f5);
        float fMax = Math.max(f2, f5);
        for (int i3 = 0; i3 < iWriteValidRootInUnitRange; i3++) {
            float fEvaluateCubic = evaluateCubic(f2, f3, f4, f5, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return AbstractC0672z.b(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f2, float f3, float f4, float f5, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        return computeCubicVerticalBounds(f2, f3, f4, f5, fArr, i2);
    }

    public static final long computeHorizontalBounds(PathSegment pathSegment, float[] fArr, int i2) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i3 = 0; i3 < iFindDerivativeRoots; i3++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return AbstractC0672z.b(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i2);
    }

    public static final long computeVerticalBounds(PathSegment pathSegment, float[] fArr, int i2) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i3 = 0; i3 < iFindDerivativeRoots; i3++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return AbstractC0672z.b(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i2);
    }

    public static final float cubicArea(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return ((((((f2 / 3.0f) + f6) * f9) + ((((f2 - f6) * f5) + (((f4 + f6) * (f9 - f3)) - ((f5 + f7) * (f8 - f2)))) - ((f3 - f7) * f4))) - (((f3 / 3.0f) + f7) * f8)) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i2 = 0;
        if (iFindCubicExtremaY == 0) {
            ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, 8);
            return iFindCubicExtremaY;
        }
        int i3 = 0;
        float f2 = 0.0f;
        while (i2 < iFindCubicExtremaY) {
            float f3 = (fArr3[i2] - f2) / (1.0f - f2);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            f2 = f3 > 1.0f ? 1.0f : f3;
            splitCubicAt(fArr, i3, fArr2, i3, f2);
            i3 += 6;
            i2++;
            fArr = fArr2;
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(float[] fArr, float f2, float f3, float[] fArr2, float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i2 = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i2 * 6, f2, f3);
                if (i2 == iCubicToMonotonicCubics) {
                    break;
                }
                i2++;
            }
        }
        return iMonotonicCubicWinding;
    }

    public static final float evaluateCubic(float f2, float f3, float f4) {
        return ((((((f2 - f3) + 0.33333334f) * f4) + (f3 - (2.0f * f2))) * f4) + f2) * 3.0f * f4;
    }

    private static final float evaluateLine(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    private static final float evaluateQuadratic(float f2, float f3, float f4, float f5) {
        return (((((f4 - (f3 * 2.0f)) + f2) * f5) + ((f3 - f2) * 2.0f)) * f5) + f2;
    }

    private static final float evaluateX(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return points[0];
            case 2:
                return evaluateLine(points[0], points[2], f2);
            case 3:
                return evaluateQuadratic(points[0], points[2], points[4], f2);
            case 4:
                return Float.NaN;
            case 5:
                return evaluateCubic(points[0], points[2], points[4], points[6], f2);
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final float evaluateY(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return points[1];
            case 2:
                return evaluateLine(points[1], points[3], f2);
            case 3:
                return evaluateQuadratic(points[1], points[3], points[5], f2);
            case 4:
                return Float.NaN;
            case 5:
                return evaluateCubic(points[1], points[3], points[5], points[7], f2);
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[5];
        return findQuadraticRoots(((f3 - f4) * 3.0f) + (fArr[7] - f2), (((f2 - f3) - f3) - f4) * 2.0f, f3 - f2, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z, float[] fArr, int i2) {
        int i3 = !z ? 1 : 0;
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case 2:
                return 0;
            case 3:
                float f2 = 2;
                float f3 = points[i3 + 2];
                float f4 = (f3 - points[i3]) * f2;
                return writeValidRootInUnitRange((-f4) / (((points[i3 + 4] - f3) * f2) - f4), fArr, i2);
            case 4:
                return 0;
            case 5:
                float f5 = points[i3 + 2];
                float f6 = (f5 - points[i3]) * 3.0f;
                float f7 = points[i3 + 4];
                float f8 = (f7 - f5) * 3.0f;
                float f9 = (points[i3 + 6] - f7) * 3.0f;
                int iFindQuadraticRoots = findQuadraticRoots(f6, f8, f9, fArr, i2);
                float f10 = (f8 - f6) * 2.0f;
                return writeValidRootInUnitRange((-f10) / (((f9 - f8) * 2.0f) - f10), fArr, i2 + iFindQuadraticRoots) + iFindQuadraticRoots;
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
            case 7:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float findFirstCubicRoot(float r22, float r23, float r24, float r25) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.findFirstCubicRoot(float, float, float, float):float");
    }

    private static final float findFirstLineRoot(float f2, float f3) {
        float f4 = (-f2) / (f3 - f2);
        return f4 < 0.0f ? f4 >= -8.34465E-7f ? 0.0f : Float.NaN : f4 > 1.0f ? f4 <= 1.0000008f ? 1.0f : Float.NaN : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float findFirstQuadraticRoot(float r18, float r19, float r20) {
        /*
            r0 = r18
            double r0 = (double) r0
            r2 = r19
            double r2 = (double) r2
            r4 = r20
            double r4 = (double) r4
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r2 * r6
            double r10 = r0 - r8
            double r10 = r10 + r4
            r12 = 0
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r13 = 1065353223(0x3f800007, float:1.0000008)
            r14 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r17 = 2143289344(0x7fc00000, float:NaN)
            if (r12 != 0) goto L41
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L26
            return r17
        L26:
            double r0 = r8 - r4
            double r4 = r4 * r6
            double r8 = r8 - r4
            double r0 = r0 / r8
            float r0 = (float) r0
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 >= 0) goto L36
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 < 0) goto L35
            return r16
        L35:
            return r17
        L36:
            int r1 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r1 <= 0) goto L40
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L3f
            return r15
        L3f:
            return r17
        L40:
            return r0
        L41:
            double r6 = r2 * r2
            double r4 = r4 * r0
            double r6 = r6 - r4
            double r4 = java.lang.Math.sqrt(r6)
            double r4 = -r4
            double r0 = -r0
            double r0 = r0 + r2
            double r2 = r4 + r0
            double r2 = -r2
            double r2 = r2 / r10
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L5f
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 < 0) goto L5c
            r2 = r16
            goto L68
        L5c:
            r2 = r17
            goto L68
        L5f:
            int r3 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r3 <= 0) goto L68
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 > 0) goto L5c
            r2 = r15
        L68:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L6f
            return r2
        L6f:
            double r4 = r4 - r0
            double r4 = r4 / r10
            float r0 = (float) r4
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 >= 0) goto L7c
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 < 0) goto L7b
            return r16
        L7b:
            return r17
        L7c:
            int r1 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r1 <= 0) goto L86
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L85
            return r15
        L85:
            return r17
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.findFirstQuadraticRoot(float, float, float):float");
    }

    public static final float findFirstRoot(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f3 = points[0] - f2;
                float f4 = (-f3) / ((points[2] - f2) - f3);
                return f4 < 0.0f ? f4 >= -8.34465E-7f ? 0.0f : Float.NaN : f4 > 1.0f ? f4 <= 1.0000008f ? 1.0f : Float.NaN : f4;
            case 3:
                return findFirstQuadraticRoot(points[0] - f2, points[2] - f2, points[4] - f2);
            case 4:
                return Float.NaN;
            case 5:
                return findFirstCubicRoot(points[0] - f2, points[2] - f2, points[4] - f2, points[6] - f2);
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findLineRoot(float f2, float f3, float[] fArr, int i2) {
        return writeValidRootInUnitRange((-f2) / (f3 - f2), fArr, i2);
    }

    public static /* synthetic */ int findLineRoot$default(float f2, float f3, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return writeValidRootInUnitRange((-f2) / (f3 - f2), fArr, i2);
    }

    private static final int findQuadraticRoots(float f2, float f3, float f4, float[] fArr, int i2) {
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double d5 = d3 * 2.0d;
        double d6 = (d2 - d5) + d4;
        if (d6 == 0.0d) {
            if (d3 == d4) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d5 - d4) / (d5 - (d4 * 2.0d))), fArr, i2);
        }
        double d7 = -Math.sqrt((d3 * d3) - (d4 * d2));
        double d8 = (-d2) + d3;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d7 + d8)) / d6), fArr, i2);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d7 - d8) / d6), fArr, i2 + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 <= 1) {
            return iWriteValidRootInUnitRange2;
        }
        float f5 = fArr[i2];
        int i3 = i2 + 1;
        float f6 = fArr[i3];
        if (f5 <= f6) {
            return f5 == f6 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
        }
        fArr[i2] = f6;
        fArr[i3] = f5;
        return iWriteValidRootInUnitRange2;
    }

    public static /* synthetic */ int findQuadraticRoots$default(float f2, float f3, float f4, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        return findQuadraticRoots(f2, f3, f4, fArr, i2);
    }

    private static final float getEndX(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        char c2 = 4;
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
            case 7:
                c2 = 0;
                break;
            case 2:
                c2 = 2;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c2 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return points[c2];
    }

    private static final float getEndY(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        char c2 = 5;
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
            case 7:
                c2 = 0;
                break;
            case 2:
                c2 = 3;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c2 = 7;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return points[c2];
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f2, float f3, float f4) {
        return !(Math.signum(f3 - f4) + Math.signum(f2 - f3) == 0.0f);
    }

    public static final int lineWinding(float[] fArr, float f2, float f3) {
        int i2;
        float f4;
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = fArr[3];
        float f9 = f8 - f6;
        if (f6 > f8) {
            i2 = -1;
            f4 = f6;
        } else {
            i2 = 1;
            f4 = f8;
            f8 = f6;
        }
        if (f3 < f8 || f3 >= f4) {
            return 0;
        }
        float f10 = ((f3 - f6) * (f7 - f5)) - ((f2 - f5) * f9);
        if (f10 == 0.0f || ((int) Math.signum(f10)) == i2) {
            return 0;
        }
        return i2;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i2, float f2, float f3) {
        int i3;
        int i4 = i2 + 1;
        float f4 = fArr[i4];
        int i5 = i2 + 7;
        float f5 = fArr[i5];
        if (f4 > f5) {
            i3 = -1;
            f5 = f4;
            f4 = f5;
        } else {
            i3 = 1;
        }
        if (f3 >= f4 && f3 < f5) {
            float f6 = fArr[i2];
            float f7 = fArr[i2 + 2];
            float f8 = fArr[i2 + 4];
            float f9 = fArr[i2 + 6];
            if (f2 < Math.min(f6, Math.min(f7, Math.min(f8, f9)))) {
                return 0;
            }
            if (f2 <= Math.max(f6, Math.max(f7, Math.max(f8, f9)))) {
                float f10 = fArr[i4];
                float f11 = fArr[i2 + 3];
                float f12 = fArr[i2 + 5];
                float f13 = fArr[i5];
                float fFindFirstCubicRoot = findFirstCubicRoot(f10 - f3, f11 - f3, f12 - f3, f13 - f3);
                if (Float.isNaN(fFindFirstCubicRoot)) {
                    return 0;
                }
                float fEvaluateCubic = evaluateCubic(f6, f7, f8, f9, fFindFirstCubicRoot);
                if ((Math.abs(fEvaluateCubic - f2) >= FloatEpsilon || (f2 == f9 && f3 == f13)) && fEvaluateCubic < f2) {
                }
            }
            return i3;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i2, float f2, float f3, float[] fArr2) {
        int i3;
        float f4;
        float f5;
        float f6 = fArr[i2 + 1];
        float f7 = fArr[i2 + 5];
        if (f6 > f7) {
            i3 = -1;
            f5 = f6;
            f4 = f7;
        } else {
            i3 = 1;
            f4 = f6;
            f5 = f7;
        }
        if (f3 >= f4 && f3 < f5) {
            float f8 = fArr[i2 + 3];
            float fEvaluateQuadratic = findQuadraticRoots$default((f6 - (f8 * 2.0f)) + f7, (f8 - f6) * 2.0f, f6 - f3, fArr2, 0, 16, null) == 0 ? fArr[(1 - i3) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fEvaluateQuadratic - f2) >= FloatEpsilon || (f2 == fArr[4] && f3 == f7)) && fEvaluateQuadratic < f2) {
                return i3;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[5];
        if (!isQuadraticMonotonic(f2, f3, f4)) {
            float f5 = f2 - f3;
            float fUnitDivide = unitDivide(f5, (f5 - f3) + f4);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f5) >= Math.abs(f3 - f4)) {
                f2 = f4;
            }
            f3 = f2;
        }
        ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f3;
        return 0;
    }

    public static final int quadraticWinding(float[] fArr, float f2, float f3, float[] fArr2, float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f2, f3, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f2, f3, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f2, f3, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i2, float[] fArr2, int i3, float f2) {
        if (f2 >= 1.0f) {
            ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, i3, i2, 8);
            float f3 = fArr[i2 + 6];
            float f4 = fArr[i2 + 7];
            fArr2[i3 + 8] = f3;
            fArr2[i3 + 9] = f4;
            fArr2[i3 + 10] = f3;
            fArr2[i3 + 11] = f4;
            fArr2[i3 + 12] = f3;
            fArr2[i3 + 13] = f4;
            return;
        }
        float f5 = fArr[i2];
        float f6 = fArr[i2 + 1];
        fArr2[i3] = f5;
        fArr2[i3 + 1] = f6;
        float f7 = fArr[i2 + 2];
        float f8 = fArr[i2 + 3];
        float fLerp = MathHelpersKt.lerp(f5, f7, f2);
        float fLerp2 = MathHelpersKt.lerp(f6, f8, f2);
        fArr2[i3 + 2] = fLerp;
        fArr2[i3 + 3] = fLerp2;
        float f9 = fArr[i2 + 4];
        float f10 = fArr[i2 + 5];
        float fLerp3 = MathHelpersKt.lerp(f7, f9, f2);
        float fLerp4 = MathHelpersKt.lerp(f8, f10, f2);
        float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f2);
        float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f2);
        fArr2[i3 + 4] = fLerp5;
        fArr2[i3 + 5] = fLerp6;
        float f11 = fArr[i2 + 6];
        float f12 = fArr[i2 + 7];
        float fLerp7 = MathHelpersKt.lerp(f9, f11, f2);
        float fLerp8 = MathHelpersKt.lerp(f10, f12, f2);
        float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f2);
        float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f2);
        float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f2);
        float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f2);
        fArr2[i3 + 6] = fLerp11;
        fArr2[i3 + 7] = fLerp12;
        fArr2[i3 + 8] = fLerp9;
        fArr2[i3 + 9] = fLerp10;
        fArr2[i3 + 10] = fLerp7;
        fArr2[i3 + 11] = fLerp8;
        fArr2[i3 + 12] = f11;
        fArr2[i3 + 13] = f12;
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f2) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float fLerp = MathHelpersKt.lerp(f3, f5, f2);
        float fLerp2 = MathHelpersKt.lerp(f4, f6, f2);
        fArr2[0] = f3;
        fArr2[1] = f4;
        fArr2[2] = fLerp;
        fArr2[3] = fLerp2;
        float fLerp3 = MathHelpersKt.lerp(f5, f7, f2);
        float fLerp4 = MathHelpersKt.lerp(f6, f8, f2);
        float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f2);
        float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f2);
        fArr2[4] = fLerp5;
        fArr2[5] = fLerp6;
        fArr2[6] = fLerp3;
        fArr2[7] = fLerp4;
        fArr2[8] = f7;
        fArr2[9] = f8;
    }

    private static final float unitDivide(float f2, float f3) {
        if (f2 < 0.0f) {
            f2 = -f2;
            f3 = -f3;
        }
        if (f3 == 0.0f || f2 == 0.0f || f2 >= f3) {
            return Float.NaN;
        }
        float f4 = f2 / f3;
        if (f4 == 0.0f) {
            return Float.NaN;
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r0
      0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int writeValidRootInUnitRange(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.writeValidRootInUnitRange(float, float[], int):int");
    }

    public static final boolean closeTo(float f2, float f3) {
        return Math.abs(f2 - f3) < FloatEpsilon;
    }

    private static final float evaluateCubic(float f2, float f3, float f4, float f5, float f6) {
        float f7 = (((f3 - f4) * 3.0f) + f5) - f2;
        return (((((f7 * f6) + (((f4 - (2.0f * f3)) + f2) * 3.0f)) * f6) + ((f3 - f2) * 3.0f)) * f6) + f2;
    }
}
