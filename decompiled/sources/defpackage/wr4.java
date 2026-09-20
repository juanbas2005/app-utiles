package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: wr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wr4 implements HostnameVerifier {
    public final /* synthetic */ int a;

    public /* synthetic */ wr4(int i) {
        this.a = i;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.a) {
            case b85.b:
                k26 k26 = gs4.i;
                return true;
            default:
                return true;
        }
    }
}
