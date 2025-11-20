package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, KProperty<?> kProperty) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, kProperty);
    }

    public static final MutableIntState mutableIntStateOf(int i2) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i2);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, KProperty<?> kProperty, int i2) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, kProperty, i2);
    }
}
