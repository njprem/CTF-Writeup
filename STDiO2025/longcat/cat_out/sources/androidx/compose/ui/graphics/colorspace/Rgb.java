package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001^BC\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nB[\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B#\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B#\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\t\u001a\u00020 \u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\"J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J \u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0007J\u0012\u0010?\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0005H\u0007J\u0012\u0010E\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020\u0005H\u0007J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\b\u0010I\u001a\u00020\u0005H\u0007J\u0012\u0010I\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010J\u001a\u00020\u0005H\u0007J\u0012\u0010J\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0005H\u0007J\b\u0010K\u001a\u00020\u0017H\u0016J \u0010L\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0007J\u0012\u0010L\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007J%\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J%\u0010T\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bUJ=\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u00102\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics_release", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new a(2);
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] primaries) {
            float f2 = primaries[0];
            float f3 = primaries[1];
            float f4 = primaries[2];
            float f5 = primaries[3];
            float f6 = primaries[4];
            float f7 = primaries[5];
            float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
            return f8 < 0.0f ? -f8 : f8;
        }

        private final boolean compare(double point, DoubleFunction a2, DoubleFunction b2) {
            return Math.abs(a2.invoke(point) - b2.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f2 = fArrMul3x3Float3[0];
            float f3 = fArrMul3x3Float3[1];
            float f4 = f2 + f3 + fArrMul3x3Float3[2];
            return new WhitePoint(f2 / f4, f3 / f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f2 = primaries[0];
            float f3 = primaries[1];
            float f4 = primaries[2];
            float f5 = primaries[3];
            float f6 = primaries[4];
            float f7 = primaries[5];
            float x2 = whitePoint.getX();
            float y2 = whitePoint.getY();
            float f8 = 1;
            float f9 = (f8 - f2) / f3;
            float f10 = (f8 - f4) / f5;
            float f11 = (f8 - f6) / f7;
            float f12 = (f8 - x2) / y2;
            float f13 = f2 / f3;
            float f14 = (f4 / f5) - f13;
            float f15 = (x2 / y2) - f13;
            float f16 = f10 - f9;
            float f17 = (f6 / f7) - f13;
            float f18 = (((f12 - f9) * f14) - (f15 * f16)) / (((f11 - f9) * f14) - (f16 * f17));
            float f19 = (f15 - (f17 * f18)) / f14;
            float f20 = (1.0f - f19) - f18;
            float f21 = f20 / f3;
            float f22 = f19 / f5;
            float f23 = f18 / f7;
            return new float[]{f21 * f2, f20, ((1.0f - f2) - f3) * f21, f22 * f4, f19, ((1.0f - f4) - f5) * f22, f23 * f6, f18, ((1.0f - f6) - f7) * f23};
        }

        private final boolean contains(float[] p1, float[] p2) {
            float f2 = p1[0];
            float f3 = p2[0];
            float f4 = p1[1];
            float f5 = p2[1];
            float f6 = p1[2] - p2[2];
            float f7 = p1[3] - p2[3];
            float f8 = p1[4];
            float f9 = p2[4];
            float f10 = p1[5];
            float f11 = p2[5];
            float[] fArr = {f2 - f3, f4 - f5, f6, f7, f8 - f9, f10 - f11};
            return cross(fArr[0], fArr[1], f3 - f9, f5 - f11) >= 0.0f && cross(p2[0] - p2[2], p2[1] - p2[3], fArr[0], fArr[1]) >= 0.0f && cross(fArr[2], fArr[3], p2[2] - p2[0], p2[3] - p2[1]) >= 0.0f && cross(p2[2] - p2[4], p2[3] - p2[5], fArr[2], fArr[3]) >= 0.0f && cross(fArr[4], fArr[5], p2[4] - p2[2], p2[5] - p2[3]) >= 0.0f && cross(p2[4] - p2[0], p2[5] - p2[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                if (!compare(d2, OETF, srgb.getOetfOrig()) || !compare(d2, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) {
                return min < 0.0f && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                ArraysKt___ArraysJvmKt.copyInto$default(primaries, fArr, 0, 0, 6, 6, (Object) null);
                return fArr;
            }
            float f2 = primaries[0];
            float f3 = primaries[1];
            float f4 = f2 + f3 + primaries[2];
            fArr[0] = f2 / f4;
            fArr[1] = f3 / f4;
            float f5 = primaries[3];
            float f6 = primaries[4];
            float f7 = f5 + f6 + primaries[5];
            fArr[2] = f5 / f7;
            fArr[3] = f6 / f7;
            float f8 = primaries[6];
            float f9 = primaries[7];
            float f10 = f8 + f9 + primaries[8];
            fArr[4] = f8 / f10;
            fArr[5] = f9 / f10;
            return fArr;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f2 = fArrMul3x3Float3[0];
            float f3 = fArrMul3x3Float3[1];
            float f4 = f2 + f3 + fArrMul3x3Float3[2];
            float f5 = fArrMul3x3Float32[0];
            float f6 = fArrMul3x3Float32[1];
            float f7 = f5 + f6 + fArrMul3x3Float32[2];
            float f8 = fArrMul3x3Float33[0];
            float f9 = fArrMul3x3Float33[1];
            float f10 = f8 + f9 + fArrMul3x3Float33[2];
            return new float[]{f2 / f4, f3 / f4, f5 / f7, f6 / f7, f8 / f10, f9 / f10};
        }

        private Companion() {
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, TransferParameters transferParameters, int i2) {
        super(str, ColorModel.INSTANCE.m4205getRgbxdoWZVw(), i2, null);
        this.whitePoint = whitePoint;
        this.min = f2;
        this.max = f3;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return invoke(d2.doubleValue());
            }

            public final Double invoke(double d2) {
                return Double.valueOf(RangesKt.coerceIn(this.this$0.getOetfOrig().invoke(d2), this.this$0.min, this.this$0.max));
            }
        };
        final int i3 = 0;
        this.oetfFunc = new DoubleFunction(this) { // from class: androidx.compose.ui.graphics.colorspace.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rgb f363b;

            {
                this.f363b = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                switch (i3) {
                    case 0:
                        return Rgb.oetfFunc$lambda$0(this.f363b, d2);
                    default:
                        return Rgb.eotfFunc$lambda$1(this.f363b, d2);
                }
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return invoke(d2.doubleValue());
            }

            public final Double invoke(double d2) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(RangesKt.coerceIn(d2, this.this$0.min, this.this$0.max)));
            }
        };
        final int i4 = 1;
        this.eotfFunc = new DoubleFunction(this) { // from class: androidx.compose.ui.graphics.colorspace.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rgb f363b;

            {
                this.f363b = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                switch (i4) {
                    case 0:
                        return Rgb.oetfFunc$lambda$0(this.f363b, d2);
                    default:
                        return Rgb.eotfFunc$lambda$1(this.f363b, d2);
                }
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f3 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f2, f3);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f2, f3, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d2) {
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d2, double d3) {
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return Math.pow(d3, 1.0d / d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d2, double d3) {
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return Math.pow(d3, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.rcpResponse(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.rcpResponse(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.response(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters, double d2) {
        return ColorSpaceKt.response(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d2) {
        return rgb.eotfOrig.invoke(RangesKt.coerceIn(d2, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d2) {
        return RangesKt.coerceIn(rgb.oetfOrig.invoke(d2), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    public final float[] fromLinear(float r2, float g2, float b2) {
        return fromLinear(new float[]{r2, g2, b2});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v2) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v2);
        v2[0] = (float) this.oetfFunc.invoke(v2[0]);
        v2[1] = (float) this.oetfFunc.invoke(v2[1]);
        v2[2] = (float) this.oetfFunc.invoke(v2[2]);
        return v2;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    /* renamed from: getEotfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    /* renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    /* renamed from: getOetfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    /* renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f2 = this.min;
        int iFloatToIntBits = (iHashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f3 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float r2, float g2, float b2) {
        return toLinear(new float[]{r2, g2, b2});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v0);
        float fInvoke2 = (float) this.eotfFunc.invoke(v1);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        float f2 = (fArr[6] * fInvoke3) + (fArr[3] * fInvoke2) + (fArr[0] * fInvoke);
        float f3 = (fArr[7] * fInvoke3) + (fArr[4] * fInvoke2) + (fArr[1] * fInvoke);
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v2) {
        v2[0] = (float) this.eotfFunc.invoke(v2[0]);
        v2[1] = (float) this.eotfFunc.invoke(v2[1]);
        v2[2] = (float) this.eotfFunc.invoke(v2[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v0);
        float fInvoke2 = (float) this.eotfFunc.invoke(v1);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        return (fArr[8] * fInvoke3) + (fArr[5] * fInvoke2) + (fArr[2] * fInvoke);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4208xyzaToColorJlNiLsg$ui_graphics_release(float x2, float y2, float z, float a2, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[6] * z) + (fArr[3] * y2) + (fArr[0] * x2)), (float) this.oetfFunc.invoke((fArr[7] * z) + (fArr[4] * y2) + (fArr[1] * x2)), (float) this.oetfFunc.invoke((fArr[8] * z) + (fArr[5] * y2) + (fArr[2] * x2)), a2, colorSpace);
    }

    public final float[] fromLinear(float[] v2) {
        v2[0] = (float) this.oetfFunc.invoke(v2[0]);
        v2[1] = (float) this.oetfFunc.invoke(v2[1]);
        v2[2] = (float) this.oetfFunc.invoke(v2[2]);
        return v2;
    }

    public final float[] getInverseTransform(float[] inverseTransform) {
        return ArraysKt___ArraysJvmKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getPrimaries(float[] primaries) {
        return ArraysKt___ArraysJvmKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] transform) {
        return ArraysKt___ArraysJvmKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (Object) null);
    }

    public final float[] toLinear(float[] v2) {
        v2[0] = (float) this.eotfFunc.invoke(v2[0]);
        v2[1] = (float) this.eotfFunc.invoke(v2[1]);
        v2[2] = (float) this.eotfFunc.invoke(v2[2]);
        return v2;
    }

    public Rgb(String str, float[] fArr, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function12) {
        Companion companion = INSTANCE;
        float[] fArrComputePrimaries$ui_graphics_release = companion.computePrimaries$ui_graphics_release(fArr);
        WhitePoint whitePointComputeWhitePoint = companion.computeWhitePoint(fArr);
        final int i2 = 0;
        DoubleFunction doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                switch (i2) {
                    case 0:
                        return Rgb._init_$lambda$2(function1, d2);
                    case 1:
                        return Rgb._init_$lambda$3(function1, d2);
                    case 2:
                        return Rgb._init_$lambda$4(function1, d2);
                    default:
                        return Rgb._init_$lambda$5(function1, d2);
                }
            }
        };
        final int i3 = 1;
        this(str, fArrComputePrimaries$ui_graphics_release, whitePointComputeWhitePoint, null, doubleFunction, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                switch (i3) {
                    case 0:
                        return Rgb._init_$lambda$2(function12, d2);
                    case 1:
                        return Rgb._init_$lambda$3(function12, d2);
                    case 2:
                        return Rgb._init_$lambda$4(function12, d2);
                    default:
                        return Rgb._init_$lambda$5(function12, d2);
                }
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function12, float f2, float f3) {
        final int i2 = 2;
        DoubleFunction doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                switch (i2) {
                    case 0:
                        return Rgb._init_$lambda$2(function1, d2);
                    case 1:
                        return Rgb._init_$lambda$3(function1, d2);
                    case 2:
                        return Rgb._init_$lambda$4(function1, d2);
                    default:
                        return Rgb._init_$lambda$5(function1, d2);
                }
            }
        };
        final int i3 = 3;
        this(str, fArr, whitePoint, null, doubleFunction, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                switch (i3) {
                    case 0:
                        return Rgb._init_$lambda$2(function12, d2);
                    case 1:
                        return Rgb._init_$lambda$3(function12, d2);
                    case 2:
                        return Rgb._init_$lambda$4(function12, d2);
                    default:
                        return Rgb._init_$lambda$5(function12, d2);
                }
            }
        }, f2, f3, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i2) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) {
            final int i3 = 3;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    switch (i3) {
                        case 0:
                            return Rgb._init_$lambda$7(transferParameters, d2);
                        case 1:
                            return Rgb._init_$lambda$8(transferParameters, d2);
                        case 2:
                            return Rgb._init_$lambda$9(transferParameters, d2);
                        default:
                            return Rgb._init_$lambda$6(transferParameters, d2);
                    }
                }
            };
        } else {
            final int i4 = 0;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    switch (i4) {
                        case 0:
                            return Rgb._init_$lambda$7(transferParameters, d2);
                        case 1:
                            return Rgb._init_$lambda$8(transferParameters, d2);
                        case 2:
                            return Rgb._init_$lambda$9(transferParameters, d2);
                        default:
                            return Rgb._init_$lambda$6(transferParameters, d2);
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) {
            final int i5 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    switch (i5) {
                        case 0:
                            return Rgb._init_$lambda$7(transferParameters, d2);
                        case 1:
                            return Rgb._init_$lambda$8(transferParameters, d2);
                        case 2:
                            return Rgb._init_$lambda$9(transferParameters, d2);
                        default:
                            return Rgb._init_$lambda$6(transferParameters, d2);
                    }
                }
            };
        } else {
            final int i6 = 2;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    switch (i6) {
                        case 0:
                            return Rgb._init_$lambda$7(transferParameters, d2);
                        case 1:
                            return Rgb._init_$lambda$8(transferParameters, d2);
                        case 2:
                            return Rgb._init_$lambda$9(transferParameters, d2);
                        default:
                            return Rgb._init_$lambda$6(transferParameters, d2);
                    }
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, 0.0f, 1.0f, transferParameters, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, double d2) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d2, 0.0f, 1.0f, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d2) {
        this(str, fArr, whitePoint, d2, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d2, float f2, float f3, int i2) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d2 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            final int i3 = 0;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.e
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d3) {
                    switch (i3) {
                        case 0:
                            return Rgb._init_$lambda$10(d2, d3);
                        default:
                            return Rgb._init_$lambda$11(d2, d3);
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d2 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            final int i4 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.e
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d3) {
                    switch (i4) {
                        case 0:
                            return Rgb._init_$lambda$10(d2, d3);
                        default:
                            return Rgb._init_$lambda$11(d2, d3);
                    }
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f2, f3, new TransferParameters(d2, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i2);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
