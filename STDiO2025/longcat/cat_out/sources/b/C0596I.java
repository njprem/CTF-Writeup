package b;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: b.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596I extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0596I f628a = new C0596I(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        Intrinsics.checkNotNullParameter(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
