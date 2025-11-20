package androidx.compose.material3;

import a.AbstractC0131b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003¨\u0006\u0012"}, d2 = {"PredictiveBackDrawerMaxScaleXDistanceGrow", "Landroidx/compose/ui/unit/Dp;", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "F", "PredictiveBackDrawerMaxScaleXDistanceShrink", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleYDistance", "getPredictiveBackDrawerMaxScaleYDistance", "DrawerPredictiveBackHandler", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerPredictiveBackState;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/DrawerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawer_androidKt {
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = Dp.m6233constructorimpl(12);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = Dp.m6233constructorimpl(24);
    private static final float PredictiveBackDrawerMaxScaleYDistance = Dp.m6233constructorimpl(48);

    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final Function3<? super DrawerPredictiveBackState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Object navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
        int i4;
        boolean z;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444817207);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(drawerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444817207, i6, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new DrawerPredictiveBackState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            boolean z2 = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Ref.FloatRef floatRef3 = new Ref.FloatRef();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            floatRef.element = density.mo334toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            floatRef2.element = density.mo334toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            floatRef3.element = density.mo334toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean zIsOpen = drawerState.isOpen();
            int i7 = i6 & 14;
            boolean zChanged = composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changed(floatRef.element) | composerStartRestartGroup.changed(floatRef2.element) | composerStartRestartGroup.changed(floatRef3.element) | composerStartRestartGroup.changedInstance(coroutineScope) | (i7 == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                i4 = i6;
                z = zIsOpen;
                i5 = 0;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z2, floatRef, floatRef2, floatRef3, null);
                composerStartRestartGroup.updateRememberedValue(navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1);
            } else {
                i4 = i6;
                z = zIsOpen;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = objRememberedValue3;
                i5 = 0;
            }
            AbstractC0131b.a(z, (Function2) navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1, composerStartRestartGroup, i5);
            Boolean boolValueOf = Boolean.valueOf(drawerState.isClosed());
            int i8 = i7 == 4 ? 1 : i5;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i5);
            function3.invoke(drawerPredictiveBackState, composerStartRestartGroup, Integer.valueOf((i4 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.4
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

                public final void invoke(Composer composer2, int i9) {
                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }
}
