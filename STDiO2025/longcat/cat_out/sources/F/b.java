package F;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.InterfaceC0587u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f175a;

    static {
        Object objM6498constructorimpl;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = InterfaceC0587u.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) objInvoke;
                    }
                } else if (annotations[i2] instanceof Deprecated) {
                    break;
                } else {
                    i2++;
                }
            }
            providableCompositionLocal = null;
            objM6498constructorimpl = Result.m6498constructorimpl(providableCompositionLocal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6498constructorimpl = Result.m6498constructorimpl(ResultKt.createFailure(th));
        }
        ProvidableCompositionLocal providableCompositionLocalStaticCompositionLocalOf = (ProvidableCompositionLocal) (Result.m6504isFailureimpl(objM6498constructorimpl) ? null : objM6498constructorimpl);
        if (providableCompositionLocalStaticCompositionLocalOf == null) {
            providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(new a());
        }
        f175a = providableCompositionLocalStaticCompositionLocalOf;
    }
}
