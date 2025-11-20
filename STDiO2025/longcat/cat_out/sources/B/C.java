package B;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f75d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f76a;

    /* renamed from: b, reason: collision with root package name */
    public final B f77b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f78c = 0;

    public C(B b2, int i2) {
        this.f77b = b2;
        this.f76a = i2;
    }

    public final int a(int i2) {
        C.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarB.f145b;
        int i3 = iA + aVarB.f144a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final C.a b() {
        ThreadLocal threadLocal = f75d;
        C.a aVar = (C.a) threadLocal.get();
        if (aVar == null) {
            aVar = new C.a();
            threadLocal.set(aVar);
        }
        C.b bVar = this.f77b.f71a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i2 = iA + bVar.f144a;
            int i3 = (this.f76a * 4) + bVar.f145b.getInt(i2) + i2 + 4;
            int i4 = bVar.f145b.getInt(i3) + i3;
            ByteBuffer byteBuffer = bVar.f145b;
            aVar.f145b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f144a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                aVar.f146c = i5;
                aVar.f147d = aVar.f145b.getShort(i5);
                return aVar;
            }
            aVar.f144a = 0;
            aVar.f146c = 0;
            aVar.f147d = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? aVarB.f145b.getInt(iA + aVarB.f144a) : 0));
        sb.append(", codepoints:");
        C.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i3 = iA2 + aVarB2.f144a;
            i2 = aVarB2.f145b.getInt(aVarB2.f145b.getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
