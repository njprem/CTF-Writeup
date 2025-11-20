package J;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f224b;

    /* renamed from: c, reason: collision with root package name */
    public final long f225c;

    /* renamed from: d, reason: collision with root package name */
    public final long f226d;

    public k(int i2, int i3, long j2, long j3) {
        this.f223a = i2;
        this.f224b = i3;
        this.f225c = j2;
        this.f226d = j3;
    }

    public static k a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f223a);
            dataOutputStream.writeInt(this.f224b);
            dataOutputStream.writeLong(this.f225c);
            dataOutputStream.writeLong(this.f226d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f224b == kVar.f224b && this.f225c == kVar.f225c && this.f223a == kVar.f223a && this.f226d == kVar.f226d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f224b), Long.valueOf(this.f225c), Integer.valueOf(this.f223a), Long.valueOf(this.f226d));
    }
}
