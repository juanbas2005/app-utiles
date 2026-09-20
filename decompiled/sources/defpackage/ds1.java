package defpackage;

import java.util.List;

/* renamed from: ds1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ds1 extends c2 {
    public static final /* synthetic */ yr3[] B;
    public final y16 A;
    public final vw3 x;
    public final boolean y;
    public final y16 z;

    static {
        Class<ds1> cls = ds1.class;
        B = new yr3[]{new gr5(cls, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new gr5(cls, "arguments", "getArguments()Ljava/util/List;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ds1(vw3 vw3, sr2 sr2, boolean z2) {
        super(sr2);
        vw3.getClass();
        this.x = vw3;
        this.y = z2;
        this.z = p25.u((ri0) null, new bs1(this, 0));
        this.A = p25.u((ri0) null, new p3(this, false, sr2, 5));
    }

    public final boolean C() {
        return ag8.B(this.x);
    }

    public final c2 D() {
        du7 n0 = this.x.n0();
        if (n0 instanceof zg2) {
            return new ds1(((zg2) n0).x, 0);
        }
        return null;
    }

    public final c2 F(boolean z2) {
        vw3 vw3;
        qo1 qo1;
        vw3 vw32 = this.x;
        if (z2) {
            vw3 = pe2.w(vw32.n0(), true);
            if (vw3 == null) {
                return this;
            }
        } else {
            if (vw32 instanceof qo1) {
                qo1 = (qo1) vw32;
            } else {
                qo1 = null;
            }
            if (qo1 == null || (vw3 = qo1.x) == null) {
                return this;
            }
        }
        return new ds1(vw3, (sr2) null, false);
    }

    public final c2 H(boolean z2) {
        vw3 vw3 = this.x;
        vw3.getClass();
        if (!(vw3.n0() instanceof zg2) && vw3.Q() == z2) {
            return this;
        }
        du7 g = iq7.g(vw3, z2);
        g.getClass();
        return new ds1(g, (sr2) null, false);
    }

    public final List I() {
        yr3 yr3 = B[1];
        Object b = this.A.b();
        b.getClass();
        return (List) b;
    }

    public final vq3 J() {
        yr3 yr3 = B[0];
        return (vq3) this.z.b();
    }

    public final c2 K() {
        du7 n0 = this.x.n0();
        if (n0 instanceof zg2) {
            return new ds1(((zg2) n0).y, 0);
        }
        return null;
    }

    public final vq3 N(vw3 vw3) {
        es3 es3;
        yq3 yq3;
        lt1 lt1;
        v16 v16;
        Class cls;
        vw3 b;
        r05 r05;
        if (this.y) {
            vq0 u = vw3.L().u();
            if (u instanceof r05) {
                r05 = (r05) u;
            } else {
                r05 = null;
            }
            if (r05 != null) {
                return new bs3(ts1.g(r05));
            }
        }
        vq0 u2 = vw3.L().u();
        if (u2 instanceof ql4) {
            Class q = g18.q((ql4) u2);
            if (q != null) {
                if (fv3.z(vw3)) {
                    xp7 xp7 = (xp7) dt0.S0(vw3.G());
                    if (xp7 == null || (b = xp7.b()) == null) {
                        return new oq3(q);
                    }
                    vq3 N = N(jb5.z(b));
                    if (N != null) {
                        return new oq3(g18.e(kl8.v(rj1.u(N))));
                    }
                    rf2.x("Cannot determine classifier for array element type: ", this);
                    return null;
                } else if (iq7.e(vw3)) {
                    return new oq3(q);
                } else {
                    Class cls2 = (Class) m06.b.get(q);
                    if (cls2 != null) {
                        q = cls2;
                    }
                    return new oq3(q);
                }
            }
        } else if (u2 instanceof qp7) {
            qp7 qp7 = (qp7) u2;
            vj1 r = qp7.r();
            r.getClass();
            if (r instanceof ql4) {
                es3 = gl0.h0((ql4) r);
            } else if (r instanceof ri0) {
                vj1 r2 = ((ri0) r).r();
                r2.getClass();
                if (r2 instanceof ql4) {
                    yq3 = gl0.h0((ql4) r2);
                } else {
                    if (r instanceof lt1) {
                        lt1 = (lt1) r;
                    } else {
                        lt1 = null;
                    }
                    if (lt1 != null) {
                        it1 U = lt1.U();
                        if (U instanceof wo3) {
                            v16 v162 = ((wo3) U).y;
                            if (v162 != null) {
                                v16 = v162;
                            } else {
                                v16 = null;
                            }
                            if (v16 == null || (cls = v16.a) == null) {
                                h.r("Container of top-level deserialized member is not resolved: ", lt1, " (", v162);
                                return null;
                            }
                            wq3 c = b26.a.c(cls);
                            c.getClass();
                            yq3 = (pr3) c;
                        } else if (U instanceof fa4) {
                            yq3 = ((fa4) U).w;
                        } else if (U instanceof a26) {
                            yq3 = v32.x;
                        } else {
                            rf2.x("Container of deserialized member is not resolved: ", lt1);
                            return null;
                        }
                    } else {
                        rf2.x("Non-class callable descriptor must be deserialized: ", r);
                        return null;
                    }
                }
                Object P = r.P(new jz0(yq3), vs7.a);
                P.getClass();
                es3 = (es3) P;
            } else {
                rf2.x("Unknown type parameter container: ", r);
            }
            return new ds3(es3, qp7);
        }
        return null;
    }

    public final as3 b() {
        t tVar;
        fu6 fu6;
        vw3 vw3 = this.x;
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof t) {
            tVar = (t) n0;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            fu6 = tVar.y;
        } else {
            fu6 = null;
        }
        if (fu6 != null) {
            return new ds1(fu6, this.w, true);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!oa7.a) {
            return super.equals(obj);
        }
        if (!(obj instanceof ds1)) {
            return false;
        }
        ds1 ds1 = (ds1) obj;
        if (!sg3.e(this.x, ds1.x) || !sg3.e(J(), ds1.J()) || !I().equals(ds1.I())) {
            return false;
        }
        return true;
    }

    public final gq3 g() {
        ql4 ql4;
        vq0 u = this.x.L().u();
        if (u instanceof ql4) {
            ql4 = (ql4) u;
        } else {
            ql4 = null;
        }
        if (ql4 != null) {
            String str = tj3.a;
            if (tj3.j.containsKey(rs1.f(ql4))) {
                if (oa7.a) {
                    vq3 J = J();
                    J.getClass();
                    return new ro4((gq3) J, ts1.g(ql4).a.a, new cs1(ql4, 0), new cs1(ql4, 1));
                }
                up2 g = ts1.g(ql4);
                vq3 J2 = J();
                J2.getClass();
                return gw8.x(g, (gq3) J2);
            }
        }
        return null;
    }

    public final List getAnnotations() {
        return g18.d(this.x);
    }

    public final int hashCode() {
        int i;
        if (!oa7.a) {
            return super.hashCode();
        }
        int hashCode = this.x.hashCode() * 31;
        vq3 J = J();
        if (J != null) {
            i = J.hashCode();
        } else {
            i = 0;
        }
        return I().hashCode() + ((hashCode + i) * 31);
    }

    public final boolean s() {
        vw3 vw3 = this.x;
        vw3.getClass();
        return vw3.n0() instanceof qo1;
    }

    public final boolean u() {
        vw3 vw3 = this.x;
        if (vw3 != null) {
            uq4 uq4 = fv3.e;
            return fv3.B(vw3, m27.b);
        }
        fv3.a(138);
        throw null;
    }

    public final boolean v() {
        return this.x.Q();
    }

    public final boolean y() {
        return this.x instanceof jw5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ds1(vw3 vw3, int i) {
        this(vw3, (sr2) null, false);
        vw3.getClass();
    }
}
