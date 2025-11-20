package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objM5794unboximpl;
        Object objM6498constructorimpl;
        Object objM5794unboximpl2;
        int size = list.size();
        List listMutableListOf = null;
        for (int i2 = 0; i2 < size; i2++) {
            Font font = list.get(i2);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m5817equalsimpl0(loadingStrategy, companion.m5822getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objM5794unboximpl = asyncTypefaceResult.m5794unboximpl();
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                Object objLoadBlocking = platformFontLoader.loadBlocking(font);
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objLoadBlocking, false, 8, null);
                                objM5794unboximpl = objLoadBlocking;
                            } catch (Exception e2) {
                                throw new IllegalStateException("Unable to load font " + font, e2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objM5794unboximpl != null) {
                    return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m5851synthesizeTypefaceFxwP2eA(typefaceRequest.m5876getFontSynthesisGVVA2EU(), objM5794unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m5875getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m5817equalsimpl0(loadingStrategy, companion.m5823getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objM5794unboximpl2 = asyncTypefaceResult2.m5794unboximpl();
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM6498constructorimpl = Result.m6498constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM6498constructorimpl = Result.m6498constructorimpl(ResultKt.createFailure(th2));
                            }
                            Object obj = Result.m6504isFailureimpl(objM6498constructorimpl) ? null : objM6498constructorimpl;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj, false, 8, null);
                            objM5794unboximpl2 = obj;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objM5794unboximpl2 != null) {
                    return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m5851synthesizeTypefaceFxwP2eA(typefaceRequest.m5876getFontSynthesisGVVA2EU(), objM5794unboximpl2, font, typefaceRequest.getFontWeight(), typefaceRequest.m5875getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m5817equalsimpl0(loadingStrategy, companion.m5821getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM5786get1ASDuI8 = asyncTypefaceCache.m5786get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM5786get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m5792isPermanentFailureimpl(asyncTypefaceResultM5786get1ASDuI8.m5794unboximpl()) && asyncTypefaceResultM5786get1ASDuI8.m5794unboximpl() != null) {
                        return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m5851synthesizeTypefaceFxwP2eA(typefaceRequest.m5876getFontSynthesisGVVA2EU(), asyncTypefaceResultM5786get1ASDuI8.m5794unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m5875getFontStyle_LCdwA()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(font);
                } else {
                    listMutableListOf.add(font);
                }
            }
        }
        return TuplesKt.to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
