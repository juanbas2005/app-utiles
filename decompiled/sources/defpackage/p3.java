package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: p3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p3 implements sr2 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;

    public p3(m14 m14, e16 e16, h06 h06) {
        this.w = 21;
        this.x = m14;
        this.y = h06;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.io.IOException} */
    /* JADX WARNING: type inference failed for: r8v10, types: [qz3] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        Iterable iterable;
        String str;
        m61 m61;
        gs3 gs3;
        gs3 gs32;
        k62 k62;
        IOException iOException;
        dq7 dq7;
        int i = this.w;
        List<du7> list = a42.w;
        vs7 vs7 = vs7.a;
        IOException iOException2 = null;
        Object obj = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                ro7.x.getClass();
                ro7 ro7 = ro7.y;
                wo7 n = ((r3) obj2).n();
                List list2 = Collections.EMPTY_LIST;
                k3 k3Var = new k3(2, this);
                cb4 cb4 = kb4.e;
                cb4.getClass();
                return kl8.J(new y34(cb4, k3Var), ro7, n, list2, false);
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                dt0.D0(((Map) obj2).entrySet(), sb, ", ", "(", ")", e7.y, 48);
                return sb.toString();
            case 2:
                am6 am6 = (am6) obj;
                rm annotations = ((lq0) obj2).getAnnotations();
                am6.getClass();
                annotations.getClass();
                return lm.b(((pj3) am6.x).q, (ak3) ((nz3) am6.z).getValue(), annotations);
            case 3:
                am6 am62 = (am6) obj;
                rm rmVar = (rm) obj2;
                am62.getClass();
                rmVar.getClass();
                return lm.b(((pj3) am62.x).q, (ak3) ((nz3) am62.z).getValue(), rmVar);
            case 4:
                xq1 xq1 = (xq1) obj;
                String str2 = (String) obj2;
                yq3 yq3 = xq1.C;
                String str3 = xq1.D;
                yq3.getClass();
                str2.getClass();
                str3.getClass();
                if (str2.equals("<init>")) {
                    iterable = dt0.b1(yq3.P());
                } else {
                    iterable = yq3.R(uq4.e(str2));
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList();
                for (Object next : iterable2) {
                    if (sg3.e(ta6.c((xs2) next).m(), str3)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() == 1) {
                    return (xs2) dt0.Q0(arrayList);
                }
                String E0 = dt0.E0(iterable2, "\n", (String) null, (String) null, jo3.B, 30);
                StringBuilder o = f21.o("Function '", str2, "' (JVM signature: ", str3, ") not resolved in ");
                o.append(yq3);
                o.append(':');
                if (E0.length() == 0) {
                    str = " no members found";
                } else {
                    str = "\n".concat(E0);
                }
                o.append(str);
                throw new Error(o.toString());
            case 5:
                ds1 ds1 = (ds1) obj;
                sr2 sr2 = (sr2) obj2;
                List G = ds1.x.G();
                if (G.isEmpty()) {
                    return list;
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(G, 10));
                int i2 = 0;
                for (Object next2 : G) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        xp7 xp7 = (xp7) next2;
                        if (sr2 == null) {
                            m61 = null;
                        } else {
                            m61 = new m61(i2, 0, new bs1(ds1, 1));
                        }
                        if (xp7.c()) {
                            gs3 = gs3.c;
                        } else {
                            vw3 b = xp7.b();
                            b.getClass();
                            ds1 ds12 = new ds1(b, m61, false);
                            int ordinal = xp7.a().ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    gs32 = new gs3(ds12, ks3.x);
                                } else if (ordinal == 2) {
                                    gs32 = new gs3(ds12, ks3.y);
                                } else {
                                    h.c();
                                    return null;
                                }
                                gs3 = gs32;
                            } else {
                                gs3 gs33 = gs3.c;
                                gs3 = x91.C(ds12);
                            }
                        }
                        arrayList2.add(gs3);
                        i2 = i3;
                    } else {
                        sg3.Z();
                        throw null;
                    }
                }
                return arrayList2;
            case 6:
                gt1 gt1 = (gt1) obj;
                return dt0.b1(((ws1) gt1.H.a).e.m(gt1.Q, (es5) obj2));
            case 7:
                ((aq4) obj2).setValue((tm2) obj);
                return vs7;
            case 8:
                ((vr2) obj).y(((en2) obj2).a);
                return vs7;
            case 9:
                ((aq4) obj2).setValue((en2) obj);
                return vs7;
            case 10:
                vv6 vv6 = new vv6();
                for (xs2 h : ((zs2) obj2).s()) {
                    vv6.add(h.h((dq7) obj));
                }
                return vv6;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                p33 p33 = (p33) obj2;
                s33 s33 = (s33) obj;
                k62 k622 = k62.A;
                try {
                    if (s33.a(true, this)) {
                        do {
                        } while (s33.a(false, this));
                        k62 = k62.y;
                        try {
                            p33.a(k62, k62.D, (IOException) null);
                        } catch (IOException e) {
                            iOException = e;
                            try {
                                k62 k623 = k62.z;
                                p33.a(k623, k623, iOException);
                                dg8.b(s33);
                                return vs7;
                            } catch (Throwable th) {
                                th = th;
                                iOException2 = iOException;
                                p33.a(k62, k622, iOException2);
                                dg8.b(s33);
                                throw th;
                            }
                        }
                        dg8.b(s33);
                        return vs7;
                    }
                    throw new IOException("Required SETTINGS preface not received");
                } catch (IOException e2) {
                    iOException = e2;
                    k62 = k622;
                    k62 k6232 = k62.z;
                    p33.a(k6232, k6232, iOException);
                    dg8.b(s33);
                    return vs7;
                } catch (Throwable th2) {
                    th = th2;
                    k62 = k622;
                    p33.a(k62, k622, iOException2);
                    dg8.b(s33);
                    throw th;
                }
            case 12:
                return ((pj3) ((am6) obj).x).o.g().j(((ai3) obj2).a).g0();
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                rn3 rn3 = (rn3) obj;
                kb4 kb4 = (kb4) obj2;
                vr2 vr2 = rn3.b;
                tl4 tl4 = rn3.a;
                cq0 cq0 = new cq0((vj1) vr2.y(tl4), rn3.g, fl4.A, iq0.x, sg3.D(tl4.z.e()), kb4);
                cq0.C0(new vv2(kb4, cq0), g42.w, (wp0) null);
                return cq0;
            case 14:
                un3 un3 = (un3) obj;
                tl4 l = un3.l();
                l.getClass();
                return new xn3(l, (kb4) obj2, new k3(29, un3));
            case h75.g:
                xn3 xn3 = (xn3) obj;
                tl4 tl42 = xn3.b().a;
                rn3.d.getClass();
                return r16.B(tl42, rn3.h, new am6((kb4) obj2, (sl4) xn3.b().a)).g0();
            case 16:
                w04 w04 = (w04) obj;
                am6 am63 = w04.F;
                pj3 pj3 = (pj3) am63.x;
                kb4 kb42 = pj3.a;
                y06 y06 = pj3.b;
                rg4 rg4 = pj3.c;
                kt1 kt1 = pj3.d;
                pe2 pe2 = pj3.e;
                r62 r62 = pj3.f;
                hz2 hz2 = pj3.h;
                n63 n63 = pj3.i;
                td0 td0 = pj3.j;
                am6 am64 = new am6(new pj3(kb42, y06, rg4, kt1, pe2, r62, hz2, n63, td0, pj3.k, pj3.l, pj3.m, pj3.n, pj3.o, pj3.p, pj3.q, pj3.r, pj3.s, pj3.t, pj3.u, pj3.v, pj3.w), (up7) am63.y, (nz3) am63.z);
                vj1 r = w04.r();
                r.getClass();
                return new w04(am64, r, w04.D, (ql4) obj2);
            case 17:
                oq3 oq3 = (oq3) obj2;
                vq0 u = ((vw3) obj).L().u();
                if (u instanceof ql4) {
                    Class q = g18.q((ql4) u);
                    if (q != null) {
                        Class cls = oq3.x;
                        if (sg3.e(cls.getSuperclass(), q)) {
                            Type genericSuperclass = cls.getGenericSuperclass();
                            genericSuperclass.getClass();
                            return genericSuperclass;
                        }
                        Class[] interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        int c1 = qs.c1(q, interfaces);
                        if (c1 >= 0) {
                            Type type = cls.getGenericInterfaces()[c1];
                            type.getClass();
                            return type;
                        }
                        h.r("No superclass of ", oq3, " in Java reflection for ", u);
                        return null;
                    }
                    h.r("Unsupported superclass of ", oq3, ": ", u);
                    return null;
                }
                rf2.x("Supertype not a class: ", u);
                return null;
            case 18:
                ew3 ew3 = (ew3) obj;
                vp7 vp7 = (vp7) obj2;
                uu3 uu3 = ew3.x.c;
                if (uu3 != null) {
                    return pd8.M(uu3, m06.d(ew3.w.B().b()), vp7, new xo3(6, ew3), 4);
                }
                sg3.a0("type");
                throw null;
            case 19:
                return new c14(((d14) obj).a, (i16) obj2);
            case 20:
                y06 y062 = ((pj3) ((am6) obj).x).b;
                up2 up2 = ((i14) obj2).o.A;
                y062.getClass();
                up2.getClass();
                return null;
            case 21:
                ((pj3) ((m14) obj).b.x).h.getClass();
                ((cr5) ((h06) obj2).w).getClass();
                return null;
            case 22:
                zw3 zw3 = (zw3) ((l44) obj2).y.b();
                ((ax3) obj).getClass();
                zw3.getClass();
                return (vw3) zw3;
            case 23:
                ax3 ax3 = (ax3) obj2;
                List list3 = (List) ((cz4) obj).A.getValue();
                if (list3 != null) {
                    list = list3;
                }
                ArrayList arrayList3 = new ArrayList(et0.e0(list, 10));
                for (du7 p0 : list) {
                    arrayList3.add(p0.p0(ax3));
                }
                return arrayList3;
            case 24:
                mi0 mi0 = (mi0) obj2;
                ((xa7) obj).u(mi0.a, mi0.b, "calls");
                return vs7;
            case 25:
                yv6 yv6 = (yv6) obj2;
                ((xa7) obj).u(yv6.a, yv6.b, "sms");
                return vs7;
            case 26:
                ((vr2) obj).y(((cm6) obj2).b);
                return vs7;
            case 27:
                Map map = q17.a;
                ((aq4) obj2).setValue((o11) obj);
                return vs7;
            case 28:
                mo7 mo7 = (mo7) obj;
                wp0 wp0 = (wp0) obj2;
                kb4 kb43 = mo7.Z;
                ut1 ut1 = mo7.a0;
                rm annotations2 = wp0.getAnnotations();
                int u2 = wp0.u();
                if (u2 != 0) {
                    ut1 ut12 = mo7.a0;
                    sy6 e3 = ut12.e();
                    e3.getClass();
                    mo7 mo72 = new mo7(kb43, ut1, wp0, mo7, annotations2, u2, e3);
                    mo7.c0.getClass();
                    if (ut12.f1() == null) {
                        dq7 = null;
                    } else {
                        dq7 = dq7.d(ut12.g1());
                    }
                    if (dq7 == null) {
                        return null;
                    }
                    qz3 qz3 = wp0.F;
                    if (qz3 != null) {
                        iOException2 = qz3.h(dq7);
                    }
                    qz3 qz32 = iOException2;
                    List<qz3> h0 = wp0.h0();
                    h0.getClass();
                    ArrayList arrayList4 = new ArrayList(et0.e0(h0, 10));
                    for (qz3 g1 : h0) {
                        arrayList4.add(g1.h(dq7));
                    }
                    List u0 = ut12.u0();
                    List S = mo7.S();
                    vw3 vw3 = mo7.C;
                    vw3.getClass();
                    mo7 mo73 = mo72;
                    mo73.k1((qz3) null, qz32, arrayList4, u0, S, vw3, fl4.x, ut12.B);
                    return mo72;
                }
                throw null;
            default:
                z00 z00 = (z00) ((bk7) obj).b;
                return ((ws1) z00.a).e.j((bt5) obj2, (vq4) z00.b);
        }
    }

    public /* synthetic */ p3(int i, Object obj, Object obj2) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    public /* synthetic */ p3(Object obj, boolean z, Object obj2, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
