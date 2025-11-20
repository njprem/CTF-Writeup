package S;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f269b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f270c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f271d = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272a;

    public /* synthetic */ a(int i2) {
        this.f272a = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f272a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2125849189, iIntValue, -1, "stdio.cat.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:32)");
                    }
                    g.a(null, composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(42879815, iIntValue2, -1, "stdio.cat.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:31)");
                    }
                    T.c.a(false, false, b.f273a, composer2, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if ((iIntValue3 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-579785916, iIntValue3, -1, "stdio.cat.ComposableSingletons$MainActivityKt.lambda-3.<anonymous> (MainActivity.kt:97)");
                    }
                    g.a(null, composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
