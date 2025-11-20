package c;

import a.AbstractC0130a;
import a.AbstractC0131b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class d extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function f675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z, Function function, int i2, int i3) {
        super(2);
        this.f672a = i3;
        this.f673b = z;
        this.f675d = function;
        this.f674c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f672a;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                AbstractC0130a.a(this.f673b, (Function0) this.f675d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f674c | 1));
                break;
            default:
                AbstractC0131b.a(this.f673b, (Function2) this.f675d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f674c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
