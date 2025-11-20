package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\rH\u0000\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"WindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "", "add", "insets", "asInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "exclude", "only", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "union", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    public static final WindowInsets WindowInsets(int i2, int i3, int i4, int i5) {
        return new FixedIntInsets(i2, i3, i4, i5);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return WindowInsets(i2, i3, i4, i5);
    }

    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m711WindowInsetsa9UjIt4(float f2, float f3, float f4, float f5) {
        return new FixedDpInsets(f2, f3, f4, f5, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m712WindowInsetsa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6233constructorimpl(0);
        }
        return m711WindowInsetsa9UjIt4(f2, f3, f4, f5);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i2, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m713onlybOOhFvg(WindowInsets windowInsets, int i2) {
        return new LimitInsets(windowInsets, i2, null);
    }

    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }
}
