package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Arrays;

/* renamed from: h33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h33 implements w72 {
    public static final bz2 f;
    public final d45 a;
    public final v72 b;
    public final wr0 c;
    public int d;
    public final cp0 e;

    static {
        bz2 bz2 = bz2.x;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            int length = strArr2.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                if (strArr2[i2] != null) {
                    strArr2[i2] = d57.k1(strArr[i2]).toString();
                    i2++;
                } else {
                    h.q("Headers cannot be null");
                    return;
                }
            }
            int m = wn6.m(0, strArr2.length - 1, 2);
            if (m >= 0) {
                while (true) {
                    String str = strArr2[i];
                    String str2 = strArr2[i + 1];
                    za5.u(str);
                    za5.v(str2, str);
                    if (i == m) {
                        break;
                    }
                    i += 2;
                }
            }
            f = new bz2(strArr2);
            return;
        }
        h.q("Expected alternating header names and values");
    }

    public h33(d45 d45, v72 v72, wr0 wr0) {
        wr0.getClass();
        this.a = d45;
        this.b = v72;
        this.c = wr0;
        this.e = new cp0((zw5) wr0.y);
    }

    public final oy6 a(a66 a66) {
        kd6 kd6 = a66.w;
        if (!a53.a(a66)) {
            return k((g73) kd6.x, 0);
        }
        String f2 = a66.B.f("Transfer-Encoding");
        if (f2 == null) {
            f2 = null;
        }
        if ("chunked".equalsIgnoreCase(f2)) {
            g73 g73 = (g73) kd6.x;
            if (this.d == 4) {
                this.d = 5;
                return new d33(this, g73);
            }
            ku4.q(this.d, "state: ");
            return null;
        }
        long e2 = fg8.e(a66);
        if (e2 != -1) {
            return k((g73) kd6.x, e2);
        }
        g73 g732 = (g73) kd6.x;
        if (this.d == 4) {
            this.d = 5;
            this.b.e();
            g732.getClass();
            return new b33(this, g732);
        }
        ku4.q(this.d, "state: ");
        return null;
    }

    public final void b() {
        ((yw5) this.c.z).flush();
    }

    public final boolean c() {
        if (this.d == 6) {
            return true;
        }
        return false;
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final long d(a66 a66) {
        if (!a53.a(a66)) {
            return 0;
        }
        String f2 = a66.B.f("Transfer-Encoding");
        if (f2 == null) {
            f2 = null;
        }
        if ("chunked".equalsIgnoreCase(f2)) {
            return -1;
        }
        return fg8.e(a66);
    }

    public final void e(kd6 kd6) {
        kd6.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) kd6.y);
        sb.append(' ');
        g73 g73 = (g73) kd6.x;
        if (sg3.e(g73.a, "https") || type != Proxy.Type.HTTP) {
            String b2 = g73.b();
            String d2 = g73.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            sb.append(b2);
        } else {
            sb.append(g73);
        }
        sb.append(" HTTP/1.1");
        l((bz2) kd6.z, sb.toString());
    }

    public final z56 f(boolean z) {
        cp0 cp0 = this.e;
        int i = this.d;
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            try {
                String H = ((ed0) cp0.y).H(cp0.x);
                cp0.x -= (long) H.length();
                ig p = ub5.p(H);
                int i2 = p.b;
                z56 z56 = new z56();
                z56.b = (gu5) p.c;
                z56.c = i2;
                z56.d = (String) p.d;
                z56.f = cp0.h().k();
                if (z && i2 == 100) {
                    return null;
                }
                if (i2 == 100) {
                    this.d = 3;
                    return z56;
                } else if (102 > i2 || i2 >= 200) {
                    this.d = 4;
                    return z56;
                } else {
                    this.d = 3;
                    return z56;
                }
            } catch (EOFException e2) {
                throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.g()), e2);
            }
        } else {
            ku4.q(this.d, "state: ");
            return null;
        }
    }

    public final void g() {
        ((yw5) this.c.z).flush();
    }

    public final dy6 h() {
        return this.c;
    }

    public final v72 i() {
        return this.b;
    }

    public final tu6 j(kd6 kd6, long j) {
        kd6.getClass();
        f56 f56 = (f56) kd6.A;
        if (f56 != null && f56.c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if ("chunked".equalsIgnoreCase(((bz2) kd6.z).f("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new c33(this);
            }
            ku4.q(this.d, "state: ");
            return null;
        } else if (j == -1) {
            h.s("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        } else if (this.d == 1) {
            this.d = 2;
            return new f33(this);
        } else {
            ku4.q(this.d, "state: ");
            return null;
        }
    }

    public final e33 k(g73 g73, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new e33(this, g73, j);
        }
        ku4.q(this.d, "state: ");
        return null;
    }

    public final void l(bz2 bz2, String str) {
        bz2.getClass();
        if (this.d == 0) {
            wr0 wr0 = this.c;
            yw5 yw5 = (yw5) wr0.z;
            yw5.N(str);
            yw5.N("\r\n");
            int size = bz2.size();
            int i = 0;
            while (true) {
                yw5 yw52 = (yw5) wr0.z;
                if (i < size) {
                    yw52.N(bz2.g(i));
                    yw52.N(": ");
                    yw52.N(bz2.l(i));
                    yw52.N("\r\n");
                    i++;
                } else {
                    yw52.N("\r\n");
                    this.d = 1;
                    return;
                }
            }
        } else {
            ku4.q(this.d, "state: ");
        }
    }
}
