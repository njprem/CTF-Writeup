package androidx.compose.runtime;

import androidx.compose.ui.text.android.style.PlaceholderSpan;
import j.C0639E;
import j.C0640F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a@\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0014\u001a#\u0010\u001e\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0014\u001a#\u0010!\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u001f\u001a\u001b\u0010\"\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\u0014\u001a\u001b\u0010#\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u0012\u001a\u001b\u0010$\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0012\u001a\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010\u0012\u001a#\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)*\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010,\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u0012\u001a#\u0010-\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0)*\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010+\u001a\u001b\u00100\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\u0012\u001a#\u00101\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010.\u001a#\u00102\u001a\b\u0012\u0004\u0012\u00020\b0)*\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010+\u001a\u001b\u00103\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0012\u001a#\u00104\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010.\u001a'\u00107\u001a\b\u0012\u0004\u0012\u00020\b0)*\u00020\u000f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b05H\u0002¢\u0006\u0004\b7\u00108\u001a#\u00109\u001a\b\u0012\u0004\u0012\u00020\b0)*\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010+\u001a\u001b\u0010:\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0012\u001a#\u0010<\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010.\u001a#\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0)*\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010+\u001aK\u0010@\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u00100\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010A\u001a#\u0010B\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010.\u001aB\u0010H\u001a\u00020C*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020C0FH\u0082\b¢\u0006\u0004\bH\u0010I\u001a5\u0010J\u001a\u0004\u0018\u00010C*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010K\u001a3\u0010M\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010L\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010N\u001a3\u0010O\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020C0\u0001j\b\u0012\u0004\u0012\u00020C`\u00022\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010N\u001a)\u0010R\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010S\"\u0014\u0010T\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010U\"\u0014\u0010V\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010U\"\u0014\u0010W\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010U\"\u0014\u0010X\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010U\"\u0014\u0010Y\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010U\"\u0014\u0010Z\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010U\"\u0014\u0010[\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010U\"\u0014\u0010\\\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010U\"\u0014\u0010]\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010U\"\u0014\u0010^\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010U\"\u0014\u0010_\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010U\"\u0014\u0010`\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010U\"\u0014\u0010a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010U\"\u0014\u0010b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010U\"\u0014\u0010c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010U\"\u0014\u0010d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010U\"\u0014\u0010e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010U\"\u0014\u0010f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010U\"\u0014\u0010g\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010U¨\u0006h"}, d2 = {"T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/Function1;", "", "predicate", "fastLastOrNull", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "fastIndexOf", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)I", "", "size", "summarize", "(Ljava/lang/String;I)Ljava/lang/String;", "", "address", "groupInfo", "([II)I", "isNode", "([II)Z", "nodeIndex", "hasObjectKey", "objectKeyIndex", "hasAux", "", "addAux", "([II)V", "hasMark", "value", "updateMark", "([IIZ)V", "containsMark", "updateContainsMark", "containsAnyMark", "auxIndex", "slotAnchor", "countOneBits", "(I)I", "key", "len", "", "keys", "([II)Ljava/util/List;", "nodeCount", "updateNodeCount", "([III)V", "nodeCounts", "parentAnchor", "updateParentAnchor", "parentAnchors", "groupSize", "updateGroupSize", "", "indices", "slice", "([ILjava/lang/Iterable;)Ljava/util/List;", "groupSizes", "dataAnchor", "anchor", "updateDataAnchor", "dataAnchors", "hasDataKey", "hasData", "initGroup", "([IIIZZZII)V", "updateGroupKey", "Landroidx/compose/runtime/Anchor;", "index", "effectiveSize", "Lkotlin/Function0;", "block", "getOrAdd", "(Ljava/util/ArrayList;IILkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/Anchor;", "find", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/Anchor;", "location", "search", "(Ljava/util/ArrayList;II)I", "locationOf", "Lj/E;", "Lj/F;", "add", "(Lj/E;II)V", "parentAnchorPivot", "I", "Key_Offset", "GroupInfo_Offset", "ParentAnchor_Offset", "Size_Offset", "DataAnchor_Offset", "Group_Fields_Size", "NodeBit_Mask", "ObjectKey_Mask", "ObjectKey_Shift", "Aux_Mask", "Aux_Shift", "Mark_Mask", "ContainsMark_Mask", "Slots_Shift", "NodeCount_Mask", "MinGroupGrowthSize", "MinSlotsGrowthSize", "LIVE_EDIT_INVALID_KEY", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add(C0639E c0639e, int i2, int i3) {
        C0640F c0640f = (C0640F) c0639e.c(i2);
        if (c0640f == null) {
            c0640f = new C0640F();
            c0639e.h(i2, c0640f);
        }
        c0640f.b(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = iArr[i3] | Aux_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return i3 >= iArr.length ? iArr.length : iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> ObjectKey_Shift);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsAnyMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & ContainsMark_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countOneBits(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dataAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i2) {
        return slice(iArr, RangesKt___RangesKt.step(RangesKt.until(4, i2), 5));
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return dataAnchors(iArr, i2);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (function1.invoke(arrayList.get(i2)).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = arrayList.get(size);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Anchor find(ArrayList<Anchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i2, int i3, Function0<Anchor> function0) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchorInvoke = function0.invoke();
        arrayList.add(-(iSearch + 1), anchorInvoke);
        return anchorInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupInfo(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i2) {
        return slice(iArr, RangesKt___RangesKt.step(RangesKt.until(3, i2), 5));
    }

    public static /* synthetic */ List groupSizes$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return groupSizes(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasAux(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & Aux_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & Mark_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasObjectKey(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & ObjectKey_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5) {
        int i6 = z ? NodeBit_Mask : 0;
        int i7 = z2 ? ObjectKey_Mask : 0;
        int i8 = z3 ? Aux_Mask : 0;
        int i9 = i2 * 5;
        iArr[i9] = i3;
        iArr[i9 + 1] = i6 | i7 | i8;
        iArr[i9 + 2] = i4;
        iArr[i9 + 3] = 0;
        iArr[i9 + 4] = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNode(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & NodeBit_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int key(int[] iArr, int i2) {
        return iArr[i2 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i2) {
        return slice(iArr, RangesKt___RangesKt.step(RangesKt.until(0, i2), 5));
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return keys(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeCount(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & NodeCount_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i2) {
        List<Integer> listSlice = slice(iArr, RangesKt___RangesKt.step(RangesKt.until(1, i2), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Integer.valueOf(listSlice.get(i3).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    public static /* synthetic */ List nodeCounts$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return nodeCounts(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeIndex(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int parentAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i2) {
        return slice(iArr, RangesKt___RangesKt.step(RangesKt.until(2, i2), 5));
    }

    public static /* synthetic */ List parentAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return parentAnchors(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int location$runtime_release = arrayList.get(i5).getLocation();
            if (location$runtime_release < 0) {
                location$runtime_release += i3;
            }
            int iCompare = Intrinsics.compare(location$runtime_release, i2);
            if (iCompare < 0) {
                i4 = i5 + 1;
            } else {
                if (iCompare <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i2) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), "MutableState", "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i2, strReplace$default.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i2, boolean z) {
        int i3 = (i2 * 5) + 1;
        if (z) {
            iArr[i3] = iArr[i3] | ContainsMark_Mask;
        } else {
            iArr[i3] = iArr[i3] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDataAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i2, int i3) {
        iArr[i2 * 5] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i2, int i3) {
        ComposerKt.runtimeCheck(i3 >= 0);
        iArr[(i2 * 5) + 3] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i2, boolean z) {
        int i3 = (i2 * 5) + 1;
        if (z) {
            iArr[i3] = iArr[i3] | Mark_Mask;
        } else {
            iArr[i3] = iArr[i3] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i2, int i3) {
        ComposerKt.runtimeCheck(i3 >= 0 && i3 < NodeCount_Mask);
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateParentAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 2] = i3;
    }
}
