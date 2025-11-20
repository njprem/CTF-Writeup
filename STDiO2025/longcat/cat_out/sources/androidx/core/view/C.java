package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class C extends FunctionReferenceImpl implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C f442a = new C(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
