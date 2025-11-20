package y;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f1062a;

    public g(Object obj) {
        this.f1062a = (InputContentInfo) obj;
    }

    @Override // y.h
    public final ClipDescription a() {
        return this.f1062a.getDescription();
    }

    @Override // y.h
    public final Object b() {
        return this.f1062a;
    }

    @Override // y.h
    public final Uri c() {
        return this.f1062a.getContentUri();
    }

    @Override // y.h
    public final void d() {
        this.f1062a.requestPermission();
    }

    @Override // y.h
    public final Uri e() {
        return this.f1062a.getLinkUri();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1062a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
