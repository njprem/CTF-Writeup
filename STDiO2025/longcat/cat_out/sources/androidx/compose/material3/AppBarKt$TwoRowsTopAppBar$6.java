package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ float $collapsedHeight;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ Ref.IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TwoRowsTopAppBar$6(WindowInsets windowInsets, float f2, TopAppBarColors topAppBarColors, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f3, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, float f4, TopAppBarScrollBehavior topAppBarScrollBehavior, Function2<? super Composer, ? super Integer, Unit> function24, TextStyle textStyle2, float f5, Ref.IntRef intRef, boolean z2) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$collapsedHeight = f2;
        this.$colors = topAppBarColors;
        this.$smallTitle = function2;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f3;
        this.$hideTopRowSemantics = z;
        this.$navigationIcon = function22;
        this.$actionsRow = function23;
        this.$expandedHeight = f4;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = function24;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f5;
        this.$titleBottomPaddingPx = intRef;
        this.$hideBottomRowSemantics = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$3$lambda$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$3$lambda$2$lambda$1(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        TopAppBarState state;
        if (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

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
            ComposerKt.traceEventStart(-1350062619, i2, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
        }
        WindowInsets windowInsets = this.$windowInsets;
        float f2 = this.$collapsedHeight;
        TopAppBarColors topAppBarColors = this.$colors;
        Function2<Composer, Integer, Unit> function2 = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f3 = this.$topTitleAlpha;
        boolean z = this.$hideTopRowSemantics;
        Function2<Composer, Integer, Unit> function22 = this.$navigationIcon;
        Function2<Composer, Integer, Unit> function23 = this.$actionsRow;
        float f4 = this.$expandedHeight;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        Function2<Composer, Integer, Unit> function24 = this.$title;
        TextStyle textStyle2 = this.$titleTextStyle;
        float f5 = this.$bottomTitleAlpha;
        Ref.IntRef intRef = this.$titleBottomPaddingPx;
        boolean z2 = this.$hideBottomRowSemantics;
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer);
        Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
        }
        Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AppBarKt.m1407TopAppBarLayoutkXwM9vE(SizeKt.m675heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), 0.0f, f2, 1, null), new b(), topAppBarColors.getNavigationIconContentColor(), topAppBarColors.getTitleContentColor(), topAppBarColors.getActionIconContentColor(), function2, textStyle, f3, arrangement.getCenter(), arrangement.getStart(), 0, z, function22, function23, composer, 905969712, 3078);
        int i3 = 1;
        Modifier modifierM675heightInVpY3zN4$default = SizeKt.m675heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, WindowInsetsKt.m713onlybOOhFvg(windowInsets, WindowInsetsSides.INSTANCE.m735getHorizontalJoeWqyM()))), 0.0f, Dp.m6233constructorimpl(f4 - f2), 1, null);
        boolean zChanged = composer.changed(topAppBarScrollBehavior);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(topAppBarScrollBehavior, i3);
            composer.updateRememberedValue(objRememberedValue);
        }
        long jM2486getNavigationIconContentColor0d7_KjU = topAppBarColors.getNavigationIconContentColor();
        long jM2488getTitleContentColor0d7_KjU = topAppBarColors.getTitleContentColor();
        long jM2484getActionIconContentColor0d7_KjU = topAppBarColors.getActionIconContentColor();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i4 = intRef.element;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        AppBarKt.m1407TopAppBarLayoutkXwM9vE(modifierM675heightInVpY3zN4$default, (ScrolledOffset) objRememberedValue, jM2486getNavigationIconContentColor0d7_KjU, jM2488getTitleContentColor0d7_KjU, jM2484getActionIconContentColor0d7_KjU, function24, textStyle2, f5, bottom, start, i4, z2, composableSingletons$AppBarKt.m1580getLambda17$material3_release(), composableSingletons$AppBarKt.m1581getLambda18$material3_release(), composer, 905969664, 3456);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
