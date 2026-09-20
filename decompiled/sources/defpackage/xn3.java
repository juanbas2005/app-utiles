package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xn3 implements u9, gj5 {
    public static final /* synthetic */ yr3[] D;
    public final fb4 A;
    public final ib4 B;
    public final fb4 C;
    public final tl4 w;
    public final ib4 x;
    public final fu6 y;
    public final ib4 z;

    static {
        Class<xn3> cls = xn3.class;
        D = new yr3[]{new gr5(cls, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new gr5(cls, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new gr5(cls, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r11v5, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r10v3, types: [ib4, hb4] */
    public xn3(tl4 tl4, kb4 kb4, k3 k3Var) {
        this.w = tl4;
        this.x = new hb4(kb4, k3Var);
        kb4 kb42 = kb4;
        cq0 cq0 = new cq0(new c42(tl4, new up2("java.io"), 1), uq4.e("Serializable"), fl4.A, iq0.x, sg3.D(new l44(kb4, new vn3(this, 1))), kb42);
        cq0.C0(ii4.b, g42.w, (wp0) null);
        this.y = cq0.g0();
        this.z = new hb4(kb42, new p3(this, false, kb42, 15));
        this.A = new fb4(kb42, new ConcurrentHashMap(3, 1.0f, 2), new e18(6), 0);
        this.B = new hb4(kb42, new vn3(this, 0));
        this.C = kb42.b(new b0(18, this));
    }

    public final w04 a(ql4 ql4) {
        up2 a;
        if (ql4 != null) {
            if (!fv3.b(ql4, m27.a) && fv3.J(ql4)) {
                int i = ts1.a;
                vp2 f = rs1.f(ql4);
                f.getClass();
                if (f.d()) {
                    String str = tj3.a;
                    gq0 h = tj3.h(f);
                    if (!(h == null || (a = h.a()) == null)) {
                        ql4 J = rd3.J(b().a, a);
                        if (J instanceof w04) {
                            return (w04) J;
                        }
                    }
                }
            }
            return null;
        }
        fv3.a(108);
        throw null;
    }

    public final tn3 b() {
        return (tn3) p25.q(this.x, D[0]);
    }

    public final Collection d(ql4 ql4) {
        ql4 ql42;
        String str;
        String str2;
        vp2 vp2;
        hz2 hz2 = hz2.N;
        if (ql4.v() == iq0.w) {
            b().getClass();
            w04 a = a(ql4);
            if (a != null) {
                up2 g = ts1.g(a);
                ob2 ob2 = ob2.f;
                ob2.getClass();
                String str3 = tj3.a;
                gq0 g2 = tj3.g(g);
                if (g2 != null) {
                    ql42 = ob2.j(g2.a());
                } else {
                    ql42 = null;
                }
                if (ql42 != null) {
                    dq7 dq7 = new dq7(gr8.E(ql42, a));
                    ArrayList arrayList = new ArrayList();
                    for (Object next : (List) a.M.q.b()) {
                        wp0 wp0 = (wp0) next;
                        if (wp0.f().a.x) {
                            Collection l = ql42.l();
                            l.getClass();
                            Iterable iterable = l;
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                Iterator it = iterable.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    wp0 wp02 = (wp0) it.next();
                                    wp02.getClass();
                                    if (h95.j(wp02, wp0.h(dq7)) == 1) {
                                        break;
                                    }
                                }
                            }
                            if (wp0.S().size() == 1) {
                                List S = wp0.S();
                                S.getClass();
                                vq0 u = ((h28) dt0.Q0(S)).b().L().u();
                                if (u != null) {
                                    int i = ts1.a;
                                    vp2 = rs1.f(u);
                                    vp2.getClass();
                                } else {
                                    vp2 = null;
                                }
                                vp2 f = rs1.f(ql4);
                                f.getClass();
                                if (sg3.e(vp2, f)) {
                                }
                            }
                            if (!fv3.D(wp0)) {
                                LinkedHashSet linkedHashSet = ao3.f;
                                String g3 = dh4.g(wp0, 3);
                                String str4 = tj3.a;
                                gq0 h = tj3.h(ts1.g(a).a);
                                if (h != null) {
                                    str2 = co3.c(h);
                                } else {
                                    str2 = ed1.j(a, hz2);
                                }
                                if (!linkedHashSet.contains(str2 + '.' + g3)) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        wp0 wp03 = (wp0) it2.next();
                        wp03.getClass();
                        ys2 l1 = wp03.l1(dq7.b);
                        ql4 ql43 = ql4;
                        l1.x = ql43;
                        l1.C(ql43.g0());
                        l1.K = true;
                        l1.w = dq7.a;
                        LinkedHashSet linkedHashSet2 = ao3.g;
                        String g4 = dh4.g(wp03, 3);
                        String str5 = tj3.a;
                        gq0 h2 = tj3.h(ts1.g(a).a);
                        if (h2 != null) {
                            str = co3.c(h2);
                        } else {
                            str = ed1.j(a, hz2);
                        }
                        if (!linkedHashSet2.contains(str + '.' + g4)) {
                            l1.r((rm) p25.q(this.B, D[2]));
                        }
                        zs2 i1 = l1.T.i1(l1);
                        i1.getClass();
                        arrayList2.add((wp0) i1);
                    }
                    return arrayList2;
                }
            }
        }
        return a42.w;
    }

    public final Collection g(ql4 ql4) {
        Collection collection;
        ql4.getClass();
        b().getClass();
        w04 a = a(ql4);
        if (a == null || (collection = a.C0().c()) == null) {
            collection = g42.w;
        }
        return collection;
    }

    public final boolean h(ql4 ql4, tt1 tt1) {
        ql4.getClass();
        w04 a = a(ql4);
        if (a == null || !tt1.getAnnotations().i(hj5.a)) {
            return true;
        }
        b().getClass();
        String g = dh4.g(tt1, 3);
        a14 C0 = a.C0();
        uq4 name = tt1.getName();
        name.getClass();
        Iterable<au6> b = C0.b(name, oz4.w);
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (au6 g2 : b) {
            if (dh4.g(g2, 3).equals(g)) {
                return true;
            }
        }
        return false;
    }

    public final Collection j(ql4 ql4) {
        int i = ts1.a;
        vp2 f = rs1.f(ql4);
        f.getClass();
        LinkedHashSet linkedHashSet = ao3.a;
        vp2 vp2 = m27.g;
        boolean equals = f.equals(vp2);
        boolean z2 = false;
        fu6 fu6 = this.y;
        if (!equals) {
            HashMap hashMap = m27.g0;
            if (hashMap.get(f) == null) {
                if (f.equals(vp2) || hashMap.get(f) != null) {
                    z2 = true;
                } else {
                    String str = tj3.a;
                    gq0 h = tj3.h(f);
                    if (h != null) {
                        try {
                            z2 = Serializable.class.isAssignableFrom(Class.forName(h.a().a.a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                if (z2) {
                    return sg3.D(fu6);
                }
                return a42.w;
            }
        }
        return sg3.E((fu6) p25.q(this.z, D[1]), fu6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: a42} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0261 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012b  */
    public final Collection k(uq4 uq4, ql4 ql4) {
        au6 au6;
        rm rmVar;
        ql4 ql42;
        Iterable iterable;
        Object obj;
        ql4 ql43;
        String str;
        boolean z2;
        uq4.getClass();
        ql4.getClass();
        boolean equals = uq4.equals(hs0.e);
        oz4 oz4 = oz4.w;
        yr3[] yr3Arr = D;
        a42<au6> a42 = a42.w;
        if (!equals || !(ql4 instanceof gt1) || (!fv3.b(ql4, m27.g) && fv3.s(ql4) == null)) {
            b().getClass();
            w04 a = a(ql4);
            if (a != null) {
                up2 g = ts1.g(a);
                ob2 ob2 = ob2.f;
                ob2.getClass();
                String str2 = tj3.a;
                gq0 g2 = tj3.g(g);
                if (g2 != null) {
                    ql42 = ob2.j(g2.a());
                } else {
                    ql42 = null;
                }
                if (ql42 == null) {
                    iterable = g42.w;
                } else {
                    vp2 f = rs1.f(ql42);
                    f.getClass();
                    up2 i = tj3.i(f);
                    if (i == null) {
                        iterable = wn6.w(ql42);
                    } else {
                        iterable = sg3.E(ql42, ob2.j(i));
                    }
                }
                Iterable<ql4> iterable2 = iterable;
                if (iterable2 instanceof List) {
                    List list = (List) iterable2;
                    if (!list.isEmpty()) {
                        obj = list.get(list.size() - 1);
                        ql43 = (ql4) obj;
                        if (ql43 != null) {
                            int i2 = wv6.y;
                            ArrayList arrayList = new ArrayList(et0.e0(iterable2, 10));
                            for (ql4 g3 : iterable2) {
                                arrayList.add(ts1.g(g3));
                            }
                            wv6 wv6 = new wv6(0);
                            wv6.addAll(arrayList);
                            String str3 = tj3.a;
                            boolean containsKey = tj3.j.containsKey(rs1.f(ql4));
                            up2 g4 = ts1.g(a);
                            p3 p3Var = new p3(a, false, ql43, 16);
                            fb4 fb4 = this.A;
                            fb4.getClass();
                            Object y2 = fb4.y(new gb4(g4, p3Var));
                            if (y2 != null) {
                                ji4 n0 = ((ql4) y2).n0();
                                n0.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object next : n0.b(uq4, oz4)) {
                                    au6 au62 = (au6) next;
                                    if (au62.u() == 1 && au62.f().a.x && !fv3.D(au62)) {
                                        Iterable s = au62.s();
                                        if (!(s instanceof Collection) || !((Collection) s).isEmpty()) {
                                            Iterator it = s.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                vj1 r = ((xs2) it.next()).r();
                                                r.getClass();
                                                if (wv6.contains(ts1.g(r))) {
                                                    break;
                                                }
                                            }
                                        }
                                        vj1 r2 = au62.r();
                                        r2.getClass();
                                        ql4 ql44 = (ql4) r2;
                                        String g5 = dh4.g(au62, 3);
                                        LinkedHashSet linkedHashSet = ao3.e;
                                        String str4 = tj3.a;
                                        gq0 h = tj3.h(ts1.g(ql44).a);
                                        if (h != null) {
                                            str = co3.c(h);
                                        } else {
                                            str = ed1.j(ql44, hz2.N);
                                        }
                                        if (linkedHashSet.contains(str + '.' + g5) ^ containsKey) {
                                            z2 = true;
                                        } else {
                                            Boolean s2 = dh4.s(sg3.D(au62), hz2.E, new e18(5, this));
                                            s2.getClass();
                                            z2 = s2.booleanValue();
                                        }
                                        if (!z2) {
                                            arrayList2.add(next);
                                        }
                                    }
                                }
                                a42 = arrayList2;
                            } else {
                                fb4.a(3);
                                throw null;
                            }
                        }
                    }
                } else {
                    Iterator it2 = iterable2.iterator();
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        while (it2.hasNext()) {
                            next2 = it2.next();
                        }
                        obj = next2;
                        ql43 = (ql4) obj;
                        if (ql43 != null) {
                        }
                    }
                }
                obj = null;
                ql43 = (ql4) obj;
                if (ql43 != null) {
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (au6 au63 : a42) {
                vj1 r3 = au63.r();
                r3.getClass();
                xs2 h2 = au63.h(new dq7(gr8.E((ql4) r3, ql4)));
                h2.getClass();
                ws2 r0 = ((au6) h2).r0();
                r0.H(ql4);
                r0.i(ql4.Q());
                r0.j();
                vj1 r4 = au63.r();
                r4.getClass();
                Object j = dh4.j(sg3.D((ql4) r4), new ns8(25, (Object) this), new nd1(dh4.g(au63, 3), new Object(), 2));
                j.getClass();
                int ordinal = ((wn3) j).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            uq4 name = au63.getName();
                            boolean e = sg3.e(name, yn3.a);
                            fb4 fb42 = this.C;
                            if (e) {
                                rmVar = (rm) fb42.y(new yb5(au63.getName().b(), "first"));
                            } else if (sg3.e(name, yn3.b)) {
                                rmVar = (rm) fb42.y(new yb5(au63.getName().b(), "last"));
                            } else {
                                ku4.x("Unexpected name: ", au63.getName());
                                return null;
                            }
                            r0.r(rmVar);
                        } else if (ordinal == 3) {
                            r0.r((rm) p25.q(this.B, yr3Arr[2]));
                        } else if (ordinal != 4) {
                            h.c();
                            return null;
                        }
                    }
                    xs2 build = r0.build();
                    build.getClass();
                    au6 = (au6) build;
                    if (au6 != null) {
                        arrayList3.add(au6);
                    }
                } else if (ql4.o() != fl4.x || ql4.v() == iq0.y) {
                    r0.p();
                    xs2 build2 = r0.build();
                    build2.getClass();
                    au6 = (au6) build2;
                    if (au6 != null) {
                    }
                }
                au6 = null;
                if (au6 != null) {
                }
            }
            return arrayList3;
        }
        gt1 gt1 = (gt1) ql4;
        List<js5> list2 = gt1.A.M;
        list2.getClass();
        if (!list2.isEmpty()) {
            for (js5 js5 : list2) {
                if (t49.P((vq4) gt1.H.b, js5.B).equals(hs0.e)) {
                    return a42;
                }
            }
        }
        ws2 r02 = ((au6) dt0.P0(((fu6) p25.q(this.z, yr3Arr[1])).R().b(uq4, oz4))).r0();
        r02.H(gt1);
        r02.v(vs1.e);
        r02.C(gt1.g0());
        r02.i(gt1.Q());
        xs2 build3 = r02.build();
        build3.getClass();
        return sg3.D((au6) build3);
    }
}
