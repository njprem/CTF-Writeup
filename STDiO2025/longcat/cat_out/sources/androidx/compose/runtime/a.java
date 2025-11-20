package androidx.compose.runtime;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComposerKt.InvalidationLocationAscending$lambda$15((Invalidation) obj, (Invalidation) obj2);
    }
}
