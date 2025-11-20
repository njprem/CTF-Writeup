package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import j.C0645K;
import j.N;
import j.S;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00017B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0016\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002J\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0001J)\u0010!\u001a\u00020\u00052!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0003J\b\u0010#\u001a\u00020\u0015H\u0002J&\u0010$\u001a\u00020\u0011\"\b\b\u0000\u0010%*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001d\u0010'\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001e\u0010)\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010+\u001a\u00020\rH\u0007J?\u0010,\u001a\u00020\u0005\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010 \u001a\u0002H%2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002J\u001d\u00100\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\bJ\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0005H\u0002J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u00020\u0005J\u0016\u00106\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMapThreadId", "", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", "scope", "clearIf", "predicate", "drainChanges", "ensureMap", "T", "onChanged", "forEachScopeMap", "block", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "removeScopeMapIf", "report", "", "sendNotifications", "start", "stop", "withNoObservations", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
            this.this$0.addChanges(set);
            if (this.this$0.drainChanges()) {
                this.this$0.sendNotifications();
            }
        }
    };
    private final Function1<Object, Unit> readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            if (this.this$0.isPaused) {
                return;
            }
            MutableVector mutableVector = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Set<? extends Object> setPlus;
        while (true) {
            Object obj = this.pendingChanges.get();
            if (obj == null) {
                setPlus = set;
            } else if (obj instanceof Set) {
                setPlus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                setPlus = CollectionsKt___CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, setPlus)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        ObservedScopeMap[] content = mutableVector.getContent();
                        int i2 = 0;
                        do {
                            z2 = content[i2].recordInvalidation(setRemoveChanges) || z2;
                            i2++;
                        } while (i2 < size);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                observedScopeMap = content[i2];
                if (observedScopeMap.getOnChanged() == onChanged) {
                    break;
                }
                i2++;
            } while (i2 < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i2 = 0;
                    do {
                        block.invoke(content[i2]);
                        i2++;
                    } while (i2 < size);
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    private final Set<Object> removeChanges() {
        Set<Object> set;
        while (true) {
            Object obj = this.pendingChanges.get();
            Object objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, objSubList)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return set;
        }
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (block.invoke(mutableVector.getContent()[i3]).booleanValue()) {
                        i2++;
                    } else if (i2 > 0) {
                        mutableVector.getContent()[i3 - i2] = mutableVector.getContent()[i3];
                    }
                }
                int i4 = size - i2;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i4, size);
                mutableVector.setSize(i4);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                do {
                    MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                    int size = mutableVector2.getSize();
                                    if (size > 0) {
                                        Object[] content = mutableVector2.getContent();
                                        int i2 = 0;
                                        do {
                                            ((ObservedScopeMap) content[i2]).notifyInvalidatedScopes();
                                            i2++;
                                        } while (i2 < size);
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    public final void clear(Object scope) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ObservedScopeMap observedScopeMap = mutableVector.getContent()[i3];
                    observedScopeMap.clearScopeObservations(scope);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i2++;
                    } else if (i2 > 0) {
                        mutableVector.getContent()[i3 - i2] = mutableVector.getContent()[i3];
                    }
                }
                int i4 = size - i2;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i4, size);
                mutableVector.setSize(i4);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ObservedScopeMap observedScopeMap = mutableVector.getContent()[i3];
                    observedScopeMap.removeScopeIf(predicate);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i2++;
                    } else if (i2 > 0) {
                        mutableVector.getContent()[i3 - i2] = mutableVector.getContent()[i3];
                    }
                }
                int i4 = size - i2;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i4, size);
                mutableVector.setSize(i4);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyChanges(Set<? extends Object> changes, Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        synchronized (this.observedScopeMaps) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j2 = this.currentMapThreadId;
        if (j2 != -1) {
            if (!(j2 == ActualJvm_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            this.currentMapThreadId = ActualJvm_jvmKt.currentThreadId();
            observedScopeMapEnsureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j2;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(Function0<Unit> block) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J7\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0011J0\u0010\u001e\u001a\u00020\u00032!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001c0\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00032\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\"R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030'038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00105R<\u0010H\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0006\u0012\u0004\u0018\u00010\u00010Fj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0006\u0012\u0004\u0018\u00010\u0001`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "currentToken", "currentScope", "Lj/K;", "recordedValues", "recordRead", "(Ljava/lang/Object;ILjava/lang/Object;Lj/K;)V", "scope", "clearObsoleteStateReads", "(Ljava/lang/Object;)V", "removeObservation", "(Ljava/lang/Object;Ljava/lang/Object;)V", "readObserver", "Lkotlin/Function0;", "block", "observe", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "clearScopeObservations", "Lkotlin/ParameterName;", "name", "", "predicate", "removeScopeIf", "hasScopeObservations", "()Z", "clear", "()V", "", "changes", "recordInvalidation", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/DerivedState;", "derivedState", "rereadDerivedState", "(Landroidx/compose/runtime/DerivedState;)V", "notifyInvalidatedScopes", "Lkotlin/jvm/functions/Function1;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/Object;", "currentScopeReads", "Lj/K;", "I", "Landroidx/compose/runtime/collection/ScopeMap;", "valueToScopes", "Landroidx/compose/runtime/collection/ScopeMap;", "Lj/N;", "scopeToValues", "Lj/N;", "Lj/S;", "invalidated", "Lj/S;", "Landroidx/compose/runtime/collection/MutableVector;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ObservedScopeMap {
        private Object currentScope;
        private C0645K currentScopeReads;
        private int deriveStateScopeCount;
        private final Function1<Object, Unit> onChanged;
        private int currentToken = -1;
        private final ScopeMap<Object, Object> valueToScopes = new ScopeMap<>();
        private final N scopeToValues = new N();
        private final S invalidated = new S();
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                observedScopeMap.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount++;
            }
        };
        private final ScopeMap<Object, DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }

        private final void clearObsoleteStateReads(Object scope) {
            int i2 = this.currentToken;
            C0645K c0645k = this.currentScopeReads;
            if (c0645k == null) {
                return;
            }
            long[] jArr = c0645k.f765a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = c0645k.f766b[i6];
                            boolean z = c0645k.f767c[i6] != i2;
                            if (z) {
                                removeObservation(scope, obj);
                            }
                            if (z) {
                                c0645k.f(i6);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        }

        private final void removeObservation(Object scope, Object value) {
            this.valueToScopes.remove(value, scope);
            if (!(value instanceof DerivedState) || this.valueToScopes.contains(value)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.d();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object scope) {
            C0645K c0645k = (C0645K) this.scopeToValues.h(scope);
            if (c0645k == null) {
                return;
            }
            Object[] objArr = c0645k.f766b;
            int[] iArr = c0645k.f767c;
            long[] jArr = c0645k.f765a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            removeObservation(scope, obj);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.f804e != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void notifyInvalidatedScopes() {
            /*
                r17 = this;
                r0 = r17
                j.S r1 = r0.invalidated
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r2 = r0.onChanged
                java.lang.Object[] r3 = r1.f825b
                long[] r4 = r1.f824a
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.notifyInvalidatedScopes():void");
        }

        public final void observe(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            Object obj = this.currentScope;
            C0645K c0645k = this.currentScopeReads;
            int i2 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = (C0645K) this.scopeToValues.b(scope);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(derivedStateObserver);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = c0645k;
                this.currentToken = i2;
            } catch (Throwable th) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x029d A[PHI: r11
          0x029d: PHI (r11v42 boolean) = (r11v41 boolean), (r11v43 boolean) binds: [B:109:0x0274, B:117:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:177:0x040a A[PHI: r13
          0x040a: PHI (r13v5 boolean) = (r13v4 boolean), (r13v7 boolean) binds: [B:168:0x03dd, B:176:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x04c9 A[PHI: r11
          0x04c9: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:205:0x04a0, B:213:0x04c7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x04e8  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0154 A[PHI: r39
          0x0154: PHI (r39v2 boolean) = (r39v1 boolean), (r39v4 boolean) binds: [B:47:0x0128, B:56:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0232 A[PHI: r11
          0x0232: PHI (r11v51 boolean) = (r11v50 boolean), (r11v52 boolean) binds: [B:87:0x0209, B:95:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean recordInvalidation(java.util.Set<? extends java.lang.Object> r45) {
            /*
                Method dump skipped, instructions count: 1386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i2 = this.currentToken;
            C0645K c0645k = this.currentScopeReads;
            if (c0645k == null) {
                c0645k = new C0645K();
                this.currentScopeReads = c0645k;
                this.scopeToValues.k(obj, c0645k);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i2, obj, c0645k);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void removeScopeIf(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r34) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.removeScopeIf(kotlin.jvm.functions.Function1):void");
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            N n2 = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object objB = this.valueToScopes.getMap().b(derivedState);
            if (objB == null) {
                return;
            }
            if (!(objB instanceof S)) {
                C0645K c0645k = (C0645K) n2.b(objB);
                if (c0645k == null) {
                    c0645k = new C0645K();
                    n2.k(objB, c0645k);
                    Unit unit = Unit.INSTANCE;
                }
                recordRead(derivedState, id, objB, c0645k);
                return;
            }
            S s2 = (S) objB;
            Object[] objArr = s2.f825b;
            long[] jArr = s2.f824a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            C0645K c0645k2 = (C0645K) n2.b(obj);
                            if (c0645k2 == null) {
                                c0645k2 = new C0645K();
                                n2.k(obj, c0645k2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            recordRead(derivedState, id, obj, c0645k2);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void recordRead(java.lang.Object r21, int r22, java.lang.Object r23, j.C0645K r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r24
                int r4 = r0.deriveStateScopeCount
                if (r4 <= 0) goto Le
                goto Lc2
            Le:
                int r4 = r3.d(r1)
                if (r4 >= 0) goto L17
                int r4 = ~r4
                r6 = -1
                goto L1b
            L17:
                int[] r6 = r3.f767c
                r6 = r6[r4]
            L1b:
                java.lang.Object[] r7 = r3.f766b
                r7[r4] = r1
                int[] r3 = r3.f767c
                r3[r4] = r2
                boolean r3 = r1 instanceof androidx.compose.runtime.DerivedState
                r4 = 2
                if (r3 == 0) goto La8
                if (r6 == r2) goto La8
                r2 = r1
                androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
                androidx.compose.runtime.DerivedState$Record r2 = r2.getCurrentRecord()
                java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r3 = r0.recordedDerivedStateValues
                java.lang.Object r7 = r2.getCurrentValue()
                r3.put(r1, r7)
                j.U r2 = r2.getDependencies()
                androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r3 = r0.dependencyToDerivedStates
                r3.removeScope(r1)
                java.lang.Object[] r7 = r2.f766b
                long[] r2 = r2.f765a
                int r8 = r2.length
                int r8 = r8 - r4
                if (r8 < 0) goto La8
                r10 = 0
            L4c:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L9d
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L66:
                if (r15 >= r13) goto L98
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L90
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r24 = r4
                r4 = r16
                androidx.compose.runtime.snapshots.StateObject r4 = (androidx.compose.runtime.snapshots.StateObject) r4
                boolean r9 = r4 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r9 == 0) goto L8c
                r9 = r4
                androidx.compose.runtime.snapshots.StateObjectImpl r9 = (androidx.compose.runtime.snapshots.StateObjectImpl) r9
                int r5 = androidx.compose.runtime.snapshots.ReaderKind.m3383constructorimpl(r24)
                r9.m3396recordReadInh_f27i8$runtime_release(r5)
            L8c:
                r3.add(r4, r1)
                goto L92
            L90:
                r24 = r4
            L92:
                long r11 = r11 >> r14
                int r15 = r15 + 1
                r4 = r24
                goto L66
            L98:
                r24 = r4
                if (r13 != r14) goto La6
                goto L9f
            L9d:
                r24 = r4
            L9f:
                if (r10 == r8) goto La6
                int r10 = r10 + 1
                r4 = r24
                goto L4c
            La6:
                r2 = -1
                goto Lab
            La8:
                r24 = r4
                goto La6
            Lab:
                if (r6 != r2) goto Lc2
                boolean r2 = r1 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r2 == 0) goto Lbb
                r2 = r1
                androidx.compose.runtime.snapshots.StateObjectImpl r2 = (androidx.compose.runtime.snapshots.StateObjectImpl) r2
                int r3 = androidx.compose.runtime.snapshots.ReaderKind.m3383constructorimpl(r24)
                r2.m3396recordReadInh_f27i8$runtime_release(r3)
            Lbb:
                androidx.compose.runtime.collection.ScopeMap<java.lang.Object, java.lang.Object> r2 = r0.valueToScopes
                r3 = r23
                r2.add(r1, r3)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordRead(java.lang.Object, int, java.lang.Object, j.K):void");
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i2 = 0;
                    do {
                        content[i2].clear();
                        i2++;
                    } while (i2 < size);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
