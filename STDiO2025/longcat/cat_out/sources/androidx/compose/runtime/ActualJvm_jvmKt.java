package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0081\b¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d*\u001e\b\u0000\u0010 \u001a\u0004\b\u0000\u0010\u001e\"\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\u0012\u0004\u0012\u00028\u00000\u001f*\f\b\u0000\u0010!\"\u00020\u00002\u00020\u0000¨\u0006\""}, d2 = {"", "instance", "", "identityHashCode", "(Ljava/lang/Object;)I", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/Composer;", "composer", "", "Landroidx/compose/runtime/Composable;", "composable", "invokeComposable", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", "T", "invokeComposableForResult", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "it", "ensureMutable", "(Ljava/lang/Object;)V", "", "currentThreadId", "()J", "", "currentThreadName", "()Ljava/lang/String;", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "TestOnly", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {
    public static /* synthetic */ void AtomicReference$annotations() {
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }

    public static final void ensureMutable(Object obj) {
    }

    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(Composer composer, Function2<? super Composer, ? super Integer, ? extends T> function2) {
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return (T) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(composer, 1);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3248synchronized(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return rInvoke;
    }
}
