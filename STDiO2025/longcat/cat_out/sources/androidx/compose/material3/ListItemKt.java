package androidx.compose.material3;

import J.d;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
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
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a©\u0001\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001at\u0010'\u001a\u00020\u00172\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001aH\u0003¢\u0006\u0002\u0010-\u001a5\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001a\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aV\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020<2\u0006\u00107\u001a\u0002082\u0006\u00106\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aN\u0010G\u001a\u00020<*\u00020=2\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010S\u001a\u00020<H\u0002\u001an\u0010T\u001a\u00020U*\u00020V2\u0006\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020<2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010\\\u001a\u0004\u0018\u00010Z2\b\u0010]\u001a\u0004\u0018\u00010Z2\b\u0010^\u001a\u0004\u0018\u00010Z2\u0006\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020<H\u0002\u001a\u0014\u0010c\u001a\u00020<*\u00020<2\u0006\u0010d\u001a\u00020<H\u0002\"\u001e\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0007\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u001e\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\u0005\"\u001e\u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u001e\u0010\u0010\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0005\"\u001e\u0010\u0013\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"LeadingContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "getLeadingContentEndPadding$annotations", "()V", "getLeadingContentEndPadding", "()F", "F", "ListItemEndPadding", "getListItemEndPadding$annotations", "getListItemEndPadding", "ListItemStartPadding", "getListItemStartPadding$annotations", "getListItemStartPadding", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "getListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "getListItemVerticalPadding$annotations", "getListItemVerticalPadding", "TrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "getTrailingContentStartPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItemLayout", "leading", "trailing", "headline", "overline", "supporting", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "color", "Landroidx/compose/ui/graphics/Color;", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "verticalPadding", "listItemType", "Landroidx/compose/material3/ListItemType;", "verticalPadding-yh95HIg", "(I)F", "calculateHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "calculateWidth", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "calculateWidth-yeHjK3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "isSupportingMultilineHeuristic", "", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "place", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "isThreeLine", "startPadding", "endPadding", "topPadding", "subtractConstraintSafely", "n", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = Dp.m6233constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = Dp.m6233constructorimpl(12);

    static {
        float f2 = 16;
        ListItemStartPadding = Dp.m6233constructorimpl(f2);
        ListItemEndPadding = Dp.m6233constructorimpl(f2);
        LeadingContentEndPadding = Dp.m6233constructorimpl(f2);
        TrailingContentStartPadding = Dp.m6233constructorimpl(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1828ListItemHXNGIdc(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.ui.Modifier r37, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, androidx.compose.material3.ListItemColors r42, float r43, float r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m1828ListItemHXNGIdc(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2052297037);
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
            i3 |= composerStartRestartGroup.changedInstance(function24) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? Fields.Clip : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i3, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ListItemMeasurePolicy();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) objRememberedValue;
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function23, function24 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1598getLambda1$material3_release() : function24, function25 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1599getLambda2$material3_release() : function25, function2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1600getLambda3$material3_release() : function2, function22 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1601getLambda4$material3_release() : function22});
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2T = d.t(companion3, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt.ListItemLayout.1
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

                public final void invoke(Composer composer2, int i4) {
                    ListItemKt.ListItemLayout(function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m1829ProvideTextStyleFromToken3JVO9M(long j2, final TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        long j3;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133967795);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            j3 = j2;
            function22 = function2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i3, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:657)");
            }
            j3 = j2;
            ProvideContentColorTextStyleKt.m2535ProvideContentColorTextStyle3JVO9M(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 3) & 14), function2, composerStartRestartGroup, i3 & 910);
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
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

                public final void invoke(Composer composer2, int i4) {
                    ListItemKt.m1829ProvideTextStyleFromToken3JVO9M(j4, typographyKeyTokens, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m1834calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        ListItemType.Companion companion = ListItemType.INSTANCE;
        return RangesKt.coerceAtMost(Math.max(Math.max(Constraints.m6187getMinHeightimpl(j2), intrinsicMeasureScope.mo328roundToPx0680j_4(ListItemType.m1841equalsimpl0(i7, companion.m1846getOneLineAlXitO8()) ? ListTokens.INSTANCE.m2943getListItemOneLineContainerHeightD9Ej5fM() : ListItemType.m1841equalsimpl0(i7, companion.m1848getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m2948getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m2945getListItemThreeLineContainerHeightD9Ej5fM())), Math.max(i2, Math.max(i4 + i5 + i6, i3)) + i8), Constraints.m6185getMaxHeightimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m1835calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, long j2) {
        if (Constraints.m6182getHasBoundedWidthimpl(j2)) {
            return Constraints.m6186getMaxWidthimpl(j2);
        }
        return i7 + i2 + Math.max(i4, Math.max(i5, i6)) + i3;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i2) {
        return i2 > density.mo327roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i2, final int i3, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final int i4, final int i5, final int i6) {
        return MeasureScope.layout$default(measureScope, i2, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt.place.1
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
                int iAlign;
                Placeable placeable6 = placeable;
                if (placeable6 != null) {
                    int i7 = i4;
                    boolean z2 = z;
                    int iAlign2 = i6;
                    int i8 = i3;
                    if (!z2) {
                        iAlign2 = Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), i8);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, i7, iAlign2, 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    int i9 = i2;
                    int i10 = i5;
                    boolean z3 = z;
                    int iAlign3 = i6;
                    int i11 = i3;
                    int width = (i9 - i10) - placeable7.getWidth();
                    if (!z3) {
                        iAlign3 = Alignment.INSTANCE.getCenterVertically().align(placeable7.getHeight(), i11);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable7, width, iAlign3, 0.0f, 4, null);
                }
                int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable) + i4;
                if (z) {
                    iAlign = i6;
                } else {
                    iAlign = Alignment.INSTANCE.getCenterVertically().align(TextFieldImplKt.heightOrZero(placeable5) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable3), i3);
                }
                int i12 = iAlign;
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable8, iWidthOrZero, i12, 0.0f, 4, null);
                }
                int iHeightOrZero = i12 + TextFieldImplKt.heightOrZero(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable9, iWidthOrZero, iHeightOrZero, 0.0f, 4, null);
                }
                int iHeightOrZero2 = iHeightOrZero + TextFieldImplKt.heightOrZero(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable10, iWidthOrZero, iHeightOrZero2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int subtractConstraintSafely(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m1836verticalPaddingyh95HIg(int i2) {
        return ListItemType.m1841equalsimpl0(i2, ListItemType.INSTANCE.m1847getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }
}
