package androidx.compose.material3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.material.icons.filled.DateRangeKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$DatePickerKt {
    public static final ComposableSingletons$DatePickerKt INSTANCE = new ComposableSingletons$DatePickerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f26lambda1 = ComposableLambdaKt.composableLambdaInstance(1244569435, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-1$1
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
                ComposerKt.traceEventStart(1244569435, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-1.<anonymous> (DatePicker.kt:1358)");
            }
            ImageVector edit = EditKt.getEdit(Icons.Filled.INSTANCE);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.m1783Iconww6aTOc(edit, Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_date_picker_switch_to_input_mode), composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f27lambda2 = ComposableLambdaKt.composableLambdaInstance(668820324, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-2$1
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
                ComposerKt.traceEventStart(668820324, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-2.<anonymous> (DatePicker.kt:1365)");
            }
            ImageVector dateRange = DateRangeKt.getDateRange(Icons.Filled.INSTANCE);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.m1783Iconww6aTOc(dateRange, Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_date_picker_switch_to_calendar_mode), composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f28lambda3 = ComposableLambdaKt.composableLambdaInstance(1233169686, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-3$1
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
                ComposerKt.traceEventStart(1233169686, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-3.<anonymous> (DatePicker.kt:2163)");
            }
            ImageVector keyboardArrowLeft = KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.AutoMirrored.Filled.INSTANCE);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.m1783Iconww6aTOc(keyboardArrowLeft, Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_date_picker_switch_to_previous_month), composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f29lambda4 = ComposableLambdaKt.composableLambdaInstance(412350847, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-4$1
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
                ComposerKt.traceEventStart(412350847, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-4.<anonymous> (DatePicker.kt:2169)");
            }
            ImageVector keyboardArrowRight = KeyboardArrowRightKt.getKeyboardArrowRight(Icons.AutoMirrored.Filled.INSTANCE);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.m1783Iconww6aTOc(keyboardArrowRight, Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_date_picker_switch_to_next_month), composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1593getLambda1$material3_release() {
        return f26lambda1;
    }

    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1594getLambda2$material3_release() {
        return f27lambda2;
    }

    /* renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1595getLambda3$material3_release() {
        return f28lambda3;
    }

    /* renamed from: getLambda-4$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1596getLambda4$material3_release() {
        return f29lambda4;
    }
}
