package androidx.compose.material3;

import J.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aR/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "()V", "<set-?>", "Landroidx/compose/material3/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "showSnackbar", "Landroidx/compose/material3/SnackbarResult;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "SnackbarVisualsImpl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: currentSnackbarData$delegate, reason: from kotlin metadata */
    private final MutableState currentSnackbarData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material3/SnackbarResult;", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlinx/coroutines/CancellableContinuation;)V", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", "dismiss", "", "equals", "", "other", "", "hashCode", "", "performAction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SnackbarDataImpl implements SnackbarData {
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarVisuals visuals;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, CancellableContinuation<? super SnackbarResult> cancellableContinuation) {
            this.visuals = snackbarVisuals;
            this.continuation = cancellableContinuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                CancellableContinuation<SnackbarResult> cancellableContinuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m6498constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || SnackbarDataImpl.class != other.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) other;
            return Intrinsics.areEqual(getVisuals(), snackbarDataImpl.getVisuals()) && Intrinsics.areEqual(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return this.continuation.hashCode() + (getVisuals().hashCode() * 31);
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                CancellableContinuation<SnackbarResult> cancellableContinuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m6498constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", "message", "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getMessage", "getWithDismissAction", "()Z", "equals", "other", "", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z;
            this.duration = snackbarDuration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || SnackbarVisualsImpl.class != other.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) other;
            return Intrinsics.areEqual(getMessage(), snackbarVisualsImpl.getMessage()) && Intrinsics.areEqual(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return getDuration().hashCode() + d.i(getWithDismissAction(), (iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31, 31);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {446, 449}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.material3.SnackbarHostState$showSnackbar$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, continuation);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }

    public final Object showSnackbar(String str, String str2, boolean z, SnackbarDuration snackbarDuration, Continuation<? super SnackbarResult> continuation) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z, snackbarDuration), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r8, kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SnackbarHostState.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r8 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r8 = (androidx.compose.material3.SnackbarHostState.AnonymousClass2) r8
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3e
            goto La9
        L3e:
            r9 = move-exception
            goto Lb2
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L49:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L70
        L5b:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L6f
            goto La4
        L6f:
            r6 = r7
        L70:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9c
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L9c
            r0.L$3 = r0     // Catch: java.lang.Throwable -> L9c
            r0.label = r3     // Catch: java.lang.Throwable -> L9c
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L9c
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.initCancellability()     // Catch: java.lang.Throwable -> L9c
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r3 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r8, r2)     // Catch: java.lang.Throwable -> L9c
            access$setCurrentSnackbarData(r6, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = r2.getResult()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L9c
            if (r8 != r2) goto La2
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L9c
            goto La2
        L9c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto Lb2
        La2:
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        La9:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb0
            r8.unlock(r5)
            return r9
        Lb0:
            r9 = move-exception
            goto Lb6
        Lb2:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r9     // Catch: java.lang.Throwable -> Lb0
        Lb6:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
