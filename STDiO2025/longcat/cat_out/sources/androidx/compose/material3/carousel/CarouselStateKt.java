package androidx.compose.material3.carousel;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberCarouselState", "Landroidx/compose/material3/carousel/CarouselState;", "initialItem", "", "itemCount", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/carousel/CarouselState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselStateKt {
    public static final CarouselState rememberCarouselState(final int i2, final Function0<Integer> function0, Composer composer, int i3, int i4) {
        boolean z = true;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-217285684, i3, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:102)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselState, ?> saver = CarouselState.INSTANCE.getSaver();
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i2)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(function0)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<CarouselState>() { // from class: androidx.compose.material3.carousel.CarouselStateKt$rememberCarouselState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CarouselState invoke() {
                    return new CarouselState(i2, 0.0f, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        CarouselState carouselState = (CarouselState) RememberSaveableKt.m3378rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        carouselState.getItemCountState().setValue(function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselState;
    }
}
