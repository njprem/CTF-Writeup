package D;

import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Path f154a;

    /* renamed from: b, reason: collision with root package name */
    public final a f155b;

    /* renamed from: c, reason: collision with root package name */
    public final float f156c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f157d;

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public d(Path path, a conicEvaluation, float f2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.f154a = path;
        this.f155b = conicEvaluation;
        this.f156c = f2;
        this.f157d = new float[8];
    }

    public abstract int a(boolean z);

    public abstract boolean b();

    public abstract f c(float[] fArr, int i2);
}
