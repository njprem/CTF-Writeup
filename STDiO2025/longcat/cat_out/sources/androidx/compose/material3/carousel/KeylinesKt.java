package androidx.compose.material3.carousel;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001aD\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0000\u001a(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\u0017"}, d2 = {"calculateMediumChildSize", "", "minimumMediumSize", "largeItemSize", "remainingSpace", "createLeftAlignedKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "carouselMainAxisSize", "itemSpacing", "leftAnchorSize", "rightAnchorSize", "arrangement", "Landroidx/compose/material3/carousel/Arrangement;", "multiBrowseKeylineList", "density", "Landroidx/compose/ui/unit/Density;", "preferredItemSize", "itemCount", "", "minSmallItemSize", "maxSmallItemSize", "uncontainedKeylineList", "itemSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f2, float f3, float f4) {
        float fMax = Math.max(1.5f * f4, f2);
        float f5 = f3 * 0.85f;
        return fMax > f5 ? Math.max(f5, f4 * 1.2f) : fMax;
    }

    public static final KeylineList createLeftAlignedKeylineList(float f2, float f3, final float f4, final float f5, final Arrangement arrangement) {
        return KeylineListKt.m2520keylineListOfWNYm7Xg(f2, f3, CarouselAlignment.INSTANCE.m2511getStartNUL3oTo(), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.KeylinesKt.createLeftAlignedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeylineListScope keylineListScope) {
                keylineListScope.add(f4, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i2 = 0; i2 < largeCount; i2++) {
                    KeylineListScope.add$default(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i3 = 0; i3 < mediumCount; i3++) {
                    KeylineListScope.add$default(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i4 = 0; i4 < smallCount; i4++) {
                    KeylineListScope.add$default(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.add(f5, true);
            }
        });
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f2, float f3, float f4, int i2, float f5, float f6) {
        float f7;
        if (f2 == 0.0f || f3 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f3, f2);
        float fCoerceIn = RangesKt.coerceIn(fMin / 3.0f, f5, f6);
        float f8 = (fMin + fCoerceIn) / 2.0f;
        if (f2 < 2 * f5) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iCeil = (int) Math.ceil(f2 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f2 - (ArraysKt.maxOrThrow(iArr2) * f8)) - (ArraysKt.maxOrThrow(iArr3) * f6)) / fMin))) + 1;
        int[] iArr4 = new int[iMax];
        for (int i3 = 0; i3 < iMax; i3++) {
            iArr4[i3] = iCeil - i3;
        }
        float fMo334toPx0680j_4 = density.mo334toPx0680j_4(CarouselDefaults.INSTANCE.m2512getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f2, f4, fCoerceIn, f5, f6, iArr3, f8, iArr2, fMin, iArr4);
        if (arrangementFindLowestCostArrangement == null || arrangementFindLowestCostArrangement.itemCount() <= i2) {
            f7 = f2;
        } else {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i2; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f7 = f2;
            arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f7, f4, fCoerceIn, f5, f6, new int[]{smallCount}, f8, new int[]{mediumCount}, fMin, iArr4);
        }
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f7, f4, fMo334toPx0680j_4, fMo334toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f2, float f3, float f4, int i2, float f5, float f6, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            f5 = density.mo334toPx0680j_4(CarouselDefaults.INSTANCE.m2514getMinSmallItemSizeD9Ej5fM$material3_release());
        }
        float f7 = f5;
        if ((i3 & 64) != 0) {
            f6 = density.mo334toPx0680j_4(CarouselDefaults.INSTANCE.m2513getMaxSmallItemSizeD9Ej5fM$material3_release());
        }
        return multiBrowseKeylineList(density, f2, f3, f4, i2, f7, f6);
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f2, float f3, float f4) {
        if (f2 == 0.0f || f3 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f3 + f4, f2);
        int iMax = Math.max(1, (int) Math.floor(f2 / fMin));
        float f5 = f2 - (iMax * fMin);
        int i2 = f5 <= 0.0f ? 0 : 1;
        float fMo334toPx0680j_4 = density.mo334toPx0680j_4(CarouselDefaults.INSTANCE.m2512getAnchorSizeD9Ej5fM$material3_release());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo334toPx0680j_4, fMin, f5);
        return createLeftAlignedKeylineList(f2, f4, Math.max(Math.min(fMo334toPx0680j_4, f3), fCalculateMediumChildSize * 0.5f), fMo334toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i2, fMin, iMax));
    }
}
