package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: vr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vr4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gs4 x;

    public /* synthetic */ vr4(gs4 gs4, int i) {
        this.w = i;
        this.x = gs4;
    }

    public final Object b() {
        int i = this.w;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        gs4 gs4 = this.x;
        switch (i) {
            case b85.b:
                TrustManager[] trustManagerArr = {new yr4(0)};
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
                c45 c45 = new c45();
                c45.a(30, timeUnit);
                c45.y = fg8.b(60, timeUnit);
                c45.z = fg8.b(30, timeUnit);
                c45.w = fg8.b(60, timeUnit);
                SSLSocketFactory socketFactory = instance.getSocketFactory();
                socketFactory.getClass();
                TrustManager trustManager = trustManagerArr[0];
                trustManager.getClass();
                c45.b(socketFactory, (X509TrustManager) trustManager);
                wr4 wr4 = new wr4(0);
                if (wr4 != c45.t) {
                    c45.C = null;
                }
                c45.t = wr4;
                c45.i = true;
                wv2 wv2 = gs4.f;
                wv2.getClass();
                c45.k = wv2;
                ay4 ay4 = gs4.d;
                ul5 ul5 = new ul5(ay4);
                if (ul5 != c45.l) {
                    c45.C = null;
                }
                c45.l = ul5;
                vl5 vl5 = new vl5(ay4);
                if (vl5 != c45.o) {
                    c45.C = null;
                }
                c45.o = vl5;
                return new d45(c45);
            default:
                c45 a = gs4.d().a();
                a.a(15, timeUnit);
                a.y = fg8.b(15, timeUnit);
                return new d45(a);
        }
    }
}
