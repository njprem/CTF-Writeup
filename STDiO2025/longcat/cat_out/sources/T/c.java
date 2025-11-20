package T;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorScheme f289a = ColorSchemeKt.m1564darkColorSchemeCXl9yA$default(a.f279a, 0, 0, 0, 0, a.f280b, 0, 0, 0, a.f281c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);

    /* renamed from: b, reason: collision with root package name */
    public static final ColorScheme f290b = ColorSchemeKt.m1568lightColorSchemeCXl9yA$default(a.f282d, 0, 0, 0, 0, a.f283e, 0, 0, 0, a.f284f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);

    public static final void a(final boolean z, final boolean z2, ComposableLambda content, Composer composer, final int i2) {
        int i3;
        ColorScheme colorSchemeDynamicDarkColorScheme;
        final ComposableLambda composableLambda;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2110787365);
        int i4 = ((i2 & 6) == 0 ? i2 | 2 : i2) | 48;
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(content) ? Fields.RotationX : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composableLambda = content;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                z = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                i3 = i4 & (-15);
                z2 = true;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i4 & (-15);
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2110787365, i3, -1, "stdio.cat.ui.theme.CatTheme (Theme.kt:41)");
            }
            composerStartRestartGroup.startReplaceGroup(-171738450);
            if (!z2 || Build.VERSION.SDK_INT < 31) {
                colorSchemeDynamicDarkColorScheme = z ? f289a : f290b;
            } else {
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                colorSchemeDynamicDarkColorScheme = z ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            }
            ColorScheme colorScheme = colorSchemeDynamicDarkColorScheme;
            composerStartRestartGroup.endReplaceGroup();
            composableLambda = content;
            MaterialThemeKt.MaterialTheme(colorScheme, null, d.f291a, composableLambda, composerStartRestartGroup, ((i3 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: T.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    boolean z3 = z2;
                    ComposableLambda composableLambda2 = composableLambda;
                    c.a(z, z3, composableLambda2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
