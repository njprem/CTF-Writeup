package J;

import B.C0127d;
import android.content.pm.PackageInfo;
import androidx.compose.ui.graphics.Fields;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0127d f209a = new C0127d(6);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f210b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f211c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f212d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f213e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f214f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f215g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f216h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f217i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f218j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f206g * 2) + 7) & (-8)) / 8) + (cVar.f204e * 2) + d(cVar.f200a, cVar.f201b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f205f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f214f)) {
            int length2 = cVarArr.length;
            while (i2 < length2) {
                c cVar2 = cVarArr[i2];
                q(byteArrayOutputStream, cVar2, d(cVar2.f200a, cVar2.f201b, bArr));
                p(byteArrayOutputStream, cVar2);
                i2++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f200a, cVar3.f201b, bArr));
            }
            int length3 = cVarArr.length;
            while (i2 < length3) {
                p(byteArrayOutputStream, cVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = c(file2) && z;
        }
        return z;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f216h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f215g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(androidx.compose.runtime.changelist.a.n("Not enough bytes to read: ", i2));
            }
            i3 += i4;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i3] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[Fields.CameraDistance];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f217i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f218j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f212d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            if (!cVar.f201b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            cVar.f204e = i5;
            cVar.f207h = g(byteArrayInputStream, i5);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i4].f201b.equals(strSubstring)) {
                        cVar = cVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f203d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f216h)) {
                cVar.f204e = iM;
                cVar.f207h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f213e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrF = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (bArrF[i3] & UByte.MAX_VALUE) << (i3 * 8);
        }
        return j2;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i3] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            int iAvailable = byteArrayInputStream.available() - cVar.f205f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f208i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f207h = g(byteArrayInputStream, cVar.f204e);
            int i5 = cVar.f206g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f212d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f213e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f215g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f208i.size() * 4;
                    String strD = d(cVar.f200a, cVar.f201b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f207h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f202c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.f208i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i3 : cVar.f207h) {
                        v(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f214f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f216h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strD2 = d(cVar2.f200a, cVar2.f201b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f208i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f207h.length);
                u(byteArrayOutputStream, cVar2.f202c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : cVar2.f207h) {
                    v(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f202c, 4);
                u(byteArrayOutputStream2, cVar3.f203d, 4);
                u(byteArrayOutputStream2, cVar3.f206g, 4);
                String strD3 = d(cVar3.f200a, cVar3.f201b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i7];
                    v(byteArrayOutputStream3, i7);
                    v(byteArrayOutputStream3, cVar4.f204e);
                    i8 = i8 + 4 + (cVar4.f204e * i5);
                    int[] iArr = cVar4.f207h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        v(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i13];
                    Iterator it3 = cVar5.f208i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, iIntValue, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i15 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i16);
                int i17 = mVar4.f230a;
                if (i17 == 1) {
                    j2 = 0;
                } else if (i17 == 2) {
                    j2 = 1;
                } else if (i17 == 3) {
                    j2 = 2;
                } else if (i17 == 4) {
                    j2 = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                u(byteArrayOutputStream, j2, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = mVar4.f231b;
                if (mVar4.f232c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        s(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f207h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            v(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        int i5 = cVar.f206g;
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f208i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i5;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f204e);
        u(byteArrayOutputStream, cVar.f205f, 4);
        u(byteArrayOutputStream, cVar.f202c, 4);
        u(byteArrayOutputStream, cVar.f206g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i2, c cVar) throws IOException {
        int iBitCount = Integer.bitCount(i2 & (-2));
        int i3 = cVar.f206g;
        byte[] bArr = new byte[(((iBitCount * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f208i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : cVar.f208i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:295|44|45)|255|(3:275|53|(4:55|290|56|77)(2:67|68))|83|(3:299|93|(3:281|95|(4:97|98|99|(1:123))(2:108|109))(3:(1:116)|121|(0)))|124|(2:129|(5:298|131|260|132|(2:134|135)(3:143|144|153))(2:154|155))|156|(1:158)(3:159|289|(13:294|161|256|162|263|163|279|164|268|(3:271|166|(9:168|(2:169|(1:171)(1:300))|173|174|175|176|177|178|179))|194|197|198)(2:241|242))|(1:237)|238) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
    
        r20.b(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, J.f r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.g.t(android.content.Context, java.util.concurrent.Executor, J.f, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        u(byteArrayOutputStream, i2, 2);
    }
}
