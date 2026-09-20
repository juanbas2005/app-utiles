package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: yr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yr4 implements X509TrustManager {
    public final /* synthetic */ int a;

    public /* synthetic */ yr4(int i) {
        this.a = i;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        int i = this.a;
        x509CertificateArr.getClass();
        str.getClass();
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        int i = this.a;
        x509CertificateArr.getClass();
        str.getClass();
    }

    public final X509Certificate[] getAcceptedIssuers() {
        switch (this.a) {
        }
        return new X509Certificate[0];
    }
}
