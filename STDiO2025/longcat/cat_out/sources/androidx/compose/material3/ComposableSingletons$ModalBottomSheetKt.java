package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheetKt {
    public static final ComposableSingletons$ModalBottomSheetKt INSTANCE = new ComposableSingletons$ModalBottomSheetKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f35lambda1 = ComposableLambdaKt.composableLambdaInstance(-1524796689, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1524796689, i2, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda-1.<anonymous> (ModalBottomSheet.kt:128)");
            }
            BottomSheetDefaults.INSTANCE.m1423DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f36lambda2 = ComposableLambdaKt.composableLambdaInstance(2066864887, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2066864887, i2, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda-2.<anonymous> (ModalBottomSheet.kt:211)");
            }
            BottomSheetDefaults.INSTANCE.m1423DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1602getLambda1$material3_release() {
        return f35lambda1;
    }

    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1603getLambda2$material3_release() {
        return f36lambda2;
    }
}
