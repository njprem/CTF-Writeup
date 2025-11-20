package c;

import b.AbstractC0621x;
import b.C0599b;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes.dex */
public final class l extends AbstractC0621x {

    /* renamed from: d, reason: collision with root package name */
    public CoroutineScope f689d;

    /* renamed from: e, reason: collision with root package name */
    public Function2 f690e;

    /* renamed from: f, reason: collision with root package name */
    public k f691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f692g;

    @Override // b.AbstractC0621x
    public final void a() {
        k kVar = this.f691f;
        if (kVar != null) {
            kVar.a();
        }
        k kVar2 = this.f691f;
        if (kVar2 != null) {
            kVar2.f686a = false;
        }
        this.f692g = false;
    }

    @Override // b.AbstractC0621x
    public final void b() {
        k kVar = this.f691f;
        if (kVar != null && !kVar.f686a) {
            kVar.a();
            this.f691f = null;
        }
        if (this.f691f == null) {
            this.f691f = new k(this.f689d, false, this.f690e, this);
        }
        k kVar2 = this.f691f;
        if (kVar2 != null) {
            SendChannel.DefaultImpls.close$default(kVar2.f687b, null, 1, null);
        }
        k kVar3 = this.f691f;
        if (kVar3 != null) {
            kVar3.f686a = false;
        }
        this.f692g = false;
    }

    @Override // b.AbstractC0621x
    public final void c(C0599b c0599b) {
        super.c(c0599b);
        k kVar = this.f691f;
        if (kVar != null) {
            ChannelResult.m8008boximpl(kVar.f687b.mo7998trySendJP2dKIU(c0599b));
        }
    }

    @Override // b.AbstractC0621x
    public final void d(C0599b c0599b) {
        super.d(c0599b);
        k kVar = this.f691f;
        if (kVar != null) {
            kVar.a();
        }
        if (this.f657a) {
            this.f691f = new k(this.f689d, true, this.f690e, this);
        }
        this.f692g = true;
    }
}
