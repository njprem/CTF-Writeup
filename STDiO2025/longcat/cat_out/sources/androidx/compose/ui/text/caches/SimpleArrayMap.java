package androidx.compose.ui.text.caches;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0017\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0005J\u0013\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0005H\u0004J\u0010\u0010)\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\b\u0010*\u001a\u00020\u0005H\u0004J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0001H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u0018J\u0013\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0005¢\u0006\u0002\u00101J\u001d\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010%J\u001e\u00103\u001a\u00020\u00162\u0016\u00104\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000J\u001d\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010%J\u0015\u00106\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u001b\u00106\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u00107J\u0015\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u00100\u001a\u00020\u0005¢\u0006\u0002\u00101J\u001d\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010%J#\u00109\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00012\u0006\u0010;\u001a\u00028\u0001¢\u0006\u0002\u0010<J\u001b\u0010=\u001a\u00028\u00012\u0006\u00100\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020@H\u0016J\u0013\u0010A\u001a\u00028\u00012\u0006\u00100\u001a\u00020\u0005¢\u0006\u0002\u00101R\u001a\u0010\t\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00058G¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u000b¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/caches/SimpleArrayMap;", "K", "V", "", "capacity", "", "(I)V", "map", "(Landroidx/compose/ui/text/caches/SimpleArrayMap;)V", "_size", "get_size", "()I", "set_size", "hashes", "", "keyValues", "", "[Ljava/lang/Object;", "size", "size$annotations", "()V", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "indexOf", "hash", "indexOfKey", "indexOfNull", "indexOfValue", "indexOfValue$ui_text_release", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "array", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SimpleArrayMap<K, V> {
    public static final int $stable = 8;
    private int _size;
    private int[] hashes;
    private Object[] keyValues;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ void size$annotations() {
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public final boolean containsValue(V value) {
        return indexOfValue$ui_text_release(value) >= 0;
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i2 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, minimumCapacity << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
        }
        if (this._size != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) other;
                int i2 = this._size;
                if (i2 != simpleArrayMap._size) {
                    return false;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    K kKeyAt = keyAt(i3);
                    V vValueAt = valueAt(i3);
                    Object obj = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(vValueAt, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i4 = this._size;
            for (int i5 = 0; i5 < i4; i5++) {
                K kKeyAt2 = keyAt(i5);
                V vValueAt2 = valueAt(i5);
                Object obj2 = ((Map) other).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(vValueAt2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final V get(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return (V) this.keyValues[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K key, V defaultValue) {
        int iIndexOfKey = indexOfKey(key);
        return iIndexOfKey >= 0 ? (V) this.keyValues[(iIndexOfKey << 1) + 1] : defaultValue;
    }

    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i2 = this._size;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final int indexOf(Object key, int hash) {
        int i2 = this._size;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i2, hash);
        if (iBinarySearchInternal < 0 || Intrinsics.areEqual(key, this.keyValues[iBinarySearchInternal << 1])) {
            return iBinarySearchInternal;
        }
        int i3 = iBinarySearchInternal + 1;
        while (i3 < i2 && this.hashes[i3] == hash) {
            if (Intrinsics.areEqual(key, this.keyValues[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearchInternal - 1; i4 >= 0 && this.hashes[i4] == hash; i4--) {
            if (Intrinsics.areEqual(key, this.keyValues[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int indexOfKey(Object key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    public final int indexOfNull() {
        int i2 = this._size;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i2, 0);
        if (iBinarySearchInternal < 0 || this.keyValues[iBinarySearchInternal << 1] == null) {
            return iBinarySearchInternal;
        }
        int i3 = iBinarySearchInternal + 1;
        while (i3 < i2 && this.hashes[i3] == 0) {
            if (this.keyValues[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearchInternal - 1; i4 >= 0 && this.hashes[i4] == 0; i4--) {
            if (this.keyValues[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int indexOfValue$ui_text_release(V value) {
        int i2 = this._size << 1;
        Object[] objArr = this.keyValues;
        if (value == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (Intrinsics.areEqual(value, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this._size <= 0;
    }

    public final K keyAt(int index) {
        return (K) this.keyValues[index << 1];
    }

    public final V put(K key, V value) {
        int iHashCode;
        int iIndexOf;
        int i2 = this._size;
        if (key == null) {
            iIndexOf = indexOfNull();
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
            iIndexOf = indexOf(key, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i3 = (iIndexOf << 1) + 1;
            Object[] objArr = this.keyValues;
            V v2 = (V) objArr[i3];
            objArr[i3] = value;
            return v2;
        }
        int i4 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i5 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i2 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.hashes;
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.keyValues;
            ArraysKt.copyInto(objArr2, objArr2, i6 << 1, i4 << 1, this._size << 1);
        }
        int i7 = this._size;
        if (i2 == i7) {
            int[] iArr3 = this.hashes;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i8 = i4 << 1;
                objArr3[i8] = key;
                objArr3[i8 + 1] = value;
                this._size = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(SimpleArrayMap<? extends K, ? extends V> array) {
        int i2 = array._size;
        ensureCapacity(this._size + i2);
        if (this._size != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(array.keyAt(i3), array.valueAt(i3));
            }
        } else if (i2 > 0) {
            ArraysKt___ArraysJvmKt.copyInto(array.hashes, this.hashes, 0, 0, i2);
            ArraysKt.copyInto(array.keyValues, this.keyValues, 0, 0, i2 << 1);
            this._size = i2;
        }
    }

    public final V putIfAbsent(K key, V value) {
        V v2 = get(key);
        return v2 == null ? put(key, value) : v2;
    }

    public final V remove(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public final V removeAt(int index) {
        Object[] objArr = this.keyValues;
        int i2 = index << 1;
        V v2 = (V) objArr[i2 + 1];
        int i3 = this._size;
        if (i3 <= 1) {
            clear();
            return v2;
        }
        int i4 = i3 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (index < i4) {
                int i5 = index + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, index, i5, i3);
                Object[] objArr2 = this.keyValues;
                ArraysKt.copyInto(objArr2, objArr2, i2, i5 << 1, i3 << 1);
            }
            Object[] objArr3 = this.keyValues;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArr2 = new int[i7];
            this.hashes = iArr2;
            this.keyValues = new Object[i7 << 1];
            if (index > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, index);
                ArraysKt.copyInto(objArr, this.keyValues, 0, 0, i2);
            }
            if (index < i4) {
                int i8 = index + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.hashes, index, i8, i3);
                ArraysKt.copyInto(objArr, this.keyValues, i2, i8 << 1, i3 << 1);
            }
        }
        if (i3 != this._size) {
            throw new ConcurrentModificationException();
        }
        this._size = i4;
        return v2;
    }

    public final V replace(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, value);
        }
        return null;
    }

    public final V setValueAt(int index, V value) {
        int i2 = (index << 1) + 1;
        Object[] objArr = this.keyValues;
        V v2 = (V) objArr[i2];
        objArr[i2] = value;
        return v2;
    }

    public final void set_size(int i2) {
        this._size = i2;
    }

    public final int size() {
        return this._size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i3);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i3);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final V valueAt(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }

    public SimpleArrayMap(int i2) {
        if (i2 == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i2];
            this.keyValues = new Object[i2 << 1];
        }
        this._size = 0;
    }

    public final boolean remove(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(value, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public final boolean replace(K key, V oldValue, V newValue) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || valueAt(iIndexOfKey) != oldValue) {
            return false;
        }
        setValueAt(iIndexOfKey, newValue);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }
}
