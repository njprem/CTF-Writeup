package O;

import android.os.Parcel;
import android.util.SparseIntArray;
import j.C0653f;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f261d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f262e;

    /* renamed from: f, reason: collision with root package name */
    public final int f263f;

    /* renamed from: g, reason: collision with root package name */
    public final int f264g;

    /* renamed from: h, reason: collision with root package name */
    public final String f265h;

    /* renamed from: i, reason: collision with root package name */
    public int f266i;

    /* renamed from: j, reason: collision with root package name */
    public int f267j;

    /* renamed from: k, reason: collision with root package name */
    public int f268k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0653f(0), new C0653f(0), new C0653f(0));
    }

    @Override // O.b
    public final c a() {
        Parcel parcel = this.f262e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f267j;
        if (i2 == this.f263f) {
            i2 = this.f264g;
        }
        return new c(parcel, iDataPosition, i2, this.f265h + "  ", this.f258a, this.f259b, this.f260c);
    }

    @Override // O.b
    public final boolean e(int i2) {
        while (this.f267j < this.f264g) {
            int i3 = this.f268k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f267j;
            Parcel parcel = this.f262e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f268k = parcel.readInt();
            this.f267j += i5;
        }
        return this.f268k == i2;
    }

    @Override // O.b
    public final void h(int i2) {
        int i3 = this.f266i;
        SparseIntArray sparseIntArray = this.f261d;
        Parcel parcel = this.f262e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f266i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, C0653f c0653f, C0653f c0653f2, C0653f c0653f3) {
        super(c0653f, c0653f2, c0653f3);
        this.f261d = new SparseIntArray();
        this.f266i = -1;
        this.f268k = -1;
        this.f262e = parcel;
        this.f263f = i2;
        this.f264g = i3;
        this.f267j = i2;
        this.f265h = str;
    }
}
