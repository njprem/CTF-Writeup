package androidx.compose.runtime.snapshots;

import j.S;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0010¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0014\u0010)\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"R4\u00102\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010,2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010,8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;)V", "", "hasPendingChanges", "()Z", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "dispose", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "snapshots", "I", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getWriteObserver$runtime_release", "writeObserver", "Lj/S;", "value", "getModified$runtime_release", "()Lj/S;", "setModified", "(Lj/S;)V", "modified", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;

    public ReadonlySnapshot(int i2, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1) {
        super(i2, snapshotIdSet, null);
        this.readObserver = function1;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        mo3380nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getModified$runtime_release */
    public S getModified() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo3379nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo3380nestedDeactivated$runtime_release(Snapshot snapshot) {
        int i2 = this.snapshots - 1;
        this.snapshots = i2;
        if (i2 == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo3381recordModified$runtime_release(StateObject state) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    public void setModified(S s2) {
        throw androidx.compose.runtime.changelist.a.u();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> readObserver) {
        SnapshotKt.validateOpen(this);
        return new NestedReadonlySnapshot(getId(), getInvalid(), SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver(), false, 4, null), this);
    }
}
