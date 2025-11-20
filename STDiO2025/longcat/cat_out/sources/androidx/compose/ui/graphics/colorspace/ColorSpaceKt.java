package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import j.C0639E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000\u001a\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a)\u0010\"\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a)\u0010'\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a)\u0010(\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a8\u0010)\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010)\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010-\u001a\u00020\u0015*\u00020\u00152\u0006\u0010.\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u000200H\u0007\u001a(\u00101\u001a\u00020\u0013*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"absRcpResponse", "", "x", "a", "b", "c", "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "createConnector", "Landroidx/compose/ui/graphics/colorspace/Connector;", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", "response", "adapt", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "connect-YBCOT_4", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(rcpResponse(d2 < 0.0d ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final double absResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(response(d2 < 0.0d ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m4209connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        int id$ui_graphics_release = colorSpace.getId();
        int id$ui_graphics_release2 = colorSpace2.getId();
        if ((id$ui_graphics_release | id$ui_graphics_release2) < 0) {
            return m4211createConnectorYBCOT_4(colorSpace, colorSpace2, i2);
        }
        C0639E connectors = ConnectorKt.getConnectors();
        int i3 = id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (i2 << 12);
        Object objC = connectors.c(i3);
        if (objC == null) {
            objC = m4211createConnectorYBCOT_4(colorSpace, colorSpace2, i2);
            connectors.h(i3, objC);
        }
        return (Connector) objC;
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m4210connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i3 & 2) != 0) {
            i2 = RenderIntent.INSTANCE.m4226getPerceptualuksYyKA();
        }
        return m4209connectYBCOT_4(colorSpace, colorSpace2, i2);
    }

    /* renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m4211createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        if (colorSpace == colorSpace2) {
            return Connector.INSTANCE.identity$ui_graphics_release(colorSpace);
        }
        long jM4207getModelxdoWZVw = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!ColorModel.m4198equalsimpl0(jM4207getModelxdoWZVw, companion.m4205getRgbxdoWZVw()) || !ColorModel.m4198equalsimpl0(colorSpace2.getModel(), companion.m4205getRgbxdoWZVw())) {
            return new Connector(colorSpace, colorSpace2, i2, defaultConstructorMarker);
        }
        Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.checkNotNull(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i2, defaultConstructorMarker);
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0];
        float f4 = fArr[3];
        float f5 = fArr2[1];
        float f6 = fArr[6];
        float f7 = fArr2[2];
        float f8 = (f6 * f7) + (f4 * f5) + (f2 * f3);
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = (f11 * f7) + (f10 * f5) + (f9 * f3);
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[8];
        float f16 = (f7 * f15) + (f5 * f14) + (f3 * f13);
        float f17 = fArr2[3];
        float f18 = fArr2[4];
        float f19 = fArr2[5];
        float f20 = (f6 * f19) + (f4 * f18) + (f2 * f17);
        float f21 = (f11 * f19) + (f10 * f18) + (f9 * f17);
        float f22 = (f19 * f15) + (f18 * f14) + (f17 * f13);
        float f23 = fArr2[6];
        float f24 = fArr2[7];
        float f25 = (f4 * f24) + (f2 * f23);
        float f26 = fArr2[8];
        return new float[]{f8, f12, f16, f20, f21, f22, (f6 * f26) + f25, (f11 * f26) + (f10 * f24) + (f9 * f23), (f15 * f26) + (f14 * f24) + (f13 * f23)};
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0] * f2;
        float f4 = fArr[1];
        float f5 = fArr2[1] * f4;
        float f6 = fArr[2];
        return new float[]{f3, f5, fArr2[2] * f6, fArr2[3] * f2, fArr2[4] * f4, fArr2[5] * f6, f2 * fArr2[6], f4 * fArr2[7], f6 * fArr2[8]};
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f2, float f3, float f4) {
        return (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f2, float f3, float f4) {
        return (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f2, float f3, float f4) {
        return (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 * d5 ? (Math.pow(d2, 1.0d / d7) - d4) / d3 : d2 / d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d7) : d5 * d2;
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m4198equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m4205getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 * d5 ? (Math.pow(d2 - d7, 1.0d / d9) - d4) / d3 : (d2 - d8) / d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d9) + d7 : (d5 * d2) + d8;
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Float.compare(fArr[i2], fArr2[i2]) != 0 && Math.abs(fArr[i2] - fArr2[i2]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
