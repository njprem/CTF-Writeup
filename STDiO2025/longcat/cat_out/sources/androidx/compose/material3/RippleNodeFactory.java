package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/RippleNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "colorProducer", "Landroidx/compose/ui/graphics/ColorProducer;", "(ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "Landroidx/compose/ui/graphics/Color;", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZFLandroidx/compose/ui/graphics/ColorProducer;J)V", "J", "F", "create", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "equals", "other", "", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final float radius;

    public /* synthetic */ RippleNodeFactory(boolean z, float f2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f2, j2);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo1693invoke0d7_KjU() {
                    return this.this$0.color;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) other;
        if (this.bounded == rippleNodeFactory.bounded && Dp.m6238equalsimpl0(this.radius, rippleNodeFactory.radius) && Intrinsics.areEqual(this.colorProducer, rippleNodeFactory.colorProducer)) {
            return Color.m3793equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int iB = d.B(Boolean.hashCode(this.bounded) * 31, 31, this.radius);
        ColorProducer colorProducer = this.colorProducer;
        return Color.m3799hashCodeimpl(this.color) + ((iB + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31);
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f2, colorProducer);
    }

    private RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer, long j2) {
        this.bounded = z;
        this.radius = f2;
        this.colorProducer = colorProducer;
        this.color = j2;
    }

    private RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer) {
        this(z, f2, colorProducer, Color.INSTANCE.m3828getUnspecified0d7_KjU());
    }

    private RippleNodeFactory(boolean z, float f2, long j2) {
        this(z, f2, (ColorProducer) null, j2);
    }
}
