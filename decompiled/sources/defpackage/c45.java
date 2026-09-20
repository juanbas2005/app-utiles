package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: c45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c45 {
    public int A;
    public long B;
    public br4 C;
    public bc7 D;
    public am6 a = new am6(11);
    public ji8 b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public kj6 e;
    public boolean f;
    public boolean g;
    public g22 h;
    public boolean i;
    public boolean j;
    public s61 k;
    public yw1 l;
    public ProxySelector m;
    public g22 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public sm0 u;
    public x91 v;
    public int w;
    public int x;
    public int y;
    public int z;

    public c45() {
        TimeZone timeZone = fg8.a;
        this.e = new kj6(27);
        this.f = true;
        this.g = true;
        g22 g22 = g22.y;
        this.h = g22;
        this.i = true;
        this.j = true;
        this.k = s61.f;
        this.l = yw1.g;
        this.n = g22;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.o = socketFactory;
        this.r = d45.F;
        this.s = d45.E;
        this.t = a45.a;
        this.u = sm0.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = 60000;
        this.B = 1024;
    }

    public final void a(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.x = fg8.b(j2, timeUnit);
    }

    public final void b(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (!sSLSocketFactory.equals(this.p) || !x509TrustManager.equals(this.q)) {
            this.C = null;
        }
        this.p = sSLSocketFactory;
        ej5 ej5 = ej5.a;
        this.v = ej5.a.c(x509TrustManager);
        this.q = x509TrustManager;
    }
}
