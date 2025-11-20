package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MarqueeSpacing {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f308b;

    public /* synthetic */ a(float f2, int i2) {
        this.f307a = i2;
        this.f308b = f2;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i2, int i3) {
        switch (this.f307a) {
            case 0:
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(this.f308b, density, i2, i3);
            default:
                return MarqueeSpacing.Companion.fractionOfContainer$lambda$0(this.f308b, density, i2, i3);
        }
    }
}
