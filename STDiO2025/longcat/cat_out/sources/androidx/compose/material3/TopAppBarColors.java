package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActionIconContentColor-0d7_KjU", "()J", "J", "getContainerColor-0d7_KjU", "getNavigationIconContentColor-0d7_KjU", "getScrolledContainerColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "colorTransitionFraction", "", "containerColor-vNxB06k$material3_release", "(F)J", "copy", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/TopAppBarColors;", "equals", "", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    public /* synthetic */ TopAppBarColors(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m2481copyt635Npw$default(TopAppBarColors topAppBarColors, long j2, long j3, long j4, long j5, long j6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = topAppBarColors.containerColor;
        }
        long j7 = j2;
        if ((i2 & 2) != 0) {
            j3 = topAppBarColors.scrolledContainerColor;
        }
        return topAppBarColors.m2483copyt635Npw(j7, j3, (i2 & 4) != 0 ? topAppBarColors.navigationIconContentColor : j4, (i2 & 8) != 0 ? topAppBarColors.titleContentColor : j5, (i2 & 16) != 0 ? topAppBarColors.actionIconContentColor : j6);
    }

    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2482containerColorvNxB06k$material3_release(float colorTransitionFraction) {
        return ColorKt.m3843lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(colorTransitionFraction));
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m2483copyt635Npw(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor) {
        return new TopAppBarColors(containerColor != 16 ? containerColor : this.containerColor, scrolledContainerColor != 16 ? scrolledContainerColor : this.scrolledContainerColor, navigationIconContentColor != 16 ? navigationIconContentColor : this.navigationIconContentColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, actionIconContentColor != 16 ? actionIconContentColor : this.actionIconContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) other;
        return Color.m3793equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m3793equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m3793equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m3793equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m3793equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.actionIconContentColor) + d.d(this.titleContentColor, d.d(this.navigationIconContentColor, d.d(this.scrolledContainerColor, Color.m3799hashCodeimpl(this.containerColor) * 31, 31), 31), 31);
    }

    private TopAppBarColors(long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j2;
        this.scrolledContainerColor = j3;
        this.navigationIconContentColor = j4;
        this.titleContentColor = j5;
        this.actionIconContentColor = j6;
    }
}
