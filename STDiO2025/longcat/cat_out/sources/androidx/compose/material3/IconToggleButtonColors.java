package androidx.compose.material3;

import J.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0017JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedContainerColor-0d7_KjU", "()J", "J", "getCheckedContentColor-0d7_KjU", "getContainerColor-0d7_KjU", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "Landroidx/compose/runtime/State;", "enabled", "", "checked", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3_release", "copy", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/IconToggleButtonColors;", "equals", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ IconToggleButtonColors m1786copytNS2XkQ$default(IconToggleButtonColors iconToggleButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = iconToggleButtonColors.containerColor;
        }
        return iconToggleButtonColors.m1787copytNS2XkQ(j2, (i2 & 2) != 0 ? iconToggleButtonColors.contentColor : j3, (i2 & 4) != 0 ? iconToggleButtonColors.disabledContainerColor : j4, (i2 & 8) != 0 ? iconToggleButtonColors.disabledContentColor : j5, (i2 & 16) != 0 ? iconToggleButtonColors.checkedContainerColor : j6, (i2 & 32) != 0 ? iconToggleButtonColors.checkedContentColor : j7);
    }

    public final State<Color> containerColor$material3_release(boolean z, boolean z2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i2, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3782boximpl(!z ? this.disabledContainerColor : !z2 ? this.containerColor : this.checkedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    public final State<Color> contentColor$material3_release(boolean z, boolean z2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i2, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3782boximpl(!z ? this.disabledContentColor : !z2 ? this.contentColor : this.checkedContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final IconToggleButtonColors m1787copytNS2XkQ(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor) {
        return new IconToggleButtonColors(containerColor != 16 ? containerColor : this.containerColor, contentColor != 16 ? contentColor : this.contentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledContentColor != 16 ? disabledContentColor : this.disabledContentColor, checkedContainerColor != 16 ? checkedContainerColor : this.checkedContainerColor, checkedContentColor != 16 ? checkedContentColor : this.checkedContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) other;
        return Color.m3793equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m3793equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m3793equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m3793equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m3793equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m3793equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedContainerColor() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedContentColor() {
        return this.checkedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.checkedContentColor) + d.d(this.checkedContainerColor, d.d(this.disabledContentColor, d.d(this.disabledContainerColor, d.d(this.contentColor, Color.m3799hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31);
    }

    private IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.disabledContainerColor = j4;
        this.disabledContentColor = j5;
        this.checkedContainerColor = j6;
        this.checkedContentColor = j7;
    }
}
