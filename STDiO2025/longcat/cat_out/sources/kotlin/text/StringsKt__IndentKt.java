package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return line;
            }
        } : new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return str + line;
            }
        };
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return i2 == -1 ? str.length() : i2;
    }

    public static final String prependIndent(String str, final String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt.prependIndent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (StringsKt__StringsKt.isBlank(it)) {
                    return it.length() < indent.length() ? indent : it;
                }
                return indent + it;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i2, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        String strInvoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i3 = 0;
        while (true) {
            String strInvoke2 = null;
            if (!it.hasNext()) {
                String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(i2), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) next;
            if (((i3 != 0 && i3 != lastIndex) || !StringsKt__StringsKt.isBlank(str)) && ((strInvoke = function12.invoke(str)) == null || (strInvoke2 = function1.invoke(strInvoke)) == null)) {
                strInvoke2 = str;
            }
            if (strInvoke2 != null) {
                arrayList.add(strInvoke2);
            }
            i3 = i4;
        }
    }

    public static final String replaceIndent(String str, String newIndent) {
        String strDrop;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listLines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!StringsKt__StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) obj2)));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.minOrNull((Iterable) arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int size2 = (listLines.size() * newIndent.length()) + str.length();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = listLines.iterator();
        while (true) {
            String strInvoke = null;
            if (!it.hasNext()) {
                String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList3, new StringBuilder(size2), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            Object next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) next;
            if (((i2 != 0 && i2 != lastIndex) || !StringsKt__StringsKt.isBlank(str2)) && ((strDrop = StringsKt___StringsKt.drop(str2, iIntValue)) == null || (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strDrop)) == null)) {
                strInvoke = str2;
            }
            if (strInvoke != null) {
                arrayList3.add(strInvoke);
            }
            i2 = i4;
        }
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndentByMargin(String str, String newIndent, String marginPrefix) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.isBlank(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listLines = StringsKt__StringsKt.lines(str);
        int length = str.length() + (listLines.size() * newIndent.length());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listLines.iterator();
        int i2 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) next;
            if ((i2 != 0 && i2 != lastIndex) || !StringsKt__StringsKt.isBlank(str3)) {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.isWhitespace(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 == -1) {
                    str2 = str3;
                } else {
                    str2 = str3;
                    int i5 = i4;
                    if (StringsKt__StringsJVMKt.startsWith$default(str2, marginPrefix, i5, false, 4, null)) {
                        int length3 = marginPrefix.length() + i5;
                        Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring == null || (strSubstring = indentFunction$StringsKt__IndentKt.invoke(strSubstring)) == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i2 = i3;
        }
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        if ((i2 & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    public static String trimIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    public static final String trimMargin(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}
