package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: lx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lx5 {
    public final dx5 a;
    public final ArrayList b;
    public final int c;
    public final u72 d;
    public final kd6 e;
    public final int f;
    public final int g;
    public final int h;
    public final g22 i;
    public final sm0 j;
    public final ji8 k;
    public final s61 l;
    public final yw1 m;
    public final HostnameVerifier n;
    public final g22 o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final x91 u;
    public int v;

    public lx5(dx5 dx5, ArrayList arrayList, int i2, u72 u72, kd6 kd6, int i3, int i4, int i5, g22 g22, sm0 sm0, ji8 ji8, s61 s61, yw1 yw1, HostnameVerifier hostnameVerifier, g22 g222, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, x91 x91) {
        kd6.getClass();
        g22.getClass();
        sm0.getClass();
        ji8.getClass();
        s61.getClass();
        yw1.getClass();
        hostnameVerifier.getClass();
        g222.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = dx5;
        this.b = arrayList;
        this.c = i2;
        this.d = u72;
        this.e = kd6;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = g22;
        this.j = sm0;
        this.k = ji8;
        this.l = s61;
        this.m = yw1;
        this.n = hostnameVerifier;
        this.o = g222;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = x91;
    }

    public static lx5 a(lx5 lx5, int i2, u72 u72, kd6 kd6, int i3) {
        int i4;
        u72 u722;
        kd6 kd62;
        lx5 lx52 = lx5;
        if ((i3 & 1) != 0) {
            i4 = lx52.c;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            u722 = lx52.d;
        } else {
            u722 = u72;
        }
        if ((i3 & 4) != 0) {
            kd62 = lx52.e;
        } else {
            kd62 = kd6;
        }
        int i5 = lx52.f;
        int i6 = lx52.g;
        int i7 = lx52.h;
        g22 g22 = lx52.i;
        sm0 sm0 = lx52.j;
        ji8 ji8 = lx52.k;
        s61 s61 = lx52.l;
        yw1 yw1 = lx52.m;
        HostnameVerifier hostnameVerifier = lx52.n;
        g22 g222 = lx52.o;
        ProxySelector proxySelector = lx52.p;
        boolean z = lx52.q;
        HostnameVerifier hostnameVerifier2 = hostnameVerifier;
        SocketFactory socketFactory = lx52.r;
        SSLSocketFactory sSLSocketFactory = lx52.s;
        X509TrustManager x509TrustManager = lx52.t;
        x91 x91 = lx52.u;
        kd62.getClass();
        g22.getClass();
        sm0.getClass();
        ji8.getClass();
        s61.getClass();
        yw1.getClass();
        hostnameVerifier2.getClass();
        g222.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        ProxySelector proxySelector2 = proxySelector;
        boolean z2 = z;
        return new lx5(lx52.a, lx52.b, i4, u722, kd62, i5, i6, i7, g22, sm0, ji8, s61, yw1, hostnameVerifier2, g222, proxySelector2, z2, socketFactory, sSLSocketFactory, x509TrustManager, x91);
    }

    public final a66 b(kd6 kd6) {
        kd6.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = this.c;
        if (i2 < size) {
            this.v++;
            u72 u72 = this.d;
            if (u72 != null) {
                px5 h2 = ((x72) u72.d).h();
                g73 g73 = (g73) kd6.x;
                h2.getClass();
                g73.getClass();
                g73 g732 = h2.i.h;
                if (g73.e != g732.e || !sg3.e(g73.d, g732.d)) {
                    h.p(arrayList.get(i2 - 1), " must retain the same host and port", "network interceptor ");
                    return null;
                } else if (this.v != 1) {
                    h.p(arrayList.get(i2 - 1), " must call proceed() exactly once", "network interceptor ");
                    return null;
                }
            }
            int i3 = i2 + 1;
            lx5 a2 = a(this, i3, (u72) null, kd6, 2097146);
            if3 if3 = (if3) arrayList.get(i2);
            a66 a3 = if3.a(a2);
            if (a3 == null) {
                throw new NullPointerException("interceptor " + if3 + " returned null");
            } else if (u72 == null || i3 >= arrayList.size() || a2.v == 1) {
                return a3;
            } else {
                h.p(if3, " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        } else {
            h.s("Check failed.");
            return null;
        }
    }
}
