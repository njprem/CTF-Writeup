package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0013\u0010\u0017\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0013\u0010/\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0013\u0010M\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u0018\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m3900constructorimpl((short) 5120);
    private static final short LowestValue = m3900constructorimpl((short) -1025);
    private static final short MaxValue = m3900constructorimpl((short) 31743);
    private static final short MinNormal = m3900constructorimpl((short) 1024);
    private static final short MinValue = m3900constructorimpl((short) 1);
    private static final short NaN = m3900constructorimpl((short) 32256);
    private static final short NegativeInfinity = m3900constructorimpl((short) -1024);
    private static final short NegativeZero = m3900constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m3900constructorimpl((short) 31744);
    private static final short PositiveZero = m3900constructorimpl((short) 0);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u0019\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", "S", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m3927getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m3928getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m3929getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m3930getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m3931getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m3932getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m3933getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m3934getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m3935getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m3936getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s2) {
        this.halfValue = s2;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m3894absoluteValueslo4al4(short s2) {
        return m3900constructorimpl((short) (s2 & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m3895boximpl(short s2) {
        return new Float16(s2);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m3896ceilslo4al4(short s2) {
        int i2 = 65535 & s2;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            i2 = ((-((~(i2 >> 15)) & (i3 == 0 ? 0 : 1))) & 15360) | (s2 & ShortCompanionObject.MIN_VALUE);
        } else if (i3 < 25600) {
            int i4 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + (((i2 >> 15) - 1) & i4)) & (~i4);
        }
        return m3900constructorimpl((short) i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m3900constructorimpl(short s2) {
        return s2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3901equalsimpl(short s2, Object obj) {
        return (obj instanceof Float16) && s2 == ((Float16) obj).m3926unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3902equalsimpl0(short s2, short s3) {
        return s2 == s3;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m3903floorslo4al4(short s2) {
        int i2 = s2 & UShort.MAX_VALUE;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            i2 = (s2 & ShortCompanionObject.MIN_VALUE) | ((i2 <= 32768 ? 0 : 65535) & 15360);
        } else if (i3 < 25600) {
            int i4 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + ((-(i2 >> 15)) & i4)) & (~i4);
        }
        return m3900constructorimpl((short) i2);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m3904getExponentimpl(short s2) {
        return ((s2 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m3905getSignslo4al4(short s2) {
        return m3910isNaNimpl(s2) ? NaN : m3897compareTo41bOqos(s2, NegativeZero) < 0 ? Float16Kt.NegativeOne : m3897compareTo41bOqos(s2, PositiveZero) > 0 ? Float16Kt.One : s2;
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m3906getSignificandimpl(short s2) {
        return s2 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3907hashCodeimpl(short s2) {
        return Short.hashCode(s2);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m3908isFiniteimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m3909isInfiniteimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m3910isNaNimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m3911isNormalizedimpl(short s2) {
        int i2 = s2 & 31744;
        return (i2 == 0 || i2 == 31744) ? false : true;
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m3912roundslo4al4(short s2) {
        int i2 = s2 & UShort.MAX_VALUE;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            i2 = (s2 & ShortCompanionObject.MIN_VALUE) | ((i3 < 14336 ? 0 : 65535) & 15360);
        } else if (i3 < 25600) {
            int i4 = i3 >> 10;
            i2 = (i2 + (1 << (24 - i4))) & (~((1 << (25 - i4)) - 1));
        }
        return m3900constructorimpl((short) i2);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m3913toBitsimpl(short s2) {
        return m3910isNaNimpl(s2) ? NaN : s2 & UShort.MAX_VALUE;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m3914toByteimpl(short s2) {
        return (byte) m3916toFloatimpl(s2);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m3915toDoubleimpl(short s2) {
        return m3916toFloatimpl(s2);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m3916toFloatimpl(short s2) {
        int i2;
        int i3;
        int i4;
        int i5 = Short.MIN_VALUE & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i7 = s2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m3917toHexStringimpl(short s2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 65535 & s2;
        int i3 = i2 >>> 15;
        int i4 = (i2 >>> 10) & 31;
        int i5 = s2 & 1023;
        if (i4 != 31) {
            if (i3 == 1) {
                sb.append('-');
            }
            if (i4 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i5, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i4 - 15));
            } else if (i5 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i5, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i5 == 0) {
            if (i3 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m3918toIntimpl(short s2) {
        return (int) m3916toFloatimpl(s2);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m3919toLongimpl(short s2) {
        return (long) m3916toFloatimpl(s2);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m3920toRawBitsimpl(short s2) {
        return s2 & UShort.MAX_VALUE;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m3921toShortimpl(short s2) {
        return (short) m3916toFloatimpl(s2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3922toStringimpl(short s2) {
        return String.valueOf(m3916toFloatimpl(s2));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m3923truncslo4al4(short s2) {
        int i2 = 65535 & s2;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            i2 = Short.MIN_VALUE & s2;
        } else if (i3 < 25600) {
            i2 &= ~((1 << (25 - (i3 >> 10))) - 1);
        }
        return m3900constructorimpl((short) i2);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m3924withSignqCeQghg(short s2, short s3) {
        return m3900constructorimpl((short) ((s2 & ShortCompanionObject.MAX_VALUE) | (s3 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m3925compareTo41bOqos(float16.m3926unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m3925compareTo41bOqos(short s2) {
        return m3897compareTo41bOqos(this.halfValue, s2);
    }

    public boolean equals(Object obj) {
        return m3901equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m3907hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m3922toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m3926unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m3897compareTo41bOqos(short s2, short s3) {
        if (m3910isNaNimpl(s2)) {
            return !m3910isNaNimpl(s3) ? 1 : 0;
        }
        if (m3910isNaNimpl(s3)) {
            return -1;
        }
        return Intrinsics.compare((s2 & ShortCompanionObject.MIN_VALUE) != 0 ? Fields.CompositingStrategy - (s2 & UShort.MAX_VALUE) : s2 & UShort.MAX_VALUE, (s3 & ShortCompanionObject.MIN_VALUE) != 0 ? Fields.CompositingStrategy - (s3 & UShort.MAX_VALUE) : s3 & UShort.MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m3898constructorimpl(double d2) {
        return m3899constructorimpl((float) d2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m3899constructorimpl(float f2) {
        int i2;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i3 = iFloatToRawIntBits >>> 31;
        int i4 = (iFloatToRawIntBits >>> 23) & 255;
        int i5 = 8388607 & iFloatToRawIntBits;
        int i6 = 31;
        int i7 = 0;
        if (i4 != 255) {
            int i8 = i4 - 112;
            if (i8 >= 31) {
                i6 = 49;
            } else if (i8 > 0) {
                i7 = i5 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i2 = (((i8 << 10) | i7) + 1) | (i3 << 15);
                    return m3900constructorimpl((short) i2);
                }
                i6 = i8;
            } else if (i8 >= -10) {
                int i9 = (8388608 | i5) >> (1 - i8);
                if ((i9 & 4096) != 0) {
                    i9 += 8192;
                }
                i6 = 0;
                i7 = i9 >> 13;
            } else {
                i6 = 0;
            }
        } else if (i5 != 0) {
            i7 = 512;
        }
        i2 = (i3 << 15) | (i6 << 10) | i7;
        return m3900constructorimpl((short) i2);
    }
}
