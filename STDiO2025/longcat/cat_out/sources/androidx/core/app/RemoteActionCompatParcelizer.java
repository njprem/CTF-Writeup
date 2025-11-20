package androidx.core.app;

import O.b;
import O.c;
import O.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarG = remoteActionCompat.f424a;
        boolean z = true;
        if (bVar.e(1)) {
            dVarG = bVar.g();
        }
        remoteActionCompat.f424a = (IconCompat) dVarG;
        CharSequence charSequence = remoteActionCompat.f425b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f262e);
        }
        remoteActionCompat.f425b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f426c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f262e);
        }
        remoteActionCompat.f426c = charSequence2;
        remoteActionCompat.f427d = (PendingIntent) bVar.f(remoteActionCompat.f427d, 4);
        boolean z2 = remoteActionCompat.f428e;
        if (bVar.e(5)) {
            z2 = ((c) bVar).f262e.readInt() != 0;
        }
        remoteActionCompat.f428e = z2;
        boolean z3 = remoteActionCompat.f429f;
        if (!bVar.e(6)) {
            z = z3;
        } else if (((c) bVar).f262e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f429f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f424a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f425b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f262e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f426c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f427d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f428e;
        bVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f429f;
        bVar.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
