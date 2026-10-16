package org.apache.cordova;

import N0.B;
import android.webkit.ClientCertRequest;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public class CordovaClientCertRequest implements B {

    /* renamed from: a, reason: collision with root package name */
    public final ClientCertRequest f2523a;

    public CordovaClientCertRequest(ClientCertRequest clientCertRequest) {
        this.f2523a = clientCertRequest;
    }

    public void cancel() {
        this.f2523a.cancel();
    }

    public String getHost() {
        return this.f2523a.getHost();
    }

    public String[] getKeyTypes() {
        return this.f2523a.getKeyTypes();
    }

    public int getPort() {
        return this.f2523a.getPort();
    }

    public Principal[] getPrincipals() {
        return this.f2523a.getPrincipals();
    }

    public void ignore() {
        this.f2523a.ignore();
    }

    public void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        this.f2523a.proceed(privateKey, x509CertificateArr);
    }
}
