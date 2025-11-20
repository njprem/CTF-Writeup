package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import b.C0599b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1", f = "SearchBar.android.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<C0599b> $currentBackEvent;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<C0599b> $firstBackEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$1$1(Animatable<Float, AnimationVector1D> animatable, boolean z, MutableFloatState mutableFloatState, MutableState<C0599b> mutableState, MutableState<C0599b> mutableState2, Continuation<? super SearchBar_androidKt$SearchBar$1$1> continuation) {
        super(2, continuation);
        this.$animationProgress = animatable;
        this.$expanded = z;
        this.$finalBackProgress = mutableFloatState;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchBar_androidKt$SearchBar$1$1(this.$animationProgress, this.$expanded, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r13)
            goto L66
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            kotlin.ResultKt.throwOnFailure(r13)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r13 <= 0) goto L43
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto L43
            androidx.compose.animation.core.FiniteAnimationSpec r13 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p()
        L41:
            r6 = r13
            goto L51
        L43:
            boolean r13 = r12.$expanded
            if (r13 == 0) goto L4c
            androidx.compose.animation.core.FiniteAnimationSpec r13 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationEnterFloatSpec$p()
            goto L41
        L4c:
            androidx.compose.animation.core.FiniteAnimationSpec r13 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationExitFloatSpec$p()
            goto L41
        L51:
            boolean r13 = r12.$expanded
            if (r13 == 0) goto L56
            r1 = r3
        L56:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 != 0) goto L68
        L66:
            r9 = r12
            goto L7d
        L68:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r12.label = r2
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L7d
            return r0
        L7d:
            boolean r13 = r9.$expanded
            if (r13 != 0) goto L93
            androidx.compose.runtime.MutableFloatState r13 = r9.$finalBackProgress
            r0 = 2143289344(0x7fc00000, float:NaN)
            r13.setFloatValue(r0)
            androidx.compose.runtime.MutableState<b.b> r13 = r9.$firstBackEvent
            r0 = 0
            r13.setValue(r0)
            androidx.compose.runtime.MutableState<b.b> r13 = r9.$currentBackEvent
            r13.setValue(r0)
        L93:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchBar_androidKt$SearchBar$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
