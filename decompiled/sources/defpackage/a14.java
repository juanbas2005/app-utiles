package defpackage;

import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: a14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a14 extends m14 {
    public static final /* synthetic */ int v = 0;
    public final ql4 n;
    public final x06 o;
    public final boolean p;
    public final ib4 q;
    public final ib4 r;
    public final ib4 s;
    public final ib4 t;
    public final m70 u;

    /* JADX WARNING: type inference failed for: r4v1, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r4v3, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r4v4, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r4v6, types: [ib4, hb4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a14(am6 am6, ql4 ql4, x06 x06, boolean z, a14 a14) {
        super(am6, a14);
        am6.getClass();
        x06.getClass();
        this.n = ql4;
        this.o = x06;
        this.p = z;
        kb4 kb4 = ((pj3) am6.x).a;
        x04 x04 = new x04(this, am6);
        kb4.getClass();
        this.q = new hb4(kb4, x04);
        y04 y04 = new y04(this, 0);
        kb4.getClass();
        this.r = new hb4(kb4, y04);
        x04 x042 = new x04(am6, this);
        kb4.getClass();
        this.s = new hb4(kb4, x042);
        y04 y042 = new y04(this, 1);
        kb4.getClass();
        this.t = new hb4(kb4, y042);
        this.u = kb4.c(new e3(15, (Object) this, (Object) am6));
    }

    public static au6 A(au6 au6, xs2 xs2, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return au6;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            au6 au62 = (au6) it.next();
            if (!au6.equals(au62) && au62.X == null && D(au62, xs2)) {
                xs2 build = au6.r0().G().build();
                build.getClass();
                return (au6) build;
            }
        }
        return au6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    public static au6 B(au6 au6) {
        up2 up2;
        List S = au6.S();
        S.getClass();
        h28 h28 = (h28) dt0.H0(S);
        if (h28 != null) {
            vq0 u2 = h28.b().L().u();
            if (u2 != null) {
                int i = ts1.a;
                vp2 f = rs1.f(u2);
                f.getClass();
                if (!f.d()) {
                    f = null;
                }
                if (f != null) {
                    up2 = f.i();
                    if (!sg3.e(up2, n27.g)) {
                        h28 = null;
                    }
                    if (h28 != null) {
                        ws2 r0 = au6.r0();
                        List S2 = au6.S();
                        S2.getClass();
                        au6 au62 = (au6) r0.a(dt0.t0(1, S2)).C(((xp7) h28.b().G().get(0)).b()).build();
                        if (au62 != null) {
                            au62.Q = true;
                        }
                        return au62;
                    }
                }
            }
            up2 = null;
            if (!sg3.e(up2, n27.g)) {
            }
            if (h28 != null) {
            }
        }
        return null;
    }

    public static boolean D(xs2 xs2, xs2 xs22) {
        int b = h95.c.n(xs22, xs2, true).b();
        if (b == 0) {
            throw null;
        } else if (b != 1 || h03.j(xs22, xs2)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean E(au6 au6, au6 au62) {
        int i = ud0.l;
        au6.getClass();
        if (sg3.e(au6.getName().b(), "removeAt") && sg3.e(dh4.h(au6), mz6.g.e)) {
            au62 = au62.e1();
        }
        au62.getClass();
        return D(au62, au6);
    }

    public static au6 F(cr5 cr5, String str, vr2 vr2) {
        au6 au6;
        boolean z;
        Iterator it = ((Iterable) vr2.y(uq4.e(str))).iterator();
        do {
            au6 = null;
            if (!it.hasNext()) {
                break;
            }
            au6 au62 = (au6) it.next();
            if (au62.S().size() == 0) {
                lz4 lz4 = xw3.a;
                vw3 vw3 = au62.C;
                if (vw3 == null) {
                    z = false;
                } else {
                    z = lz4.b(vw3, cr5.b());
                }
                if (z) {
                    au6 = au62;
                    continue;
                } else {
                    continue;
                }
            }
        } while (au6 == null);
        return au6;
    }

    public static au6 H(cr5 cr5, vr2 vr2) {
        String str;
        au6 au6;
        vw3 vw3;
        String b = cr5.getName().b();
        b.getClass();
        if (mn3.b(b)) {
            str = b.substring(2);
        } else {
            str = gw8.j(b);
        }
        Iterator it = ((Iterable) vr2.y(uq4.e("set".concat(str)))).iterator();
        do {
            au6 = null;
            if (!it.hasNext()) {
                break;
            }
            au6 au62 = (au6) it.next();
            if (au62.S().size() == 1 && (vw3 = au62.C) != null) {
                uq4 uq4 = fv3.e;
                if (!fv3.E(vw3, m27.d)) {
                    continue;
                } else {
                    lz4 lz4 = xw3.a;
                    List S = au62.S();
                    S.getClass();
                    if (lz4.a(((h28) dt0.Q0(S)).b(), cr5.b())) {
                        au6 = au62;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (au6 == null);
        return au6;
    }

    public static boolean K(au6 au6, xs2 xs2) {
        String g = dh4.g(au6, 2);
        xs2 a = xs2.a();
        a.getClass();
        if (!g.equals(dh4.g(a, 2)) || D(au6, xs2)) {
            return false;
        }
        return true;
    }

    public final boolean C(cr5 cr5, vr2 vr2) {
        if (rj1.A(cr5)) {
            return false;
        }
        au6 G = G(cr5, vr2);
        au6 H = H(cr5, vr2);
        if (G == null) {
            return false;
        }
        if (!cr5.a0()) {
            return true;
        }
        if (H == null || H.o() != G.o()) {
            return false;
        }
        return true;
    }

    public final au6 G(cr5 cr5, vr2 vr2) {
        fr5 fr5;
        uq4 uq4;
        fr5 c = cr5.c();
        String str = null;
        if (c != null) {
            fr5 = (fr5) n85.h(c);
        } else {
            fr5 = null;
        }
        if (fr5 != null) {
            fv3.A(fr5);
            ri0 b = ts1.b(ts1.i(fr5), e7.M);
            if (!(b == null || (uq4 = (uq4) wd0.a.get(ts1.g(b))) == null)) {
                str = uq4.b();
            }
        }
        if (str != null && !n85.j(this.n, fr5)) {
            return F(cr5, str, vr2);
        }
        String b2 = cr5.getName().b();
        b2.getClass();
        return F(cr5, mn3.a(b2), vr2);
    }

    public final LinkedHashSet I(uq4 uq4) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (vw3 R : z()) {
            it0.h0(linkedHashSet, R.R().b(uq4, oz4.A));
        }
        return linkedHashSet;
    }

    public final Set J(uq4 uq4) {
        ArrayList arrayList = new ArrayList();
        for (vw3 R : z()) {
            Iterable<cr5> f = R.R().f(uq4, oz4.A);
            ArrayList arrayList2 = new ArrayList(et0.e0(f, 10));
            for (cr5 add : f) {
                arrayList2.add(add);
            }
            it0.h0(arrayList, arrayList2);
        }
        return dt0.g1(arrayList);
    }

    public final boolean L(au6 au6) {
        Collection collection;
        uq4 name = au6.getName();
        name.getClass();
        String b = name.b();
        b.getClass();
        up2 up2 = mn3.a;
        if (k57.u0(b, "get", false) || k57.u0(b, "is", false)) {
            uq4 q2 = fb5.q(name, "get", (String) null, 12);
            if (q2 == null) {
                q2 = fb5.q(name, "is", (String) null, 8);
            }
            collection = sg3.F(q2);
        } else if (k57.u0(b, "set", false)) {
            collection = qs.V0(new uq4[]{fb5.q(name, "set", (String) null, 4), fb5.q(name, "set", "is", 4)});
        } else {
            collection = (List) wd0.b.get(name);
            if (collection == null) {
                collection = a42.w;
            }
        }
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Iterable<cr5> J = J((uq4) it.next());
                if (!(J instanceof Collection) || !((Collection) J).isEmpty()) {
                    for (cr5 cr5 : J) {
                        if (C(cr5, new e3(16, (Object) au6, (Object) this))) {
                            if (cr5.a0()) {
                                break loop0;
                            }
                            String b2 = au6.getName().b();
                            b2.getClass();
                            if (!k57.u0(b2, "set", false)) {
                                break loop0;
                            }
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        ArrayList arrayList = mz6.a;
        uq4 name2 = au6.getName();
        name2.getClass();
        uq4 uq4 = (uq4) mz6.k.get(name2);
        if (uq4 != null) {
            LinkedHashSet I = I(uq4);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : I) {
                au6 au62 = (au6) next;
                au62.getClass();
                if (n85.h(au62) != null) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                ws2 r0 = au6.r0();
                r0.J(uq4);
                r0.N();
                r0.j();
                xs2 build = r0.build();
                build.getClass();
                au6 au63 = (au6) build;
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (E((au6) it2.next(), au63)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        int i = vd0.l;
        uq4 name3 = au6.getName();
        name3.getClass();
        if (mz6.e.contains(name3)) {
            uq4 name4 = au6.getName();
            name4.getClass();
            LinkedHashSet<au6> I2 = I(name4);
            ArrayList arrayList3 = new ArrayList();
            for (au6 a : I2) {
                xs2 a2 = vd0.a(a);
                if (a2 != null) {
                    arrayList3.add(a2);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (K(au6, (xs2) it3.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        au6 B = B(au6);
        if (B == null) {
            return true;
        }
        uq4 name5 = au6.getName();
        name5.getClass();
        LinkedHashSet<au6> I3 = I(name5);
        if (I3.isEmpty()) {
            return true;
        }
        for (au6 au64 : I3) {
            if (au64.i() && D(B, au64)) {
                return false;
            }
        }
        return true;
    }

    public final void M(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        ((pj3) this.b.x).n.getClass();
        this.n.getClass();
    }

    public final ArrayList N(uq4 uq4) {
        Iterable<h16> c = ((ck1) this.e.b()).c(uq4);
        ArrayList arrayList = new ArrayList(et0.e0(c, 10));
        for (h16 t2 : c) {
            arrayList.add(t(t2));
        }
        return arrayList;
    }

    public final ArrayList O(uq4 uq4) {
        LinkedHashSet I = I(uq4);
        ArrayList arrayList = new ArrayList();
        for (Object next : I) {
            au6 au6 = (au6) next;
            au6.getClass();
            if (n85.h(au6) == null && vd0.a(au6) == null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        M(uq4, oz4);
        return super.b(uq4, oz4);
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        m70 m70;
        ql4 ql4;
        uq4.getClass();
        oz4.getClass();
        M(uq4, oz4);
        a14 a14 = (a14) this.c;
        if (a14 == null || (m70 = a14.u) == null || (ql4 = (ql4) m70.y(uq4)) == null) {
            return (vq0) this.u.y(uq4);
        }
        return ql4;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        M(uq4, oz4);
        return super.f(uq4, oz4);
    }

    public final Set h(is1 is1, vr2 vr2) {
        is1.getClass();
        return wn6.o((Set) this.r.b(), ((Map) this.t.b()).keySet());
    }

    public final Set i(is1 is1, jo3 jo3) {
        is1.getClass();
        ql4 ql4 = this.n;
        Collection<vw3> e = ql4.n().e();
        e.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (vw3 R : e) {
            it0.h0(linkedHashSet, R.R().c());
        }
        ib4 ib4 = this.e;
        linkedHashSet.addAll(((ck1) ib4.b()).a());
        linkedHashSet.addAll(((ck1) ib4.b()).e());
        linkedHashSet.addAll(h(is1, jo3));
        am6 am6 = this.b;
        ((xb4) ((pj3) am6.x).x).getClass();
        ql4.getClass();
        am6.getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    public final void j(uq4 uq4, ArrayList arrayList) {
        uq4 uq42 = uq4;
        uq42.getClass();
        boolean g = this.o.g();
        ql4 ql4 = this.n;
        am6 am6 = this.b;
        if (g) {
            ib4 ib4 = this.e;
            if (((ck1) ib4.b()).b(uq42) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((au6) it.next()).S().isEmpty()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                k16 b = ((ck1) ib4.b()).b(uq42);
                b.getClass();
                u04 s2 = h03.s(am6, b);
                pj3 pj3 = (pj3) am6.x;
                uq4 c = b.c();
                pj3.j.getClass();
                lj3 u1 = lj3.u1(ql4, s2, c, td0.F(b), true);
                vw3 h0 = ((wr0) am6.A).h0(b.f(), sg3.b0(fq7.x, false, (q14) null, 6));
                qz3 p2 = p();
                fl4.w.getClass();
                us1 us1 = vs1.e;
                a42 a42 = a42.w;
                u1.t1((qz3) null, p2, a42, a42, a42, h0, fl4.z, us1, (Map) null);
                u1.Z = 1;
                pj3.g.getClass();
                arrayList.add(u1);
            }
        }
        ((xb4) ((pj3) am6.x).x).getClass();
        ql4.getClass();
        uq42.getClass();
        am6.getClass();
    }

    public final ck1 k() {
        return new zp0(this.o, jo3.J);
    }

    public final void m(LinkedHashSet linkedHashSet, uq4 uq4) {
        uq4.getClass();
        LinkedHashSet<xs2> I = I(uq4);
        ArrayList arrayList = mz6.a;
        if (!mz6.j.contains(uq4)) {
            int i = vd0.l;
            if (!mz6.e.contains(uq4)) {
                if (!I.isEmpty()) {
                    for (xs2 i2 : I) {
                        if (i2.i()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : I) {
                    if (L((au6) next)) {
                        arrayList2.add(next);
                    }
                }
                w(linkedHashSet, uq4, arrayList2, false);
                return;
            }
        }
        int i3 = wv6.y;
        wv6 f = ub5.f();
        uq4 uq42 = uq4;
        LinkedHashSet F = rj1.F(r62.h, this.n, uq42, ((lz4) ((pj3) this.b.x).u).d, I, a42.w);
        LinkedHashSet linkedHashSet2 = I;
        o0 o0Var = new o0(1, this, a14.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 24);
        uq4 uq43 = uq4;
        o0 o0Var2 = o0Var;
        LinkedHashSet linkedHashSet3 = F;
        x(uq43, linkedHashSet, linkedHashSet3, linkedHashSet, o0Var2);
        o0 o0Var3 = new o0(1, this, a14.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 25);
        wv6 wv6 = f;
        LinkedHashSet linkedHashSet4 = linkedHashSet;
        x(uq4, linkedHashSet4, linkedHashSet3, wv6, o0Var3);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : linkedHashSet2) {
            if (L((au6) next2)) {
                arrayList3.add(next2);
            }
        }
        w(linkedHashSet, uq4, dt0.M0(arrayList3, wv6), true);
    }

    public final void n(uq4 uq4, ArrayList arrayList) {
        uq4 uq42;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList2 = arrayList;
        uq4.getClass();
        boolean isAnnotation = this.o.a.isAnnotation();
        am6 am6 = this.b;
        if (isAnnotation) {
            uq42 = uq4;
            h16 h16 = (h16) dt0.R0(((ck1) this.e.b()).c(uq42));
            if (h16 != null) {
                u04 s2 = h03.s(am6, h16);
                us1 q2 = i35.q(h16.e());
                uq4 c = h16.c();
                ((pj3) am6.x).j.getClass();
                oj3 n1 = oj3.n1(this.n, s2, q2, false, c, td0.F(h16), false);
                fr5 w = fd1.w(n1, me6.x);
                n1.j1(w, (jr5) null, (lc2) null, (lc2) null);
                am6.getClass();
                vw3 l = m14.l(h16, new am6((pj3) am6.x, (up7) new r14(am6, n1, h16, 0), (nz3) am6.z));
                qz3 p2 = p();
                a42 a42 = a42.w;
                n1.m1(l, a42, p2, (qz3) null, a42);
                w.I = l;
                arrayList2.add(n1);
            }
        } else {
            uq42 = uq4;
        }
        Set J = J(uq4);
        if (!J.isEmpty()) {
            int i = wv6.y;
            wv6 f = ub5.f();
            wv6 f2 = ub5.f();
            y(J, arrayList2, f, new z04(this, 0));
            if (f.isEmpty()) {
                linkedHashSet = dt0.g1(J);
            } else if (f instanceof Set) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (Object next : J) {
                    if (!f.contains(next)) {
                        linkedHashSet2.add(next);
                    }
                }
                linkedHashSet = linkedHashSet2;
            } else {
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(J);
                linkedHashSet3.removeAll(f);
                linkedHashSet = linkedHashSet3;
            }
            y(linkedHashSet, f2, (wv6) null, new z04(this, 1));
            LinkedHashSet o2 = wn6.o(J, f2);
            pj3 pj3 = (pj3) am6.x;
            r62 r62 = pj3.f;
            h95 h95 = ((lz4) pj3.u).d;
            arrayList2.addAll(rj1.F(r62, this.n, uq42, h95, o2, arrayList2));
        }
    }

    public final Set o(is1 is1) {
        is1.getClass();
        if (this.o.a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((ck1) this.e.b()).f());
        Collection<vw3> e = this.n.n().e();
        e.getClass();
        for (vw3 R : e) {
            it0.h0(linkedHashSet, R.R().g());
        }
        return linkedHashSet;
    }

    public final qz3 p() {
        ql4 ql4 = this.n;
        if (ql4 != null) {
            int i = rs1.a;
            return ql4.Q();
        }
        rs1.a(0);
        throw null;
    }

    public final vj1 q() {
        return this.n;
    }

    public final boolean r(lj3 lj3) {
        if (this.o.a.isAnnotation()) {
            return false;
        }
        return L(lj3);
    }

    public final l14 s(h16 h16, ArrayList arrayList, vw3 vw3, List list) {
        h16.getClass();
        ((pj3) this.b.x).e.getClass();
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new l14(vw3, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"}));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void v(ArrayList arrayList, fi3 fi3, int i, h16 h16, vw3 vw3, vw3 vw32) {
        Object obj;
        boolean z;
        vw3 vw33 = vw3;
        vw3 vw34 = vw32;
        qm qmVar = me6.x;
        uq4 c = h16.c();
        du7 du7 = null;
        if (vw33 != null) {
            du7 g = iq7.g(vw33, false);
            h16 h162 = h16;
            Object defaultValue = h162.a.getDefaultValue();
            if (defaultValue != null) {
                Class<?> cls = defaultValue.getClass();
                List list = m06.a;
                if (Enum.class.isAssignableFrom(cls)) {
                    obj = new d16((uq4) null, (Enum) defaultValue);
                } else if (defaultValue instanceof Annotation) {
                    obj = new p06((uq4) null, (Annotation) defaultValue);
                } else if (defaultValue instanceof Object[]) {
                    obj = new q06((uq4) null, (Object[]) defaultValue);
                } else if (defaultValue instanceof Class) {
                    obj = new z06((uq4) null, (Class) defaultValue);
                } else {
                    obj = new f16((uq4) null, defaultValue);
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (vw34 != null) {
                du7 = iq7.g(vw34, false);
            }
            ((pj3) this.b.x).j.getClass();
            arrayList.add(new h28(fi3, (h28) null, i, qmVar, c, g, z, false, false, du7, td0.F(h162)));
            return;
        }
        iq7.a(2);
        throw null;
    }

    public final void w(LinkedHashSet linkedHashSet, uq4 uq4, ArrayList arrayList, boolean z) {
        pj3 pj3 = (pj3) this.b.x;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        LinkedHashSet<au6> F = rj1.F(pj3.f, this.n, uq4, ((lz4) pj3.u).d, arrayList, linkedHashSet2);
        if (!z) {
            linkedHashSet2.addAll(F);
            return;
        }
        ArrayList M0 = dt0.M0(linkedHashSet2, F);
        ArrayList arrayList2 = new ArrayList(et0.e0(F, 10));
        for (au6 au6 : F) {
            au6 au62 = (au6) n85.i(au6);
            if (au62 != null) {
                au6 = A(au6, au62, M0);
            }
            arrayList2.add(au6);
        }
        linkedHashSet2.addAll(arrayList2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0004 A[SYNTHETIC] */
    public final void x(uq4 uq4, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, vr2 vr2) {
        au6 au6;
        xs2 a;
        au6 au62;
        Object obj;
        au6 au63;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            au6 au64 = (au6) it.next();
            au6 au65 = (au6) n85.h(au64);
            au6 au66 = null;
            if (au65 != null) {
                String g = n85.g(au65);
                g.getClass();
                Iterator it2 = ((Collection) vr2.y(uq4.e(g))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ws2 r0 = ((au6) it2.next()).r0();
                    r0.J(uq4);
                    r0.N();
                    r0.j();
                    xs2 build = r0.build();
                    build.getClass();
                    au6 au67 = (au6) build;
                    if (E(au65, au67)) {
                        au6 = A(au67, au65, linkedHashSet);
                        break;
                    }
                }
                if (au6 != null) {
                    abstractSet.add(au6);
                }
                a = vd0.a(au64);
                if (a != null) {
                    uq4 name = ((wj1) a).getName();
                    name.getClass();
                    Iterator it3 = ((Iterable) vr2.y(name)).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        if (K((au6) obj, a)) {
                            break;
                        }
                    }
                    au6 au68 = (au6) obj;
                    if (au68 != null) {
                        ws2 r02 = au68.r0();
                        List<h28> S = a.S();
                        S.getClass();
                        ArrayList arrayList = new ArrayList(et0.e0(S, 10));
                        for (h28 b : S) {
                            arrayList.add(b.b());
                        }
                        List S2 = au68.S();
                        S2.getClass();
                        r02.a(wn6.f(arrayList, S2, a));
                        r02.N();
                        r02.j();
                        r02.o();
                        au63 = (au6) r02.build();
                    } else {
                        au63 = null;
                    }
                    if (au63 != null) {
                        if (!L(au63)) {
                            au63 = null;
                        }
                        if (au63 != null) {
                            au62 = A(au63, a, linkedHashSet);
                            if (au62 != null) {
                                abstractSet.add(au62);
                            }
                            if (au64.i()) {
                                uq4 name2 = au64.getName();
                                name2.getClass();
                                Iterator it4 = ((Iterable) vr2.y(name2)).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        au6 B = B((au6) it4.next());
                                        if (B == null || !D(B, au64)) {
                                            B = null;
                                            continue;
                                        }
                                        if (B != null) {
                                            au66 = B;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (au66 != null) {
                                abstractSet.add(au66);
                            }
                        }
                    }
                }
                au62 = null;
                if (au62 != null) {
                }
                if (au64.i()) {
                }
                if (au66 != null) {
                }
            }
            au6 = null;
            if (au6 != null) {
            }
            a = vd0.a(au64);
            if (a != null) {
            }
            au62 = null;
            if (au62 != null) {
            }
            if (au64.i()) {
            }
            if (au66 != null) {
            }
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, wv6 wv6, vr2 vr2) {
        oj3 oj3;
        au6 au6;
        boolean z;
        jr5 jr5;
        wv6 wv62 = wv6;
        vr2 vr22 = vr2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cr5 cr5 = (cr5) it.next();
            if (!C(cr5, vr22)) {
                oj3 = null;
            } else {
                au6 G = G(cr5, vr22);
                G.getClass();
                if (cr5.a0()) {
                    au6 = H(cr5, vr22);
                    au6.getClass();
                } else {
                    au6 = null;
                }
                if (au6 != null) {
                    au6.o();
                    G.o();
                }
                ql4 ql4 = this.n;
                ql4.getClass();
                qm qmVar = me6.x;
                fl4 o2 = G.o();
                us1 f = G.f();
                if (au6 != null) {
                    z = true;
                } else {
                    z = false;
                }
                oj3 oj32 = new oj3(ql4, qmVar, o2, f, z, cr5.getName(), G.e(), (cr5) null, 1, false, (yb5) null);
                vw3 vw3 = G.C;
                vw3.getClass();
                qz3 p2 = p();
                a42 a42 = a42.w;
                oj32.m1(vw3, a42, p2, (qz3) null, a42);
                fr5 C = fd1.C(oj32, G.getAnnotations(), false, G.e());
                C.H = G;
                C.i1(oj32.b());
                if (au6 != null) {
                    List S = au6.S();
                    S.getClass();
                    h28 h28 = (h28) dt0.y0(S);
                    if (h28 != null) {
                        jr5 = fd1.D(oj32, au6.getAnnotations(), h28.getAnnotations(), false, au6.f(), au6.e());
                        jr5.H = au6;
                    } else {
                        rf2.z("No parameter found for ", au6);
                        return;
                    }
                } else {
                    jr5 = null;
                }
                oj32.j1(C, jr5, (lc2) null, (lc2) null);
                oj3 = oj32;
            }
            AbstractCollection abstractCollection2 = abstractCollection;
            if (oj3 != null) {
                abstractCollection2.add(oj3);
                if (wv62 != null) {
                    wv62.add(cr5);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        ql4 ql4 = this.n;
        if (z) {
            Collection e = ql4.n().e();
            e.getClass();
            return e;
        }
        ((lz4) ((pj3) this.b.x).u).getClass();
        ql4.getClass();
        Collection e2 = ql4.n().e();
        e2.getClass();
        return e2;
    }
}
