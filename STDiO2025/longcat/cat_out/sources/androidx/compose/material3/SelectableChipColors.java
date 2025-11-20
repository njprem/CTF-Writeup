package androidx.compose.material3;

import J.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0092\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J%\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0016J%\u0010!\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "enabled", "", "selected", "containerColor-WaAFU9c$material3_release", "(ZZ)J", "copy", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "equals", "other", "hashCode", "", "labelColor-WaAFU9c$material3_release", "leadingIconContentColor", "leadingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m2091copydaRQuJA$default(SelectableChipColors selectableChipColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i2, Object obj) {
        long j15;
        long j16;
        long j17 = (i2 & 1) != 0 ? selectableChipColors.containerColor : j2;
        long j18 = (i2 & 2) != 0 ? selectableChipColors.labelColor : j3;
        long j19 = (i2 & 4) != 0 ? selectableChipColors.leadingIconColor : j4;
        long j20 = (i2 & 8) != 0 ? selectableChipColors.trailingIconColor : j5;
        long j21 = (i2 & 16) != 0 ? selectableChipColors.disabledContainerColor : j6;
        long j22 = (i2 & 32) != 0 ? selectableChipColors.disabledLabelColor : j7;
        long j23 = (i2 & 64) != 0 ? selectableChipColors.disabledLeadingIconColor : j8;
        long j24 = j17;
        long j25 = (i2 & 128) != 0 ? selectableChipColors.disabledTrailingIconColor : j9;
        long j26 = (i2 & Fields.RotationX) != 0 ? selectableChipColors.selectedContainerColor : j10;
        long j27 = (i2 & 512) != 0 ? selectableChipColors.disabledSelectedContainerColor : j11;
        long j28 = (i2 & 1024) != 0 ? selectableChipColors.selectedLabelColor : j12;
        long j29 = (i2 & Fields.CameraDistance) != 0 ? selectableChipColors.selectedLeadingIconColor : j13;
        if ((i2 & 4096) != 0) {
            j16 = j29;
            j15 = selectableChipColors.selectedTrailingIconColor;
        } else {
            j15 = j14;
            j16 = j29;
        }
        return selectableChipColors.m2093copydaRQuJA(j24, j18, j19, j20, j21, j22, j23, j25, j26, j27, j28, j16, j15);
    }

    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2092containerColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? selected ? this.disabledSelectedContainerColor : this.disabledContainerColor : !selected ? this.containerColor : this.selectedContainerColor;
    }

    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m2093copydaRQuJA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        return new SelectableChipColors(containerColor != 16 ? containerColor : this.containerColor, labelColor != 16 ? labelColor : this.labelColor, leadingIconColor != 16 ? leadingIconColor : this.leadingIconColor, trailingIconColor != 16 ? trailingIconColor : this.trailingIconColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, selectedContainerColor != 16 ? selectedContainerColor : this.selectedContainerColor, disabledSelectedContainerColor != 16 ? disabledSelectedContainerColor : this.disabledSelectedContainerColor, selectedLabelColor != 16 ? selectedLabelColor : this.selectedLabelColor, selectedLeadingIconColor != 16 ? selectedLeadingIconColor : this.selectedLeadingIconColor, selectedTrailingIconColor != 16 ? selectedTrailingIconColor : this.selectedTrailingIconColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) other;
        return Color.m3793equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m3793equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m3793equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m3793equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m3793equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m3793equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m3793equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m3793equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m3793equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m3793equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m3793equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m3793equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m3793equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.selectedTrailingIconColor) + d.d(this.selectedLeadingIconColor, d.d(this.selectedLabelColor, d.d(this.disabledSelectedContainerColor, d.d(this.selectedContainerColor, d.d(this.disabledTrailingIconColor, d.d(this.disabledLeadingIconColor, d.d(this.disabledLabelColor, d.d(this.disabledContainerColor, d.d(this.trailingIconColor, d.d(this.leadingIconColor, d.d(this.labelColor, Color.m3799hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2094labelColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLabelColor : !selected ? this.labelColor : this.selectedLabelColor;
    }

    /* renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2095leadingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLeadingIconColor : !selected ? this.leadingIconColor : this.selectedLeadingIconColor;
    }

    /* renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2096trailingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        return !enabled ? this.disabledTrailingIconColor : !selected ? this.trailingIconColor : this.selectedTrailingIconColor;
    }

    private SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j2;
        this.labelColor = j3;
        this.leadingIconColor = j4;
        this.trailingIconColor = j5;
        this.disabledContainerColor = j6;
        this.disabledLabelColor = j7;
        this.disabledLeadingIconColor = j8;
        this.disabledTrailingIconColor = j9;
        this.selectedContainerColor = j10;
        this.disabledSelectedContainerColor = j11;
        this.selectedLabelColor = j12;
        this.selectedLeadingIconColor = j13;
        this.selectedTrailingIconColor = j14;
    }
}
