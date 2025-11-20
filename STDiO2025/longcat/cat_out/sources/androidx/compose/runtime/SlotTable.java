package androidx.compose.runtime;

import J.d;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import j.C0639E;
import j.C0640F;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J?\u0010*\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\b2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%H\u0000¢\u0006\u0004\b(\u0010)J\u008f\u0001\u0010*\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00162\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`32&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000¢\u0006\u0004\b(\u00108J\u0087\u0001\u0010;\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00162\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`32&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000¢\u0006\u0004\b9\u0010:J\u001f\u0010A\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=2\u0006\u0010<\u001a\u00020\u0016H\u0000¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020\u001d¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0004\u0018\u00010$2\u0006\u0010D\u001a\u00020\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020'¢\u0006\u0004\bG\u0010\u0005J\r\u0010H\u001a\u00020'¢\u0006\u0004\bH\u0010\u0005J\r\u0010I\u001a\u00020'¢\u0006\u0004\bI\u0010\u0005J\r\u0010K\u001a\u00020J¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0=2\u0006\u0010D\u001a\u00020\u0016H\u0000¢\u0006\u0004\bM\u0010@J!\u0010R\u001a\u0004\u0018\u00010/2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u0016H\u0000¢\u0006\u0004\bP\u0010QJ\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030SH\u0096\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010V\u001a\u00020/H\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bY\u0010\u001aJ\u0019\u0010Z\u001a\u0004\u0018\u00010>2\u0006\u0010D\u001a\u00020\u0016H\u0002¢\u0006\u0004\bZ\u0010[J'\u0010_\u001a\u00020\u0016*\u00060\\j\u0002`]2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u0016H\u0002¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\bc\u0010bJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\bd\u0010bJ\u0015\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\be\u0010bJ\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\bf\u0010bR$\u0010,\u001a\u00020+2\u0006\u0010g\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010h\u001a\u0004\bi\u0010jR$\u0010-\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010k\u001a\u0004\bl\u0010mR4\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010n\u001a\u0004\bo\u0010pR$\u00101\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010k\u001a\u0004\bq\u0010mR\u0016\u0010r\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010kR$\u0010\u0010\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0010\u0010s\u001a\u0004\bt\u0010CR\"\u0010u\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010k\u001a\u0004\bv\u0010m\"\u0004\bw\u0010xR2\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`38\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}RE\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b&\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R/\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010CR\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "name", "reader", "block", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "", "index", "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", "close", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Lj/E;", "Lj/F;", "calledByMap", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lj/E;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lj/E;)V", "setTo", "target", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "()Z", "group", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "verifyWellFormed", "collectCalledByInformation", "collectSourceInformation", "", "toDebugString", "()Ljava/lang/String;", "slotsOf$runtime_release", "slotsOf", "slotIndex", "slot$runtime_release", "(II)Ljava/lang/Object;", "slot", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "tryAnchor", "findEffectiveRecomposeScope", "(I)Landroidx/compose/runtime/RecomposeScopeImpl;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "emitGroup", "(Ljava/lang/StringBuilder;II)I", "keys", "()Ljava/util/List;", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "<set-?>", "[I", "getGroups", "()[I", "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "Z", "getWriter$runtime_release", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "Lj/E;", "getCalledByMap$runtime_release", "()Lj/E;", "setCalledByMap$runtime_release", "(Lj/E;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;
    private C0639E calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i2, int i3) {
        String sourceInformation;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i2);
        sb.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i2);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (StringsKt__StringsJVMKt.startsWith$default(sourceInformation, "C(", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(sourceInformation, "CC(", false, 2, null))) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInformation, "(", 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInformation, ')', 0, false, 6, (Object) null);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(SlotTableKt.key(this.groups, i2));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2);
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, i2));
        sb.append(", size=");
        sb.append(iGroupSize);
        if (SlotTableKt.hasMark(this.groups, i2)) {
            sb.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i2)) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i2);
        int iEmitGroup = i2 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if (SlotTableKt.hasObjectKey(this.groups, i2)) {
                sb.append(" objectKey=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(this.groups, i2)]), 10));
            }
            if (SlotTableKt.isNode(this.groups, i2)) {
                sb.append(" node=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.nodeIndex(this.groups, i2)]), 10));
            }
            if (SlotTableKt.hasAux(this.groups, i2)) {
                sb.append(" aux=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(this.groups, i2)]), 10));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i5 = iSlotAnchor; i5 < iEmitGroup$dataIndex2; i5++) {
                    if (i5 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i5]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i6 = i2 + iGroupSize;
        while (iEmitGroup < i6) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i3 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i2) {
        return i2 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i2);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int iParentAnchor = group;
        while (iParentAnchor > 0) {
            Iterator<Object> it = new DataIterator(this, iParentAnchor).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && iParentAnchor != group) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            iParentAnchor = SlotTableKt.parentAnchor(this.groups, iParentAnchor);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, C0640F c0640f, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!c0640f.a(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, c0640f, list, booleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (booleanRef.element) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && anchor.getLocation() == slotReader.getCurrentGroup() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                }
            } else {
                booleanRef.element = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final Anchor tryAnchor(int index) {
        int i2;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i2 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, index, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i2, int i3) {
        int i4 = intRef.element;
        int i5 = i4 + 1;
        intRef.element = i5;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i4);
        if ((iParentAnchor == i2) == false) {
            StringBuilder sbQ = d.q("Invalid parent index detected at ", i4, i2, ", expected parent index to be ", " found ");
            sbQ.append(iParentAnchor);
            PreconditionsKt.throwIllegalStateException(sbQ.toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i4) + i4;
        if ((iGroupSize <= slotTable.groupsSize) == false) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i4);
        }
        if ((iGroupSize <= i3) == false) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i4);
        }
        int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i4);
        int iDataAnchor2 = i4 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i5);
        if ((iDataAnchor2 <= slotTable.slots.length) == false) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i4 + " extend past the end of the slot table");
        }
        if ((iDataAnchor <= iDataAnchor2) == false) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i4);
        }
        if ((SlotTableKt.slotAnchor(slotTable.groups, i4) <= iDataAnchor2) == false) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i4);
        }
        if ((iDataAnchor2 - iDataAnchor >= (SlotTableKt.hasAux(slotTable.groups, i4) ? 1 : 0) + ((SlotTableKt.hasObjectKey(slotTable.groups, i4) ? 1 : 0) + (SlotTableKt.isNode(slotTable.groups, i4) ? 1 : 0))) == false) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i4);
        }
        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i4);
        if (((zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i4)] == null) ? false : true) == false) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i4);
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (intRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i4, iGroupSize);
        }
        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i4);
        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i4);
        if ((iNodeCount == iVerifyWellFormed$validateGroup) == false) {
            StringBuilder sbQ2 = d.q("Incorrect node count detected at ", i4, iNodeCount, ", expected ", ", received ");
            sbQ2.append(iVerifyWellFormed$validateGroup);
            PreconditionsKt.throwIllegalStateException(sbQ2.toString());
        }
        int i6 = intRef.element - i4;
        if ((iGroupSize2 == i6) == false) {
            StringBuilder sbQ3 = d.q("Incorrect slot count detected at ", i4, iGroupSize2, ", expected ", ", received ");
            sbQ3.append(i6);
            PreconditionsKt.throwIllegalStateException(sbQ3.toString());
        }
        if (SlotTableKt.containsAnyMark(slotTable.groups, i4)) {
            if (!(i4 <= 0 || SlotTableKt.containsMark(slotTable.groups, i2))) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i2 + " to record it contains a mark because " + i4 + " does");
            }
        }
        if (zIsNode) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = groups.get(i2);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final Anchor anchor(int index) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z = false;
        if (index >= 0 && index < this.groupsSize) {
            z = true;
        }
        if (!z) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, this.groupsSize);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void close$runtime_release(SlotReader reader, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this) {
                try {
                    HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new C0639E();
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.containsMark(this.groups, 0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    /* renamed from: getCalledByMap$runtime_release, reason: from getter */
    public final C0639E getCalledByMap() {
        return this.calledByMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    /* renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int groupIndex, Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndex) + groupIndex;
            int location$runtime_release = anchor.getLocation();
            if (groupIndex <= location$runtime_release && location$runtime_release < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int r21) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.invalidateGroupsWithKey$runtime_release(int):java.util.List");
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(Anchor anchor) {
        int iSearch;
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iSearch), anchor);
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> block) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            InlineMarker.finallyStart(1);
            slotReaderOpenReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime_release(C0639E c0639e) {
        this.calledByMap = c0639e;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, C0639E calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final void setVersion$runtime_release(int i2) {
        this.version = i2;
    }

    public final Object slot$runtime_release(int group, int slotIndex) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i2 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i2 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i2) : this.slots.length) - iSlotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[iSlotAnchor + slotIndex];
    }

    public final List<Object> slotsOf$runtime_release(int group) {
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, group);
        int i2 = group + 1;
        return ArraysKt.toList(this.slots).subList(iDataAnchor, i2 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i2) : this.slots.length);
    }

    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    public final String toDebugString() {
        if (this.writer) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        int i2 = this.groupsSize;
        if (i2 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i2) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void verifyWellFormed() {
        int i2;
        int i3;
        Ref.IntRef intRef = new Ref.IntRef();
        int i4 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i2 = intRef.element;
                i3 = this.groupsSize;
                if (i2 >= i3) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(intRef, this, -1, SlotTableKt.groupSize(this.groups, i2) + i2);
                }
            }
            if (!(i2 == i3)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i5 = this.slotsSize; i5 < length; i5++) {
            if (!(this.slots[i5] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i5);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            int indexFor = arrayList.get(i6).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i4 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i6++;
            i4 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> block) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            T tInvoke = block.invoke(slotWriterOpenWriter);
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close(true);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close(false);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final void close$runtime_release(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, C0639E calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }
}
