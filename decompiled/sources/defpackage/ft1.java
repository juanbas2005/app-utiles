package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: ft1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ft1 extends k0 {
    public final /* synthetic */ j0 A;
    public final /* synthetic */ int y = 0;
    public final ib4 z;

    /* JADX WARNING: type inference failed for: r4v1, types: [ib4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public ft1(w04 w04) {
        super(((pj3) r0.x).a);
        this.A = w04;
        am6 am6 = w04.F;
        kb4 kb4 = ((pj3) am6.x).a;
        v04 v04 = new v04(w04, 2);
        kb4.getClass();
        this.z = new hb4(kb4, v04);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: a42} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        if (r5.h(r6) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        if (r5 == null) goto L_0x0115;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0265  */
    public final Collection a() {
        String str;
        up2 a;
        r05 r05;
        a42<a16> a42;
        up2 up2;
        fu6 fu6;
        ql4 ql4;
        vw3 vw3;
        wo7 wo7;
        up2 up22;
        ql4 ql42;
        ArrayList arrayList;
        x47 x47;
        String str2;
        int i = this.y;
        j0 j0Var = this.A;
        switch (i) {
            case b85.b:
                gt1 gt1 = (gt1) j0Var;
                tr5 tr5 = gt1.A;
                z00 z00 = gt1.H;
                List<bt5> D = p25.D(tr5, (wv1) z00.d);
                ArrayList arrayList2 = new ArrayList(et0.e0(D, 10));
                for (bt5 g : D) {
                    arrayList2.add(((bk7) z00.h).g(g));
                }
                ArrayList M0 = dt0.M0(arrayList2, ((ws1) z00.a).n.j(gt1));
                ArrayList arrayList3 = new ArrayList();
                Iterator it = M0.iterator();
                while (it.hasNext()) {
                    vq0 u = ((vw3) it.next()).L().u();
                    if (u instanceof r05) {
                        r05 = (r05) u;
                    } else {
                        r05 = null;
                    }
                    if (r05 != null) {
                        arrayList3.add(r05);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    r62 r62 = ((ws1) z00.a).h;
                    ArrayList arrayList4 = new ArrayList(et0.e0(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        r05 r052 = (r05) it2.next();
                        gq0 f = ts1.f(r052);
                        if (f == null || (a = f.a()) == null || (str = a.a.a) == null) {
                            str = r052.getName().b();
                            str.getClass();
                        }
                        arrayList4.add(str);
                    }
                    r62.e(gt1, arrayList4);
                }
                return dt0.b1(M0);
            default:
                w04 w04 = (w04) j0Var;
                am6 am6 = w04.F;
                Class cls = w04.D.a;
                Type type = Object.class;
                boolean e = sg3.e(cls, type);
                a42 a422 = a42.w;
                if (e) {
                    a42 = a422;
                } else {
                    be5 be5 = new be5(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        type = genericSuperclass;
                    }
                    be5.a(type);
                    be5.b(cls.getGenericInterfaces());
                    ArrayList arrayList5 = be5.a;
                    List<Type> E = sg3.E(arrayList5.toArray(new Type[arrayList5.size()]));
                    ArrayList arrayList6 = new ArrayList(et0.e0(E, 10));
                    for (Type a16 : E) {
                        arrayList6.add(new a16(a16));
                    }
                    a42 = arrayList6;
                }
                ArrayList arrayList7 = new ArrayList(a42.size());
                ArrayList arrayList8 = new ArrayList(0);
                u04 u04 = w04.Q;
                up2 up23 = nn3.p;
                up23.getClass();
                fm m = u04.m(up23);
                if (m != null) {
                    Object R0 = dt0.R0(m.g().values());
                    if (R0 instanceof x47) {
                        x47 = (x47) R0;
                    } else {
                        x47 = null;
                    }
                    if (!(x47 == null || (str2 = (String) x47.a) == null)) {
                        int length = str2.length();
                        z27 z27 = z27.w;
                        int i2 = 0;
                        while (true) {
                            z27 z272 = z27.y;
                            if (i2 < length) {
                                char charAt = str2.charAt(i2);
                                int ordinal = z27.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        if (charAt == '.') {
                                            z27 = z272;
                                        } else if (!Character.isJavaIdentifierPart(charAt)) {
                                        }
                                        i2++;
                                    } else if (ordinal != 2) {
                                        h.c();
                                        return null;
                                    }
                                }
                                if (Character.isJavaIdentifierStart(charAt)) {
                                    z27 = z27.x;
                                    i2++;
                                }
                            } else if (z27 != z272) {
                                up2 = new up2(str2);
                            }
                        }
                    }
                }
                up2 = null;
                if (up2 != null) {
                    vp2 vp2 = up2.a;
                    if (!vp2.c()) {
                        uq4 uq4 = n27.j;
                        uq4.getClass();
                        break;
                    }
                }
                up2 = null;
                k28 k28 = k28.y;
                if (up2 == null) {
                    LinkedHashMap linkedHashMap = nb2.a;
                    up22 = (up2) nb2.b.get(ts1.g(w04));
                    break;
                } else {
                    up22 = up2;
                    sl4 sl4 = ((pj3) am6.x).o;
                    int i3 = ts1.a;
                    sl4.getClass();
                    vp2 vp22 = up22.a;
                    vp22.c();
                    vq0 e2 = sl4.k0(up22.b()).C.e(vp22.g(), oz4.D);
                    if (e2 instanceof ql4) {
                        ql42 = (ql4) e2;
                    } else {
                        ql42 = null;
                    }
                    if (ql42 != null) {
                        int size = ql42.n().getParameters().size();
                        List<qp7> parameters = w04.L.getParameters();
                        parameters.getClass();
                        int size2 = parameters.size();
                        if (size2 == size) {
                            arrayList = new ArrayList(et0.e0(parameters, 10));
                            for (qp7 g0 : parameters) {
                                arrayList.add(new p27(g0.g0(), k28));
                            }
                        } else if (size2 == 1 && size > 1 && up2 == null) {
                            p27 p27 = new p27(((qp7) dt0.Q0(parameters)).g0(), k28);
                            pe3 pe3 = new pe3(1, size, 1);
                            ArrayList arrayList9 = new ArrayList(et0.e0(pe3, 10));
                            Iterator it3 = pe3.iterator();
                            while (((qe3) it3).y) {
                                ((je3) it3).nextInt();
                                arrayList9.add(p27);
                            }
                            arrayList = arrayList9;
                        }
                        ro7.x.getClass();
                        fu6 = kl8.H(ro7.y, ql42, arrayList);
                        for (a16 a162 : a42) {
                            vw3 h0 = ((wr0) am6.A).h0(a162, sg3.b0(fq7.w, false, (q14) null, 7));
                            hr2 hr2 = ((pj3) am6.x).r;
                            hr2.getClass();
                            a16 a163 = a162;
                            vw3 vw32 = h0;
                            vw3 r = hr2.r(new u72((ql) null, false, am6, jm.TYPE_USE, true), vw32, a422, (cp7) null, false);
                            if (r == null) {
                                r = vw32;
                            }
                            if (r.L().u() instanceof r05) {
                                arrayList8.add(a163);
                            }
                            wo7 L = r.L();
                            if (fu6 != null) {
                                wo7 = fu6.L();
                            } else {
                                wo7 = null;
                            }
                            if (!sg3.e(L, wo7) && !fv3.y(r)) {
                                arrayList7.add(r);
                            }
                        }
                        ql4 = w04.E;
                        if (ql4 == null) {
                            vw3 = new dq7(gr8.E(ql4, w04)).h(ql4.g0(), k28);
                        } else {
                            vw3 = null;
                        }
                        if (vw3 != null) {
                            arrayList7.add(vw3);
                        }
                        if (fu6 != null) {
                            arrayList7.add(fu6);
                        }
                        if (!arrayList8.isEmpty()) {
                            r62 r622 = ((pj3) am6.x).f;
                            ArrayList arrayList10 = new ArrayList(et0.e0(arrayList8, 10));
                            Iterator it4 = arrayList8.iterator();
                            while (it4.hasNext()) {
                                l16 l16 = (l16) it4.next();
                                l16.getClass();
                                arrayList10.add(((a16) l16).a.toString());
                            }
                            r622.e(w04, arrayList10);
                        }
                        if (arrayList7.isEmpty()) {
                            return dt0.b1(arrayList7);
                        }
                        return sg3.D(((pj3) am6.x).o.g().e());
                    }
                }
                fu6 = null;
                while (r17.hasNext()) {
                }
                ql4 = w04.E;
                if (ql4 == null) {
                }
                if (vw3 != null) {
                }
                if (fu6 != null) {
                }
                if (!arrayList8.isEmpty()) {
                }
                if (arrayList7.isEmpty()) {
                }
        }
    }

    public final pe2 c() {
        switch (this.y) {
            case b85.b:
                return pe2.O;
            default:
                return ((pj3) ((w04) this.A).F.x).m;
        }
    }

    public final List getParameters() {
        switch (this.y) {
            case b85.b:
                return (List) this.z.b();
            default:
                return (List) this.z.b();
        }
    }

    public final ql4 j() {
        int i = this.y;
        j0 j0Var = this.A;
        switch (i) {
            case b85.b:
                return (gt1) j0Var;
            default:
                return (w04) j0Var;
        }
    }

    public final String toString() {
        int i = this.y;
        j0 j0Var = this.A;
        switch (i) {
            case b85.b:
                String str = ((gt1) j0Var).getName().w;
                str.getClass();
                return str;
            default:
                String b = ((w04) j0Var).getName().b();
                b.getClass();
                return b;
        }
    }

    public final vq0 u() {
        int i = this.y;
        j0 j0Var = this.A;
        switch (i) {
            case b85.b:
                return (gt1) j0Var;
            default:
                return (w04) j0Var;
        }
    }

    public final boolean y() {
        switch (this.y) {
            case b85.b:
                return true;
            default:
                return true;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [ib4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public ft1(gt1 gt1) {
        super(((ws1) r0.a).a);
        this.A = gt1;
        z00 z00 = gt1.H;
        kb4 kb4 = ((ws1) z00.a).a;
        at1 at1 = new at1(gt1, 6);
        kb4.getClass();
        this.z = new hb4(kb4, at1);
    }
}
