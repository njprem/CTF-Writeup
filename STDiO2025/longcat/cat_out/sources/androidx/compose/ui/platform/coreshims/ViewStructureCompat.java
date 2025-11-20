package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        public static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void setDimens(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
            viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
        }

        public static void setId(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
            viewStructure.setId(i2, str, str2, str3);
        }

        public static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void setTextStyle(ViewStructure viewStructure, float f2, int i2, int i3, int i4) {
            viewStructure.setTextStyle(f2, i2, i3, i4);
        }
    }

    private ViewStructureCompat(ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    public static ViewStructureCompat toViewStructureCompat(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public Bundle getExtras() {
        return Api23Impl.getExtras((ViewStructure) this.mWrappedObj);
    }

    public void setClassName(String str) {
        Api23Impl.setClassName((ViewStructure) this.mWrappedObj, str);
    }

    public void setContentDescription(CharSequence charSequence) {
        Api23Impl.setContentDescription((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setDimens(int i2, int i3, int i4, int i5, int i6, int i7) {
        Api23Impl.setDimens((ViewStructure) this.mWrappedObj, i2, i3, i4, i5, i6, i7);
    }

    public void setId(int i2, String str, String str2, String str3) {
        Api23Impl.setId((ViewStructure) this.mWrappedObj, i2, str, str2, str3);
    }

    public void setText(CharSequence charSequence) {
        Api23Impl.setText((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setTextStyle(float f2, int i2, int i3, int i4) {
        Api23Impl.setTextStyle((ViewStructure) this.mWrappedObj, f2, i2, i3, i4);
    }

    public ViewStructure toViewStructure() {
        return (ViewStructure) this.mWrappedObj;
    }
}
