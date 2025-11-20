package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import j.AbstractC0663p;
import j.C0638D;
import j.C0639E;
import j.C0659l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ai\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ai\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00142\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\"\u001a7\u0010#\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b#\u0010$\u001aZ\u0010,\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2#\u0010)\u001a\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0002\b\u000f2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0097\u0001\u00100\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2#\u0010)\u001a\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0002\b\u000f2#\u0010.\u001a\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0002\b\u000f2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u00101\u001a]\u00107\u001a\u0002062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u00108\u001a\u0097\u0001\u00107\u001a\u0002062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2#\u0010)\u001a\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0002\b\u000f2#\u0010.\u001a\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0002\b\u000f2\u0006\u00105\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u00109\u001a\\\u0010H\u001a\u00020E*\u00020:2\u0006\u0010<\u001a\u00020;2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a%\u0010K\u001a\u0004\u0018\u00010>*\b\u0012\u0004\u0012\u00020>0=2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010L\u001a#\u0010O\u001a\u00020\u0006*\u00020&2\u0006\u0010N\u001a\u00020M2\u0006\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0004\bO\u0010P\u001a#\u0010Q\u001a\u00020\u0006*\u00020&2\u0006\u0010N\u001a\u00020M2\u0006\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\bQ\u0010P\u001a<\u0010W\u001a\u000206*\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010D\u001a\u00020R2\u0014\u0010T\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010S\u0012\u0004\u0012\u00020\r0\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001aT\u0010`\u001a\u00020E*\u00020:2\u0006\u0010D\u001a\u00020C2\u0006\u0010X\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u00062\u0006\u00104\u001a\u0002022\f\u0010[\u001a\b\u0012\u0004\u0012\u00020E0Z2\u0006\u0010\\\u001a\u00020;2\u0006\u0010]\u001a\u000202H\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010_\"\u001a\u0010b\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u001a\u0010f\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010c\u001a\u0004\bg\u0010e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "maxIntrinsicMainAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I", "crossAxisSize", "crossAxisSpacing", "minIntrinsicMainAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "Lj/l;", "intrinsicCrossAxisSize", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesIterator", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "safeNext", "(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "", "isHorizontal", "mainAxisMin", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I", "crossAxisMin", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "measureAndCache", "mainAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/MutableVector;", "items", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_START", "getCROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier r18, androidx.compose.foundation.layout.Arrangement.Vertical r19, androidx.compose.foundation.layout.Arrangement.Horizontal r20, int r21, int r22, androidx.compose.foundation.layout.FlowColumnOverflow r23, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.ui.Modifier r18, androidx.compose.foundation.layout.Arrangement.Horizontal r19, androidx.compose.foundation.layout.Arrangement.Vertical r20, int r21, int r22, androidx.compose.foundation.layout.FlowRowOverflow r23, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m567breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f2, float f3, long j2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i4;
        int i5;
        C0659l c0659l;
        int i6;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        C0639E c0639e;
        ArrayList arrayList;
        int i7;
        int i8;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j3;
        int i9;
        int i10;
        int i11;
        C0639E c0639e2;
        ArrayList arrayList2;
        Integer num;
        C0659l c0659l2;
        int i12;
        int i13;
        C0638D c0638d;
        C0638D c0638d2;
        Integer numValueOf;
        int i14;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i15;
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
        int iM6188getMinWidthimpl = Constraints.m6188getMinWidthimpl(j2);
        int iM6185getMaxHeightimpl = Constraints.m6185getMaxHeightimpl(j2);
        C0639E c0639e3 = AbstractC0663p.f856a;
        C0639E c0639e4 = new C0639E();
        ArrayList arrayList3 = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.mo334toPx0680j_4(f2));
        int iCeil2 = (int) Math.ceil(measureScope3.mo334toPx0680j_4(f3));
        long jM609constructorimpl = OrientationIndependentConstraints.m609constructorimpl(0, iM6186getMaxWidthimpl, 0, iM6185getMaxHeightimpl);
        long jM624toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m624toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m613copyyUG9Ft0$default(jM609constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo331toDpu2uoSUM(iM6186getMaxWidthimpl), measureScope3.mo331toDpu2uoSUM(iM6185getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        if (measurableSafeNext != null) {
            i4 = iCeil;
            i5 = iCeil2;
            c0659l = new C0659l(m568measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy3, jM624toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            }));
        } else {
            i4 = iCeil;
            i5 = iCeil2;
            c0659l = null;
        }
        Integer numValueOf2 = c0659l != null ? Integer.valueOf((int) (c0659l.f847a >> 32)) : null;
        Integer numValueOf3 = c0659l != null ? Integer.valueOf((int) (c0659l.f847a & 4294967295L)) : null;
        C0638D c0638d3 = new C0638D();
        Measurable measurable = measurableSafeNext;
        C0638D c0638d4 = new C0638D();
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i2, flowLayoutOverflowState, j2, i3, i4, i5, null);
        int i16 = i5;
        int i17 = i4;
        C0659l c0659l3 = c0659l;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM565getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m565getWrapInfoOpUlnko(it2.hasNext(), 0, C0659l.a(iM6186getMaxWidthimpl, iM6185getMaxHeightimpl), c0659l3, 0, 0, 0, false, false);
        if (wrapInfoM565getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM565getWrapInfoOpUlnko, c0659l3 != null, -1, 0, iM6186getMaxWidthimpl, 0);
            i6 = iM6186getMaxWidthimpl;
        } else {
            i6 = iM6186getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i18 = i6;
        Integer num2 = numValueOf3;
        C0638D c0638d5 = c0638d3;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoM565getWrapInfoOpUlnko;
        int iMax = iM6188getMinWidthimpl;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = iM6185getMaxHeightimpl;
        Measurable measurableSafeNext2 = measurable;
        while (!wrapInfo.getIsLastItemInContainer() && measurableSafeNext2 != null) {
            Intrinsics.checkNotNull(numValueOf2);
            int iIntValue = numValueOf2.intValue();
            Intrinsics.checkNotNull(num2);
            C0638D c0638d6 = c0638d4;
            int iIntValue2 = num2.intValue();
            int i26 = i6;
            int i27 = i21 + iIntValue;
            int iMax2 = Math.max(i19, iIntValue2);
            int i28 = i18 - iIntValue;
            int i29 = i20 + 1;
            int i30 = iMax;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i29);
            arrayList3.add(measurableSafeNext2);
            c0639e4.h(i20, objectRef.element);
            int i31 = i29 - i22;
            boolean z = i31 < i2;
            if (flowLineInfo != null) {
                int i32 = z ? i23 : i23 + 1;
                i11 = i31;
                if (!z) {
                    i31 = 0;
                }
                if (z) {
                    c0639e2 = c0639e4;
                    i15 = 0;
                    iCoerceAtLeast = RangesKt.coerceAtLeast(i28 - i17, 0);
                } else {
                    c0639e2 = c0639e4;
                    i15 = 0;
                    iCoerceAtLeast = i26;
                }
                float fMo331toDpu2uoSUM = measureScope3.mo331toDpu2uoSUM(iCoerceAtLeast);
                if (z) {
                    arrayList2 = arrayList3;
                    iCoerceAtLeast2 = i25;
                } else {
                    arrayList2 = arrayList3;
                    iCoerceAtLeast2 = RangesKt.coerceAtLeast((i25 - iMax2) - i16, i15);
                }
                flowLineInfo.m578update4j6BHR0$foundation_layout_release(i32, i31, fMo331toDpu2uoSUM, measureScope3.mo331toDpu2uoSUM(iCoerceAtLeast2));
            } else {
                i11 = i31;
                c0639e2 = c0639e4;
                arrayList2 = arrayList3;
            }
            measurableSafeNext2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
            objectRef.element = null;
            C0659l c0659l4 = measurableSafeNext2 != null ? new C0659l(m568measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy3, jM624toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            })) : null;
            Integer numValueOf4 = c0659l4 != null ? Integer.valueOf(((int) (c0659l4.f847a >> 32)) + i17) : null;
            Integer numValueOf5 = c0659l4 != null ? Integer.valueOf((int) (c0659l4.f847a & 4294967295L)) : null;
            boolean zHasNext = it2.hasNext();
            int i33 = i23;
            long jA = C0659l.a(i28, i25);
            if (c0659l4 == null) {
                num = numValueOf5;
                c0659l2 = null;
            } else {
                Intrinsics.checkNotNull(numValueOf4);
                int iIntValue3 = numValueOf4.intValue();
                Intrinsics.checkNotNull(numValueOf5);
                num = numValueOf5;
                c0659l2 = new C0659l(C0659l.a(iIntValue3, numValueOf5.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM565getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m565getWrapInfoOpUlnko(zHasNext, i11, jA, c0659l2, i33, i24, iMax2, false, false);
            int i34 = iMax2;
            if (wrapInfoM565getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                i13 = i26;
                iMax = Math.min(Math.max(i30, i27), i13);
                int i35 = i24 + i34;
                wrapEllipsisInfo2 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM565getWrapInfoOpUlnko2, c0659l4 != null, i33, i35, i28, i11);
                c0638d2 = c0638d6;
                c0638d2.c(i34);
                i25 = (i25 - i35) - i16;
                c0638d = c0638d5;
                c0638d.c(i29);
                i23 = i33 + 1;
                i24 = i35 + i16;
                numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i17) : null;
                i12 = i13;
                i22 = i29;
                i34 = 0;
                i14 = 0;
            } else {
                i12 = i28;
                i13 = i26;
                iMax = i30;
                c0638d = c0638d5;
                c0638d2 = c0638d6;
                numValueOf = numValueOf4;
                i23 = i33;
                i14 = i27;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            Integer num3 = num;
            i21 = i14;
            c0639e4 = c0639e2;
            numValueOf2 = numValueOf;
            num2 = num3;
            c0638d4 = c0638d2;
            i20 = i29;
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            i6 = i13;
            c0638d5 = c0638d;
            wrapInfo = wrapInfoM565getWrapInfoOpUlnko2;
            i18 = i12;
            arrayList3 = arrayList2;
            i19 = i34;
            it2 = it;
        }
        C0639E c0639e5 = c0639e4;
        ArrayList arrayList4 = arrayList3;
        C0638D c0638d7 = c0638d4;
        C0638D c0638d8 = c0638d5;
        if (wrapEllipsisInfo3 != null) {
            arrayList = arrayList4;
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            c0639e = c0639e5;
            c0639e.h(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i36 = c0638d8.f849b - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int i37 = c0638d8.f849b - 1;
                c0638d7.f(i36, Math.max(c0638d7.a(i36), (int) (wrapEllipsisInfo3.getEllipsisSize() & 4294967295L)));
                int i38 = c0638d8.f849b;
                if (i38 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                c0638d8.f(i37, c0638d8.f848a[i38 - 1] + 1);
            } else {
                c0638d7.c((int) (wrapEllipsisInfo3.getEllipsisSize() & 4294967295L));
                int i39 = c0638d8.f849b;
                if (i39 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                c0638d8.c(c0638d8.f848a[i39 - 1] + 1);
            }
        } else {
            c0639e = c0639e5;
            arrayList = arrayList4;
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i40 = 0; i40 < size; i40++) {
            placeableArr[i40] = c0639e.c(i40);
        }
        int i41 = c0638d8.f849b;
        int[] iArr3 = new int[i41];
        for (int i42 = 0; i42 < i41; i42++) {
            iArr3[i42] = 0;
        }
        int i43 = c0638d8.f849b;
        int[] iArr4 = new int[i43];
        for (int i44 = 0; i44 < i43; i44++) {
            iArr4[i44] = 0;
        }
        int[] iArr5 = c0638d8.f848a;
        int i45 = c0638d8.f849b;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i47 < i45) {
            int i49 = iArr5[i47];
            ArrayList arrayList5 = arrayList;
            Placeable[] placeableArr3 = placeableArr2;
            int i50 = i45;
            int i51 = i17;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy3, iMax, Constraints.m6187getMinHeightimpl(jM609constructorimpl), Constraints.m6186getMaxWidthimpl(jM609constructorimpl), c0638d7.a(i47), i51, measureScope3, arrayList5, placeableArr3, i46, i49, iArr3, i47);
            if (flowLineMeasurePolicy.isHorizontal()) {
                i9 = measureResultMeasure.getWidth();
                i10 = measureResultMeasure.getHeight();
            } else {
                i9 = measureResultMeasure.getHeight();
                i10 = measureResultMeasure.getWidth();
            }
            iArr4[i47] = i10;
            i48 += i10;
            iMax = Math.max(iMax, i9);
            mutableVector.add(measureResultMeasure);
            i47++;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
            placeableArr2 = placeableArr3;
            i46 = i49;
            i45 = i50;
            i17 = i51;
            arrayList = arrayList5;
            measureScope3 = measureScope;
        }
        if (mutableVector.isEmpty()) {
            i7 = 0;
            i8 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j3 = j2;
            iArr = iArr3;
            iArr2 = iArr4;
        } else {
            i7 = iMax;
            i8 = i48;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr3;
            iArr2 = iArr4;
            j3 = j2;
        }
        return m569placeHelperBmaY500(measureScope2, j3, i7, i8, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i3, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)");
        }
        boolean z = ((((i3 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(i2)) || (i3 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i2, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                    return flowMeasurePolicy.mo590measure3p2s80s(measureScope, CollectionsKt.listOf(list), j2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(748776953, i4, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)");
        }
        boolean zChanged = ((((i4 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(i2)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && composer.changed(i3)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i2, i3, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i2) {
        return z ? intrinsicMeasurable.minIntrinsicHeight(i2) : intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i7, int i8) {
                return Integer.valueOf(iArr[i7]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i7, int i8) {
                return Integer.valueOf(iArr2[i7]);
            }
        }, i2, i3, i4, i5, i6, flowLayoutOverflowState);
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i2) {
        return z ? intrinsicMeasurable.minIntrinsicWidth(i2) : intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i2, int i3, int i4) {
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < size) {
            int iIntValue = function3.invoke(list.get(i5), Integer.valueOf(i5), Integer.valueOf(i2)).intValue() + i3;
            int i8 = i5 + 1;
            if (i8 - i6 == i4 || i8 == list.size()) {
                iMax = Math.max(iMax, (i7 + iIntValue) - i3);
                i7 = 0;
                i6 = i5;
            } else {
                i7 += iIntValue;
            }
            i5 = i8;
        }
        return iMax;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m568measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(j2);
                function1.invoke(placeableMo5120measureBRTryo0);
                return C0659l.a(flowLineMeasurePolicy.mainAxisSize(placeableMo5120measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo5120measureBRTryo0));
            }
        }
        int iMainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return C0659l.a(iMainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), iMainAxisMin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i7 = i5;
        int i8 = i6;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            iArr2[i10] = 0;
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            int iIntValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i11), Integer.valueOf(i2)).intValue();
            iArr[i11] = iIntValue;
            iArr2[i11] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i11), Integer.valueOf(iIntValue)).intValue();
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i12 = Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE && i7 != Integer.MAX_VALUE) {
            i12 = i7 * i8;
        }
        int iMin = Math.min(i12 - (((i12 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i12 < list2.size() || i8 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int size4 = ((list2.size() - 1) * i3) + ArraysKt.sum(iArr);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i13 = iArr2[0];
        ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i14 = iArr2[it.nextInt()];
            if (i13 < i14) {
                i13 = i14;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr[0];
        ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i16 = iArr[it2.nextInt()];
            if (i15 < i16) {
                i15 = i16;
            }
        }
        int i17 = i15;
        int i18 = size4;
        while (i17 <= i18 && i13 != i2) {
            int i19 = (i17 + i18) / 2;
            long jIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i19, i3, i4, i7, i8, flowLayoutOverflowState);
            int i20 = (int) (jIntrinsicCrossAxisSize >> 32);
            int i21 = (int) (4294967295L & jIntrinsicCrossAxisSize);
            if (i20 > i2 || i21 < iMin) {
                i17 = i19 + 1;
                if (i17 > i18) {
                    return i17;
                }
            } else {
                if (i20 >= i2) {
                    return i19;
                }
                i18 = i19 - 1;
            }
            list2 = list;
            i7 = i5;
            i8 = i6;
            size4 = i19;
            i13 = i20;
        }
        return size4;
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m569placeHelperBmaY500(MeasureScope measureScope, long j2, int i2, int i3, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int iCoerceIn;
        int i4;
        int i5;
        boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            if (verticalArrangement == null) {
                throw new IllegalArgumentException("null verticalArrangement");
            }
            iCoerceIn = RangesKt.coerceIn(((mutableVector.getSize() - 1) * measureScope.mo328roundToPx0680j_4(verticalArrangement.getSpacing())) + i3, Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(j2));
            verticalArrangement.arrange(measureScope, iCoerceIn, iArr, iArr2);
        } else {
            if (horizontalArrangement == null) {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
            int iCoerceIn2 = RangesKt.coerceIn(((mutableVector.getSize() - 1) * measureScope.mo328roundToPx0680j_4(horizontalArrangement.getSpacing())) + i3, Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(j2));
            horizontalArrangement.arrange(measureScope, iCoerceIn2, iArr, measureScope.getLayoutDirection(), iArr2);
            iCoerceIn = iCoerceIn2;
        }
        int iCoerceIn3 = RangesKt.coerceIn(i2, Constraints.m6188getMinWidthimpl(j2), Constraints.m6186getMaxWidthimpl(j2));
        if (zIsHorizontal) {
            i5 = iCoerceIn3;
            i4 = iCoerceIn;
        } else {
            i4 = iCoerceIn3;
            i5 = iCoerceIn;
        }
        return MeasureScope.layout$default(measureScope, i5, i4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$5
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
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    MeasureResult[] content = mutableVector2.getContent();
                    int i6 = 0;
                    do {
                        content[i6].placeChildren();
                        i6++;
                    } while (i6 < size);
                }
            }
        }, 4, null);
    }

    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i3, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)");
        }
        boolean z = ((((i3 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(i2)) || (i3 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i2, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                    return flowMeasurePolicy.mo590measure3p2s80s(measureScope, CollectionsKt.listOf(list), j2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2134502475, i4, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)");
        }
        boolean zChanged = ((((i4 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(i2)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && composer.changed(i3)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i2, i3, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return it.next();
            }
            Intrinsics.checkNotNull(flowLineInfo);
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i7;
        long j2;
        int iIntValue;
        List<? extends IntrinsicMeasurable> list2 = list;
        Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function33 = function3;
        if (list2.isEmpty()) {
            return C0659l.a(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i5, flowLayoutOverflowState, OrientationIndependentConstraints.m609constructorimpl(0, i2, 0, Integer.MAX_VALUE), i6, i3, i4, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list2, 0);
        int iIntValue2 = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i2)).intValue() : 0;
        int iIntValue3 = intrinsicMeasurable != null ? function33.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue2)).intValue() : 0;
        int i8 = 0;
        long j3 = 4294967295L;
        if (flowLayoutBuildingBlocks.m565getWrapInfoOpUlnko(list2.size() > 1, 0, C0659l.a(i2, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new C0659l(C0659l.a(iIntValue3, iIntValue2)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            C0659l c0659lM570ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m570ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return C0659l.a(c0659lM570ellipsisSizeF35zmw$foundation_layout_release != null ? (int) (c0659lM570ellipsisSizeF35zmw$foundation_layout_release.f847a & 4294967295L) : 0, 0);
        }
        int size = list2.size();
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i10 >= size) {
                i7 = i11;
                break;
            }
            int i15 = i9 - iIntValue3;
            int i16 = i10 + 1;
            int iMax = Math.max(i14, iIntValue2);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list2, i16);
            int iIntValue4 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i16), Integer.valueOf(i2)).intValue() : 0;
            if (intrinsicMeasurable2 != null) {
                j2 = j3;
                iIntValue = function33.invoke(intrinsicMeasurable2, Integer.valueOf(i16), Integer.valueOf(iIntValue4)).intValue() + i3;
            } else {
                j2 = j3;
                iIntValue = 0;
            }
            int i17 = i16 - i12;
            i7 = i16;
            int i18 = i13;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM565getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m565getWrapInfoOpUlnko(i10 + 2 < list2.size(), i17, C0659l.a(i15, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : new C0659l(C0659l.a(iIntValue, iIntValue4)), i18, i8, iMax, false, false);
            if (wrapInfoM565getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int i19 = iMax + i4 + i8;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM565getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i18, i19, i15, i17);
                int i20 = iIntValue - i3;
                i13 = i18 + 1;
                if (wrapInfoM565getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i19 = ((int) (ellipsisSize & j2)) + i4 + i19;
                        }
                    }
                    i8 = i19;
                } else {
                    i9 = i2;
                    iIntValue3 = i20;
                    i12 = i7;
                    i8 = i19;
                    i14 = 0;
                }
            } else {
                iIntValue3 = iIntValue;
                i9 = i15;
                i13 = i18;
                i14 = iMax;
            }
            list2 = list;
            function33 = function3;
            iIntValue2 = iIntValue4;
            i10 = i7;
            i11 = i10;
            j3 = j2;
        }
        return C0659l.a(i8 - i4, i7);
    }
}
