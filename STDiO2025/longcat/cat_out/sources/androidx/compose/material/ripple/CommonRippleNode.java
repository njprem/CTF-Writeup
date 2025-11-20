package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import j.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0015*\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", "size", "", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "onDetach", "()V", "Lj/N;", "Landroidx/compose/material/ripple/RippleAnimation;", "ripples", "Lj/N;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    private final N ripples;

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f2, colorProducer, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1368addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press r18, long r19, float r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            j.N r2 = r0.ripples
            java.lang.Object[] r3 = r2.f801b
            java.lang.Object[] r4 = r2.f802c
            long[] r2 = r2.f800a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            androidx.compose.material.ripple.RippleAnimation r13 = (androidx.compose.material.ripple.RippleAnimation) r13
            androidx.compose.foundation.interaction.PressInteraction$Press r14 = (androidx.compose.foundation.interaction.PressInteraction.Press) r14
            r13.finish()
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L13
        L51:
            boolean r2 = r0.getBounded()
            r3 = 0
            if (r2 == 0) goto L61
            long r4 = r1.getPressPosition()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m3540boximpl(r4)
            goto L62
        L61:
            r2 = r3
        L62:
            androidx.compose.material.ripple.RippleAnimation r4 = new androidx.compose.material.ripple.RippleAnimation
            boolean r5 = r0.getBounded()
            r6 = r21
            r4.<init>(r2, r6, r5, r3)
            j.N r2 = r0.ripples
            r2.k(r1, r4)
            kotlinx.coroutines.CoroutineScope r5 = r0.getCoroutineScope()
            androidx.compose.material.ripple.CommonRippleNode$addRipple$2 r8 = new androidx.compose.material.ripple.CommonRippleNode$addRipple$2
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.CommonRippleNode.mo1368addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction$Press, long, float):void");
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        float f2;
        int i2;
        int i3;
        int i4;
        float f3;
        float pressedAlpha = getRippleAlpha().invoke().getPressedAlpha();
        if (pressedAlpha == 0.0f) {
            return;
        }
        N n2 = this.ripples;
        Object[] objArr = n2.f801b;
        Object[] objArr2 = n2.f802c;
        long[] jArr = n2.f800a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr[i5];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                long j3 = j2;
                int i8 = 0;
                while (i8 < i7) {
                    if ((j3 & 255) < 128) {
                        int i9 = (i5 << 3) + i8;
                        i2 = i8;
                        i3 = i7;
                        i4 = i6;
                        f3 = pressedAlpha;
                        ((RippleAnimation) objArr2[i9]).m1372draw4WTKRHQ(drawScope, Color.m3791copywmQWz5c$default(m1380getRippleColor0d7_KjU(), pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i2 = i8;
                        i3 = i7;
                        i4 = i6;
                        f3 = pressedAlpha;
                    }
                    j3 >>= i4;
                    i8 = i2 + 1;
                    pressedAlpha = f3;
                    i7 = i3;
                    i6 = i4;
                }
                int i10 = i7;
                f2 = pressedAlpha;
                if (i10 != i6) {
                    return;
                }
            } else {
                f2 = pressedAlpha;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            pressedAlpha = f2;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.d();
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press interaction) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.ripples.b(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        super(interactionSource, z, f2, colorProducer, function0, null);
        this.ripples = new N();
    }
}
