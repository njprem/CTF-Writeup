package androidx.core.view;

import java.util.List;

/* loaded from: classes.dex */
public abstract class E {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    e0 mDispachedInsets;
    private final int mDispatchMode;

    public E(int i2) {
        this.mDispatchMode = i2;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(N n2);

    public abstract void onPrepare(N n2);

    public abstract e0 onProgress(e0 e0Var, List list);

    public abstract D onStart(N n2, D d2);
}
