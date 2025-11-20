package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a±\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0087\u0001\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000e2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0002\b\t2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = Dp.m6233constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2041ScaffoldTvnljyQ(androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, int r33, long r34, long r36, androidx.compose.foundation.layout.WindowInsets r38, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m2041ScaffoldTvnljyQ(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2042ScaffoldLayoutFMILGgc(final int i2, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i3) {
        int i4;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        final WindowInsets windowInsets2;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            function32 = function3;
            i4 |= composerStartRestartGroup.changedInstance(function32) ? Fields.RotationX : 128;
        } else {
            function32 = function3;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            function25 = function23;
            i4 |= composerStartRestartGroup.changedInstance(function25) ? Fields.Clip : 8192;
        } else {
            function25 = function23;
        }
        if ((196608 & i3) == 0) {
            windowInsets2 = windowInsets;
            i4 |= composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i4, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                i5 = 1;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function27 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m2044invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m2044invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        int i6;
                        FabPlacement fabPlacement;
                        Object obj4;
                        Object obj5;
                        Object obj6;
                        int iMo328roundToPx0680j_4;
                        int iMo328roundToPx0680j_42;
                        final int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
                        final int iM6185getMaxHeightimpl = Constraints.m6185getMaxHeightimpl(j2);
                        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList.add(listSubcompose.get(i7).mo5120measureBRTryo0(jM6177copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i8 = 1;
                                while (true) {
                                    Object obj7 = arrayList.get(i8);
                                    int height2 = ((Placeable) obj7).getHeight();
                                    if (height < height2) {
                                        obj = obj7;
                                        height = height2;
                                    }
                                    if (i8 == lastIndex) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        int height3 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets3 = windowInsets2;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        int i9 = 0;
                        while (i9 < size2) {
                            arrayList2.add(listSubcompose2.get(i9).mo5120measureBRTryo0(ConstraintsKt.m6205offsetNN6EwU(jM6177copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                            i9++;
                            arrayList = arrayList;
                            listSubcompose2 = listSubcompose2;
                        }
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height4 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj8 = obj2;
                                int i10 = height4;
                                int i11 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i11);
                                    int height5 = ((Placeable) obj9).getHeight();
                                    if (i10 < height5) {
                                        obj8 = obj9;
                                        i10 = height5;
                                    }
                                    if (i11 == lastIndex2) {
                                        break;
                                    }
                                    i11++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex3) {
                                Object obj10 = obj3;
                                int i12 = width;
                                int i13 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i13);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i12 < width2) {
                                        obj10 = obj11;
                                        i12 = width2;
                                    }
                                    if (i13 == lastIndex3) {
                                        break;
                                    }
                                    i13++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function26);
                        WindowInsets windowInsets4 = windowInsets2;
                        final int i14 = width3;
                        final ArrayList arrayList4 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            int i16 = height6;
                            List<Measurable> list = listSubcompose3;
                            Placeable placeableMo5120measureBRTryo0 = listSubcompose3.get(i15).mo5120measureBRTryo0(ConstraintsKt.m6205offsetNN6EwU(jM6177copyZbe2FdA$default, (-windowInsets4.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope)));
                            if (placeableMo5120measureBRTryo0.getHeight() == 0 || placeableMo5120measureBRTryo0.getWidth() == 0) {
                                placeableMo5120measureBRTryo0 = null;
                            }
                            if (placeableMo5120measureBRTryo0 != null) {
                                arrayList4.add(placeableMo5120measureBRTryo0);
                            }
                            i15++;
                            height6 = i16;
                            listSubcompose3 = list;
                        }
                        int i17 = height6;
                        if (arrayList4.isEmpty()) {
                            i6 = height3;
                            fabPlacement = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList4.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList4);
                                if (1 <= lastIndex4) {
                                    Object obj12 = obj5;
                                    int i18 = width4;
                                    int i19 = 1;
                                    while (true) {
                                        Object obj13 = arrayList4.get(i19);
                                        int width5 = ((Placeable) obj13).getWidth();
                                        if (i18 < width5) {
                                            obj12 = obj13;
                                            i18 = width5;
                                        }
                                        if (i19 == lastIndex4) {
                                            break;
                                        }
                                        i19++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            Intrinsics.checkNotNull(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList4.isEmpty()) {
                                i6 = height3;
                                obj6 = null;
                            } else {
                                obj6 = arrayList4.get(0);
                                int height7 = ((Placeable) obj6).getHeight();
                                int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                                if (1 <= lastIndex5) {
                                    Object obj14 = obj6;
                                    int i20 = height7;
                                    int i21 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i21);
                                        i6 = height3;
                                        int height8 = ((Placeable) obj15).getHeight();
                                        if (i20 < height8) {
                                            i20 = height8;
                                            obj14 = obj15;
                                        }
                                        if (i21 == lastIndex5) {
                                            break;
                                        }
                                        i21++;
                                        height3 = i6;
                                    }
                                    obj6 = obj14;
                                } else {
                                    i6 = height3;
                                }
                            }
                            Intrinsics.checkNotNull(obj6);
                            int height9 = ((Placeable) obj6).getHeight();
                            int i22 = i2;
                            FabPosition.Companion companion = FabPosition.INSTANCE;
                            if (!FabPosition.m1733equalsimpl0(i22, companion.m1740getStartERTFSPs())) {
                                if (!(FabPosition.m1733equalsimpl0(i22, companion.m1738getEndERTFSPs()) ? true : FabPosition.m1733equalsimpl0(i22, companion.m1739getEndOverlayERTFSPs()))) {
                                    iMo328roundToPx0680j_4 = (iM6186getMaxWidthimpl - width6) / 2;
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo328roundToPx0680j_42 = subcomposeMeasureScope.mo328roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    iMo328roundToPx0680j_4 = (iM6186getMaxWidthimpl - iMo328roundToPx0680j_42) - width6;
                                } else {
                                    iMo328roundToPx0680j_4 = subcomposeMeasureScope.mo328roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                fabPlacement = new FabPlacement(iMo328roundToPx0680j_4, width6, height9);
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                iMo328roundToPx0680j_4 = subcomposeMeasureScope.mo328roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                fabPlacement = new FabPlacement(iMo328roundToPx0680j_4, width6, height9);
                            } else {
                                iMo328roundToPx0680j_42 = subcomposeMeasureScope.mo328roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                iMo328roundToPx0680j_4 = (iM6186getMaxWidthimpl - iMo328roundToPx0680j_42) - width6;
                                fabPlacement = new FabPlacement(iMo328roundToPx0680j_4, width6, height9);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-2146438447, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
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

                            public final void invoke(Composer composer2, int i23) {
                                if ((i23 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2146438447, i23, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                function28.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i23 = 0; i23 < size4; i23++) {
                            arrayList5.add(listSubcompose4.get(i23).mo5120measureBRTryo0(jM6177copyZbe2FdA$default));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int height10 = ((Placeable) obj4).getHeight();
                            int lastIndex6 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex6) {
                                int i24 = 1;
                                while (true) {
                                    Object obj16 = arrayList5.get(i24);
                                    int height11 = ((Placeable) obj16).getHeight();
                                    if (height10 < height11) {
                                        height10 = height11;
                                        obj4 = obj16;
                                    }
                                    if (i24 == lastIndex6) {
                                        break;
                                    }
                                    i24++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer numValueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        Integer numValueOf2 = fabPlacement != null ? Integer.valueOf((numValueOf == null || FabPosition.m1733equalsimpl0(i2, FabPosition.INSTANCE.m1739getEndOverlayERTFSPs())) ? windowInsets2.getBottom(subcomposeMeasureScope) + subcomposeMeasureScope.mo328roundToPx0680j_4(ScaffoldKt.FabSpacing) + fabPlacement.getHeight() : subcomposeMeasureScope.mo328roundToPx0680j_4(ScaffoldKt.FabSpacing) + fabPlacement.getHeight() + numValueOf.intValue()) : null;
                        int iIntValue = i17 != 0 ? i17 + (numValueOf2 != null ? numValueOf2.intValue() : numValueOf != null ? numValueOf.intValue() : windowInsets2.getBottom(subcomposeMeasureScope)) : 0;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets5 = windowInsets2;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        final int i25 = i6;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1213360416, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
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

                            public final void invoke(Composer composer2, int i26) {
                                Integer num;
                                if ((i26 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1213360416, i26, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                }
                                PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope);
                                function34.invoke(PaddingKt.m638PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), arrayList3.isEmpty() ? paddingValuesAsPaddingValues.getTop() : subcomposeMeasureScope.mo331toDpu2uoSUM(i25), PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (arrayList5.isEmpty() || (num = numValueOf) == null) ? paddingValuesAsPaddingValues.getBottom() : subcomposeMeasureScope.mo331toDpu2uoSUM(num.intValue())), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i26 = 0; i26 < size5; i26++) {
                            arrayList6.add(listSubcompose5.get(i26).mo5120measureBRTryo0(jM6177copyZbe2FdA$default));
                        }
                        final Integer num = numValueOf;
                        final WindowInsets windowInsets6 = windowInsets2;
                        final Integer num2 = numValueOf2;
                        final int i27 = iIntValue;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM6186getMaxWidthimpl, iM6185getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
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
                                List<Placeable> list2 = arrayList6;
                                int size6 = list2.size();
                                for (int i28 = 0; i28 < size6; i28++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i28), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList3;
                                int size7 = list3.size();
                                for (int i29 = 0; i29 < size7; i29++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i29), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList2;
                                int i30 = iM6186getMaxWidthimpl;
                                int i31 = i14;
                                WindowInsets windowInsets7 = windowInsets6;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                int i32 = iM6185getMaxHeightimpl;
                                int i33 = i27;
                                int size8 = list4.size();
                                for (int i34 = 0; i34 < size8; i34++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i34), windowInsets7.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()) + ((i30 - i31) / 2), i32 - i33, 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList5;
                                int i35 = iM6185getMaxHeightimpl;
                                Integer num3 = num;
                                int size9 = list5.size();
                                for (int i36 = 0; i36 < size9; i36++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i36), 0, i35 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list6 = arrayList4;
                                    int i37 = iM6185getMaxHeightimpl;
                                    Integer num4 = num2;
                                    int size10 = list6.size();
                                    for (int i38 = 0; i38 < size10; i38++) {
                                        Placeable placeable5 = list6.get(i38);
                                        int left = fabPlacement3.getLeft();
                                        Intrinsics.checkNotNull(num4);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i37 - num4.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function27);
                objRememberedValue = function27;
            } else {
                i5 = 1;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
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

                public final void invoke(Composer composer2, int i6) {
                    ScaffoldKt.m2042ScaffoldLayoutFMILGgc(i2, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }
}
