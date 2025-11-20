package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ android.graphics.BlendModeColorFilter f(int i2, android.graphics.BlendMode blendMode) {
        return new android.graphics.BlendModeColorFilter(i2, blendMode);
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendModeColorFilter g(android.graphics.ColorFilter colorFilter) {
        return (android.graphics.BlendModeColorFilter) colorFilter;
    }

    public static /* synthetic */ void h() {
    }

    public static /* bridge */ /* synthetic */ boolean n(android.graphics.ColorFilter colorFilter) {
        return colorFilter instanceof android.graphics.BlendModeColorFilter;
    }
}
