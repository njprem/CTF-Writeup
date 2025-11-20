package androidx.compose.ui.platform;

import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import androidx.lifecycle.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Landroidx/lifecycle/p;", "lifecycle", "Lkotlin/Function0;", "", "installForLifecycle", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/lifecycle/p;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> installForLifecycle(final AbstractComposeView abstractComposeView, final AbstractC0583p abstractC0583p) {
        if (((w) abstractC0583p).f598c.compareTo(EnumC0582o.f586a) > 0) {
            final InterfaceC0585s interfaceC0585s = new InterfaceC0585s() { // from class: androidx.compose.ui.platform.j
                @Override // androidx.lifecycle.InterfaceC0585s
                public final void onStateChanged(InterfaceC0587u interfaceC0587u, EnumC0581n enumC0581n) {
                    ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1(abstractComposeView, interfaceC0587u, enumC0581n);
                }
            };
            abstractC0583p.a(interfaceC0585s);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle.2
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
                    abstractC0583p.b(interfaceC0585s);
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC0583p + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, InterfaceC0587u interfaceC0587u, EnumC0581n enumC0581n) {
        if (enumC0581n == EnumC0581n.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
