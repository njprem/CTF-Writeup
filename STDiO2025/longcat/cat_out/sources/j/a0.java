package j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* loaded from: classes.dex */
public final class a0 extends RestrictedSuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f782a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f783b;

    /* renamed from: c, reason: collision with root package name */
    public int f784c;

    /* renamed from: d, reason: collision with root package name */
    public int f785d;

    /* renamed from: e, reason: collision with root package name */
    public int f786e;

    /* renamed from: f, reason: collision with root package name */
    public int f787f;

    /* renamed from: g, reason: collision with root package name */
    public long f788g;

    /* renamed from: h, reason: collision with root package name */
    public int f789h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f790i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f791j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(N n2, Continuation continuation) {
        super(2, continuation);
        this.f791j = n2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a0 a0Var = new a0(this.f791j, continuation);
        a0Var.f790i = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:23:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:20:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0088 -> B:20:0x008b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f789h
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            int r2 = r0.f787f
            int r6 = r0.f786e
            long r7 = r0.f788g
            int r9 = r0.f785d
            int r10 = r0.f784c
            long[] r11 = r0.f783b
            java.lang.Object[] r12 = r0.f782a
            java.lang.Object r13 = r0.f790i
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.throwOnFailure(r21)
            goto L8b
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r2 = r0.f790i
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            j.N r6 = r0.f791j
            java.lang.Object[] r7 = r6.f801b
            long[] r6 = r6.f800a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L94
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r2 >= r6) goto L8e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8b
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.f790i = r13
            r0.f782a = r12
            r0.f783b = r11
            r0.f784c = r10
            r0.f785d = r9
            r0.f788g = r7
            r0.f786e = r6
            r0.f787f = r2
            r0.f789h = r3
            java.lang.Object r14 = r13.yield(r14, r0)
            if (r14 != r1) goto L8b
            return r1
        L8b:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L62
        L8e:
            if (r6 != r5) goto L99
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L94:
            if (r9 == r8) goto L99
            int r9 = r9 + 1
            goto L41
        L99:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
