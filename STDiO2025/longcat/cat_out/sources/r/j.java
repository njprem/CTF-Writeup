package r;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import b.RunnableC0611n;

/* loaded from: classes.dex */
public abstract class j {
    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(final int i2, Handler handler) {
        getHandler(handler).post(new Runnable() { // from class: r.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f960a.onFontRetrievalFailed(i2);
            }
        });
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new RunnableC0611n(1, this, typeface));
    }

    public abstract void onFontRetrievalFailed(int i2);

    public abstract void onFontRetrieved(Typeface typeface);
}
