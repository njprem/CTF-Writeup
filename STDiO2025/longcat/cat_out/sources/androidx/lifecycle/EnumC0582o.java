package androidx.lifecycle;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0582o {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0582o f586a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0582o f587b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0582o f588c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0582o f589d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0582o f590e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0582o[] f591f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f592g;

    static {
        EnumC0582o enumC0582o = new EnumC0582o("DESTROYED", 0);
        f586a = enumC0582o;
        EnumC0582o enumC0582o2 = new EnumC0582o("INITIALIZED", 1);
        f587b = enumC0582o2;
        EnumC0582o enumC0582o3 = new EnumC0582o(DebugCoroutineInfoImplKt.CREATED, 2);
        f588c = enumC0582o3;
        EnumC0582o enumC0582o4 = new EnumC0582o("STARTED", 3);
        f589d = enumC0582o4;
        EnumC0582o enumC0582o5 = new EnumC0582o("RESUMED", 4);
        f590e = enumC0582o5;
        EnumC0582o[] enumC0582oArr = {enumC0582o, enumC0582o2, enumC0582o3, enumC0582o4, enumC0582o5};
        f591f = enumC0582oArr;
        f592g = EnumEntriesKt.enumEntries(enumC0582oArr);
    }

    public static EnumC0582o valueOf(String str) {
        return (EnumC0582o) Enum.valueOf(EnumC0582o.class, str);
    }

    public static EnumC0582o[] values() {
        return (EnumC0582o[]) f591f.clone();
    }

    public final boolean a(EnumC0582o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
