package androidx.compose.runtime;

import j.C0639E;
import j.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)\"\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010$R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003038FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b:\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", "Landroidx/compose/runtime/KeyInfo;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "getNext", "(ILjava/lang/Object;)Landroidx/compose/runtime/KeyInfo;", "keyInfo", "", "recordUsed", "(Landroidx/compose/runtime/KeyInfo;)Z", "from", "to", "", "registerMoveSlot", "(II)V", "count", "registerMoveNode", "(III)V", "insertIndex", "registerInsert", "(Landroidx/compose/runtime/KeyInfo;I)V", "group", "newCount", "updateNodeCount", "(II)Z", "slotPositionOf", "(Landroidx/compose/runtime/KeyInfo;)I", "nodePositionOf", "updatedNodeCountOf", "Ljava/util/List;", "getKeyInfos", "()Ljava/util/List;", "I", "getStartIndex", "()I", "groupIndex", "getGroupIndex", "setGroupIndex", "(I)V", "usedKeys", "Lj/E;", "Landroidx/compose/runtime/GroupInfo;", "groupInfos", "Lj/E;", "Landroidx/compose/runtime/MutableScatterMultiMap;", "keyMap$delegate", "Lkotlin/Lazy;", "getKeyMap-SAeQiB4", "()Lj/N;", "keyMap", "", "getUsed", "used", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Pending {
    private int groupIndex;
    private final C0639E groupInfos;
    private final List<KeyInfo> keyInfos;

    /* renamed from: keyMap$delegate, reason: from kotlin metadata */
    private final Lazy keyMap;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> list, int i2) {
        this.keyInfos = list;
        this.startIndex = i2;
        if (i2 < 0) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        C0639E c0639e = new C0639E();
        int size = list.size();
        int nodes = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = this.keyInfos.get(i3);
            c0639e.h(keyInfo.getLocation(), new GroupInfo(i3, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = c0639e;
        this.keyMap = LazyKt.lazy(new Function0<MutableScatterMultiMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ MutableScatterMultiMap<Object, KeyInfo> invoke() {
                return MutableScatterMultiMap.m3265boximpl(m3275invokeSAeQiB4());
            }

            /* renamed from: invoke-SAeQiB4, reason: not valid java name */
            public final N m3275invokeSAeQiB4() {
                N nMultiMap = ComposerKt.multiMap(this.this$0.getKeyInfos().size());
                Pending pending = this.this$0;
                int size2 = pending.getKeyInfos().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i4);
                    MutableScatterMultiMap.m3271putimpl(nMultiMap, ComposerKt.getJoinedKey(keyInfo2), keyInfo2);
                }
                return nMultiMap;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    /* renamed from: getKeyMap-SAeQiB4, reason: not valid java name */
    public final N m3274getKeyMapSAeQiB4() {
        return ((MutableScatterMultiMap) this.keyMap.getValue()).m3273unboximpl();
    }

    public final KeyInfo getNext(int key, Object dataKey) {
        return (KeyInfo) MutableScatterMultiMap.m3270popimpl(m3274getKeyMapSAeQiB4(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.c(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(KeyInfo keyInfo, int insertIndex) {
        this.groupInfos.h(keyInfo.getLocation(), new GroupInfo(-1, insertIndex, 0));
    }

    public final void registerMoveNode(int from, int to, int count) {
        char c2;
        long j2;
        char c3;
        long j3;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        if (from > to) {
            C0639E c0639e = this.groupInfos;
            Object[] objArr = c0639e.f853c;
            long[] jArr = c0639e.f851a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j5 = jArr[i2];
                if ((((~j5) << c4) & j5 & j4) != j4) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j5 & 255) < 128) {
                            c3 = c4;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i2 << 3) + i4];
                            j3 = j4;
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                groupInfo.setNodeIndex((nodeIndex - from) + to);
                            } else if (to <= nodeIndex && nodeIndex < from) {
                                groupInfo.setNodeIndex(nodeIndex + count);
                            }
                        } else {
                            c3 = c4;
                            j3 = j4;
                        }
                        j5 >>= 8;
                        i4++;
                        c4 = c3;
                        j4 = j3;
                    }
                    c2 = c4;
                    j2 = j4;
                    if (i3 != 8) {
                        return;
                    }
                } else {
                    c2 = c4;
                    j2 = j4;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                c4 = c2;
                j4 = j2;
            }
        } else {
            if (to <= from) {
                return;
            }
            C0639E c0639e2 = this.groupInfos;
            Object[] objArr2 = c0639e2.f853c;
            long[] jArr2 = c0639e2.f851a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j6 = jArr2[i5];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j6 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i5 << 3) + i7];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                groupInfo2.setNodeIndex((nodeIndex2 - from) + to);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                                groupInfo2.setNodeIndex(nodeIndex2 - count);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 == length2) {
                    return;
                } else {
                    i5++;
                }
            }
        }
    }

    public final void registerMoveSlot(int from, int to) {
        char c2;
        long j2;
        char c3;
        long j3;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        if (from > to) {
            C0639E c0639e = this.groupInfos;
            Object[] objArr = c0639e.f853c;
            long[] jArr = c0639e.f851a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j5 = jArr[i2];
                if ((((~j5) << c4) & j5 & j4) != j4) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j5 & 255) < 128) {
                            c3 = c4;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i2 << 3) + i4];
                            j3 = j4;
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == from) {
                                groupInfo.setSlotIndex(to);
                            } else if (to <= slotIndex && slotIndex < from) {
                                groupInfo.setSlotIndex(slotIndex + 1);
                            }
                        } else {
                            c3 = c4;
                            j3 = j4;
                        }
                        j5 >>= 8;
                        i4++;
                        c4 = c3;
                        j4 = j3;
                    }
                    c2 = c4;
                    j2 = j4;
                    if (i3 != 8) {
                        return;
                    }
                } else {
                    c2 = c4;
                    j2 = j4;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                c4 = c2;
                j4 = j2;
            }
        } else {
            if (to <= from) {
                return;
            }
            C0639E c0639e2 = this.groupInfos;
            Object[] objArr2 = c0639e2.f853c;
            long[] jArr2 = c0639e2.f851a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j6 = jArr2[i5];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j6 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i5 << 3) + i7];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == from) {
                                groupInfo2.setSlotIndex(to);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                                groupInfo2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 == length2) {
                    return;
                } else {
                    i5++;
                }
            }
        }
    }

    public final void setGroupIndex(int i2) {
        this.groupIndex = i2;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.c(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int group, int newCount) {
        int nodeIndex;
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.c(group);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = newCount - groupInfo.getNodeCount();
        groupInfo.setNodeCount(newCount);
        if (nodeCount == 0) {
            return true;
        }
        C0639E c0639e = this.groupInfos;
        Object[] objArr = c0639e.f853c;
        long[] jArr = c0639e.f851a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i2 << 3) + i4];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !Intrinsics.areEqual(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.setNodeIndex(nodeIndex);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.groupInfos.c(keyInfo.getLocation());
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
