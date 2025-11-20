package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import j.C0639E;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/res/ResourceIdCache;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "resolveResourcePath", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "", "clear", "Lj/E;", "resIdPathMap", "Lj/E;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;
    private final C0639E resIdPathMap = new C0639E();

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.d();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final TypedValue resolveResourcePath(Resources res, int id) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.resIdPathMap.c(id);
            if (typedValue == null) {
                typedValue = new TypedValue();
                res.getValue(id, typedValue, true);
                C0639E c0639e = this.resIdPathMap;
                int iE = c0639e.e(id);
                Object[] objArr = c0639e.f853c;
                Object obj = objArr[iE];
                c0639e.f852b[iE] = id;
                objArr[iE] = typedValue;
            }
        }
        return typedValue;
    }
}
