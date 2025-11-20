package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001e\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"HorizontalSemanticsBoundsPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalSemanticsBoundsPadding$annotations", "()V", "getHorizontalSemanticsBoundsPadding", "()F", "F", "IncreaseHorizontalSemanticsBounds", "Landroidx/compose/ui/Modifier;", "getIncreaseHorizontalSemanticsBounds", "()Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityUtilKt {
    private static final float HorizontalSemanticsBoundsPadding;
    private static final Modifier IncreaseHorizontalSemanticsBounds;

    static {
        float fM6233constructorimpl = Dp.m6233constructorimpl(10);
        HorizontalSemanticsBoundsPadding = fM6233constructorimpl;
        IncreaseHorizontalSemanticsBounds = PaddingKt.m644paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2522invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2522invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                final int iMo328roundToPx0680j_4 = measureScope.mo328roundToPx0680j_4(AccessibilityUtilKt.getHorizontalSemanticsBoundsPadding());
                int i2 = iMo328roundToPx0680j_4 * 2;
                final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(ConstraintsKt.m6205offsetNN6EwU(j2, i2, 0));
                return MeasureScope.layout$default(measureScope, placeableMo5120measureBRTryo0.getWidth() - i2, placeableMo5120measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1.1
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
                        Placeable.PlacementScope.place$default(placementScope, placeableMo5120measureBRTryo0, -iMo328roundToPx0680j_4, 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), fM6233constructorimpl, 0.0f, 2, null);
    }

    public static final float getHorizontalSemanticsBoundsPadding() {
        return HorizontalSemanticsBoundsPadding;
    }

    public static /* synthetic */ void getHorizontalSemanticsBoundsPadding$annotations() {
    }

    public static final Modifier getIncreaseHorizontalSemanticsBounds() {
        return IncreaseHorizontalSemanticsBounds;
    }
}
