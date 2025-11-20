package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Function1<EnumC0581n, Unit> $handleEvent;
    final /* synthetic */ InterfaceC0587u $lifecycleOwner;
    final /* synthetic */ Function0<Unit> $onDispose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(InterfaceC0587u interfaceC0587u, Function1<? super EnumC0581n, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.$lifecycleOwner = interfaceC0587u;
        this.$handleEvent = function1;
        this.$onDispose = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final Function1<EnumC0581n, Unit> function1 = this.$handleEvent;
        final InterfaceC0585s interfaceC0585s = new InterfaceC0585s() { // from class: androidx.compose.material3.internal.a
            @Override // androidx.lifecycle.InterfaceC0585s
            public final void onStateChanged(InterfaceC0587u interfaceC0587u, EnumC0581n enumC0581n) {
                function1.invoke(enumC0581n);
            }
        };
        this.$lifecycleOwner.getLifecycle().a(interfaceC0585s);
        final Function0<Unit> function0 = this.$onDispose;
        final InterfaceC0587u interfaceC0587u = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                function0.invoke();
                interfaceC0587u.getLifecycle().b(interfaceC0585s);
            }
        };
    }
}
