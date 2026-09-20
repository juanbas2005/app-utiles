package defpackage;

import java.util.List;

/* renamed from: ut1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ut1 extends yj1 implements lt1, wq0 {
    public final kb4 A;
    public final us1 B;
    public List C;
    public final l3 D = new l3(this);
    public final dt5 E;
    public final vq4 F;
    public final wv1 G;
    public final i48 H;
    public final it1 I;
    public fu6 J;
    public fu6 K;
    public List L;
    public fu6 M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut1(kb4 kb4, vj1 vj1, rm rmVar, uq4 uq4, us1 us1, dt5 dt5, vq4 vq4, wv1 wv1, i48 i48, it1 it1) {
        super(vj1, rmVar, uq4, sy6.j);
        kb4.getClass();
        vj1.getClass();
        us1.getClass();
        dt5.getClass();
        vq4.getClass();
        wv1.getClass();
        i48.getClass();
        kb4.getClass();
        vj1.getClass();
        us1.getClass();
        this.A = kb4;
        this.B = us1;
        kb4.a(new k3(0, this));
        this.E = dt5;
        this.F = vq4;
        this.G = wv1;
        this.H = i48;
        this.I = it1;
    }

    public final k2 C() {
        return this.E;
    }

    public final boolean H() {
        return false;
    }

    public final wv1 N() {
        return this.G;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.u(this, obj);
    }

    public final vq4 T() {
        return this.F;
    }

    public final it1 U() {
        return this.I;
    }

    public final us1 f() {
        return this.B;
    }

    public final ql4 f1() {
        if (gr8.N(g1())) {
            return null;
        }
        vq0 u = g1().L().u();
        if (u instanceof ql4) {
            return (ql4) u;
        }
        return null;
    }

    public final fu6 g0() {
        fu6 fu6 = this.M;
        if (fu6 != null) {
            return fu6;
        }
        sg3.a0("defaultTypeImpl");
        throw null;
    }

    public final fu6 g1() {
        fu6 fu6 = this.K;
        if (fu6 != null) {
            return fu6;
        }
        sg3.a0("expandedType");
        throw null;
    }

    public final xj1 h(dq7 dq7) {
        dq7.getClass();
        if (dq7.a.e()) {
            return this;
        }
        vj1 r = r();
        r.getClass();
        rm annotations = getAnnotations();
        annotations.getClass();
        uq4 name = getName();
        name.getClass();
        ut1 ut1 = new ut1(this.A, r, annotations, name, this.B, this.E, this.F, this.G, this.H, this.I);
        List u0 = u0();
        fu6 h1 = h1();
        k28 k28 = k28.y;
        ut1.i1(u0, wn6.c(dq7.f(h1, k28)), wn6.c(dq7.f(g1(), k28)));
        return ut1;
    }

    public final fu6 h1() {
        fu6 fu6 = this.J;
        if (fu6 != null) {
            return fu6;
        }
        sg3.a0("underlyingType");
        throw null;
    }

    public final void i1(List list, fu6 fu6, fu6 fu62) {
        ji4 ji4;
        fu6 fu63;
        fu6.getClass();
        fu62.getClass();
        this.C = list;
        this.J = fu6;
        this.K = fu62;
        this.L = ya5.g(this);
        ql4 f1 = f1();
        if (f1 == null || (ji4 = f1.n0()) == null) {
            ji4 = ii4.b;
        }
        ji4 ji42 = ji4;
        e18 e18 = new e18(3, this);
        v62 v62 = iq7.a;
        if (z62.f(this)) {
            fu63 = z62.c(x62.G, toString());
        } else {
            wo7 n = n();
            if (n != null) {
                List d = iq7.d(((l3) n).getParameters());
                ro7.x.getClass();
                fu63 = kl8.K(ro7.y, n, d, false, ji42, e18);
            } else {
                iq7.a(12);
                throw null;
            }
        }
        this.M = fu63;
    }

    public final boolean m() {
        return false;
    }

    public final wo7 n() {
        return this.D;
    }

    public final boolean p() {
        return iq7.c(h1(), new b0(4, this), (wv6) null);
    }

    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "typealias " + getName().b();
    }

    public final List u0() {
        List list = this.C;
        if (list != null) {
            return list;
        }
        sg3.a0("declaredTypeParametersImpl");
        throw null;
    }

    public final vj1 a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final vq0 m81a() {
        return this;
    }

    public final xj1 e1() {
        return this;
    }
}
