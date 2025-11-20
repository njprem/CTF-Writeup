package androidx.compose.ui.text;

import J.d;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B§\u0001\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cB³\u0001\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fB¿\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"BÉ\u0001\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010'B½\u0001\b\u0000\u0012\u0006\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010*JÒ\u0001\u0010O\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ²\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ¾\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010UJÈ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010[\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\\J\u0015\u0010]\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0000H\u0000¢\u0006\u0002\b^J\b\u0010_\u001a\u00020`H\u0016J\r\u0010a\u001a\u00020`H\u0000¢\u0006\u0002\bbJ\u0014\u0010c\u001a\u00020\u00002\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010d\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0000H\u0087\u0002J\b\u0010e\u001a\u00020\u000fH\u0016R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u0010\u0002\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\b;\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\bB\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0014\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "textForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextForegroundStyle$ui_text_release", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "copy", "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "equals", "", "other", "hasSameLayoutAffectingAttributes", "hasSameLayoutAffectingAttributes$ui_text_release", "hasSameNonLayoutAttributes", "hasSameNonLayoutAttributes$ui_text_release", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text_release", "merge", "plus", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanStyle {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;

    /* renamed from: textDecoration, reason: from kotlin metadata and from toString */
    private final TextDecoration background;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m5662copyGSF8kmg$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        long jM5671getColor0d7_KjU = (i2 & 1) != 0 ? spanStyle.m5671getColor0d7_KjU() : j2;
        return spanStyle.m5666copyGSF8kmg(jM5671getColor0d7_KjU, (i2 & 2) != 0 ? spanStyle.fontSize : j3, (i2 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i2 & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i2 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i2 & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i2 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i2 & 128) != 0 ? spanStyle.letterSpacing : j4, (i2 & Fields.RotationX) != 0 ? spanStyle.baselineShift : baselineShift, (i2 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i2 & 1024) != 0 ? spanStyle.localeList : localeList, (i2 & Fields.CameraDistance) != 0 ? spanStyle.background : j5, (i2 & 4096) != 0 ? spanStyle.background : textDecoration, (i2 & 8192) != 0 ? spanStyle.shadow : shadow, (i2 & Fields.Clip) != 0 ? spanStyle.platformStyle : platformSpanStyle, (i2 & Fields.CompositingStrategy) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m5664copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        DrawStyle drawStyle2;
        PlatformSpanStyle platformSpanStyle2;
        long j5;
        long j6;
        TextDecoration textDecoration2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j7;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        Shadow shadow2;
        float alpha = (i2 & 2) != 0 ? spanStyle.getAlpha() : f2;
        long j8 = (i2 & 4) != 0 ? spanStyle.fontSize : j2;
        FontWeight fontWeight3 = (i2 & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle3 = (i2 & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis3 = (i2 & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily3 = (i2 & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str3 = (i2 & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j9 = (i2 & Fields.RotationX) != 0 ? spanStyle.letterSpacing : j3;
        BaselineShift baselineShift3 = (i2 & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i2 & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList3 = (i2 & Fields.CameraDistance) != 0 ? spanStyle.localeList : localeList;
        float f3 = alpha;
        long j10 = j8;
        long j11 = (i2 & 4096) != 0 ? spanStyle.background : j4;
        TextDecoration textDecoration3 = (i2 & 8192) != 0 ? spanStyle.background : textDecoration;
        Shadow shadow3 = (i2 & Fields.Clip) != 0 ? spanStyle.shadow : shadow;
        PlatformSpanStyle platformSpanStyle3 = (i2 & Fields.CompositingStrategy) != 0 ? spanStyle.platformStyle : platformSpanStyle;
        if ((i2 & 65536) != 0) {
            platformSpanStyle2 = platformSpanStyle3;
            drawStyle2 = spanStyle.drawStyle;
            j6 = j11;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j7 = j9;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
            j5 = j10;
        } else {
            drawStyle2 = drawStyle;
            platformSpanStyle2 = platformSpanStyle3;
            j5 = j10;
            j6 = j11;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j7 = j9;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
        }
        return spanStyle.m5668copyNcG25M8(brush, f3, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m5665copy2BkPm_w(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle) {
        return new SpanStyle(Color.m3793equalsimpl0(color, m5671getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.m6143from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m5666copyGSF8kmg(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        return new SpanStyle(Color.m3793equalsimpl0(color, m5671getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.m6143from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m5667copyIuqyXdg(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow) {
        return new SpanStyle(Color.m3793equalsimpl0(color, m5671getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.m6143from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.platformStyle, this.drawStyle, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m5668copyNcG25M8(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.INSTANCE.from(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes$ui_text_release(spanStyle);
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name and from getter */
    public final BaselineShift getBaselineShift() {
        return this.baselineShift;
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5671getColor0d7_KjU() {
        return this.textForegroundStyle.mo6020getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name and from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name and from getter */
    public final FontSynthesis getFontSynthesis() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name and from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: getTextDecoration, reason: from getter */
    public final TextDecoration getBackground() {
        return this.background;
    }

    /* renamed from: getTextForegroundStyle$ui_text_release, reason: from getter */
    public final TextForegroundStyle getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return TextUnit.m6423equalsimpl0(this.fontSize, other.fontSize) && Intrinsics.areEqual(this.fontWeight, other.fontWeight) && Intrinsics.areEqual(this.fontStyle, other.fontStyle) && Intrinsics.areEqual(this.fontSynthesis, other.fontSynthesis) && Intrinsics.areEqual(this.fontFamily, other.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, other.fontFeatureSettings) && TextUnit.m6423equalsimpl0(this.letterSpacing, other.letterSpacing) && Intrinsics.areEqual(this.baselineShift, other.baselineShift) && Intrinsics.areEqual(this.textGeometricTransform, other.textGeometricTransform) && Intrinsics.areEqual(this.localeList, other.localeList) && Color.m3793equalsimpl0(this.background, other.background) && Intrinsics.areEqual(this.platformStyle, other.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(SpanStyle other) {
        return Intrinsics.areEqual(this.textForegroundStyle, other.textForegroundStyle) && Intrinsics.areEqual(this.background, other.background) && Intrinsics.areEqual(this.shadow, other.shadow) && Intrinsics.areEqual(this.drawStyle, other.drawStyle);
    }

    public int hashCode() {
        int iM3799hashCodeimpl = Color.m3799hashCodeimpl(m5671getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int iM6427hashCodeimpl = (TextUnit.m6427hashCodeimpl(this.fontSize) + ((Float.hashCode(getAlpha()) + ((iM3799hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31)) * 31)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = (iM6427hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM5831hashCodeimpl = (iHashCode + (fontStyle != null ? FontStyle.m5831hashCodeimpl(fontStyle.m5833unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM5842hashCodeimpl = (iM5831hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m5842hashCodeimpl(fontSynthesis.getValue()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode2 = (iM5842hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iM6427hashCodeimpl2 = (TextUnit.m6427hashCodeimpl(this.letterSpacing) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM6010hashCodeimpl = (iM6427hashCodeimpl2 + (baselineShift != null ? BaselineShift.m6010hashCodeimpl(baselineShift.m6012unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode3 = (iM6010hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iD = d.d(this.background, (iHashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31, 31);
        TextDecoration textDecoration = this.background;
        int iHashCode4 = (iD + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode5 = (iHashCode4 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode6 = (iHashCode5 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return iHashCode6 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iM6427hashCodeimpl = TextUnit.m6427hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = (iM6427hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM5831hashCodeimpl = (iHashCode + (fontStyle != null ? FontStyle.m5831hashCodeimpl(fontStyle.m5833unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM5842hashCodeimpl = (iM5831hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m5842hashCodeimpl(fontSynthesis.getValue()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode2 = (iM5842hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iM6427hashCodeimpl2 = (TextUnit.m6427hashCodeimpl(this.letterSpacing) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM6010hashCodeimpl = (iM6427hashCodeimpl2 + (baselineShift != null ? BaselineShift.m6010hashCodeimpl(baselineShift.m6012unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode3 = (iM6010hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iD = d.d(this.background, (iHashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31, 31);
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iD + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    public final SpanStyle merge(SpanStyle other) {
        return other == null ? this : SpanStyleKt.m5676fastMergedSHsh3o(this, other.textForegroundStyle.mo6020getColor0d7_KjU(), other.textForegroundStyle.getBrush(), other.textForegroundStyle.getAlpha(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.background, other.shadow, other.platformStyle, other.drawStyle);
    }

    public final SpanStyle plus(SpanStyle other) {
        return merge(other);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) Color.m3800toStringimpl(m5671getColor0d7_KjU()));
        sb.append(", brush=");
        sb.append(getBrush());
        sb.append(", alpha=");
        sb.append(getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m6433toStringimpl(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m6433toStringimpl(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        d.w(this.background, sb, ", textDecoration=");
        sb.append(this.background);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j2;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j4;
        this.background = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, (i2 & 2) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j3, (i2 & Fields.RotationX) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 & Fields.Clip) != 0 ? null : platformSpanStyle, (i2 & Fields.CompositingStrategy) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long jM3828getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM6437getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM6437getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM3828getUnspecified0d7_KjU2 = (i2 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j6 = jM6437getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j7 = jM3828getUnspecified0d7_KjU2;
        this(jM3828getUnspecified0d7_KjU, jM6437getUnspecifiedXSAIIZE, fontWeight2, fontStyle3, fontSynthesis3, fontFamily3, str3, j6, baselineShift3, textGeometricTransform3, localeList3, j7, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.INSTANCE.m6143from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long jM3828getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM6437getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM6437getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM3828getUnspecified0d7_KjU2 = (i2 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j6 = jM3828getUnspecified0d7_KjU;
        long j7 = jM6437getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = jM6437getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = jM3828getUnspecified0d7_KjU2;
        this(j6, j7, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j8, baselineShift3, textGeometricTransform3, localeList3, j9, textDecoration3, (i2 & 8192) != 0 ? null : shadow, (i2 & Fields.Clip) != 0 ? null : platformSpanStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.INSTANCE.m6143from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long jM3828getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j2;
        long jM6437getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM6437getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & Fields.RotationX) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM3828getUnspecified0d7_KjU2 = (i2 & Fields.CameraDistance) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j6 = jM3828getUnspecified0d7_KjU;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        PlatformSpanStyle platformSpanStyle2 = (i2 & Fields.Clip) != 0 ? null : platformSpanStyle;
        long j7 = jM6437getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = jM6437getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = jM3828getUnspecified0d7_KjU2;
        this(j6, j7, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j8, baselineShift3, textGeometricTransform3, localeList3, j9, textDecoration3, shadow2, platformSpanStyle2, (i2 & Fields.CompositingStrategy) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.INSTANCE.m6143from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i2 & 2) != 0 ? Float.NaN : f2, (i2 & 4) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : fontWeight, (i2 & 16) != 0 ? null : fontStyle, (i2 & 32) != 0 ? null : fontSynthesis, (i2 & 64) != 0 ? null : fontFamily, (i2 & 128) != 0 ? null : str, (i2 & Fields.RotationX) != 0 ? TextUnit.INSTANCE.m6437getUnspecifiedXSAIIZE() : j3, (i2 & 512) != 0 ? null : baselineShift, (i2 & 1024) != 0 ? null : textGeometricTransform, (i2 & Fields.CameraDistance) != 0 ? null : localeList, (i2 & 4096) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : j4, (i2 & 8192) != 0 ? null : textDecoration, (i2 & Fields.Clip) != 0 ? null : shadow, (32768 & i2) != 0 ? null : platformSpanStyle, (i2 & 65536) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.INSTANCE.from(brush, f2), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
