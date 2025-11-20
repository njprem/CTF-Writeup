package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a´\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aø\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\b\u0010<\u001a\u00020\u0004H\u0000\u001a´\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u00102\u001aø\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b?\u0010;\u001a&\u0010@\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020BH\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0002\u0010H\u001a\u001e\u0010I\u001a\u00020\u000b*\u00020\u00042\u0006\u0010A\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", "value", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "darkColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "expressiveLightColorScheme", "lightColorScheme", "lightColorScheme-G1PFc-w", "lightColorScheme-C-Xl9yA", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m1568lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m1560applyTonalElevationRFCenO8(ColorScheme colorScheme, long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i2, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m3793equalsimpl0(j2, colorScheme.getSurface()) && zBooleanValue) {
            j2 = m1571surfaceColorAtElevation3ABfNKs(colorScheme, f2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j2;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1561contentColorFor4WTKRHQ(ColorScheme colorScheme, long j2) {
        return Color.m3793equalsimpl0(j2, colorScheme.getPrimary()) ? colorScheme.getOnPrimary() : Color.m3793equalsimpl0(j2, colorScheme.getSecondary()) ? colorScheme.getOnSecondary() : Color.m3793equalsimpl0(j2, colorScheme.getTertiary()) ? colorScheme.getOnTertiary() : Color.m3793equalsimpl0(j2, colorScheme.getBackground()) ? colorScheme.getOnBackground() : Color.m3793equalsimpl0(j2, colorScheme.getError()) ? colorScheme.getOnError() : Color.m3793equalsimpl0(j2, colorScheme.getPrimaryContainer()) ? colorScheme.getOnPrimaryContainer() : Color.m3793equalsimpl0(j2, colorScheme.getSecondaryContainer()) ? colorScheme.getOnSecondaryContainer() : Color.m3793equalsimpl0(j2, colorScheme.getTertiaryContainer()) ? colorScheme.getOnTertiaryContainer() : Color.m3793equalsimpl0(j2, colorScheme.getErrorContainer()) ? colorScheme.getOnErrorContainer() : Color.m3793equalsimpl0(j2, colorScheme.getInverseSurface()) ? colorScheme.getInverseOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurface()) ? colorScheme.getOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceVariant()) ? colorScheme.getOnSurfaceVariant() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceBright()) ? colorScheme.getOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceContainer()) ? colorScheme.getOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceContainerHigh()) ? colorScheme.getOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceContainerHighest()) ? colorScheme.getOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceContainerLow()) ? colorScheme.getOnSurface() : Color.m3793equalsimpl0(j2, colorScheme.getSurfaceContainerLowest()) ? colorScheme.getOnSurface() : Color.INSTANCE.m3828getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1562contentColorForek8zF_U(long j2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i2, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM1561contentColorFor4WTKRHQ = m1561contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2);
        if (jM1561contentColorFor4WTKRHQ == 16) {
            jM1561contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3802unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1561contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m1563darkColorSchemeCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1564darkColorSchemeCXl9yA$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        long jM2695getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2695getPrimary0d7_KjU() : j2;
        long jM2679getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2679getOnPrimary0d7_KjU() : j3;
        long jM2696getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2696getPrimaryContainer0d7_KjU() : j4;
        long jM2680getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2680getOnPrimaryContainer0d7_KjU() : j5;
        long jM2674getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m2674getInversePrimary0d7_KjU() : j6;
        long jM2700getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m2700getSecondary0d7_KjU() : j7;
        long jM2683getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m2683getOnSecondary0d7_KjU() : j8;
        long jM2701getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m2701getSecondaryContainer0d7_KjU() : j9;
        long j38 = jM2695getPrimary0d7_KjU;
        long jM2684getOnSecondaryContainer0d7_KjU = (i2 & Fields.RotationX) != 0 ? ColorDarkTokens.INSTANCE.m2684getOnSecondaryContainer0d7_KjU() : j10;
        long jM2714getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2714getTertiary0d7_KjU() : j11;
        long jM2689getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2689getOnTertiary0d7_KjU() : j12;
        long jM2715getTertiaryContainer0d7_KjU = (i2 & Fields.CameraDistance) != 0 ? ColorDarkTokens.INSTANCE.m2715getTertiaryContainer0d7_KjU() : j13;
        long jM2690getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2690getOnTertiaryContainer0d7_KjU() : j14;
        long jM2670getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m2670getBackground0d7_KjU() : j15;
        long jM2676getOnBackground0d7_KjU = (i2 & Fields.Clip) != 0 ? ColorDarkTokens.INSTANCE.m2676getOnBackground0d7_KjU() : j16;
        long jM2704getSurface0d7_KjU = (i2 & Fields.CompositingStrategy) != 0 ? ColorDarkTokens.INSTANCE.m2704getSurface0d7_KjU() : j17;
        long jM2687getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2687getOnSurface0d7_KjU() : j18;
        long jM2713getSurfaceVariant0d7_KjU = (i2 & Fields.RenderEffect) != 0 ? ColorDarkTokens.INSTANCE.m2713getSurfaceVariant0d7_KjU() : j19;
        long jM2688getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2688getOnSurfaceVariant0d7_KjU() : j20;
        long j39 = (i2 & 524288) != 0 ? j38 : j21;
        long jM2675getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2675getInverseSurface0d7_KjU() : j22;
        long jM2673getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2673getInverseOnSurface0d7_KjU() : j23;
        long jM2671getError0d7_KjU = (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m2671getError0d7_KjU() : j24;
        long jM2677getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2677getOnError0d7_KjU() : j25;
        long jM2672getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m2672getErrorContainer0d7_KjU() : j26;
        long jM2678getOnErrorContainer0d7_KjU = (i2 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2678getOnErrorContainer0d7_KjU() : j27;
        long jM2693getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m2693getOutline0d7_KjU() : j28;
        long jM2694getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m2694getOutlineVariant0d7_KjU() : j29;
        long jM2699getScrim0d7_KjU = (i2 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m2699getScrim0d7_KjU() : j30;
        long jM2705getSurfaceBright0d7_KjU = (i2 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m2705getSurfaceBright0d7_KjU() : j31;
        long jM2706getSurfaceContainer0d7_KjU = (i2 & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m2706getSurfaceContainer0d7_KjU() : j32;
        long jM2707getSurfaceContainerHigh0d7_KjU = (i2 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m2707getSurfaceContainerHigh0d7_KjU() : j33;
        long jM2708getSurfaceContainerHighest0d7_KjU = (i3 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2708getSurfaceContainerHighest0d7_KjU() : j34;
        long jM2709getSurfaceContainerLow0d7_KjU = (i3 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2709getSurfaceContainerLow0d7_KjU() : j35;
        long jM2710getSurfaceContainerLowest0d7_KjU = (i3 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2710getSurfaceContainerLowest0d7_KjU() : j36;
        if ((i3 & 8) != 0) {
            j37 = ColorDarkTokens.INSTANCE.m2711getSurfaceDim0d7_KjU();
        }
        return m1563darkColorSchemeCXl9yA(j38, jM2679getOnPrimary0d7_KjU, jM2696getPrimaryContainer0d7_KjU, jM2680getOnPrimaryContainer0d7_KjU, jM2674getInversePrimary0d7_KjU, jM2700getSecondary0d7_KjU, jM2683getOnSecondary0d7_KjU, jM2701getSecondaryContainer0d7_KjU, jM2684getOnSecondaryContainer0d7_KjU, jM2714getTertiary0d7_KjU, jM2689getOnTertiary0d7_KjU, jM2715getTertiaryContainer0d7_KjU, jM2690getOnTertiaryContainer0d7_KjU, jM2670getBackground0d7_KjU, jM2676getOnBackground0d7_KjU, jM2704getSurface0d7_KjU, jM2687getOnSurface0d7_KjU, jM2713getSurfaceVariant0d7_KjU, jM2688getOnSurfaceVariant0d7_KjU, j39, jM2675getInverseSurface0d7_KjU, jM2673getInverseOnSurface0d7_KjU, jM2671getError0d7_KjU, jM2677getOnError0d7_KjU, jM2672getErrorContainer0d7_KjU, jM2678getOnErrorContainer0d7_KjU, jM2693getOutline0d7_KjU, jM2694getOutlineVariant0d7_KjU, jM2699getScrim0d7_KjU, jM2705getSurfaceBright0d7_KjU, jM2706getSurfaceContainer0d7_KjU, jM2707getSurfaceContainerHigh0d7_KjU, jM2708getSurfaceContainerHighest0d7_KjU, jM2709getSurfaceContainerLow0d7_KjU, jM2710getSurfaceContainerLowest0d7_KjU, j37);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1565darkColorSchemeG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m1564darkColorSchemeCXl9yA$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1566darkColorSchemeG1PFcw$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        long jM2695getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2695getPrimary0d7_KjU() : j2;
        long jM2679getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2679getOnPrimary0d7_KjU() : j3;
        long jM2696getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2696getPrimaryContainer0d7_KjU() : j4;
        long jM2680getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2680getOnPrimaryContainer0d7_KjU() : j5;
        long jM2674getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m2674getInversePrimary0d7_KjU() : j6;
        long jM2700getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m2700getSecondary0d7_KjU() : j7;
        long jM2683getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m2683getOnSecondary0d7_KjU() : j8;
        long jM2701getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m2701getSecondaryContainer0d7_KjU() : j9;
        long j31 = jM2695getPrimary0d7_KjU;
        long jM2684getOnSecondaryContainer0d7_KjU = (i2 & Fields.RotationX) != 0 ? ColorDarkTokens.INSTANCE.m2684getOnSecondaryContainer0d7_KjU() : j10;
        long jM2714getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2714getTertiary0d7_KjU() : j11;
        long jM2689getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2689getOnTertiary0d7_KjU() : j12;
        long jM2715getTertiaryContainer0d7_KjU = (i2 & Fields.CameraDistance) != 0 ? ColorDarkTokens.INSTANCE.m2715getTertiaryContainer0d7_KjU() : j13;
        long jM2690getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2690getOnTertiaryContainer0d7_KjU() : j14;
        long jM2670getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m2670getBackground0d7_KjU() : j15;
        long jM2676getOnBackground0d7_KjU = (i2 & Fields.Clip) != 0 ? ColorDarkTokens.INSTANCE.m2676getOnBackground0d7_KjU() : j16;
        long jM2704getSurface0d7_KjU = (i2 & Fields.CompositingStrategy) != 0 ? ColorDarkTokens.INSTANCE.m2704getSurface0d7_KjU() : j17;
        long jM2687getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2687getOnSurface0d7_KjU() : j18;
        long jM2713getSurfaceVariant0d7_KjU = (i2 & Fields.RenderEffect) != 0 ? ColorDarkTokens.INSTANCE.m2713getSurfaceVariant0d7_KjU() : j19;
        long jM2688getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2688getOnSurfaceVariant0d7_KjU() : j20;
        long j32 = (i2 & 524288) != 0 ? j31 : j21;
        long jM2675getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2675getInverseSurface0d7_KjU() : j22;
        long jM2673getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2673getInverseOnSurface0d7_KjU() : j23;
        long jM2671getError0d7_KjU = (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m2671getError0d7_KjU() : j24;
        long jM2677getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2677getOnError0d7_KjU() : j25;
        long jM2672getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m2672getErrorContainer0d7_KjU() : j26;
        long jM2678getOnErrorContainer0d7_KjU = (i2 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2678getOnErrorContainer0d7_KjU() : j27;
        long jM2693getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m2693getOutline0d7_KjU() : j28;
        long jM2694getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m2694getOutlineVariant0d7_KjU() : j29;
        if ((i2 & 268435456) != 0) {
            j30 = ColorDarkTokens.INSTANCE.m2699getScrim0d7_KjU();
        }
        return m1565darkColorSchemeG1PFcw(j31, jM2679getOnPrimary0d7_KjU, jM2696getPrimaryContainer0d7_KjU, jM2680getOnPrimaryContainer0d7_KjU, jM2674getInversePrimary0d7_KjU, jM2700getSecondary0d7_KjU, jM2683getOnSecondary0d7_KjU, jM2701getSecondaryContainer0d7_KjU, jM2684getOnSecondaryContainer0d7_KjU, jM2714getTertiary0d7_KjU, jM2689getOnTertiary0d7_KjU, jM2715getTertiaryContainer0d7_KjU, jM2690getOnTertiaryContainer0d7_KjU, jM2670getBackground0d7_KjU, jM2676getOnBackground0d7_KjU, jM2704getSurface0d7_KjU, jM2687getOnSurface0d7_KjU, jM2713getSurfaceVariant0d7_KjU, jM2688getOnSurfaceVariant0d7_KjU, j32, jM2675getInverseSurface0d7_KjU, jM2673getInverseOnSurface0d7_KjU, jM2671getError0d7_KjU, jM2677getOnError0d7_KjU, jM2672getErrorContainer0d7_KjU, jM2678getOnErrorContainer0d7_KjU, jM2693getOutline0d7_KjU, jM2694getOutlineVariant0d7_KjU, j30);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m1568lightColorSchemeCXl9yA$default(0L, 0L, 0L, paletteTokens.m3054getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m3067getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m3067getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case Matrix.TranslateX /* 12 */:
                return colorScheme.getOnSecondary();
            case Matrix.TranslateY /* 13 */:
                return colorScheme.getOnSecondaryContainer();
            case Matrix.TranslateZ /* 14 */:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            default:
                return Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i2, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m1567lightColorSchemeCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1568lightColorSchemeCXl9yA$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        long jM2743getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m2743getPrimary0d7_KjU() : j2;
        long jM2727getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m2727getOnPrimary0d7_KjU() : j3;
        long jM2744getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m2744getPrimaryContainer0d7_KjU() : j4;
        long jM2728getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m2728getOnPrimaryContainer0d7_KjU() : j5;
        long jM2722getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m2722getInversePrimary0d7_KjU() : j6;
        long jM2748getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m2748getSecondary0d7_KjU() : j7;
        long jM2731getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m2731getOnSecondary0d7_KjU() : j8;
        long jM2749getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m2749getSecondaryContainer0d7_KjU() : j9;
        long j38 = jM2743getPrimary0d7_KjU;
        long jM2732getOnSecondaryContainer0d7_KjU = (i2 & Fields.RotationX) != 0 ? ColorLightTokens.INSTANCE.m2732getOnSecondaryContainer0d7_KjU() : j10;
        long jM2762getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m2762getTertiary0d7_KjU() : j11;
        long jM2737getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2737getOnTertiary0d7_KjU() : j12;
        long jM2763getTertiaryContainer0d7_KjU = (i2 & Fields.CameraDistance) != 0 ? ColorLightTokens.INSTANCE.m2763getTertiaryContainer0d7_KjU() : j13;
        long jM2738getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2738getOnTertiaryContainer0d7_KjU() : j14;
        long jM2718getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2718getBackground0d7_KjU() : j15;
        long jM2724getOnBackground0d7_KjU = (i2 & Fields.Clip) != 0 ? ColorLightTokens.INSTANCE.m2724getOnBackground0d7_KjU() : j16;
        long jM2752getSurface0d7_KjU = (i2 & Fields.CompositingStrategy) != 0 ? ColorLightTokens.INSTANCE.m2752getSurface0d7_KjU() : j17;
        long jM2735getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2735getOnSurface0d7_KjU() : j18;
        long jM2761getSurfaceVariant0d7_KjU = (i2 & Fields.RenderEffect) != 0 ? ColorLightTokens.INSTANCE.m2761getSurfaceVariant0d7_KjU() : j19;
        long jM2736getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2736getOnSurfaceVariant0d7_KjU() : j20;
        long j39 = (i2 & 524288) != 0 ? j38 : j21;
        long jM2723getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2723getInverseSurface0d7_KjU() : j22;
        long jM2721getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2721getInverseOnSurface0d7_KjU() : j23;
        long jM2719getError0d7_KjU = (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2719getError0d7_KjU() : j24;
        long jM2725getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2725getOnError0d7_KjU() : j25;
        long jM2720getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2720getErrorContainer0d7_KjU() : j26;
        long jM2726getOnErrorContainer0d7_KjU = (i2 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2726getOnErrorContainer0d7_KjU() : j27;
        long jM2741getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m2741getOutline0d7_KjU() : j28;
        long jM2742getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m2742getOutlineVariant0d7_KjU() : j29;
        long jM2747getScrim0d7_KjU = (i2 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m2747getScrim0d7_KjU() : j30;
        long jM2753getSurfaceBright0d7_KjU = (i2 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m2753getSurfaceBright0d7_KjU() : j31;
        long jM2754getSurfaceContainer0d7_KjU = (i2 & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m2754getSurfaceContainer0d7_KjU() : j32;
        long jM2755getSurfaceContainerHigh0d7_KjU = (i2 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m2755getSurfaceContainerHigh0d7_KjU() : j33;
        long jM2756getSurfaceContainerHighest0d7_KjU = (i3 & 1) != 0 ? ColorLightTokens.INSTANCE.m2756getSurfaceContainerHighest0d7_KjU() : j34;
        long jM2757getSurfaceContainerLow0d7_KjU = (i3 & 2) != 0 ? ColorLightTokens.INSTANCE.m2757getSurfaceContainerLow0d7_KjU() : j35;
        long jM2758getSurfaceContainerLowest0d7_KjU = (i3 & 4) != 0 ? ColorLightTokens.INSTANCE.m2758getSurfaceContainerLowest0d7_KjU() : j36;
        if ((i3 & 8) != 0) {
            j37 = ColorLightTokens.INSTANCE.m2759getSurfaceDim0d7_KjU();
        }
        return m1567lightColorSchemeCXl9yA(j38, jM2727getOnPrimary0d7_KjU, jM2744getPrimaryContainer0d7_KjU, jM2728getOnPrimaryContainer0d7_KjU, jM2722getInversePrimary0d7_KjU, jM2748getSecondary0d7_KjU, jM2731getOnSecondary0d7_KjU, jM2749getSecondaryContainer0d7_KjU, jM2732getOnSecondaryContainer0d7_KjU, jM2762getTertiary0d7_KjU, jM2737getOnTertiary0d7_KjU, jM2763getTertiaryContainer0d7_KjU, jM2738getOnTertiaryContainer0d7_KjU, jM2718getBackground0d7_KjU, jM2724getOnBackground0d7_KjU, jM2752getSurface0d7_KjU, jM2735getOnSurface0d7_KjU, jM2761getSurfaceVariant0d7_KjU, jM2736getOnSurfaceVariant0d7_KjU, j39, jM2723getInverseSurface0d7_KjU, jM2721getInverseOnSurface0d7_KjU, jM2719getError0d7_KjU, jM2725getOnError0d7_KjU, jM2720getErrorContainer0d7_KjU, jM2726getOnErrorContainer0d7_KjU, jM2741getOutline0d7_KjU, jM2742getOutlineVariant0d7_KjU, jM2747getScrim0d7_KjU, jM2753getSurfaceBright0d7_KjU, jM2754getSurfaceContainer0d7_KjU, jM2755getSurfaceContainerHigh0d7_KjU, jM2756getSurfaceContainerHighest0d7_KjU, jM2757getSurfaceContainerLow0d7_KjU, jM2758getSurfaceContainerLowest0d7_KjU, j37);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1569lightColorSchemeG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m1568lightColorSchemeCXl9yA$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1570lightColorSchemeG1PFcw$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        long jM2743getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m2743getPrimary0d7_KjU() : j2;
        long jM2727getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m2727getOnPrimary0d7_KjU() : j3;
        long jM2744getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m2744getPrimaryContainer0d7_KjU() : j4;
        long jM2728getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m2728getOnPrimaryContainer0d7_KjU() : j5;
        long jM2722getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m2722getInversePrimary0d7_KjU() : j6;
        long jM2748getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m2748getSecondary0d7_KjU() : j7;
        long jM2731getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m2731getOnSecondary0d7_KjU() : j8;
        long jM2749getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m2749getSecondaryContainer0d7_KjU() : j9;
        long j31 = jM2743getPrimary0d7_KjU;
        long jM2732getOnSecondaryContainer0d7_KjU = (i2 & Fields.RotationX) != 0 ? ColorLightTokens.INSTANCE.m2732getOnSecondaryContainer0d7_KjU() : j10;
        long jM2762getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m2762getTertiary0d7_KjU() : j11;
        long jM2737getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2737getOnTertiary0d7_KjU() : j12;
        long jM2763getTertiaryContainer0d7_KjU = (i2 & Fields.CameraDistance) != 0 ? ColorLightTokens.INSTANCE.m2763getTertiaryContainer0d7_KjU() : j13;
        long jM2738getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2738getOnTertiaryContainer0d7_KjU() : j14;
        long jM2718getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2718getBackground0d7_KjU() : j15;
        long jM2724getOnBackground0d7_KjU = (i2 & Fields.Clip) != 0 ? ColorLightTokens.INSTANCE.m2724getOnBackground0d7_KjU() : j16;
        long jM2752getSurface0d7_KjU = (i2 & Fields.CompositingStrategy) != 0 ? ColorLightTokens.INSTANCE.m2752getSurface0d7_KjU() : j17;
        long jM2735getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2735getOnSurface0d7_KjU() : j18;
        long jM2761getSurfaceVariant0d7_KjU = (i2 & Fields.RenderEffect) != 0 ? ColorLightTokens.INSTANCE.m2761getSurfaceVariant0d7_KjU() : j19;
        long jM2736getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2736getOnSurfaceVariant0d7_KjU() : j20;
        long j32 = (i2 & 524288) != 0 ? j31 : j21;
        long jM2723getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2723getInverseSurface0d7_KjU() : j22;
        long jM2721getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2721getInverseOnSurface0d7_KjU() : j23;
        long jM2719getError0d7_KjU = (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2719getError0d7_KjU() : j24;
        long jM2725getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2725getOnError0d7_KjU() : j25;
        long jM2720getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2720getErrorContainer0d7_KjU() : j26;
        long jM2726getOnErrorContainer0d7_KjU = (i2 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2726getOnErrorContainer0d7_KjU() : j27;
        long jM2741getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m2741getOutline0d7_KjU() : j28;
        long jM2742getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m2742getOutlineVariant0d7_KjU() : j29;
        if ((i2 & 268435456) != 0) {
            j30 = ColorLightTokens.INSTANCE.m2747getScrim0d7_KjU();
        }
        return m1569lightColorSchemeG1PFcw(j31, jM2727getOnPrimary0d7_KjU, jM2744getPrimaryContainer0d7_KjU, jM2728getOnPrimaryContainer0d7_KjU, jM2722getInversePrimary0d7_KjU, jM2748getSecondary0d7_KjU, jM2731getOnSecondary0d7_KjU, jM2749getSecondaryContainer0d7_KjU, jM2732getOnSecondaryContainer0d7_KjU, jM2762getTertiary0d7_KjU, jM2737getOnTertiary0d7_KjU, jM2763getTertiaryContainer0d7_KjU, jM2738getOnTertiaryContainer0d7_KjU, jM2718getBackground0d7_KjU, jM2724getOnBackground0d7_KjU, jM2752getSurface0d7_KjU, jM2735getOnSurface0d7_KjU, jM2761getSurfaceVariant0d7_KjU, jM2736getOnSurfaceVariant0d7_KjU, j32, jM2723getInverseSurface0d7_KjU, jM2721getInverseOnSurface0d7_KjU, jM2719getError0d7_KjU, jM2725getOnError0d7_KjU, jM2720getErrorContainer0d7_KjU, jM2726getOnErrorContainer0d7_KjU, jM2741getOutline0d7_KjU, jM2742getOutlineVariant0d7_KjU, j30);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1571surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f2) {
        if (Dp.m6238equalsimpl0(f2, Dp.m6233constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m3837compositeOverOWjLjI(Color.m3791copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f2 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
