package e;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

/* loaded from: classes.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f701a = new f(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + 65536);
    }
}
