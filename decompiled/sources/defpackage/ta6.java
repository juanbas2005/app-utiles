package defpackage;

import java.lang.reflect.Method;

/* renamed from: ta6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ta6 {
    public static final gq0 a;

    static {
        up2 up2 = new up2("java.lang.Void");
        a = new gq0(up2.b(), up2.a.g());
    }

    public static oo3 a(xs2 xs2) {
        String str;
        String g = n85.g(xs2);
        if (g == null) {
            if (xs2 instanceof fr5) {
                String b = ts1.i(xs2).getName().b();
                b.getClass();
                g = mn3.a(b);
            } else if (xs2 instanceof jr5) {
                String b2 = ts1.i(xs2).getName().b();
                b2.getClass();
                if (mn3.b(b2)) {
                    str = b2.substring(2);
                } else {
                    str = gw8.j(b2);
                }
                g = "set".concat(str);
            } else {
                g = ((wj1) xs2).getName().b();
                g.getClass();
            }
        }
        return new oo3(new qo3(g, dh4.g(xs2, 1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: oo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static t49 b(cr5 cr5) {
        sa6 sa6;
        c16 c16;
        sy6 sy6;
        sa6 sa62;
        c16 c162;
        h16 h16;
        cr5.getClass();
        cr5 a2 = ((cr5) rs1.r(cr5)).a();
        a2.getClass();
        ? r0 = 0;
        if (a2 instanceof st1) {
            st1 st1 = (st1) a2;
            qs5 qs5 = st1.W;
            yu2 yu2 = qp3.d;
            yu2.getClass();
            kp3 kp3 = (kp3) jb5.n(qs5, yu2);
            if (kp3 != null) {
                return new dp3(a2, qs5, kp3, st1.X, st1.Y);
            }
        } else if (a2 instanceof oj3) {
            oj3 oj3 = (oj3) a2;
            sy6 e = oj3.e();
            if (e instanceof sa6) {
                sa6 = (sa6) e;
            } else {
                sa6 = null;
            }
            if (sa6 != null) {
                c16 = sa6.w;
            } else {
                c16 = null;
            }
            if (c16 instanceof e16) {
                return new bp3(((e16) c16).a);
            }
            if (c16 instanceof h16) {
                Method method = ((h16) c16).a;
                jr5 jr5 = oj3.T;
                if (jr5 != null) {
                    sy6 = jr5.e();
                } else {
                    sy6 = null;
                }
                if (sy6 instanceof sa6) {
                    sa62 = (sa6) sy6;
                } else {
                    sa62 = null;
                }
                if (sa62 != null) {
                    c162 = sa62.w;
                } else {
                    c162 = null;
                }
                if (c162 instanceof h16) {
                    h16 = (h16) c162;
                } else {
                    h16 = null;
                }
                if (h16 != null) {
                    r0 = h16.a;
                }
                return new cp3(method, r0);
            }
            h.m("Incorrect resolution sequence for Java field ", a2, " (source = ", c16);
            return null;
        }
        fr5 c = a2.c();
        c.getClass();
        oo3 a3 = a(c);
        jr5 d = a2.d();
        if (d != null) {
            r0 = a(d);
        }
        return new ep3(a3, r0);
    }

    public static pv8 c(xs2 xs2) {
        sa6 sa6;
        c16 c16;
        sa6 sa62;
        c16 c162;
        h16 h16;
        Method method;
        xs2.getClass();
        xs2 a2 = ((xs2) rs1.r(xs2)).a();
        a2.getClass();
        if (a2 instanceof ys1) {
            lt1 lt1 = (lt1) a2;
            k2 C = lt1.C();
            if (C instanceof js5) {
                y92 y92 = rp3.a;
                qo3 c = rp3.c((js5) C, lt1.T(), lt1.N());
                if (c != null) {
                    return new oo3(c);
                }
            }
            if (C instanceof wr5) {
                y92 y922 = rp3.a;
                qo3 a3 = rp3.a((wr5) C, lt1.T(), lt1.N());
                if (a3 != null) {
                    vj1 r = xs2.r();
                    r.getClass();
                    if (dc3.a(r)) {
                        return new oo3(a3);
                    }
                    return new no3(a3);
                }
            }
            return a(a2);
        } else if (a2 instanceof lj3) {
            sy6 e = ((lj3) a2).e();
            if (e instanceof sa6) {
                sa62 = (sa6) e;
            } else {
                sa62 = null;
            }
            if (sa62 != null) {
                c162 = sa62.w;
            } else {
                c162 = null;
            }
            if (c162 instanceof h16) {
                h16 = (h16) c162;
            } else {
                h16 = null;
            }
            if (h16 != null && (method = h16.a) != null) {
                return new mo3(method);
            }
            rf2.x("Incorrect resolution sequence for Java method ", a2);
            return null;
        } else if (!(a2 instanceof fi3)) {
            return a(a2);
        } else {
            sy6 e2 = ((fi3) a2).e();
            if (e2 instanceof sa6) {
                sa6 = (sa6) e2;
            } else {
                sa6 = null;
            }
            if (sa6 != null) {
                c16 = sa6.w;
            } else {
                c16 = null;
            }
            if (c16 instanceof b16) {
                return new lo3(((b16) c16).a);
            }
            if (c16 instanceof x06) {
                Class cls = ((x06) c16).a;
                if (cls.isAnnotation()) {
                    return new ko3(cls);
                }
            }
            h.m("Incorrect resolution sequence for Java constructor ", a2, " (", c16);
            return null;
        }
    }
}
