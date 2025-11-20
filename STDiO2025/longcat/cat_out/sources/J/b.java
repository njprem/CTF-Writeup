package J;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f192a;

    /* renamed from: b, reason: collision with root package name */
    public final f f193b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f194c;

    /* renamed from: d, reason: collision with root package name */
    public final File f195d;

    /* renamed from: e, reason: collision with root package name */
    public final String f196e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f197f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f198g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f199h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        byte[] bArr;
        this.f192a = executor;
        this.f193b = fVar;
        this.f196e = str;
        this.f195d = file;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = g.f216h;
                    break;
                case 26:
                    bArr = g.f215g;
                    break;
                case 27:
                    bArr = g.f214f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f213e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = g.f212d;
        }
        this.f194c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f193b.d();
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f192a.execute(new Runnable() { // from class: J.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f189a.f193b.b(i2, serializable);
            }
        });
    }
}
