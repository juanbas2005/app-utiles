package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: f11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f11 implements y96, v72 {
    public final bc7 a;
    public final m22 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final dx5 h;
    public final px5 i;
    public final t96 j;
    public final List k;
    public final kd6 l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public jy2 r;
    public gu5 s;
    public wr0 t;
    public ex5 u;

    public f11(bc7 bc7, m22 m22, int i2, int i3, int i4, int i5, boolean z, dx5 dx5, px5 px5, t96 t96, List list, kd6 kd6, int i6, boolean z2) {
        bc7.getClass();
        m22.getClass();
        t96.getClass();
        this.a = bc7;
        this.b = m22;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = z;
        this.h = dx5;
        this.i = px5;
        this.j = t96;
        this.k = list;
        this.l = kd6;
        this.m = i6;
        this.n = z2;
    }

    public final y96 a() {
        return new f11(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final ex5 b() {
        br4 br4 = this.h.w.B;
        t96 t96 = this.j;
        synchronized (br4) {
            t96.getClass();
            ((LinkedHashSet) br4.x).remove(t96);
        }
        ex5 ex5 = this.u;
        ex5.getClass();
        this.j.getClass();
        m76 d2 = this.i.d(this, this.k);
        if (d2 != null) {
            return d2.a;
        }
        synchronized (ex5) {
            m22 m22 = this.b;
            m22.getClass();
            TimeZone timeZone = fg8.a;
            ((ConcurrentLinkedQueue) m22.z).add(ex5);
            ((ac7) m22.x).d((fx5) m22.y, 0);
            this.h.b(ex5);
        }
        this.h.A.getClass();
        return ex5;
    }

    public final boolean c() {
        if (this.s != null) {
            return true;
        }
        return false;
    }

    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            fg8.c(socket);
        }
    }

    public final x96 d() {
        Socket socket;
        Socket socket2;
        if (this.p == null) {
            this.h.P.add(this);
            boolean z = false;
            try {
                h72 h72 = this.h.A;
                InetSocketAddress inetSocketAddress = this.j.c;
                h72.getClass();
                inetSocketAddress.getClass();
                this.b.getClass();
                this.j.getClass();
                i();
                z = true;
                x96 x96 = new x96((y96) this, (Throwable) null, 6);
                this.h.P.remove(this);
                return x96;
            } catch (IOException e2) {
                t96 t96 = this.j;
                v9 v9Var = t96.a;
                if (t96.b.type() != Proxy.Type.DIRECT) {
                    v9 v9Var2 = this.j.a;
                    v9Var2.g.connectFailed(v9Var2.h.h(), this.j.b.address(), e2);
                }
                h72 h722 = this.h.A;
                InetSocketAddress inetSocketAddress2 = this.j.c;
                h722.getClass();
                inetSocketAddress2.getClass();
                this.b.getClass();
                this.j.getClass();
                x96 x962 = new x96((y96) this, (Throwable) e2, 2);
                this.h.P.remove(this);
                if (!z && (socket = this.p) != null) {
                    fg8.c(socket);
                }
                return x962;
            } catch (Throwable th) {
                this.h.P.remove(this);
                if (!z && (socket2 = this.p) != null) {
                    fg8.c(socket2);
                }
                throw th;
            }
        } else {
            h.s("TCP already connected");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x017d  */
    public final x96 g() {
        f11 f11;
        f11 f112;
        Socket socket = this.p;
        f11 f113 = null;
        if (socket == null) {
            h.q("TCP not connected");
            return null;
        } else if (!c()) {
            List list = this.j.a.j;
            this.h.P.add(this);
            boolean z = false;
            try {
                if (this.l != null) {
                    x96 k2 = k();
                    if (k2.c != null) {
                        this.h.P.remove(this);
                        Socket socket2 = this.q;
                        if (socket2 != null) {
                            fg8.c(socket2);
                        }
                        fg8.c(socket);
                        return k2;
                    }
                }
                v9 v9Var = this.j.a;
                if (v9Var.c != null) {
                    wr0 wr0 = this.t;
                    if (wr0 != null) {
                        if (((zw5) wr0.y).x.x()) {
                            wr0 wr02 = this.t;
                            if (wr02 == null) {
                                sg3.a0("socket");
                                throw null;
                            } else if (((yw5) wr02.z).x.x()) {
                                this.h.A.getClass();
                                v9 v9Var2 = this.j.a;
                                SSLSocketFactory sSLSocketFactory = v9Var2.c;
                                g73 g73 = v9Var2.h;
                                Socket createSocket = sSLSocketFactory.createSocket(socket, g73.d, g73.e, true);
                                createSocket.getClass();
                                SSLSocket sSLSocket = (SSLSocket) createSocket;
                                f11 m2 = m(list, sSLSocket);
                                n11 n11 = (n11) list.get(m2.m);
                                f11 = m2.l(list, sSLSocket);
                                try {
                                    n11.a(sSLSocket, m2.n);
                                    j(sSLSocket, n11);
                                    this.h.A.getClass();
                                    f112 = f11;
                                } catch (IOException e2) {
                                    e = e2;
                                    try {
                                        h72 h72 = this.h.A;
                                        InetSocketAddress inetSocketAddress = this.j.c;
                                        h72.getClass();
                                        inetSocketAddress.getClass();
                                        this.b.getClass();
                                        this.j.getClass();
                                        if (this.g) {
                                        }
                                        x96 x96 = new x96((y96) this, f113, (Throwable) e);
                                        this.h.P.remove(this);
                                        if (!z) {
                                        }
                                        return x96;
                                    } catch (Throwable th) {
                                        th = th;
                                        this.h.P.remove(this);
                                        if (!z) {
                                            Socket socket3 = this.q;
                                            if (socket3 != null) {
                                                fg8.c(socket3);
                                            }
                                            fg8.c(socket);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    sg3.a0("socket");
                    throw null;
                }
                this.q = socket;
                List list2 = v9Var.i;
                gu5 gu5 = gu5.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(gu5)) {
                    gu5 = gu5.HTTP_1_1;
                }
                this.s = gu5;
                f112 = null;
                try {
                    bc7 bc7 = this.a;
                    m22 m22 = this.b;
                    t96 t96 = this.j;
                    Socket socket4 = this.q;
                    socket4.getClass();
                    jy2 jy2 = this.r;
                    String str = "socket";
                    gu5 gu52 = this.s;
                    gu52.getClass();
                    String str2 = str;
                    wr0 wr03 = this.t;
                    if (wr03 != null) {
                        this.b.getClass();
                        ex5 ex5 = new ex5(bc7, m22, t96, socket, socket4, jy2, gu52, wr03);
                        this.u = ex5;
                        ex5.i();
                        h72 h722 = this.h.A;
                        InetSocketAddress inetSocketAddress2 = this.j.c;
                        h722.getClass();
                        inetSocketAddress2.getClass();
                        try {
                            x96 x962 = new x96((y96) this, (Throwable) null, 6);
                            this.h.P.remove(this);
                            return x962;
                        } catch (IOException e3) {
                            e = e3;
                            z = true;
                            f11 = f112;
                            h72 h723 = this.h.A;
                            InetSocketAddress inetSocketAddress3 = this.j.c;
                            h723.getClass();
                            inetSocketAddress3.getClass();
                            this.b.getClass();
                            this.j.getClass();
                            if (this.g) {
                            }
                            x96 x963 = new x96((y96) this, f113, (Throwable) e);
                            this.h.P.remove(this);
                            if (!z) {
                            }
                            return x963;
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            this.h.P.remove(this);
                            if (!z) {
                            }
                            throw th;
                        }
                    } else {
                        sg3.a0(str2);
                        throw null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    f11 = f112;
                    h72 h7232 = this.h.A;
                    InetSocketAddress inetSocketAddress32 = this.j.c;
                    h7232.getClass();
                    inetSocketAddress32.getClass();
                    this.b.getClass();
                    this.j.getClass();
                    if (this.g) {
                    }
                    x96 x9632 = new x96((y96) this, f113, (Throwable) e);
                    this.h.P.remove(this);
                    if (!z) {
                    }
                    return x9632;
                }
            } catch (IOException e5) {
                e = e5;
                f11 = null;
                h72 h72322 = this.h.A;
                InetSocketAddress inetSocketAddress322 = this.j.c;
                h72322.getClass();
                inetSocketAddress322.getClass();
                this.b.getClass();
                this.j.getClass();
                if (this.g) {
                    if (!(e instanceof ProtocolException)) {
                        if (!(e instanceof InterruptedIOException)) {
                            if (!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) {
                                if (!(e instanceof SSLPeerUnverifiedException)) {
                                    if (e instanceof SSLException) {
                                        f113 = f11;
                                    }
                                }
                            }
                        }
                    }
                }
                x96 x96322 = new x96((y96) this, f113, (Throwable) e);
                this.h.P.remove(this);
                if (!z) {
                    Socket socket5 = this.q;
                    if (socket5 != null) {
                        fg8.c(socket5);
                    }
                    fg8.c(socket);
                }
                return x96322;
            }
        } else {
            h.s("already connected");
            return null;
        }
    }

    public final t96 h() {
        return this.j;
    }

    public final void i() {
        int i2;
        Socket socket;
        Proxy.Type type = this.j.b.type();
        if (type == null) {
            i2 = -1;
        } else {
            i2 = e11.a[type.ordinal()];
        }
        if (i2 == 1 || i2 == 2) {
            socket = this.j.a.b.createSocket();
            socket.getClass();
        } else {
            socket = new Socket(this.j.b);
        }
        this.p = socket;
        if (!this.o) {
            socket.setSoTimeout(this.f);
            try {
                ej5 ej5 = ej5.a;
                ej5.a.e(socket, this.j.c, this.e);
                try {
                    this.t = new wr0((dy6) new am6(socket));
                } catch (NullPointerException e2) {
                    if (sg3.e(e2.getMessage(), "throw with null exception")) {
                        throw new IOException(e2);
                    }
                }
            } catch (ConnectException e3) {
                ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
                connectException.initCause(e3);
                throw connectException;
            }
        } else {
            rf2.i("canceled");
        }
    }

    public final void j(SSLSocket sSLSocket, n11 n11) {
        gu5 gu5;
        v9 v9Var = this.j.a;
        try {
            if (n11.b) {
                ej5 ej5 = ej5.a;
                ej5.a.d(sSLSocket, v9Var.h.d, v9Var.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            jy2 p2 = ed1.p(session);
            HostnameVerifier hostnameVerifier = v9Var.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(v9Var.h.d, session)) {
                List a2 = p2.a();
                if (!a2.isEmpty()) {
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n            |Hostname ");
                    sb.append(v9Var.h.d);
                    sb.append(" not verified:\n            |    certificate: ");
                    sm0 sm0 = sm0.c;
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    dg0 dg0 = dg0.z;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb2.append(td0.E(encoded).c("SHA-256").a());
                    sb.append(sb2.toString());
                    sb.append("\n            |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n            |    subjectAltNames: ");
                    sb.append(dt0.M0(a45.a(x509Certificate, 7), a45.a(x509Certificate, 2)));
                    sb.append("\n            ");
                    throw new SSLPeerUnverifiedException(e57.g0(sb.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + v9Var.h.d + " not verified (no certificates)");
            }
            sm0 sm02 = v9Var.e;
            sm02.getClass();
            this.r = new jy2(p2.a, p2.b, p2.c, new g20(sm02, p2, v9Var, 3));
            v9Var.h.d.getClass();
            Iterator it = sm02.a.iterator();
            String str = null;
            if (!it.hasNext()) {
                if (n11.b) {
                    ej5 ej52 = ej5.a;
                    str = ej5.a.f(sSLSocket);
                }
                this.q = sSLSocket;
                this.t = new wr0((dy6) new am6((Socket) sSLSocket));
                if (str != null) {
                    gu5.x.getClass();
                    gu5 = hr2.w(str);
                } else {
                    gu5 = gu5.HTTP_1_1;
                }
                this.s = gu5;
                ej5 ej53 = ej5.a;
                ej5.a.getClass();
                return;
            }
            f21.u(it.next());
            throw null;
        } catch (Throwable th) {
            ej5 ej54 = ej5.a;
            ej5.a.getClass();
            fg8.c(sSLSocket);
            throw th;
        }
    }

    public final x96 k() {
        kd6 kd6 = this.l;
        kd6.getClass();
        t96 t96 = this.j;
        g73 g73 = t96.a.h;
        String str = "CONNECT " + fg8.i(g73, true) + " HTTP/1.1";
        wr0 wr0 = this.t;
        if (wr0 != null) {
            h33 h33 = new h33((d45) null, this, wr0);
            wr0 wr02 = this.t;
            if (wr02 != null) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ((zw5) wr02.y).w.g().g((long) this.c, timeUnit);
                wr0 wr03 = this.t;
                if (wr03 != null) {
                    ((yw5) wr03.z).w.g().g((long) this.d, timeUnit);
                    h33.l((bz2) kd6.z, str);
                    h33.b();
                    z56 f2 = h33.f(false);
                    f2.getClass();
                    f2.a = kd6;
                    a66 a2 = f2.a();
                    int i2 = a2.z;
                    long e2 = fg8.e(a2);
                    if (e2 != -1) {
                        e33 k2 = h33.k((g73) a2.w.x, e2);
                        fg8.g(k2, Integer.MAX_VALUE);
                        k2.close();
                    }
                    if (i2 == 200) {
                        return new x96((y96) this, (Throwable) null, 6);
                    }
                    if (i2 == 407) {
                        t96.a.f.getClass();
                        rf2.i("Failed to authenticate with proxy");
                        return null;
                    }
                    rf2.i(hl6.k(i2, "Unexpected response code for CONNECT: "));
                    return null;
                }
                sg3.a0("socket");
                throw null;
            }
            sg3.a0("socket");
            throw null;
        }
        sg3.a0("socket");
        throw null;
    }

    public final f11 l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        boolean z;
        list.getClass();
        int i2 = this.m;
        int size = list.size();
        for (int i3 = i2 + 1; i3 < size; i3++) {
            n11 n11 = (n11) list.get(i3);
            n11.getClass();
            if (n11.a && (((strArr = n11.d) == null || dg8.f(strArr, sSLSocket.getEnabledProtocols(), dr4.x)) && ((strArr2 = n11.c) == null || dg8.f(strArr2, sSLSocket.getEnabledCipherSuites(), tp0.c)))) {
                if (i2 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = z;
                return new f11(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i3, z2);
            }
        }
        return null;
    }

    public final f11 m(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        f11 l2 = l(list, sSLSocket);
        if (l2 != null) {
            return l2;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final void e() {
    }

    public final void f(dx5 dx5, IOException iOException) {
    }
}
