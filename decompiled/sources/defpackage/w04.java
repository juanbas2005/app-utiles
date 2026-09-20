package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;

/* renamed from: w04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w04 extends aq0 {
    public final am6 C;
    public final x06 D;
    public final ql4 E;
    public final am6 F;
    public final z97 G = new z97(new v04(this, 0));
    public final iq0 H;
    public final fl4 I;
    public final h8 J;
    public final boolean K;
    public final ft1 L;
    public final a14 M;
    public final tg6 N;
    public final fc3 O;
    public final o14 P;
    public final u04 Q;
    public final ib4 R;

    static {
        qs.r1(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [ib4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public w04(am6 am6, vj1 vj1, x06 x06, ql4 ql4) {
        super(r1, vj1, r2, td0.F(x06));
        iq0 iq0;
        h8 h8Var;
        x06 x062;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        am6.getClass();
        vj1.getClass();
        x06.getClass();
        pj3 pj3 = (pj3) am6.x;
        kb4 kb4 = pj3.a;
        uq4 e = x06.e();
        pj3.j.getClass();
        this.C = am6;
        this.D = x06;
        this.E = ql4;
        am6 l = uq3.l(am6, this, x06, 4);
        this.F = l;
        pj3 pj32 = (pj3) l.x;
        kb4 kb42 = pj32.a;
        pj32.g.getClass();
        Class cls = x06.a;
        if (cls.isAnnotation()) {
            iq0 = iq0.A;
        } else if (cls.isInterface()) {
            iq0 = iq0.x;
        } else if (cls.isEnum()) {
            iq0 = iq0.y;
        } else {
            iq0 = iq0.w;
        }
        this.H = iq0;
        boolean isAnnotation = cls.isAnnotation();
        fl4 fl4 = fl4.x;
        if (!isAnnotation && !cls.isEnum()) {
            Boolean S = fd1.S(cls);
            if (S != null) {
                z3 = S.booleanValue();
            } else {
                z3 = false;
            }
            Boolean S2 = fd1.S(cls);
            if (S2 != null) {
                z4 = S2.booleanValue();
            } else {
                z4 = false;
            }
            if (z4 || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface()) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean isFinal = Modifier.isFinal(cls.getModifiers());
            fl4.w.getClass();
            if (z3) {
                fl4 = fl4.y;
            } else if (z5) {
                fl4 = fl4.A;
            } else if (!isFinal) {
                fl4 = fl4.z;
            }
        }
        this.I = fl4;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            h8Var = e78.z;
        } else if (Modifier.isPrivate(modifiers)) {
            h8Var = b78.z;
        } else if (!Modifier.isProtected(modifiers)) {
            h8Var = dk3.z;
        } else if (Modifier.isStatic(modifiers)) {
            h8Var = fk3.z;
        } else {
            h8Var = ek3.z;
        }
        this.J = h8Var;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            x062 = new x06(declaringClass);
        } else {
            x062 = null;
        }
        if (x062 == null || Modifier.isStatic(cls.getModifiers())) {
            z = false;
        } else {
            z = true;
        }
        this.K = z;
        this.L = new ft1(this);
        if (ql4 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        x06 x063 = x06;
        a14 a14 = new a14(l, this, x063, z2, (a14) null);
        this.M = a14;
        jv2 jv2 = tg6.d;
        ((lz4) pj32.u).getClass();
        b0 b0Var = new b0(21, this);
        jv2.getClass();
        kb42.getClass();
        this.N = new tg6(this, kb42, b0Var);
        this.O = new fc3(a14);
        this.P = new o14(l, x063, this);
        this.Q = h03.s(l, x063);
        v04 v04 = new v04(this, 1);
        kb42.getClass();
        this.R = new hb4(kb42, v04);
    }

    public final a14 C0() {
        return (a14) super.n0();
    }

    public final boolean H() {
        return false;
    }

    public final ji4 L() {
        return this.P;
    }

    public final ji4 Y() {
        return this.O;
    }

    public final us1 f() {
        x06 x06;
        us1 us1 = vs1.a;
        h8 h8Var = this.J;
        if (sg3.e(h8Var, us1)) {
            Class<?> declaringClass = this.D.a.getDeclaringClass();
            if (declaringClass != null) {
                x06 = new x06(declaringClass);
            } else {
                x06 = null;
            }
            if (x06 == null) {
                us1 us12 = ni3.a;
                us12.getClass();
                return us12;
            }
        }
        return i35.q(h8Var);
    }

    public final rm getAnnotations() {
        return this.Q;
    }

    public final boolean j() {
        return false;
    }

    public final Collection l() {
        return (List) this.M.q.b();
    }

    public final wo7 n() {
        return this.L;
    }

    public final ji4 n0() {
        return (a14) super.n0();
    }

    public final fl4 o() {
        return this.I;
    }

    public final ji4 o0(ax3 ax3) {
        tg6 tg6 = this.N;
        j0 j0Var = tg6.a;
        int i = ts1.a;
        rs1.c(j0Var).getClass();
        return (a14) ((ji4) p25.q(tg6.c, tg6.e[0]));
    }

    public final boolean p() {
        return this.K;
    }

    public final wp0 p0() {
        return null;
    }

    public final boolean s0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = ts1.a;
        vp2 f = rs1.f(this);
        f.getClass();
        sb.append(f);
        return sb.toString();
    }

    public final List u0() {
        return (List) this.R.b();
    }

    public final iq0 v() {
        return this.H;
    }

    public final y18 v0() {
        return null;
    }

    public final boolean w0() {
        return false;
    }

    public final boolean x0() {
        return false;
    }

    public final boolean y0() {
        return false;
    }

    public final boolean z0() {
        return false;
    }
}
