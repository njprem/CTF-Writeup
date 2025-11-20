package androidx.compose.foundation.layout;

import J.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a*\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"absoluteOffset", "Landroidx/compose/ui/Modifier;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "absoluteOffset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset-VpY3zN4", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, final Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxElement(function1, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("offset", function1);
            }
        }));
    }

    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m600absoluteOffsetVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new OffsetElement(f2, f3, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.1
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
                inspectorInfo.setName("absoluteOffset");
                d.j(f2, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", Dp.m6231boximpl(f3));
            }
        }, null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m601absoluteOffsetVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        return m600absoluteOffsetVpY3zN4(modifier, f2, f3);
    }

    public static final Modifier offset(Modifier modifier, final Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxElement(function1, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", function1);
            }
        }));
    }

    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m602offsetVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new OffsetElement(f2, f3, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.1
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
                inspectorInfo.setName("offset");
                d.j(f2, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", Dp.m6231boximpl(f3));
            }
        }, null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m603offsetVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        return m602offsetVpY3zN4(modifier, f2, f3);
    }
}
