package androidx.compose.material3;

import J.d;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import j.AbstractC0660m;
import j.AbstractC0661n;
import j.C0638D;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010$\u001a\u00020\b*\u00020 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a3\u0010%\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0001¢\u0006\u0004\b%\u0010&\u001a3\u0010'\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0001¢\u0006\u0004\b'\u0010&\u001a'\u0010(\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b,\u0010+\u001a\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b-\u0010+\u001a'\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b.\u0010/\u001a'\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u0010/\u001a?\u00106\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0003¢\u0006\u0004\b6\u00107\u001aS\u0010A\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u0002032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0:2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010@\u001a\u0018\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0<¢\u0006\u0002\b>¢\u0006\u0002\b?H\u0003¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010C\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\bC\u0010D\u001a:\u0010J\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a'\u0010K\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0001¢\u0006\u0004\bK\u0010L\u001a#\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010N\u001a/\u0010O\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0011H\u0003¢\u0006\u0004\bO\u0010P\u001a]\u0010Y\u001a\u00020\b2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010E\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u000e2!\u0010V\u001a\u001d\u0012\u0013\u0012\u00110Q¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\b0<H\u0002ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001ab\u0010a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020Q2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0<2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010\\\u001a\u00020[2\b\b\u0002\u0010^\u001a\u00020]2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a7\u0010f\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020b2\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\b0:¢\u0006\u0002\b>H\u0003ø\u0001\u0000¢\u0006\u0004\bd\u0010e\u001a*\u0010k\u001a\u00020h2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010j\u001a/\u0010p\u001a\u00020\u00172\u0006\u0010l\u001a\u00020\u00172\u0006\u0010m\u001a\u00020\u00172\u0006\u0010n\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020\u000eH\u0002¢\u0006\u0004\bp\u0010q\u001a\u001f\u0010r\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\br\u0010s\u001a\u001b\u0010t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010t\u001a\u00020\u0011H\u0003¢\u0006\u0004\bt\u0010u\"\u0014\u0010v\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010w\"\u0014\u0010x\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010w\"\u0014\u0010z\u001a\u00020y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010{\"\u0014\u0010|\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010w\"\u0014\u0010}\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010w\"\u0014\u0010~\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010w\"\u0014\u0010\u007f\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010w\"\u0016\u0010\u0080\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010w\"\u0016\u0010\u0081\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010w\"\u0016\u0010\u0082\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010w\"\u0016\u0010\u0083\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010w\"\u0016\u0010\u0084\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010w\"\u0016\u0010\u0085\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010w\"\u0016\u0010\u0086\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010w\"\u0016\u0010\u0087\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010w\"\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001\"\u0018\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001\"\u0016\u0010\u008d\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010w\"\u001b\u0010\u0090\u0001\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u001c\u0010\u0094\u0001\u001a\u00030\u0091\u0001*\u00020 8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u009a\u0001²\u0006\r\u0010\u0095\u0001\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0096\u0001\u001a\u00020Q8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0097\u0001\u001a\u00020Q8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u001c\u001a\u00030\u0098\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0099\u0001\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "TimePickerState", "(IIZ)Landroidx/compose/material3/TimePickerState;", "", "x", "y", "maxDist", "Landroidx/compose/ui/unit/IntOffset;", "center", "moveSelector-d3b8Pxo", "(Landroidx/compose/material3/TimePickerState;FFFJ)V", "moveSelector", "Landroidx/compose/material3/AnalogTimePickerState;", "autoSwitchToMinute", "onTap-rOwcSBo", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTap", "VerticalTimePicker", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "ClockDisplayNumbers", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalPeriodToggle", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/graphics/Shape;", "startShape", "endShape", "PeriodToggleImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ToggleItem", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "TimeSelector-SAnMeKU", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "TimeSelector", "ClockFace", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "drawSelector", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;", "ClockText", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "max", "Lkotlin/ParameterName;", "name", "onNewValue", "timeInputOnChange-z7XvuPQ", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "timeInputOnChange", "onValueChange", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "TimePickerTextField-1vLObsk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/unit/Dp;", "radius", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CircularLayout", "number", "", "numberContentDescription-dSwYdS4", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "x1", "y1", "x2", "y2", "dist", "(FFII)F", "atan", "(FF)F", "visible", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "FullCircle", "F", "HalfCircle", "", "QuarterCircle", "D", "RadiansPerMinute", "RadiansPerHour", "SeparatorZIndex", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "SupportLabelTop", "TimeInputBottomPadding", "MaxDistance", "MinimumInteractiveSize", "Lj/m;", "Minutes", "Lj/m;", "Hours", "ExtraHours", "PeriodToggleMargin", "getHourForDisplay", "(Landroidx/compose/material3/TimePickerState;)I", "hourForDisplay", "Landroidx/compose/ui/unit/DpOffset;", "getSelectorPos", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "selectorPos", "a11yServicesEnabled", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "parentCenter", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final AbstractC0660m ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final AbstractC0660m Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m6233constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m6233constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m6233constructorimpl(36);
    private static final float SupportLabelTop = Dp.m6233constructorimpl(7);
    private static final float MaxDistance = Dp.m6233constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m6233constructorimpl(48);
    private static final AbstractC0660m Minutes = AbstractC0661n.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f2 = 24;
        ClockFaceBottomMargin = Dp.m6233constructorimpl(f2);
        DisplaySeparatorWidth = Dp.m6233constructorimpl(f2);
        TimeInputBottomPadding = Dp.m6233constructorimpl(f2);
        C0638D c0638dA = AbstractC0661n.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = c0638dA;
        C0638D c0638d = new C0638D(c0638dA.f849b);
        int[] iArr = c0638dA.f848a;
        int i2 = c0638dA.f849b;
        for (int i3 = 0; i3 < i2; i3++) {
            c0638d.c((iArr[i3] % 12) + 12);
        }
        ExtraHours = c0638d;
        PeriodToggleMargin = Dp.m6233constructorimpl(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m2352CircularLayoutuFdPcIQ(Modifier modifier, final float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? Fields.RotationX : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i4, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            boolean z = (i4 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j2) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float fMo334toPx0680j_4 = measureScope.mo334toPx0680j_4(f2);
                        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i6 = 0;
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable3 = list.get(i7);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int iG = 0; iG < size2; iG = d.g((Measurable) arrayList.get(iG), jM6177copyZbe2FdA$default, arrayList2, iG, 1)) {
                        }
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i8);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i6 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i6);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i6++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList2.size();
                        Placeable placeableMo5120measureBRTryo0 = measurable5 != null ? measurable5.mo5120measureBRTryo0(jM6177copyZbe2FdA$default) : null;
                        Placeable placeableMo5120measureBRTryo02 = measurable6 != null ? measurable6.mo5120measureBRTryo0(jM6177copyZbe2FdA$default) : null;
                        final Placeable placeable = placeableMo5120measureBRTryo0;
                        final Placeable placeable2 = placeableMo5120measureBRTryo02;
                        return MeasureScope.layout$default(measureScope, Constraints.m6188getMinWidthimpl(j2), Constraints.m6187getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable placeable3 = placeable;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList2;
                                long j3 = j2;
                                float f3 = fMo334toPx0680j_4;
                                float f4 = size5;
                                int size6 = list2.size();
                                int i9 = 0;
                                while (i9 < size6) {
                                    Placeable placeable4 = list2.get(i9);
                                    double d2 = f3;
                                    double d3 = (i9 * f4) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable4, MathKt.roundToInt((Math.cos(d3) * d2) + ((Constraints.m6186getMaxWidthimpl(j3) / 2) - (placeable4.getWidth() / 2))), MathKt.roundToInt((Math.sin(d3) * d2) + ((Constraints.m6185getMaxHeightimpl(j3) / 2) - (placeable4.getHeight() / 2))), 0.0f, 4, null);
                                    i9++;
                                    list2 = list2;
                                    j3 = j3;
                                }
                                Placeable placeable5 = placeable2;
                                if (placeable5 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable5, d.C(placeable2, Constraints.m6188getMinWidthimpl(j2), 2), d.h(placeable2, Constraints.m6187getMinHeightimpl(j2), 2), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int i6 = ((i4 >> 6) & 14) | ((i4 << 3) & 112);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            int i7 = ((i6 << 6) & 896) | 6;
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            if (d.A(composerStartRestartGroup, (i7 >> 6) & 14, function2)) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    TimePickerKt.m2352CircularLayoutuFdPcIQ(modifier2, f2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), composerStartRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-477913269, i4, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
                    }
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                    Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicyRowMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                    Modifier modifierM689sizeVpY3zN4 = SizeKt.m689sizeVpY3zN4(companion, timePickerTokens.m3183getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m3182getTimeSelectorContainerHeightD9Ej5fM());
                    int hourForDisplay = TimePickerKt.getHourForDisplay(timePickerState2);
                    TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.INSTANCE;
                    TimePickerKt.m2355TimeSelectorSAnMeKU(modifierM689sizeVpY3zN4, hourForDisplay, timePickerState2, companion3.m2384getHouryecRtBI(), timePickerColors2, composer2, 3078);
                    TimePickerKt.DisplaySeparator(SizeKt.m689sizeVpY3zN4(companion, TimePickerKt.DisplaySeparatorWidth, timePickerTokens.m3179getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                    TimePickerKt.m2355TimeSelectorSAnMeKU(SizeKt.m689sizeVpY3zN4(companion, timePickerTokens.m3183getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m3182getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m2385getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final void ClockFace(final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1170157036);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170157036, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            CrossfadeKt.Crossfade(analogTimePickerState.getClockFaceValues(), drawSelector(SizeKt.m687size3ABfNKs(BackgroundKt.m196backgroundbw27NRU(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z, analogTimePickerState.mo1392getSelectionyecRtBI(), null)), TimePickerTokens.INSTANCE.m3171getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors), AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new Function3<AbstractC0660m, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC0660m abstractC0660m, Composer composer2, Integer num) {
                    invoke(abstractC0660m, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final AbstractC0660m abstractC0660m, Composer composer2, int i4) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022006568, i4, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m687size3ABfNKs(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m3171getClockDialContainerSizeD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                        }
                    }, 1, null);
                    float f2 = TimePickerKt.OuterCircleSizeRadius;
                    final TimePickerColors timePickerColors2 = timePickerColors;
                    final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                    final boolean z2 = z;
                    TimePickerKt.m2352CircularLayoutuFdPcIQ(modifierSemantics$default, f2, ComposableLambdaKt.rememberComposableLambda(-320307952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-320307952, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                            }
                            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(timePickerColors2.m2330clockDialContentColorvNxB06k$material3_release(false)));
                            final AbstractC0660m abstractC0660m2 = abstractC0660m;
                            final AnalogTimePickerState analogTimePickerState3 = analogTimePickerState2;
                            final boolean z3 = z2;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                    }
                                    composer4.startReplaceGroup(1547046870);
                                    AbstractC0660m abstractC0660m3 = abstractC0660m2;
                                    int i7 = abstractC0660m3.f849b;
                                    AnalogTimePickerState analogTimePickerState4 = analogTimePickerState3;
                                    boolean z4 = z3;
                                    for (final int i8 = 0; i8 < i7; i8++) {
                                        int iA = (!analogTimePickerState4.getIs24hour() || TimePickerSelectionMode.m2380equalsimpl0(analogTimePickerState4.mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI())) ? abstractC0660m3.a(i8) : abstractC0660m3.a(i8) % 12;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        boolean zChanged = composer4.changed(i8);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        boolean z5 = z4;
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState4, iA, z5, composer4, 0);
                                        z4 = z5;
                                    }
                                    composer4.endReplaceGroup();
                                    if (TimePickerSelectionMode.m2380equalsimpl0(analogTimePickerState3.mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI()) && analogTimePickerState3.getIs24hour()) {
                                        Modifier modifierM196backgroundbw27NRU = BackgroundKt.m196backgroundbw27NRU(SizeKt.m687size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3171getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m3827getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                        float f3 = TimePickerKt.InnerCircleRadius;
                                        final AnalogTimePickerState analogTimePickerState5 = analogTimePickerState3;
                                        final boolean z6 = z3;
                                        TimePickerKt.m2352CircularLayoutuFdPcIQ(modifierM196backgroundbw27NRU, f3, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i9) {
                                                if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int i10 = TimePickerKt.ExtraHours.f849b;
                                                AnalogTimePickerState analogTimePickerState6 = analogTimePickerState5;
                                                boolean z7 = z6;
                                                for (final int i11 = 0; i11 < i10; i11++) {
                                                    int iA2 = TimePickerKt.ExtraHours.a(i11);
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    boolean zChanged2 = composer5.changed(i11);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i11);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState6, iA2, z7, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.ClockFace(analogTimePickerState, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static final void ClockText(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i2, final boolean z, Composer composer, final int i3) {
        int i4;
        Modifier modifier2;
        Alignment alignment;
        ?? r12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206784607);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? Fields.RotationX : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? Fields.CameraDistance : 1024;
        }
        int i5 = i4;
        if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, i5, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), composerStartRestartGroup, 6);
            final float fMo334toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(MaxDistance);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3540boximpl(Offset.INSTANCE.m3567getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m6352boximpl(IntOffset.INSTANCE.m6371getZeronOccac()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            final String strM2363numberContentDescriptiondSwYdS4 = m2363numberContentDescriptiondSwYdS4(analogTimePickerState.mo1392getSelectionyecRtBI(), analogTimePickerState.getIs24hour(), i2, composerStartRestartGroup, i5 & 896);
            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i2, 0, 0, false, 7, null);
            boolean zAreEqual = TimePickerSelectionMode.m2380equalsimpl0(analogTimePickerState.mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI()) ? Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getMinute(), 0, 0, false, 7, null), localString$default) : Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierM687size3ABfNKs = SizeKt.m687size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        MutableState<IntOffset> mutableState3 = mutableState2;
                        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
                        TimePickerKt.ClockText$lambda$33(mutableState3, parentCoordinates != null ? IntSizeKt.m6409getCenterozmzZPI(parentCoordinates.mo5128getSizeYbymL2g()) : IntOffset.INSTANCE.m6371getZeronOccac());
                        TimePickerKt.ClockText$lambda$30(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m3581getCenterF1C5BW0());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierFocusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM687size3ABfNKs, (Function1) objRememberedValue4), false, null, 3, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(analogTimePickerState) | composerStartRestartGroup.changed(fMo334toPx0680j_4) | ((i5 & 7168) == 2048) | composerStartRestartGroup.changed(zAreEqual);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                modifier2 = modifierFocusable$default;
                final boolean z2 = zAreEqual;
                alignment = center;
                r12 = 0;
                Function1<SemanticsPropertyReceiver, Unit> function1 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        final float f2 = fMo334toPx0680j_4;
                        final boolean z3 = z;
                        final MutableState<Offset> mutableState3 = mutableState;
                        final MutableState<IntOffset> mutableState4 = mutableState2;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1

                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1674}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            public static final class C00981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ MutableState<Offset> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
                                final /* synthetic */ AnalogTimePickerState $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00981(AnalogTimePickerState analogTimePickerState, float f2, boolean z, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, Continuation<? super C00981> continuation) {
                                    super(2, continuation);
                                    this.$state = analogTimePickerState;
                                    this.$maxDist = f2;
                                    this.$autoSwitchToMinute = z;
                                    this.$center$delegate = mutableState;
                                    this.$parentCenter$delegate = mutableState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00981(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        AnalogTimePickerState analogTimePickerState = this.$state;
                                        float fM3551getXimpl = Offset.m3551getXimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                        float fM3552getYimpl = Offset.m3552getYimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                        float f2 = this.$maxDist;
                                        boolean z = this.$autoSwitchToMinute;
                                        long jClockText$lambda$32 = TimePickerKt.ClockText$lambda$32(this.$parentCenter$delegate);
                                        this.label = 1;
                                        if (TimePickerKt.m2364onTaprOwcSBo(analogTimePickerState, fM3551getXimpl, fM3552getYimpl, f2, z, jClockText$lambda$32, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00981(analogTimePickerState2, f2, z3, mutableState3, mutableState4, null), 3, null);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue5 = function1;
            } else {
                modifier2 = modifierFocusable$default;
                alignment = center;
                r12 = 0;
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue5);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, r12);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(strM2363numberContentDescriptiondSwYdS4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2363numberContentDescriptiondSwYdS4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2326Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) objRememberedValue6), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, value, composer2, 0, 0, 65532);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockText.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    TimePickerKt.ClockText(modifier, analogTimePickerState, i2, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(Offset.m3540boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$32(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$33(MutableState<IntOffset> mutableState, long j2) {
        mutableState.setValue(IntOffset.m6352boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            TextStyle textStyleM5734copyp1EtxEg$default = TextStyle.m5734copyp1EtxEg$default((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6122getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m6099getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m6111getBothEVpEnUU(), null), 0, 0, null, 15695871, null);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2326Text4IGK_g(":", (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM5734copyp1EtxEg$default, composer2, 6, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    TimePickerKt.DisplaySeparator(modifier, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i3, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion3, composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i3 & 126);
            composerStartRestartGroup.startReplaceGroup(919638492);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM646paddingqDBjuR0$default = PaddingKt.m646paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T2 = d.t(companion3, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
                }
                Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i4 = i3 << 3;
                HorizontalPeriodToggle(SizeKt.m689sizeVpY3zN4(companion, timePickerTokens.m3177getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m3176getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, 6 | (i4 & 112) | (i4 & 896));
                composerStartRestartGroup.endNode();
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalClockDisplay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        int iG = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            Measurable measurable = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(Constraints.m6177copyZbe2FdA$default(j2, 0, measureScope.mo328roundToPx0680j_4(TimePickerTokens.INSTANCE.m3178getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    Measurable measurable2 = list.get(i5);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                while (iG < size3) {
                                    iG = d.g((Measurable) arrayList.get(iG), Constraints.m6177copyZbe2FdA$default(j2, 0, Constraints.m6186getMaxWidthimpl(j2) / 2, 0, 0, 12, null), arrayList2, iG, 1);
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m6186getMaxWidthimpl(j2), Constraints.m6185getMaxHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), arrayList2.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo5120measureBRTryo0, arrayList2.get(0).getWidth() - (placeableMo5120measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalPeriodToggle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.HorizontalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HorizontalTimePicker(final androidx.compose.material3.AnalogTimePickerState r18, androidx.compose.ui.Modifier r19, androidx.compose.material3.TimePickerColors r20, final boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i2) {
        int i3;
        Shape shape3;
        final MeasurePolicy measurePolicy2 = measurePolicy;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(measurePolicy2) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            shape3 = shape2;
            i3 |= composerStartRestartGroup.changed(shape3) ? Fields.RenderEffect : 65536;
        } else {
            shape3 = shape2;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i3, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke borderStrokeM224BorderStrokecXLIe8U = BorderStrokeKt.m224BorderStrokecXLIe8U(timePickerTokens.m3178getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape value = ShapesKt.getValue(timePickerTokens.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.INSTANCE;
            final String strM2607getString2EP1pXo = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_time_picker_period_toggle_description), composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(strM2607getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2607getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null)), borderStrokeM224BorderStrokecXLIe8U, cornerBasedShape);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            measurePolicy2 = measurePolicy;
            Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicy2, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            boolean z = !timePickerState.isAfternoon();
            int i4 = i3 & 112;
            boolean z2 = i4 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
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
                        timePickerState.setAfternoon(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i5 = (i3 << 3) & 7168;
            ToggleItem(z, shape, (Function0) objRememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m1622getLambda1$material3_release(), composerStartRestartGroup, ((i3 >> 9) & 112) | 24576 | i5);
            boolean z3 = true;
            SpacerKt.Spacer(BackgroundKt.m197backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), composerStartRestartGroup, 0);
            boolean zIsAfternoon = timePickerState.isAfternoon();
            if (i4 != 32 && ((i3 & 64) == 0 || !composerStartRestartGroup.changedInstance(timePickerState))) {
                z3 = false;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
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
                        timePickerState.setAfternoon(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ToggleItem(zIsAfternoon, shape3, (Function0) objRememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m1623getLambda2$material3_release(), composerStartRestartGroup, ((i3 >> 12) & 112) | 24576 | i5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.PeriodToggleImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy2, shape, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TimeInput(final androidx.compose.material3.TimePickerState r7, androidx.compose.ui.Modifier r8, androidx.compose.material3.TimePickerColors r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            r0 = -760850373(0xffffffffd2a6583b, float:-3.5722242E11)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto Le
            r1 = r11 | 6
            goto L27
        Le:
            r1 = r11 & 6
            if (r1 != 0) goto L26
            r1 = r11 & 8
            if (r1 != 0) goto L1b
            boolean r1 = r10.changed(r7)
            goto L1f
        L1b:
            boolean r1 = r10.changedInstance(r7)
        L1f:
            if (r1 == 0) goto L23
            r1 = 4
            goto L24
        L23:
            r1 = 2
        L24:
            r1 = r1 | r11
            goto L27
        L26:
            r1 = r11
        L27:
            r2 = r12 & 2
            if (r2 == 0) goto L2e
            r1 = r1 | 48
            goto L3e
        L2e:
            r3 = r11 & 48
            if (r3 != 0) goto L3e
            boolean r3 = r10.changed(r8)
            if (r3 == 0) goto L3b
            r3 = 32
            goto L3d
        L3b:
            r3 = 16
        L3d:
            r1 = r1 | r3
        L3e:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L52
            r3 = r12 & 4
            if (r3 != 0) goto L4f
            boolean r3 = r10.changed(r9)
            if (r3 == 0) goto L4f
            r3 = 256(0x100, float:3.59E-43)
            goto L51
        L4f:
            r3 = 128(0x80, float:1.8E-43)
        L51:
            r1 = r1 | r3
        L52:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L65
            boolean r3 = r10.getSkipping()
            if (r3 != 0) goto L5f
            goto L65
        L5f:
            r10.skipToGroupEnd()
        L62:
            r3 = r8
            r4 = r9
            goto Lb1
        L65:
            r10.startDefaults()
            r3 = r11 & 1
            r4 = 6
            if (r3 == 0) goto L7e
            boolean r3 = r10.getDefaultsInvalid()
            if (r3 == 0) goto L74
            goto L7e
        L74:
            r10.skipToGroupEnd()
            r2 = r12 & 4
            if (r2 == 0) goto L8d
        L7b:
            r1 = r1 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L8d
        L7e:
            if (r2 == 0) goto L82
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.INSTANCE
        L82:
            r2 = r12 & 4
            if (r2 == 0) goto L8d
            androidx.compose.material3.TimePickerDefaults r9 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            androidx.compose.material3.TimePickerColors r9 = r9.colors(r10, r4)
            goto L7b
        L8d:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L9c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInput (TimePicker.kt:260)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L9c:
            int r0 = r1 >> 3
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r1 << r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            TimeInputImpl(r8, r9, r7, r10, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L62
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L62
        Lb1:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 == 0) goto Lc2
            androidx.compose.material3.TimePickerKt$TimeInput$1 r1 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>()
            r8.updateScope(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            int i4 = i3 & 896;
            boolean z = i4 == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerKt.getHourForDisplay(timePickerState), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            boolean z2 = i4 == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
            int i5 = i3;
            Modifier modifierM646paddingqDBjuR0$default = PaddingKt.m646paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion3, composerM3285constructorimpl, measurePolicyRowMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TextStyle.m5734copyp1EtxEg$default(TypographyKt.getValue(timeInputTokens.getTimeFieldLabelTextFont(), composerStartRestartGroup, 6), timePickerColors.m2349timeSelectorContentColorvNxB06k$material3_release(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6122getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1306700887, i6, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
                    }
                    final MutableState<TextFieldValue> mutableState = mutableStateRememberSaveable;
                    final TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    final MutableState<TextFieldValue> mutableState2 = mutableStateRememberSaveable2;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                    Function2 function2T2 = d.t(companion5, composerM3285constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3285constructorimpl2, currentCompositionLocalMap2);
                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean zChanged = composer2.changed(mutableState) | composer2.changedInstance(timePickerState2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m2366invokeZmokQxo(keyEvent.m4838unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m2366invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                int iM4851getUtf16CodePointZmokQxo = KeyEvent_androidKt.m4851getUtf16CodePointZmokQxo(keyEvent);
                                if (48 <= iM4851getUtf16CodePointZmokQxo && iM4851getUtf16CodePointZmokQxo < 58 && TextRange.m5721getStartimpl(TimePickerKt.TimeInputImpl$lambda$6(mutableState).getSelection()) == 2 && TimePickerKt.TimeInputImpl$lambda$6(mutableState).getText().length() == 2) {
                                    timePickerState2.mo1393setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI());
                                }
                                return Boolean.FALSE;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion4, (Function1) objRememberedValue3);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$6 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                    boolean zChangedInstance = composer2.changedInstance(timePickerState2) | composer2.changed(mutableState);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldValue textFieldValue) {
                                int iM2384getHouryecRtBI = TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$62 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                int i7 = timePickerState2.getIs24hour() ? 23 : 12;
                                final MutableState<TextFieldValue> mutableState3 = mutableState;
                                TimePickerKt.m2365timeInputOnChangez7XvuPQ(iM2384getHouryecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$62, i7, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    TimePickerSelectionMode.Companion companion6 = TimePickerSelectionMode.INSTANCE;
                    int iM2384getHouryecRtBI = companion6.m2384getHouryecRtBI();
                    ImeAction.Companion companion7 = ImeAction.INSTANCE;
                    int iM5901getNexteUduSuo = companion7.m5901getNexteUduSuo();
                    KeyboardType.Companion companion8 = KeyboardType.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion8.m5955getNumberPjHm6EE(), iM5901getNexteUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                    boolean zChangedInstance2 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                invoke2(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo1393setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    TimePickerKt.m2354TimePickerTextField1vLObsk(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$6, function1, timePickerState2, iM2384getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (Function1) objRememberedValue5, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    TimePickerKt.DisplaySeparator(SizeKt.m689sizeVpY3zN4(companion4, TimePickerKt.DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m3165getPeriodSelectorContainerHeightD9Ej5fM()), composer2, 6);
                    boolean zChanged2 = composer2.changed(mutableState2) | composer2.changedInstance(timePickerState2);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m2367invokeZmokQxo(keyEvent.m4838unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m2367invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                boolean z3 = KeyEvent_androidKt.m4851getUtf16CodePointZmokQxo(keyEvent) == 0 && TextRange.m5721getStartimpl(TimePickerKt.TimeInputImpl$lambda$9(mutableState2).getSelection()) == 0;
                                if (z3) {
                                    timePickerState2.mo1393setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI());
                                }
                                return Boolean.valueOf(z3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion4, (Function1) objRememberedValue6);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$9 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                    boolean zChangedInstance3 = composer2.changedInstance(timePickerState2) | composer2.changed(mutableState2);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldValue textFieldValue) {
                                int iM2385getMinuteyecRtBI = TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$92 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                                final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                TimePickerKt.m2365timeInputOnChangez7XvuPQ(iM2385getMinuteyecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$92, 59, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function12 = (Function1) objRememberedValue7;
                    int iM2385getMinuteyecRtBI = companion6.m2385getMinuteyecRtBI();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion8.m5955getNumberPjHm6EE(), companion7.m5899getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                    boolean zChangedInstance4 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$6$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                invoke2(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo1393setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    TimePickerKt.m2354TimePickerTextField1vLObsk(modifierOnPreviewKeyEvent, textFieldValueTimeInputImpl$lambda$9, function12, timePickerState2, iM2385getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (Function1) objRememberedValue8, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.startReplaceGroup(511443242);
            if (!timePickerState.getIs24hour()) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM646paddingqDBjuR0$default2 = PaddingKt.m646paddingqDBjuR0$default(companion4, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T2 = d.t(companion3, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
                }
                Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VerticalPeriodToggle(SizeKt.m689sizeVpY3zN4(companion4, timeInputTokens.m3166getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m3165getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, ((i5 >> 3) & 112) | 6 | ((i5 << 3) & 896));
                composerStartRestartGroup.endNode();
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.TimeInputImpl.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$6(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$9(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2353TimePickermT9BvqQ(final androidx.compose.material3.TimePickerState r13, androidx.compose.ui.Modifier r14, androidx.compose.material3.TimePickerColors r15, int r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2353TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TimePickerState TimePickerState(int i2, int i3, boolean z) {
        return new TimePickerStateImpl(i2, i3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2354TimePickerTextField1vLObsk(final androidx.compose.ui.Modifier r120, final androidx.compose.ui.text.input.TextFieldValue r121, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r122, androidx.compose.material3.TimePickerState r123, int r124, androidx.compose.foundation.text.KeyboardOptions r125, androidx.compose.foundation.text.KeyboardActions r126, final androidx.compose.material3.TimePickerColors r127, androidx.compose.runtime.Composer r128, final int r129, final int r130) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2354TimePickerTextField1vLObsk(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TimeSelector-SAnMeKU, reason: not valid java name */
    public static final void m2355TimeSelectorSAnMeKU(final Modifier modifier, final int i2, final TimePickerState timePickerState, final int i3, final TimePickerColors timePickerColors, Composer composer, final int i4) {
        int i5;
        int i6;
        int iM2537constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148055889);
        if ((i4 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 = i2;
            i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
        } else {
            i6 = i2;
        }
        if ((i4 & 384) == 0) {
            i5 |= (i4 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? Fields.RotationX : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(timePickerColors) ? Fields.Clip : 8192;
        }
        if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148055889, i5, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean zM2380equalsimpl0 = TimePickerSelectionMode.m2380equalsimpl0(timePickerState.mo1392getSelectionyecRtBI(), i3);
            if (TimePickerSelectionMode.m2380equalsimpl0(i3, TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI())) {
                Strings.Companion companion = Strings.INSTANCE;
                iM2537constructorimpl = Strings.m2537constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                iM2537constructorimpl = Strings.m2537constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            final String strM2607getString2EP1pXo = Strings_androidKt.m2607getString2EP1pXo(iM2537constructorimpl, composerStartRestartGroup, 0);
            long jM2348timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2348timeSelectorContainerColorvNxB06k$material3_release(zM2380equalsimpl0);
            final long jM2349timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m2349timeSelectorContentColorvNxB06k$material3_release(zM2380equalsimpl0);
            boolean zChanged = composerStartRestartGroup.changed(strM2607getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m5550setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5535getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2607getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 896) == 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
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
                        if (TimePickerSelectionMode.m2380equalsimpl0(i3, timePickerState.mo1392getSelectionyecRtBI())) {
                            return;
                        }
                        timePickerState.mo1393setSelection6_8s6DQ(i3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            final int i7 = i6;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2177Surfaced85dljk(zM2380equalsimpl0, (Function0<Unit>) function0, modifierSemantics, false, value, jM2348timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1477282471, i8, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
                    }
                    final String strM2363numberContentDescriptiondSwYdS4 = TimePickerKt.m2363numberContentDescriptiondSwYdS4(i3, timePickerState.getIs24hour(), i7, composer3, 0);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    int i9 = i7;
                    long j2 = jM2349timeSelectorContentColorvNxB06k$material3_release;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer3);
                    Function2 function2T = d.t(companion4, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    boolean zChanged2 = composer3.changed(strM2363numberContentDescriptiondSwYdS4);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2363numberContentDescriptiondSwYdS4);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    TextKt.m2326Text4IGK_g(CalendarLocale_jvmKt.toLocalString$default(i9, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion3, false, (Function1) objRememberedValue3, 1, null), j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    TimePickerKt.m2355TimeSelectorSAnMeKU(modifier, i2, timePickerState, i3, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToggleItem(final boolean z, final Shape shape, final Function0<Unit> function0, final TimePickerColors timePickerColors, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? Fields.Clip : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long jM2347periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m2347periodSelectorContentColorvNxB06k$material3_release(z);
            long jM2346periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2346periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1452textButtonColorsro_MJ88(jM2346periodSelectorContainerColorvNxB06k$material3_release, jM2347periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, 24576, 12), null, null, PaddingKt.m635PaddingValues0680j_4(Dp.m6233constructorimpl(0)), null, function3, composerStartRestartGroup, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ToggleItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i3, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion3, composerM3285constructorimpl, measurePolicyRowMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i3 & 126);
            composerStartRestartGroup.startReplaceGroup(-709485014);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM646paddingqDBjuR0$default = PaddingKt.m646paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM646paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Function2 function2T2 = d.t(companion3, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
                }
                Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i4 = i3 << 3;
                VerticalPeriodToggle(SizeKt.m689sizeVpY3zN4(companion, timePickerTokens.m3180getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m3179getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, 6 | (i4 & 112) | (i4 & 896));
                composerStartRestartGroup.endNode();
            }
            if (d.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalClockDisplay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        int iG = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            Measurable measurable = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, measureScope.mo328roundToPx0680j_4(TimePickerTokens.INSTANCE.m3178getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    Measurable measurable2 = list.get(i5);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                while (iG < size3) {
                                    iG = d.g((Measurable) arrayList.get(iG), Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, Constraints.m6185getMaxHeightimpl(j2) / 2, 3, null), arrayList2, iG, 1);
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m6186getMaxWidthimpl(j2), Constraints.m6185getMaxHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), 0, arrayList2.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo5120measureBRTryo0, 0, arrayList2.get(0).getHeight() - (placeableMo5120measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalPeriodToggle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.VerticalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalTimePicker(final androidx.compose.material3.AnalogTimePickerState r9, androidx.compose.ui.Modifier r10, androidx.compose.material3.TimePickerColors r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f2, float f3) {
        float fAtan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    private static final float dist(float f2, float f3, int i2, int i3) {
        return (float) Math.hypot(i2 - f2, i3 - f3);
    }

    private static final Modifier drawSelector(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt.drawSelector.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                long jOffset = OffsetKt.Offset(contentDrawScope.mo334toPx0680j_4(DpOffset.m6294getXD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))), contentDrawScope.mo334toPx0680j_4(DpOffset.m6296getYD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))));
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f2 = 2;
                float fMo334toPx0680j_4 = contentDrawScope.mo334toPx0680j_4(timePickerTokens.m3173getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f2;
                long selectorColor = timePickerColors.getSelectorColor();
                long jM3818getBlack0d7_KjU = Color.INSTANCE.m3818getBlack0d7_KjU();
                BlendMode.Companion companion = BlendMode.INSTANCE;
                DrawScope.m4323drawCircleVaOC9Bg$default(contentDrawScope, jM3818getBlack0d7_KjU, fMo334toPx0680j_4, jOffset, 0.0f, null, null, companion.m3707getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m4323drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, fMo334toPx0680j_4, jOffset, 0.0f, null, null, companion.m3735getXor0nO6VwU(), 56, null);
                DrawScope.m4328drawLineNGM6Ib0$default(contentDrawScope, selectorColor, androidx.compose.ui.geometry.SizeKt.m3630getCenteruvyYCjk(contentDrawScope.mo4342getSizeNHjbRc()), Offset.m3555minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fMo334toPx0680j_4, ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * fMo334toPx0680j_4)), contentDrawScope.mo334toPx0680j_4(timePickerTokens.m3174getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m3734getSrcOver0nO6VwU(), 240, null);
                DrawScope.m4323drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, contentDrawScope.mo334toPx0680j_4(timePickerTokens.m3172getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f2, androidx.compose.ui.geometry.SizeKt.m3630getCenteruvyYCjk(contentDrawScope.mo4342getSizeNHjbRc()), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                DrawScope.m4323drawCircleVaOC9Bg$default(contentDrawScope, timePickerColors.m2330clockDialContentColorvNxB06k$material3_release(true), fMo334toPx0680j_4, jOffset, 0.0f, null, null, companion.m3717getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.getIs24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return timePickerState.isAfternoon() ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f2 = 2;
        float fM6233constructorimpl = Dp.m6233constructorimpl(timePickerTokens.m3173getClockDialSelectorHandleContainerSizeD9Ej5fM() / f2);
        float fM6233constructorimpl2 = Dp.m6233constructorimpl(Dp.m6233constructorimpl(((analogTimePickerState.getIs24hour() && analogTimePickerState.isAfternoon() && TimePickerSelectionMode.m2380equalsimpl0(analogTimePickerState.mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI())) ? InnerCircleRadius : OuterCircleSizeRadius) - fM6233constructorimpl) + fM6233constructorimpl);
        return DpKt.m6254DpOffsetYgX7TsA(Dp.m6233constructorimpl(Dp.m6233constructorimpl(timePickerTokens.m3171getClockDialContainerSizeD9Ej5fM() / f2) + Dp.m6233constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fM6233constructorimpl2)), Dp.m6233constructorimpl(Dp.m6233constructorimpl(timePickerTokens.m3171getClockDialContainerSizeD9Ej5fM() / f2) + Dp.m6233constructorimpl(fM6233constructorimpl2 * ((float) Math.sin(analogTimePickerState.getCurrentAngle())))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m2362moveSelectord3b8Pxo(TimePickerState timePickerState, float f2, float f3, float f4, long j2) {
        if (TimePickerSelectionMode.m2380equalsimpl0(timePickerState.mo1392getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI()) && timePickerState.getIs24hour()) {
            timePickerState.setAfternoon(dist(f2, f3, IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2)) < f4);
        }
    }

    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m2363numberContentDescriptiondSwYdS4(int i2, boolean z, int i3, Composer composer, int i4) {
        int iM2537constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i4, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if (TimePickerSelectionMode.m2380equalsimpl0(i2, TimePickerSelectionMode.INSTANCE.m2385getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.INSTANCE;
            iM2537constructorimpl = Strings.m2537constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z) {
            Strings.Companion companion2 = Strings.INSTANCE;
            iM2537constructorimpl = Strings.m2537constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            iM2537constructorimpl = Strings.m2537constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String strM2608getStringqBjtwXw = Strings_androidKt.m2608getStringqBjtwXw(iM2537constructorimpl, new Object[]{Integer.valueOf(i3)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM2608getStringqBjtwXw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: onTap-rOwcSBo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2364onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState r11, float r12, float r13, float r14, boolean r15, long r16, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2364onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final TimePickerState rememberTimePickerState(int i2, int i3, boolean z, Composer composer, int i4, int i5) {
        final int i6 = (i5 & 1) != 0 ? 0 : i2;
        final int i7 = (i5 & 2) != 0 ? 0 : i3;
        final boolean zIs24HourFormat = (i5 & 4) != 0 ? TimeFormat_androidKt.is24HourFormat(composer, 0) : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i4, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.INSTANCE.Saver();
        boolean z2 = ((((i4 & 14) ^ 6) > 4 && composer.changed(i6)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(i7)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(zIs24HourFormat)) || (i4 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TimePickerStateImpl>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$state$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TimePickerStateImpl invoke() {
                    return new TimePickerStateImpl(i6, i7, zIs24HourFormat);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m3378rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-z7XvuPQ, reason: not valid java name */
    public static final void m2365timeInputOnChangez7XvuPQ(int i2, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i3, Function1<? super TextFieldValue, Unit> function1) {
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (TimePickerSelectionMode.m2380equalsimpl0(i2, TimePickerSelectionMode.INSTANCE.m2384getHouryecRtBI())) {
                timePickerState.setHour(0);
            } else {
                timePickerState.setMinute(0);
            }
            function1.invoke(TextFieldValue.m5963copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int iDigitToInt = (textFieldValue.getText().length() == 3 && TextRange.m5721getStartimpl(textFieldValue.getSelection()) == 1) ? CharsKt.digitToInt(textFieldValue.getText().charAt(0)) : Integer.parseInt(textFieldValue.getText());
            if (iDigitToInt <= i3) {
                TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.INSTANCE;
                if (TimePickerSelectionMode.m2380equalsimpl0(i2, companion.m2384getHouryecRtBI())) {
                    timePickerState.setHour(iDigitToInt);
                    if (iDigitToInt > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.mo1393setSelection6_8s6DQ(companion.m2385getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinute(iDigitToInt);
                }
                function1.invoke(textFieldValue.getText().length() <= 2 ? textFieldValue : TextFieldValue.m5963copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null));
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    private static final Modifier visible(Modifier modifier, final boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("visible");
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
