package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"getString", "", "string", "Landroidx/compose/material3/internal/Strings;", "getString-2EP1pXo", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-qBjtwXw", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strings_androidKt {
    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m2607getString2EP1pXo(int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907677715, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    /* renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final String m2608getStringqBjtwXw(int i2, Object[] objArr, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1427268608, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strM2607getString2EP1pXo = m2607getString2EP1pXo(i2, composer, i3 & 14);
        Locale locale = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(locale, strM2607getString2EP1pXo, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
