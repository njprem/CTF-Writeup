package androidx.compose.ui.graphics.layer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV22;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "()V", "toBitmap", "Landroid/graphics/Bitmap;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    public static final LayerSnapshotV22 INSTANCE = new LayerSnapshotV22();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {231}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
    /* renamed from: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LayerSnapshotV22.this.toBitmap(null, this);
        }
    }

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer r9, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r10) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.graphics.layer.LayerSnapshotV22.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = (androidx.compose.ui.graphics.layer.LayerSnapshotV22.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r9 = r0.L$4
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r9 = (androidx.compose.ui.graphics.layer.LayerSnapshotV22.AnonymousClass1) r9
            java.lang.Object r9 = r0.L$3
            android.media.ImageReader r9 = (android.media.ImageReader) r9
            java.lang.Object r9 = r0.L$2
            java.lang.AutoCloseable r9 = (java.lang.AutoCloseable) r9
            java.lang.Object r1 = r0.L$1
            android.os.Looper r1 = (android.os.Looper) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3f
            goto Lc3
        L3f:
            r10 = move-exception
            goto Ld2
        L42:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4a:
            kotlin.ResultKt.throwOnFailure(r10)
            long r5 = r9.getSize()
            android.os.Looper r10 = android.os.Looper.myLooper()
            if (r10 != 0) goto L5b
            android.os.Looper r10 = android.os.Looper.getMainLooper()
        L5b:
            int r2 = androidx.compose.ui.unit.IntSize.m6403getWidthimpl(r5)
            int r5 = androidx.compose.ui.unit.IntSize.m6402getHeightimpl(r5)
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r2, r5, r3, r3)
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lbc
            r0.L$1 = r10     // Catch: java.lang.Throwable -> Lbc
            r0.L$2 = r2     // Catch: java.lang.Throwable -> Lbc
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Lbc
            r0.L$4 = r0     // Catch: java.lang.Throwable -> Lbc
            r0.label = r3     // Catch: java.lang.Throwable -> Lbc
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> Lbc
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> Lbc
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> Lbc
            r5.initCancellability()     // Catch: java.lang.Throwable -> Lbc
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1 r3 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1     // Catch: java.lang.Throwable -> Lbc
            r3.<init>()     // Catch: java.lang.Throwable -> Lbc
            android.os.Handler r10 = a.AbstractC0131b.l(r10)     // Catch: java.lang.Throwable -> Lbc
            r2.setOnImageAvailableListener(r3, r10)     // Catch: java.lang.Throwable -> Lbc
            android.view.Surface r10 = r2.getSurface()     // Catch: java.lang.Throwable -> Lbc
            androidx.compose.ui.graphics.layer.SurfaceUtils r3 = androidx.compose.ui.graphics.layer.SurfaceUtils.INSTANCE     // Catch: java.lang.Throwable -> Lbc
            android.graphics.Canvas r3 = r3.lockCanvas(r10)     // Catch: java.lang.Throwable -> Lbc
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.ui.graphics.Color.INSTANCE     // Catch: java.lang.Throwable -> Lcd
            long r6 = r6.m3818getBlack0d7_KjU()     // Catch: java.lang.Throwable -> Lcd
            int r6 = androidx.compose.ui.graphics.ColorKt.m3846toArgb8_81llA(r6)     // Catch: java.lang.Throwable -> Lcd
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> Lcd
            r3.drawColor(r6, r7)     // Catch: java.lang.Throwable -> Lcd
            androidx.compose.ui.graphics.Canvas r6 = androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(r3)     // Catch: java.lang.Throwable -> Lcd
            r9.draw$ui_graphics_release(r6, r4)     // Catch: java.lang.Throwable -> Lcd
            r10.unlockCanvasAndPost(r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r10 = r5.getResult()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> Lbc
            if (r10 != r9) goto Lbf
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> Lbc
            goto Lbf
        Lbc:
            r10 = move-exception
            r9 = r2
            goto Ld2
        Lbf:
            if (r10 != r1) goto Lc2
            return r1
        Lc2:
            r9 = r2
        Lc3:
            android.media.Image r10 = (android.media.Image) r10     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r10 = androidx.compose.ui.graphics.layer.LayerSnapshot_androidKt.access$toBitmap(r10)     // Catch: java.lang.Throwable -> L3f
            kotlin.jdk7.AutoCloseableKt.closeFinally(r9, r4)
            return r10
        Lcd:
            r9 = move-exception
            r10.unlockCanvasAndPost(r3)     // Catch: java.lang.Throwable -> Lbc
            throw r9     // Catch: java.lang.Throwable -> Lbc
        Ld2:
            throw r10     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r0 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.LayerSnapshotV22.toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
