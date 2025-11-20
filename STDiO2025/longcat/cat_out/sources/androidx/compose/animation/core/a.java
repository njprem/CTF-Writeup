package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Easing {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306a;

    public /* synthetic */ a(int i2) {
        this.f306a = i2;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f2) {
        switch (this.f306a) {
            case 0:
                return EasingFunctionsKt.EaseInElastic$lambda$0(f2);
            case 1:
                return EasingFunctionsKt.EaseOutElastic$lambda$1(f2);
            case 2:
                return EasingFunctionsKt.EaseInOutElastic$lambda$2(f2);
            case 3:
                return EasingFunctionsKt.EaseOutBounce$lambda$3(f2);
            case 4:
                return EasingFunctionsKt.EaseInBounce$lambda$4(f2);
            case 5:
                return EasingFunctionsKt.EaseInOutBounce$lambda$5(f2);
            default:
                return EasingKt.LinearEasing$lambda$0(f2);
        }
    }
}
