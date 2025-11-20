package androidx.compose.foundation.gestures;

import j.C0644J;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "T", "", "<init>", "()V", "", "position", "", "at", "(Ljava/lang/Object;F)V", "Lj/J;", "anchors", "Lj/J;", "getAnchors$foundation_release", "()Lj/J;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final C0644J anchors = new C0644J();

    public final void at(T t, float f2) {
        this.anchors.e(t, f2);
    }

    /* renamed from: getAnchors$foundation_release, reason: from getter */
    public final C0644J getAnchors() {
        return this.anchors;
    }
}
