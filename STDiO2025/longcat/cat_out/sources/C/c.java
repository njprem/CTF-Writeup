package C;

import B.C0127d;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f144a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f145b;

    /* renamed from: c, reason: collision with root package name */
    public int f146c;

    /* renamed from: d, reason: collision with root package name */
    public int f147d;

    public c() {
        if (C0127d.f87b == null) {
            C0127d.f87b = new C0127d(4);
        }
    }

    public final int a(int i2) {
        if (i2 < this.f147d) {
            return this.f145b.getShort(this.f146c + i2);
        }
        return 0;
    }
}
