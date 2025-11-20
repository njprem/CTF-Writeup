package S;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class f extends SuspendLambda implements Function2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException, CertificateEncodingException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        URLConnection uRLConnectionOpenConnection = new URL("https://stdio.2600.in.th/").openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.connect();
        Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
        Intrinsics.checkNotNullExpressionValue(serverCertificates, "getServerCertificates(...)");
        if (serverCertificates.length == 0) {
            throw new IllegalArgumentException("No certificates found");
        }
        byte[] data = serverCertificates[0].getEncoded();
        Intrinsics.checkNotNull(data);
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(data);
        Intrinsics.checkNotNull(bArrDigest);
        return ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new e(), 30, (Object) null);
    }
}
