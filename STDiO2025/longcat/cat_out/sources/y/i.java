package y;

import B.w;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f1063a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f1063a = new g(uri, clipDescription, uri2);
        } else {
            this.f1063a = new w(uri, clipDescription, uri2);
        }
    }

    public i(g gVar) {
        this.f1063a = gVar;
    }
}
