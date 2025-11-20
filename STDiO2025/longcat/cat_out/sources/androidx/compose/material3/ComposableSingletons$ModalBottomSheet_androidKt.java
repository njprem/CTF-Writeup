package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f37lambda1 = ComposableLambdaKt.composableLambdaInstance(-1187811352, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1187811352, i2, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-1.<anonymous> (ModalBottomSheet.android.kt:242)");
            }
            BottomSheetDefaults.INSTANCE.m1423DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f38lambda2 = ComposableLambdaKt.composableLambdaInstance(-91331245, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda-2$1
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
                ComposerKt.traceEventStart(-91331245, i2, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-2.<anonymous> (ModalBottomSheet.android.kt:335)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1604getLambda1$material3_release() {
        return f37lambda1;
    }

    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1605getLambda2$material3_release() {
        return f38lambda2;
    }
}
