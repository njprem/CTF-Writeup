package androidx.versionedparcelable;

import O.a;
import O.c;
import O.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final d f607a;

    public ParcelImpl(Parcel parcel) {
        this.f607a = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new c(parcel).i(this.f607a);
    }
}
