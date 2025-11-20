package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> Function1<Throwable, Throwable> createConstructor(Class<E> cls) throws SecurityException {
        Object next;
        Function1<Throwable, Throwable> function1;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields == fieldsCountOrDefault(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i2 = 0;
            while (true) {
                next = null;
                if (i2 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i2];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    pair = TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            Object objNewInstance = constructor.newInstance(null);
                            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            Throwable th2 = (Throwable) objNewInstance;
                            th2.initCause(th);
                            return th2;
                        }
                    }), 0);
                } else if (length2 != 1) {
                    pair = length2 != 2 ? TuplesKt.to(null, -1) : (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) ? TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            return (Throwable) objNewInstance;
                        }
                    }), 3) : TuplesKt.to(null, -1);
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    pair = Intrinsics.areEqual(cls2, String.class) ? TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            Object objNewInstance = constructor.newInstance(th.getMessage());
                            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            Throwable th2 = (Throwable) objNewInstance;
                            th2.initCause(th);
                            return th2;
                        }
                    }), 2) : Intrinsics.areEqual(cls2, Throwable.class) ? TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            Object objNewInstance = constructor.newInstance(th);
                            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            return (Throwable) objNewInstance;
                        }
                    }), 1) : TuplesKt.to(null, -1);
                }
                arrayList.add(pair);
                i2++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).getSecond()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair2 = (Pair) next;
            if (pair2 != null && (function1 = (Function1) pair2.getFirst()) != null) {
                return function1;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    private static final int fieldsCount(Class<?> cls, int i2) {
        do {
            int i3 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return fieldsCount(cls, i2);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i2) {
        Object objM6498constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM6498constructorimpl = Result.m6498constructorimpl(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6498constructorimpl = Result.m6498constructorimpl(ResultKt.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (Result.m6504isFailureimpl(objM6498constructorimpl)) {
            objM6498constructorimpl = numValueOf;
        }
        return ((Number) objM6498constructorimpl).intValue();
    }

    private static final Function1<Throwable, Throwable> safeCtor(final Function1<? super Throwable, ? extends Throwable> function1) {
        return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt.safeCtor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Throwable invoke(Throwable th) {
                Object objM6498constructorimpl;
                Function1<Throwable, Throwable> function12 = function1;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Throwable thInvoke = function12.invoke(th);
                    if (!Intrinsics.areEqual(th.getMessage(), thInvoke.getMessage()) && !Intrinsics.areEqual(thInvoke.getMessage(), th.toString())) {
                        thInvoke = null;
                    }
                    objM6498constructorimpl = Result.m6498constructorimpl(thInvoke);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM6498constructorimpl = Result.m6498constructorimpl(ResultKt.createFailure(th2));
                }
                return (Throwable) (Result.m6504isFailureimpl(objM6498constructorimpl) ? null : objM6498constructorimpl);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e2) {
        Object objM6498constructorimpl;
        if (!(e2 instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e2.getClass()).invoke(e2);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM6498constructorimpl = Result.m6498constructorimpl(((CopyableThrowable) e2).createCopy());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6498constructorimpl = Result.m6498constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m6504isFailureimpl(objM6498constructorimpl)) {
            objM6498constructorimpl = null;
        }
        return (E) objM6498constructorimpl;
    }
}
