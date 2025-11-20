package androidx.compose.ui.focus;

import androidx.compose.runtime.changelist.a;
import androidx.compose.runtime.collection.MutableVector;
import j.N;
import j.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\u000e\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001f\u001a\u0004\u0018\u00010\u0011*\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/focus/FocusTransactionManager;", "", "<init>", "()V", "", "beginTransaction", "commitTransaction", "cancelTransaction", "T", "Lkotlin/Function0;", "onCancelled", "block", "withNewTransaction", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withExistingTransaction", "Lj/N;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", "states", "Lj/N;", "Landroidx/compose/runtime/collection/MutableVector;", "cancellationListener", "Landroidx/compose/runtime/collection/MutableVector;", "", "ongoingTransaction", "Z", "value", "getUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "setUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private final MutableVector<Function0<Unit>> cancellationListener;
    private boolean ongoingTransaction;
    private final N states;

    public FocusTransactionManager() {
        long[] jArr = d0.f809a;
        this.states = new N();
        this.cancellationListener = new MutableVector<>(new Function0[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        this.states.d();
        int i2 = 0;
        this.ongoingTransaction = false;
        MutableVector<Function0<Unit>> mutableVector = this.cancellationListener;
        int size = mutableVector.getSize();
        if (size > 0) {
            Function0<Unit>[] content = mutableVector.getContent();
            do {
                content[i2].invoke();
                i2++;
            } while (i2 < size);
        }
        this.cancellationListener.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void commitTransaction() {
        /*
            r14 = this;
            j.N r0 = r14.states
            java.lang.Object[] r1 = r0.f801b
            long[] r0 = r0.f800a
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L47
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            r10.commitFocusState$ui_release()
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            j.N r0 = r14.states
            r0.d()
            r14.ongoingTransaction = r3
            androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r14.cancellationListener
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionManager.commitTransaction():void");
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        if (function0 != null) {
            focusTransactionManager.cancellationListener.add(function0);
        }
        if (focusTransactionManager.ongoingTransaction) {
            return function02.invoke();
        }
        try {
            focusTransactionManager.beginTransaction();
            return function02.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            focusTransactionManager.commitTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (function0 != null) {
                focusTransactionManager.cancellationListener.add(function0);
            }
            Object objInvoke = function02.invoke();
            InlineMarker.finallyStart(1);
            focusTransactionManager.commitTransaction();
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            focusTransactionManager.commitTransaction();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final FocusStateImpl getUncommittedFocusState(FocusTargetNode focusTargetNode) {
        return (FocusStateImpl) this.states.b(focusTargetNode);
    }

    public final void setUncommittedFocusState(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        N n2 = this.states;
        if (focusStateImpl == null) {
            throw a.v("requires a non-null focus state");
        }
        n2.k(focusTargetNode, focusStateImpl);
    }

    public final <T> T withExistingTransaction(Function0<Unit> onCancelled, Function0<? extends T> block) {
        if (onCancelled != null) {
            this.cancellationListener.add(onCancelled);
        }
        if (this.ongoingTransaction) {
            return block.invoke();
        }
        try {
            beginTransaction();
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            commitTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T withNewTransaction(Function0<Unit> onCancelled, Function0<? extends T> block) {
        try {
            if (this.ongoingTransaction) {
                cancelTransaction();
            }
            beginTransaction();
            if (onCancelled != null) {
                this.cancellationListener.add(onCancelled);
            }
            T tInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            commitTransaction();
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            commitTransaction();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
