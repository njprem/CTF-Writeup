package androidx.core.graphics.drawable;

import O.b;
import O.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f431a;
        if (bVar.e(1)) {
            i2 = ((c) bVar).f262e.readInt();
        }
        iconCompat.f431a = i2;
        byte[] bArr = iconCompat.f433c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f262e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f433c = bArr;
        iconCompat.f434d = bVar.f(iconCompat.f434d, 3);
        int i4 = iconCompat.f435e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f262e.readInt();
        }
        iconCompat.f435e = i4;
        int i5 = iconCompat.f436f;
        if (bVar.e(5)) {
            i5 = ((c) bVar).f262e.readInt();
        }
        iconCompat.f436f = i5;
        iconCompat.f437g = (ColorStateList) bVar.f(iconCompat.f437g, 6);
        String string = iconCompat.f439i;
        if (bVar.e(7)) {
            string = ((c) bVar).f262e.readString();
        }
        iconCompat.f439i = string;
        String string2 = iconCompat.f440j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f262e.readString();
        }
        iconCompat.f440j = string2;
        iconCompat.f438h = PorterDuff.Mode.valueOf(iconCompat.f439i);
        switch (iconCompat.f431a) {
            case -1:
                Parcelable parcelable = iconCompat.f434d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f432b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f434d;
                if (parcelable2 != null) {
                    iconCompat.f432b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f433c;
                iconCompat.f432b = bArr3;
                iconCompat.f431a = 3;
                iconCompat.f435e = 0;
                iconCompat.f436f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                String str = new String(iconCompat.f433c, Charset.forName("UTF-16"));
                iconCompat.f432b = str;
                if (iconCompat.f431a == 2 && iconCompat.f440j == null) {
                    iconCompat.f440j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f432b = iconCompat.f433c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f439i = iconCompat.f438h.name();
        switch (iconCompat.f431a) {
            case -1:
                iconCompat.f434d = (Parcelable) iconCompat.f432b;
                break;
            case 1:
            case 5:
                iconCompat.f434d = (Parcelable) iconCompat.f432b;
                break;
            case 2:
                iconCompat.f433c = ((String) iconCompat.f432b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f433c = (byte[]) iconCompat.f432b;
                break;
            case 4:
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                iconCompat.f433c = iconCompat.f432b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f431a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f262e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f433c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f262e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f434d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f262e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f435e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f262e.writeInt(i3);
        }
        int i4 = iconCompat.f436f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f262e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f437g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f262e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f439i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f262e.writeString(str);
        }
        String str2 = iconCompat.f440j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f262e.writeString(str2);
        }
    }
}
