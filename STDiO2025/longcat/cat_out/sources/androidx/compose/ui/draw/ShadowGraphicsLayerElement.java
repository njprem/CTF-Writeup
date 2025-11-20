package androidx.compose.ui.draw;

import J.d;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u00020\u0004HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0016\u0010\u001c\u001a\u00020\nHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000eJ\u0016\u0010\u001e\u001a\u00020\nHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000eJE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0002H\u0016J\u0019\u0010$\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0002\b(H\u0002J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u0002H\u0016J\f\u00102\u001a\u00020'*\u000203H\u0016R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAmbientColor-0d7_KjU", "()J", "J", "getClip", "()Z", "getElevation-D9Ej5fM", "()F", "F", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSpotColor-0d7_KjU", "component1", "component1-D9Ej5fM", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-gNMxBKI", "(FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "create", "createBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f2, Shape shape, boolean z, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, shape, z, j2, j3);
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m3447copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f2, Shape shape, boolean z, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = shadowGraphicsLayerElement.elevation;
        }
        if ((i2 & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i2 & 4) != 0) {
            z = shadowGraphicsLayerElement.clip;
        }
        if ((i2 & 8) != 0) {
            j2 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i2 & 16) != 0) {
            j3 = shadowGraphicsLayerElement.spotColor;
        }
        long j4 = j3;
        boolean z2 = z;
        return shadowGraphicsLayerElement.m3451copygNMxBKI(f2, shape, z2, j2, j4);
    }

    private final Function1<GraphicsLayerScope, Unit> createBlock() {
        return new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo334toPx0680j_4(ShadowGraphicsLayerElement.this.m3453getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo3981setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m3452getAmbientColor0d7_KjU());
                graphicsLayerScope.mo3983setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m3454getSpotColor0d7_KjU());
            }
        };
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: component2, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m3451copygNMxBKI(float elevation, Shape shape, boolean clip, long ambientColor, long spotColor) {
        return new ShadowGraphicsLayerElement(elevation, shape, clip, ambientColor, spotColor, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return Dp.m6238equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.areEqual(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m3793equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m3793equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m3452getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3453getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m3454getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Color.m3799hashCodeimpl(this.spotColor) + d.d(this.ambientColor, d.i(this.clip, (this.shape.hashCode() + (Dp.m6239hashCodeimpl(this.elevation) * 31)) * 31, 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        d.j(this.elevation, inspectorInfo.getProperties(), "elevation", inspectorInfo).set("shape", this.shape);
        d.k(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("ambientColor", Color.m3782boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m3782boximpl(this.spotColor));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        d.u(this.elevation, sb, ", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        d.w(this.ambientColor, sb, ", spotColor=");
        sb.append((Object) Color.m3800toStringimpl(this.spotColor));
        sb.append(')');
        return sb.toString();
    }

    private ShadowGraphicsLayerElement(float f2, Shape shape, boolean z, long j2, long j3) {
        this.elevation = f2;
        this.shape = shape;
        this.clip = z;
        this.ambientColor = j2;
        this.spotColor = j3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public BlockGraphicsLayerModifier getNode() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier node) {
        node.setLayerBlock(createBlock());
        node.invalidateLayerBlock();
    }
}
