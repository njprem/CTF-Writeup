package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0017\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0019\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0019\u0010\u001d\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u001e\u0010\nR\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0019\u0010!\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\"\u0010\nR\u0019\u0010#\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b$\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/tokens/FilledCardTokens;", "", "()V", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerElevation", "Landroidx/compose/ui/unit/Dp;", "getContainerElevation-D9Ej5fM", "()F", "F", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledContainerColor", "getDisabledContainerColor", "DisabledContainerElevation", "getDisabledContainerElevation-D9Ej5fM", "DisabledContainerOpacity", "", "getDisabledContainerOpacity", "DraggedContainerElevation", "getDraggedContainerElevation-D9Ej5fM", "FocusContainerElevation", "getFocusContainerElevation-D9Ej5fM", "FocusIndicatorColor", "getFocusIndicatorColor", "HoverContainerElevation", "getHoverContainerElevation-D9Ej5fM", "IconColor", "getIconColor", "IconSize", "getIconSize-D9Ej5fM", "PressedContainerElevation", "getPressedContainerElevation-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FilledCardTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    private static final float DisabledContainerOpacity;
    private static final float DraggedContainerElevation;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float PressedContainerElevation;
    public static final FilledCardTokens INSTANCE = new FilledCardTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerHighest;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m2805getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
        DisabledContainerElevation = elevationTokens.m2805getLevel0D9Ej5fM();
        DisabledContainerOpacity = 0.38f;
        DraggedContainerElevation = elevationTokens.m2808getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m2805getLevel0D9Ej5fM();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        HoverContainerElevation = elevationTokens.m2806getLevel1D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = Dp.m6233constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m2805getLevel0D9Ej5fM();
    }

    private FilledCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2879getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2880getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2881getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2882getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2883getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2884getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2885getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}
