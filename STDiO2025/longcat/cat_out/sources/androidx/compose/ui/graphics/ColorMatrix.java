package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ2\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJP\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f26\u0010&\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\t0'H\u0082\b¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101J(\u0010.\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b9\u00107J\u0015\u0010:\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b;\u00107J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u000f¢\u0006\u0004\b>\u00107J-\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bH\u00101J\u0010\u0010I\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "convertRgbToYuv", "", "convertRgbToYuv-impl", "([F)V", "convertYuvToRgb", "convertYuvToRgb-impl", "dot", "", "m1", "row", "", "m2", "column", "dot-Me4OoYI", "([F[FI[FI)F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "reset", "reset-impl", "rotateInternal", "degrees", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cosine", "sine", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "set", "src", "set-jHG-Opc", "([F[F)V", "v", "set-impl", "([FIIF)V", "setToRotateBlue", "setToRotateBlue-impl", "([FF)V", "setToRotateGreen", "setToRotateGreen-impl", "setToRotateRed", "setToRotateRed-impl", "setToSaturation", "sat", "setToSaturation-impl", "setToScale", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "timesAssign", "colorMatrix", "timesAssign-jHG-Opc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m3847boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m3848constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m3849constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m3848constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m3850convertRgbToYuvimpl(float[] fArr) {
        m3857resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m3851convertYuvToRgbimpl(float[] fArr) {
        m3857resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m3852dotMe4OoYI(float[] fArr, float[] fArr2, int i2, float[] fArr3, int i3) {
        int i4 = i2 * 5;
        return (fArr2[i4 + 3] * fArr3[15 + i3]) + (fArr2[i4 + 2] * fArr3[10 + i3]) + (fArr2[i4 + 1] * fArr3[5 + i3]) + (fArr2[i4] * fArr3[i3]);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3853equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m3868unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3854equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m3855getimpl(float[] fArr, int i2, int i3) {
        return fArr[(i2 * 5) + i3];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3856hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m3857resetimpl(float[] fArr) {
        ArraysKt___ArraysJvmKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m3858rotateInternalimpl(float[] fArr, float f2, Function2<? super Float, ? super Float, Unit> function2) {
        m3857resetimpl(fArr);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        function2.invoke(Float.valueOf((float) Math.cos(d2)), Float.valueOf((float) Math.sin(d2)));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3859setimpl(float[] fArr, int i2, int i3, float f2) {
        fArr[(i2 * 5) + i3] = f2;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m3860setjHGOpc(float[] fArr, float[] fArr2) {
        ArraysKt___ArraysJvmKt.copyInto$default(fArr2, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m3861setToRotateBlueimpl(float[] fArr, float f2) {
        m3857resetimpl(fArr);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m3862setToRotateGreenimpl(float[] fArr, float f2) {
        m3857resetimpl(fArr);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m3863setToRotateRedimpl(float[] fArr, float f2) {
        m3857resetimpl(fArr);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m3864setToSaturationimpl(float[] fArr, float f2) {
        m3857resetimpl(fArr);
        float f3 = 1 - f2;
        float f4 = 0.213f * f3;
        float f5 = 0.715f * f3;
        float f6 = f3 * 0.072f;
        fArr[0] = f4 + f2;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[5] = f4;
        fArr[6] = f5 + f2;
        fArr[7] = f6;
        fArr[10] = f4;
        fArr[11] = f5;
        fArr[12] = f6 + f2;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m3865setToScaleimpl(float[] fArr, float f2, float f3, float f4, float f5) {
        m3857resetimpl(fArr);
        fArr[0] = f2;
        fArr[6] = f3;
        fArr[12] = f4;
        fArr[18] = f5;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m3866timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        float fM3852dotMe4OoYI = m3852dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float fM3852dotMe4OoYI2 = m3852dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float fM3852dotMe4OoYI3 = m3852dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float fM3852dotMe4OoYI4 = m3852dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f2 = (fArr[3] * fArr2[19]) + (fArr[2] * fArr2[14]) + (fArr[1] * fArr2[9]) + (fArr[0] * fArr2[4]) + fArr[4];
        float fM3852dotMe4OoYI5 = m3852dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float fM3852dotMe4OoYI6 = m3852dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float fM3852dotMe4OoYI7 = m3852dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float fM3852dotMe4OoYI8 = m3852dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f3 = (fArr[8] * fArr2[19]) + (fArr[7] * fArr2[14]) + (fArr[6] * fArr2[9]) + (fArr[5] * fArr2[4]) + fArr[9];
        float fM3852dotMe4OoYI9 = m3852dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float fM3852dotMe4OoYI10 = m3852dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float fM3852dotMe4OoYI11 = m3852dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float fM3852dotMe4OoYI12 = m3852dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f4 = (fArr[13] * fArr2[19]) + (fArr[12] * fArr2[14]) + (fArr[11] * fArr2[9]) + (fArr[10] * fArr2[4]) + fArr[14];
        float fM3852dotMe4OoYI13 = m3852dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float fM3852dotMe4OoYI14 = m3852dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float fM3852dotMe4OoYI15 = m3852dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float fM3852dotMe4OoYI16 = m3852dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f5 = (fArr[18] * fArr2[19]) + (fArr[17] * fArr2[14]) + (fArr[16] * fArr2[9]) + (fArr[15] * fArr2[4]) + fArr[19];
        fArr[0] = fM3852dotMe4OoYI;
        fArr[1] = fM3852dotMe4OoYI2;
        fArr[2] = fM3852dotMe4OoYI3;
        fArr[3] = fM3852dotMe4OoYI4;
        fArr[4] = f2;
        fArr[5] = fM3852dotMe4OoYI5;
        fArr[6] = fM3852dotMe4OoYI6;
        fArr[7] = fM3852dotMe4OoYI7;
        fArr[8] = fM3852dotMe4OoYI8;
        fArr[9] = f3;
        fArr[10] = fM3852dotMe4OoYI9;
        fArr[11] = fM3852dotMe4OoYI10;
        fArr[12] = fM3852dotMe4OoYI11;
        fArr[13] = fM3852dotMe4OoYI12;
        fArr[14] = f4;
        fArr[15] = fM3852dotMe4OoYI13;
        fArr[16] = fM3852dotMe4OoYI14;
        fArr[17] = fM3852dotMe4OoYI15;
        fArr[18] = fM3852dotMe4OoYI16;
        fArr[19] = f5;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3867toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m3853equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m3856hashCodeimpl(this.values);
    }

    public String toString() {
        return m3867toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m3868unboximpl() {
        return this.values;
    }
}
