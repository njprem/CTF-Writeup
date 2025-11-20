package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "initialOffset", "Ljava/lang/Integer;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private Animatable<Integer, AnimationVector1D> animatable;
    private Integer initialOffset;
    private final CoroutineScope scope;

    public SegmentedButtonContentMeasurePolicy(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo590measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends Measurable> list2 = list.get(0);
        int i2 = 1;
        List<? extends Measurable> list3 = list.get(1);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        int iG = 0;
        while (iG < size) {
            iG = d.g(list2.get(iG), j2, arrayList, iG, 1);
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i3);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        int iG2 = 0;
        while (iG2 < size2) {
            iG2 = d.g(list3.get(iG2), j2, arrayList2, iG2, 1);
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                int i4 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i4);
                    int width5 = ((Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i4 == lastIndex2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer numValueOf = placeable2 != null ? Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex3) {
                while (true) {
                    Object obj6 = arrayList2.get(i2);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i2 == lastIndex3) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.INSTANCE;
        int iMo328roundToPx0680j_4 = measureScope.mo328roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + Math.max(measureScope.mo328roundToPx0680j_4(segmentedButtonDefaults.m2087getIconSizeD9Ej5fM()), width3) + (numValueOf != null ? numValueOf.intValue() : 0);
        final int i5 = width3 == 0 ? (-(measureScope.mo328roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + measureScope.mo328roundToPx0680j_4(segmentedButtonDefaults.m2087getIconSizeD9Ej5fM()))) / 2 : 0;
        Integer num = this.initialOffset;
        if (num == null) {
            this.initialOffset = Integer.valueOf(i5);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Intrinsics.checkNotNull(num);
                Animatable<Integer, AnimationVector1D> animatable2 = new Animatable<>(num, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), null, null, 12, null);
                this.animatable = animatable2;
                animatable = animatable2;
            }
            if (animatable.getTargetValue().intValue() != i5) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i5, null), 3, null);
            }
        }
        final int i6 = height3;
        return MeasureScope.layout$default(measureScope, iMo328roundToPx0680j_4, i6, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$2
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
                List<Placeable> list4 = arrayList;
                int i7 = i6;
                int size3 = list4.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Placeable placeable4 = list4.get(i8);
                    Placeable.PlacementScope.place$default(placementScope, placeable4, 0, d.h(placeable4, i7, 2), 0.0f, 4, null);
                }
                int iMo328roundToPx0680j_42 = measureScope.mo328roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + measureScope.mo328roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m2087getIconSizeD9Ej5fM());
                Animatable<Integer, AnimationVector1D> animatable3 = this.getAnimatable();
                int iIntValue = iMo328roundToPx0680j_42 + (animatable3 != null ? animatable3.getValue().intValue() : i5);
                List<Placeable> list5 = arrayList2;
                int i9 = i6;
                int size4 = list5.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    Placeable placeable5 = list5.get(i10);
                    Placeable.PlacementScope.place$default(placementScope, placeable5, iIntValue, d.h(placeable5, i9, 2), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setAnimatable(Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }
}
