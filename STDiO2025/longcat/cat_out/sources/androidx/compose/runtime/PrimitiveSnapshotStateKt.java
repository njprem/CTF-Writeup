package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"androidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(FloatState floatState, Object obj, KProperty<?> kProperty) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, kProperty);
    }

    public static final MutableFloatState mutableFloatStateOf(float f2) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f2);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, KProperty<?> kProperty, float f2) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, kProperty, f2);
    }
}
