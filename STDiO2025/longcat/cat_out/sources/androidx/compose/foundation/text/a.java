package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CodepointTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f317b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f316a = i2;
        this.f317b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i2, int i3) {
        switch (this.f316a) {
            case 0:
                return BasicSecureTextFieldKt.BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3((State) this.f317b, i2, i3);
            default:
                return SecureTextFieldController.codepointTransformation$lambda$0((SecureTextFieldController) this.f317b, i2, i3);
        }
    }
}
