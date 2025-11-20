package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001ab\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00140\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aq\u0010$\u001a\u00020\u00142\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010&¢\u0006\u0002\b 2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0&H\u0003¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010/\u001a\u00020\u0014*\u00020\u001f2\u0006\u00100\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u00102\u001a\u00020+2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010&¢\u0006\u0002\b 2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0002\u00107\u001a8\u00108\u001a\u000209*\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001aP\u0010C\u001a\u000209*\u00020:2\u0006\u0010D\u001a\u00020<2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\n\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\n\u0010H\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "()F", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationBarHeight", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemLayout", NavigationBarKt.IndicatorRippleLayoutIdTag, "Lkotlin/Function0;", NavigationBarKt.IndicatorLayoutIdTag, NavigationBarKt.IconLayoutIdTag, NavigationBarKt.LabelLayoutIdTag, "alwaysShowLabel", "", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NavigationBarItem", "selected", "onClick", "enabled", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "iconColor", "textColor", "itemWidth"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight;
    private static final float NavigationBarIndicatorToLabelPadding;
    private static final float NavigationBarItemHorizontalPadding;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m2953getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = Dp.m6233constructorimpl(8);
        NavigationBarIndicatorToLabelPadding = Dp.m6233constructorimpl(4);
        float f2 = 2;
        IndicatorHorizontalPadding = Dp.m6233constructorimpl(Dp.m6233constructorimpl(navigationBarTokens.m2951getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m2954getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPadding = Dp.m6233constructorimpl(Dp.m6233constructorimpl(navigationBarTokens.m2950getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m2954getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalOffset = Dp.m6233constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1906NavigationBarHsRjFd4(androidx.compose.ui.Modifier r23, long r24, long r26, float r28, androidx.compose.foundation.layout.WindowInsets r29, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m1906NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationBarItem(final androidx.compose.foundation.layout.RowScope r29, final boolean r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.ui.Modifier r33, boolean r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, boolean r36, androidx.compose.material3.NavigationBarItemColors r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationBarItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final Function0<Float> function0, Composer composer, final int i2) {
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427075886);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427075886, i3, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:516)");
            }
            int i4 = 458752 & i3;
            int i5 = 57344 & i3;
            boolean z2 = (i4 == 131072) | ((i3 & 7168) == 2048) | (i5 == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        Measurable measurable;
                        Placeable placeableMo5120measureBRTryo0;
                        MeasureScope measureScope2 = measureScope;
                        float fFloatValue = function0.invoke().floatValue();
                        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Measurable measurable2 = list.get(i6);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable placeableMo5120measureBRTryo02 = measurable2.mo5120measureBRTryo0(jM6177copyZbe2FdA$default);
                                float f2 = 2;
                                int iMo328roundToPx0680j_4 = measureScope2.mo328roundToPx0680j_4(Dp.m6233constructorimpl(NavigationBarKt.IndicatorHorizontalPadding * f2)) + placeableMo5120measureBRTryo02.getWidth();
                                int iRoundToInt = MathKt.roundToInt(iMo328roundToPx0680j_4 * fFloatValue);
                                int iMo328roundToPx0680j_42 = measureScope2.mo328roundToPx0680j_4(Dp.m6233constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f2)) + placeableMo5120measureBRTryo02.getHeight();
                                int size2 = list.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Measurable measurable3 = list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable placeableMo5120measureBRTryo03 = measurable3.mo5120measureBRTryo0(Constraints.INSTANCE.m6196fixedJhjzzOo(iMo328roundToPx0680j_4, iMo328roundToPx0680j_42));
                                        int size3 = list.size();
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i8);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i8++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable placeableMo5120measureBRTryo04 = measurable4 != null ? measurable4.mo5120measureBRTryo0(Constraints.INSTANCE.m6196fixedJhjzzOo(iRoundToInt, iMo328roundToPx0680j_42)) : null;
                                        if (function25 != null) {
                                            int size4 = list.size();
                                            for (int i9 = 0; i9 < size4; i9++) {
                                                Measurable measurable5 = list.get(i9);
                                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                                    placeableMo5120measureBRTryo0 = measurable5.mo5120measureBRTryo0(jM6177copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableMo5120measureBRTryo0 = null;
                                        if (function25 == null) {
                                            return NavigationBarKt.m1909placeIconX9ElhV4(measureScope2, placeableMo5120measureBRTryo02, placeableMo5120measureBRTryo03, placeableMo5120measureBRTryo04, j2);
                                        }
                                        Intrinsics.checkNotNull(placeableMo5120measureBRTryo0);
                                        return NavigationBarKt.m1910placeLabelAndIconzUg2_y0(measureScope, placeableMo5120measureBRTryo0, placeableMo5120measureBRTryo02, placeableMo5120measureBRTryo03, placeableMo5120measureBRTryo04, j2, z, fFloatValue);
                                    }
                                    i7++;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i6++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            int i6 = i3;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i6 & 14));
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T2 = d.t(companion2, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
            if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
            }
            Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function23.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1087198243);
            if (function24 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z3 = (i5 == 16384) | (i4 == 131072);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z ? 1.0f : function0.invoke().floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM644paddingVpY3zN4$default = PaddingKt.m644paddingVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId2, (Function1) objRememberedValue2), Dp.m6233constructorimpl(NavigationBarItemHorizontalPadding / 2), 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM644paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T3 = d.t(companion2, composerM3285constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3285constructorimpl3, currentCompositionLocalMap3);
                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    d.v(currentCompositeKeyHash3, composerM3285constructorimpl3, currentCompositeKeyHash3, function2T3);
                }
                Updater.m3292setimpl(composerM3285constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                function25 = function24;
                d.x(composerStartRestartGroup, (i6 >> 9) & 14, function25);
            } else {
                function25 = function24;
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItemLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    NavigationBarKt.NavigationBarItemLayout(function2, function22, function23, function25, z, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m1909placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        final int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
        final int iM6202constrainHeightK40F9xA = ConstraintsKt.m6202constrainHeightK40F9xA(j2, measureScope.mo328roundToPx0680j_4(NavigationBarHeight));
        final int iC = d.C(placeable, iM6186getMaxWidthimpl, 2);
        final int iH = d.h(placeable, iM6202constrainHeightK40F9xA, 2);
        final int iC2 = d.C(placeable2, iM6186getMaxWidthimpl, 2);
        final int iH2 = d.h(placeable2, iM6202constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM6186getMaxWidthimpl, iM6202constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, d.C(placeable4, iM6186getMaxWidthimpl, 2), d.h(placeable4, iM6202constrainHeightK40F9xA, 2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, iC, iH, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, iC2, iH2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m1910placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, final boolean z, final float f2) {
        float height = placeable2.getHeight();
        float f3 = IndicatorVerticalPadding;
        float fMo334toPx0680j_4 = measureScope.mo334toPx0680j_4(f3) + height;
        float f4 = NavigationBarIndicatorToLabelPadding;
        float fMo334toPx0680j_42 = measureScope.mo334toPx0680j_4(f4) + fMo334toPx0680j_4 + placeable.getHeight();
        float f5 = 2;
        final float fCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6187getMinHeightimpl(j2) - fMo334toPx0680j_42) / f5, measureScope.mo334toPx0680j_4(f3));
        float f6 = (fCoerceAtLeast * f5) + fMo334toPx0680j_42;
        final float height2 = (1 - f2) * ((z ? fCoerceAtLeast : (f6 - placeable2.getHeight()) / f5) - fCoerceAtLeast);
        final float fMo334toPx0680j_43 = measureScope.mo334toPx0680j_4(f4) + measureScope.mo334toPx0680j_4(f3) + placeable2.getHeight() + fCoerceAtLeast;
        final int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
        final int iC = d.C(placeable, iM6186getMaxWidthimpl, 2);
        final int iC2 = d.C(placeable2, iM6186getMaxWidthimpl, 2);
        final int iC3 = d.C(placeable3, iM6186getMaxWidthimpl, 2);
        final float fMo334toPx0680j_44 = fCoerceAtLeast - measureScope.mo334toPx0680j_4(f3);
        return MeasureScope.layout$default(measureScope, iM6186getMaxWidthimpl, MathKt.roundToInt(f6), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i2 = iM6186getMaxWidthimpl;
                    float f7 = fCoerceAtLeast;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, d.C(placeable5, i2, 2), MathKt.roundToInt((f7 - measureScope2.mo328roundToPx0680j_4(NavigationBarKt.getIndicatorVerticalPadding())) + height2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                if (z || f2 != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, iC, MathKt.roundToInt(fMo334toPx0680j_43 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, iC2, MathKt.roundToInt(fCoerceAtLeast + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, iC3, MathKt.roundToInt(fMo334toPx0680j_44 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
