package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f409b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f408a = i2;
        this.f409b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f408a) {
            case 0:
                ((Function0) this.f409b).invoke();
                break;
            case 1:
                AndroidComposeView.sendHoverExitEvent$lambda$8((AndroidComposeView) this.f409b);
                break;
            default:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$60((AndroidComposeViewAccessibilityDelegateCompat) this.f409b);
                break;
        }
    }
}
