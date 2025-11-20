package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j2, Continuation<? super ScrollingLogic$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m459toFloatk4lQ0M(nestedScrollScope.mo416scrollByWithOverscrollOzD1aCk(scrollingLogic4.m457reverseIfNeededMKHz9U(scrollingLogic4.m460toOffsettuRUvjQ(pixels)), NestedScrollSource.INSTANCE.m4885getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.this$0;
            Ref.LongRef longRef2 = this.$result;
            long j3 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            long j4 = longRef2.element;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m452toFloatTH1AsA0(j3));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = longRef2;
            this.J$0 = j4;
            this.label = 1;
            Object objPerformFling = flingBehavior.performFling(scrollScope, fReverseIfNeeded, this);
            if (objPerformFling == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
            obj = objPerformFling;
            scrollingLogic2 = scrollingLogic;
            j2 = j4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        longRef.element = scrollingLogic.m453updateQWom1Mo(j2, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return Unit.INSTANCE;
    }
}
