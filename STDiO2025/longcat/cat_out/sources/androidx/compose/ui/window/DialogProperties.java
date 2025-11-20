package androidx.compose.ui.window;

import J.d;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B%\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "dismissOnBackPress", "", "dismissOnClickOutside", "usePlatformDefaultWidth", "(ZZZ)V", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "decorFitsSystemWindows", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "getDecorFitsSystemWindows", "()Z", "getDismissOnBackPress", "getDismissOnClickOutside", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", "hashCode", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) other;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.decorFitsSystemWindows) + d.i(this.usePlatformDefaultWidth, (this.securePolicy.hashCode() + d.i(this.dismissOnClickOutside, Boolean.hashCode(this.dismissOnBackPress) * 31, 31)) * 31, 31);
    }

    public DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z3;
        this.decorFitsSystemWindows = z4;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? true : z4);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3);
    }

    public DialogProperties(boolean z, boolean z2, boolean z3) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy) {
        this(z, z2, secureFlagPolicy, true, true);
    }
}
