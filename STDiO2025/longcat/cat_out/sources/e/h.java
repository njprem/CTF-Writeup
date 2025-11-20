package e;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f702a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f703b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f704c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f705d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f706e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f707f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f708g = new Bundle();

    public final boolean a(int i2, int i3, Intent intent) {
        String str = (String) this.f702a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f707f.remove(str);
        this.f708g.putParcelable(str, new C0629a(intent, i3));
        return true;
    }
}
