package c;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.BooleanRef f681a;

    /* renamed from: b, reason: collision with root package name */
    public int f682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Function2 function2, k kVar, Continuation continuation) {
        super(2, continuation);
        this.f683c = lVar;
        this.f684d = function2;
        this.f685e = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f683c, this.f684d, this.f685e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f682b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f683c.f657a) {
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.consumeAsFlow(this.f685e.f687b), new i(booleanRef2, null));
                this.f681a = booleanRef2;
                this.f682b = 1;
                if (this.f684d.invoke(flowOnCompletion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        booleanRef = this.f681a;
        ResultKt.throwOnFailure(obj);
        if (!booleanRef.element) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return Unit.INSTANCE;
    }
}
