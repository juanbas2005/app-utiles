package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: m14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class m14 extends ki4 {
    public static final /* synthetic */ yr3[] m;
    public final am6 b;
    public final m14 c;
    public final db4 d;
    public final ib4 e;
    public final fb4 f;
    public final m70 g;
    public final fb4 h;
    public final ib4 i;
    public final ib4 j;
    public final ib4 k;
    public final fb4 l;

    static {
        Class<m14> cls = m14.class;
        m = new yr3[]{new gr5(cls, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new gr5(cls, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new gr5(cls, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [db4, hb4] */
    /* JADX WARNING: type inference failed for: r2v0, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r1v2, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r1v4, types: [ib4, hb4] */
    public m14(am6 am6, a14 a14) {
        am6.getClass();
        this.b = am6;
        this.c = a14;
        kb4 kb4 = ((pj3) am6.x).a;
        j14 j14 = new j14(this, 0);
        kb4.getClass();
        this.d = new hb4(kb4, j14);
        j14 j142 = new j14(this, 1);
        kb4.getClass();
        this.e = new hb4(kb4, j142);
        this.f = kb4.b(new k14(this, 0));
        this.g = kb4.c(new k14(this, 1));
        this.h = kb4.b(new k14(this, 2));
        j14 j143 = new j14(this, 2);
        kb4.getClass();
        this.i = new hb4(kb4, j143);
        j14 j144 = new j14(this, 3);
        kb4.getClass();
        this.j = new hb4(kb4, j144);
        j14 j145 = new j14(this, 4);
        kb4.getClass();
        this.k = new hb4(kb4, j145);
        this.l = kb4.b(new k14(this, 3));
    }

    public static vw3 l(h16 h16, am6 am6) {
        h16.getClass();
        Class<?> declaringClass = ((Method) h16.b()).getDeclaringClass();
        declaringClass.getClass();
        return ((wr0) am6.A).h0(h16.f(), sg3.b0(fq7.x, declaringClass.isAnnotation(), (q14) null, 6));
    }

    public static v70 u(am6 am6, zs2 zs2, List list) {
        yb5 yb5;
        vw3 vw3;
        uq4 uq4;
        uq4 e2;
        r06 r06;
        am6 am62 = am6;
        wr0 wr0 = (wr0) am62.A;
        pj3 pj3 = (pj3) am62.x;
        sl4 sl4 = pj3.o;
        ss h1 = dt0.h1(list);
        ArrayList arrayList = new ArrayList(et0.e0(h1, 10));
        Iterator it = h1.iterator();
        boolean z = false;
        while (true) {
            f02 f02 = (f02) it;
            if (!f02.x.hasNext()) {
                return new v70(4, dt0.b1(arrayList), z);
            }
            ka3 ka3 = (ka3) f02.next();
            int i2 = ka3.a;
            n16 n16 = (n16) ka3.b;
            u04 s = h03.s(am62, n16);
            uq4 uq42 = null;
            wj3 b0 = sg3.b0(fq7.x, false, (q14) null, 7);
            boolean z2 = n16.d;
            l16 l16 = n16.a;
            if (z2) {
                if (l16 instanceof r06) {
                    r06 = (r06) l16;
                } else {
                    r06 = null;
                }
                if (r06 != null) {
                    du7 g0 = wr0.g0(r06, b0, true);
                    yb5 = new yb5(g0, sl4.g().f(g0));
                } else {
                    rf2.z("Vararg parameter should be an array: ", n16);
                    return null;
                }
            } else {
                yb5 = new yb5(wr0.h0(l16, b0), (Object) null);
            }
            vw3 vw32 = (vw3) yb5.w;
            vw3 vw33 = (vw3) yb5.x;
            if (!sg3.e(zs2.getName().b(), "equals") || list.size() != 1 || !sl4.g().p().equals(vw32)) {
                String str = n16.c;
                if (str != null) {
                    uq42 = uq4.d(str);
                }
                if (uq42 == null) {
                    z = true;
                }
                if (uq42 == null) {
                    e2 = uq4.e("p" + i2);
                } else {
                    vw3 = vw32;
                    uq4 = uq42;
                    pj3.j.getClass();
                    arrayList.add(new h28(zs2, (h28) null, i2, s, uq4, vw3, false, false, false, vw33, td0.F(n16)));
                }
            } else {
                e2 = uq4.e("other");
            }
            vw3 = vw32;
            uq4 = e2;
            pj3.j.getClass();
            arrayList.add(new h28(zs2, (h28) null, i2, s, uq4, vw3, false, false, false, vw33, td0.F(n16)));
        }
    }

    public Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        return (Collection) this.d.b();
    }

    public Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        if (!c().contains(uq4)) {
            return a42.w;
        }
        return (Collection) this.h.y(uq4);
    }

    public final Set c() {
        return (Set) p25.q(this.i, m[0]);
    }

    public final Set d() {
        return (Set) p25.q(this.k, m[2]);
    }

    public Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        if (!g().contains(uq4)) {
            return a42.w;
        }
        return (Collection) this.l.y(uq4);
    }

    public final Set g() {
        return (Set) p25.q(this.j, m[1]);
    }

    public abstract Set h(is1 is1, vr2 vr2);

    public abstract Set i(is1 is1, jo3 jo3);

    public void j(uq4 uq4, ArrayList arrayList) {
        uq4.getClass();
    }

    public abstract ck1 k();

    public abstract void m(LinkedHashSet linkedHashSet, uq4 uq4);

    public abstract void n(uq4 uq4, ArrayList arrayList);

    public abstract Set o(is1 is1);

    public abstract qz3 p();

    public abstract vj1 q();

    public boolean r(lj3 lj3) {
        return true;
    }

    public abstract l14 s(h16 h16, ArrayList arrayList, vw3 vw3, List list);

    public final lj3 t(h16 h16) {
        boolean z;
        fl4 fl4;
        h16 h162 = h16;
        h162.getClass();
        am6 am6 = this.b;
        u04 s = h03.s(am6, h162);
        vj1 q = q();
        uq4 c2 = h162.c();
        ((pj3) am6.x).j.getClass();
        sa6 F = td0.F(h162);
        if (((ck1) this.e.b()).b(h162.c()) == null || !((ArrayList) h162.g()).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        lj3 u1 = lj3.u1(q, s, c2, F, z);
        am6.getClass();
        am6 am62 = new am6((pj3) am6.x, (up7) new r14(am6, u1, h162, 0), (nz3) am6.z);
        ArrayList typeParameters = h162.getTypeParameters();
        ArrayList arrayList = new ArrayList(et0.e0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            qp7 d2 = ((up7) am62.y).d((m16) it.next());
            d2.getClass();
            arrayList.add(d2);
        }
        v70 u = u(am62, u1, h162.g());
        l14 s2 = s(h162, arrayList, l(h162, am62), (List) u.y);
        List list = s2.d;
        qz3 p = p();
        ArrayList arrayList2 = s2.c;
        List list2 = s2.b;
        vw3 vw3 = s2.a;
        boolean isAbstract = Modifier.isAbstract(((Method) h162.b()).getModifiers());
        boolean isFinal = Modifier.isFinal(((Method) h162.b()).getModifiers());
        fl4.w.getClass();
        if (isAbstract) {
            fl4 = fl4.A;
        } else if (!isFinal) {
            fl4 = fl4.z;
        } else {
            fl4 = fl4.x;
        }
        u1.t1((qz3) null, p, a42.w, arrayList2, list2, vw3, fl4, i35.q(h162.e()), b42.w);
        u1.K = Modifier.isNative(h162.a.getModifiers());
        u1.v1(false, u.x);
        if (list.isEmpty()) {
            return u1;
        }
        ((pj3) am62.x).e.getClass();
        kj6.n("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
