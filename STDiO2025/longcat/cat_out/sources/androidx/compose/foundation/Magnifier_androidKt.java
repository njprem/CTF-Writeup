package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0094\u0001\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00122\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¬\u0001\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00122\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\" \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "isPlatformMagnifierSupported", "", "sdkVersion", "", "equalsIncludingNaN", "", "other", "magnifier", "Landroidx/compose/ui/Modifier;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJFFZ)Landroidx/compose/ui/Modifier;", "useTextDefault", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<Function0<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean equalsIncludingNaN(float f2, float f3) {
        return (Float.isNaN(f2) && Float.isNaN(f3)) || f2 == f3;
    }

    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    public static final boolean isPlatformMagnifierSupported(int i2) {
        return i2 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i2);
    }

    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m264magnifierUpNRX3w(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f2, long j2, float f3, float f4, boolean z) {
        return m267magnifierjPUL71Q$default(modifier, function1, function12, function13, f2, false, j2, f3, f4, z, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m265magnifierUpNRX3w$default(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f2, long j2, float f3, float f4, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function12 = null;
        }
        if ((i2 & 4) != 0) {
            function13 = null;
        }
        if ((i2 & 8) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 16) != 0) {
            j2 = DpSize.INSTANCE.m6340getUnspecifiedMYxV2XQ();
        }
        if ((i2 & 32) != 0) {
            f3 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 64) != 0) {
            f4 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 128) != 0) {
            z = true;
        }
        return m264magnifierUpNRX3w(modifier, function1, function12, function13, f2, j2, f3, f4, z);
    }

    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m266magnifierjPUL71Q(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(function1, function12, function13, f2, z, j2, f3, f4, z2, platformMagnifierFactory == null ? PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m267magnifierjPUL71Q$default(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function12 = null;
        }
        if ((i2 & 4) != 0) {
            function13 = null;
        }
        if ((i2 & 8) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            j2 = DpSize.INSTANCE.m6340getUnspecifiedMYxV2XQ();
        }
        if ((i2 & 64) != 0) {
            f3 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 128) != 0) {
            f4 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        if ((i2 & Fields.RotationX) != 0) {
            z2 = true;
        }
        if ((i2 & 512) != 0) {
            platformMagnifierFactory = null;
        }
        return m266magnifierjPUL71Q(modifier, function1, function12, function13, f2, z, j2, f3, f4, z2, platformMagnifierFactory);
    }
}
