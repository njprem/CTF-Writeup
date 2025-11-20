package v;

import B.p;
import androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1003b;

    public b(p pVar, int i2) {
        this.f1002a = pVar;
        this.f1003b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidFontLoader_androidKt$loadAsync$2$1 androidFontLoader_androidKt$loadAsync$2$1 = (AndroidFontLoader_androidKt$loadAsync$2$1) this.f1002a.f115a;
        if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
            androidFontLoader_androidKt$loadAsync$2$1.onFontRetrievalFailed(this.f1003b);
        }
    }
}
