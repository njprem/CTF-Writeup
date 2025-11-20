package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JBQ\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB/\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010B;\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0013J:\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107JF\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109J^\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;J^\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b:\u0010<J\u0013\u0010=\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010?\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0002\b@J\b\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0000J\u0017\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020\u0005H\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020IH\u0016R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00038BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u001a\u0010'\u001a\u00020\t8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0014\u0010)\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u00020\u00078BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "platformImeOptions", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "showKeyboardOnFocus", "hintLocales", "Landroidx/compose/ui/text/intl/LocaleList;", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrectEnabled", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect$annotations", "()V", "getAutoCorrect", "()Z", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "autoCorrectOrDefault", "getAutoCorrectOrDefault", "getCapitalization-IUNYP9k", "()I", "I", "capitalizationOrDefault", "getCapitalizationOrDefault-IUNYP9k", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "hintLocalesOrDefault", "getHintLocalesOrDefault", "getImeAction-eUduSuo", "imeActionOrDefault", "getImeActionOrDefault-eUduSuo$foundation_release", "isCompletelyUnspecified", "getKeyboardType-PjHm6EE", "keyboardTypeOrDefault", "getKeyboardTypeOrDefault-PjHm6EE", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "shouldShowKeyboardOnFocus", "getShouldShowKeyboardOnFocus$annotations", "getShouldShowKeyboardOnFocus", "getShowKeyboardOnFocus", "showKeyboardOnFocusOrDefault", "getShowKeyboardOnFocusOrDefault$foundation_release", "copy", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-INvB4aQ", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "other", "fillUnspecifiedValuesWith", "fillUnspecifiedValuesWith$foundation_release", "hashCode", "", "merge", "toImeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "singleLine", "toImeOptions$foundation_release", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, WorkQueueKt.MASK, (DefaultConstructorMarker) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m5957getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (DefaultConstructorMarker) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "SecureTextField", "getSecureTextField$foundation_release$annotations", "getSecureTextField$foundation_release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.SecureTextField;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bool, i3, i4, platformImeOptions, bool2, localeList);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m960copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m966copy3m2b7yw(i2, z, i3, i4);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m961copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i6;
        PlatformImeOptions platformImeOptions2;
        Boolean bool4;
        int i7;
        KeyboardOptions keyboardOptions2;
        int i8;
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i5 & 32) != 0) {
            bool2 = null;
        }
        if ((i5 & 64) != 0) {
            localeList2 = null;
            platformImeOptions2 = platformImeOptions;
            bool3 = bool2;
            i7 = i3;
            i6 = i4;
            i8 = i2;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i6 = i4;
            platformImeOptions2 = platformImeOptions;
            bool4 = bool;
            i7 = i3;
            keyboardOptions2 = keyboardOptions;
            i8 = i2;
        }
        return keyboardOptions2.m967copyINvB4aQ(i8, bool4, i7, i6, platformImeOptions2, bool3, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m963copyij11fho$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i6 = i3;
        return keyboardOptions.m969copyij11fho(i2, z, i6, i4, platformImeOptions2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m964getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM5918boximpl = KeyboardCapitalization.m5918boximpl(this.capitalization);
        int value = keyboardCapitalizationM5918boximpl.getValue();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.INSTANCE;
        if (KeyboardCapitalization.m5921equalsimpl0(value, companion.m5933getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM5918boximpl = null;
        }
        return keyboardCapitalizationM5918boximpl != null ? keyboardCapitalizationM5918boximpl.getValue() : companion.m5931getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m965getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM5935boximpl = KeyboardType.m5935boximpl(this.keyboardType);
        int value = keyboardTypeM5935boximpl.getValue();
        KeyboardType.Companion companion = KeyboardType.INSTANCE;
        if (KeyboardType.m5938equalsimpl0(value, companion.m5960getUnspecifiedPjHm6EE())) {
            keyboardTypeM5935boximpl = null;
        }
        return keyboardTypeM5935boximpl != null ? keyboardTypeM5935boximpl.getValue() : companion.m5959getTextPjHm6EE();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m5921equalsimpl0(this.capitalization, KeyboardCapitalization.INSTANCE.m5933getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m5938equalsimpl0(this.keyboardType, KeyboardType.INSTANCE.m5960getUnspecifiedPjHm6EE()) && ImeAction.m5885equalsimpl0(this.imeAction, ImeAction.INSTANCE.m5906getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ImeOptions.INSTANCE.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m966copy3m2b7yw(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m967copyINvB4aQ(int capitalization, Boolean autoCorrectEnabled, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, autoCorrectEnabled, keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m969copyij11fho(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return KeyboardCapitalization.m5921equalsimpl0(this.capitalization, keyboardOptions.capitalization) && Intrinsics.areEqual(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m5938equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m5885equalsimpl0(this.imeAction, keyboardOptions.imeAction) && Intrinsics.areEqual(this.platformImeOptions, keyboardOptions.platformImeOptions) && Intrinsics.areEqual(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.areEqual(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions other) {
        if (other == null || other.isCompletelyUnspecified() || Intrinsics.areEqual(other, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return other;
        }
        KeyboardCapitalization keyboardCapitalizationM5918boximpl = KeyboardCapitalization.m5918boximpl(this.capitalization);
        if (KeyboardCapitalization.m5921equalsimpl0(keyboardCapitalizationM5918boximpl.getValue(), KeyboardCapitalization.INSTANCE.m5933getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM5918boximpl = null;
        }
        int value = keyboardCapitalizationM5918boximpl != null ? keyboardCapitalizationM5918boximpl.getValue() : other.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = other.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM5935boximpl = KeyboardType.m5935boximpl(this.keyboardType);
        if (KeyboardType.m5938equalsimpl0(keyboardTypeM5935boximpl.getValue(), KeyboardType.INSTANCE.m5960getUnspecifiedPjHm6EE())) {
            keyboardTypeM5935boximpl = null;
        }
        int value2 = keyboardTypeM5935boximpl != null ? keyboardTypeM5935boximpl.getValue() : other.keyboardType;
        ImeAction imeActionM5882boximpl = ImeAction.m5882boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m5885equalsimpl0(imeActionM5882boximpl.getValue(), ImeAction.INSTANCE.m5906getUnspecifiedeUduSuo()) ? null : imeActionM5882boximpl;
        int value3 = imeAction != null ? imeAction.getValue() : other.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = other.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = other.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = other.hintLocales;
        }
        return new KeyboardOptions(value, bool2, value2, value3, platformImeOptions2, bool4, localeList, (DefaultConstructorMarker) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m972getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM5882boximpl = ImeAction.m5882boximpl(this.imeAction);
        int value = imeActionM5882boximpl.getValue();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m5885equalsimpl0(value, companion.m5906getUnspecifiedeUduSuo())) {
            imeActionM5882boximpl = null;
        }
        return imeActionM5882boximpl != null ? imeActionM5882boximpl.getValue() : companion.m5898getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        int iM5922hashCodeimpl = KeyboardCapitalization.m5922hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iM5886hashCodeimpl = (ImeAction.m5886hashCodeimpl(this.imeAction) + ((KeyboardType.m5939hashCodeimpl(this.keyboardType) + ((iM5922hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode = (iM5886hashCodeimpl + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode2 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final KeyboardOptions merge(KeyboardOptions other) {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        return (other == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = other.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    public final ImeOptions toImeOptions$foundation_release(boolean singleLine) {
        return new ImeOptions(singleLine, m964getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m965getKeyboardTypeOrDefaultPjHm6EE(), m972getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m5923toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m5940toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m5887toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, i3, i4, platformImeOptions, bool, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m968copyINvB4aQ(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, i3, i4, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, i3, i4);
    }

    private KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i2;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i3;
        this.imeAction = i4;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m962copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i5 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        if ((i5 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        Boolean bool2 = bool;
        LocaleList localeList2 = localeList;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i6 = i3;
        return keyboardOptions.m968copyINvB4aQ(i2, z, i6, i4, platformImeOptions2, bool2, localeList2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int iM5933getUnspecifiedIUNYP9k = (i5 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m5933getUnspecifiedIUNYP9k() : i2;
        Boolean bool3 = (i5 & 2) != 0 ? null : bool;
        int iM5960getUnspecifiedPjHm6EE = (i5 & 4) != 0 ? KeyboardType.INSTANCE.m5960getUnspecifiedPjHm6EE() : i3;
        int iM5906getUnspecifiedeUduSuo = (i5 & 8) != 0 ? ImeAction.INSTANCE.m5906getUnspecifiedeUduSuo() : i4;
        PlatformImeOptions platformImeOptions2 = (i5 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i5 & 32) != 0 ? null : bool2;
        this(iM5933getUnspecifiedIUNYP9k, bool3, iM5960getUnspecifiedPjHm6EE, iM5906getUnspecifiedeUduSuo, platformImeOptions2, bool4, (i5 & 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m5933getUnspecifiedIUNYP9k() : i2, z, (i5 & 4) != 0 ? KeyboardType.INSTANCE.m5960getUnspecifiedPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.INSTANCE.m5906getUnspecifiedeUduSuo() : i4, (i5 & 16) != 0 ? null : platformImeOptions, (i5 & 32) != 0 ? null : bool, (i5 & 64) != 0 ? null : localeList, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i2, Boolean.valueOf(z), i3, i4, platformImeOptions, bool, localeList, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m5933getUnspecifiedIUNYP9k() : i2, (i5 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i5 & 4) != 0 ? KeyboardType.INSTANCE.m5960getUnspecifiedPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.INSTANCE.m5898getDefaulteUduSuo() : i4, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4) {
        this(i2, Boolean.valueOf(z), i3, i4, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m5931getNoneIUNYP9k() : i2, (i5 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i5 & 4) != 0 ? KeyboardType.INSTANCE.m5959getTextPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.INSTANCE.m5898getDefaulteUduSuo() : i4, (i5 & 16) != 0 ? null : platformImeOptions, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions) {
        this(i2, Boolean.valueOf(z), i3, i4, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (DefaultConstructorMarker) null);
    }
}
