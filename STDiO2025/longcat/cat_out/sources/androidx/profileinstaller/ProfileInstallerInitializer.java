package androidx.profileinstaller;

import B.C0127d;
import M.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // M.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // M.b
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: J.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                this.f219a.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C0127d(8);
    }
}
