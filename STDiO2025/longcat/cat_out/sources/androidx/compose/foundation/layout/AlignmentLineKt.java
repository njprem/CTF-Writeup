package androidx.compose.foundation.layout;

import J.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m491alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f2, float f3, Measurable measurable, long j2) {
        final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null) : Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
        int i2 = placeableMo5120measureBRTryo0.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo5120measureBRTryo0.getHeight() : placeableMo5120measureBRTryo0.getWidth();
        int iM6185getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m6185getMaxHeightimpl(j2) : Constraints.m6186getMaxWidthimpl(j2);
        Dp.Companion companion = Dp.INSTANCE;
        int i3 = iM6185getMaxHeightimpl - height;
        final int iCoerceIn = RangesKt.coerceIn((!Dp.m6238equalsimpl0(f2, companion.m6253getUnspecifiedD9Ej5fM()) ? measureScope.mo328roundToPx0680j_4(f2) : 0) - i2, 0, i3);
        final int iCoerceIn2 = RangesKt.coerceIn(((!Dp.m6238equalsimpl0(f3, companion.m6253getUnspecifiedD9Ej5fM()) ? measureScope.mo328roundToPx0680j_4(f3) : 0) - height) + i2, 0, i3 - iCoerceIn);
        int width = getHorizontal(alignmentLine) ? placeableMo5120measureBRTryo0.getWidth() : Math.max(placeableMo5120measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m6188getMinWidthimpl(j2));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo5120measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m6187getMinHeightimpl(j2)) : placeableMo5120measureBRTryo0.getHeight();
        final int i4 = width;
        return MeasureScope.layout$default(measureScope, i4, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
                int width2;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !Dp.m6238equalsimpl0(f2, Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM()) ? iCoerceIn : (i4 - iCoerceIn2) - placeableMo5120measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5120measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !Dp.m6238equalsimpl0(f2, Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM()) ? iCoerceIn : (iMax - iCoerceIn2) - placeableMo5120measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m492paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f2, final float f3) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f2, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                d.j(f2, inspectorInfo.getProperties(), "before", inspectorInfo).set("after", Dp.m6231boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m493paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        return m492paddingFrom4j6BHR0(modifier, alignmentLine, f2, f3);
    }

    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m494paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, long j2, long j3) {
        AlignmentLine alignmentLine2;
        final long j4;
        final long j5;
        Function1<InspectorInfo, Unit> noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j4 = j2;
            j5 = j3;
            noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("paddingFrom");
                    inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                    inspectorInfo.getProperties().set("before", TextUnit.m6416boximpl(j4));
                    inspectorInfo.getProperties().set("after", TextUnit.m6416boximpl(j5));
                }
            };
            alignmentLine2 = alignmentLine;
        } else {
            alignmentLine2 = alignmentLine;
            j4 = j2;
            j5 = j3;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j4, j5, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m495paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE();
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE();
        }
        return m494paddingFromY_r0B1c(modifier, alignmentLine, j4, j3);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m496paddingFromBaselineVpY3zN4(Modifier modifier, float f2, float f3) {
        Dp.Companion companion = Dp.INSTANCE;
        return modifier.then(!Dp.m6238equalsimpl0(f2, companion.m6253getUnspecifiedD9Ej5fM()) ? m493paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f2, 0.0f, 4, null) : Modifier.INSTANCE).then(!Dp.m6238equalsimpl0(f3, companion.m6253getUnspecifiedD9Ej5fM()) ? m493paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f3, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m497paddingFromBaselineVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM();
        }
        return m496paddingFromBaselineVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m498paddingFromBaselinewCyjxdI(Modifier modifier, long j2, long j3) {
        return modifier.then(!TextUnitKt.m6444isUnspecifiedR2X_6o(j2) ? m495paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j2, 0L, 4, null) : Modifier.INSTANCE).then(!TextUnitKt.m6444isUnspecifiedR2X_6o(j3) ? m495paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j3, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m499paddingFromBaselinewCyjxdI$default(Modifier modifier, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE();
        }
        if ((i2 & 2) != 0) {
            j3 = TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE();
        }
        return m498paddingFromBaselinewCyjxdI(modifier, j2, j3);
    }
}
