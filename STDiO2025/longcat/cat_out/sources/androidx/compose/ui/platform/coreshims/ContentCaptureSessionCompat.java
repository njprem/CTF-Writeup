package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.i;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentCaptureSessionCompat {
    private static final String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final View mView;
    private final Object mWrappedObj;

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    public static class Api29Impl {
        private Api29Impl() {
        }

        public static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newAutofillId(autofillId, j2);
        }

        public static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j2);
        }

        public static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public static class Api34Impl {
        private Api34Impl() {
        }

        public static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public AutofillId newAutofillId(long j2) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionD = i.d(this.mWrappedObj);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.mView);
        Objects.requireNonNull(autofillId);
        return Api29Impl.newAutofillId(contentCaptureSessionD, autofillId.toAutofillId(), j2);
    }

    public ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure(i.d(this.mWrappedObj), autofillId, j2));
        }
        return null;
    }

    public void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewTextChanged(i.d(this.mWrappedObj), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(List<ViewStructure> list) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            Api34Impl.notifyViewsAppeared(i.d(this.mWrappedObj), list);
            return;
        }
        if (i2 >= 29) {
            ViewStructure viewStructureNewViewStructure = Api29Impl.newViewStructure(i.d(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(i.d(this.mWrappedObj), viewStructureNewViewStructure);
            for (int i3 = 0; i3 < list.size(); i3++) {
                Api29Impl.notifyViewAppeared(i.d(this.mWrappedObj), list.get(i3));
            }
            ViewStructure viewStructureNewViewStructure2 = Api29Impl.newViewStructure(i.d(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(i.d(this.mWrappedObj), viewStructureNewViewStructure2);
        }
    }

    public void notifyViewsDisappeared(long[] jArr) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            ContentCaptureSession contentCaptureSessionD = i.d(this.mWrappedObj);
            AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            Api29Impl.notifyViewsDisappeared(contentCaptureSessionD, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i2 >= 29) {
            ViewStructure viewStructureNewViewStructure = Api29Impl.newViewStructure(i.d(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(i.d(this.mWrappedObj), viewStructureNewViewStructure);
            ContentCaptureSession contentCaptureSessionD2 = i.d(this.mWrappedObj);
            AutofillIdCompat autofillId2 = ViewCompatShims.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId2);
            Api29Impl.notifyViewsDisappeared(contentCaptureSessionD2, autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureNewViewStructure2 = Api29Impl.newViewStructure(i.d(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(i.d(this.mWrappedObj), viewStructureNewViewStructure2);
        }
    }

    public ContentCaptureSession toContentCaptureSession() {
        return i.d(this.mWrappedObj);
    }
}
