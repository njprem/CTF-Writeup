package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f148a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f149b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f150c;

    static {
        a aVar = new a("AsConic", 0);
        f148a = aVar;
        a aVar2 = new a("AsQuadratics", 1);
        f149b = aVar2;
        f150c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f150c.clone();
    }
}
