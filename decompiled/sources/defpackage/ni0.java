package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.ConnectionShutdownException;

/* renamed from: ni0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ni0 implements if3 {
    public static final ni0 b = new ni0(0);
    public static final ni0 c = new ni0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ni0(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: f56} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static kd6 b(a66 a66, u72 u72, lx5 lx5) {
        t96 t96;
        f73 f73;
        g73 g73;
        f56 f56;
        a66 a662;
        f56 f562 = null;
        if (u72 != null) {
            t96 = u72.e().c;
        } else {
            t96 = null;
        }
        int i = a66.z;
        kd6 kd6 = a66.w;
        String str = (String) kd6.y;
        boolean z = false;
        if (!(i == 307 || i == 308)) {
            if (i != 401) {
                if (i == 421) {
                    f56 f563 = (f56) kd6.A;
                    if ((f563 == null || !(f563 instanceof k47)) && u72 != null && !sg3.e(((x72) u72.d).h().i.h.d, ((w72) u72.e).i().h().a.h.d)) {
                        ex5 e = u72.e();
                        synchronized (e) {
                            e.k = true;
                        }
                        return a66.w;
                    }
                } else if (i == 503) {
                    a66 a663 = a66.G;
                    if ((a663 == null || a663.z != 503) && d(a66, Integer.MAX_VALUE) == 0) {
                        return a66.w;
                    }
                } else if (i == 407) {
                    t96.getClass();
                    if (t96.b.type() == Proxy.Type.HTTP) {
                        lx5.o.getClass();
                        return null;
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                    }
                } else if (lx5.q && (((f56 = (f56) kd6.A) == null || !(f56 instanceof k47)) && (((a662 = a66.G) == null || a662.z != 408) && d(a66, 0) <= 0))) {
                    return a66.w;
                }
                return null;
            }
            lx5.i.getClass();
            return null;
        }
        if (lx5.a.w.h) {
            String f = a66.B.f("Location");
            if (f == null) {
                f = null;
            }
            kd6 kd62 = a66.w;
            if (f != null) {
                g73 g732 = (g73) kd62.x;
                g732.getClass();
                try {
                    f73 = new f73(0);
                    f73.f(g732, f);
                } catch (IllegalArgumentException unused) {
                    f73 = null;
                }
                if (f73 != null) {
                    g73 = f73.c();
                } else {
                    g73 = null;
                }
                if (g73 != null && (sg3.e(g73.a, ((g73) kd62.x).a) || lx5.a.w.i)) {
                    o9 q0 = kd62.q0();
                    if (gw8.H(str)) {
                        int i2 = a66.z;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            z = true;
                        }
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            if (z) {
                                f562 = kd62.A;
                            }
                            q0.G(str, f562);
                        } else {
                            q0.G("GET", (f56) null);
                        }
                        if (!z) {
                            ((zy2) q0.z).b("Transfer-Encoding");
                            ((zy2) q0.z).b("Content-Length");
                            ((zy2) q0.z).b("Content-Type");
                        }
                    }
                    if (!fg8.a((g73) kd62.x, g73)) {
                        ((zy2) q0.z).b("Authorization");
                    }
                    q0.x = g73;
                    return new kd6(q0);
                }
            }
        }
        return null;
    }

    public static boolean c(IOException iOException, dx5 dx5, lx5 lx5, kd6 kd6) {
        ex5 ex5;
        f56 f56;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!lx5.q) {
            return false;
        }
        if ((!z && (((f56 = (f56) kd6.A) != null && (f56 instanceof k47)) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        u72 u72 = dx5.O;
        if (u72 == null || !u72.b) {
            return false;
        }
        x72 x72 = dx5.E;
        x72.getClass();
        px5 h = x72.h();
        u72 u722 = dx5.O;
        if (u722 != null) {
            ex5 = u722.e();
        } else {
            ex5 = null;
        }
        if (h.a(ex5)) {
            return true;
        }
        return false;
    }

    public static int d(a66 a66, int i) {
        String f = a66.B.f("Retry-After");
        if (f == null) {
            f = null;
        }
        if (f == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(f).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(f);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v46, resolved type: z56} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v50, resolved type: z56} */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0683, code lost:
        if (r0.c() == false) goto L_0x0685;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07c3, code lost:
        if ("close".equalsIgnoreCase(r5) != false) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ae, code lost:
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01af, code lost:
        r0 = th;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x06f0 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0702 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0732 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0735 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0738 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0751 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0766 A[ADDED_TO_REGION, Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x07b4 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07e4 A[Catch:{ IOException -> 0x06cf }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x07e5 A[Catch:{ IOException -> 0x06cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0812  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x070b A[SYNTHETIC] */
    public final a66 a(lx5 lx5) {
        boolean z;
        boolean z2;
        boolean z3;
        IOException iOException;
        z56 z56;
        a66 a2;
        int i;
        boolean z4;
        boolean z5;
        a66 a66;
        kd6 kd6;
        String str;
        boolean z6;
        z56 z562;
        boolean z7;
        boolean z8;
        z56 z563;
        z56 i2;
        w72 w72;
        boolean z9;
        String str2;
        a66 a662;
        bz2 bz2;
        dx5 dx5;
        dx5 dx52;
        List<Exception> list;
        boolean z10;
        a66 a663;
        a66 a3;
        boolean z11;
        sm0 sm0;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        x72 x72;
        lx5 lx52 = lx5;
        switch (this.a) {
            case b85.b:
                u72 u72 = lx52.d;
                u72.getClass();
                kd6 kd62 = lx52.e;
                f56 f56 = (f56) kd62.A;
                long currentTimeMillis = System.currentTimeMillis();
                if (!gw8.H((String) kd62.y) || f56 == null) {
                    z = false;
                } else {
                    z = true;
                }
                boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(((bz2) kd62.z).f("Connection"));
                try {
                    ((dx5) u72.c).A.getClass();
                    ((w72) u72.e).e(kd62);
                    ((dx5) u72.c).A.getClass();
                    if (z) {
                        try {
                            String f = ((bz2) kd62.z).f("Expect");
                            if ("100-continue".equalsIgnoreCase(f)) {
                                try {
                                    ((w72) u72.e).g();
                                    i2 = u72.i(true);
                                } catch (IOException e) {
                                    ((dx5) u72.c).A.getClass();
                                    u72.k(e);
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    z56 = null;
                                    z3 = true;
                                    z2 = true;
                                    if (e instanceof ConnectionShutdownException) {
                                    }
                                }
                                try {
                                    ((dx5) u72.c).A.getClass();
                                    z563 = i2;
                                    z3 = false;
                                    z562 = i2;
                                } catch (IOException e3) {
                                    e = e3;
                                    z56 = i2;
                                    z3 = true;
                                    z2 = true;
                                    if (e instanceof ConnectionShutdownException) {
                                    }
                                }
                            } else {
                                z563 = null;
                                z3 = true;
                                z562 = f;
                            }
                            if (z56 == null) {
                                try {
                                    boolean z12 = z562;
                                    boolean c2 = f56.c();
                                    if (c2) {
                                        try {
                                            z12 = c2;
                                            ((w72) u72.e).g();
                                            z12 = true;
                                            f56.d(new yw5(u72.b(kd62, true)));
                                        } catch (IOException e4) {
                                            ((dx5) u72.c).A.getClass();
                                            u72.k(e4);
                                            throw e4;
                                        } catch (IOException e5) {
                                            e = e5;
                                            z8 = z12;
                                            z2 = z8;
                                            if (e instanceof ConnectionShutdownException) {
                                            }
                                        }
                                    } else {
                                        z12 = true;
                                        yw5 yw5 = new yw5(u72.b(kd62, false));
                                        f56.d(yw5);
                                        yw5.close();
                                    }
                                    z2 = z12;
                                } catch (IOException e6) {
                                    e = e6;
                                    z8 = true;
                                    z2 = z8;
                                    if (e instanceof ConnectionShutdownException) {
                                    }
                                }
                            } else {
                                z2 = true;
                                try {
                                    ((dx5) u72.c).i(u72, true, false, false, false, (IOException) null);
                                    if (u72.e().i != null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (!z7) {
                                        ((w72) u72.e).i().e();
                                    }
                                } catch (IOException e7) {
                                    ((dx5) u72.c).A.getClass();
                                    u72.k(e7);
                                    throw e7;
                                } catch (IOException e8) {
                                    e = e8;
                                    if (e instanceof ConnectionShutdownException) {
                                        throw e;
                                    } else if (u72.b) {
                                        iOException = e;
                                        if (z56 == null) {
                                        }
                                        z56.a = kd62;
                                        z56.e = u72.e().f;
                                        z56.l = currentTimeMillis;
                                        z56.m = System.currentTimeMillis();
                                        a2 = z56.a();
                                        i = a2.z;
                                        while (true) {
                                            if (i != 100) {
                                            }
                                            z56 i3 = u72.i(false);
                                            i3.getClass();
                                            if (!z3) {
                                            }
                                            i3.a = kd62;
                                            i3.e = u72.e().f;
                                            i3.l = currentTimeMillis;
                                            i3.m = System.currentTimeMillis();
                                            a2 = i3.a();
                                            i = a2.z;
                                        }
                                        ((dx5) u72.c).A.getClass();
                                        if (i != 101) {
                                        }
                                        if (z4) {
                                        }
                                        if (z4) {
                                        }
                                        z5 = false;
                                        if (equalsIgnoreCase) {
                                        }
                                        ox5 h = u72.h(a2);
                                        z56 a4 = a2.a();
                                        a4.g = h;
                                        a4.o = new d63(22);
                                        a66 = a4.a();
                                        kd6 = a66.w;
                                        kd6.getClass();
                                        if (!"close".equalsIgnoreCase(((bz2) kd6.z).f("Connection"))) {
                                        }
                                        ((w72) u72.e).i().e();
                                        if ((i == 204 || i == 205) && a66.C.a() <= 0) {
                                        }
                                    } else {
                                        throw e;
                                    }
                                }
                            }
                        } catch (IOException e9) {
                            e = e9;
                            z2 = true;
                            z56 = null;
                            z3 = z2;
                            if (e instanceof ConnectionShutdownException) {
                            }
                        }
                    } else {
                        z2 = true;
                        ((dx5) u72.c).i(u72, true, false, false, false, (IOException) null);
                        z56 = null;
                        z3 = true;
                    }
                    if (f56 != null) {
                        break;
                    }
                    ((w72) u72.e).b();
                    iOException = null;
                } catch (IOException e10) {
                    z2 = true;
                    ((dx5) u72.c).A.getClass();
                    u72.k(e10);
                    throw e10;
                } catch (IOException e11) {
                    e = e11;
                    z56 = null;
                    z3 = z2;
                    if (e instanceof ConnectionShutdownException) {
                    }
                }
                if (z56 == null) {
                    try {
                        z56 = u72.i(false);
                        z56.getClass();
                        if (z3) {
                            ((dx5) u72.c).A.getClass();
                            z3 = false;
                        }
                    } catch (IOException e12) {
                        if (iOException != null) {
                            su0.b(iOException, e12);
                            throw iOException;
                        }
                        throw e12;
                    }
                }
                z56.a = kd62;
                z56.e = u72.e().f;
                z56.l = currentTimeMillis;
                z56.m = System.currentTimeMillis();
                a2 = z56.a();
                i = a2.z;
                while (true) {
                    if (i != 100) {
                        if (102 > i || i >= 200) {
                            ((dx5) u72.c).A.getClass();
                        }
                    }
                    z56 i32 = u72.i(false);
                    i32.getClass();
                    if (!z3) {
                        ((dx5) u72.c).A.getClass();
                    }
                    i32.a = kd62;
                    i32.e = u72.e().f;
                    i32.l = currentTimeMillis;
                    i32.m = System.currentTimeMillis();
                    a2 = i32.a();
                    i = a2.z;
                }
                ((dx5) u72.c).A.getClass();
                if (i != 101) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (u72.e().i != null) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                    }
                }
                if (z4) {
                    String f2 = a2.B.f("Connection");
                    if (f2 == null) {
                        f2 = null;
                    }
                    if ("upgrade".equalsIgnoreCase(f2)) {
                        z5 = z2;
                        if (equalsIgnoreCase || !z5) {
                            ox5 h2 = u72.h(a2);
                            z56 a42 = a2.a();
                            a42.g = h2;
                            a42.o = new d63(22);
                            a66 = a42.a();
                        } else {
                            z56 a5 = a2.a();
                            a5.g = new it7(a2.C.k(), a2.C.a());
                            a5.h = u72.l();
                            a66 = a5.a();
                        }
                        kd6 = a66.w;
                        kd6.getClass();
                        if (!"close".equalsIgnoreCase(((bz2) kd6.z).f("Connection"))) {
                            String f3 = a66.B.f("Connection");
                            if (f3 == null) {
                                str = null;
                            } else {
                                str = f3;
                            }
                            break;
                        }
                        ((w72) u72.e).i().e();
                        if ((i == 204 && i == 205) || a66.C.a() <= 0) {
                            return a66;
                        }
                        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a66.C.a());
                    }
                }
                z5 = false;
                if (equalsIgnoreCase) {
                }
                ox5 h22 = u72.h(a2);
                z56 a422 = a2.a();
                a422.g = h22;
                a422.o = new d63(22);
                a66 = a422.a();
                kd6 = a66.w;
                kd6.getClass();
                if (!"close".equalsIgnoreCase(((bz2) kd6.z).f("Connection"))) {
                }
                ((w72) u72.e).i().e();
                if (!(i == 204 && i == 205) && a66.C.a() <= 0) {
                }
                break;
            case 1:
                dx5 dx53 = lx52.a;
                synchronized (dx53) {
                    if (!dx53.M) {
                        throw new IllegalStateException("released");
                    } else if (dx53.J || dx53.I || dx53.L || dx53.K) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                x72 x722 = dx53.E;
                x722.getClass();
                ex5 f4 = x722.f();
                d45 d45 = dx53.w;
                f4.getClass();
                d45.getClass();
                int i4 = lx52.g;
                wr0 wr0 = f4.h;
                p33 p33 = f4.i;
                if (p33 != null) {
                    w72 = new q33(d45, f4, lx52, p33);
                } else {
                    f4.e.setSoTimeout(i4);
                    ri7 g = ((zw5) wr0.y).w.g();
                    long j = (long) i4;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    g.g(j, timeUnit);
                    ((yw5) wr0.z).w.g().g((long) lx52.h, timeUnit);
                    w72 = new h33(d45, f4, wr0);
                }
                u72 u722 = new u72(dx53, x722, w72);
                dx53.H = u722;
                dx53.O = u722;
                synchronized (dx53) {
                    dx53.I = true;
                    dx53.J = true;
                }
                if (!dx53.N) {
                    return lx5.a(lx52, 0, u722, (kd6) null, 2097149).b(lx52.e);
                }
                rf2.i("Canceled");
                return null;
            case 2:
                s61 s61 = lx52.l;
                kd6 kd63 = lx52.e;
                o9 q0 = kd63.q0();
                g73 g73 = (g73) kd63.x;
                bz2 bz22 = (bz2) kd63.z;
                f56 f562 = (f56) kd63.A;
                String str3 = "Content-Encoding";
                if (f562 != null) {
                    yh4 b2 = f562.b();
                    if (b2 != null) {
                        q0.D("Content-Type", b2.a);
                    }
                    long a6 = f562.a();
                    if (a6 != -1) {
                        q0.D("Content-Length", String.valueOf(a6));
                        ((zy2) q0.z).b("Transfer-Encoding");
                    } else {
                        q0.D("Transfer-Encoding", "chunked");
                        ((zy2) q0.z).b("Content-Length");
                    }
                }
                if (bz22.f("Host") == null) {
                    q0.D("Host", fg8.i(g73, false));
                }
                if (bz22.f("Connection") == null) {
                    q0.D("Connection", "Keep-Alive");
                }
                if (bz22.f("Accept-Encoding") == null && bz22.f("Range") == null) {
                    q0.D("Accept-Encoding", "gzip");
                    z9 = true;
                } else {
                    z9 = false;
                }
                List q = s61.q(g73);
                if (!q.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i5 = 0;
                    for (Object next : q) {
                        int i6 = i5 + 1;
                        if (i5 >= 0) {
                            q61 q61 = (q61) next;
                            if (i5 > 0) {
                                sb.append("; ");
                            }
                            sb.append(q61.a);
                            sb.append('=');
                            sb.append(q61.b);
                            i5 = i6;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                    q0.D("Cookie", sb.toString());
                }
                if (bz22.f("User-Agent") == null) {
                    q0.D("User-Agent", "okhttp/5.4.0");
                }
                kd6 kd64 = new kd6(q0);
                a66 b3 = lx5.b(kd64);
                bz2 bz23 = b3.B;
                a53.b(s61, (g73) kd64.x, bz23);
                z56 a7 = b3.a();
                a7.a = kd64;
                if (z9) {
                    String f5 = bz23.f(str3);
                    if (f5 == null) {
                        f5 = null;
                    }
                    if ("gzip".equalsIgnoreCase(f5) && a53.a(b3)) {
                        by2 by2 = new by2(b3.C.l());
                        zy2 k = bz23.k();
                        k.b(str3);
                        k.b("Content-Length");
                        a7.f = k.a().k();
                        String f6 = bz23.f("Content-Type");
                        if (f6 == null) {
                            str2 = null;
                        } else {
                            str2 = f6;
                        }
                        a7.g = new ox5(str2, -1, new zw5(by2));
                    }
                }
                return a7.a();
            case 3:
                System.currentTimeMillis();
                kd6 kd65 = lx52.e;
                kd65.getClass();
                qc3 qc3 = new qc3(21, (Object) kd65, (Object) null);
                if (kd65.x().j) {
                    qc3 = new qc3(21, (Object) null, (Object) null);
                }
                kd6 kd66 = (kd6) qc3.x;
                a66 a664 = (a66) qc3.y;
                if (kd66 == null && a664 == null) {
                    c66 c66 = d66.w;
                    jv2 jv2 = dl7.l;
                    ArrayList arrayList = new ArrayList(20);
                    kd6 kd67 = lx52.e;
                    kd67.getClass();
                    a66 a665 = new a66(kd67, gu5.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, (jy2) null, new bz2((String[]) arrayList.toArray(new String[0])), c66, (dy6) null, (a66) null, (a66) null, (a66) null, -1, System.currentTimeMillis(), (u72) null, jv2);
                    lx52.a.A.getClass();
                    return a665;
                } else if (kd66 == null) {
                    a664.getClass();
                    z56 a8 = a664.a();
                    a66 x = u55.x(a664);
                    z56.b("cacheResponse", x);
                    a8.j = x;
                    a66 a9 = a8.a();
                    lx52.a.A.getClass();
                    return a9;
                } else {
                    if (a664 != null) {
                        lx52.a.A.getClass();
                    }
                    a66 b4 = lx52.b(kd66);
                    if (a664 != null) {
                        if (b4.z == 304) {
                            z56 a10 = a664.a();
                            bz2 bz24 = a664.B;
                            bz2 bz25 = b4.B;
                            ArrayList arrayList2 = new ArrayList(20);
                            int size = bz24.size();
                            int i7 = 0;
                            while (i7 < size) {
                                String g2 = bz24.g(i7);
                                String l = bz24.l(i7);
                                if ("Warning".equalsIgnoreCase(g2)) {
                                    bz2 = bz24;
                                    if (k57.u0(l, "1", false)) {
                                        i7++;
                                        bz24 = bz2;
                                    }
                                } else {
                                    bz2 = bz24;
                                }
                                if ("Content-Length".equalsIgnoreCase(g2) || "Content-Encoding".equalsIgnoreCase(g2) || "Content-Type".equalsIgnoreCase(g2) || !fd1.P(g2) || bz25.f(g2) == null) {
                                    arrayList2.add(g2);
                                    arrayList2.add(d57.k1(l).toString());
                                    i7++;
                                    bz24 = bz2;
                                } else {
                                    i7++;
                                    bz24 = bz2;
                                }
                            }
                            int size2 = bz25.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                String g3 = bz25.g(i8);
                                if (!"Content-Length".equalsIgnoreCase(g3) && !"Content-Encoding".equalsIgnoreCase(g3) && !"Content-Type".equalsIgnoreCase(g3) && fd1.P(g3)) {
                                    String l2 = bz25.l(i8);
                                    arrayList2.add(g3);
                                    arrayList2.add(d57.k1(l2).toString());
                                }
                            }
                            a10.f = new bz2((String[]) arrayList2.toArray(new String[0])).k();
                            a10.l = b4.H;
                            a10.m = b4.I;
                            a66 x2 = u55.x(a664);
                            z56.b("cacheResponse", x2);
                            a10.j = x2;
                            a66 x3 = u55.x(b4);
                            z56.b("networkResponse", x3);
                            a10.i = x3;
                            a10.a();
                            b4.C.close();
                            throw null;
                        }
                        dg8.b(a664.C);
                    }
                    z56 a11 = b4.a();
                    if (a664 != null) {
                        a662 = u55.x(a664);
                    } else {
                        a662 = null;
                    }
                    z56.b("cacheResponse", a662);
                    a11.j = a662;
                    a66 x4 = u55.x(b4);
                    z56.b("networkResponse", x4);
                    a11.i = x4;
                    return a11.a();
                }
            default:
                kd6 kd68 = lx52.e;
                dx5 dx54 = lx52.a;
                List list2 = a42.w;
                a66 a666 = null;
                int i9 = 0;
                kd6 kd69 = kd68;
                while (true) {
                    boolean z13 = true;
                    while (true) {
                        kd69.getClass();
                        if (dx54.H == null) {
                            synchronized (dx54) {
                                try {
                                    if (dx54.J) {
                                        dx5 dx55 = dx54;
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    } else if (dx54.I || dx54.L || dx54.K) {
                                        dx5 = dx54;
                                        break;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    dx5 = dx54;
                                    throw th;
                                }
                            }
                            if (z13) {
                                d45 d452 = dx54.w;
                                bc7 bc7 = d452.C;
                                int i10 = lx52.g;
                                bc7 bc72 = bc7;
                                int i11 = lx52.h;
                                List list3 = list2;
                                m22 m22 = (m22) lx52.k.x;
                                int i12 = lx52.f;
                                bc7 bc73 = bc72;
                                boolean z14 = lx52.q;
                                boolean z15 = d452.f;
                                g73 g732 = (g73) kd69.x;
                                g732.getClass();
                                if (sg3.e(g732.a, "https")) {
                                    SSLSocketFactory sSLSocketFactory2 = lx52.s;
                                    HostnameVerifier hostnameVerifier2 = lx52.n;
                                    sSLSocketFactory = sSLSocketFactory2;
                                    sm0 = lx52.j;
                                    hostnameVerifier = hostnameVerifier2;
                                } else {
                                    sSLSocketFactory = null;
                                    hostnameVerifier = null;
                                    sm0 = null;
                                }
                                String str4 = g732.d;
                                int i13 = g732.e;
                                yw1 yw1 = lx52.m;
                                SocketFactory socketFactory = lx52.r;
                                g22 g22 = lx52.o;
                                d45 d453 = lx52.a.w;
                                list = list3;
                                boolean z16 = z15;
                                dx5 dx56 = dx54;
                                kd6 kd610 = kd69;
                                bc7 bc74 = bc73;
                                px5 px5 = new px5(bc74, m22, i10, i11, i12, i10, z14, z16, new v9(str4, i13, yw1, socketFactory, sSLSocketFactory, hostnameVerifier, sm0, g22, d453.r, d453.q, lx52.p), dx54.w.B, dx56, kd610);
                                dx52 = dx56;
                                kd69 = kd610;
                                d45 d454 = dx52.w;
                                if (d454.f) {
                                    x72 = new rb2(px5, d454.C);
                                } else {
                                    x72 = new br4(11, (Object) px5);
                                }
                                dx52.E = x72;
                            } else {
                                dx52 = dx54;
                                list = list2;
                            }
                            if (!dx52.N) {
                                try {
                                    z56 a12 = lx52.b(kd69).a();
                                    a12.a = kd69;
                                    if (a666 != null) {
                                        a663 = u55.x(a666);
                                    } else {
                                        a663 = null;
                                    }
                                    a12.k = a663;
                                    a3 = a12.a();
                                    u72 u723 = dx52.H;
                                    kd69 = b(a3, u723, lx52);
                                    if (kd69 == null) {
                                        if (u723 != null && u723.a) {
                                            if (!dx52.G) {
                                                dx52.G = true;
                                                dx52.B.i();
                                            } else {
                                                throw new IllegalStateException("Check failed.");
                                            }
                                        }
                                        try {
                                            dx52.A.getClass();
                                            z11 = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z10 = false;
                                            dx52.g(z10);
                                            throw th;
                                        }
                                    } else {
                                        f56 f563 = (f56) kd69.A;
                                        if (f563 == null || !(f563 instanceof k47)) {
                                            dg8.b(a3.C);
                                            int i14 = i9 + 1;
                                            h72 h72 = dx52.A;
                                            if (i14 <= 20) {
                                                h72.getClass();
                                                dx52.g(true);
                                                a666 = a3;
                                                list2 = list;
                                                dx54 = dx52;
                                                i9 = i14;
                                            } else {
                                                h72.getClass();
                                                throw new ProtocolException("Too many follow-up requests: " + i14);
                                            }
                                        } else {
                                            dx52.A.getClass();
                                            z11 = false;
                                        }
                                    }
                                } catch (IOException e13) {
                                    boolean c3 = c(e13, dx52, lx52, kd69);
                                    dx52.A.getClass();
                                    if (!c3) {
                                        byte[] bArr = dg8.a;
                                        for (Exception b5 : list) {
                                            su0.b(e13, b5);
                                        }
                                        throw e13;
                                    }
                                    list2 = dt0.N0(list, e13);
                                    dx52.g(true);
                                    dx54 = dx52;
                                    z13 = false;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z10 = true;
                                    dx52.g(z10);
                                    throw th;
                                }
                            } else {
                                throw new IOException("Canceled");
                            }
                        } else {
                            h.s("Check failed.");
                            return null;
                        }
                    }
                }
                dx52.g(z11);
                return a3;
        }
    }
}
