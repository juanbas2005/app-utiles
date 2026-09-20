package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;

/* renamed from: e73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e73 implements jc2 {
    public static final ah0 f = new ah0(true, true, -1, -1, false, false, false, -1, -1, false, false, false, (String) null);
    public static final ah0 g = new ah0(true, false, -1, -1, false, false, false, -1, -1, true, false, false, (String) null);
    public final String a;
    public final v75 b;
    public final nz3 c;
    public final z97 d;
    public final boolean e;

    public e73(String str, v75 v75, nz3 nz3, z97 z97, boolean z) {
        this.a = str;
        this.b = v75;
        this.c = nz3;
        this.d = z97;
        this.e = z;
    }

    public static String d(String str, yh4 yh4) {
        String str2;
        String b2;
        if (yh4 != null) {
            str2 = yh4.a;
        } else {
            str2 = null;
        }
        if ((str2 == null || k57.u0(str2, "text/plain", false)) && (b2 = i.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b2;
        }
        if (str2 != null) {
            return d57.f1(str2, ';');
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: yh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: yh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: a66} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0200 A[Catch:{ Exception -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0211 A[SYNTHETIC, Splitter:B:111:0x0211] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d A[SYNTHETIC, Splitter:B:33:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012f A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014f A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0159 A[SYNTHETIC, Splitter:B:63:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d7 A[Catch:{ Exception -> 0x01fd }] */
    public final Object a(f61 f61) {
        d73 d73;
        int i;
        gx5 gx5;
        gx5 gx52;
        a66 a66;
        a66 a662;
        d66 d66;
        Object obj;
        ih0 ih0;
        d66 d662;
        hx5 hx5;
        e73 e73 = this;
        f61 f612 = f61;
        if (f612 instanceof d73) {
            d73 = (d73) f612;
            int i2 = d73.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d73.E = i2 - Integer.MIN_VALUE;
                Object obj2 = d73.C;
                i = d73.E;
                pe1 pe1 = pe1.z;
                pe1 pe12 = pe1.y;
                yh4 yh4 = null;
                Object obj3 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    v75 v75 = e73.b;
                    boolean z = v75.n.w;
                    String str = e73.a;
                    if (z && (hx5 = (hx5) e73.d.getValue()) != null) {
                        String str2 = v75.i;
                        if (str2 == null) {
                            str2 = str;
                        }
                        rv1 rv1 = hx5.b;
                        dg0 dg0 = dg0.z;
                        pv1 l = rv1.l(td0.u(str2).c("SHA-256").e());
                        if (l != null) {
                            gx5 = new gx5(l);
                            if (gx5 == null) {
                                nd2 c2 = e73.c();
                                pv1 pv1 = (pv1) gx5.x;
                                if (!pv1.x) {
                                    Long l2 = (Long) c2.D((ae5) pv1.w.c.get(0)).e;
                                    if (l2 != null) {
                                        if (l2.longValue() == 0) {
                                            return new xy6(e73.g(gx5), d(str, (yh4) null), pe12);
                                        }
                                    }
                                    if (e73.e) {
                                        ih0 = new hh0(e73.e(), e73.f(gx5)).a();
                                        gh0 gh0 = ih0.b;
                                        if (ih0.a == null && gh0 != null) {
                                            return new xy6(e73.g(gx5), d(str, (yh4) gh0.b.getValue()), pe12);
                                        }
                                    } else {
                                        xc2 g2 = e73.g(gx5);
                                        gh0 f2 = e73.f(gx5);
                                        if (f2 != null) {
                                            yh4 = f2.b.getValue();
                                        }
                                        return new xy6(g2, d(str, yh4), pe12);
                                    }
                                } else {
                                    throw new IllegalStateException("snapshot is closed");
                                }
                            } else {
                                ih0 = new hh0(e73.e(), (gh0) null).a();
                            }
                            kd6 kd6 = ih0.a;
                            kd6.getClass();
                            d73.z = e73;
                            d73.A = gx5;
                            d73.B = ih0;
                            d73.E = 1;
                            obj = e73.b(kd6, d73);
                            if (obj == obj3) {
                                return obj3;
                            }
                        }
                    }
                    gx5 = null;
                    if (gx5 == null) {
                    }
                    kd6 kd62 = ih0.a;
                    kd62.getClass();
                    d73.z = e73;
                    d73.A = gx5;
                    d73.B = ih0;
                    d73.E = 1;
                    obj = e73.b(kd62, d73);
                    if (obj == obj3) {
                    }
                } else if (i == 1) {
                    ih0 ih02 = (ih0) d73.B;
                    gx5 = d73.A;
                    e73 e732 = d73.z;
                    try {
                        o85.q(obj2);
                        Object obj4 = obj2;
                        ih0 = ih02;
                        e73 = e732;
                        obj = obj4;
                    } catch (Exception e2) {
                        e = e2;
                        if (gx5 != null) {
                        }
                        throw e;
                    }
                } else if (i == 2) {
                    a66 = d73.B;
                    gx52 = d73.A;
                    e73 = d73.z;
                    try {
                        o85.q(obj2);
                        a662 = (a66) obj2;
                    } catch (Exception e3) {
                        e = e3;
                    }
                    try {
                        Bitmap.Config[] configArr = i.a;
                        d66 = a662.C;
                        if (d66 == null) {
                            e73.getClass();
                            ed0 l3 = d66.l();
                            Context context = e73.b.a;
                            ty6 ty6 = new ty6(l3, (ie1) null);
                            String d2 = d(e73.a, d66.k());
                            if (a662.E == null) {
                                pe1 = pe12;
                            }
                            return new xy6(ty6, d2, pe1);
                        }
                        throw new IllegalStateException("response body == null");
                    } catch (Exception e4) {
                        e = e4;
                        a66 = a662;
                        try {
                            i.a(a66);
                            throw e;
                        } catch (Exception e5) {
                            e = e5;
                            gx5 = gx52;
                            if (gx5 != null) {
                                i.a(gx5);
                            }
                            throw e;
                        }
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a66 a663 = (a66) obj;
                Bitmap.Config[] configArr2 = i.a;
                d662 = a663.C;
                if (d662 == null) {
                    try {
                        gx5 h = e73.h(gx5, ih0.a, a663, ih0.b);
                        String str3 = e73.a;
                        if (h != null) {
                            try {
                                xc2 g3 = e73.g(h);
                                gh0 f3 = e73.f(h);
                                if (f3 != null) {
                                    yh4 = f3.b.getValue();
                                }
                                return new xy6(g3, d(str3, yh4), pe1);
                            } catch (Exception e6) {
                                e = e6;
                                gx52 = h;
                                a66 = a663;
                                i.a(a66);
                                throw e;
                            }
                        } else if (d662.l().j(1)) {
                            ed0 l4 = d662.l();
                            Context context2 = e73.b.a;
                            ty6 ty62 = new ty6(l4, (ie1) null);
                            String d3 = d(str3, d662.k());
                            if (a663.E == null) {
                                pe1 = pe12;
                            }
                            return new xy6(ty62, d3, pe1);
                        } else {
                            i.a(a663);
                            kd6 e7 = e73.e();
                            d73.z = e73;
                            d73.A = h;
                            d73.B = a663;
                            d73.E = 2;
                            Object b2 = e73.b(e7, d73);
                            if (b2 != obj3) {
                                gx52 = h;
                                obj2 = b2;
                                a66 = a663;
                                a662 = (a66) obj2;
                                Bitmap.Config[] configArr3 = i.a;
                                d66 = a662.C;
                                if (d66 == null) {
                                }
                            }
                            return obj3;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        gx52 = gx5;
                        a66 = a663;
                        i.a(a66);
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("response body == null");
                }
            }
        }
        d73 = new d73(e73, (h61) f612);
        Object obj22 = d73.C;
        i = d73.E;
        pe1 pe13 = pe1.z;
        pe1 pe122 = pe1.y;
        yh4 yh42 = null;
        Object obj32 = p81.w;
        if (i != 0) {
        }
        a66 a6632 = (a66) obj;
        Bitmap.Config[] configArr22 = i.a;
        d662 = a6632.C;
        if (d662 == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object b(kd6 kd6, h61 h61) {
        c73 c73;
        int i;
        a66 a66;
        boolean z;
        int i2;
        if (h61 instanceof c73) {
            c73 = (c73) h61;
            int i3 = c73.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c73.B = i3 - Integer.MIN_VALUE;
                Object obj = c73.z;
                i = c73.B;
                if (i != 0) {
                    o85.q(obj);
                    Bitmap.Config[] configArr = i.a;
                    boolean e2 = sg3.e(Looper.myLooper(), Looper.getMainLooper());
                    nz3 nz3 = this.c;
                    if (!e2) {
                        d45 d45 = (d45) nz3.getValue();
                        d45.getClass();
                        kd6.getClass();
                        dx5 dx5 = new dx5(d45, kd6, false);
                        c73.B = 1;
                        kk0 kk0 = new kk0(1, rc9.a0(c73));
                        kk0.v();
                        e3 e3Var = new e3(3, (Object) dx5, (Object) kk0);
                        dx5.e(e3Var);
                        kk0.x(e3Var);
                        obj = kk0.t();
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    } else if (!this.b.o.w) {
                        d45 d452 = (d45) nz3.getValue();
                        d452.getClass();
                        kd6.getClass();
                        a66 = new dx5(d452, kd6, false).f();
                        z = a66.M;
                        i2 = a66.z;
                        if (z || i2 == 304) {
                            return a66;
                        }
                        d66 d66 = a66.C;
                        if (d66 != null) {
                            i.a(d66);
                        }
                        StringBuilder o = pb4.o(i2, "HTTP ", ": ");
                        o.append(a66.y);
                        throw new RuntimeException(o.toString());
                    } else {
                        throw new NetworkOnMainThreadException();
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a66 = (a66) obj;
                z = a66.M;
                i2 = a66.z;
                if (z || i2 == 304) {
                }
            }
        }
        c73 = new c73(this, h61);
        Object obj2 = c73.z;
        i = c73.B;
        if (i != 0) {
        }
        a66 = (a66) obj2;
        z = a66.M;
        i2 = a66.z;
        if (z || i2 == 304) {
        }
    }

    public final nd2 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((hx5) value).a;
    }

    public final kd6 e() {
        o9 o9Var = new o9(12);
        o9Var.N(this.a);
        v75 v75 = this.b;
        bz2 bz2 = v75.j;
        bz2.getClass();
        o9Var.z = bz2.k();
        for (Map.Entry entry : v75.k.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            o9Var.B = ((jb5) o9Var.B).C(b26.a.b((Class) key), value);
        }
        eh0 eh0 = v75.n;
        boolean z = eh0.w;
        boolean z2 = v75.o.w;
        if (!z2 && z) {
            o9Var.n(ah0.o);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                o9Var.n(g);
            }
        } else if (eh0.x) {
            o9Var.n(ah0.n);
        } else {
            o9Var.n(f);
        }
        return new kd6(o9Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[Catch:{ IOException -> 0x0047 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ IOException -> 0x0047 }] */
    public final gh0 f(gx5 gx5) {
        Throwable th;
        gh0 gh0;
        try {
            nd2 c2 = c();
            pv1 pv1 = (pv1) gx5.x;
            if (!pv1.x) {
                oy6 L = c2.L((ae5) pv1.w.c.get(0));
                L.getClass();
                zw5 zw5 = new zw5(L);
                try {
                    gh0 = new gh0(zw5);
                    try {
                        zw5.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    su0.b(th, th3);
                }
                if (th != null) {
                    return gh0;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
            th = th;
            gh0 = null;
            if (th != null) {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final xc2 g(gx5 gx5) {
        pv1 pv1 = (pv1) gx5.x;
        if (!pv1.x) {
            ae5 ae5 = (ae5) pv1.w.c.get(1);
            nd2 c2 = c();
            String str = this.b.i;
            if (str == null) {
                str = this.a;
            }
            return new xc2(ae5, c2, str, gx5);
        }
        h.s("snapshot is closed");
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:58|59|94|95|96|97|98|99) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (defpackage.sg3.e(r6.B.f("Vary"), "*") == false) goto L_0x0037;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0164 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    public final gx5 h(gx5 gx5, kd6 kd6, a66 a66, gh0 gh0) {
        wv2 wv2;
        l90 k;
        Throwable th = null;
        if (this.b.n.x) {
            if (this.e) {
                if (!kd6.x().b) {
                    ah0 ah0 = a66.L;
                    if (ah0 == null) {
                        ah0 ah02 = ah0.n;
                        ah0 = ed1.x(a66.B);
                        a66.L = ah0;
                    }
                    if (!ah0.b) {
                    }
                }
            }
            if (gx5 != null) {
                pv1 pv1 = (pv1) gx5.x;
                rv1 rv1 = pv1.y;
                synchronized (rv1) {
                    pv1.close();
                    k = rv1.k(pv1.w.a);
                }
                if (k != null) {
                    wv2 = new wv2(29, k);
                    if (wv2 != null) {
                        try {
                            if (a66.z != 304 || gh0 == null) {
                                tu6 I = c().I(((l90) wv2.x).c(0));
                                I.getClass();
                                yw5 yw5 = new yw5(I);
                                try {
                                    new gh0(a66).a(yw5);
                                    try {
                                        yw5.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    su0.b(th, th3);
                                }
                                if (th == null) {
                                    tu6 I2 = c().I(((l90) wv2.x).c(1));
                                    I2.getClass();
                                    yw5 yw52 = new yw5(I2);
                                    try {
                                        d66 d66 = a66.C;
                                        d66.getClass();
                                        d66.l().d0(yw52);
                                        try {
                                            yw52.close();
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        su0.b(th, th5);
                                    }
                                    if (th != null) {
                                        throw th;
                                    }
                                } else {
                                    throw th;
                                }
                            } else {
                                z56 a2 = a66.a();
                                a2.f = ie1.B(gh0.f, a66.B).k();
                                a66 a3 = a2.a();
                                tu6 I3 = c().I(((l90) wv2.x).c(0));
                                I3.getClass();
                                yw5 yw53 = new yw5(I3);
                                try {
                                    new gh0(a3).a(yw53);
                                    try {
                                        yw53.close();
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    su0.b(th, th7);
                                }
                                if (th != null) {
                                    throw th;
                                }
                            }
                            gx5 l = wv2.l();
                            i.a(a66);
                            return l;
                        } catch (Exception e2) {
                            Bitmap.Config[] configArr = i.a;
                            ((l90) wv2.x).a(false);
                            throw e2;
                        } catch (Throwable th8) {
                            i.a(a66);
                            throw th8;
                        }
                    }
                    return null;
                }
            } else {
                hx5 hx5 = (hx5) this.d.getValue();
                if (hx5 != null) {
                    String str = this.b.i;
                    if (str == null) {
                        str = this.a;
                    }
                    rv1 rv12 = hx5.b;
                    dg0 dg0 = dg0.z;
                    l90 k2 = rv12.k(td0.u(str).c("SHA-256").e());
                    if (k2 != null) {
                        wv2 = new wv2(29, k2);
                        if (wv2 != null) {
                        }
                        return null;
                    }
                }
            }
            wv2 = null;
            if (wv2 != null) {
            }
            return null;
        }
        if (gx5 != null) {
            i.a(gx5);
        }
        return null;
    }
}
