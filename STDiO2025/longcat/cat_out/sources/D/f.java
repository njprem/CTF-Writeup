package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f159a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f160b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f161c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f162d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f163e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f164f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f165g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f[] f166h;

    static {
        f fVar = new f("Move", 0);
        f159a = fVar;
        f fVar2 = new f("Line", 1);
        f160b = fVar2;
        f fVar3 = new f("Quadratic", 2);
        f161c = fVar3;
        f fVar4 = new f("Conic", 3);
        f162d = fVar4;
        f fVar5 = new f("Cubic", 4);
        f163e = fVar5;
        f fVar6 = new f("Close", 5);
        f164f = fVar6;
        f fVar7 = new f("Done", 6);
        f165g = fVar7;
        f166h = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f166h.clone();
    }
}
