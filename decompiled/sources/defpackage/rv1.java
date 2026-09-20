package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: rv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rv1 implements Closeable, Flushable {
    public static final k26 M = new k26("[a-z0-9_-]{1,120}");
    public final ae5 A;
    public final LinkedHashMap B;
    public final ig0 C;
    public long D;
    public int E;
    public yw5 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final qv1 L;
    public final ae5 w;
    public final long x;
    public final ae5 y;
    public final ae5 z;

    public rv1(long j, h81 h81, nd2 nd2, ae5 ae5) {
        this.w = ae5;
        this.x = j;
        if (j > 0) {
            this.y = ae5.d("journal");
            this.z = ae5.d("journal.tmp");
            this.A = ae5.d("journal.bkp");
            this.B = new LinkedHashMap(0, 0.75f, true);
            this.C = gl0.E(rc9.D0(b85.d(), h81.n0(1)));
            this.L = new qv1(nd2);
            return;
        }
        h.q("maxSize <= 0");
        throw null;
    }

    public static void L(String str) {
        if (!M.e(str)) {
            h.j(pb4.h('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        if (r2 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    public static final void a(rv1 rv1, l90 l90, boolean z2) {
        long j;
        synchronized (rv1) {
            ov1 ov1 = (ov1) l90.b;
            if (sg3.e(ov1.g, l90)) {
                boolean z3 = false;
                if (!z2 || ov1.f) {
                    for (int i = 0; i < 2; i++) {
                        rv1.L.u((ae5) ov1.d.get(i));
                    }
                } else {
                    int i2 = 0;
                    while (i2 < 2) {
                        if (!((boolean[]) l90.c)[i2] || rv1.L.v((ae5) ov1.d.get(i2))) {
                            i2++;
                        } else {
                            l90.a(false);
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < 2; i3++) {
                        ae5 ae5 = (ae5) ov1.d.get(i3);
                        ae5 ae52 = (ae5) ov1.c.get(i3);
                        boolean v = rv1.L.v(ae5);
                        qv1 qv1 = rv1.L;
                        if (v) {
                            qv1.k(ae5, ae52);
                        } else {
                            ae5 ae53 = (ae5) ov1.c.get(i3);
                            if (!qv1.v(ae53)) {
                                i.a(qv1.I(ae53));
                            }
                        }
                        long j2 = ov1.b[i3];
                        Long l = (Long) rv1.L.D(ae52).e;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        ov1.b[i3] = j;
                        rv1.D = (rv1.D - j2) + j;
                    }
                }
                ov1.g = null;
                if (ov1.f) {
                    rv1.G(ov1);
                    return;
                }
                rv1.E++;
                yw5 yw5 = rv1.F;
                yw5.getClass();
                if (!z2) {
                    if (!ov1.e) {
                        rv1.B.remove(ov1.a);
                        yw5.N("REMOVE");
                        yw5.writeByte(32);
                        yw5.N(ov1.a);
                        yw5.writeByte(10);
                        yw5.flush();
                        if (rv1.D <= rv1.x) {
                            if (rv1.E >= 2000) {
                                z3 = true;
                            }
                        }
                        rv1.u();
                    }
                }
                ov1.e = true;
                yw5.N("CLEAN");
                yw5.writeByte(32);
                yw5.N(ov1.a);
                for (long k : ov1.b) {
                    yw5.writeByte(32);
                    yw5.k(k);
                }
                yw5.writeByte(10);
                yw5.flush();
                if (rv1.D <= rv1.x) {
                }
                rv1.u();
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final void B() {
        Iterator it = this.B.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            ov1 ov1 = (ov1) it.next();
            int i = 0;
            if (ov1.g == null) {
                while (i < 2) {
                    j += ov1.b[i];
                    i++;
                }
            } else {
                ov1.g = null;
                while (i < 2) {
                    qv1 qv1 = this.L;
                    qv1.u((ae5) ov1.c.get(i));
                    qv1.u((ae5) ov1.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.D = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r11.E = r0 - r11.B.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (r3.x() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r11.F = v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        r11 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0066=Splitter:B:17:0x0066, B:26:0x0086=Splitter:B:26:0x0086} */
    public final void D() {
        oy6 L2 = this.L.L(this.y);
        L2.getClass();
        zw5 zw5 = new zw5(L2);
        try {
            String H2 = zw5.H(Long.MAX_VALUE);
            String H3 = zw5.H(Long.MAX_VALUE);
            String H4 = zw5.H(Long.MAX_VALUE);
            String H5 = zw5.H(Long.MAX_VALUE);
            String H6 = zw5.H(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(H2) || !"1".equals(H3) || !sg3.e(String.valueOf(1), H4) || !sg3.e(String.valueOf(2), H5) || H6.length() > 0) {
                throw new IOException("unexpected journal header: [" + H2 + ", " + H3 + ", " + H4 + ", " + H5 + ", " + H6 + ']');
            }
            int i = 0;
            while (true) {
                E(zw5.H(Long.MAX_VALUE));
                i++;
            }
            if (th != null) {
                throw th;
            }
        } catch (Throwable th) {
            su0.b(th, th);
        }
    }

    public final void E(String str) {
        String str2;
        int F0 = d57.F0(str, ' ', 0, 6);
        if (F0 != -1) {
            int i = F0 + 1;
            int F02 = d57.F0(str, ' ', i, 4);
            LinkedHashMap linkedHashMap = this.B;
            if (F02 == -1) {
                str2 = str.substring(i);
                if (F0 == 6 && k57.u0(str, "REMOVE", false)) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, F02);
            }
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new ov1(this, str2);
                linkedHashMap.put(str2, obj);
            }
            ov1 ov1 = (ov1) obj;
            if (F02 != -1 && F0 == 5 && k57.u0(str, "CLEAN", false)) {
                List X0 = d57.X0(str.substring(F02 + 1), new char[]{' '});
                ov1.e = true;
                ov1.g = null;
                if (X0.size() == 2) {
                    try {
                        int size = X0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ov1.b[i2] = Long.parseLong((String) X0.get(i2));
                        }
                    } catch (NumberFormatException unused) {
                        kj6.p("unexpected journal line: ", X0);
                    }
                } else {
                    kj6.p("unexpected journal line: ", X0);
                }
            } else if (F02 == -1 && F0 == 5 && k57.u0(str, "DIRTY", false)) {
                ov1.g = new l90(this, ov1);
            } else if (F02 != -1 || F0 != 4 || !k57.u0(str, "READ", false)) {
                rf2.i("unexpected journal line: ".concat(str));
            }
        } else {
            rf2.i("unexpected journal line: ".concat(str));
        }
    }

    public final void G(ov1 ov1) {
        yw5 yw5;
        int i = ov1.h;
        String str = ov1.a;
        if (i > 0 && (yw5 = this.F) != null) {
            yw5.N("DIRTY");
            yw5.writeByte(32);
            yw5.N(str);
            yw5.writeByte(10);
            yw5.flush();
        }
        if (ov1.h > 0 || ov1.g != null) {
            ov1.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.L.u((ae5) ov1.c.get(i2));
            long j = this.D;
            long[] jArr = ov1.b;
            this.D = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.E++;
        yw5 yw52 = this.F;
        if (yw52 != null) {
            yw52.N("REMOVE");
            yw52.writeByte(32);
            yw52.N(str);
            yw52.writeByte(10);
        }
        this.B.remove(str);
        if (this.E >= 2000) {
            u();
        }
    }

    public final void I() {
        while (this.D > this.x) {
            for (ov1 ov1 : this.B.values()) {
                if (!ov1.f) {
                    G(ov1);
                }
            }
            return;
        }
        this.J = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5 A[Catch:{ all -> 0x006f, all -> 0x009e, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de A[SYNTHETIC, Splitter:B:42:0x00de] */
    public final synchronized void M() {
        yw5 yw5;
        Throwable th;
        try {
            yw5 yw52 = this.F;
            if (yw52 != null) {
                yw52.close();
            }
            tu6 I2 = this.L.I(this.z);
            I2.getClass();
            yw5 = new yw5(I2);
            yw5.N("libcore.io.DiskLruCache");
            yw5.writeByte(10);
            yw5.N("1");
            yw5.writeByte(10);
            yw5.k(1);
            yw5.writeByte(10);
            yw5.k(2);
            yw5.writeByte(10);
            yw5.writeByte(10);
            for (ov1 ov1 : this.B.values()) {
                if (ov1.g != null) {
                    yw5.N("DIRTY");
                    yw5.writeByte(32);
                    yw5.N(ov1.a);
                    yw5.writeByte(10);
                } else {
                    yw5.N("CLEAN");
                    yw5.writeByte(32);
                    yw5.N(ov1.a);
                    for (long k : ov1.b) {
                        yw5.writeByte(32);
                        yw5.k(k);
                    }
                    yw5.writeByte(10);
                }
            }
            try {
                yw5.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        if (th != null) {
            boolean v = this.L.v(this.y);
            qv1 qv1 = this.L;
            if (v) {
                qv1.k(this.y, this.A);
                this.L.k(this.z, this.y);
                this.L.u(this.A);
            } else {
                qv1.k(this.z, this.y);
            }
            this.F = v();
            this.E = 0;
            this.G = false;
            this.K = false;
        } else {
            throw th;
        }
        return;
        th = th;
        if (th != null) {
        }
    }

    public final synchronized void close() {
        try {
            if (this.H) {
                if (!this.I) {
                    for (ov1 ov1 : (ov1[]) this.B.values().toArray(new ov1[0])) {
                        l90 l90 = ov1.g;
                        if (l90 != null) {
                            ov1 ov12 = (ov1) l90.b;
                            if (sg3.e(ov12.g, l90)) {
                                ov12.f = true;
                            }
                        }
                    }
                    I();
                    gl0.J(this.C, (CancellationException) null);
                    yw5 yw5 = this.F;
                    yw5.getClass();
                    yw5.close();
                    this.F = null;
                    this.I = true;
                    return;
                }
            }
            this.I = true;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void flush() {
        if (this.H) {
            if (!this.I) {
                I();
                yw5 yw5 = this.F;
                yw5.getClass();
                yw5.flush();
                return;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized l90 k(String str) {
        l90 l90;
        if (!this.I) {
            L(str);
            o();
            ov1 ov1 = (ov1) this.B.get(str);
            if (ov1 != null) {
                l90 = ov1.g;
            } else {
                l90 = null;
            }
            if (l90 != null) {
                return null;
            }
            if (ov1 != null) {
                if (ov1.h != 0) {
                    return null;
                }
            }
            if (!this.J) {
                if (!this.K) {
                    yw5 yw5 = this.F;
                    yw5.getClass();
                    yw5.N("DIRTY");
                    yw5.writeByte(32);
                    yw5.N(str);
                    yw5.writeByte(10);
                    yw5.flush();
                    if (this.G) {
                        return null;
                    }
                    if (ov1 == null) {
                        ov1 = new ov1(this, str);
                        this.B.put(str, ov1);
                    }
                    l90 l902 = new l90(this, ov1);
                    ov1.g = l902;
                    return l902;
                }
            }
            u();
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        return null;
     */
    public final synchronized pv1 l(String str) {
        if (!this.I) {
            L(str);
            o();
            ov1 ov1 = (ov1) this.B.get(str);
            if (ov1 != null) {
                pv1 a = ov1.a();
                if (a != null) {
                    boolean z2 = true;
                    this.E++;
                    yw5 yw5 = this.F;
                    yw5.getClass();
                    yw5.N("READ");
                    yw5.writeByte(32);
                    yw5.N(str);
                    yw5.writeByte(10);
                    if (this.E < 2000) {
                        z2 = false;
                    }
                    if (z2) {
                        u();
                    }
                }
            }
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void o() {
        try {
            if (!this.H) {
                this.L.u(this.z);
                if (this.L.v(this.A)) {
                    boolean v = this.L.v(this.y);
                    qv1 qv1 = this.L;
                    ae5 ae5 = this.A;
                    if (v) {
                        qv1.u(ae5);
                    } else {
                        qv1.k(ae5, this.y);
                    }
                }
                if (this.L.v(this.y)) {
                    D();
                    B();
                    this.H = true;
                    return;
                }
                M();
                this.H = true;
            }
        } catch (IOException unused) {
            close();
            pv8.w(this.L, this.w);
            this.I = false;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void u() {
        ar7.H(this.C, (e81) null, (r81) null, new f70(this, (f61) null, 4), 3);
    }

    public final yw5 v() {
        qv1 qv1 = this.L;
        qv1.getClass();
        ae5 ae5 = this.y;
        ae5.getClass();
        return new yw5(new xb2(qv1.x.a(ae5), new gg0(20, (Object) this)));
    }
}
