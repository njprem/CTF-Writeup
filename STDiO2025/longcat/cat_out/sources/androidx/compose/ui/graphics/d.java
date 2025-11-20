package androidx.compose.ui.graphics;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.file.FileVisitor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ Typeface.Builder d(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* synthetic */ Typeface.Builder f(File file) {
        return new Typeface.Builder(file);
    }

    public static /* synthetic */ Typeface.Builder g(FileDescriptor fileDescriptor) {
        return new Typeface.Builder(fileDescriptor);
    }

    public static /* bridge */ /* synthetic */ AutofillId j(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ FileVisitor l(Object obj) {
        return (FileVisitor) obj;
    }

    public static /* bridge */ /* synthetic */ java.nio.file.Path m(Object obj) {
        return (java.nio.file.Path) obj;
    }

    public static /* synthetic */ void o() {
    }
}
