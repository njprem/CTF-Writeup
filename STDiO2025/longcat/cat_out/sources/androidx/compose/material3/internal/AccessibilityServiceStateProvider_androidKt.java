package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.InterfaceC0587u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "listenToTouchExplorationState", "listenToSwitchAccessState", "Landroidx/compose/runtime/State;", "rememberAccessibilityServiceState", "(ZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/lifecycle/u;", "lifecycleOwner", "Lkotlin/Function1;", "Landroidx/lifecycle/n;", "", "handleEvent", "Lkotlin/Function0;", "onDispose", "ObserveState", "(Landroidx/lifecycle/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "SwitchAccessActivityName", "Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ObserveState(final InterfaceC0587u interfaceC0587u, Function1<? super EnumC0581n, Unit> function1, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868327245);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(interfaceC0587u) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                function1 = new Function1<EnumC0581n, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EnumC0581n enumC0581n) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(EnumC0581n enumC0581n) {
                        invoke2(enumC0581n);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (i6 != 0) {
                function0 = new Function0<Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868327245, i4, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            boolean zChangedInstance = ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(interfaceC0587u) | ((i4 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(interfaceC0587u, function1, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(interfaceC0587u, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Function1<? super EnumC0581n, Unit> function12 = function1;
        final Function0<Unit> function02 = function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.4
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

                public final void invoke(Composer composer2, int i7) {
                    AccessibilityServiceStateProvider_androidKt.ObserveState(interfaceC0587u, function12, function02, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final State<Boolean> rememberAccessibilityServiceState(boolean z, boolean z2, Composer composer, int i2, int i3) {
        boolean z3 = true;
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1771705152, i2, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && composer.changed(z)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(z2)) && (i2 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object objRememberedValue = composer.rememberedValue();
        if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Listener(z, z2);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Listener listener = (Listener) objRememberedValue;
        InterfaceC0587u interfaceC0587u = (InterfaceC0587u) composer.consume(F.b.f175a);
        boolean zChanged = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<EnumC0581n, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC0581n enumC0581n) {
                    invoke2(enumC0581n);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EnumC0581n enumC0581n) {
                    if (enumC0581n == EnumC0581n.ON_RESUME) {
                        listener.register(accessibilityManager);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        boolean zChanged2 = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    listener.unregister(accessibilityManager);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        ObserveState(interfaceC0587u, function1, (Function0) objRememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listener;
    }
}
