package androidx.compose.ui.text.platform;

import B.i;
import B.j;
import B.l;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "()V", "fontLoaded", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "loadState", "getFontLoadState", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {
    private State<Boolean> loadState;

    public DefaultImpl() {
        this.loadState = l.c() ? getFontLoadState() : null;
    }

    private final State<Boolean> getFontLoadState() {
        l lVarA = l.a();
        if (lVarA.b() == 1) {
            return new ImmutableBool(true);
        }
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        i iVar = new i() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // B.i
            public void onFailed(Throwable throwable) {
                this.loadState = EmojiCompatStatus_androidKt.Falsey;
            }

            @Override // B.i
            public void onInitialized() {
                mutableStateMutableStateOf$default.setValue(Boolean.TRUE);
                this.loadState = new ImmutableBool(true);
            }
        };
        lVarA.f100a.writeLock().lock();
        try {
            if (lVarA.f102c == 1 || lVarA.f102c == 2) {
                lVarA.f103d.post(new j(Arrays.asList(iVar), lVarA.f102c, null));
            } else {
                lVarA.f101b.add(iVar);
            }
            lVarA.f100a.writeLock().unlock();
            return mutableStateMutableStateOf$default;
        } catch (Throwable th) {
            lVarA.f100a.writeLock().unlock();
            throw th;
        }
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        State<Boolean> state = this.loadState;
        if (state != null) {
            Intrinsics.checkNotNull(state);
            return state;
        }
        if (!l.c()) {
            return EmojiCompatStatus_androidKt.Falsey;
        }
        State<Boolean> fontLoadState = getFontLoadState();
        this.loadState = fontLoadState;
        Intrinsics.checkNotNull(fontLoadState);
        return fontLoadState;
    }
}
