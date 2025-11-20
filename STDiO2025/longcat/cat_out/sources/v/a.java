package v;

import B.p;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1001c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f999a = i2;
        this.f1000b = obj;
        this.f1001c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f999a) {
            case 0:
                AndroidFontLoader_androidKt$loadAsync$2$1 androidFontLoader_androidKt$loadAsync$2$1 = (AndroidFontLoader_androidKt$loadAsync$2$1) ((p) this.f1000b).f115a;
                if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
                    androidFontLoader_androidKt$loadAsync$2$1.onFontRetrieved((Typeface) this.f1001c);
                    break;
                }
                break;
            default:
                ((f) this.f1000b).a(this.f1001c);
                break;
        }
    }
}
