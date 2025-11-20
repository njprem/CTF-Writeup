package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxDefaults;", "", "()V", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;
    public static final SwipeToDismissBoxDefaults INSTANCE = new SwipeToDismissBoxDefaults();

    private SwipeToDismissBoxDefaults() {
    }

    public final Function1<Float, Float> getPositionalThreshold(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1545861529, i2, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:261)");
        }
        composer.startReplaceGroup(-1853326336);
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<Float, Float>() { // from class: androidx.compose.material3.SwipeToDismissBoxDefaults$positionalThreshold$1$1$1
                {
                    super(1);
                }

                public final Float invoke(float f2) {
                    return Float.valueOf(density.mo334toPx0680j_4(Dp.m6233constructorimpl(56)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                    return invoke(f2.floatValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<Float, Float> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function1;
    }
}
