package c;

import a.AbstractC0131b;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.InterfaceC0595H;
import kotlin.jvm.internal.Intrinsics;
import stdio.cat.R;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f679a = CompositionLocalKt.compositionLocalOf$default(null, g.f678a, 1, null);

    public static InterfaceC0595H a(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2068013981, 6, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        InterfaceC0595H interfaceC0595H = (InterfaceC0595H) composer.consume(f679a);
        Object obj = null;
        if (interfaceC0595H == null) {
            composer.startReplaceGroup(544166745);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Intrinsics.checkNotNullParameter(view, "<this>");
            while (true) {
                if (view == null) {
                    interfaceC0595H = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                InterfaceC0595H interfaceC0595H2 = tag instanceof InterfaceC0595H ? (InterfaceC0595H) tag : null;
                if (interfaceC0595H2 != null) {
                    interfaceC0595H = interfaceC0595H2;
                    break;
                }
                Object objN = AbstractC0131b.n(view);
                view = objN instanceof View ? (View) objN : null;
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(544164296);
            composer.endReplaceGroup();
        }
        if (interfaceC0595H == null) {
            composer.startReplaceGroup(544168748);
            Object baseContext = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    break;
                }
                if (baseContext instanceof InterfaceC0595H) {
                    obj = baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC0595H = (InterfaceC0595H) obj;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(544164377);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC0595H;
    }
}
