package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fk6 {
    public final ll4 a;
    public final boolean b;
    public final uy3 c;
    public final ak6 d;
    public fk6 e;
    public final int f;

    public fk6(ll4 ll4, boolean z, uy3 uy3, ak6 ak6) {
        this.a = ll4;
        this.b = z;
        this.c = uy3;
        this.d = ak6;
        this.f = uy3.x;
    }

    public static /* synthetic */ List j(int i, fk6 fk6) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !fk6.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return fk6.i(z, z2);
    }

    public final ly5 a(xz4 xz4) {
        ll4 ll4;
        fk6 l = l();
        if (l == null) {
            return ly5.e;
        }
        ll4 ll42 = (ll4) l.c.a0.g;
        xz4 xz42 = null;
        if ((ll42.z & 8) != 0) {
            loop0:
            while (true) {
                if (ll42 != null) {
                    if ((ll42.y & 8) != 0) {
                        ll4 = ll42;
                        eq4 eq4 = null;
                        while (true) {
                            if (ll4 == null) {
                                break;
                            }
                            if (ll4 instanceof dk6) {
                                if (((dk6) ll4).h()) {
                                    break loop0;
                                }
                            } else if ((ll4.y & 8) != 0 && (ll4 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll43 = ((wo1) ll4).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll4 = ll43;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll4 != null) {
                                                eq4.b(ll4);
                                                ll4 = null;
                                            }
                                            eq4.b(ll43);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll4 = rc9.j(eq4);
                        }
                    }
                    if ((ll42.z & 8) == 0) {
                        break;
                    }
                    ll42 = ll42.B;
                } else {
                    break;
                }
            }
        }
        ll4 = null;
        dk6 dk6 = (dk6) ll4;
        if (dk6 != null) {
            xz42 = rc9.M0(dk6, 8);
        }
        if (xz42 == null) {
            return l.a(xz4);
        }
        return xz42.Q(xz4, true);
    }

    public final fk6 b(s86 s86, vr2 vr2) {
        int i;
        ak6 ak6 = new ak6();
        ak6.y = false;
        ak6.z = false;
        vr2.y(ak6);
        ek6 ek6 = new ek6(vr2);
        int i2 = this.f;
        if (s86 != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        fk6 fk6 = new fk6(ek6, false, new uy3(true, i2 + i), ak6);
        fk6.e = this;
        return fk6;
    }

    public final void c(uy3 uy3, ArrayList arrayList) {
        eq4 y = uy3.y();
        Object[] objArr = y.w;
        int i = y.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy32 = (uy3) objArr[i2];
            if (uy32.J() && !uy32.j0) {
                if (uy32.a0.f(8)) {
                    arrayList.add(h75.b(uy32, this.b));
                } else {
                    c(uy32, arrayList);
                }
            }
        }
    }

    public final xz4 d() {
        if (o()) {
            fk6 l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        dk6 f2 = f();
        if (f2 != null) {
            return rc9.M0(f2, 8);
        }
        return (hc3) this.c.a0.d;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            fk6 fk6 = (fk6) arrayList.get(size2);
            if (fk6.p()) {
                arrayList2.add(fk6);
            } else if (!fk6.d.z) {
                fk6.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: dk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: ll4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: ll4} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final dk6 f() {
        ll4 ll4;
        boolean z;
        boolean z2 = this.d.y;
        ll4 ll42 = null;
        uy3 uy3 = this.c;
        if (z2) {
            ll4 ll43 = (ll4) uy3.a0.g;
            if ((ll43.z & 8) != 0) {
                ll4 = null;
                while (ll43 != null) {
                    if ((ll43.y & 8) != 0) {
                        ll4 ll44 = ll43;
                        eq4 eq4 = null;
                        while (ll44 != null) {
                            if (ll44 instanceof dk6) {
                                dk6 dk6 = (dk6) ll44;
                                if (dk6.h()) {
                                    if (dk6.G0()) {
                                        return dk6;
                                    }
                                    if (ll4 == null) {
                                        ll4 = dk6;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (ll44.y & 8) != 0 && (ll44 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll45 = ((wo1) ll44).L; ll45 != null; ll45 = ll45.B) {
                                    if ((ll45.y & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll44 = ll45;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll44 != null) {
                                                eq4.b(ll44);
                                                ll44 = null;
                                            }
                                            eq4.b(ll45);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll44 = rc9.j(eq4);
                        }
                    }
                    if ((ll43.z & 8) == 0) {
                        break;
                    }
                    ll43 = ll43.B;
                }
            }
            return (dk6) ll42;
        }
        ll4 ll46 = (ll4) uy3.a0.g;
        if ((ll46.z & 8) != 0) {
            loop3:
            while (true) {
                if (ll46 != null) {
                    if ((ll46.y & 8) != 0) {
                        ll4 = ll46;
                        eq4 eq42 = null;
                        while (true) {
                            if (ll4 == null) {
                                break;
                            }
                            if (ll4 instanceof dk6) {
                                if (((dk6) ll4).h()) {
                                    break loop3;
                                }
                            } else if ((ll4.y & 8) != 0 && (ll4 instanceof wo1)) {
                                int i2 = 0;
                                for (ll4 ll47 = ((wo1) ll4).L; ll47 != null; ll47 = ll47.B) {
                                    if ((ll47.y & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            ll4 = ll47;
                                        } else {
                                            if (eq42 == null) {
                                                eq42 = new eq4(new ll4[16]);
                                            }
                                            if (ll4 != null) {
                                                eq42.b(ll4);
                                                ll4 = null;
                                            }
                                            eq42.b(ll47);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            ll4 = rc9.j(eq42);
                        }
                    }
                    if ((ll46.z & 8) == 0) {
                        break;
                    }
                    ll46 = ll46.B;
                } else {
                    break;
                }
            }
        }
        return (dk6) ll42;
        ll42 = ll4;
        return (dk6) ll42;
    }

    public final ly5 g() {
        xz4 d2 = d();
        if (d2 != null) {
            if (!d2.c1().J) {
                d2 = null;
            }
            if (d2 != null) {
                return t49.I(d2).Q(d2, true);
            }
        }
        return ly5.e;
    }

    public final ly5 h() {
        xz4 d2 = d();
        if (d2 != null) {
            if (!d2.c1().J) {
                d2 = null;
            }
            if (d2 != null) {
                return t49.v(d2, true);
            }
        }
        return ly5.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.z) {
            return a42.w;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final ak6 k() {
        boolean p = p();
        ak6 ak6 = this.d;
        if (!p) {
            return ak6;
        }
        ak6 g = ak6.g();
        r(new ArrayList(), g);
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    public final fk6 l() {
        uy3 uy3;
        fk6 fk6 = this.e;
        if (fk6 != null) {
            return fk6;
        }
        uy3 uy32 = this.c;
        boolean z = this.b;
        if (z) {
            uy3 = uy32.v();
            while (true) {
                if (uy3 != null) {
                    ak6 x = uy3.x();
                    if (x != null && x.y) {
                        break;
                    }
                    uy3 = uy3.v();
                } else {
                    break;
                }
            }
            if (uy3 == null) {
                uy3 v = uy32.v();
                while (true) {
                    if (v == null) {
                        uy3 = null;
                        break;
                    } else if (v.a0.f(8)) {
                        uy3 = v;
                        break;
                    } else {
                        v = v.v();
                    }
                }
            }
            if (uy3 != null) {
                return null;
            }
            return h75.b(uy3, z);
        }
        uy3 = null;
        if (uy3 == null) {
        }
        if (uy3 != null) {
        }
    }

    public final ly5 m() {
        boolean z;
        dk6 f2 = f();
        if (f2 == null) {
            return ((hc3) this.c.a0.d).y1();
        }
        ll4 ll4 = ((ll4) f2).w;
        Object g = this.d.w.g(zj6.b);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            z = true;
        } else {
            z = false;
        }
        return g75.y(ll4, z, true);
    }

    public final ak6 n() {
        return this.d;
    }

    public final boolean o() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (!this.b || !this.d.y) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        uy3 v = this.c.v();
        while (true) {
            if (v == null) {
                v = null;
                break;
            }
            ak6 x = v.x();
            if (x != null && x.y) {
                break;
            }
            v = v.v();
        }
        if (v == null) {
            return true;
        }
        return false;
    }

    public final void r(ArrayList arrayList, ak6 ak6) {
        if (!this.d.z) {
            s(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                fk6 fk6 = (fk6) arrayList.get(size2);
                if (!fk6.p()) {
                    ak6.l(fk6.d);
                    fk6.r(arrayList, ak6);
                }
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        String str;
        if (o()) {
            return a42.w;
        }
        c(this.c, arrayList);
        if (z) {
            ak6 ak6 = this.d;
            tp4 tp4 = ak6.w;
            Object g = tp4.g(jk6.z);
            if (g == null) {
                g = null;
            }
            s86 s86 = (s86) g;
            if (s86 != null && ak6.y && !arrayList.isEmpty()) {
                arrayList.add(b(s86, new pb(18, s86)));
            }
            nk6 nk6 = jk6.a;
            if (tp4.c(nk6) && !arrayList.isEmpty() && ak6.y) {
                Object g2 = tp4.g(nk6);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) dt0.y0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b((s86) null, new pb(19, str)));
                }
            }
        }
        return arrayList;
    }
}
