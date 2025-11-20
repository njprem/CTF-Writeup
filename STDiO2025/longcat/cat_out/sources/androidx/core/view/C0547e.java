package androidx.core.view;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: androidx.core.view.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f498a;

    public C0547e(DisplayCutout displayCutout) {
        this.f498a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0547e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f498a, ((C0547e) obj).f498a);
    }

    public final int hashCode() {
        return this.f498a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f498a + "}";
    }
}
