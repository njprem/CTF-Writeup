package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001aC\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0000\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"emptyKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "keylineListOf", "carouselMainAxisSize", "", "itemSpacing", "carouselAlignment", "Landroidx/compose/material3/carousel/CarouselAlignment;", "keylines", "Lkotlin/Function1;", "Landroidx/compose/material3/carousel/KeylineListScope;", "", "Lkotlin/ExtensionFunctionType;", "keylineListOf-WNYm7Xg", "(FFILkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;", "pivotIndex", "", "pivotOffset", "lerp", "Landroidx/compose/material3/carousel/Keyline;", "start", "end", "fraction", "from", "to", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeylineListKt {
    public static final KeylineList emptyKeylineList() {
        return KeylineList.INSTANCE.getEmpty();
    }

    public static final KeylineList keylineListOf(float f2, float f3, int i2, float f4, Function1<? super KeylineListScope, Unit> function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f2, f3, i2, f4);
    }

    /* renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final KeylineList m2520keylineListOfWNYm7Xg(float f2, float f3, int i2, Function1<? super KeylineListScope, Unit> function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.m2521createWithAlignmentwaks0t8(f2, f3, i2);
    }

    public static final Keyline lerp(Keyline keyline, Keyline keyline2, float f2) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f2), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f2), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f2), f2 < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f2 < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f2 < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f2));
    }

    public static final KeylineList lerp(KeylineList keylineList, KeylineList keylineList2, float f2) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(lerp(keylineList.get(i2), keylineList2.get(i2), f2));
        }
        return new KeylineList(arrayList);
    }
}
