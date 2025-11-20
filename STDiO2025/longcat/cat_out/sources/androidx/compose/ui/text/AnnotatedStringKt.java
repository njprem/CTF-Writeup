package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\b\u001a(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0000\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0000\u001aD\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0019\u0018\u00010\u0018\"\u0004\b\u0000\u0010\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001a0\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a(\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0000\u001a\u0014\u0010#\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\u0014\u0010&\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a,\u0010'\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0\u0019\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a*\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0019\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a*\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0019\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001aa\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010,\u001a\u00020\u00062>\b\u0004\u0010-\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u001a0.H\u0080\b\u001a \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u0018*\u00020\u00012\u0006\u0010,\u001a\u00020\u0006H\u0000\u001a\u001c\u00103\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a\u0014\u00104\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\u0014\u00105\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a?\u00106\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u00108\u001a\u0002092\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0087\b¢\u0006\u0002\u0010:\u001a?\u00106\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010;\u001a\u00020<2\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0087\b¢\u0006\u0002\u0010=\u001aG\u00106\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0087\b¢\u0006\u0002\u0010@\u001a=\u0010A\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010B\u001a\u00020C2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010D\u001a?\u0010E\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010F\u001a\u00020\u00062\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010G\u001a=\u0010E\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010F\u001a\u00020\b2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010H\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", "text", "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "ranges", "start", "end", "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalAnnotations", "", "getLocalParagraphStyles", "getLocalSpanStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", "style", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.listOf(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(Function1<? super AnnotatedString.Builder, Unit> function1) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                if (i2 == 0) {
                    String strSubstring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i2, int i3, int i4, int i5) {
        if (i2 <= i4 && i5 <= i3) {
            if (i3 == i5) {
                if ((i4 == i5) == (i2 == i3)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                if (i2 == 0) {
                    String strSubstring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends T> range = list.get(i4);
            AnnotatedString.Range<? extends T> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i2, range3.getStart()) - i2, Math.min(i3, range3.getEnd()) - i2, range3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i2 == i3 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i4);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), RangesKt.coerceIn(range3.getStart(), i2, i3) - i2, RangesKt.coerceIn(range3.getEnd(), i2, i3) - i2, range3.getTag()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i2 == i3 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i4);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), RangesKt.coerceIn(range3.getStart(), i2, i3) - i2, RangesKt.coerceIn(range3.getEnd(), i2, i3) - i2));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i2 == i3 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i4);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), RangesKt.coerceIn(range3.getStart(), i2, i3) - i2, RangesKt.coerceIn(range3.getEnd(), i2, i3) - i2));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i2, int i3, int i4, int i5) {
        return Math.max(i2, i4) < Math.min(i3, i5) || contains(i2, i3, i4, i5) || contains(i4, i5, i2, i3);
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> function2) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i2);
            arrayList.add(function2.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i2);
            ParagraphStyle paragraphStyleComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i3) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i3, start));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(paragraphStyleComponent1), start, end));
            i2++;
            i3 = end;
        }
        if (i3 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i3, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        String strSubstring;
        if (i2 != i3) {
            strSubstring = annotatedString.getText().substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, getLocalSpanStyles(annotatedString, i2, i3), null, null, 12, null);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStringAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushLink);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushTtsAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.emptyList(), CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushUrlAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }
}
