package kotlin.uuid;

import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\b\t\u001a)\u0010\n\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0002\b\u000f\u001a!\u0010\u0010\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0002\b\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"uuidFromRandomBytes", "Lkotlin/uuid/Uuid;", "randomBytes", "", "checkHyphenAt", "", "", "index", "", "checkHyphenAt$UuidKt__UuidKt", "formatBytesInto", "", "dst", "dstOffset", "count", "formatBytesInto$UuidKt__UuidKt", "toByteArray", "toByteArray$UuidKt__UuidKt", "toLong", "startIndex", "toLong$UuidKt__UuidKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
/* loaded from: classes2.dex */
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkHyphenAt$UuidKt__UuidKt(String str, int i2) {
        if (str.charAt(i2) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i2)).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void formatBytesInto$UuidKt__UuidKt(long j2, byte[] bArr, int i2, int i3) {
        int i4 = (i3 * 2) + i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) (255 & j2)];
            bArr[i4 - 1] = (byte) i6;
            i4 -= 2;
            bArr[i4] = (byte) (i6 >> 8);
            j2 >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toByteArray$UuidKt__UuidKt(long j2, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 8; i3++) {
            bArr[i2 + i3] = (byte) (j2 >>> ((7 - i3) * 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toLong$UuidKt__UuidKt(byte[] bArr, int i2) {
        return (bArr[i2 + 7] & 255) | ((bArr[i2] & 255) << 56) | ((bArr[i2 + 1] & 255) << 48) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 24) | ((bArr[i2 + 5] & 255) << 16) | ((bArr[i2 + 6] & 255) << 8);
    }

    public static final Uuid uuidFromRandomBytes(byte[] randomBytes) {
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        byte b2 = (byte) (randomBytes[6] & 15);
        randomBytes[6] = b2;
        randomBytes[6] = (byte) (b2 | 64);
        byte b3 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b3;
        randomBytes[8] = (byte) (b3 | ByteCompanionObject.MIN_VALUE);
        return Uuid.INSTANCE.fromByteArray(randomBytes);
    }
}
