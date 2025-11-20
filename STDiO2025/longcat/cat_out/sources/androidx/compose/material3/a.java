package androidx.compose.material3;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ScrolledOffset {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f338b;

    public /* synthetic */ a(TopAppBarScrollBehavior topAppBarScrollBehavior, int i2) {
        this.f337a = i2;
        this.f338b = topAppBarScrollBehavior;
    }

    @Override // androidx.compose.material3.ScrolledOffset
    public final float offset() {
        switch (this.f337a) {
            case 0:
                return AppBarKt$SingleRowTopAppBar$3.invoke$lambda$1$lambda$0(this.f338b);
            default:
                return AppBarKt$TwoRowsTopAppBar$6.invoke$lambda$3$lambda$2$lambda$1(this.f338b);
        }
    }
}
