package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: d45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d45 {
    public static final List E = fg8.k(new gu5[]{gu5.HTTP_2, gu5.HTTP_1_1});
    public static final List F = fg8.k(new n11[]{n11.e, n11.f});
    public final long A;
    public final br4 B;
    public final bc7 C;
    public final ji8 D;
    public final am6 a;
    public final List b;
    public final List c;
    public final kj6 d;
    public final boolean e;
    public final boolean f;
    public final g22 g;
    public final boolean h;
    public final boolean i;
    public final s61 j;
    public final yw1 k;
    public final ProxySelector l;
    public final g22 m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final sm0 t;
    public final x91 u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public d45(c45 c45) {
        this.a = c45.a;
        this.b = fg8.j(c45.c);
        this.c = fg8.j(c45.d);
        this.d = c45.e;
        this.e = c45.f;
        this.f = c45.g;
        this.g = c45.h;
        this.h = c45.i;
        this.i = c45.j;
        this.j = c45.k;
        this.k = c45.l;
        ProxySelector proxySelector = c45.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = n15.a;
        }
        this.l = proxySelector;
        this.m = c45.n;
        this.n = c45.o;
        List list = c45.r;
        this.q = list;
        this.r = c45.s;
        this.s = c45.t;
        this.v = c45.w;
        this.w = c45.x;
        this.x = c45.y;
        this.y = c45.z;
        this.z = c45.A;
        this.A = c45.B;
        br4 br4 = c45.C;
        this.B = br4 == null ? new br4(10, (byte) 0) : br4;
        bc7 bc7 = c45.D;
        this.C = bc7 == null ? bc7.l : bc7;
        ji8 ji8 = c45.b;
        if (ji8 == null) {
            ji8 = new ji8(12);
            c45.b = ji8;
        }
        this.D = ji8;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n11) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = c45.p;
                    if (sSLSocketFactory != null) {
                        this.o = sSLSocketFactory;
                        x91 x91 = c45.v;
                        x91.getClass();
                        this.u = x91;
                        X509TrustManager x509TrustManager = c45.q;
                        x509TrustManager.getClass();
                        this.p = x509TrustManager;
                        sm0 sm0 = c45.u;
                        sm0.getClass();
                        this.t = !sg3.e(sm0.b, x91) ? new sm0(sm0.a, x91) : sm0;
                    } else {
                        ej5 ej5 = ej5.a;
                        ej5.a.getClass();
                        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        instance.init((KeyStore) null);
                        TrustManager[] trustManagers = instance.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                                this.p = x509TrustManager2;
                                ej5 ej52 = ej5.a;
                                ej52.getClass();
                                try {
                                    SSLContext k2 = ej52.k();
                                    k2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager2}, (SecureRandom) null);
                                    SSLSocketFactory socketFactory = k2.getSocketFactory();
                                    socketFactory.getClass();
                                    this.o = socketFactory;
                                    x91 c2 = ej5.a.c(x509TrustManager2);
                                    this.u = c2;
                                    sm0 sm02 = c45.u;
                                    sm02.getClass();
                                    this.t = !sg3.e(sm02.b, c2) ? new sm0(sm02.a, c2) : sm02;
                                } catch (GeneralSecurityException e2) {
                                    throw new AssertionError("No System TLS: " + e2, e2);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        arrays.getClass();
                        ku4.g("Unexpected default trust managers: ".concat(arrays));
                        throw null;
                    }
                }
            }
        }
        this.o = null;
        this.u = null;
        this.p = null;
        this.t = sm0.c;
        X509TrustManager x509TrustManager3 = this.p;
        x91 x912 = this.u;
        SSLSocketFactory sSLSocketFactory2 = this.o;
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (!list3.contains((Object) null)) {
            list2.getClass();
            if (!list2.contains((Object) null)) {
                List<n11> list4 = this.q;
                if (list4 == null || !list4.isEmpty()) {
                    for (n11 n11 : list4) {
                        if (n11.a) {
                            if (sSLSocketFactory2 == null) {
                                h.s("sslSocketFactory == null");
                                throw null;
                            } else if (x912 == null) {
                                h.s("certificateChainCleaner == null");
                                throw null;
                            } else if (x509TrustManager3 == null) {
                                h.s("x509TrustManager == null");
                                throw null;
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (sSLSocketFactory2 != null) {
                    h.s("Check failed.");
                    throw null;
                } else if (x912 != null) {
                    h.s("Check failed.");
                    throw null;
                } else if (x509TrustManager3 != null) {
                    h.s("Check failed.");
                    throw null;
                } else if (!sg3.e(this.t, sm0.c)) {
                    h.s("Check failed.");
                    throw null;
                }
            } else {
                ku4.k("Null network interceptor: ", list2);
                throw null;
            }
        } else {
            ku4.k("Null interceptor: ", list3);
            throw null;
        }
    }

    public final c45 a() {
        c45 c45 = new c45();
        c45.a = this.a;
        c45.b = this.D;
        it0.h0(c45.c, this.b);
        it0.h0(c45.d, this.c);
        c45.e = this.d;
        c45.f = this.e;
        c45.g = this.f;
        c45.h = this.g;
        c45.i = this.h;
        c45.j = this.i;
        c45.k = this.j;
        c45.l = this.k;
        c45.m = this.l;
        c45.n = this.m;
        c45.o = this.n;
        c45.p = this.o;
        c45.q = this.p;
        c45.r = this.q;
        c45.s = this.r;
        c45.t = this.s;
        c45.u = this.t;
        c45.v = this.u;
        c45.w = this.v;
        c45.x = this.w;
        c45.y = this.x;
        c45.z = this.y;
        c45.A = this.z;
        c45.B = this.A;
        c45.C = this.B;
        c45.D = this.C;
        return c45;
    }
}
