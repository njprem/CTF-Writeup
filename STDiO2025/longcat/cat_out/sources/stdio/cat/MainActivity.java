package stdio.cat;

import S.b;
import S.c;
import a.AbstractC0130a;
import a.AbstractC0131b;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.I;
import b.AbstractActivityC0612o;
import b.AbstractC0614q;
import b.C0596I;
import b.C0597J;
import b.C0615r;
import b.C0616s;
import b.C0617t;
import b.C0618u;
import b.C0619v;
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lstdio/cat/MainActivity;", "Lb/o;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainActivity extends AbstractActivityC0612o {
    public static final int $stable = 0;

    @Override // b.AbstractActivityC0612o, q.b, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i2 = AbstractC0614q.f652a;
        C0596I detectDarkMode = C0596I.f628a;
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        C0597J statusBarStyle = new C0597J(0, 0, detectDarkMode);
        int i3 = AbstractC0614q.f652a;
        int i4 = AbstractC0614q.f653b;
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        C0597J navigationBarStyle = new C0597J(i3, i4, detectDarkMode);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) detectDarkMode.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) detectDarkMode.invoke(resources2)).booleanValue();
        int i5 = Build.VERSION.SDK_INT;
        AbstractC0131b c0619v = i5 >= 30 ? new C0619v() : i5 >= 29 ? new C0618u() : i5 >= 28 ? new C0617t() : i5 >= 26 ? new C0616s() : new C0615r();
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        c0619v.y(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        c0619v.c(window2);
        ComposableLambda composableLambda = b.f274b;
        ViewGroup.LayoutParams layoutParams = f.f677a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(composableLambda);
        } else {
            ComposeView composeView2 = new ComposeView(this, null, 0, 6, null);
            composeView2.setParentCompositionContext(null);
            composeView2.setContent(composableLambda);
            View decorView2 = getWindow().getDecorView();
            if (I.b(decorView2) == null) {
                I.e(decorView2, this);
            }
            if (I.c(decorView2) == null) {
                I.f(decorView2, this);
            }
            if (AbstractC0130a.k(decorView2) == null) {
                AbstractC0130a.m(decorView2, this);
            }
            setContentView(composeView2, f.f677a);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(2, null), 3, null);
    }
}
