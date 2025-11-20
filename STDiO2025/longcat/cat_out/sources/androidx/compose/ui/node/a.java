package androidx.compose.ui.node;

import androidx.compose.ui.text.android.LayoutIntrinsics_androidKt;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.uuid.Uuid;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f404a;

    public /* synthetic */ a(int i2) {
        this.f404a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f404a) {
            case 0:
                return LayoutNode.ZComparator$lambda$42((LayoutNode) obj, (LayoutNode) obj2);
            case 1:
                return LayoutIntrinsics_androidKt.minIntrinsicWidth$lambda$0((Pair) obj, (Pair) obj2);
            case 2:
                return Uuid.LEXICAL_ORDER$lambda$2((Uuid) obj, (Uuid) obj2);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b2 = bArr[i2];
                    byte b3 = bArr2[i2];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
        }
    }
}
