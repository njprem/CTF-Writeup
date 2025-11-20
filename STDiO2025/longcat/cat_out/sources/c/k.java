package c;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f686a;

    /* renamed from: b, reason: collision with root package name */
    public final Channel f687b = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);

    /* renamed from: c, reason: collision with root package name */
    public final Job f688c;

    public k(CoroutineScope coroutineScope, boolean z, Function2 function2, l lVar) {
        this.f686a = z;
        this.f688c = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new j(lVar, function2, this, null), 3, null);
    }

    public final void a() {
        this.f687b.cancel(new CancellationException("onBack cancelled"));
        Job.DefaultImpls.cancel$default(this.f688c, (CancellationException) null, 1, (Object) null);
    }
}
