package B;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import j.C0654g;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f98j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile l f99k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f100a;

    /* renamed from: b, reason: collision with root package name */
    public final C0654g f101b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f102c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f103d;

    /* renamed from: e, reason: collision with root package name */
    public final h f104e;

    /* renamed from: f, reason: collision with root package name */
    public final k f105f;

    /* renamed from: g, reason: collision with root package name */
    public final C0127d f106g;

    /* renamed from: h, reason: collision with root package name */
    public final int f107h;

    /* renamed from: i, reason: collision with root package name */
    public final C0129f f108i;

    public l(z zVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f100a = reentrantReadWriteLock;
        this.f102c = 3;
        k kVar = zVar.f141a;
        this.f105f = kVar;
        int i2 = zVar.f142b;
        this.f107h = i2;
        this.f108i = zVar.f143c;
        this.f103d = new Handler(Looper.getMainLooper());
        this.f101b = new C0654g();
        this.f106g = new C0127d(1);
        h hVar = new h(this);
        this.f104e = hVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f102c = 0;
            } catch (Throwable th) {
                this.f100a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.e(new g(hVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f98j) {
            try {
                lVar = f99k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public static boolean c() {
        return f99k != null;
    }

    public final int b() {
        this.f100a.readLock().lock();
        try {
            return this.f102c;
        } finally {
            this.f100a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f107h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f100a.writeLock().lock();
        try {
            if (this.f102c == 0) {
                return;
            }
            this.f102c = 0;
            this.f100a.writeLock().unlock();
            h hVar = this.f104e;
            l lVar = hVar.f92a;
            try {
                lVar.f105f.e(new g(hVar));
            } catch (Throwable th) {
                lVar.e(th);
            }
        } finally {
            this.f100a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f100a.writeLock().lock();
        try {
            this.f102c = 2;
            arrayList.addAll(this.f101b);
            this.f101b.clear();
            this.f100a.writeLock().unlock();
            this.f103d.post(new j(arrayList, this.f102c, th));
        } catch (Throwable th2) {
            this.f100a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        h hVar = this.f104e;
        hVar.getClass();
        Bundle bundle = editorInfo.extras;
        C.b bVar = hVar.f94c.f71a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f145b.getInt(iA + bVar.f144a) : 0);
        Bundle bundle2 = editorInfo.extras;
        hVar.f92a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
