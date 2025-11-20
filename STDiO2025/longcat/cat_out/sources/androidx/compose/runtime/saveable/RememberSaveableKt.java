package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a>\u0010\u0006\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b0\u0007\"\u0004\b\u0000\u0010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007H\u0002\u001aa\u0010\u000b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00052\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\r\"\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0006\b\u0001\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\t0\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001ag\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\r\"\u0004\u0018\u00010\u00052\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0006\b\u0001\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\u0011H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"MaxSupportedRadix", "", "generateCannotBeSavedErrorMessage", "", "value", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "inner", "rememberSaveable", "inputs", "", "saver", "key", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new Function2<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object objSave = saver.save(saverScope, mutableState.getValue());
                if (objSave == null) {
                    return null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new Function1<MutableState<Object>, MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                T tRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (mutableState.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = mutableState.getValue();
                    Intrinsics.checkNotNull(value);
                    tRestore = saver2.restore(value);
                } else {
                    tRestore = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(tRestore, policy);
                Intrinsics.checkNotNull(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
                return mutableStateMutableStateOf;
            }
        });
    }

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m3378rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, Function0<? extends T> function0, Composer composer, int i2, int i3) {
        Object[] objArr2;
        final T t;
        Object objConsumeRestored;
        if ((i3 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        int i4 = i3 & 4;
        T tInvoke = null;
        if (i4 != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(currentCompositeKeyHash, CharsKt.checkRadix(MaxSupportedRadix));
            Intrinsics.checkNotNullExpressionValue(str, "toString(this, checkRadix(radix))");
        }
        final String str2 = str;
        Intrinsics.checkNotNull(saver2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            if (saveableStateRegistry != null && (objConsumeRestored = saveableStateRegistry.consumeRestored(str2)) != null) {
                tInvoke = saver2.restore(objConsumeRestored);
            }
            if (tInvoke == null) {
                tInvoke = function0.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, str2, tInvoke, objArr2);
            composer.updateRememberedValue(saveableHolder);
            objRememberedValue = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) objRememberedValue;
        Object valueIfInputsDidntChange = saveableHolder2.getValueIfInputsDidntChange(objArr2);
        if (valueIfInputsDidntChange == null) {
            valueIfInputsDidntChange = function0.invoke();
        }
        boolean zChangedInstance = composer.changedInstance(saveableHolder2) | ((((i2 & 112) ^ 48) > 32 && composer.changedInstance(saver2)) || (i2 & 48) == 32) | composer.changedInstance(saveableStateRegistry) | composer.changed(str2) | composer.changedInstance(valueIfInputsDidntChange) | composer.changedInstance(objArr2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t = (T) valueIfInputsDidntChange;
            Object obj = new Function0<Unit>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
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
                    saveableHolder2.update(saver2, saveableStateRegistry, str2, t, objArr3);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        } else {
            t = (T) valueIfInputsDidntChange;
        }
        EffectsKt.SideEffect((Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, Function0<? extends MutableState<T>> function0, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        MutableState<T> mutableState = (MutableState) m3378rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, (Function0) function0, composer, i2 & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
