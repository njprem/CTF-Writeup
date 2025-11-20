package j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* loaded from: classes.dex */
public final class O extends RestrictedSuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public P f743a;

    /* renamed from: b, reason: collision with root package name */
    public S f744b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f745c;

    /* renamed from: d, reason: collision with root package name */
    public int f746d;

    /* renamed from: e, reason: collision with root package name */
    public int f747e;

    /* renamed from: f, reason: collision with root package name */
    public int f748f;

    /* renamed from: g, reason: collision with root package name */
    public int f749g;

    /* renamed from: h, reason: collision with root package name */
    public long f750h;

    /* renamed from: i, reason: collision with root package name */
    public int f751i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f752j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f753k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f754l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s2, P p2, Continuation continuation) {
        super(2, continuation);
        this.f753k = s2;
        this.f754l = p2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        O o2 = new O(this.f753k, this.f754l, continuation);
        o2.f752j = obj;
        return o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:23:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0092 -> B:20:0x0095). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f751i
            r3 = 1
            r5 = 8
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            int r2 = r0.f749g
            int r6 = r0.f748f
            long r7 = r0.f750h
            int r9 = r0.f747e
            int r10 = r0.f746d
            long[] r11 = r0.f745c
            j.S r12 = r0.f744b
            j.P r13 = r0.f743a
            java.lang.Object r14 = r0.f752j
            kotlin.sequences.SequenceScope r14 = (kotlin.sequences.SequenceScope) r14
            kotlin.ResultKt.throwOnFailure(r22)
            goto L95
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r0.f752j
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            j.S r6 = r0.f753k
            long[] r7 = r6.f824a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La5
            j.P r9 = r0.f754l
            r10 = 0
        L43:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La0
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L66:
            if (r2 >= r6) goto L98
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L95
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f755a = r15
            java.lang.Object[] r4 = r12.f825b
            r4 = r4[r15]
            r0.f752j = r14
            r0.f743a = r13
            r0.f744b = r12
            r0.f745c = r11
            r0.f746d = r10
            r0.f747e = r9
            r0.f750h = r7
            r0.f748f = r6
            r0.f749g = r2
            r0.f751i = r3
            java.lang.Object r4 = r14.yield(r4, r0)
            if (r4 != r1) goto L95
            return r1
        L95:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L66
        L98:
            if (r6 != r5) goto La5
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La0:
            if (r10 == r8) goto La5
            int r10 = r10 + 1
            goto L43
        La5:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
