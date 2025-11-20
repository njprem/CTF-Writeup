package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.PreconditionsKt;
import j.S;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 [2\u00020\u0001:\u0001[B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0000H ¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0000H ¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H ¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\bH ¢\u0006\u0004\b(\u0010\nJ\u000f\u0010+\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0010¢\u0006\u0004\b,\u0010\nJ\u000f\u0010/\u001a\u00020\bH\u0010¢\u0006\u0004\b.\u0010\nJ\u000f\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u0010\nJ\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u0010\nJ\u000f\u00106\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u00105R\"\u0010\u0005\u001a\u00020\u00048\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00028\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u00105\"\u0004\b?\u0010@R\"\u0010A\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u0011\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bF\u0010=\u0012\u0004\bG\u0010\nR$\u0010K\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bI\u00105\"\u0004\bJ\u0010@R\u0014\u0010M\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0018R\u0014\u0010O\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0011R\u0015\u0010Q\u001a\u00020\u000f8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0011R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X¡\u0004¢\u0006\f\u0012\u0004\bT\u0010\n\u001a\u0004\bR\u0010SR\"\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u001c\u0010Z\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010W8 X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0001\u0004\\]^_¨\u0006`"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "dispose", "()V", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "()Z", "T", "Lkotlin/Function0;", "block", "enter", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "makeCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "restoreCurrent", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime_release", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "closeAndReleasePinning$runtime_release", "closeAndReleasePinning", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime_release", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotLocked", "takeoverPinnedSnapshot$runtime_release", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "<set-?>", "I", "getId", "setId$runtime_release", "(I)V", "disposed", "Z", "getDisposed$runtime_release", "setDisposed$runtime_release", "(Z)V", "pinningTrackingHandle", "getPinningTrackingHandle$annotations", "value", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getRoot", "root", "getReadOnly", "readOnly", "isPinned$runtime_release", "isPinned", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "getWriteObserver$runtime_release", "writeObserver", "Lj/S;", "getModified$runtime_release", "()Lj/S;", "modified", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private int id;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0001J\"\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0086\b¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0001J\u0006\u0010\u001f\u001a\u00020 JO\u0010!\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0004H\u0007J&\u0010'\u001a\u00020(2\u001e\u0010)\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010+\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0*J\u001a\u0010,\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 0#J\n\u0010-\u001a\u0004\u0018\u00010\u0007H\u0001J\u0012\u0010.\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0001J0\u0010/\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020\u00072\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#H\u0001J\u0006\u00101\u001a\u00020 J6\u00102\u001a\u0002032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#J\u001e\u00104\u001a\u00020\u00072\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#J\"\u00105\u001a\u0002H6\"\u0004\b\u0000\u001062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H60\u001bH\u0086\b¢\u0006\u0002\u0010\u001cJ4\u00107\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\b8H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\tR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0011\u001a\u00020\u000e*\u00020\u00128Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0011\u001a\u00020\u000e*\u00020\u00158Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u00069"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "()V", "PreexistingSnapshotId", "", "getPreexistingSnapshotId$annotations", "current", "Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "currentThreadSnapshot", "getCurrentThreadSnapshot$annotations", "getCurrentThreadSnapshot", "isApplyObserverNotificationPending", "", "()Z", "isInSnapshot", "canBeReused", "Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "getCanBeReused", "(Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;)Z", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "(Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;)Z", "createNonObservableSnapshot", "global", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "makeCurrentNonObservable", "previous", "notifyObjectsInitialized", "", "observe", "readObserver", "Lkotlin/Function1;", "writeObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "openSnapshotCount", "registerApplyObserver", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observer", "Lkotlin/Function2;", "", "registerGlobalWriteObserver", "removeCurrent", "restoreCurrent", "restoreNonObservable", "nonObservable", "sendApplyNotifications", "takeMutableSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeSnapshot", "withMutableSnapshot", "R", "withoutReadObservation", "Landroidx/compose/runtime/DisallowComposableCalls;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId() == ActualJvm_jvmKt.currentThreadId();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function12, Function0 function0, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$6(Function2 function2) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = CollectionsKt___CollectionsKt.minus(SnapshotKt.applyObservers, function2);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$9(Function1 function1) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = CollectionsKt___CollectionsKt.minus(SnapshotKt.globalWriteObservers, function1);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function12, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), null, false, 6, null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.threadSnapshot.get();
        }

        public final <T> T global(Function0<? extends T> block) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            T tInvoke = block.invoke();
            Snapshot.INSTANCE.restoreCurrent(snapshotRemoveCurrent);
            return tInvoke;
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.pendingApplyObserverCount.get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.threadSnapshot.get() != null;
        }

        public final Snapshot makeCurrentNonObservable(Snapshot previous) {
            if (previous instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) previous;
                if (transparentObserverMutableSnapshot.getThreadId() == ActualJvm_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver(null);
                    return previous;
                }
            }
            if (previous instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) previous;
                if (transparentObserverSnapshot.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver(null);
                    return previous;
                }
            }
            Snapshot snapshotCreateTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(previous, null, false, 6, null);
            snapshotCreateTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return snapshotCreateTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver, Function0<? extends T> block) {
            Snapshot transparentObserverMutableSnapshot;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId() == ActualJvm_jvmKt.currentThreadId()) {
                    Function1<Object, Unit> readObserver$runtime_release = transparentObserverMutableSnapshot2.getReadObserver();
                    Function1<Object, Unit> writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver$runtime_release();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.mergedReadObserver$default(readObserver, readObserver$runtime_release, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(SnapshotKt.mergedWriteObserver(writeObserver, writeObserver$runtime_release));
                        return block.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver(readObserver$runtime_release);
                        transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T tInvoke = block.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return tInvoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        public final int openSnapshotCount() {
            return CollectionsKt.toList(SnapshotKt.openSnapshots).size();
        }

        public final ObserverHandle registerApplyObserver(Function2<? super Set<? extends Object>, ? super Snapshot, Unit> observer) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = CollectionsKt.plus((Collection<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>>) SnapshotKt.applyObservers, observer);
                Unit unit = Unit.INSTANCE;
            }
            return new a(observer, 0);
        }

        public final ObserverHandle registerGlobalWriteObserver(Function1<Object, Unit> observer) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = CollectionsKt.plus((Collection<? extends Function1<Object, Unit>>) SnapshotKt.globalWriteObservers, observer);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new a(observer, 1);
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot previous) {
            if (previous != null) {
                SnapshotKt.threadSnapshot.set(previous);
            }
        }

        public final void restoreNonObservable(Snapshot previous, Snapshot nonObservable, Function1<Object, Unit> observer) {
            if (previous != nonObservable) {
                nonObservable.restoreCurrent(previous);
                nonObservable.dispose();
            } else if (previous instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) previous).setReadObserver(observer);
            } else if (previous instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) previous).setReadObserver(observer);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void sendApplyNotifications() {
            boolean z;
            synchronized (SnapshotKt.getLock()) {
                S modified$runtime_release = ((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getModified$runtime_release();
                z = false;
                if (modified$runtime_release != null) {
                    if (modified$runtime_release.c()) {
                        z = true;
                    }
                }
            }
            if (z) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        public final Snapshot takeSnapshot(Function1<Object, Unit> readObserver) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(readObserver);
        }

        public final <R> R withMutableSnapshot(Function0<? extends R> block) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    R rInvoke = block.invoke();
                    InlineMarker.finallyStart(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    InlineMarker.finallyEnd(1);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    return rInvoke;
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } finally {
                InlineMarker.finallyStart(1);
                mutableSnapshotTakeMutableSnapshot$default.dispose();
                InlineMarker.finallyEnd(1);
            }
        }

        public final <T> T withoutReadObservation(Function0<? extends T> block) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                InlineMarker.finallyEnd(1);
            }
        }

        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId();
        }
    }

    public /* synthetic */ Snapshot(int i2, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, snapshotIdSet);
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        return snapshot.takeNestedSnapshot(function1);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final <T> T enter(Function0<? extends T> block) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            restoreCurrent(snapshotMakeCurrent);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: getDisposed$runtime_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    /* renamed from: getInvalid$runtime_release, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    public abstract S getModified$runtime_release();

    public abstract Function1<Object, Unit> getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract Function1<Object, Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo3379nestedActivated$runtime_release(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo3380nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo3381recordModified$runtime_release(StateObject state);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i2 = this.pinningTrackingHandle;
        if (i2 >= 0) {
            SnapshotKt.releasePinningLocked(i2);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public void setId$runtime_release(int i2) {
        this.id = i2;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setWriteCount$runtime_release(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot takeNestedSnapshot(Function1<Object, Unit> readObserver);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i2 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i2;
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot oldSnapshot) {
        if (!(SnapshotKt.threadSnapshot.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(oldSnapshot);
    }

    public final void validateNotDisposed$runtime_release() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    private Snapshot(int i2, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i2;
        this.pinningTrackingHandle = i2 != 0 ? SnapshotKt.trackPinning(i2, getInvalid()) : -1;
    }
}
