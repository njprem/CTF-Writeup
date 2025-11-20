package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.InterfaceC0556n;
import androidx.core.view.N;
import androidx.core.view.e0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u00100\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/E;", "Ljava/lang/Runnable;", "Landroidx/core/view/n;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "composeInsets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V", "Landroidx/core/view/N;", "animation", "", "onPrepare", "(Landroidx/core/view/N;)V", "Landroidx/core/view/D;", "bounds", "onStart", "(Landroidx/core/view/N;Landroidx/core/view/D;)Landroidx/core/view/D;", "Landroidx/core/view/e0;", "insets", "", "runningAnimations", "onProgress", "(Landroidx/core/view/e0;Ljava/util/List;)Landroidx/core/view/e0;", "onEnd", "Landroid/view/View;", "view", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/e0;)Landroidx/core/view/e0;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getComposeInsets", "()Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "prepared", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "runningAnimation", "getRunningAnimation", "setRunningAnimation", "savedInsets", "Landroidx/core/view/e0;", "getSavedInsets", "()Landroidx/core/view/e0;", "setSavedInsets", "(Landroidx/core/view/e0;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class InsetsListener extends E implements Runnable, InterfaceC0556n, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;
    private e0 savedInsets;

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.getConsumes() ? 1 : 0);
        this.composeInsets = windowInsetsHolder;
    }

    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    public final e0 getSavedInsets() {
        return this.savedInsets;
    }

    @Override // androidx.core.view.InterfaceC0556n
    public e0 onApplyWindowInsets(View view, e0 insets) {
        this.savedInsets = insets;
        this.composeInsets.updateImeAnimationTarget(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(insets);
            WindowInsetsHolder.update$default(this.composeInsets, insets, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? e0.f499b : insets;
    }

    @Override // androidx.core.view.E
    public void onEnd(N animation) {
        this.prepared = false;
        this.runningAnimation = false;
        e0 e0Var = this.savedInsets;
        if (animation.f470a.a() != 0 && e0Var != null) {
            this.composeInsets.updateImeAnimationSource(e0Var);
            this.composeInsets.updateImeAnimationTarget(e0Var);
            WindowInsetsHolder.update$default(this.composeInsets, e0Var, 0, 2, null);
        }
        this.savedInsets = null;
    }

    @Override // androidx.core.view.E
    public void onPrepare(N animation) {
        this.prepared = true;
        this.runningAnimation = true;
    }

    @Override // androidx.core.view.E
    public e0 onProgress(e0 insets, List<N> runningAnimations) {
        WindowInsetsHolder.update$default(this.composeInsets, insets, 0, 2, null);
        return this.composeInsets.getConsumes() ? e0.f499b : insets;
    }

    @Override // androidx.core.view.E
    public D onStart(N animation, D bounds) {
        this.prepared = false;
        return bounds;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            e0 e0Var = this.savedInsets;
            if (e0Var != null) {
                this.composeInsets.updateImeAnimationSource(e0Var);
                WindowInsetsHolder.update$default(this.composeInsets, e0Var, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z) {
        this.prepared = z;
    }

    public final void setRunningAnimation(boolean z) {
        this.runningAnimation = z;
    }

    public final void setSavedInsets(e0 e0Var) {
        this.savedInsets = e0Var;
    }
}
