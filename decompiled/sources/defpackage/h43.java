package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* renamed from: h43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h43 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ h43(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: d04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: m34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.concurrent.CancellationException] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x040c, code lost:
        if (defpackage.s43.z.decrementAndGet((defpackage.s43) r9) <= 0) goto L_0x040e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x024e  */
    public final Object y(Object obj) {
        d04 d04;
        m34 m34;
        int i = this.w;
        float f = 0.0f;
        boolean z = false;
        boolean z2 = true;
        CancellationException cancellationException = 0;
        vs7 vs7 = vs7.a;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                q43 q43 = (q43) obj2;
                Throwable th = (Throwable) obj;
                if (q43 instanceof s43) {
                    break;
                }
                if (th == null) {
                    q43.close();
                } else {
                    if (th instanceof CancellationException) {
                        cancellationException = (CancellationException) th;
                    }
                    if (cancellationException == 0) {
                        cancellationException = rc9.b("Client scope is canceled", th);
                    }
                    gl0.J(q43, cancellationException);
                }
                return vs7;
            case 1:
                y43 y43 = (y43) obj2;
                j43 j43 = (j43) obj;
                j43.getClass();
                Object obj3 = ((LinkedHashMap) j43.F.d).get(y43.getKey());
                obj3.getClass();
                Object i2 = y43.i((vr2) obj3);
                y43.g(i2, j43);
                ((iz0) j43.D.a(z43.a, new nf1(25))).e(y43.getKey(), i2);
                return vs7;
            case 2:
                j43 j432 = (j43) obj2;
                if (((Throwable) obj) != null) {
                    j432.E.D(qr0.e);
                }
                return vs7;
            case 3:
                w77 w77 = (w77) obj2;
                Throwable th2 = (Throwable) obj;
                cc4 cc4 = b63.a;
                if (th2 != null) {
                    cc4.h("Cancelling request because engine Job failed with error: " + th2);
                    w77.o(rc9.b("Engine failed", th2));
                } else {
                    cc4.h("Cancelling request because engine Job completed");
                    w77.v0();
                }
                return vs7;
            case 4:
                Throwable th3 = (Throwable) obj;
                ((mw1) obj2).b();
                return vs7;
            case 5:
                Throwable th4 = (Throwable) obj;
                ((h27) obj2).o((CancellationException) null);
                return vs7;
            case 6:
                xu4 xu4 = (xu4) obj;
                xu4.getClass();
                int i3 = eu4.C;
                xu4.d = ((qt4) cl6.U(cl6.S(new ot4(5), ((sk3) obj2).b.b.g()))).x.a;
                xu4.e = true;
                xu4.b = true;
                xu4.c = true;
                return vs7;
            case 7:
                return Integer.valueOf(((j04) obj2).c(((Integer) obj).intValue()));
            case 8:
                n04 n04 = (n04) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || n04.c()) && (f2 <= 0.0f || n04.b())) {
                    if (Math.abs(n04.g) > 0.5f) {
                        bc3.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = n04.g + f2;
                    n04.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = n04.g;
                        int C = dh4.C(f4);
                        d04 h = ((d04) n04.e.getValue()).h(C, !n04.b);
                        if (!(h == null || (d04 = n04.c) == null)) {
                            d04 h2 = d04.h(C, true);
                            if (h2 != null) {
                                n04.c = h2;
                            }
                            if (cancellationException == 0) {
                                n04.f(cancellationException, n04.b, true);
                                n04.r.setValue(vs7);
                                n04.h(f4 - n04.g, cancellationException);
                            } else {
                                uy3 uy3 = n04.j;
                                if (uy3 != null) {
                                    uy3.k();
                                }
                                n04.h(f4 - n04.g, n04.g());
                            }
                        }
                        cancellationException = h;
                        if (cancellationException == 0) {
                        }
                    }
                    if (Math.abs(n04.g) > 0.5f) {
                        f2 -= n04.g;
                        n04.g = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 9:
                kw1 kw1 = (kw1) obj;
                return new d9(9, (f24) obj2);
            case 10:
                kw1 kw12 = (kw1) obj;
                return new d9(11, (o24) obj2);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                k34 k34 = (k34) obj2;
                return k34.d1(k34.z, ((Integer) obj).intValue());
            case 12:
                s34 s34 = (s34) obj2;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= 0.0f || s34.c()) && (f5 <= 0.0f || s34.b())) {
                    if (Math.abs(s34.h) > 0.5f) {
                        bc3.c("entered drag with non-zero pending scroll");
                    }
                    s34.d = true;
                    float f6 = s34.h + f5;
                    s34.h = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = s34.h;
                        int round = Math.round(f7);
                        m34 h3 = ((m34) s34.f.getValue()).h(round, !s34.b);
                        if (!(h3 == null || (m34 = s34.c) == null)) {
                            m34 h4 = m34.h(round, true);
                            if (h4 != null) {
                                s34.c = h4;
                            }
                            if (cancellationException == 0) {
                                s34.g(cancellationException, s34.b, true);
                                s34.w.setValue(vs7);
                                s34.k(f7 - s34.h, cancellationException);
                            } else {
                                uy3 uy32 = s34.l;
                                if (uy32 != null) {
                                    uy32.k();
                                }
                                s34.k(f7 - s34.h, s34.j());
                            }
                        }
                        cancellationException = h3;
                        if (cancellationException == 0) {
                        }
                    }
                    if (Math.abs(s34.h) > 0.5f) {
                        f5 -= s34.h;
                        s34.h = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                re6 re6 = (re6) obj2;
                if (re6 != null) {
                    z2 = re6.c(obj);
                }
                return Boolean.valueOf(z2);
            case 14:
                return ((wf4) obj2).g(((Integer) obj).intValue());
            case h75.g /*15*/:
                String str = (String) obj;
                str.getClass();
                return new yb5(o85.v(str), (q51) obj2);
            case 16:
                File file = (File) obj;
                file.getClass();
                return new xn4(((ig0) obj2).x, file);
            case 17:
                Throwable th5 = (Throwable) obj;
                ((qq4) obj2).k((Object) null);
                return vs7;
            case 18:
                yb5 yb5 = (yb5) obj;
                yb5.getClass();
                String lowerCase = d57.k1((String) yb5.w).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                ((is2) obj2).C(lowerCase, (String) yb5.x, Boolean.TRUE, Boolean.FALSE);
                return vs7;
            case 19:
                xz1 xz1 = (xz1) obj2;
                tp1 tp1 = (tp1) obj;
                float d = xz1.b.j.d();
                if (!Float.isNaN(d)) {
                    z = dh4.C(d);
                } else if (!xz1.c()) {
                    z = -tp1.r0(tz1.a);
                }
                return new oe3((z ? 1 : 0) << 32);
            case 20:
                ((bw4) obj2).a.setValue((ew4) obj);
                return vs7;
            case 21:
                nx4 nx4 = (nx4) obj2;
                zs4 zs4 = (zs4) obj;
                zs4.getClass();
                bt4 bt4 = zs4.D;
                qt4 qt4 = zs4.x;
                if (qt4 == null) {
                    qt4 = null;
                }
                if (qt4 == null) {
                    return null;
                }
                bt4.a();
                qt4 c = nx4.c(qt4);
                if (c == null) {
                    return null;
                }
                if (c.equals(qt4)) {
                    return zs4;
                }
                return nx4.b().b(c, c.f(bt4.a()));
            case 22:
                if (((qx4) obj).b == ((hn4) obj2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                nq0 nq0 = (nq0) obj;
                nq0.getClass();
                List list = (List) ((a62) obj2).c;
                list.getClass();
                nq0.b = list;
                return vs7;
            case 24:
                Throwable th6 = (Throwable) obj;
                ((d66) obj2).close();
                return vs7;
            case 25:
                Iterator it = ((r75) obj2).c.iterator();
                while (it.hasNext()) {
                    p75 p75 = (p75) it.next();
                    p75.a.v(obj, p75.b);
                }
                return vs7;
            case 26:
                float floatValue = ((Float) obj).floatValue();
                ob5 ob5 = ((tb5) obj2).b;
                if (ob5.p() != 0) {
                    f = floatValue / ((float) ob5.p());
                }
                ob5.q.e(ob5.j(ob5.k() + dh4.C(f)));
                return vs7;
            case 27:
                ll6 ll6 = (ll6) obj2;
                int intValue = ((Integer) obj).intValue();
                return ll6.f(intValue) + ": " + ll6.h(intValue).a();
            case 28:
                nq0 nq02 = (nq0) obj;
                nq02.getClass();
                nq0.b(nq02, "type", t47.b, 12);
                nq0.b(nq02, "value", b85.g("kotlinx.serialization.Polymorphic<" + ((zk5) obj2).a.A() + '>', pl6.l, new ll6[0]), 12);
                nq02.b = a42.w;
                return vs7;
            default:
                y53 y53 = (y53) obj;
                y53.getClass();
                y63 y63 = new y63();
                y63.b(Long.valueOf(u02.e(((gm5) obj2).c.w)));
                y53.c(y63);
                return vs7;
        }
    }

    public /* synthetic */ h43(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
    }
}
