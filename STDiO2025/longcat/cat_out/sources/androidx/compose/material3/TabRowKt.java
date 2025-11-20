package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0094\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0080\u0001\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009a\u0001\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0086\u0001\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0001\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0094\u0001\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001c\u001a\u0080\u0001\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001f\u001a\u0090\u0001\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001an\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a~\u00107\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00106\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "TabRowIndicatorSpec", "PrimaryScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "divider", "Lkotlin/Function0;", "tabs", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowImpl", "ScrollableTabRowImpl-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryTabRow", "SecondaryTabRow-pAZo6Ak", "TabRow", "TabRow-pAZo6Ak", "TabRowImpl", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6233constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final AnimationSpec<Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2224PrimaryScrollableTabRowqhFBPw4(final int r21, androidx.compose.ui.Modifier r22, androidx.compose.foundation.ScrollState r23, long r24, long r26, float r28, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TabIndicatorScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2224PrimaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2225PrimaryTabRowpAZo6Ak(final int r21, androidx.compose.ui.Modifier r22, long r23, long r25, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TabIndicatorScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2225PrimaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2226ScrollableTabRowsKfQg0A(final int r19, androidx.compose.ui.Modifier r20, long r21, long r23, float r25, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2226ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    public static final void m2227ScrollableTabRowImplsKfQg0A(final int i2, final Modifier modifier, final long j2, final long j3, final float f2, final ScrollState scrollState, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3) {
        int i4;
        float f3;
        ScrollState scrollState2;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594140035);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? Fields.RotationX : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? Fields.CameraDistance : 1024;
        }
        if ((i3 & 24576) == 0) {
            f3 = f2;
            i4 |= composerStartRestartGroup.changed(f3) ? Fields.Clip : 8192;
        } else {
            f3 = f2;
        }
        if ((196608 & i3) == 0) {
            scrollState2 = scrollState;
            i4 |= composerStartRestartGroup.changed(scrollState2) ? Fields.RenderEffect : 65536;
        } else {
            scrollState2 = scrollState;
        }
        if ((1572864 & i3) == 0) {
            function32 = function3;
            i4 |= composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
        } else {
            function32 = function3;
        }
        if ((i3 & 12582912) == 0) {
            function23 = function2;
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        } else {
            function23 = function2;
        }
        if ((100663296 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : 33554432;
        }
        if ((i4 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594140035, i4, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:698)");
            }
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState2, false, null, false, 14, null)));
            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33 = function32;
            final float f4 = f3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2176SurfaceT9BRK9s(modifierClipToBounds, null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1556158104, i5, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:710)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3), composer3);
                    }
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                    ScrollState scrollState3 = scrollState;
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollState3, coroutineScope);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) objRememberedValue3;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    Function2<Composer, Integer, Unit> function26 = function24;
                    final Function3<TabIndicatorScope, Composer, Integer, Unit> function34 = function33;
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function25, function26, ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1530560661, i6, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:756)");
                            }
                            function34.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54)});
                    boolean zChanged2 = composer3.changed(f4) | composer3.changed(i2) | composer3.changedInstance(scrollableTabData);
                    final float f5 = f4;
                    final int i6 = i2;
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                            @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo590measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j4) {
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                int i7 = 2;
                                List<? extends Measurable> list4 = list.get(2);
                                final int iMo328roundToPx0680j_4 = measureScope.mo328roundToPx0680j_4(f5);
                                int size = list2.size();
                                int iMo328roundToPx0680j_42 = measureScope.mo328roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), list2.get(i8).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                }
                                final int iIntValue = numValueOf.intValue();
                                int i9 = iMo328roundToPx0680j_4 * 2;
                                long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j4, iMo328roundToPx0680j_42, 0, iIntValue, iIntValue, 2, null);
                                final Ref.FloatRef floatRef = new Ref.FloatRef();
                                floatRef.element = f5;
                                ArrayList arrayList = new ArrayList(list2.size());
                                int size3 = list2.size();
                                int iG = 0;
                                while (iG < size3) {
                                    ArrayList arrayList2 = arrayList;
                                    iG = d.g(list2.get(iG), jM6177copyZbe2FdA$default, arrayList2, iG, 1);
                                    arrayList = arrayList2;
                                }
                                final ArrayList arrayList3 = arrayList;
                                final ArrayList arrayList4 = new ArrayList(size);
                                int iMo328roundToPx0680j_43 = i9;
                                int i10 = 0;
                                while (i10 < size) {
                                    float fM6247unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6231boximpl(TabRowKt.ScrollableTabRowMinimumTabWidth), Dp.m6231boximpl(measureScope.mo331toDpu2uoSUM(((Placeable) arrayList3.get(i10)).getWidth())))).m6247unboximpl();
                                    iMo328roundToPx0680j_43 = measureScope.mo328roundToPx0680j_4(fM6247unboximpl) + iMo328roundToPx0680j_43;
                                    TabPosition tabPosition = new TabPosition(floatRef.element, fM6247unboximpl, ((Dp) ComparisonsKt.maxOf(Dp.m6231boximpl(Dp.m6233constructorimpl(fM6247unboximpl - Dp.m6233constructorimpl(TabKt.getHorizontalTextPadding() * i7))), Dp.m6231boximpl(Dp.m6233constructorimpl(24)))).m6247unboximpl(), null);
                                    floatRef.element = Dp.m6233constructorimpl(floatRef.element + fM6247unboximpl);
                                    arrayList4.add(tabPosition);
                                    i10++;
                                    i7 = 2;
                                }
                                tabRowKt$ScrollableTabRowImpl$1$scope$1$1.setTabPositions(arrayList4);
                                final ArrayList arrayList5 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                int iG2 = 0;
                                while (iG2 < size4) {
                                    iG2 = d.g(list3.get(iG2), Constraints.m6177copyZbe2FdA$default(j4, iMo328roundToPx0680j_43, iMo328roundToPx0680j_43, 0, 0, 8, null), arrayList5, iG2, 1);
                                }
                                int i11 = i6;
                                final ArrayList arrayList6 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                int iG3 = 0;
                                while (iG3 < size5) {
                                    iG3 = d.g(list4.get(iG3), Constraints.m6176copyZbe2FdA(j4, 0, measureScope.mo328roundToPx0680j_4(((TabPosition) arrayList4.get(i11)).getWidth()), 0, iIntValue), arrayList6, iG3, 1);
                                }
                                final float f6 = f5;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i12 = i6;
                                return MeasureScope.layout$default(measureScope, iMo328roundToPx0680j_43, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        Ref.FloatRef floatRef2 = floatRef;
                                        floatRef2.element = f6;
                                        List<Placeable> list5 = arrayList3;
                                        MeasureScope measureScope2 = measureScope;
                                        List<TabPosition> list6 = arrayList4;
                                        int size6 = list5.size();
                                        for (int i13 = 0; i13 < size6; i13++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i13), measureScope2.mo328roundToPx0680j_4(floatRef2.element), 0, 0.0f, 4, null);
                                            floatRef2.element = Dp.m6233constructorimpl(list6.get(i13).getWidth() + floatRef2.element);
                                        }
                                        List<Placeable> list7 = arrayList5;
                                        int i14 = iIntValue;
                                        int size7 = list7.size();
                                        for (int i15 = 0; i15 < size7; i15++) {
                                            Placeable placeable = list7.get(i15);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i14 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list8 = arrayList6;
                                        MeasureScope measureScope3 = measureScope;
                                        List<TabPosition> list9 = arrayList4;
                                        int i16 = i12;
                                        int i17 = iIntValue;
                                        int size8 = list8.size();
                                        for (int i18 = 0; i18 < size8; i18++) {
                                            Placeable placeable2 = list8.get(i18);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Math.max(0, (measureScope3.mo328roundToPx0680j_4(list9.get(i16).getWidth()) - placeable2.getWidth()) / 2), i17 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(measureScope, iMo328roundToPx0680j_4, arrayList4, i12);
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                    boolean zChanged3 = composer3.changed(multiContentMeasurePolicy);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer3);
                    Function2 function2T = d.t(companion3, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    function2CombineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i4 & 896) | 12582912 | (i4 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TabRowKt.m2227ScrollableTabRowImplsKfQg0A(i2, modifier, j2, j3, f2, scrollState, function3, function2, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2228ScrollableTabRowWithSubcomposeImplqhFBPw4(final int r27, final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, long r30, long r32, float r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, final androidx.compose.foundation.ScrollState r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2228ScrollableTabRowWithSubcomposeImplqhFBPw4(int, kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2229SecondaryScrollableTabRowqhFBPw4(final int r21, androidx.compose.ui.Modifier r22, androidx.compose.foundation.ScrollState r23, long r24, long r26, float r28, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TabIndicatorScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2229SecondaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2230SecondaryTabRowpAZo6Ak(final int r21, androidx.compose.ui.Modifier r22, long r23, long r25, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TabIndicatorScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2230SecondaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2231TabRowpAZo6Ak(final int r21, androidx.compose.ui.Modifier r22, long r23, long r25, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2231TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m2232TabRowImplDTcfvLk(Modifier modifier, final long j2, final long j3, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757425411);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j3) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i3, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:570)");
            }
            int i4 = i3 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2176SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-65106680, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:576)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objRememberedValue;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function23 = function22;
                    Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function23, function24, ComposableLambdaKt.rememberComposableLambda(1236693605, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1236693605, i6, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:617)");
                            }
                            function32.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54)});
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                            @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo590measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j4) {
                                MeasureScope measureScope2 = measureScope;
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                int i6 = 2;
                                List<? extends Measurable> list4 = list.get(2);
                                int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j4);
                                int size = list2.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM6186getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    numValueOf = Integer.valueOf(Math.max(list2.get(i7).maxIntrinsicHeight(intRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                ArrayList arrayList = new ArrayList(size);
                                int i8 = 0;
                                while (i8 < size) {
                                    arrayList.add(new TabPosition(Dp.m6233constructorimpl(measureScope2.mo331toDpu2uoSUM(intRef.element) * i8), measureScope2.mo331toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m6231boximpl(Dp.m6233constructorimpl(measureScope2.mo331toDpu2uoSUM(Math.min(list2.get(i8).maxIntrinsicWidth(iIntValue), intRef.element)) - Dp.m6233constructorimpl(TabKt.getHorizontalTextPadding() * i6))), Dp.m6231boximpl(Dp.m6233constructorimpl(24)))).m6247unboximpl(), null));
                                    i8++;
                                    measureScope2 = measureScope;
                                    i6 = 2;
                                }
                                tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                final ArrayList arrayList2 = new ArrayList(list2.size());
                                int size3 = list2.size();
                                int iG = 0;
                                while (iG < size3) {
                                    Measurable measurable = list2.get(iG);
                                    int i9 = intRef.element;
                                    int i10 = iIntValue;
                                    long jM6176copyZbe2FdA = Constraints.m6176copyZbe2FdA(j4, i9, i9, i10, iIntValue);
                                    iIntValue = i10;
                                    iG = d.g(measurable, jM6176copyZbe2FdA, arrayList2, iG, 1);
                                }
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                int iG2 = 0;
                                while (iG2 < size4) {
                                    iG2 = d.g(list3.get(iG2), Constraints.m6177copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null), arrayList3, iG2, 1);
                                }
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                int iG3 = 0;
                                while (iG3 < size5) {
                                    Measurable measurable2 = list4.get(iG3);
                                    int i11 = intRef.element;
                                    int i12 = iIntValue;
                                    iIntValue = i12;
                                    iG3 = d.g(measurable2, Constraints.m6176copyZbe2FdA(j4, i11, i11, 0, i12), arrayList4, iG3, 1);
                                }
                                return MeasureScope.layout$default(measureScope, iM6186getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        List<Placeable> list5 = arrayList2;
                                        Ref.IntRef intRef2 = intRef;
                                        int size6 = list5.size();
                                        for (int i13 = 0; i13 < size6; i13++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i13), i13 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Placeable> list6 = arrayList3;
                                        int i14 = iIntValue;
                                        int size7 = list6.size();
                                        for (int i15 = 0; i15 < size7; i15++) {
                                            Placeable placeable = list6.get(i15);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i14 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list7 = arrayList4;
                                        int i16 = iIntValue;
                                        int size8 = list7.size();
                                        for (int i17 = 0; i17 < size8; i17++) {
                                            Placeable placeable2 = list7.get(i17);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i16 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue2;
                    Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer3);
                    Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    function2CombineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i4 & 896) | 12582912 | (i4 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TabRowKt.m2232TabRowImplDTcfvLk(modifier3, j2, j3, function3, function2, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m2233TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long j2, final long j3, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j3) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i3, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:942)");
            }
            int i4 = i3 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2176SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i5, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:948)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zChanged = composer3.changed(function22) | composer3.changed(function2) | composer3.changed(function3);
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m2241invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m2241invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j4) {
                                final int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j4);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function23);
                                int size = listSubcompose.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM6186getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    numValueOf = Integer.valueOf(Math.max(listSubcompose.get(i6).maxIntrinsicHeight(intRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int iG = 0;
                                for (int size3 = listSubcompose.size(); iG < size3; size3 = size3) {
                                    Measurable measurable = listSubcompose.get(iG);
                                    int i7 = intRef.element;
                                    ArrayList arrayList2 = arrayList;
                                    iG = d.g(measurable, Constraints.m6176copyZbe2FdA(j4, i7, i7, iIntValue, iIntValue), arrayList2, iG, 1);
                                    arrayList = arrayList2;
                                }
                                final ArrayList arrayList3 = arrayList;
                                final ArrayList arrayList4 = new ArrayList(size);
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList4.add(new TabPosition(Dp.m6233constructorimpl(subcomposeMeasureScope.mo331toDpu2uoSUM(intRef.element) * i8), subcomposeMeasureScope.mo331toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m6231boximpl(Dp.m6233constructorimpl(subcomposeMeasureScope.mo331toDpu2uoSUM(Math.min(listSubcompose.get(i8).maxIntrinsicWidth(iIntValue), intRef.element)) - Dp.m6233constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m6231boximpl(Dp.m6233constructorimpl(24)))).m6247unboximpl(), null));
                                }
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iM6186getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        List<Placeable> list = arrayList3;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i9 = 0; i9 < size4; i9++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i9), i9 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function25);
                                        long j5 = j4;
                                        int i10 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i11 = 0; i11 < size5; i11++) {
                                            Placeable placeableMo5120measureBRTryo0 = listSubcompose2.get(i11).mo5120measureBRTryo0(Constraints.m6177copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5120measureBRTryo0, 0, i10 - placeableMo5120measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list2 = arrayList4;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i12) {
                                                if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i12, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:994)");
                                                }
                                                function34.invoke(list2, composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i12 = iM6186getMaxWidthimpl;
                                        int i13 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i14 = 0; i14 < size6; i14++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i14).mo5120measureBRTryo0(Constraints.INSTANCE.m6196fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i4 & 896) | 12582912 | (i4 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TabRowKt.m2233TabRowWithSubcomposeImplDTcfvLk(modifier3, j2, j3, function3, function2, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
