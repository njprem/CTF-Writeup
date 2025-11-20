package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DoubleFunction, A.a, TextInclusionStrategy, VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361a;

    public /* synthetic */ a(int i2) {
        this.f361a = i2;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return VisualTransformation.Companion.None$lambda$0(annotatedString);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d2) {
        switch (this.f361a) {
            case 0:
                return ColorSpaces.ExtendedSrgb$lambda$0(d2);
            case 1:
                return ColorSpaces.ExtendedSrgb$lambda$1(d2);
            default:
                return Rgb.DoubleIdentity$lambda$12(d2);
        }
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        switch (this.f361a) {
            case 4:
                return rect.overlaps(rect2);
            case 5:
                return TextInclusionStrategy.Companion.ContainsAll$lambda$1(rect, rect2);
            default:
                return TextInclusionStrategy.Companion.ContainsCenter$lambda$2(rect, rect2);
        }
    }
}
