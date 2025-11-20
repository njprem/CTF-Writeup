package B;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: B.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128e extends C0127d {
    @Override // B.C0127d
    public final Signature[] a(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
