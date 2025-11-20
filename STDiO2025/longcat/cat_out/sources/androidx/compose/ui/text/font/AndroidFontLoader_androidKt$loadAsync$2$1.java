package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import r.j;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/text/font/AndroidFontLoader_androidKt$loadAsync$2$1", "Lr/j;", "Landroid/graphics/Typeface;", "typeface", "", "onFontRetrieved", "(Landroid/graphics/Typeface;)V", "", "reason", "onFontRetrievalFailed", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt$loadAsync$2$1 extends j {
    final /* synthetic */ CancellableContinuation<android.graphics.Typeface> $continuation;
    final /* synthetic */ ResourceFont $this_loadAsync;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidFontLoader_androidKt$loadAsync$2$1(CancellableContinuation<? super android.graphics.Typeface> cancellableContinuation, ResourceFont resourceFont) {
        this.$continuation = cancellableContinuation;
        this.$this_loadAsync = resourceFont;
    }

    @Override // r.j
    public void onFontRetrievalFailed(int reason) {
        this.$continuation.cancel(new IllegalStateException("Unable to load font " + this.$this_loadAsync + " (reason=" + reason + ')'));
    }

    @Override // r.j
    public void onFontRetrieved(android.graphics.Typeface typeface) {
        this.$continuation.resumeWith(Result.m6498constructorimpl(typeface));
    }
}
