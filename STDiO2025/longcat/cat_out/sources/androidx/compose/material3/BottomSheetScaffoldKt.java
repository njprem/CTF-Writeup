package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
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
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008a\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u008e\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u008d\u0001\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020(2\b\b\u0002\u00106\u001a\u00020\u001bH\u0007¢\u0006\u0002\u00107\u001a7\u00108\u001a\u00020(2\b\b\u0002\u00109\u001a\u00020:2\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0002\u0010<\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "sheetPeekHeight", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetContainerColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "sheetDragHandle", "Lkotlin/Function0;", "sheetSwipeEnabled", "", "topBar", "snackbarHost", "Landroidx/compose/material3/SnackbarHostState;", "containerColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-sdMYb0k", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldLayout", "body", "bottomSheet", "sheetOffset", "", "sheetState", "Landroidx/compose/material3/SheetState;", "BottomSheetScaffoldLayout-2E65NiM", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "StandardBottomSheet", "state", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-w7I5h1o", "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberBottomSheetScaffoldState", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "rememberStandardBottomSheetState", "initialValue", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "skipHiddenState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1427BottomSheetScaffoldsdMYb0k(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.ui.Modifier r35, androidx.compose.material3.BottomSheetScaffoldState r36, float r37, float r38, androidx.compose.ui.graphics.Shape r39, long r40, long r42, float r44, float r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, boolean r47, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, long r50, long r52, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m1427BottomSheetScaffoldsdMYb0k(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, float, androidx.compose.ui.graphics.Shape, long, long, float, float, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-2E65NiM, reason: not valid java name */
    public static final void m1428BottomSheetScaffoldLayout2E65NiM(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function0<Float> function0, final SheetState sheetState, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651214892);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j3) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651214892, i3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1592getLambda3$material3_release() : function2, ComposableLambdaKt.rememberComposableLambda(398963586, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
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
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398963586, i4, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                    }
                    SurfaceKt.m2176SurfaceT9BRK9s(modifier, null, j2, j3, 0.0f, 0.0f, null, function22, composer2, 0, 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), function23, function24});
            boolean z = ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo590measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j4) {
                        Integer numValueOf;
                        List<? extends Measurable> list2 = list.get(0);
                        int i4 = 1;
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        final int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j4);
                        final int iM6185getMaxHeightimpl = Constraints.m6185getMaxHeightimpl(j4);
                        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        int iG = 0;
                        while (iG < size) {
                            ArrayList arrayList2 = arrayList;
                            iG = d.g(list4.get(iG), jM6177copyZbe2FdA$default, arrayList2, iG, 1);
                            size = size;
                            arrayList = arrayList2;
                        }
                        final ArrayList arrayList3 = arrayList;
                        final ArrayList arrayList4 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int iG2 = 0; iG2 < size2; iG2 = d.g(list2.get(iG2), jM6177copyZbe2FdA$default, arrayList4, iG2, 1)) {
                        }
                        if (arrayList4.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList4.get(0)).getHeight());
                            int lastIndex = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList4.get(i4)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i4 == lastIndex) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jM6177copyZbe2FdA$default2 = Constraints.m6177copyZbe2FdA$default(jM6177copyZbe2FdA$default, 0, 0, 0, iM6185getMaxHeightimpl - iIntValue, 7, null);
                        final ArrayList arrayList5 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int iG3 = 0; iG3 < size3; iG3 = d.g(list3.get(iG3), jM6177copyZbe2FdA$default2, arrayList5, iG3, 1)) {
                        }
                        final ArrayList arrayList6 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int iG4 = 0; iG4 < size4; iG4 = d.g(list5.get(iG4), jM6177copyZbe2FdA$default, arrayList6, iG4, 1)) {
                        }
                        final SheetState sheetState2 = sheetState;
                        final Function0<Float> function02 = function0;
                        return MeasureScope.layout$default(measureScope, iM6186getMaxWidthimpl, iM6185getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[SheetValue.values().length];
                                    try {
                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[SheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[SheetValue.Hidden.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

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
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iRoundToInt;
                                List<Placeable> list6 = arrayList3;
                                Integer numValueOf5 = null;
                                if (list6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(list6.get(0).getWidth());
                                    int lastIndex2 = CollectionsKt.getLastIndex(list6);
                                    if (1 <= lastIndex2) {
                                        int i5 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(list6.get(i5).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i5 == lastIndex2) {
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                }
                                int iMax = Integer.max(0, (iM6186getMaxWidthimpl - (numValueOf3 != null ? numValueOf3.intValue() : 0)) / 2);
                                List<Placeable> list7 = arrayList6;
                                if (list7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(list7.get(0).getWidth());
                                    int lastIndex3 = CollectionsKt.getLastIndex(list7);
                                    if (1 <= lastIndex3) {
                                        int i6 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(list7.get(i6).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i6 == lastIndex3) {
                                                break;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue2 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                                List<Placeable> list8 = arrayList6;
                                if (!list8.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(list8.get(0).getHeight());
                                    int lastIndex4 = CollectionsKt.getLastIndex(list8);
                                    if (1 <= lastIndex4) {
                                        int i7 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(list8.get(i7).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i7 == lastIndex4) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue3 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i8 = (iM6186getMaxWidthimpl - iIntValue2) / 2;
                                int i9 = WhenMappings.$EnumSwitchMapping$0[sheetState2.getCurrentValue().ordinal()];
                                if (i9 == 1) {
                                    iRoundToInt = MathKt.roundToInt(function02.invoke().floatValue());
                                } else {
                                    if (i9 != 2 && i9 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iRoundToInt = iM6185getMaxHeightimpl;
                                }
                                int i10 = iRoundToInt - iIntValue3;
                                List<Placeable> list9 = arrayList5;
                                int i11 = iIntValue;
                                int size5 = list9.size();
                                for (int i12 = 0; i12 < size5; i12++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list9.get(i12), 0, i11, 0.0f, 4, null);
                                }
                                List<Placeable> list10 = arrayList4;
                                int size6 = list10.size();
                                for (int i13 = 0; i13 < size6; i13++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list10.get(i13), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list11 = arrayList3;
                                int size7 = list11.size();
                                for (int i14 = 0; i14 < size7; i14++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list11.get(i14), iMax, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list12 = arrayList6;
                                int size8 = list12.size();
                                for (int i15 = 0; i15 < size8; i15++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list12.get(i15), i8, i10, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
            boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
            function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
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
                    BottomSheetScaffoldKt.m1428BottomSheetScaffoldLayout2E65NiM(modifier, function2, function22, function23, function24, function0, sheetState, j2, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    public static final void m1429StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f2, final float f3, final boolean z, final Shape shape, final long j2, final long j3, final float f4, final float f5, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        CoroutineScope coroutineScope;
        int i6;
        Object obj;
        Modifier modifierNestedScroll$default;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(721467526);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f3) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(f5) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(721467526, i4, i5, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            Orientation orientation = Orientation.Vertical;
            final float fMo334toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(f2);
            composerStartRestartGroup.startReplaceGroup(-1831611516);
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChanged = composerStartRestartGroup.changed(sheetState.getAnchoredDraggableState$material3_release());
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    i6 = i4;
                } else {
                    i6 = i4;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    coroutineScope = coroutineScope2;
                    obj = null;
                    modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                }
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new Function1<Float, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(SheetState sheetState, float f2, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$state = sheetState;
                            this.$it = f2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$state, this.$it, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                SheetState sheetState = this.$state;
                                float f2 = this.$it;
                                this.label = 1;
                                if (sheetState.settle$material3_release(f2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f6) {
                        invoke(f6.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f6) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(sheetState, f6, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                coroutineScope = coroutineScope2;
                obj = null;
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
            } else {
                coroutineScope = coroutineScope2;
                i6 = i4;
                obj = null;
                modifierNestedScroll$default = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.m678requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m694widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, f3, 1, obj), 0.0f, 1, obj), f2, 0.0f, 2, obj).then(modifierNestedScroll$default);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
            boolean zChanged2 = ((i6 & 14) == 4) | composerStartRestartGroup.changed(fMo334toPx0680j_4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                        return m1432invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r4
                      0x003c: PHI (r4v6 androidx.compose.material3.SheetValue) = 
                      (r4v5 androidx.compose.material3.SheetValue)
                      (r4v7 androidx.compose.material3.SheetValue)
                      (r4v8 androidx.compose.material3.SheetValue)
                      (r4v9 androidx.compose.material3.SheetValue)
                      (r4v10 androidx.compose.material3.SheetValue)
                      (r4v11 androidx.compose.material3.SheetValue)
                      (r4v12 androidx.compose.material3.SheetValue)
                     binds: [B:29:0x0077, B:20:0x005c, B:23:0x0065, B:26:0x006e, B:9:0x003a, B:12:0x0044, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final kotlin.Pair<androidx.compose.material3.internal.DraggableAnchors<androidx.compose.material3.SheetValue>, androidx.compose.material3.SheetValue> m1432invokeGpV2Q24(long r2, long r4) {
                        /*
                            r1 = this;
                            int r4 = androidx.compose.ui.unit.Constraints.m6185getMaxHeightimpl(r4)
                            float r4 = (float) r4
                            int r2 = androidx.compose.ui.unit.IntSize.m6402getHeightimpl(r2)
                            float r2 = (float) r2
                            androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1 r3 = new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1
                            androidx.compose.material3.SheetState r5 = r1
                            float r0 = r2
                            r3.<init>()
                            androidx.compose.material3.internal.DraggableAnchors r2 = androidx.compose.material3.internal.AnchoredDraggableKt.DraggableAnchors(r3)
                            androidx.compose.material3.SheetState r3 = r1
                            androidx.compose.material3.internal.AnchoredDraggableState r3 = r3.getAnchoredDraggableState$material3_release()
                            java.lang.Object r3 = r3.getTargetValue()
                            androidx.compose.material3.SheetValue r3 = (androidx.compose.material3.SheetValue) r3
                            int[] r4 = androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.WhenMappings.$EnumSwitchMapping$0
                            int r5 = r3.ordinal()
                            r4 = r4[r5]
                            r5 = 1
                            if (r4 == r5) goto L71
                            r5 = 2
                            if (r4 == r5) goto L56
                            r5 = 3
                            if (r4 != r5) goto L50
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Expanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L3e
                        L3c:
                            r3 = r4
                            goto L7a
                        L3e:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.PartiallyExpanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L47
                            goto L3c
                        L47:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L7a
                            goto L3c
                        L50:
                            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                            r2.<init>()
                            throw r2
                        L56:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.PartiallyExpanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L5f
                            goto L3c
                        L5f:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Expanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L68
                            goto L3c
                        L68:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L7a
                            goto L3c
                        L71:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L7a
                            goto L3c
                        L7a:
                            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.m1432invokeGpV2Q24(long, long):kotlin.Pair");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final CoroutineScope coroutineScope3 = coroutineScope;
            int i7 = i6 >> 9;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2176SurfaceT9BRK9s(AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifierThen, anchoredDraggableState$material3_release, orientation, (Function2) objRememberedValue3), sheetState.getAnchoredDraggableState$material3_release(), orientation, z, false, null, 24, null), shape, j2, j3, f4, f5, null, ComposableLambdaKt.rememberComposableLambda(390720907, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2
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

                public final void invoke(Composer composer3, int i8) {
                    ComposeUiNode.Companion companion3;
                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(390720907, i8, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    final SheetState sheetState2 = sheetState;
                    final boolean z2 = z;
                    final CoroutineScope coroutineScope4 = coroutineScope3;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
                    Function2 function2T = d.t(companion6, composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1168080147);
                    if (function22 != null) {
                        Strings.Companion companion7 = Strings.INSTANCE;
                        final String strM2607getString2EP1pXo = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer3, 0);
                        final String strM2607getString2EP1pXo2 = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                        final String strM2607getString2EP1pXo3 = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer3, 0);
                        Modifier modifierAlign = columnScopeInstance.align(companion4, companion5.getCenterHorizontally());
                        boolean zChanged3 = composer3.changed(sheetState2) | composer3.changed(z2) | composer3.changed(strM2607getString2EP1pXo3) | composer3.changedInstance(coroutineScope4) | composer3.changed(strM2607getString2EP1pXo) | composer3.changed(strM2607getString2EP1pXo2);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            companion3 = companion6;
                            Object obj2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    final SheetState sheetState3 = sheetState2;
                                    boolean z3 = z2;
                                    String str = strM2607getString2EP1pXo3;
                                    String str2 = strM2607getString2EP1pXo;
                                    String str3 = strM2607getString2EP1pXo2;
                                    final CoroutineScope coroutineScope5 = coroutineScope4;
                                    if (sheetState3.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z3) {
                                        return;
                                    }
                                    SheetValue currentValue = sheetState3.getCurrentValue();
                                    SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                    if (currentValue == sheetValue) {
                                        if (sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1

                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1, reason: invalid class name */
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ SheetState $this_with;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$this_with, continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i2 = this.label;
                                                        if (i2 == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            SheetState sheetState = this.$this_with;
                                                            this.label = 1;
                                                            if (sheetState.expand(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i2 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                                    return Boolean.TRUE;
                                                }
                                            });
                                        }
                                    } else if (sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue).booleanValue()) {
                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2

                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1, reason: invalid class name */
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$this_with, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i2 = this.label;
                                                    if (i2 == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        SheetState sheetState = this.$this_with;
                                                        this.label = 1;
                                                        if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i2 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                    if (sheetState3.getSkipHiddenState()) {
                                        return;
                                    }
                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3

                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1", f = "BottomSheetScaffold.kt", i = {}, l = {327}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1, reason: invalid class name */
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ SheetState $this_with;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$this_with = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$this_with, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i2 = this.label;
                                                if (i2 == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    SheetState sheetState = this.$this_with;
                                                    this.label = 1;
                                                    if (sheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i2 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                            return Boolean.TRUE;
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(obj2);
                            objRememberedValue4 = obj2;
                        } else {
                            companion3 = companion6;
                        }
                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (Function1) objRememberedValue4);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                        Function2 function2T2 = d.t(companion3, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
                        }
                        Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        d.x(composer3, 0, function22);
                    }
                    composer3.endReplaceGroup();
                    function32.invoke(columnScopeInstance, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
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

                public final void invoke(Composer composer3, int i8) {
                    BottomSheetScaffoldKt.m1429StandardBottomSheetw7I5h1o(sheetState, f2, f3, z, shape, j2, j3, f4, f5, function2, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            sheetState = rememberStandardBottomSheetState(null, null, false, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i2, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer2.changed(sheetState)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer2.changed(snackbarHostState)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue2 = composer2.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i3 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue3) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if ((i3 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i2, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, function12, sheetValue2, z2, composer, (i2 & 112) | ((i2 << 6) & 896) | ((i2 << 3) & 7168), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }
}
