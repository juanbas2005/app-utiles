package defpackage;

import java.util.List;

/* renamed from: s34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s34 implements uh6 {
    public static final kg5 y = gl0.Z(new tm3(7), new uz1(16));
    public final lm1 a;
    public boolean b;
    public m34 c;
    public boolean d;
    public final g04 e;
    public final ed5 f = new ed5(t34.a, d63.G);
    public final ap4 g = new ap4();
    public float h;
    public boolean i;
    public final hn1 j = new hn1(new h43(12, this));
    public final boolean k = true;
    public uy3 l;
    public final l04 m = new l04(this, 1);
    public final f20 n = new Object();
    public final wz0 o = new wz0(3);
    public final ji8 p = new ji8(29);
    public final t24 q;
    public final ns8 r;
    public final q24 s;
    public final aq4 t;
    public final ed5 u;
    public final ed5 v;
    public final aq4 w;
    public final hv2 x;

    /* JADX WARNING: type inference failed for: r0v0, types: [lm1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5, types: [f20, java.lang.Object] */
    public s34(int i2, int i3) {
        ? obj = new Object();
        obj.a = -1;
        obj.c = -1;
        this.a = obj;
        this.e = new g04(i2, i3, 1);
        this.q = new t24(new ah1(this, i2));
        this.r = new ns8(27, (Object) this);
        this.s = new q24();
        this.t = c35.e();
        Boolean bool = Boolean.FALSE;
        this.u = u55.p(bool);
        this.v = u55.p(bool);
        this.w = c35.e();
        this.x = new hv2(10);
    }

    public static Object l(s34 s34, int i2, a97 a97) {
        s34.getClass();
        Object d2 = s34.d(hq4.w, new ci1(s34, i2, (f61) null), a97);
        if (d2 == p81.w) {
            return d2;
        }
        return vs7.a;
    }

    public final boolean a() {
        return this.j.a();
    }

    public final boolean b() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [a97] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r6.n.i(r0) == r5) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r6.j.d(r7, r8, r0) != r5) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object d(hq4 hq4, gs2 gs2, h61 h61) {
        r34 r34;
        int i2;
        if (h61 instanceof r34) {
            r34 = (r34) h61;
            int i3 = r34.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r34.D = i3 - Integer.MIN_VALUE;
                Object obj = r34.B;
                i2 = r34.D;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    if (this.f.getValue() == t34.a) {
                        r34.z = hq4;
                        r34.A = (a97) gs2;
                        r34.D = 1;
                    }
                } else if (i2 == 1) {
                    gs2 = r34.A;
                    hq4 = r34.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r34.z = null;
                r34.A = null;
                r34.D = 2;
            }
        }
        r34 = new r34(this, h61);
        Object obj3 = r34.B;
        i2 = r34.D;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        r34.z = null;
        r34.A = null;
        r34.D = 2;
    }

    public final float e(float f2) {
        return this.j.e(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    public final Object f(int i2, h61 h61) {
        p34 p34;
        int i3;
        if (h61 instanceof p34) {
            p34 = (p34) h61;
            int i4 = p34.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p34.B = i4 - Integer.MIN_VALUE;
                Object obj = p34.z;
                i3 = p34.B;
                if (i3 != 0) {
                    o85.q(obj);
                    this.i = true;
                    q34 q34 = new q34(this, i2, (f61) null);
                    p34.B = 1;
                    Object d2 = d(hq4.w, q34, p34);
                    p81 p81 = p81.w;
                    if (d2 == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        this.i = false;
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.i = false;
                return vs7.a;
            }
        }
        p34 = new p34(this, h61);
        Object obj2 = p34.z;
        i3 = p34.B;
        if (i3 != 0) {
        }
        this.i = false;
        return vs7.a;
    }

    public final void g(m34 m34, boolean z, boolean z2) {
        int i2;
        boolean z3;
        float f2;
        long j2;
        long j3;
        Object obj;
        boolean z4;
        int i3;
        boolean z5;
        m34 m342 = m34;
        List list = m342.k;
        int i4 = m342.n;
        int i5 = m342.b;
        n34 n34 = m342.a;
        this.q.e = list.size();
        hv2 hv2 = this.x;
        vr2 vr2 = null;
        g04 g04 = this.e;
        if (z || !this.b) {
            if (z) {
                this.b = true;
            }
            if (n34 != null) {
                i2 = n34.a;
            } else {
                i2 = 0;
            }
            if (i2 == 0 && i5 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.v.setValue(Boolean.valueOf(z3));
            this.u.setValue(Boolean.valueOf(m342.c));
            this.h -= m342.d;
            this.f.setValue(m342);
            if (z2) {
                g04.getClass();
                if (((float) i5) < 0.0f) {
                    bc3.c("scrollOffset should be non-negative");
                }
                g04.c.e(i5);
            } else {
                n34 n342 = (n34) dt0.y0(list);
                n34 n343 = (n34) dt0.H0(list);
                if (n342 != null) {
                    f2 = 0.0f;
                    j2 = (long) n342.a;
                } else {
                    f2 = 0.0f;
                    j2 = -1;
                }
                ag8.L(j2, "firstVisibleItem:index");
                if (n343 != null) {
                    j3 = (long) n343.a;
                } else {
                    j3 = -1;
                }
                ag8.L(j3, "lastVisibleItem:index");
                g04.getClass();
                if (n34 != null) {
                    obj = n34.i;
                } else {
                    obj = vr2;
                }
                g04.e = obj;
                if (g04.d || i4 > 0) {
                    g04.d = true;
                    if (((float) i5) < f2) {
                        bc3.c("scrollOffset should be non-negative");
                    }
                    if (n34 != null) {
                        i3 = n34.a;
                    } else {
                        i3 = 0;
                    }
                    g04.a(i3, i5);
                }
                if (this.k) {
                    lm1 lm1 = this.a;
                    int i6 = lm1.a;
                    boolean z6 = lm1.b;
                    if (!(i6 == -1 || list.isEmpty() || i6 == lm1.a(m342, z6))) {
                        lm1.a = -1;
                        s24 s24 = (s24) lm1.e;
                        if (s24 != null) {
                            s24.cancel();
                        }
                        lm1.e = vr2;
                    }
                    int i7 = lm1.c;
                    if (!(i7 == -1 || lm1.d == f2 || i7 == i4 || list.isEmpty())) {
                        if (lm1.d < f2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int a2 = lm1.a(m342, z4);
                        if (a2 >= 0 && a2 < i4) {
                            lm1.a = a2;
                            lm1.e = ns8.V(this.r, a2);
                        }
                    }
                    lm1.c = i4;
                }
            }
            if (z) {
                hv2.b1(m342.f, m342.i, m342.h);
                return;
            }
            return;
        }
        this.c = m342;
        ix6 h2 = j45.h();
        if (h2 != null) {
            vr2 = h2.e();
        }
        ix6 j4 = j45.j(h2);
        try {
            if (((Number) ((il) hv2.x).x.getValue()).floatValue() == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 && n34 != null && n34.a == g04.b.d() && i5 == g04.c.d()) {
                hv2.Z0();
            }
        } finally {
            j45.m(h2, j4, vr2);
        }
    }

    public final int h() {
        return this.e.b.d();
    }

    public final int i() {
        return this.e.c.d();
    }

    public final m34 j() {
        return (m34) this.f.getValue();
    }

    public final void k(float f2, m34 m34) {
        boolean z;
        s24 s24;
        s24 s242;
        if (this.k) {
            boolean isEmpty = m34.k.isEmpty();
            lm1 lm1 = this.a;
            if (!isEmpty) {
                if (f2 < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                int a2 = lm1.a(m34, z);
                if (a2 >= 0 && a2 < m34.n) {
                    if (a2 != lm1.a) {
                        if (lm1.b != z) {
                            lm1.a = -1;
                            s24 s243 = (s24) lm1.e;
                            if (s243 != null) {
                                s243.cancel();
                            }
                            lm1.e = null;
                        }
                        lm1.b = z;
                        lm1.a = a2;
                        lm1.e = ns8.V(this.r, a2);
                    }
                    List list = m34.k;
                    if (z) {
                        n34 n34 = (n34) dt0.G0(list);
                        if (((float) (((n34.l + n34.m) + m34.q) - m34.m)) < (-f2) && (s242 = (s24) lm1.e) != null) {
                            s242.a();
                        }
                    } else if (((float) (m34.l - ((n34) dt0.w0(list)).l)) < f2 && (s24 = (s24) lm1.e) != null) {
                        s24.a();
                    }
                }
            }
            lm1.d = f2;
        }
    }

    public final void m(int i2) {
        g04 g04 = this.e;
        if (!(g04.b.d() == i2 && g04.c.d() == 0)) {
            wz0 wz0 = this.o;
            wz0.h();
            wz0.b = null;
        }
        g04.a(i2, 0);
        g04.e = null;
        uy3 uy3 = this.l;
        if (uy3 != null) {
            uy3.k();
        }
    }
}
