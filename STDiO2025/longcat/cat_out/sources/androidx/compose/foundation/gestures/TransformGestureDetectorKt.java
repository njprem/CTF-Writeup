package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a~\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "centroid", "pan", "zoom", "rotation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    public static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$panZoomLock = z;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m469anglek4lQ0M(long j2) {
        if (Offset.m3551getXimpl(j2) == 0.0f && Offset.m3552getYimpl(j2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m3551getXimpl(j2), Offset.m3552getYimpl(j2)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        long jM3567getZeroF1C5BW0 = Offset.INSTANCE.m3567getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM3567getZeroF1C5BW0 = Offset.m3556plusMKHz9U(jM3567getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i2++;
            }
        }
        return i2 == 0 ? Offset.INSTANCE.m3566getUnspecifiedF1C5BW0() : Offset.m3546divtuRUvjQ(jM3567getZeroF1C5BW0, i2);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z);
        float fM3549getDistanceimpl = 0.0f;
        if (Offset.m3548equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m3566getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                i2++;
                fM3549getDistanceimpl = Offset.m3549getDistanceimpl(Offset.m3555minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid)) + fM3549getDistanceimpl;
            }
        }
        return fM3549getDistanceimpl / i2;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m3548equalsimpl0(jCalculateCentroid, companion.m3566getUnspecifiedF1C5BW0()) ? companion.m3567getZeroF1C5BW0() : Offset.m3555minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i2);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size2; i5++) {
            PointerInputChange pointerInputChange2 = changes2.get(i5);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM3555minusMKHz9U = Offset.m3555minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM3555minusMKHz9U2 = Offset.m3555minusMKHz9U(position, jCalculateCentroid);
                float fM469anglek4lQ0M = m469anglek4lQ0M(jM3555minusMKHz9U2) - m469anglek4lQ0M(jM3555minusMKHz9U);
                float fM3549getDistanceimpl = Offset.m3549getDistanceimpl(Offset.m3556plusMKHz9U(jM3555minusMKHz9U2, jM3555minusMKHz9U)) / 2.0f;
                if (fM469anglek4lQ0M > 180.0f) {
                    fM469anglek4lQ0M -= 360.0f;
                } else if (fM469anglek4lQ0M < -180.0f) {
                    fM469anglek4lQ0M += 360.0f;
                }
                f3 += fM469anglek4lQ0M * fM3549getDistanceimpl;
                f2 += fM3549getDistanceimpl;
            }
        }
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f3 / f2;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(z, function4, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, Function4 function4, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, function4, continuation);
    }
}
