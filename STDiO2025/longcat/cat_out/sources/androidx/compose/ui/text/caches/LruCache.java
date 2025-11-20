package androidx.compose.ui.text.caches;

import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019J\u0006\u0010\u0007\u001a\u00020\u0005J/\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00012\b\u0010\u001f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\b\u001a\u00020\u0005J\u0015\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0002\u0010%J\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010(\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010)J\u001d\u0010*\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010)J\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,J$\u0010-\u001a\u0002H.\"\u0004\b\u0002\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.00H\u0080\b¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00066"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", "V", "", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "keySet", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "missCount", "monitor", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "putCount", "<set-?>", "size", "()I", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "synchronizedValue", "R", "block", "Lkotlin/Function0;", "synchronizedValue$ui_text_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toString", "", "trimToSize", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class LruCache<K, V> {
    public static final int $stable = 8;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashSet<K> keySet;
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i2;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    private final int safeSizeOf(K key, V value) {
        int iSizeOf = sizeOf(key, value);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    public V create(K key) {
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.createCount;
        }
        return i2;
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V get(K key) {
        synchronized (this.monitor) {
            V v2 = this.map.get(key);
            if (v2 != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.monitor) {
                try {
                    this.createCount++;
                    Object objPut = this.map.put(key, vCreate);
                    this.keySet.remove(key);
                    this.keySet.add(key);
                    if (objPut != 0) {
                        this.map.put(key, objPut);
                        v2 = objPut;
                    } else {
                        this.size = size() + safeSizeOf(key, vCreate);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v2 != null) {
                entryRemoved(false, key, vCreate, v2);
                return v2;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final V put(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            try {
                this.putCount++;
                this.size = size() + safeSizeOf(key, value);
                vPut = this.map.put(key, value);
                if (vPut != null) {
                    this.size = size() - safeSizeOf(key, vPut);
                }
                if (this.keySet.contains(key)) {
                    this.keySet.remove(key);
                }
                this.keySet.add(key);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final V remove(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.monitor) {
            try {
                vRemove = this.map.remove(key);
                this.keySet.remove(key);
                if (vRemove != null) {
                    this.size = size() - safeSizeOf(key, vRemove);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.monitor) {
            this.maxSize = maxSize;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(maxSize);
    }

    public final int size() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(K key, V value) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v2 = this.map.get(next);
                Intrinsics.checkNotNull(v2);
                linkedHashMap.put(next, v2);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(Function0<? extends R> block) {
        R rInvoke;
        synchronized (this.monitor) {
            try {
                rInvoke = block.invoke();
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

    public String toString() {
        String str;
        synchronized (this.monitor) {
            try {
                int i2 = this.hitCount;
                int i3 = this.missCount + i2;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.LruCache.trimToSize(int):void");
    }
}
