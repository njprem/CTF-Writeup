package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LM/b;", "Landroidx/lifecycle/u;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements M.b {
    @Override // M.b
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // M.b
    public final Object b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        M.a aVarC = M.a.c(context);
        Intrinsics.checkNotNullExpressionValue(aVarC, "getInstance(...)");
        if (!aVarC.f255b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = r.f593a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!r.f593a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0584q());
        }
        B b2 = B.f537i;
        Intrinsics.checkNotNullParameter(context, "context");
        B b3 = B.f537i;
        b3.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        b3.f542e = new Handler();
        b3.f543f.e(EnumC0581n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new A(b3));
        return b3;
    }
}
