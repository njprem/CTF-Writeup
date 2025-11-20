package I;

import B.C0127d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0127d f185a = new C0127d(5);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f186b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f187c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f188d;

    public static void a(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
