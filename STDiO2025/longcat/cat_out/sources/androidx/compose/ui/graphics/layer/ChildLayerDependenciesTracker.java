package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.InlineClassHelperKt;
import j.S;
import j.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "onDependencyRemoved", "Lkotlin/Function0;", "block", "withTracking", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "graphicsLayer", "", "onDependencyAdded", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "removeDependencies", "(Lkotlin/jvm/functions/Function1;)V", "dependency", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "oldDependency", "Lj/S;", "dependenciesSet", "Lj/S;", "oldDependenciesSet", "trackingInProgress", "Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {
    private S dependenciesSet;
    private GraphicsLayer dependency;
    private S oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        S s2 = this.dependenciesSet;
        if (s2 != null) {
            Intrinsics.checkNotNull(s2);
            s2.d(graphicsLayer);
        } else if (this.dependency != null) {
            int i2 = g0.f831a;
            S s3 = new S();
            GraphicsLayer graphicsLayer2 = this.dependency;
            Intrinsics.checkNotNull(graphicsLayer2);
            s3.d(graphicsLayer2);
            s3.d(graphicsLayer);
            this.dependenciesSet = s3;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        S s4 = this.oldDependenciesSet;
        if (s4 != null) {
            Intrinsics.checkNotNull(s4);
            return !s4.l(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeDependencies(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> r18) {
        /*
            r17 = this;
            r0 = r18
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = access$getDependency$p(r17)
            if (r1 == 0) goto L12
            r0.invoke(r1)
            r1 = 0
            r2 = r17
            access$setDependency$p(r2, r1)
            goto L14
        L12:
            r2 = r17
        L14:
            j.S r1 = access$getDependenciesSet$p(r2)
            if (r1 == 0) goto L60
            java.lang.Object[] r3 = r1.f825b
            long[] r4 = r1.f824a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5d
            r6 = 0
            r7 = r6
        L25:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L3f:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r0.invoke(r13)
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r5) goto L5d
            int r7 = r7 + 1
            goto L25
        L5d:
            r1.f()
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.removeDependencies(kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void withTracking(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = access$getDependency$p(r0)
            access$setOldDependency$p(r0, r3)
            j.S r3 = access$getDependenciesSet$p(r0)
            if (r3 == 0) goto L2e
            boolean r4 = r3.c()
            if (r4 == 0) goto L2e
            j.S r4 = access$getOldDependenciesSet$p(r0)
            if (r4 != 0) goto L28
            int r4 = j.g0.f831a
            j.S r4 = new j.S
            r4.<init>()
            access$setOldDependenciesSet$p(r0, r4)
        L28:
            r4.e(r3)
            r3.f()
        L2e:
            access$setTrackingInProgress$p(r0, r2)
            r20.invoke()
            r3 = 0
            access$setTrackingInProgress$p(r0, r3)
            androidx.compose.ui.graphics.layer.GraphicsLayer r4 = access$getOldDependency$p(r0)
            if (r4 == 0) goto L41
            r1.invoke(r4)
        L41:
            j.S r4 = access$getOldDependenciesSet$p(r0)
            if (r4 == 0) goto L90
            boolean r5 = r4.c()
            if (r5 == 0) goto L90
            java.lang.Object[] r5 = r4.f825b
            long[] r6 = r4.f824a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8d
            r8 = r3
        L57:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L89
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r3
        L71:
            if (r13 >= r11) goto L87
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L84
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r5[r14]
            r1.invoke(r14)
        L84:
            long r9 = r9 >> r12
            int r13 = r13 + r2
            goto L71
        L87:
            if (r11 != r12) goto L8d
        L89:
            if (r8 == r7) goto L8d
            int r8 = r8 + r2
            goto L57
        L8d:
            r4.f()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.withTracking(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }
}
