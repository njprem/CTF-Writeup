package O;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import e.C0629a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f257a) {
            case 0:
                return new ParcelImpl(parcel);
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0629a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f257a) {
            case 0:
                return new ParcelImpl[i2];
            default:
                return new C0629a[i2];
        }
    }
}
