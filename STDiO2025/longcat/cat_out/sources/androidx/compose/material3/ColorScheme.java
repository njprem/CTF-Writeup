package androidx.compose.material3;

import J.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bï\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0002\u0010 B¥\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0002\u0010(J·\u0002\u0010\u008f\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002Jû\u0002\u0010\u008f\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J\n\u0010\u0094\u0002\u001a\u00030\u0095\u0002H\u0016R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u0004\u0018\u00010MX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bN\u0010A\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010S\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010/\"\u0004\bU\u00101R\u001c\u0010V\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00105\"\u0004\bX\u00107R\u001c\u0010Y\u001a\u0004\u0018\u000109X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010;\"\u0004\b[\u0010=R\u001c\u0010\\\u001a\u0004\u0018\u00010]X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001c\u0010b\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010/\"\u0004\bd\u00101R\u001c\u0010e\u001a\u0004\u0018\u00010fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010k\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010q\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001c\u0010w\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00105\"\u0004\by\u00107R\u001c\u0010z\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010n\"\u0004\b|\u0010pR\u001c\u0010}\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010t\"\u0004\b\u007f\u0010vR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010]X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010_\"\u0005\b\u0082\u0001\u0010aR\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010n\"\u0005\b\u0085\u0001\u0010pR\u001f\u0010\u0086\u0001\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010t\"\u0005\b\u0088\u0001\u0010vR\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010]X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010_\"\u0005\b\u008b\u0001\u0010aR&\u0010\u008c\u0001\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u008d\u0001\u0010A\u001a\u0005\b\u008e\u0001\u0010C\"\u0005\b\u008f\u0001\u0010ER&\u0010\u0090\u0001\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0091\u0001\u0010A\u001a\u0005\b\u0092\u0001\u0010C\"\u0005\b\u0093\u0001\u0010ER\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\"\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001f\u0010¦\u0001\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u00105\"\u0005\b¨\u0001\u00107R\u001f\u0010©\u0001\u001a\u0004\u0018\u000109X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010;\"\u0005\b«\u0001\u0010=R\u001f\u0010¬\u0001\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010n\"\u0005\b®\u0001\u0010pR\u001f\u0010¯\u0001\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010t\"\u0005\b±\u0001\u0010vR\"\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R\"\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R)\u0010¾\u0001\u001a\u0005\u0018\u00010¿\u0001X\u0080\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bÀ\u0001\u0010A\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R)\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u0001X\u0080\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bÇ\u0001\u0010A\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\"\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u001f\u0010Ò\u0001\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010/\"\u0005\bÔ\u0001\u00101R\"\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R\u001f\u0010Û\u0001\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u00105\"\u0005\bÝ\u0001\u00107R\"\u0010Þ\u0001\u001a\u0005\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bß\u0001\u0010µ\u0001\"\u0006\bà\u0001\u0010·\u0001R)\u0010á\u0001\u001a\u0005\u0018\u00010â\u0001X\u0080\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bã\u0001\u0010A\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R&\u0010è\u0001\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0017\n\u0000\u0012\u0005\bé\u0001\u0010A\u001a\u0005\bê\u0001\u0010C\"\u0005\bë\u0001\u0010ER\u001a\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bì\u0001\u0010*R\u001a\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bí\u0001\u0010*R\u001a\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bî\u0001\u0010*R\u001a\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bï\u0001\u0010*R\u001a\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bð\u0001\u0010*R\u001a\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bñ\u0001\u0010*R\u001a\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bò\u0001\u0010*R\u001a\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bó\u0001\u0010*R\u001a\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bô\u0001\u0010*R\u001a\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bõ\u0001\u0010*R\u001a\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bö\u0001\u0010*R\u001a\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b÷\u0001\u0010*R\u001a\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bø\u0001\u0010*R\u001a\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bù\u0001\u0010*R\u001a\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bú\u0001\u0010*R\u001a\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bû\u0001\u0010*R\u001a\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bü\u0001\u0010*R\u001a\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bý\u0001\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bþ\u0001\u0010*R\u001a\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bÿ\u0001\u0010*R\u001a\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0080\u0002\u0010*R\u001a\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0081\u0002\u0010*R\u001a\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0082\u0002\u0010*R\u001a\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0083\u0002\u0010*R\u001a\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0084\u0002\u0010*R\u001a\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0085\u0002\u0010*R\u001a\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0086\u0002\u0010*R\u001a\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0087\u0002\u0010*R\u001a\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0088\u0002\u0010*R\u001a\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0089\u0002\u0010*R\u001a\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008a\u0002\u0010*R\u001a\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008b\u0002\u0010*R\u001a\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008c\u0002\u0010*R\u001a\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008d\u0002\u0010*R\u001a\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008e\u0002\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0096\u0002"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "defaultAssistChipColorsCached", "Landroidx/compose/material3/ChipColors;", "getDefaultAssistChipColorsCached$material3_release", "()Landroidx/compose/material3/ChipColors;", "setDefaultAssistChipColorsCached$material3_release", "(Landroidx/compose/material3/ChipColors;)V", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "defaultCenterAlignedTopAppBarColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "()V", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "defaultCheckboxColorsCached", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "defaultDatePickerColorsCached", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release$annotations", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "defaultElevatedAssistChipColorsCached", "getDefaultElevatedAssistChipColorsCached$material3_release", "setDefaultElevatedAssistChipColorsCached$material3_release", "defaultElevatedButtonColorsCached", "getDefaultElevatedButtonColorsCached$material3_release", "setDefaultElevatedButtonColorsCached$material3_release", "defaultElevatedCardColorsCached", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "defaultElevatedFilterChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "getDefaultElevatedFilterChipColorsCached$material3_release", "()Landroidx/compose/material3/SelectableChipColors;", "setDefaultElevatedFilterChipColorsCached$material3_release", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultElevatedSuggestionChipColorsCached", "getDefaultElevatedSuggestionChipColorsCached$material3_release", "setDefaultElevatedSuggestionChipColorsCached$material3_release", "defaultExpressiveNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationItemColors;", "getDefaultExpressiveNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationItemColors;", "setDefaultExpressiveNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationItemColors;)V", "defaultFilledIconButtonColorsCached", "Landroidx/compose/material3/IconButtonColors;", "getDefaultFilledIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultFilledIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "defaultFilledIconToggleButtonColorsCached", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultFilledIconToggleButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconToggleButtonColors;", "setDefaultFilledIconToggleButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconToggleButtonColors;)V", "defaultFilledTonalButtonColorsCached", "getDefaultFilledTonalButtonColorsCached$material3_release", "setDefaultFilledTonalButtonColorsCached$material3_release", "defaultFilledTonalIconButtonColorsCached", "getDefaultFilledTonalIconButtonColorsCached$material3_release", "setDefaultFilledTonalIconButtonColorsCached$material3_release", "defaultFilledTonalIconToggleButtonColorsCached", "getDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "setDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "defaultFilterChipColorsCached", "getDefaultFilterChipColorsCached$material3_release", "setDefaultFilterChipColorsCached$material3_release", "defaultIconButtonColorsCached", "getDefaultIconButtonColorsCached$material3_release", "setDefaultIconButtonColorsCached$material3_release", "defaultIconToggleButtonColorsCached", "getDefaultIconToggleButtonColorsCached$material3_release", "setDefaultIconToggleButtonColorsCached$material3_release", "defaultInputChipColorsCached", "getDefaultInputChipColorsCached$material3_release", "setDefaultInputChipColorsCached$material3_release", "defaultLargeTopAppBarColorsCached", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "defaultMediumTopAppBarColorsCached", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "defaultMenuItemColorsCached", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "getDefaultNavigationRailItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationRailItemColors;", "setDefaultNavigationRailItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "defaultOutlinedButtonColorsCached", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultOutlinedCardColorsCached", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "defaultOutlinedIconButtonColorsCached", "getDefaultOutlinedIconButtonColorsCached$material3_release", "setDefaultOutlinedIconButtonColorsCached$material3_release", "defaultOutlinedIconToggleButtonColorsCached", "getDefaultOutlinedIconToggleButtonColorsCached$material3_release", "setDefaultOutlinedIconToggleButtonColorsCached$material3_release", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "defaultRichTooltipColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "getDefaultRichTooltipColorsCached$material3_release$annotations", "getDefaultRichTooltipColorsCached$material3_release", "()Landroidx/compose/material3/RichTooltipColors;", "setDefaultRichTooltipColorsCached$material3_release", "(Landroidx/compose/material3/RichTooltipColors;)V", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "getDefaultSegmentedButtonColorsCached$material3_release", "()Landroidx/compose/material3/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached$material3_release", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "defaultSliderColorsCached", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "defaultSuggestionChipColorsCached", "getDefaultSuggestionChipColorsCached$material3_release", "setDefaultSuggestionChipColorsCached$material3_release", "defaultSwitchColorsCached", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "defaultTextFieldColorsCached", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "defaultTimePickerColorsCached", "Landroidx/compose/material3/TimePickerColors;", "getDefaultTimePickerColorsCached$material3_release$annotations", "getDefaultTimePickerColorsCached$material3_release", "()Landroidx/compose/material3/TimePickerColors;", "setDefaultTimePickerColorsCached$material3_release", "(Landroidx/compose/material3/TimePickerColors;)V", "defaultTopAppBarColorsCached", "getDefaultTopAppBarColorsCached$material3_release$annotations", "getDefaultTopAppBarColorsCached$material3_release", "setDefaultTopAppBarColorsCached$material3_release", "getError-0d7_KjU", "getErrorContainer-0d7_KjU", "getInverseOnSurface-0d7_KjU", "getInversePrimary-0d7_KjU", "getInverseSurface-0d7_KjU", "getOnBackground-0d7_KjU", "getOnError-0d7_KjU", "getOnErrorContainer-0d7_KjU", "getOnPrimary-0d7_KjU", "getOnPrimaryContainer-0d7_KjU", "getOnSecondary-0d7_KjU", "getOnSecondaryContainer-0d7_KjU", "getOnSurface-0d7_KjU", "getOnSurfaceVariant-0d7_KjU", "getOnTertiary-0d7_KjU", "getOnTertiaryContainer-0d7_KjU", "getOutline-0d7_KjU", "getOutlineVariant-0d7_KjU", "getPrimary-0d7_KjU", "getPrimaryContainer-0d7_KjU", "getScrim-0d7_KjU", "getSecondary-0d7_KjU", "getSecondaryContainer-0d7_KjU", "getSurface-0d7_KjU", "getSurfaceBright-0d7_KjU", "getSurfaceContainer-0d7_KjU", "getSurfaceContainerHigh-0d7_KjU", "getSurfaceContainerHighest-0d7_KjU", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "getSurfaceDim-0d7_KjU", "getSurfaceTint-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getTertiary-0d7_KjU", "getTertiaryContainer-0d7_KjU", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;
    private ChipColors defaultAssistChipColorsCached;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private ChipColors defaultElevatedAssistChipColorsCached;
    private ButtonColors defaultElevatedButtonColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private SelectableChipColors defaultElevatedFilterChipColorsCached;
    private ChipColors defaultElevatedSuggestionChipColorsCached;
    private NavigationItemColors defaultExpressiveNavigationBarItemColorsCached;
    private IconButtonColors defaultFilledIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;
    private ButtonColors defaultFilledTonalButtonColorsCached;
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;
    private SelectableChipColors defaultFilterChipColorsCached;
    private IconButtonColors defaultIconButtonColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;
    private SelectableChipColors defaultInputChipColorsCached;
    private TopAppBarColors defaultLargeTopAppBarColorsCached;
    private TopAppBarColors defaultMediumTopAppBarColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private IconButtonColors defaultOutlinedIconButtonColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private RichTooltipColors defaultRichTooltipColorsCached;
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;
    private SliderColors defaultSliderColorsCached;
    private ChipColors defaultSuggestionChipColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TimePickerColors defaultTimePickerColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    public /* synthetic */ ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37);
    }

    /* renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1520copyCXl9yA$default(ColorScheme colorScheme, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        ColorScheme colorScheme2;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72;
        long j73 = (i2 & 1) != 0 ? colorScheme.primary : j2;
        long j74 = (i2 & 2) != 0 ? colorScheme.onPrimary : j3;
        long j75 = (i2 & 4) != 0 ? colorScheme.primaryContainer : j4;
        long j76 = (i2 & 8) != 0 ? colorScheme.onPrimaryContainer : j5;
        long j77 = (i2 & 16) != 0 ? colorScheme.inversePrimary : j6;
        long j78 = (i2 & 32) != 0 ? colorScheme.secondary : j7;
        long j79 = (i2 & 64) != 0 ? colorScheme.onSecondary : j8;
        long j80 = j73;
        long j81 = (i2 & 128) != 0 ? colorScheme.secondaryContainer : j9;
        long j82 = (i2 & Fields.RotationX) != 0 ? colorScheme.onSecondaryContainer : j10;
        long j83 = (i2 & 512) != 0 ? colorScheme.tertiary : j11;
        long j84 = (i2 & 1024) != 0 ? colorScheme.onTertiary : j12;
        long j85 = (i2 & Fields.CameraDistance) != 0 ? colorScheme.tertiaryContainer : j13;
        long j86 = (i2 & 4096) != 0 ? colorScheme.onTertiaryContainer : j14;
        long j87 = (i2 & 8192) != 0 ? colorScheme.background : j15;
        long j88 = (i2 & Fields.Clip) != 0 ? colorScheme.onBackground : j16;
        long j89 = (i2 & Fields.CompositingStrategy) != 0 ? colorScheme.surface : j17;
        long j90 = (i2 & 65536) != 0 ? colorScheme.onSurface : j18;
        long j91 = (i2 & Fields.RenderEffect) != 0 ? colorScheme.surfaceVariant : j19;
        long j92 = (i2 & 262144) != 0 ? colorScheme.onSurfaceVariant : j20;
        long j93 = (i2 & 524288) != 0 ? colorScheme.surfaceTint : j21;
        long j94 = (i2 & 1048576) != 0 ? colorScheme.inverseSurface : j22;
        long j95 = (i2 & 2097152) != 0 ? colorScheme.inverseOnSurface : j23;
        long j96 = (i2 & 4194304) != 0 ? colorScheme.error : j24;
        long j97 = (i2 & 8388608) != 0 ? colorScheme.onError : j25;
        long j98 = (i2 & 16777216) != 0 ? colorScheme.errorContainer : j26;
        long j99 = (i2 & 33554432) != 0 ? colorScheme.onErrorContainer : j27;
        long j100 = (i2 & 67108864) != 0 ? colorScheme.outline : j28;
        long j101 = (i2 & 134217728) != 0 ? colorScheme.outlineVariant : j29;
        long j102 = (i2 & 268435456) != 0 ? colorScheme.scrim : j30;
        long j103 = (i2 & 536870912) != 0 ? colorScheme.surfaceBright : j31;
        long j104 = (i2 & 1073741824) != 0 ? colorScheme.surfaceDim : j32;
        long j105 = (i2 & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j33;
        long j106 = (i3 & 1) != 0 ? colorScheme.surfaceContainerHigh : j34;
        long j107 = (i3 & 2) != 0 ? colorScheme.surfaceContainerHighest : j35;
        long j108 = (i3 & 4) != 0 ? colorScheme.surfaceContainerLow : j36;
        if ((i3 & 8) != 0) {
            j39 = j108;
            j38 = colorScheme.surfaceContainerLowest;
            j41 = j102;
            j42 = j103;
            j43 = j104;
            j44 = j105;
            j45 = j106;
            j46 = j107;
            j48 = j95;
            j49 = j96;
            j50 = j97;
            j51 = j98;
            j52 = j99;
            j53 = j100;
            j40 = j101;
            j55 = j88;
            j56 = j89;
            j57 = j90;
            j58 = j91;
            j59 = j92;
            j60 = j93;
            j47 = j94;
            j62 = j81;
            j63 = j82;
            j64 = j83;
            j65 = j84;
            j66 = j85;
            j67 = j86;
            j54 = j87;
            colorScheme2 = colorScheme;
            j68 = j74;
            j69 = j75;
            j70 = j76;
            j71 = j77;
            j72 = j78;
            j61 = j79;
        } else {
            j38 = j37;
            j39 = j108;
            j40 = j101;
            j41 = j102;
            j42 = j103;
            j43 = j104;
            j44 = j105;
            j45 = j106;
            j46 = j107;
            j47 = j94;
            j48 = j95;
            j49 = j96;
            j50 = j97;
            j51 = j98;
            j52 = j99;
            j53 = j100;
            j54 = j87;
            j55 = j88;
            j56 = j89;
            j57 = j90;
            j58 = j91;
            j59 = j92;
            j60 = j93;
            j61 = j79;
            j62 = j81;
            j63 = j82;
            j64 = j83;
            j65 = j84;
            j66 = j85;
            j67 = j86;
            colorScheme2 = colorScheme;
            j68 = j74;
            j69 = j75;
            j70 = j76;
            j71 = j77;
            j72 = j78;
        }
        return colorScheme2.m1522copyCXl9yA(j80, j68, j69, j70, j71, j72, j61, j62, j63, j64, j65, j66, j67, j54, j55, j56, j57, j58, j59, j60, j47, j48, j49, j50, j51, j52, j53, j40, j41, j42, j43, j44, j45, j46, j39, j38);
    }

    /* renamed from: copy-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1521copyG1PFcw$default(ColorScheme colorScheme, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        ColorScheme colorScheme2;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59 = (i2 & 1) != 0 ? colorScheme.primary : j2;
        long j60 = (i2 & 2) != 0 ? colorScheme.onPrimary : j3;
        long j61 = (i2 & 4) != 0 ? colorScheme.primaryContainer : j4;
        long j62 = (i2 & 8) != 0 ? colorScheme.onPrimaryContainer : j5;
        long j63 = (i2 & 16) != 0 ? colorScheme.inversePrimary : j6;
        long j64 = (i2 & 32) != 0 ? colorScheme.secondary : j7;
        long j65 = (i2 & 64) != 0 ? colorScheme.onSecondary : j8;
        long j66 = j59;
        long j67 = (i2 & 128) != 0 ? colorScheme.secondaryContainer : j9;
        long j68 = (i2 & Fields.RotationX) != 0 ? colorScheme.onSecondaryContainer : j10;
        long j69 = (i2 & 512) != 0 ? colorScheme.tertiary : j11;
        long j70 = (i2 & 1024) != 0 ? colorScheme.onTertiary : j12;
        long j71 = (i2 & Fields.CameraDistance) != 0 ? colorScheme.tertiaryContainer : j13;
        long j72 = (i2 & 4096) != 0 ? colorScheme.onTertiaryContainer : j14;
        long j73 = (i2 & 8192) != 0 ? colorScheme.background : j15;
        long j74 = (i2 & Fields.Clip) != 0 ? colorScheme.onBackground : j16;
        long j75 = (i2 & Fields.CompositingStrategy) != 0 ? colorScheme.surface : j17;
        long j76 = (i2 & 65536) != 0 ? colorScheme.onSurface : j18;
        long j77 = (i2 & Fields.RenderEffect) != 0 ? colorScheme.surfaceVariant : j19;
        long j78 = (i2 & 262144) != 0 ? colorScheme.onSurfaceVariant : j20;
        long j79 = (i2 & 524288) != 0 ? colorScheme.surfaceTint : j21;
        long j80 = (i2 & 1048576) != 0 ? colorScheme.inverseSurface : j22;
        long j81 = (i2 & 2097152) != 0 ? colorScheme.inverseOnSurface : j23;
        long j82 = (i2 & 4194304) != 0 ? colorScheme.error : j24;
        long j83 = (i2 & 8388608) != 0 ? colorScheme.onError : j25;
        long j84 = (i2 & 16777216) != 0 ? colorScheme.errorContainer : j26;
        long j85 = (i2 & 33554432) != 0 ? colorScheme.onErrorContainer : j27;
        long j86 = (i2 & 67108864) != 0 ? colorScheme.outline : j28;
        long j87 = (i2 & 134217728) != 0 ? colorScheme.outlineVariant : j29;
        if ((i2 & 268435456) != 0) {
            j32 = j87;
            j31 = colorScheme.scrim;
            j34 = j81;
            j35 = j82;
            j36 = j83;
            j37 = j84;
            j38 = j85;
            j39 = j86;
            j41 = j74;
            j42 = j75;
            j43 = j76;
            j44 = j77;
            j45 = j78;
            j46 = j79;
            j33 = j80;
            j48 = j67;
            j49 = j68;
            j50 = j69;
            j51 = j70;
            j52 = j71;
            j53 = j72;
            j40 = j73;
            colorScheme2 = colorScheme;
            j54 = j60;
            j55 = j61;
            j56 = j62;
            j57 = j63;
            j58 = j64;
            j47 = j65;
        } else {
            j31 = j30;
            j32 = j87;
            j33 = j80;
            j34 = j81;
            j35 = j82;
            j36 = j83;
            j37 = j84;
            j38 = j85;
            j39 = j86;
            j40 = j73;
            j41 = j74;
            j42 = j75;
            j43 = j76;
            j44 = j77;
            j45 = j78;
            j46 = j79;
            j47 = j65;
            j48 = j67;
            j49 = j68;
            j50 = j69;
            j51 = j70;
            j52 = j71;
            j53 = j72;
            colorScheme2 = colorScheme;
            j54 = j60;
            j55 = j61;
            j56 = j62;
            j57 = j63;
            j58 = j64;
        }
        return colorScheme2.m1523copyG1PFcw(j66, j54, j55, j56, j57, j58, j47, j48, j49, j50, j51, j52, j53, j40, j41, j42, j43, j44, j45, j46, j33, j34, j35, j36, j37, j38, j39, j32, j31);
    }

    public static /* synthetic */ void getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultLargeTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultMediumTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultSegmentedButtonColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    /* renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final ColorScheme m1522copyCXl9yA(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceDim, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m1523copyG1PFcw(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return m1520copyCXl9yA$default(this, primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: getDefaultAssistChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultAssistChipColorsCached() {
        return this.defaultAssistChipColorsCached;
    }

    /* renamed from: getDefaultButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    /* renamed from: getDefaultCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* renamed from: getDefaultCenterAlignedTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    /* renamed from: getDefaultCheckboxColorsCached$material3_release, reason: from getter */
    public final CheckboxColors getDefaultCheckboxColorsCached() {
        return this.defaultCheckboxColorsCached;
    }

    /* renamed from: getDefaultDatePickerColorsCached$material3_release, reason: from getter */
    public final DatePickerColors getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    /* renamed from: getDefaultElevatedAssistChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultElevatedAssistChipColorsCached() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    /* renamed from: getDefaultElevatedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultElevatedButtonColorsCached() {
        return this.defaultElevatedButtonColorsCached;
    }

    /* renamed from: getDefaultElevatedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultElevatedCardColorsCached() {
        return this.defaultElevatedCardColorsCached;
    }

    /* renamed from: getDefaultElevatedFilterChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    /* renamed from: getDefaultElevatedSuggestionChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultElevatedSuggestionChipColorsCached() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    /* renamed from: getDefaultExpressiveNavigationBarItemColorsCached$material3_release, reason: from getter */
    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColorsCached() {
        return this.defaultExpressiveNavigationBarItemColorsCached;
    }

    /* renamed from: getDefaultFilledIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultFilledIconButtonColorsCached() {
        return this.defaultFilledIconButtonColorsCached;
    }

    /* renamed from: getDefaultFilledIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    /* renamed from: getDefaultFilledTonalButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultFilledTonalButtonColorsCached() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    /* renamed from: getDefaultFilledTonalIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    /* renamed from: getDefaultFilledTonalIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    /* renamed from: getDefaultFilterChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultFilterChipColorsCached() {
        return this.defaultFilterChipColorsCached;
    }

    /* renamed from: getDefaultIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    /* renamed from: getDefaultIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached() {
        return this.defaultIconToggleButtonColorsCached;
    }

    /* renamed from: getDefaultInputChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultInputChipColorsCached() {
        return this.defaultInputChipColorsCached;
    }

    /* renamed from: getDefaultLargeTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    /* renamed from: getDefaultMediumTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    /* renamed from: getDefaultMenuItemColorsCached$material3_release, reason: from getter */
    public final MenuItemColors getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    /* renamed from: getDefaultNavigationBarItemColorsCached$material3_release, reason: from getter */
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached() {
        return this.defaultNavigationBarItemColorsCached;
    }

    /* renamed from: getDefaultNavigationRailItemColorsCached$material3_release, reason: from getter */
    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached() {
        return this.defaultNavigationRailItemColorsCached;
    }

    /* renamed from: getDefaultOutlinedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultOutlinedButtonColorsCached() {
        return this.defaultOutlinedButtonColorsCached;
    }

    /* renamed from: getDefaultOutlinedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultOutlinedCardColorsCached() {
        return this.defaultOutlinedCardColorsCached;
    }

    /* renamed from: getDefaultOutlinedIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    /* renamed from: getDefaultOutlinedIconToggleButtonColorsCached$material3_release, reason: from getter */
    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached() {
        return this.defaultOutlinedIconToggleButtonColorsCached;
    }

    /* renamed from: getDefaultOutlinedTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    /* renamed from: getDefaultRadioButtonColorsCached$material3_release, reason: from getter */
    public final RadioButtonColors getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    /* renamed from: getDefaultRichTooltipColorsCached$material3_release, reason: from getter */
    public final RichTooltipColors getDefaultRichTooltipColorsCached() {
        return this.defaultRichTooltipColorsCached;
    }

    /* renamed from: getDefaultSegmentedButtonColorsCached$material3_release, reason: from getter */
    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached() {
        return this.defaultSegmentedButtonColorsCached;
    }

    /* renamed from: getDefaultSliderColorsCached$material3_release, reason: from getter */
    public final SliderColors getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    /* renamed from: getDefaultSuggestionChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultSuggestionChipColorsCached() {
        return this.defaultSuggestionChipColorsCached;
    }

    /* renamed from: getDefaultSwitchColorsCached$material3_release, reason: from getter */
    public final SwitchColors getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    /* renamed from: getDefaultTextButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    /* renamed from: getDefaultTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    /* renamed from: getDefaultTimePickerColorsCached$material3_release, reason: from getter */
    public final TimePickerColors getDefaultTimePickerColorsCached() {
        return this.defaultTimePickerColorsCached;
    }

    /* renamed from: getDefaultTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void setDefaultButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultExpressiveNavigationBarItemColorsCached$material3_release(NavigationItemColors navigationItemColors) {
        this.defaultExpressiveNavigationBarItemColorsCached = navigationItemColors;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultFilledIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultFilledTonalIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledTonalIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultInputChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    public final void setDefaultSliderColorsCached$material3_release(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultSwitchColorsCached$material3_release(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        d.w(this.primary, sb, "onPrimary=");
        d.w(this.onPrimary, sb, "primaryContainer=");
        d.w(this.primaryContainer, sb, "onPrimaryContainer=");
        d.w(this.onPrimaryContainer, sb, "inversePrimary=");
        d.w(this.inversePrimary, sb, "secondary=");
        d.w(this.secondary, sb, "onSecondary=");
        d.w(this.onSecondary, sb, "secondaryContainer=");
        d.w(this.secondaryContainer, sb, "onSecondaryContainer=");
        d.w(this.onSecondaryContainer, sb, "tertiary=");
        d.w(this.tertiary, sb, "onTertiary=");
        d.w(this.onTertiary, sb, "tertiaryContainer=");
        d.w(this.tertiaryContainer, sb, "onTertiaryContainer=");
        d.w(this.onTertiaryContainer, sb, "background=");
        d.w(this.background, sb, "onBackground=");
        d.w(this.onBackground, sb, "surface=");
        d.w(this.surface, sb, "onSurface=");
        d.w(this.onSurface, sb, "surfaceVariant=");
        d.w(this.surfaceVariant, sb, "onSurfaceVariant=");
        d.w(this.onSurfaceVariant, sb, "surfaceTint=");
        d.w(this.surfaceTint, sb, "inverseSurface=");
        d.w(this.inverseSurface, sb, "inverseOnSurface=");
        d.w(this.inverseOnSurface, sb, "error=");
        d.w(this.error, sb, "onError=");
        d.w(this.onError, sb, "errorContainer=");
        d.w(this.errorContainer, sb, "onErrorContainer=");
        d.w(this.onErrorContainer, sb, "outline=");
        d.w(this.outline, sb, "outlineVariant=");
        d.w(this.outlineVariant, sb, "scrim=");
        d.w(this.scrim, sb, "surfaceBright=");
        d.w(this.surfaceBright, sb, "surfaceDim=");
        d.w(this.surfaceDim, sb, "surfaceContainer=");
        d.w(this.surfaceContainer, sb, "surfaceContainerHigh=");
        d.w(this.surfaceContainerHigh, sb, "surfaceContainerHighest=");
        d.w(this.surfaceContainerHighest, sb, "surfaceContainerLow=");
        d.w(this.surfaceContainerLow, sb, "surfaceContainerLowest=");
        sb.append((Object) Color.m3800toStringimpl(this.surfaceContainerLowest));
        sb.append(')');
        return sb.toString();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use constructor with additional 'surfaceContainer' roles.", replaceWith = @ReplaceWith(expression = "ColorScheme(primary,\nonPrimary,\nprimaryContainer,\nonPrimaryContainer,\ninversePrimary,\nsecondary,\nonSecondary,\nsecondaryContainer,\nonSecondaryContainer,\ntertiary,\nonTertiary,\ntertiaryContainer,\nonTertiaryContainer,\nbackground,\nonBackground,\nsurface,\nonSurface,\nsurfaceVariant,\nonSurfaceVariant,\nsurfaceTint,\ninverseSurface,\ninverseOnSurface,\nerror,\nonError,\nerrorContainer,\nonErrorContainer,\noutline,\noutlineVariant,\nscrim,\nsurfaceBright,\nsurfaceDim,\nsurfaceContainer,\nsurfaceContainerHigh,\nsurfaceContainerHighest,\nsurfaceContainerLow,\nsurfaceContainerLowest,)", imports = {}))
    public /* synthetic */ ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    private ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        this.primary = j2;
        this.onPrimary = j3;
        this.primaryContainer = j4;
        this.onPrimaryContainer = j5;
        this.inversePrimary = j6;
        this.secondary = j7;
        this.onSecondary = j8;
        this.secondaryContainer = j9;
        this.onSecondaryContainer = j10;
        this.tertiary = j11;
        this.onTertiary = j12;
        this.tertiaryContainer = j13;
        this.onTertiaryContainer = j14;
        this.background = j15;
        this.onBackground = j16;
        this.surface = j17;
        this.onSurface = j18;
        this.surfaceVariant = j19;
        this.onSurfaceVariant = j20;
        this.surfaceTint = j21;
        this.inverseSurface = j22;
        this.inverseOnSurface = j23;
        this.error = j24;
        this.onError = j25;
        this.errorContainer = j26;
        this.onErrorContainer = j27;
        this.outline = j28;
        this.outlineVariant = j29;
        this.scrim = j30;
        this.surfaceBright = j31;
        this.surfaceDim = j32;
        this.surfaceContainer = j33;
        this.surfaceContainerHigh = j34;
        this.surfaceContainerHighest = j35;
        this.surfaceContainerLow = j36;
        this.surfaceContainerLowest = j37;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        Color.Companion companion = Color.INSTANCE;
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, companion.m3828getUnspecified0d7_KjU(), companion.m3828getUnspecified0d7_KjU(), companion.m3828getUnspecified0d7_KjU(), companion.m3828getUnspecified0d7_KjU(), companion.m3828getUnspecified0d7_KjU(), companion.m3828getUnspecified0d7_KjU(), companion.m3828getUnspecified0d7_KjU(), null);
    }
}
