package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a2\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0016"}, d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "MinimumDistance", "TargetDistance", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "animateScrollToItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "index", "", "scrollOffset", "numOfItemsForTeleport", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isItemVisible", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m6233constructorimpl(2500);
    private static final float BoundDistance = Dp.m6233constructorimpl(1500);
    private static final float MinimumDistance = Dp.m6233constructorimpl(50);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, 272}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Density $density;
        final /* synthetic */ int $index;
        final /* synthetic */ int $numOfItemsForTeleport;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i3, int i4, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$index = i2;
            this.$density = density;
            this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
            this.$scrollOffset = i3;
            this.$numOfItemsForTeleport = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3) {
            if (z) {
                if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() > i2) {
                    return true;
                }
                return lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() == i2 && lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() > i3;
            }
            if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() < i2) {
                return true;
            }
            return lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() == i2 && lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() < i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[Catch: ItemFoundInScroll -> 0x00f4, TryCatch #1 {ItemFoundInScroll -> 0x00f4, blocks: (B:27:0x00c5, B:29:0x00c9, B:31:0x00d1, B:33:0x00e5, B:43:0x0102, B:47:0x013f), top: B:90:0x00c5 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e5 A[Catch: ItemFoundInScroll -> 0x00f4, TryCatch #1 {ItemFoundInScroll -> 0x00f4, blocks: (B:27:0x00c5, B:29:0x00c9, B:31:0x00d1, B:33:0x00e5, B:43:0x0102, B:47:0x013f), top: B:90:0x00c5 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0221  */
        /* JADX WARN: Type inference failed for: r1v14, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r7v0, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0190 -> B:98:0x0196). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instructions count: 576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object animateScrollToItem(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, int i4, Density density, Continuation<? super Unit> continuation) {
        Object objScroll = lazyLayoutAnimateScrollScope.scroll(new AnonymousClass2(i2, density, lazyLayoutAnimateScrollScope, i3, i4, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    public static final boolean isItemVisible(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2) {
        return i2 <= lazyLayoutAnimateScrollScope.getLastVisibleItemIndex() && lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i2;
    }
}
