package kotlin.io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.SecureDirectoryStream;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ DirectoryStream e(Object obj) {
        return (DirectoryStream) obj;
    }

    public static /* synthetic */ FileSystemException h() {
        return new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
    }

    public static /* synthetic */ FileSystemException i(String str) {
        return new FileSystemException(str);
    }

    public static /* bridge */ /* synthetic */ FileSystemException j(Throwable th) {
        return (FileSystemException) th;
    }

    public static /* synthetic */ FileSystemLoopException k(String str) {
        return new FileSystemLoopException(str);
    }

    public static /* synthetic */ void v() {
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }
}
