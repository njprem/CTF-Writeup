package androidx.compose.foundation.layout;

import J.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaddingKt {
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m635PaddingValues0680j_4(float f2) {
        return new PaddingValuesImpl(f2, f2, f2, f2, null);
    }

    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m636PaddingValuesYgX7TsA(float f2, float f3) {
        return new PaddingValuesImpl(f2, f3, f2, f3, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m637PaddingValuesYgX7TsA$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        return m636PaddingValuesYgX7TsA(f2, f3);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m638PaddingValuesa9UjIt4(float f2, float f3, float f4, float f5) {
        return new PaddingValuesImpl(f2, f3, f4, f5, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m639PaddingValuesa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6233constructorimpl(0);
        }
        return m638PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m640absolutePaddingqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new PaddingElement(f2, f3, f4, f5, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
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
                inspectorInfo.setName("absolutePadding");
                d.j(f4, d.j(f3, d.j(f2, inspectorInfo.getProperties(), "left", inspectorInfo), "top", inspectorInfo), "right", inspectorInfo).set("bottom", Dp.m6231boximpl(f5));
            }
        }, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m641absolutePaddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6233constructorimpl(0);
        }
        return m640absolutePaddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo594calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo593calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo593calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo594calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.4
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        }));
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m642padding3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new PaddingElement(f2, f2, f2, f2, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.3
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(Dp.m6231boximpl(f2));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m643paddingVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new PaddingElement(f2, f3, f2, f3, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.2
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
                inspectorInfo.setName("padding");
                d.j(f2, inspectorInfo.getProperties(), "horizontal", inspectorInfo).set("vertical", Dp.m6231boximpl(f3));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m644paddingVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        return m643paddingVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m645paddingqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new PaddingElement(f2, f3, f4, f5, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.1
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
                inspectorInfo.setName("padding");
                d.j(f4, d.j(f3, d.j(f2, inspectorInfo.getProperties(), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", Dp.m6231boximpl(f5));
            }
        }, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m646paddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6233constructorimpl(0);
        }
        return m645paddingqDBjuR0(modifier, f2, f3, f4, f5);
    }
}
