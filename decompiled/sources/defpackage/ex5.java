package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: ex5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ex5 extends n33 implements v72 {
    public final bc7 b;
    public final t96 c;
    public final Socket d;
    public final Socket e;
    public final jy2 f;
    public final gu5 g;
    public final wr0 h;
    public p33 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final ArrayList p = new ArrayList();
    public long q = Long.MAX_VALUE;

    public ex5(bc7 bc7, m22 m22, t96 t96, Socket socket, Socket socket2, jy2 jy2, gu5 gu5, wr0 wr0) {
        bc7.getClass();
        m22.getClass();
        t96.getClass();
        socket.getClass();
        socket2.getClass();
        gu5.getClass();
        wr0.getClass();
        this.b = bc7;
        this.c = t96;
        this.d = socket;
        this.e = socket2;
        this.f = jy2;
        this.g = gu5;
        this.h = wr0;
    }

    public static void c(d45 d45, t96 t96, IOException iOException) {
        d45.getClass();
        t96.getClass();
        iOException.getClass();
        if (t96.b.type() != Proxy.Type.DIRECT) {
            v9 v9Var = t96.a;
            v9Var.g.connectFailed(v9Var.h.h(), t96.b.address(), iOException);
        }
        br4 br4 = d45.B;
        synchronized (br4) {
            ((LinkedHashSet) br4.x).add(t96);
        }
    }

    public final void a(p33 p33, ao6 ao6) {
        int i2;
        ao6.getClass();
        synchronized (this) {
            if ((ao6.a & 8) != 0) {
                i2 = ao6.b[3];
            } else {
                i2 = Integer.MAX_VALUE;
            }
            this.o = i2;
        }
    }

    public final void b(w33 w33) {
        w33.c(k62.C, (IOException) null);
    }

    public final void cancel() {
        fg8.c(this.d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (defpackage.a45.c(r5, (java.security.cert.X509Certificate) r8) != false) goto L_0x00ab;
     */
    public final boolean d(v9 v9Var, List list) {
        g73 g73 = v9Var.h;
        TimeZone timeZone = fg8.a;
        if (this.p.size() < this.o && !this.j) {
            t96 t96 = this.c;
            v9 v9Var2 = t96.a;
            v9 v9Var3 = t96.a;
            if (v9Var2.a(v9Var)) {
                String str = g73.d;
                String str2 = g73.d;
                if (sg3.e(str, v9Var3.h.d)) {
                    return true;
                }
                if (this.i != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        t96 t962 = (t96) it.next();
                        Proxy.Type type = t962.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && t96.b.type() == type2 && sg3.e(t96.c, t962.c)) {
                            if (v9Var.d == a45.a) {
                                TimeZone timeZone2 = fg8.a;
                                g73 g732 = v9Var3.h;
                                if (g73.e == g732.e) {
                                    boolean e2 = sg3.e(str2, g732.d);
                                    jy2 jy2 = this.f;
                                    if (!e2) {
                                        if (!this.k && jy2 != null) {
                                            List a = jy2.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        sm0 sm0 = v9Var.e;
                                        sm0.getClass();
                                        jy2.getClass();
                                        List a2 = jy2.a();
                                        str2.getClass();
                                        a2.getClass();
                                        Iterator it2 = sm0.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        f21.u(it2.next());
                                        throw null;
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void e() {
        synchronized (this) {
            this.j = true;
        }
    }

    public final void f(dx5 dx5, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (this.i != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || (iOException instanceof ConnectionShutdownException)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                c(dx5.w, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).w == k62.C) {
                    int i2 = this.n + 1;
                    this.n = i2;
                    if (i2 > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((StreamResetException) iOException).w != k62.D || !dx5.N) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        return true;
     */
    public final boolean g(boolean z) {
        long j2;
        int soTimeout;
        TimeZone timeZone = fg8.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        p33 p33 = this.i;
        if (p33 != null) {
            synchronized (p33) {
                if (p33.B) {
                    return false;
                }
                if (p33.J < p33.I && nanoTime >= p33.K) {
                    return false;
                }
            }
        } else {
            synchronized (this) {
                j2 = nanoTime - this.q;
            }
            if (j2 < 10000000000L || !z) {
                return true;
            }
            Socket socket = this.e;
            zw5 zw5 = (zw5) this.h.y;
            socket.getClass();
            zw5.getClass();
            try {
                soTimeout = socket.getSoTimeout();
                socket.setSoTimeout(1);
                boolean z2 = !zw5.x();
                socket.setSoTimeout(soTimeout);
                return z2;
            } catch (SocketTimeoutException unused) {
                return true;
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        }
    }

    public final t96 h() {
        return this.c;
    }

    public final void i() {
        int i2;
        this.q = System.nanoTime();
        gu5 gu5 = this.g;
        if (gu5 == gu5.HTTP_2 || gu5 == gu5.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            td0 td0 = td0.z;
            gi2 gi2 = gi2.a;
            o9 o9Var = new o9(this.b);
            wr0 wr0 = this.h;
            String str = this.c.a.h.d;
            wr0.getClass();
            str.getClass();
            o9Var.y = wr0;
            o9Var.z = fg8.b + ' ' + str;
            o9Var.A = this;
            o9Var.B = gi2;
            p33 p33 = new p33(o9Var);
            this.i = p33;
            ao6 ao6 = p33.V;
            if ((ao6.a & 8) != 0) {
                i2 = ao6.b[3];
            } else {
                i2 = Integer.MAX_VALUE;
            }
            this.o = i2;
            x33 x33 = p33.S;
            synchronized (x33) {
                try {
                    if (!x33.z) {
                        Logger logger = x33.B;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(fg8.d(">> CONNECTION " + i33.a.e(), new Object[0]));
                        }
                        x33.w.f0(i33.a);
                        x33.w.flush();
                    } else {
                        throw new IOException("closed");
                    }
                } finally {
                }
            }
            x33 x332 = p33.S;
            ao6 ao62 = p33.M;
            x332.getClass();
            ao62.getClass();
            synchronized (x332) {
                try {
                    if (!x332.z) {
                        x332.l(0, Integer.bitCount(ao62.a) * 6, 4, 0);
                        for (int i3 = 0; i3 < 10; i3++) {
                            boolean z = true;
                            if (((1 << i3) & ao62.a) == 0) {
                                z = false;
                            }
                            if (z) {
                                x332.w.writeShort(i3);
                                x332.w.writeInt(ao62.b[i3]);
                            }
                        }
                        x332.w.flush();
                    } else {
                        throw new IOException("closed");
                    }
                } finally {
                }
            }
            int a = p33.M.a();
            if (a != 65535) {
                p33.S.D((long) (a - 65535), 0);
            }
            ac7.c(p33.C.d(), p33.y, 0, p33.T, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        t96 t96 = this.c;
        sb.append(t96.a.h.d);
        sb.append(':');
        sb.append(t96.a.h.e);
        sb.append(", proxy=");
        sb.append(t96.b);
        sb.append(" hostAddress=");
        sb.append(t96.c);
        sb.append(" cipherSuite=");
        jy2 jy2 = this.f;
        if (jy2 != null) {
            obj = jy2.b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
