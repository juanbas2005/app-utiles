package defpackage;

import java.util.List;

/* renamed from: n04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n04 implements uh6 {
    public static final kg5 w = gl0.Z(new tm3(3), new uz1(15));
    public final lm1 a;
    public boolean b;
    public d04 c;
    public final g04 d;
    public final ed5 e = new ed5(q04.a, d63.G);
    public final ap4 f = new ap4();
    public float g;
    public final hn1 h = new hn1(new h43(8, this));
    public final boolean i = true;
    public uy3 j;
    public final l04 k = new l04(this, 0);
    public final f20 l = new Object();
    public final wz0 m = new wz0(3);
    public final ji8 n = new ji8(29);
    public final t24 o;
    public final wv2 p;
    public final q24 q;
    public final aq4 r;
    public final aq4 s;
    public final ed5 t;
    public final ed5 u;
    public final hv2 v;

    /* JADX WARNING: type inference failed for: r0v0, types: [lm1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v6, types: [f20, java.lang.Object] */
    public n04(int i2, int i3) {
        ? obj = new Object();
        obj.a = -1;
        obj.e = new eq4(new s24[16]);
        obj.c = -1;
        this.a = obj;
        this.d = new g04(i2, i3, 0);
        this.o = new t24(new k04(i2, 0, this));
        this.p = new wv2(22, this);
        this.q = new q24();
        this.r = c35.e();
        this.s = c35.e();
        Boolean bool = Boolean.FALSE;
        this.t = u55.p(bool);
        this.u = u55.p(bool);
        this.v = new hv2(10);
    }

    public final boolean a() {
        return this.h.a();
    }

    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [a97] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r6.l.i(r0) == r5) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r6.h.d(r7, r8, r0) != r5) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object d(hq4 hq4, gs2 gs2, h61 h61) {
        m04 m04;
        int i2;
        if (h61 instanceof m04) {
            m04 = (m04) h61;
            int i3 = m04.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m04.D = i3 - Integer.MIN_VALUE;
                Object obj = m04.B;
                i2 = m04.D;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    if (this.e.getValue() == q04.a) {
                        m04.z = hq4;
                        m04.A = (a97) gs2;
                        m04.D = 1;
                    }
                } else if (i2 == 1) {
                    gs2 = m04.A;
                    hq4 = m04.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m04.z = null;
                m04.A = null;
                m04.D = 2;
            }
        }
        m04 = new m04(this, h61);
        Object obj3 = m04.B;
        i2 = m04.D;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        m04.z = null;
        m04.A = null;
        m04.D = 2;
    }

    public final float e(float f2) {
        return this.h.e(f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: vr2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: vr2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: vr2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: vr2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: vr2} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void f(d04 d04, boolean z, boolean z2) {
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        e04 e04;
        e04 e042;
        e04 e043;
        List list = d04.m;
        int i5 = d04.p;
        f04 f04 = d04.a;
        int i6 = d04.b;
        this.o.e = list.size();
        vr2 vr2 = null;
        boolean z5 = false;
        g04 g04 = this.d;
        hv2 hv2 = this.v;
        if (z || !this.b) {
            if (z) {
                this.b = true;
            }
            this.g -= d04.d;
            this.e.setValue(d04);
            if (f04 != null) {
                i2 = f04.a;
            } else {
                i2 = 0;
            }
            if (i2 == 0 && i6 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.u.setValue(Boolean.valueOf(z3));
            this.t.setValue(Boolean.valueOf(d04.c));
            if (z2) {
                g04.getClass();
                if (((float) i6) < 0.0f) {
                    bc3.c("scrollOffset should be non-negative");
                }
                g04.c.e(i6);
            } else {
                g04.getClass();
                if (!(f04 == null || (e042 = (e04) qs.X0(f04.b)) == null)) {
                    vr2 = e042.b;
                }
                g04.e = vr2;
                if (g04.d || i5 > 0) {
                    g04.d = true;
                    if (((float) i6) < 0.0f) {
                        bc3.c("scrollOffset should be non-negative (" + i6 + ")");
                    }
                    if (f04 == null || (e04 = (e04) qs.X0(f04.b)) == null) {
                        i4 = 0;
                    } else {
                        i4 = e04.a;
                    }
                    g04.a(i4, i6);
                }
                if (this.i) {
                    lm1 lm1 = this.a;
                    eq4 eq4 = (eq4) lm1.e;
                    int i7 = lm1.a;
                    boolean z6 = lm1.b;
                    if (!(i7 == -1 || list.isEmpty() || i7 == lm1.b(d04, z6))) {
                        lm1.a = -1;
                        Object[] objArr = eq4.w;
                        int i8 = eq4.y;
                        for (int i9 = 0; i9 < i8; i9++) {
                            ((s24) objArr[i9]).cancel();
                        }
                        eq4.g();
                    }
                    int i10 = lm1.c;
                    if (!(i10 == -1 || lm1.d == 0.0f || i10 == i5 || list.isEmpty())) {
                        if (lm1.d < 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int b2 = lm1.b(d04, z4);
                        if (lm1.d < 0.0f) {
                            z5 = true;
                        }
                        if (z5) {
                            i3 = ((e04) dt0.G0(list)).a + 1;
                        } else {
                            i3 = ((e04) dt0.w0(list)).a - 1;
                        }
                        if (i3 >= 0 && i3 < i5 && b2 != lm1.a && b2 >= 0) {
                            lm1.a = b2;
                            eq4.g();
                            eq4.d(eq4.y, this.p.s(b2));
                        }
                    }
                    lm1.c = i5;
                }
            }
            if (z) {
                hv2.b1(d04.f, d04.i, d04.h);
                return;
            }
            return;
        }
        this.c = d04;
        ix6 h2 = j45.h();
        if (h2 != null) {
            vr2 = h2.e();
        }
        ix6 j2 = j45.j(h2);
        try {
            if (((Number) ((il) hv2.x).x.getValue()).floatValue() == 0.0f) {
                z5 = true;
            }
            if (!z5 && i6 == g04.c.d() && f04 != null && (e043 = (e04) qs.X0(f04.b)) != null && e043.a == g04.b.d()) {
                hv2.Z0();
            }
        } finally {
            j45.m(h2, j2, vr2);
        }
    }

    public final d04 g() {
        return (d04) this.e.getValue();
    }

    public final void h(float f2, d04 d04) {
        boolean z;
        int i2;
        long j2;
        if (this.i) {
            lm1 lm1 = this.a;
            eq4 eq4 = (eq4) lm1.e;
            List list = d04.m;
            List list2 = d04.m;
            z75 z75 = d04.q;
            if (!list.isEmpty()) {
                int i3 = 0;
                if (f2 < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                int b2 = lm1.b(d04, z);
                if (z) {
                    i2 = ((e04) dt0.G0(list2)).a + 1;
                } else {
                    i2 = ((e04) dt0.w0(list2)).a - 1;
                }
                if (i2 >= 0 && i2 < d04.p) {
                    if (b2 != lm1.a && b2 >= 0) {
                        if (lm1.b != z) {
                            Object[] objArr = eq4.w;
                            int i4 = eq4.y;
                            for (int i5 = 0; i5 < i4; i5++) {
                                ((s24) objArr[i5]).cancel();
                            }
                        }
                        lm1.b = z;
                        lm1.a = b2;
                        eq4.g();
                        eq4.d(eq4.y, this.p.s(b2));
                    }
                    if (z) {
                        e04 e04 = (e04) dt0.G0(list2);
                        if (z75 == z75.w) {
                            j2 = e04.q & 4294967295L;
                        } else {
                            j2 = e04.q >> 32;
                        }
                        if (((float) (((ie1.S(e04, z75) + ((int) j2)) + d04.s) - d04.o)) < (-f2)) {
                            Object[] objArr2 = eq4.w;
                            int i6 = eq4.y;
                            while (i3 < i6) {
                                ((s24) objArr2[i3]).a();
                                i3++;
                            }
                        }
                    } else if (((float) (d04.n - ie1.S((e04) dt0.w0(list2), z75))) < f2) {
                        Object[] objArr3 = eq4.w;
                        int i7 = eq4.y;
                        while (i3 < i7) {
                            ((s24) objArr3[i3]).a();
                            i3++;
                        }
                    }
                }
            }
            lm1.d = f2;
        }
    }
}
