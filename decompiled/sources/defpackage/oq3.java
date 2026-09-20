package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: oq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oq3 extends yq3 implements nv3, gq3, es3, xo7 {
    public static final HashSet z;
    public final Class x;
    public final nz3 y = rg3.y(i44.w, new hq3(this, 0));

    static {
        LinkedHashSet<gq0> linkedHashSet = nz6.a;
        HashSet hashSet = new HashSet();
        for (gq0 a : linkedHashSet) {
            hashSet.add(a.a().a.toString());
        }
        z = hashSet;
    }

    public oq3(Class cls) {
        cls.getClass();
        this.x = cls;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x001a A[SYNTHETIC] */
    public static final List Y(oq3 oq3, ji4 ji4, lq3 lq3) {
        vq1 vq1;
        boolean z2;
        oq3.getClass();
        nq3 nq3 = new nq3(oq3, 0);
        ArrayList arrayList = new ArrayList();
        for (vj1 vj1 : t75.n(ji4, (is1) null, 3)) {
            if (vj1 instanceof ri0) {
                ri0 ri0 = (ri0) vj1;
                if (!sg3.e(ri0.f(), vs1.h)) {
                    boolean z3 = true;
                    if (ri0.u() != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lq3 != lq3.w) {
                        z3 = false;
                    }
                    if (z2 == z3) {
                        vq1 = (vq1) vj1.P(nq3, vs7.a);
                        if (vq1 == null) {
                            arrayList.add(vq1);
                        }
                    }
                }
            }
            vq1 = null;
            if (vq1 == null) {
            }
        }
        return dt0.b1(arrayList);
    }

    public static cq0 Z(gq0 gq0, ra6 ra6) {
        ws1 ws1 = ra6.a;
        c42 c42 = new c42(ws1.b, gq0.a, 0);
        uq4 f = gq0.f();
        List D = sg3.D(ws1.b.g().k("Any").g0());
        kb4 kb4 = ws1.a;
        cq0 cq0 = new cq0(c42, f, fl4.x, iq0.w, D, kb4);
        cq0.C0(new vs2(kb4, cq0, 1), g42.w, (wp0) null);
        return cq0;
    }

    public final String A() {
        y16 y16 = ((kq3) this.y.getValue()).f;
        yr3 yr3 = kq3.w[2];
        return (String) y16.b();
    }

    public final boolean L(Object obj) {
        List list = m06.a;
        Class cls = this.x;
        cls.getClass();
        Integer num = (Integer) m06.d.get(cls);
        if (num != null) {
            return mp7.a0(num.intValue(), obj);
        }
        Class cls2 = (Class) m06.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    public final Collection P() {
        Collection l = c0().l();
        l.getClass();
        return l;
    }

    public final Collection Q() {
        ArrayList arrayList;
        gu3 d0 = d0();
        if (d0 != null) {
            arrayList = d0.h;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return a42.w;
        }
        return arrayList;
    }

    public final Collection R(uq4 uq4) {
        ji4 R = c0().g0().R();
        oz4 oz4 = oz4.x;
        Collection b = R.b(uq4, oz4);
        ji4 L = c0().L();
        L.getClass();
        return dt0.M0(b, L.b(uq4, oz4));
    }

    public final cr5 S(int i) {
        gt1 gt1;
        ql4 c0 = c0();
        if (c0 instanceof gt1) {
            gt1 = (gt1) c0;
        } else {
            gt1 = null;
        }
        if (gt1 != null) {
            tr5 tr5 = gt1.A;
            yu2 yu2 = qp3.h;
            yu2.getClass();
            qs5 qs5 = (qs5) jb5.o(tr5, yu2, i);
            if (qs5 != null) {
                fa4 fa4 = new fa4(this);
                z00 z00 = gt1.H;
                return (cr5) g18.g(this.x, fa4, qs5, (vq4) z00.b, (wv1) z00.d, gt1.B, c0.A);
            }
        }
        return null;
    }

    public final su3 T(int i) {
        ArrayList arrayList;
        gu3 d0 = d0();
        if (d0 == null || (arrayList = tf4.w(d0).a) == null) {
            return null;
        }
        return (su3) dt0.z0(i, arrayList);
    }

    public final Collection V(uq4 uq4) {
        ji4 R = c0().g0().R();
        oz4 oz4 = oz4.x;
        Collection f = R.f(uq4, oz4);
        ji4 L = c0().L();
        L.getClass();
        return dt0.M0(f, L.f(uq4, oz4));
    }

    public final gq0 a0() {
        gq0 gq0 = ta6.a;
        Class cls = this.x;
        cls.getClass();
        ro5 ro5 = null;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (componentType.isPrimitive()) {
                ro5 = zo3.b(componentType.getSimpleName()).c();
            }
            if (ro5 != null) {
                return new gq0(n27.k, ro5.x);
            }
            up2 i = m27.g.i();
            return new gq0(i.b(), i.a.g());
        } else if (cls.equals(Void.TYPE)) {
            return ta6.a;
        } else {
            if (cls.isPrimitive()) {
                ro5 = zo3.b(cls.getSimpleName()).c();
            }
            if (ro5 != null) {
                return new gq0(n27.k, ro5.w);
            }
            gq0 a = m06.a(cls);
            if (!a.c) {
                String str = tj3.a;
                gq0 g = tj3.g(a.a());
                if (g != null) {
                    return g;
                }
            }
            return a;
        }
    }

    public final Class b() {
        return this.x;
    }

    public final hq0 b0() {
        hq0 a;
        gu3 d0 = d0();
        if (d0 != null && (a = su.a(d0)) != null) {
            return a;
        }
        Class cls = this.x;
        if (cls.isAnnotation()) {
            return hq0.B;
        }
        if (cls.isInterface()) {
            return hq0.y;
        }
        if (cls.isEnum()) {
            return hq0.z;
        }
        if (cls.getSuperclass().isEnum()) {
            return hq0.A;
        }
        return hq0.x;
    }

    public final ql4 c0() {
        return ((kq3) this.y.getValue()).b();
    }

    public final gu3 d0() {
        return ((kq3) this.y.getValue()).c();
    }

    public final List e() {
        y16 y16 = ((kq3) this.y.getValue()).k;
        yr3 yr3 = kq3.w[8];
        Object b = y16.b();
        b.getClass();
        return (List) b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oq3) || !kl8.v(this).equals(kl8.v((gq3) obj))) {
            return false;
        }
        return true;
    }

    public final List getAnnotations() {
        y16 y16 = ((kq3) this.y.getValue()).e;
        yr3 yr3 = kq3.w[1];
        Object b = y16.b();
        b.getClass();
        return (List) b;
    }

    public final List getTypeParameters() {
        y16 y16 = ((kq3) this.y.getValue()).i;
        yr3 yr3 = kq3.w[6];
        Object b = y16.b();
        b.getClass();
        return (List) b;
    }

    public final int hashCode() {
        return kl8.v(this).hashCode();
    }

    public final String l() {
        y16 y16 = ((kq3) this.y.getValue()).g;
        yr3 yr3 = kq3.w[3];
        return (String) y16.b();
    }

    public final boolean p() {
        gu3 d0 = d0();
        if (d0 != null) {
            return su.e.C(su.a[10], d0);
        }
        Class cls = this.x;
        if (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) {
            return false;
        }
        return true;
    }

    public final Collection r() {
        y16 y16 = ((kq3) this.y.getValue()).h;
        yr3 yr3 = kq3.w[4];
        Object b = y16.b();
        b.getClass();
        return (Collection) b;
    }

    public final GenericDeclaration s() {
        return this.x;
    }

    public final String toString() {
        String str;
        gq0 a0 = a0();
        up2 up2 = a0.a;
        if (up2.a.c()) {
            str = "";
        } else {
            str = hl6.o(new StringBuilder(), up2.a.a, '.');
        }
        return "class ".concat(str.concat(k57.r0(a0.b.a.a, '.', '$')));
    }

    public final boolean z() {
        gu3 d0 = d0();
        if (d0 == null || !su.f.C(su.a[14], d0)) {
            return false;
        }
        return true;
    }
}
