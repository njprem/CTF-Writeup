package kotlin.text;

import androidx.compose.runtime.changelist.a;
import androidx.compose.ui.graphics.Fields;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002\u001a(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u001a@\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a@\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a5\u0010 \u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0082\b\u001a\u001c\u0010'\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a$\u0010(\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002\u001a<\u0010,\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0011H\u0002\u001a\u001c\u0010/\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u0015\u00100\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0082\b\u001a,\u00101\u001a\u00020\u0011*\u0002022\u0006\u0010!\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a<\u00101\u001a\u00020\u0011*\u0002022\u0006\u0010!\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a*\u00109\u001a\u00020:*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u00109\u001a\u00020:*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a*\u0010=\u001a\u000202*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010=\u001a\u000202*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a&\u0010>\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a&\u0010A\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a&\u0010B\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a$\u0010C\u001a\u000202*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a*\u0010D\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010D\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a,\u0010E\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u0011H\u0003\u001a*\u0010F\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0001\u001a\u0016\u0010F\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a,\u0010G\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u0011H\u0003\u001a*\u0010H\u001a\u00020I*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010H\u001a\u00020I*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0015\u0010J\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0082\b\u001a\u0014\u0010K\u001a\u00020:*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0002\u001a\u001c\u0010L\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u001c\u0010M\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u0014\u0010N\u001a\u00020O*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0002\u001a,\u0010P\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u0011H\u0002\u001a,\u0010S\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0002\u001a,\u0010T\u001a\u00020)*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002\u001a\u001c\u0010U\u001a\u00020\u0011*\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020:2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a*\u0010V\u001a\u00020\u000b*\u0002022\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u0002022\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020I2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a$\u0010W\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0011H\u0003\u001a,\u0010\\\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010]\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010^\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010_\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "checkFormatLength", "formatLength", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "index", "endIndex", "part", "ignoreCase", "", "partName", "checkNewLineAt", "checkNumberOfDigits", "", "startIndex", "typeHexLength", "checkPrefixSuffixNumberOfDigits", "prefix", "suffix", "checkZeroDigits", "decimalFromHexDigitAt", "formatByteAt", "", "byteToDigits", "destination", "", "destinationOffset", "bytePrefix", "byteSuffix", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArraySlowPath", "hexToInt", "hexToIntImpl", "hexToLong", "hexToLongImpl", "hexToShort", "", "longDecimalFromHexDigitAt", "parseByteAt", "parseInt", "parseLong", "throwInvalidDigitAt", "", "throwInvalidNumberOfDigits", "specifier", "expected", "throwInvalidPrefixSuffix", "throwNotContainedAt", "toCharArrayIfNotEmpty", "toHexString", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toHexStringNoLineAndGroupSeparator", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringSlowPath", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[Fields.RotationX];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = LOWER_CASE_HEX_DIGITS.charAt(i3 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i3 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[Fields.RotationX];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr2[i4] = UPPER_CASE_HEX_DIGITS.charAt(i4 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i4 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[Fields.RotationX];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr3[i5] = -1;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i6)] = i7;
            i6++;
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i8)] = i9;
            i8++;
            i9++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[Fields.RotationX];
        for (int i10 = 0; i10 < 256; i10++) {
            jArr[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        while (i2 < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i2)] = i13;
            i2++;
            i13++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j2, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j3 = i2;
        return ((j3 - 1) * i3) + (j2 * j3);
    }

    private static final int checkContainsAt(String str, int i2, int i3, String str2, boolean z, String str3) {
        if (str2.length() == 0) {
            return i2;
        }
        int length = str2.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i4), str.charAt(i2 + i4), z)) {
                throwNotContainedAt(str, i2, i3, str2, str3);
            }
        }
        return str2.length() + i2;
    }

    private static final int checkFormatLength(long j2) {
        if (0 <= j2 && j2 <= 2147483647L) {
            return (int) j2;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m6718toStringimpl(ULong.m6672constructorimpl(j2))));
    }

    private static final int checkNewLineAt(String str, int i2, int i3) {
        if (str.charAt(i2) == '\r') {
            int i4 = i2 + 1;
            return (i4 >= i3 || str.charAt(i4) != '\n') ? i4 : i2 + 2;
        }
        if (str.charAt(i2) == '\n') {
            return i2 + 1;
        }
        StringBuilder sbP = a.p(i2, "Expected a new line at index ", ", but was ");
        sbP.append(str.charAt(i2));
        throw new NumberFormatException(sbP.toString());
    }

    private static final void checkNumberOfDigits(String str, int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if (i5 < 1) {
            throwInvalidNumberOfDigits(str, i2, i3, "at least", 1);
        } else if (i5 > i4) {
            checkZeroDigits(str, i2, (i5 + i2) - i4);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i2, int i3, String str2, String str3, boolean z, int i4) {
        if ((i3 - i2) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i2, i3, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i5), str.charAt(i2 + i5), z)) {
                    throwNotContainedAt(str, i2, i3, str2, "prefix");
                }
            }
            i2 += str2.length();
        }
        int length2 = i3 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i6 = 0; i6 < length3; i6++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i6), str.charAt(length2 + i6), z)) {
                    throwNotContainedAt(str, length2, i3, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i2, length2, i4);
    }

    private static final void checkZeroDigits(String str, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) != '0') {
                StringBuilder sbP = a.p(i2, "Expected the hexadecimal digit '0' at index ", ", but was '");
                sbP.append(str.charAt(i2));
                sbP.append("'.\nThe result won't fit the type being parsed.");
                throw new NumberFormatException(sbP.toString());
            }
            i2++;
        }
    }

    private static final int decimalFromHexDigitAt(String str, int i2) {
        int i3;
        char cCharAt = str.charAt(i2);
        if ((cCharAt >>> '\b') == 0 && (i3 = HEX_DIGITS_TO_DECIMAL[cCharAt]) >= 0) {
            return i3;
        }
        throwInvalidDigitAt(str, i2);
        throw new KotlinNothingValueException();
    }

    private static final int formatByteAt(byte[] bArr, int i2, String str, String str2, int[] iArr, char[] cArr, int i3) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i2, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i3)));
    }

    private static final int formattedStringLength(int i2, int i3, int i4, int i5) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j2 = i3;
        return checkFormatLength((i2 * (((i4 + 2) + i5) + j2)) - j2);
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    public static /* synthetic */ void getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations() {
    }

    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i2, i3, bytesHexFormat) : hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i2, i3, bytesHexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = bytePrefix.length() + 2 + byteSuffix.length() + length;
        long j2 = i3 - i2;
        int i4 = (int) ((j2 + length) / length2);
        if ((i4 * length2) - length != j2) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i4];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i5), str.charAt(i2 + i5), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i2, i3, bytePrefix, "byte prefix");
                }
            }
            i2 += bytePrefix.length();
        }
        String str2 = byteSuffix + byteSeparator + bytePrefix;
        int i6 = i4 - 1;
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = parseByteAt(str, i2);
            i2 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i8 = 0; i8 < length4; i8++) {
                    if (!CharsKt__CharKt.equals(str2.charAt(i8), str.charAt(i2 + i8), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i2, i3, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i2 = str2.length() + i2;
            }
        }
        bArr[i6] = parseByteAt(str, i2);
        int i9 = i2 + 2;
        if (byteSuffix.length() == 0) {
            return bArr;
        }
        int length5 = byteSuffix.length();
        for (int i10 = 0; i10 < length5; i10++) {
            if (!CharsKt__CharKt.equals(byteSuffix.charAt(i10), str.charAt(i9 + i10), ignoreCase$kotlin_stdlib)) {
                throwNotContainedAt(str, i9, i3, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i4 = i3 - i2;
        int i5 = 2;
        if (length == 0) {
            if ((i4 & 1) != 0) {
                return null;
            }
            int i6 = i4 >> 1;
            byte[] bArr = new byte[i6];
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                bArr[i8] = parseByteAt(str, i7);
                i7 += 2;
            }
            return bArr;
        }
        if (i4 % 3 != 2) {
            return null;
        }
        int i9 = (i4 / 3) + 1;
        byte[] bArr2 = new byte[i9];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        bArr2[0] = parseByteAt(str, 0);
        for (int i10 = 1; i10 < i9; i10++) {
            if (str.charAt(i5) != cCharAt) {
                String byteSeparator = bytesHexFormat.getByteSeparator();
                boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
                if (byteSeparator.length() != 0) {
                    int length2 = byteSeparator.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (!CharsKt__CharKt.equals(byteSeparator.charAt(i11), str.charAt(i5 + i11), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, i5, i3, byteSeparator, "byte separator");
                        }
                    }
                    byteSeparator.length();
                }
            }
            bArr2[i10] = parseByteAt(str, i5 + 1);
            i5 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final byte[] hexToByteArraySlowPath(java.lang.String r18, int r19, int r20, kotlin.text.HexFormat.BytesHexFormat r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.hexToByteArraySlowPath(java.lang.String, int, int, kotlin.text.HexFormat$BytesHexFormat):byte[]");
    }

    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    private static final int hexToIntImpl(String str, int i2, int i3, HexFormat hexFormat, int i4) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i2, i3, i4);
            return parseInt(str, i2, i3);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i2, i3, prefix, suffix, number.getIgnoreCase(), i4);
        return parseInt(str, prefix.length() + i2, i3 - suffix.length());
    }

    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    private static final long hexToLongImpl(String str, int i2, int i3, HexFormat hexFormat, int i4) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i2, i3, i4);
            return parseLong(str, i2, i3);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i2, i3, prefix, suffix, number.getIgnoreCase(), i4);
        return parseLong(str, prefix.length() + i2, i3 - suffix.length());
    }

    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i2) {
        char cCharAt = str.charAt(i2);
        if ((cCharAt >>> '\b') == 0) {
            long j2 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
            if (j2 >= 0) {
                return j2;
            }
        }
        throwInvalidDigitAt(str, i2);
        throw new KotlinNothingValueException();
    }

    private static final byte parseByteAt(String str, int i2) {
        int[] iArr;
        int i3;
        int i4;
        char cCharAt = str.charAt(i2);
        if ((cCharAt >>> '\b') != 0 || (i3 = (iArr = HEX_DIGITS_TO_DECIMAL)[cCharAt]) < 0) {
            throwInvalidDigitAt(str, i2);
            throw new KotlinNothingValueException();
        }
        int i5 = i2 + 1;
        char cCharAt2 = str.charAt(i5);
        if ((cCharAt2 >>> '\b') == 0 && (i4 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i3 << 4) | i4);
        }
        throwInvalidDigitAt(str, i5);
        throw new KotlinNothingValueException();
    }

    private static final int parseInt(String str, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i2 < i3) {
            int i6 = i5 << 4;
            char cCharAt = str.charAt(i2);
            if ((cCharAt >>> '\b') != 0 || (i4 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i2);
                throw new KotlinNothingValueException();
            }
            i5 = i6 | i4;
            i2++;
        }
        return i5;
    }

    private static final long parseLong(String str, int i2, int i3) {
        long j2 = 0;
        while (i2 < i3) {
            long j3 = j2 << 4;
            char cCharAt = str.charAt(i2);
            if ((cCharAt >>> '\b') == 0) {
                long j4 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
                if (j4 >= 0) {
                    j2 = j3 | j4;
                    i2++;
                }
            }
            throwInvalidDigitAt(str, i2);
            throw new KotlinNothingValueException();
        }
        return j2;
    }

    public static final int parsedByteArrayMaxSize(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jCharsPerSet;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j2 = i7 + 2 + i8;
        long jCharsPerSet2 = charsPerSet(j2, i4, i6);
        if (i3 <= i4) {
            jCharsPerSet = charsPerSet(j2, i3, i6);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i3 / i4, i5);
            int i9 = i3 % i4;
            if (i9 != 0) {
                jCharsPerSet = jCharsPerSet + i5 + charsPerSet(j2, i9, i6);
            }
        }
        long j3 = i2;
        long jWholeElementsPerSet = wholeElementsPerSet(j3, jCharsPerSet, 1);
        long j4 = j3 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j4, jCharsPerSet2, i5);
        long j5 = j4 - ((jCharsPerSet2 + i5) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j5, j2, i6);
        return (int) ((jWholeElementsPerSet2 * i4) + (jWholeElementsPerSet * i3) + jWholeElementsPerSet3 + (j5 - ((j2 + ((long) i6)) * jWholeElementsPerSet3) > 0 ? 1 : 0));
    }

    private static final Void throwInvalidDigitAt(String str, int i2) {
        StringBuilder sbP = a.p(i2, "Expected a hexadecimal digit at index ", ", but was ");
        sbP.append(str.charAt(i2));
        throw new NumberFormatException(sbP.toString());
    }

    private static final void throwInvalidNumberOfDigits(String str, int i2, int i3, String str2, int i4) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i4 + " hexadecimal digits at index " + i2 + ", but was \"" + strSubstring + "\" of length " + (i3 - i2));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i2, int i3, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void throwNotContainedAt(String str, int i2, int i3, String str2, String str3) {
        int iCoerceAtMost = RangesKt.coerceAtMost(str2.length() + i2, i3);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i2 + ", but was " + strSubstring);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i2) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i2);
            } else {
                cArr[i2] = str.charAt(0);
            }
        }
        return str.length() + i2;
    }

    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    private static final String toHexStringImpl(long j2, HexFormat.NumberHexFormat numberHexFormat, String str, int i2) {
        if ((i2 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = i2 >> 2;
        int minLength = numberHexFormat.getMinLength();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(minLength - i3, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(prefix.length() + iCoerceAtLeast + i3 + suffix.length());
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i4 = iCoerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i4);
            charArrayIfNotEmpty = i4;
        }
        int i5 = i2;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 -= 4;
            int i7 = (int) ((j2 >> i5) & 15);
            removeLeadingZeros = removeLeadingZeros && i7 == 0 && (i5 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i7);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i2, i3, bytesHexFormat, iArr) : toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i2, i3, bytesHexFormat, iArr);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i3 - i2, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i2, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i4 = i2 + 1; i4 < i3; i4++) {
            byteAt = formatByteAt(bArr, i4, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i4 = i3 - i2;
        int byteAt = 0;
        if (length == 0) {
            char[] cArr = new char[checkFormatLength(i4 * 2)];
            while (i2 < i3) {
                byteAt = formatByteAt(bArr, i2, iArr, cArr, byteAt);
                i2++;
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        char[] cArr2 = new char[checkFormatLength((i4 * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int byteAt2 = formatByteAt(bArr, i2, iArr, cArr2, 0);
        for (int i5 = i2 + 1; i5 < i3; i5++) {
            cArr2[byteAt2] = cCharAt;
            byteAt2 = formatByteAt(bArr, i5, iArr, cArr2, byteAt2 + 1);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr2);
    }

    private static final String toHexStringSlowPath(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i4;
        int i5;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int i6 = formattedStringLength(i3 - i2, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i6];
        int i7 = i2;
        int charArrayIfNotEmpty = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i3) {
            if (i8 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i4 = 0;
                i5 = 0;
            } else if (i9 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i4 = i8;
                i5 = 0;
            } else {
                i4 = i8;
                i5 = i9;
            }
            if (i5 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            String str = bytePrefix;
            int byteAt = formatByteAt(bArr, i7, str, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i7++;
            i9 = i5 + 1;
            charArrayIfNotEmpty = byteAt;
            bytePrefix = str;
            i8 = i4 + 1;
        }
        if (charArrayIfNotEmpty == i6) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j2, long j3, int i2) {
        if (j2 <= 0 || j3 <= 0) {
            return 0L;
        }
        long j4 = i2;
        return (j2 + j4) / (j3 + j4);
    }

    private static final byte hexToByte(String str, int i2, int i3, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i2, i3, hexFormat, 2);
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i2, i3, hexFormat);
    }

    private static final byte[] hexToByteArray(String str, int i2, int i3, HexFormat hexFormat) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        if (i2 == i3) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i2, i3, bytes)) == null) ? hexToByteArraySlowPath(str, i2, i3, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i2, i3, hexFormat);
    }

    private static final int hexToInt(String str, int i2, int i3, HexFormat hexFormat) {
        return hexToIntImpl(str, i2, i3, hexFormat, 8);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i2, i3, hexFormat);
    }

    public static final long hexToLong(String str, int i2, int i3, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl(str, i2, i3, format, 16);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i2, i3, hexFormat);
    }

    private static final short hexToShort(String str, int i2, int i3, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i2, i3, hexFormat, 4);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i2, i3, hexFormat);
    }

    public static final String toHexString(byte[] bArr, int i2, int i3, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, bArr.length);
        if (i2 == i3) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? toHexStringNoLineAndGroupSeparator(bArr, i2, i3, bytes, iArr) : toHexStringSlowPath(bArr, i2, i3, bytes, iArr);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i2, i3, hexFormat);
    }

    public static final int formattedStringLength(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 > 0) {
            int i9 = i2 - 1;
            int i10 = i9 / i3;
            int i11 = (i3 - 1) / i4;
            int i12 = i2 % i3;
            if (i12 != 0) {
                i3 = i12;
            }
            int i13 = (i11 * i10) + ((i3 - 1) / i4);
            return checkFormatLength(((i7 + 2 + i8) * i2) + (((i9 - i10) - i13) * i6) + (i13 * i5) + i10);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int formatByteAt(byte[] bArr, int i2, int[] iArr, char[] cArr, int i3) {
        int i4 = iArr[bArr[i2] & UByte.MAX_VALUE];
        cArr[i3] = (char) (i4 >> 8);
        cArr[i3 + 1] = (char) (i4 & 255);
        return i3 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j2, hexFormat);
    }

    public static final String toHexString(byte b2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b2 >> 4) & 15), str.charAt(b2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b2 & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(b2, number, str, 8);
    }

    public static final String toHexString(short s2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s2 >> 12) & 15), str.charAt((s2 >> 8) & 15), str.charAt((s2 >> 4) & 15), str.charAt(s2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s2 & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(s2, number, str, 16);
    }

    public static final String toHexString(int i2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i2 >> 28) & 15), str.charAt((i2 >> 24) & 15), str.charAt((i2 >> 20) & 15), str.charAt((i2 >> 16) & 15), str.charAt((i2 >> 12) & 15), str.charAt((i2 >> 8) & 15), str.charAt((i2 >> 4) & 15), str.charAt(i2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i2) >> 2, 7), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(i2, number, str, 32);
    }

    public static final String toHexString(long j2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j2 >> 60) & 15)), str.charAt((int) ((j2 >> 56) & 15)), str.charAt((int) ((j2 >> 52) & 15)), str.charAt((int) ((j2 >> 48) & 15)), str.charAt((int) ((j2 >> 44) & 15)), str.charAt((int) ((j2 >> 40) & 15)), str.charAt((int) ((j2 >> 36) & 15)), str.charAt((int) ((j2 >> 32) & 15)), str.charAt((int) ((j2 >> 28) & 15)), str.charAt((int) ((j2 >> 24) & 15)), str.charAt((int) ((j2 >> 20) & 15)), str.charAt((int) ((j2 >> 16) & 15)), str.charAt((int) ((j2 >> 12) & 15)), str.charAt((int) ((j2 >> 8) & 15)), str.charAt((int) ((j2 >> 4) & 15)), str.charAt((int) (j2 & 15))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j2) >> 2, 15), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(j2, number, str, 64);
    }
}
