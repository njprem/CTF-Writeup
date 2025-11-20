package B;

import android.text.Spannable;
import android.text.SpannableString;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public Object f116a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f117b;

    public /* synthetic */ s(Object obj, Object obj2) {
        this.f116a = obj;
        this.f117b = obj2;
    }

    @Override // B.t
    public Object a() {
        return (F) this.f116a;
    }

    public void b(v.h hVar) {
        int i2 = hVar.f1020b;
        v.n nVar = (v.n) this.f117b;
        p pVar = (p) this.f116a;
        if (i2 == 0) {
            nVar.execute(new v.a(0, pVar, hVar.f1019a));
        } else {
            nVar.execute(new v.b(pVar, i2));
        }
    }

    @Override // B.t
    public boolean c(CharSequence charSequence, int i2, int i3, C c2) {
        if ((c2.f78c & 4) > 0) {
            return true;
        }
        if (((F) this.f116a) == null) {
            this.f116a = new F(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0127d) this.f117b).getClass();
        ((F) this.f116a).setSpan(new D(c2), i2, i3, 33);
        return true;
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f116a = new int[size];
        this.f117b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f116a)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f117b)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public s(int i2, int i3) {
        this.f116a = new int[]{i2, i3};
        this.f117b = new float[]{0.0f, 1.0f};
    }

    public s(int i2, int i3, int i4) {
        this.f116a = new int[]{i2, i3, i4};
        this.f117b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
