package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.RenderIntent;
import j.AbstractC0663p;
import j.C0639E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"", "src", "dst", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "connectorKey-YBCOT_4", "(III)I", "connectorKey", "Lj/E;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Connectors", "Lj/E;", "getConnectors", "()Lj/E;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectorKt {
    private static final C0639E Connectors;

    static {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        int id = colorSpaces.getSrgb().getId();
        int id2 = colorSpaces.getSrgb().getId();
        RenderIntent.Companion companion = RenderIntent.INSTANCE;
        int iM4226getPerceptualuksYyKA = id | (id2 << 6) | (companion.m4226getPerceptualuksYyKA() << 12);
        Connector connectorIdentity$ui_graphics_release = Connector.INSTANCE.identity$ui_graphics_release(colorSpaces.getSrgb());
        int id3 = colorSpaces.getSrgb().getId() | (colorSpaces.getOklab().getId() << 6) | (companion.m4226getPerceptualuksYyKA() << 12);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Connector connector = new Connector(colorSpaces.getSrgb(), colorSpaces.getOklab(), companion.m4226getPerceptualuksYyKA(), defaultConstructorMarker);
        int id4 = colorSpaces.getOklab().getId() | (colorSpaces.getSrgb().getId() << 6) | (companion.m4226getPerceptualuksYyKA() << 12);
        Connector connector2 = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion.m4226getPerceptualuksYyKA(), defaultConstructorMarker);
        C0639E c0639e = AbstractC0663p.f856a;
        C0639E c0639e2 = new C0639E();
        c0639e2.h(iM4226getPerceptualuksYyKA, connectorIdentity$ui_graphics_release);
        c0639e2.h(id3, connector);
        c0639e2.h(id4, connector2);
        Connectors = c0639e2;
    }

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m4217connectorKeyYBCOT_4(int i2, int i3, int i4) {
        return i2 | (i3 << 6) | (i4 << 12);
    }

    public static final C0639E getConnectors() {
        return Connectors;
    }
}
