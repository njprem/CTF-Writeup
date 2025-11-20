package androidx.compose.material3.internal;

import J.d;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00128\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\u0010\u0010J2\u0010%\u001a\u00020&2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0016J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J9\u00102\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003Jk\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u000728\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "verticalMargin", "", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "name", "anchorBounds", "menuBounds", "", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "bottomToAnchorTop", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToWindowBottom", "centerToAnchorTop", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "endToAnchorEnd", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "leftToWindowLeft", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "getVerticalMargin", "()I", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "component4", "copy", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, i2, function2);
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m2529copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j2, Density density, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = dropdownMenuPositionProvider.contentOffset;
        }
        long j3 = j2;
        if ((i3 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i3 & 4) != 0) {
            i2 = dropdownMenuPositionProvider.verticalMargin;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m2531copyuVxBXkw(j3, density2, i4, function2);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo306calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int iMo2523position95KtPRI;
        int i2 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new MenuPosition.Horizontal[]{this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m6361getXimpl(anchorBounds.m6384getCenternOccac()) < IntSize.m6403getWidthimpl(windowSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listListOf.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                iMo2523position95KtPRI = 0;
                break;
            }
            iMo2523position95KtPRI = ((MenuPosition.Horizontal) listListOf.get(i3)).mo2523position95KtPRI(anchorBounds, windowSize, IntSize.m6403getWidthimpl(popupContentSize), layoutDirection);
            if (i3 == CollectionsKt.getLastIndex(listListOf) || (iMo2523position95KtPRI >= 0 && IntSize.m6403getWidthimpl(popupContentSize) + iMo2523position95KtPRI <= IntSize.m6403getWidthimpl(windowSize))) {
                break;
            }
            i3++;
        }
        List listListOf2 = CollectionsKt.listOf((Object[]) new MenuPosition.Vertical[]{this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, IntOffset.m6362getYimpl(anchorBounds.m6384getCenternOccac()) < IntSize.m6402getHeightimpl(windowSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listListOf2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int iMo2524positionJVtK1S4 = ((MenuPosition.Vertical) listListOf2.get(i4)).mo2524positionJVtK1S4(anchorBounds, windowSize, IntSize.m6402getHeightimpl(popupContentSize));
            if (i4 == CollectionsKt.getLastIndex(listListOf2) || (iMo2524positionJVtK1S4 >= this.verticalMargin && IntSize.m6402getHeightimpl(popupContentSize) + iMo2524positionJVtK1S4 <= IntSize.m6402getHeightimpl(windowSize) - this.verticalMargin)) {
                i2 = iMo2524positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo2523position95KtPRI, i2);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m6393IntRectVbeCjmY(jIntOffset, popupContentSize));
        return jIntOffset;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> component4() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m2531copyuVxBXkw(long contentOffset, Density density, int verticalMargin, Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        return new DropdownMenuPositionProvider(contentOffset, density, verticalMargin, onPositionCalculated, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m6293equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m2532getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + d.c(this.verticalMargin, (this.density.hashCode() + (DpOffset.m6298hashCodeimpl(this.contentOffset) * 31)) * 31, 31);
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m6301toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j2, Density density, int i2, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.contentOffset = j2;
        this.density = density;
        this.verticalMargin = i2;
        this.onPositionCalculated = function2;
        int iMo328roundToPx0680j_4 = density.mo328roundToPx0680j_4(DpOffset.m6294getXD9Ej5fM(j2));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(iMo328roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(iMo328roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int iMo328roundToPx0680j_42 = density.mo328roundToPx0680j_4(DpOffset.m6296getYD9Ej5fM(j2));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(iMo328roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(iMo328roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(iMo328roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i2);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i2);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, (i3 & 4) != 0 ? density.mo328roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i2, (i3 & 8) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntRect intRect, IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : function2, null);
    }
}
