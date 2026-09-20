package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: q33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q33 implements w72 {
    public static final List g = fg8.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = fg8.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final ex5 a;
    public final lx5 b;
    public final p33 c;
    public volatile w33 d;
    public final gu5 e;
    public volatile boolean f;

    public q33(d45 d45, ex5 ex5, lx5 lx5, p33 p33) {
        d45.getClass();
        p33.getClass();
        this.a = ex5;
        this.b = lx5;
        this.c = p33;
        List list = d45.r;
        gu5 gu5 = gu5.H2_PRIOR_KNOWLEDGE;
        this.e = !list.contains(gu5) ? gu5.HTTP_2 : gu5;
    }

    public final oy6 a(a66 a66) {
        w33 w33 = this.d;
        w33.getClass();
        return w33.D;
    }

    public final void b() {
        w33 w33 = this.d;
        w33.getClass();
        w33.E.close();
    }

    public final boolean c() {
        boolean z;
        w33 w33 = this.d;
        if (w33 != null) {
            synchronized (w33) {
                u33 u33 = w33.D;
                if (!u33.x || !u33.z.x()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void cancel() {
        this.f = true;
        w33 w33 = this.d;
        if (w33 != null) {
            w33.f(k62.D);
        }
    }

    public final long d(a66 a66) {
        if (!a53.a(a66)) {
            return 0;
        }
        return fg8.e(a66);
    }

    public final void e(kd6 kd6) {
        boolean z;
        int i;
        w33 w33;
        kd6.getClass();
        if (this.d == null) {
            boolean z2 = false;
            if (((f56) kd6.A) != null) {
                z = true;
            } else {
                z = false;
            }
            bz2 bz2 = (bz2) kd6.z;
            ArrayList arrayList = new ArrayList(bz2.size() + 4);
            arrayList.add(new vy2(vy2.f, (String) kd6.y));
            dg0 dg0 = vy2.g;
            g73 g73 = (g73) kd6.x;
            g73.getClass();
            String b2 = g73.b();
            String d2 = g73.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            arrayList.add(new vy2(dg0, b2));
            String f2 = bz2.f("Host");
            if (f2 != null) {
                arrayList.add(new vy2(vy2.i, f2));
            }
            arrayList.add(new vy2(vy2.h, g73.a));
            int size = bz2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String g2 = bz2.g(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = g2.toLowerCase(locale);
                lowerCase.getClass();
                if (!g.contains(lowerCase) || (lowerCase.equals("te") && bz2.l(i2).equals("trailers"))) {
                    arrayList.add(new vy2(lowerCase, bz2.l(i2)));
                }
            }
            p33 p33 = this.c;
            p33.getClass();
            boolean z3 = !z;
            synchronized (p33.S) {
                try {
                    synchronized (p33) {
                        if (p33.A > 1073741823) {
                            p33.o(k62.C);
                        }
                        if (!p33.B) {
                            i = p33.A;
                            p33.A = i + 2;
                            w33 = new w33(i, p33, z3, false, (bz2) null);
                            if (!z || p33.P >= p33.Q || w33.z >= w33.A) {
                                z2 = true;
                            }
                            if (w33.j()) {
                                p33.x.put(Integer.valueOf(i), w33);
                            }
                        } else {
                            throw new IOException();
                        }
                    }
                    p33.S.u(z3, i, arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                p33.S.flush();
            }
            this.d = w33;
            boolean z4 = this.f;
            w33 w332 = this.d;
            if (!z4) {
                w332.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                w332.F.g((long) this.b.g, timeUnit);
                w33 w333 = this.d;
                w333.getClass();
                w333.G.g((long) this.b.h, timeUnit);
                return;
            }
            w332.getClass();
            w332.f(k62.D);
            rf2.i("Canceled");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r4 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r3 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.F.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0046 */
    public final z56 f(boolean z) {
        bz2 bz2;
        boolean z2;
        w33 w33 = this.d;
        if (w33 != null) {
            synchronized (w33) {
                while (true) {
                    boolean z3 = false;
                    if (w33.B.isEmpty() && w33.g() == null) {
                        if (!z) {
                            w33.x.getClass();
                            t33 t33 = w33.E;
                            if (!t33.y) {
                                if (!t33.w) {
                                    z2 = false;
                                }
                            }
                            z2 = true;
                        }
                        z3 = true;
                        if (z3) {
                            w33.F.h();
                        }
                        w33.wait();
                        if (z3) {
                            w33.F.l();
                        }
                    }
                }
                if (!w33.B.isEmpty()) {
                    Object removeFirst = w33.B.removeFirst();
                    removeFirst.getClass();
                    bz2 = (bz2) removeFirst;
                } else {
                    Throwable th = w33.I;
                    if (th == null) {
                        k62 g2 = w33.g();
                        g2.getClass();
                        th = new StreamResetException(g2);
                    }
                    throw th;
                }
            }
            gu5 gu5 = this.e;
            gu5.getClass();
            ArrayList arrayList = new ArrayList(20);
            int size = bz2.size();
            ig igVar = null;
            for (int i = 0; i < size; i++) {
                String g3 = bz2.g(i);
                String l = bz2.l(i);
                if (g3.equals(":status")) {
                    igVar = ub5.p("HTTP/1.1 ".concat(l));
                } else if (!h.contains(g3)) {
                    arrayList.add(g3);
                    arrayList.add(d57.k1(l).toString());
                }
            }
            if (igVar != null) {
                z56 z56 = new z56();
                z56.b = gu5;
                z56.c = igVar.b;
                z56.d = (String) igVar.d;
                z56.f = new bz2((String[]) arrayList.toArray(new String[0])).k();
                if (!z || z56.c != 100) {
                    return z56;
                }
                return null;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        rf2.i("stream wasn't created");
        return null;
    }

    public final void g() {
        this.c.flush();
    }

    public final dy6 h() {
        w33 w33 = this.d;
        w33.getClass();
        return w33;
    }

    public final v72 i() {
        return this.a;
    }

    public final tu6 j(kd6 kd6, long j) {
        kd6.getClass();
        w33 w33 = this.d;
        w33.getClass();
        return w33.E;
    }
}
