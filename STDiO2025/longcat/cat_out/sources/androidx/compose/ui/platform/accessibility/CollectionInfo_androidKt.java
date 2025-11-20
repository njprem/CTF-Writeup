package androidx.compose.ui.platform.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import x.d;
import x.e;
import x.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u0019\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lx/f;", "info", "", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;Lx/f;)V", "setCollectionItemInfo", "", "hasCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "items", "calculateIfHorizontallyStacked", "(Ljava/util/List;)Z", "Landroidx/compose/ui/semantics/CollectionInfo;", "Lx/d;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionInfo", "(Landroidx/compose/ui/semantics/CollectionInfo;)Lx/d;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "Lx/e;", "toAccessibilityCollectionItemInfo", "(Landroidx/compose/ui/semantics/CollectionItemInfo;Landroidx/compose/ui/semantics/SemanticsNode;)Lx/e;", "isLazyCollection", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List listEmptyList;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 0;
            while (i2 < lastIndex) {
                i2++;
                SemanticsNode semanticsNode2 = list.get(i2);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                listEmptyList.add(Offset.m3540boximpl(OffsetKt.Offset(Math.abs(Offset.m3551getXimpl(semanticsNode4.getBoundsInRoot().m3581getCenterF1C5BW0()) - Offset.m3551getXimpl(semanticsNode3.getBoundsInRoot().m3581getCenterF1C5BW0())), Math.abs(Offset.m3552getYimpl(semanticsNode4.getBoundsInRoot().m3581getCenterF1C5BW0()) - Offset.m3552getYimpl(semanticsNode3.getBoundsInRoot().m3581getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (listEmptyList.size() == 1) {
            packedValue = ((Offset) CollectionsKt.first(listEmptyList)).getPackedValue();
        } else {
            if (listEmptyList.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objFirst = CollectionsKt.first((List<? extends Object>) listEmptyList);
            int lastIndex2 = CollectionsKt.getLastIndex(listEmptyList);
            if (1 <= lastIndex2) {
                int i3 = 1;
                while (true) {
                    objFirst = Offset.m3540boximpl(Offset.m3556plusMKHz9U(((Offset) objFirst).getPackedValue(), ((Offset) listEmptyList.get(i3)).getPackedValue()));
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                }
            }
            packedValue = ((Offset) objFirst).getPackedValue();
        }
        return Offset.m3552getYimpl(packedValue) < Offset.m3551getXimpl(packedValue);
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, f fVar) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo2 = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo2 != null) {
            d accessibilityCollectionInfo = toAccessibilityCollectionInfo(collectionInfo2);
            if (accessibilityCollectionInfo == null) {
                collectionInfo = null;
            } else {
                fVar.getClass();
                collectionInfo = accessibilityCollectionInfo.f1052a;
            }
            fVar.f1055a.setCollectionInfo(collectionInfo);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        AccessibilityNodeInfo.CollectionInfo collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(zCalculateIfHorizontallyStacked ? 1 : arrayList.size(), zCalculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0);
        fVar.getClass();
        fVar.f1055a.setCollectionInfo(collectionInfoObtain);
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, f fVar) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo2 = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo2 != null) {
            e accessibilityCollectionItemInfo = toAccessibilityCollectionItemInfo(collectionItemInfo2, semanticsNode);
            if (accessibilityCollectionItemInfo == null) {
                collectionItemInfo = null;
            } else {
                fVar.getClass();
                collectionItemInfo = accessibilityCollectionItemInfo.f1053a;
            }
            fVar.f1055a.setCollectionItemInfo(collectionItemInfo);
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i3);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode().getPlaceOrder$ui_release()) {
                        i2++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfoObtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(zCalculateIfHorizontallyStacked ? 0 : i2, 1, zCalculateIfHorizontallyStacked ? i2 : 0, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue());
            fVar.getClass();
            fVar.f1055a.setCollectionItemInfo(collectionItemInfoObtain);
        }
    }

    private static final d toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return new d(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0));
    }

    private static final e toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.toAccessibilityCollectionItemInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue()));
    }
}
