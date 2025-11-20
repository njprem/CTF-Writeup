package androidx.compose.runtime.collection;

import J.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\n\"\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a \u0010\u0010\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"MutableVector", "Landroidx/compose/runtime/collection/MutableVector;", "T", "capacity", "", "size", "init", "Lkotlin/Function1;", "mutableVectorOf", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "checkIndex", "", "", "index", "checkSubIndex", "fromIndex", "toIndex", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i2) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[i2], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[i2], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(d.l(i2, "fromIndex (", ") is less than 0."));
        }
        if (i3 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i2, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = function1.invoke(Integer.valueOf(i3));
        }
        return new MutableVector<>(objArr, i2);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
