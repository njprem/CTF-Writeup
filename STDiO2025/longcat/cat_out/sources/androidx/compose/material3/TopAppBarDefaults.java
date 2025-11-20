package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u001f\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000104H\u0007¢\u0006\u0002\u00105JK\u00106\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000104H\u0007¢\u0006\u0002\u00105J\r\u00107\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u00107\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010(J\r\u00109\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u00109\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010(J'\u0010;\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0007¢\u0006\u0002\u0010<J\r\u0010=\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u0010=\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010(R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u001d\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "()V", "LargeAppBarCollapsedHeight", "Landroidx/compose/ui/unit/Dp;", "getLargeAppBarCollapsedHeight-D9Ej5fM", "()F", "F", "LargeAppBarExpandedHeight", "getLargeAppBarExpandedHeight-D9Ej5fM", "MediumAppBarCollapsedHeight", "getMediumAppBarCollapsedHeight-D9Ej5fM", "MediumAppBarExpandedHeight", "getMediumAppBarExpandedHeight-D9Ej5fM", "TopAppBarExpandedHeight", "getTopAppBarExpandedHeight-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "defaultCenterAlignedTopAppBarColors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCenterAlignedTopAppBarColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultLargeTopAppBarColors", "getDefaultLargeTopAppBarColors$material3_release", "defaultMediumTopAppBarColors", "getDefaultMediumTopAppBarColors$material3_release", "defaultTopAppBarColors", "getDefaultTopAppBarColors$material3_release", "centerAlignedTopAppBarColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "centerAlignedTopAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "enterAlwaysScrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "state", "Landroidx/compose/material3/TopAppBarState;", "canScroll", "Lkotlin/Function0;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "exitUntilCollapsedScrollBehavior", "largeTopAppBarColors", "largeTopAppBarColors-zjMxDiM", "mediumTopAppBarColors", "mediumTopAppBarColors-zjMxDiM", "pinnedScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "topAppBarColors", "topAppBarColors-zjMxDiM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();
    private static final float LargeAppBarCollapsedHeight;
    private static final float LargeAppBarExpandedHeight;
    private static final float MediumAppBarCollapsedHeight;
    private static final float MediumAppBarExpandedHeight;
    private static final float TopAppBarExpandedHeight;

    static {
        TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
        TopAppBarExpandedHeight = topAppBarSmallTokens.m3199getContainerHeightD9Ej5fM();
        MediumAppBarCollapsedHeight = topAppBarSmallTokens.m3199getContainerHeightD9Ej5fM();
        MediumAppBarExpandedHeight = TopAppBarMediumTokens.INSTANCE.m3189getContainerHeightD9Ej5fM();
        LargeAppBarCollapsedHeight = topAppBarSmallTokens.m3199getContainerHeightD9Ej5fM();
        LargeAppBarExpandedHeight = TopAppBarLargeTokens.INSTANCE.m3185getContainerHeightD9Ej5fM();
    }

    private TopAppBarDefaults() {
    }

    public final TopAppBarColors centerAlignedTopAppBarColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, i2, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)");
        }
        TopAppBarColors defaultCenterAlignedTopAppBarColors$material3_release = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCenterAlignedTopAppBarColors$material3_release;
    }

    /* renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2489centerAlignedTopAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i2, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1056)");
        }
        TopAppBarColors topAppBarColorsM2483copyt635Npw = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2483copyt635Npw(jM3828getUnspecified0d7_KjU, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColorsM2483copyt635Npw;
    }

    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i3 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i3 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i3 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i2, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterAlwaysScrollBehavior;
    }

    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i3 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i3 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i3 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i2, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitUntilCollapsedScrollBehavior;
    }

    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultCenterAlignedTopAppBarColorsCached = colorScheme.getDefaultCenterAlignedTopAppBarColorsCached();
        if (defaultCenterAlignedTopAppBarColorsCached != null) {
            return defaultCenterAlignedTopAppBarColorsCached;
        }
        TopAppBarSmallCenteredTokens topAppBarSmallCenteredTokens = TopAppBarSmallCenteredTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultLargeTopAppBarColorsCached = colorScheme.getDefaultLargeTopAppBarColorsCached();
        if (defaultLargeTopAppBarColorsCached != null) {
            return defaultLargeTopAppBarColorsCached;
        }
        TopAppBarLargeTokens topAppBarLargeTokens = TopAppBarLargeTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultLargeTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultMediumTopAppBarColorsCached = colorScheme.getDefaultMediumTopAppBarColorsCached();
        if (defaultMediumTopAppBarColorsCached != null) {
            return defaultMediumTopAppBarColorsCached;
        }
        TopAppBarMediumTokens topAppBarMediumTokens = TopAppBarMediumTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultMediumTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultTopAppBarColorsCached = colorScheme.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached != null) {
            return defaultTopAppBarColorsCached;
        }
        TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    /* renamed from: getLargeAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2490getLargeAppBarCollapsedHeightD9Ej5fM() {
        return LargeAppBarCollapsedHeight;
    }

    /* renamed from: getLargeAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2491getLargeAppBarExpandedHeightD9Ej5fM() {
        return LargeAppBarExpandedHeight;
    }

    /* renamed from: getMediumAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2492getMediumAppBarCollapsedHeightD9Ej5fM() {
        return MediumAppBarCollapsedHeight;
    }

    /* renamed from: getMediumAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2493getMediumAppBarExpandedHeightD9Ej5fM() {
        return MediumAppBarExpandedHeight;
    }

    /* renamed from: getTopAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2494getTopAppBarExpandedHeightD9Ej5fM() {
        return TopAppBarExpandedHeight;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i2, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsM713onlybOOhFvg = WindowInsetsKt.m713onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m725plusgK_yJZ4(companion.m735getHorizontalJoeWqyM(), companion.m739getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM713onlybOOhFvg;
    }

    public final TopAppBarColors largeTopAppBarColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744932393, i2, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
        }
        TopAppBarColors defaultLargeTopAppBarColors$material3_release = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultLargeTopAppBarColors$material3_release;
    }

    /* renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2495largeTopAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i2, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1157)");
        }
        TopAppBarColors topAppBarColorsM2483copyt635Npw = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2483copyt635Npw(jM3828getUnspecified0d7_KjU, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColorsM2483copyt635Npw;
    }

    public final TopAppBarColors mediumTopAppBarColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1268886463, i2, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1085)");
        }
        TopAppBarColors defaultMediumTopAppBarColors$material3_release = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultMediumTopAppBarColors$material3_release;
    }

    /* renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2496mediumTopAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i2, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1107)");
        }
        TopAppBarColors topAppBarColorsM2483copyt635Npw = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2483copyt635Npw(jM3828getUnspecified0d7_KjU, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColorsM2483copyt635Npw;
    }

    public final TopAppBarScrollBehavior pinnedScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i3 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i2, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1194)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pinnedScrollBehavior;
    }

    public final TopAppBarColors topAppBarColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, i2, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        TopAppBarColors defaultTopAppBarColors$material3_release = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTopAppBarColors$material3_release;
    }

    /* renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2497topAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM3828getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM3828getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j3;
        long jM3828getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4;
        long jM3828getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        long jM3828getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i2, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
        }
        TopAppBarColors topAppBarColorsM2483copyt635Npw = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2483copyt635Npw(jM3828getUnspecified0d7_KjU, jM3828getUnspecified0d7_KjU2, jM3828getUnspecified0d7_KjU3, jM3828getUnspecified0d7_KjU4, jM3828getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColorsM2483copyt635Npw;
    }
}
