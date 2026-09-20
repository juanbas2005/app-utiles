package defpackage;

import java.util.List;

/* renamed from: ob5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ob5 implements uh6 {
    public final aq4 A;
    public final aq4 B;
    public final ed5 C;
    public final ed5 D;
    public final ed5 E;
    public final ed5 F;
    public boolean a;
    public db5 b;
    public final ed5 c;
    public final ge1 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final hn1 k;
    public final boolean l;
    public final ed5 m;
    public tp1 n;
    public int o;
    public final ap4 p;
    public final bd5 q;
    public final bd5 r;
    public final oq1 s;
    public final t24 t;
    public final ua5 u;
    public final ji8 v;
    public final f20 w;
    public final ed5 x;
    public final l04 y;
    public final q24 z;

    /* JADX WARNING: type inference failed for: r6v4, types: [f20, java.lang.Object] */
    public ob5(int i2, float f2) {
        double d2 = (double) f2;
        if (-0.5d > d2 || d2 > 0.5d) {
            bc3.a("currentPageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5");
        }
        this.c = u55.p(new l35(0));
        this.d = new ge1(i2, f2, this);
        this.e = i2;
        this.g = Long.MAX_VALUE;
        this.k = new hn1(new kb5(this, 0));
        this.l = true;
        this.m = new ed5(rb5.b, d63.G);
        this.n = rb5.a;
        this.p = new ap4();
        this.q = new bd5(-1);
        this.r = new bd5(i2);
        g22 g22 = g22.K;
        this.s = u55.j(new m24(this, 2), g22);
        u55.j(new m24(this, 3), g22);
        t24 t24 = new t24(new kb5(this, 1));
        this.t = t24;
        this.u = new ua5(new ay4(1, this), t24, new m24(this, 4));
        this.v = new ji8(29);
        this.w = new Object();
        this.x = u55.p((Object) null);
        this.y = new l04(this, 2);
        m31.b(0, 0, 0, 0, 15);
        this.z = new q24();
        this.A = c35.e();
        this.B = c35.e();
        Boolean bool = Boolean.FALSE;
        this.C = u55.p(bool);
        this.D = u55.p(bool);
        this.E = u55.p(bool);
        this.F = u55.p(bool);
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [a97] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r6.i(r0) == r5) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r9.d(r7, r8, r0) != r5) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static Object s(ob5 ob5, hq4 hq4, gs2 gs2, h61 h61) {
        nb5 nb5;
        int i2;
        if (h61 instanceof nb5) {
            nb5 = (nb5) h61;
            int i3 = nb5.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nb5.E = i3 - Integer.MIN_VALUE;
                Object obj = nb5.C;
                i2 = nb5.E;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    nb5.z = ob5;
                    nb5.A = hq4;
                    nb5.B = (a97) gs2;
                    nb5.E = 1;
                } else if (i2 == 1) {
                    gs2 = nb5.B;
                    hq4 = nb5.A;
                    ob5 = nb5.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    ob5 = nb5.z;
                    o85.q(obj);
                    ob5.q.e(-1);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!ob5.k.a()) {
                    ob5.r.e(ob5.k());
                }
                hn1 hn1 = ob5.k;
                nb5.z = ob5;
                nb5.A = null;
                nb5.B = null;
                nb5.E = 2;
            }
        }
        nb5 = new nb5(ob5, h61);
        Object obj3 = nb5.C;
        i2 = nb5.E;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        if (!ob5.k.a()) {
        }
        hn1 hn12 = ob5.k;
        nb5.z = ob5;
        nb5.A = null;
        nb5.B = null;
        nb5.E = 2;
    }

    public final boolean a() {
        return this.k.a();
    }

    public final boolean b() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    public final Object d(hq4 hq4, gs2 gs2, h61 h61) {
        return s(this, hq4, gs2, h61);
    }

    public final float e(float f2) {
        return this.k.e(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    public final Object f(int i2, x17 x17, h61 h61) {
        lb5 lb5;
        lb5 lb52;
        int i3;
        p81 p81;
        x17 x172;
        float f2;
        int i4;
        mb5 mb5;
        if (h61 instanceof lb5) {
            lb5 = (lb5) h61;
            int i5 = lb5.D;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lb5.D = i5 - Integer.MIN_VALUE;
                lb52 = lb5;
                Object obj = lb52.B;
                i3 = lb52.D;
                vs7 vs7 = vs7.a;
                p81 = p81.w;
                if (i3 != 0) {
                    o85.q(obj);
                    if (!((i2 == k() && l() == 0.0f) || n() == 0)) {
                        lb52.A = x17;
                        lb52.z = i2;
                        lb52.D = 1;
                        if (i(lb52) != p81) {
                            i4 = i2;
                            f2 = 0.0f;
                            x172 = x17;
                        }
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    i4 = lb52.z;
                    x17 x173 = lb52.A;
                    o85.q(obj);
                    f2 = 0.0f;
                    x172 = x173;
                } else if (i3 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mb5 = new mb5(this, j(i4), ((float) p()) * f2, x172, (f61) null);
                lb52.A = null;
                lb52.D = 2;
                if (d(hq4.w, mb5, lb52) != p81) {
                    return p81;
                }
                return vs7;
            }
        }
        lb5 = new lb5(this, h61);
        lb52 = lb5;
        Object obj2 = lb52.B;
        i3 = lb52.D;
        vs7 vs72 = vs7.a;
        p81 = p81.w;
        if (i3 != 0) {
        }
        mb5 = new mb5(this, j(i4), ((float) p()) * f2, x172, (f61) null);
        lb52.A = null;
        lb52.D = 2;
        if (d(hq4.w, mb5, lb52) != p81) {
        }
    }

    /* JADX WARNING: type inference failed for: r14v10, types: [mh0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x033c, code lost:
        if (r() != false) goto L_0x033e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02e6 A[SYNTHETIC, Splitter:B:133:0x02e6] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0233 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    public final void h(db5 db5, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        ix6 h2;
        long i3;
        long p2;
        long j2;
        Object obj;
        boolean z8;
        int i4;
        int i5;
        Object obj2;
        boolean z9;
        boolean z10;
        mh0 mh0;
        mh0 mh02;
        List list;
        int i6;
        int i7;
        db5 db52 = db5;
        List list2 = db52.a;
        int i8 = db52.l;
        ph4 ph4 = db52.i;
        ph4 ph42 = db52.j;
        float f2 = db52.k;
        this.t.e = list2.size();
        int i9 = db52.b;
        this.o = db52.c + i9;
        if (z2 || !this.a) {
            boolean z11 = true;
            if (z2) {
                this.a = true;
            }
            ua5 ua5 = this.u;
            boolean z12 = this.l;
            vr2 vr2 = null;
            ge1 ge1 = this.d;
            if (z3) {
                ((ad5) ge1.A).e(f2);
            } else {
                ge1.getClass();
                if (ph42 != null) {
                    obj = ph42.d;
                } else {
                    obj = null;
                }
                ge1.x = obj;
                if (ge1.w || !list2.isEmpty()) {
                    ge1.w = true;
                    if (ph42 != null) {
                        i7 = ph42.a;
                    } else {
                        i7 = 0;
                    }
                    ((bd5) ge1.z).e(i7);
                    ((l24) ge1.B).b(i7);
                    ((ad5) ge1.A).e(f2);
                }
                if (z12) {
                    boolean z13 = z12;
                    cf4 cf4 = ua5.o;
                    yo4 yo4 = ua5.e;
                    cf4.y = db52;
                    cf4.z = ua5.n;
                    ay4 ay4 = ua5.a;
                    int i10 = ua5.g;
                    float f3 = 0.0f;
                    int i11 = -1;
                    if (!(i10 == -1 || i10 == cf4.t())) {
                        ua5.l = true;
                        if (cf4.o()) {
                            int i12 = ua5.h;
                            if (i12 < 0) {
                                i12 = 0;
                            }
                            ua5.h = i12;
                            if (cf4.q().a.isEmpty()) {
                                i6 = -1;
                            } else {
                                i6 = cf4.t() - 1;
                            }
                            if (i6 != -1) {
                                int i13 = ua5.i;
                                if (i13 <= i6) {
                                    i6 = i13;
                                }
                                ua5.i = i6;
                            }
                            if (ua5.f <= 0.0f) {
                                ua5.f(cf4.p(), ua5.m - 1);
                            } else {
                                ua5.f(0, cf4.l());
                            }
                        }
                    }
                    ua5.m = cf4.t();
                    if (cf4.o()) {
                        int size = cf4.q().r.size() + cf4.q().a.size() + cf4.q().q.size();
                        int i14 = 0;
                        while (i14 < size) {
                            int size2 = cf4.q().q.size();
                            float f4 = f3;
                            int size3 = cf4.q().a.size();
                            if (i14 < size2) {
                                i5 = ((ph4) cf4.q().q.get(i14)).a;
                            } else if (i14 >= size2 && i14 < size2 + size3) {
                                i5 = ((ph4) cf4.q().a.get(i14 - size2)).a;
                            } else if (i14 >= size2 + size3) {
                                i5 = ((ph4) cf4.q().r.get((i14 - size2) - size3)).a;
                            } else {
                                i5 = i11;
                            }
                            int size4 = cf4.q().q.size();
                            int size5 = cf4.q().a.size();
                            if (i14 < size4) {
                                obj2 = ((ph4) cf4.q().q.get(i14)).d;
                            } else if (i14 >= size4 && i14 < size4 + size5) {
                                obj2 = ((ph4) cf4.q().a.get(i14 - size4)).d;
                            } else if (i14 >= size4 + size5) {
                                obj2 = ((ph4) cf4.q().r.get((i14 - size4) - size5)).d;
                            } else {
                                obj2 = mh0.c;
                            }
                            int i15 = cf4.q().b;
                            if (i5 != -1) {
                                if (yo4.a(i5)) {
                                    Object b2 = yo4.b(i5);
                                    b2.getClass();
                                    int i16 = ((mh0) b2).b;
                                    Object b3 = yo4.b(i5);
                                    b3.getClass();
                                    z9 = z13;
                                    Object obj3 = ((mh0) b3).a;
                                    if (i16 != i15 || !sg3.e(obj3, obj2)) {
                                        z10 = true;
                                        ua5.l = true;
                                        mh0 = (mh0) yo4.b(i5);
                                        if (mh0 == null) {
                                            mh0.b = i15;
                                            mh0.a = obj2;
                                            mh02 = mh0;
                                        } else {
                                            ? obj4 = new Object();
                                            obj4.a = obj2;
                                            obj4.b = i15;
                                            mh02 = obj4;
                                        }
                                        yo4.i(i5, mh02);
                                        ua5.h = Math.min(ua5.h, i5);
                                        ua5.i = Math.max(ua5.i, i5);
                                        list = (List) ua5.b.g(i5);
                                        if (list == null) {
                                            int size6 = list.size();
                                            for (int i17 = 0; i17 < size6; i17++) {
                                                ((s24) list.get(i17)).cancel();
                                            }
                                        }
                                    }
                                } else {
                                    z9 = z13;
                                }
                                z10 = true;
                                mh0 = (mh0) yo4.b(i5);
                                if (mh0 == null) {
                                }
                                yo4.i(i5, mh02);
                                ua5.h = Math.min(ua5.h, i5);
                                ua5.i = Math.max(ua5.i, i5);
                                list = (List) ua5.b.g(i5);
                                if (list == null) {
                                }
                            } else {
                                z9 = z13;
                                z10 = true;
                            }
                            i14++;
                            f3 = f4;
                            z11 = z10;
                            z13 = z9;
                            i11 = -1;
                        }
                        z4 = z13;
                        z6 = z11;
                        float f5 = f3;
                        if (ua5.l) {
                            if (ua5.f <= f5) {
                                z8 = z6;
                            } else {
                                z8 = false;
                            }
                            if (cf4.o()) {
                                za5.q(cf4.q());
                                if (cf4.q().t != null) {
                                    i4 = ((ob5) ay4.x).o;
                                } else {
                                    i4 = 0;
                                }
                                z5 = false;
                                ua5.d(cf4, cf4.l(), cf4.p(), i4, cf4.r(), cf4.s(), 0.0f, z8);
                            } else {
                                z5 = false;
                            }
                            ua5.l = z5;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z4 = z13;
                        z6 = true;
                        z5 = false;
                        ua5.g();
                    }
                    ua5.g = cf4.t();
                    this.m.setValue(db52);
                    this.C.setValue(Boolean.valueOf(db52.m));
                    if (ph4 == null) {
                        i2 = ph4.a;
                    } else {
                        i2 = z5;
                    }
                    if (i2 == 0 || i8 != 0) {
                        z7 = z6;
                    } else {
                        z7 = z5;
                    }
                    this.D.setValue(Boolean.valueOf(z7));
                    if (ph4 != null) {
                        this.e = ph4.a;
                    }
                    this.f = i8;
                    h2 = j45.h();
                    if (h2 != null) {
                        vr2 = h2.e();
                    }
                    vr2 vr22 = vr2;
                    ix6 j3 = j45.j(h2);
                    if (z4) {
                        try {
                            if (db52.h < n()) {
                                if (Math.abs(this.j) > 0.5f) {
                                    float f6 = this.j;
                                    if (m().e == z75.w) {
                                        if (Math.signum(f6) == Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) {
                                            ua5.e(this.j, db52);
                                        }
                                    } else if (Math.signum(f6) == Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) {
                                        ua5.e(this.j, db52);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            j45.m(h2, j3, vr22);
                            throw th;
                        }
                    }
                    j45.m(h2, j3, vr22);
                    this.g = rb5.a(db52, n());
                    n();
                    if (db52.e != z75.x) {
                        i3 = db52.i() >> 32;
                    } else {
                        i3 = db52.i() & 4294967295L;
                    }
                    int i18 = (int) i3;
                    p2 = (long) z65.p(db52.n.f(i18, i9, -db52.f, db52.d), z5 ? 1 : 0, i18);
                    j2 = this.g;
                    if (p2 > j2) {
                        p2 = j2;
                    }
                    this.h = p2;
                    return;
                }
            }
            z6 = true;
            z4 = z12;
            z5 = false;
            this.m.setValue(db52);
            this.C.setValue(Boolean.valueOf(db52.m));
            if (ph4 == null) {
            }
            if (i2 == 0) {
            }
            z7 = z6;
            this.D.setValue(Boolean.valueOf(z7));
            if (ph4 != null) {
            }
            this.f = i8;
            h2 = j45.h();
            if (h2 != null) {
            }
            vr2 vr222 = vr2;
            ix6 j32 = j45.j(h2);
            if (z4) {
            }
            j45.m(h2, j32, vr222);
            this.g = rb5.a(db52, n());
            n();
            if (db52.e != z75.x) {
            }
            int i182 = (int) i3;
            p2 = (long) z65.p(db52.n.f(i182, i9, -db52.f, db52.d), z5 ? 1 : 0, i182);
            j2 = this.g;
            if (p2 > j2) {
            }
            this.h = p2;
            return;
        }
        this.b = db52;
    }

    public final Object i(h61 h61) {
        Object i2;
        if (this.m.getValue() == rb5.b && (i2 = this.w.i(h61)) == p81.w) {
            return i2;
        }
        return vs7.a;
    }

    public final int j(int i2) {
        if (n() > 0) {
            return z65.p(i2, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((bd5) this.d.z).d();
    }

    public final float l() {
        return ((ad5) this.d.A).d();
    }

    public final db5 m() {
        return (db5) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((db5) this.m.getValue()).b;
    }

    public final int p() {
        return ((db5) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((l35) this.c.getValue()).a;
    }

    public final boolean r() {
        if (((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void t(int i2, float f2, boolean z2) {
        ge1 ge1 = this.d;
        ad5 ad5 = (ad5) ge1.A;
        if (!(((bd5) ge1.z).d() == i2 && ad5.d() == f2)) {
            this.u.g();
        }
        ((bd5) ge1.z).e(i2);
        ((l24) ge1.B).b(i2);
        ad5.e(f2);
        ge1.x = null;
        if (z2) {
            uy3 uy3 = (uy3) this.x.getValue();
            if (uy3 != null) {
                uy3.k();
                return;
            }
            return;
        }
        this.B.setValue(vs7.a);
    }
}
