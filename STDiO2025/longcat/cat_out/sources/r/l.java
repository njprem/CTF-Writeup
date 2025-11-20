package r;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f963k;

    /* renamed from: a, reason: collision with root package name */
    public final float f964a;

    /* renamed from: b, reason: collision with root package name */
    public final float f965b;

    /* renamed from: c, reason: collision with root package name */
    public final float f966c;

    /* renamed from: d, reason: collision with root package name */
    public final float f967d;

    /* renamed from: e, reason: collision with root package name */
    public final float f968e;

    /* renamed from: f, reason: collision with root package name */
    public final float f969f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f970g;

    /* renamed from: h, reason: collision with root package name */
    public final float f971h;

    /* renamed from: i, reason: collision with root package name */
    public final float f972i;

    /* renamed from: j, reason: collision with root package name */
    public final float f973j;

    static {
        float[] fArr = b.f945c;
        float fG = (float) ((b.g() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f943a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float f10 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fG) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float f11 = 1.0f / ((5.0f * fG) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float fCbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(fG * 5.0d))) + (f12 * fG);
        float fG2 = b.g() / fArr[1];
        double d3 = fG2;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * fCbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * fCbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * fCbrt) * f9) / 100.0d, 0.42d)};
        float f14 = fArr6[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr6[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr6[2];
        float[] fArr7 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f963k = new l(fG2, J.d.a(fArr7[2], 0.05f, (fArr7[0] * 2.0f) + fArr7[1], fPow), fPow, fPow, f10, 1.0f, new float[]{(((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public l(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f969f = f2;
        this.f964a = f3;
        this.f965b = f4;
        this.f966c = f5;
        this.f967d = f6;
        this.f968e = f7;
        this.f970g = fArr;
        this.f971h = f8;
        this.f972i = f9;
        this.f973j = f10;
    }
}
