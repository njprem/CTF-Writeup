package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import j.C0644J;
import j.N;
import j.S;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001wB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u000e\u001a\u00020\fH ¢\u0006\u0004\b\r\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Jg\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001a2\u0019\u0010\u001f\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0002\b\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0002\b\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0014¢\u0006\u0004\b,\u0010+J\u001f\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u000204*\u00020-2\u0006\u00103\u001a\u00020-H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010(\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b(\u0010;J-\u0010@\u001a\u00020\f2\u001c\u0010?\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020-0=j\b\u0012\u0004\u0012\u00020-`>0<H\u0002¢\u0006\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010D\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bD\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\"\u0010L\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010E\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR\u0017\u0010O\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR:\u0010X\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020-0=j\b\u0012\u0004\u0012\u00020-`>0<\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010]\u001a\u00020Z8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010`\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010b\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0014\u0010d\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010FR\u0014\u0010.\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020g8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010m\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020\"8 X \u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010u\u001a\u0002048VX\u0096\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0005\u001a\u0004\bu\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006x"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "()V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "calculateAlignmentLine", "", "replace$ui_release", "replace", "Landroidx/compose/ui/node/NodeCoordinator;", "invalidateAlignmentLinesFromPositionChange", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/layout/Ruler;", "ruler", "", "defaultValue", "findRulerValue", "(Landroidx/compose/ui/layout/Ruler;F)F", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "result", "captureRulers$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "captureRulers", "value", "provideRulerValue", "(Landroidx/compose/ui/layout/Ruler;F)V", "provideRelativeRulerValue", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "addRulerReader", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/Ruler;)V", "findAncestorRulerDefiner", "(Landroidx/compose/ui/layout/Ruler;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "ancestor", "", "isLayoutNodeAncestor", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z", "invalidateChildrenOfDefiningRuler", "(Landroidx/compose/ui/layout/Ruler;)V", "Landroidx/compose/ui/node/PlaceableResult;", "placeableResult", "(Landroidx/compose/ui/node/PlaceableResult;)V", "Lj/S;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/node/WeakReference;", "layoutNodes", "notifyRulerValueChange", "(Lj/S;)V", "_rulerScope", "Landroidx/compose/ui/layout/RulerScope;", "isPlacedUnderMotionFrameOfReference", "Z", "()Z", "setPlacedUnderMotionFrameOfReference", "(Z)V", "isShallowPlacing", "isShallowPlacing$ui_release", "setShallowPlacing$ui_release", "isPlacingForAlignment", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lj/J;", "rulerValues", "Lj/J;", "rulerValuesCache", "Lj/N;", "rulerReaders", "Lj/N;", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "position", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getParent", "parent", "getHasMeasureResult", "hasMeasureResult", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getRulerScope", "()Landroidx/compose/ui/layout/RulerScope;", "rulerScope", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "isLookingAhead", "isLookingAhead$annotations", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    private static final Function1<PlaceableResult, Unit> onCommitAffectingRuler = new Function1<PlaceableResult, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlaceableResult placeableResult) {
            invoke2(placeableResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulers(placeableResult);
            }
        }
    };
    private RulerScope _rulerScope;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private N rulerReaders;
    private C0644J rulerValues;
    private C0644J rulerValuesCache;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRulerReader(androidx.compose.ui.node.LayoutNode r32, androidx.compose.ui.layout.Ruler r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.addRulerReader(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Ruler):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureRulers(final PlaceableResult placeableResult) {
        long j2;
        LookaheadCapablePlaceable parent;
        Object[] objArr;
        Object[] objArr2;
        float f2;
        S s2;
        OwnerSnapshotObserver snapshotObserver;
        long j3;
        char c2;
        char c3;
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1<RulerScope, Unit> rulers = placeableResult.getResult().getRulers();
        N n2 = this.rulerReaders;
        char c4 = 7;
        int i2 = 8;
        if (rulers == null) {
            if (n2 != null) {
                Object[] objArr3 = n2.f802c;
                long[] jArr = n2.f800a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j4 = jArr[i3];
                        if ((((~j4) << c4) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j4 & 255) < 128) {
                                    c3 = c4;
                                    notifyRulerValueChange((S) objArr3[(i3 << 3) + i5]);
                                } else {
                                    c3 = c4;
                                }
                                j4 >>= 8;
                                i5++;
                                c4 = c3;
                            }
                            c2 = c4;
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            c2 = c4;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        c4 = c2;
                    }
                }
                n2.d();
                return;
            }
            return;
        }
        long j5 = 128;
        C0644J c0644j = this.rulerValuesCache;
        if (c0644j == null) {
            c0644j = new C0644J();
            this.rulerValuesCache = c0644j;
        }
        C0644J from = this.rulerValues;
        if (from == null) {
            from = new C0644J();
            this.rulerValues = from;
        }
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr4 = from.f761b;
        float[] fArr = from.f762c;
        long[] jArr2 = from.f760a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr2[i6];
                int i7 = i2;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & 255) < j5) {
                            int i10 = (i6 << 3) + i9;
                            j3 = j5;
                            c0644j.e(objArr4[i10], fArr[i10]);
                        } else {
                            j3 = j5;
                        }
                        j6 >>= i7;
                        i9++;
                        j5 = j3;
                    }
                    j2 = j5;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    j2 = j5;
                }
                if (i6 == length2) {
                    break;
                }
                i6++;
                j5 = j2;
                i2 = 8;
            }
        } else {
            j2 = 128;
        }
        from.b();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observeReads$ui_release(placeableResult, onCommitAffectingRuler, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulers.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Function1<RulerScope, Unit> rulers2 = placeableResult.getResult().getRulers();
                    if (rulers2 != null) {
                        rulers2.invoke(this.getRulerScope());
                    }
                }
            });
        }
        if (n2 != null) {
            Object[] objArr5 = c0644j.f761b;
            float[] fArr2 = c0644j.f762c;
            long[] jArr3 = c0644j.f760a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i11 = 0;
                while (true) {
                    long j7 = jArr3[i11];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length3)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j7 & 255) < j2) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr5[i14];
                                float f3 = fArr2[i14];
                                Ruler ruler = (Ruler) obj;
                                int iA = from.a(ruler);
                                if (iA >= 0) {
                                    objArr2 = objArr5;
                                    f2 = from.f762c[iA];
                                } else {
                                    objArr2 = objArr5;
                                    f2 = Float.NaN;
                                }
                                if (f2 != f3 && (s2 = (S) n2.h(ruler)) != null) {
                                    notifyRulerValueChange(s2);
                                }
                            } else {
                                objArr2 = objArr5;
                            }
                            j7 >>= 8;
                            i13++;
                            objArr5 = objArr2;
                        }
                        objArr = objArr5;
                        if (i12 != 8) {
                            break;
                        }
                    } else {
                        objArr = objArr5;
                    }
                    if (i11 == length3) {
                        break;
                    }
                    i11++;
                    objArr5 = objArr;
                }
            }
        }
        Object[] objArr6 = from.f761b;
        long[] jArr4 = from.f760a;
        int length4 = jArr4.length - 2;
        if (length4 >= 0) {
            int i15 = 0;
            while (true) {
                long j8 = jArr4[i15];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length4)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j8 & 255) < j2) {
                            Ruler ruler2 = (Ruler) objArr6[(i15 << 3) + i17];
                            if (c0644j.a(ruler2) < 0 && (parent = getParent()) != null) {
                                parent.invalidateChildrenOfDefiningRuler(ruler2);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length4) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        c0644j.b();
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            C0644J c0644j = lookaheadCapablePlaceable.rulerValues;
            if (c0644j != null && c0644j.a(ruler) >= 0) {
                return lookaheadCapablePlaceable;
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final void invalidateChildrenOfDefiningRuler(Ruler ruler) {
        N n2 = findAncestorRulerDefiner(ruler).rulerReaders;
        S s2 = n2 != null ? (S) n2.h(ruler) : null;
        if (s2 != null) {
            notifyRulerValueChange(s2);
        }
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            return isLayoutNodeAncestor(parent$ui_release, layoutNode2);
        }
        return false;
    }

    public static /* synthetic */ void isLookingAhead$annotations() {
    }

    private final void notifyRulerValueChange(S layoutNodes) {
        LayoutNode layoutNode;
        Object[] objArr = layoutNodes.f825b;
        long[] jArr = layoutNodes.f824a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i2 << 3) + i4]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui_release(false);
                        } else {
                            layoutNode.requestRelayout$ui_release(false);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void captureRulers$ui_release(androidx.compose.ui.layout.MeasureResult r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lb
            androidx.compose.ui.node.PlaceableResult r0 = new androidx.compose.ui.node.PlaceableResult
            r0.<init>(r14, r13)
            r13.captureRulers(r0)
            return
        Lb:
            j.N r14 = r13.rulerReaders
            if (r14 == 0) goto L54
            java.lang.Object[] r0 = r14.f802c
            long[] r14 = r14.f800a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L54
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L34:
            if (r8 >= r6) goto L4d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L49
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            j.S r9 = (j.S) r9
            r13.notifyRulerValueChange(r9)
        L49:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L34
        L4d:
            if (r6 != r7) goto L54
        L4f:
            if (r3 == r1) goto L54
            int r3 = r3 + 1
            goto L1a
        L54:
            j.N r14 = r13.rulerReaders
            if (r14 == 0) goto L5b
            r14.d()
        L5b:
            j.J r14 = r13.rulerValues
            if (r14 == 0) goto L62
            r14.b()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulers$ui_release(androidx.compose.ui.layout.MeasureResult):void");
    }

    public final float findRulerValue(Ruler ruler, float defaultValue) {
        int iA;
        if (this.isPlacingForAlignment) {
            return defaultValue;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            C0644J c0644j = lookaheadCapablePlaceable.rulerValues;
            float f2 = Float.NaN;
            if (c0644j != null && (iA = c0644j.a(ruler)) >= 0) {
                f2 = c0644j.f762c[iA];
            }
            if (!Float.isNaN(f2)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return ruler.calculateCoordinate$ui_release(f2, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return defaultValue;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m6361getXimpl(getApparentToRealOffset()) : IntOffset.m6362getYimpl(getApparentToRealOffset()));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long getPosition();

    public final RulerScope getRulerScope() {
        RulerScope rulerScope = this._rulerScope;
        return rulerScope == null ? new RulerScope() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
            @Override // androidx.compose.ui.layout.RulerScope
            public LayoutCoordinates getCoordinates() {
                this.this$0.getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
                return this.this$0.getCoordinates();
            }

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.this$0.getDensity();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.this$0.getFontScale();
            }

            @Override // androidx.compose.ui.layout.RulerScope
            public void provides(Ruler ruler, float f2) {
                this.this$0.provideRulerValue(ruler, f2);
            }

            @Override // androidx.compose.ui.layout.RulerScope
            public void providesRelative(VerticalRuler verticalRuler, float f2) {
                this.this$0.provideRelativeRulerValue(verticalRuler, f2);
            }
        } : rulerScope;
    }

    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!Intrinsics.areEqual(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    /* renamed from: isPlacedUnderMotionFrameOfReference, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* renamed from: isPlacingForAlignment$ui_release, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* renamed from: isShallowPlacing$ui_release, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> alignmentLines, final Function1<? super RulerScope, Unit> rulers, final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public int get$h() {
                return height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Function1<RulerScope, Unit> getRulers() {
                return rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public int get$w() {
                return width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                placementBlock.invoke(this.getPlacementScope());
            }
        };
    }

    public final void provideRelativeRulerValue(Ruler ruler, float value) {
        C0644J c0644j = this.rulerValues;
        if (c0644j == null) {
            c0644j = new C0644J();
            this.rulerValues = c0644j;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            value = getWidth() - value;
        }
        c0644j.e(ruler, value);
    }

    public final void provideRulerValue(Ruler ruler, float value) {
        C0644J c0644j = this.rulerValues;
        if (c0644j == null) {
            c0644j = new C0644J();
            this.rulerValues = c0644j;
        }
        c0644j.e(ruler, value);
    }

    public abstract void replace$ui_release();

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.isShallowPlacing = z;
    }
}
