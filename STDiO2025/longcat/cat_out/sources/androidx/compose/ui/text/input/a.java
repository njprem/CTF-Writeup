package androidx.compose.ui.text.input;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f418b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f417a = i2;
        this.f418b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        switch (this.f417a) {
            case 0:
                ((Runnable) this.f418b).run();
                break;
            default:
                HandlerDispatcherKt.postFrameCallback$lambda$6((CancellableContinuation) this.f418b, j2);
                break;
        }
    }
}
