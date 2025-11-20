package androidx.lifecycle;

import androidx.compose.ui.text.android.style.PlaceholderSpan;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0581n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC0581n[] $VALUES;
    public static final C0579l Companion;
    public static final EnumC0581n ON_ANY;
    public static final EnumC0581n ON_CREATE;
    public static final EnumC0581n ON_DESTROY;
    public static final EnumC0581n ON_PAUSE;
    public static final EnumC0581n ON_RESUME;
    public static final EnumC0581n ON_START;
    public static final EnumC0581n ON_STOP;

    static {
        EnumC0581n enumC0581n = new EnumC0581n("ON_CREATE", 0);
        ON_CREATE = enumC0581n;
        EnumC0581n enumC0581n2 = new EnumC0581n("ON_START", 1);
        ON_START = enumC0581n2;
        EnumC0581n enumC0581n3 = new EnumC0581n("ON_RESUME", 2);
        ON_RESUME = enumC0581n3;
        EnumC0581n enumC0581n4 = new EnumC0581n("ON_PAUSE", 3);
        ON_PAUSE = enumC0581n4;
        EnumC0581n enumC0581n5 = new EnumC0581n("ON_STOP", 4);
        ON_STOP = enumC0581n5;
        EnumC0581n enumC0581n6 = new EnumC0581n("ON_DESTROY", 5);
        ON_DESTROY = enumC0581n6;
        EnumC0581n enumC0581n7 = new EnumC0581n("ON_ANY", 6);
        ON_ANY = enumC0581n7;
        EnumC0581n[] enumC0581nArr = {enumC0581n, enumC0581n2, enumC0581n3, enumC0581n4, enumC0581n5, enumC0581n6, enumC0581n7};
        $VALUES = enumC0581nArr;
        $ENTRIES = EnumEntriesKt.enumEntries(enumC0581nArr);
        Companion = new C0579l();
    }

    public static EnumC0581n valueOf(String str) {
        return (EnumC0581n) Enum.valueOf(EnumC0581n.class, str);
    }

    public static EnumC0581n[] values() {
        return (EnumC0581n[]) $VALUES.clone();
    }

    public final EnumC0582o a() {
        switch (AbstractC0580m.f585a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0582o.f588c;
            case 3:
            case 4:
                return EnumC0582o.f589d;
            case 5:
                return EnumC0582o.f590e;
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                return EnumC0582o.f586a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
