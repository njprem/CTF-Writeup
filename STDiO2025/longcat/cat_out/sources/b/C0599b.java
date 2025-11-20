package b;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599b {

    /* renamed from: a, reason: collision with root package name */
    public final float f632a;

    /* renamed from: b, reason: collision with root package name */
    public final float f633b;

    /* renamed from: c, reason: collision with root package name */
    public final float f634c;

    /* renamed from: d, reason: collision with root package name */
    public final int f635d;

    public C0599b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float fG = AbstractC0598a.g(backEvent);
        float fH = AbstractC0598a.h(backEvent);
        float fE = AbstractC0598a.e(backEvent);
        int iF = AbstractC0598a.f(backEvent);
        this.f632a = fG;
        this.f633b = fH;
        this.f634c = fE;
        this.f635d = iF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f632a);
        sb.append(", touchY=");
        sb.append(this.f633b);
        sb.append(", progress=");
        sb.append(this.f634c);
        sb.append(", swipeEdge=");
        return androidx.compose.runtime.changelist.a.o(sb, this.f635d, '}');
    }
}
