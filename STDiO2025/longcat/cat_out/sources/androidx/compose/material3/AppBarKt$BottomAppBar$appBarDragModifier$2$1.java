package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {877}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppBarKt$BottomAppBar$appBarDragModifier$2$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$appBarDragModifier$2$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Continuation<? super AppBarKt$BottomAppBar$appBarDragModifier$2$1> continuation) {
        super(3, continuation);
        this.$scrollBehavior = bottomAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f2, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f2.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            float f2 = this.F$0;
            BottomAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            if (AppBarKt.settleAppBarBottom(state, f2, flingAnimationSpec, snapAnimationSpec, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public final Object invoke(CoroutineScope coroutineScope, float f2, Continuation<? super Unit> continuation) {
        AppBarKt$BottomAppBar$appBarDragModifier$2$1 appBarKt$BottomAppBar$appBarDragModifier$2$1 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(this.$scrollBehavior, continuation);
        appBarKt$BottomAppBar$appBarDragModifier$2$1.F$0 = f2;
        return appBarKt$BottomAppBar$appBarDragModifier$2$1.invokeSuspend(Unit.INSTANCE);
    }
}
