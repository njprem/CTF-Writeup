package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ObserverHandle {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f342b;

    public /* synthetic */ a(Function function, int i2) {
        this.f341a = i2;
        this.f342b = function;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        switch (this.f341a) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$6((Function2) this.f342b);
                break;
            default:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$9((Function1) this.f342b);
                break;
        }
    }
}
