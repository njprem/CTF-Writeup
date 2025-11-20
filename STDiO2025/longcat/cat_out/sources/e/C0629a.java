package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629a implements Parcelable {
    public static final Parcelable.Creator<C0629a> CREATOR = new O.a(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f697a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f698b;

    public C0629a(Intent intent, int i2) {
        this.f697a = i2;
        this.f698b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f697a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f698b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f697a);
        Intent intent = this.f698b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i2);
        }
    }
}
