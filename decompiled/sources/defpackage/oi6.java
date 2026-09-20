package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: oi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oi6 extends in8 {
    public static final kl O = new kl(0.0f);
    public static final kl P = new kl(1.0f);
    public mm7 A;
    public long B;
    public final hx4 C = new hx4(20, this);
    public cy6 D;
    public final ad5 E = new ad5(0.0f);
    public kk0 F;
    public final qq4 G = new qq4();
    public final nq4 H = new nq4();
    public long I = Long.MIN_VALUE;
    public final lp4 J = new lp4();
    public hi6 K;
    public final gi6 L = new gi6(this, 0);
    public float M;
    public final gi6 N = new gi6(this, 1);
    public final ed5 x;
    public final ed5 y;
    public Object z;

    public oi6(Object obj) {
        super(9);
        this.x = u55.p(obj);
        this.y = u55.p(obj);
        this.z = obj;
    }

    public static final void d1(oi6 oi6) {
        ad5 ad5 = oi6.E;
        mm7 mm7 = oi6.A;
        if (mm7 != null) {
            hi6 hi6 = oi6.K;
            if (hi6 == null) {
                if (oi6.B <= 0 || ad5.d() == 1.0f || sg3.e(oi6.y.getValue(), oi6.x.getValue())) {
                    hi6 = null;
                } else {
                    hi6 = new hi6();
                    hi6.d = ad5.d();
                    long j = oi6.B;
                    hi6.g = j;
                    hi6.h = dh4.D((1.0d - ((double) ad5.d())) * ((double) j));
                    hi6.e.e(0, ad5.d());
                }
            }
            if (hi6 != null) {
                hi6.g = oi6.B;
                oi6.J.a(hi6);
                mm7.n(hi6);
            }
            oi6.K = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    public static final Object e1(oi6 oi6, h61 h61) {
        ji6 ji6;
        int i;
        lp4 lp4 = oi6.J;
        if (h61 instanceof ji6) {
            ji6 = (ji6) h61;
            int i2 = ji6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ji6.B = i2 - Integer.MIN_VALUE;
                e81 e81 = ji6.x;
                Object obj = ji6.z;
                i = ji6.B;
                vs7 vs7 = vs7.a;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (lp4.h() && oi6.K == null) {
                        return vs7;
                    }
                    e81.getClass();
                    if (i95.p(e81) == 0.0f) {
                        oi6.j1();
                        oi6.I = Long.MIN_VALUE;
                        return vs7;
                    }
                    if (oi6.I == Long.MIN_VALUE) {
                        gi6 gi6 = oi6.L;
                        ji6.B = 1;
                        e81.getClass();
                        if (pd8.s(e81).a(gi6, ji6) == p81) {
                            return p81;
                        }
                    }
                    do {
                        if (lp4.i() || oi6.K != null) {
                        }
                    } while (oi6.h1(ji6) != p81);
                } else if (i == 1 || i == 2) {
                    o85.q(obj);
                    do {
                        if (lp4.i() || oi6.K != null) {
                            ji6.B = 2;
                        } else {
                            oi6.I = Long.MIN_VALUE;
                            return vs7;
                        }
                    } while (oi6.h1(ji6) != p81);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return p81;
            }
        }
        ji6 = new ji6(oi6, h61);
        e81 e812 = ji6.x;
        Object obj2 = ji6.z;
        i = ji6.B;
        vs7 vs72 = vs7.a;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        return p812;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r0.a(r1) == r6) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public static final Object f1(oi6 oi6, h61 h61) {
        mi6 mi6;
        int i;
        p81 p81;
        Object obj;
        Object obj2;
        Object t;
        qq4 qq4 = oi6.G;
        if (h61 instanceof mi6) {
            mi6 = (mi6) h61;
            int i2 = mi6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi6.C = i2 - Integer.MIN_VALUE;
                Object obj3 = mi6.A;
                i = mi6.C;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj3);
                    obj2 = oi6.x.getValue();
                    mi6.z = obj2;
                    mi6.C = 1;
                } else if (i == 1) {
                    Object obj4 = mi6.z;
                    o85.q(obj3);
                    obj2 = obj4;
                } else if (i == 2) {
                    obj = mi6.z;
                    o85.q(obj3);
                    if (!sg3.e(obj3, obj)) {
                        return vs7.a;
                    }
                    oi6.I = Long.MIN_VALUE;
                    throw new CancellationException("targetState while waiting for composition");
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mi6.z = obj2;
                mi6.C = 2;
                kk0 kk0 = new kk0(1, rc9.a0(mi6));
                kk0.v();
                oi6.F = kk0;
                qq4.k((Object) null);
                t = kk0.t();
                if (t != p81) {
                    Object obj5 = t;
                    obj = obj2;
                    obj3 = obj5;
                    if (!sg3.e(obj3, obj)) {
                    }
                }
                return p81;
            }
        }
        mi6 = new mi6(oi6, h61);
        Object obj32 = mi6.A;
        i = mi6.C;
        p81 = p81.w;
        if (i != 0) {
        }
        mi6.z = obj2;
        mi6.C = 2;
        kk0 kk02 = new kk0(1, rc9.a0(mi6));
        kk02.v();
        oi6.F = kk02;
        qq4.k((Object) null);
        t = kk02.t();
        if (t != p81) {
        }
        return p81;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r0.a(r1) == r6) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public static final Object g1(oi6 oi6, h61 h61) {
        ni6 ni6;
        int i;
        Object obj;
        Object obj2;
        qq4 qq4 = oi6.G;
        if (h61 instanceof ni6) {
            ni6 = (ni6) h61;
            int i2 = ni6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ni6.C = i2 - Integer.MIN_VALUE;
                Object obj3 = ni6.A;
                i = ni6.C;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj3);
                    obj2 = oi6.x.getValue();
                    ni6.z = obj2;
                    ni6.C = 1;
                } else if (i == 1) {
                    Object obj4 = ni6.z;
                    o85.q(obj3);
                    obj2 = obj4;
                } else if (i == 2) {
                    obj = ni6.z;
                    o85.q(obj3);
                    if (!sg3.e(obj3, obj)) {
                        oi6.I = Long.MIN_VALUE;
                        throw new CancellationException("snapTo() was canceled because state was changed to " + obj3 + " instead of " + obj);
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!sg3.e(obj2, oi6.z)) {
                    qq4.k((Object) null);
                    return vs7.a;
                }
                ni6.z = obj2;
                ni6.C = 2;
                kk0 kk0 = new kk0(1, rc9.a0(ni6));
                kk0.v();
                oi6.F = kk0;
                qq4.k((Object) null);
                Object t = kk0.t();
                if (t != p81) {
                    Object obj5 = t;
                    obj = obj2;
                    obj3 = obj5;
                    if (!sg3.e(obj3, obj)) {
                    }
                    return vs7.a;
                }
                return p81;
            }
        }
        ni6 = new ni6(oi6, h61);
        Object obj32 = ni6.A;
        i = ni6.C;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        if (!sg3.e(obj2, oi6.z)) {
        }
    }

    public static Object i1(oi6 oi6, Object obj, a97 a97) {
        Object a;
        mm7 mm7 = oi6.A;
        if (mm7 != null && (a = nq4.a(oi6.H, new ii6(oi6, obj, mm7, (f61) null, 0), a97)) == p81.w) {
            return a;
        }
        return vs7.a;
    }

    public static void k1(hi6 hi6, long j) {
        long j2 = hi6.a + j;
        hi6.a = j2;
        long j3 = hi6.h;
        if (j2 >= j3) {
            hi6.d = 1.0f;
            return;
        }
        p38 p38 = hi6.b;
        kl klVar = hi6.e;
        if (p38 != null) {
            kl klVar2 = hi6.f;
            if (klVar2 == null) {
                klVar2 = O;
            }
            hi6.d = z65.o(((kl) p38.t(j2, klVar, P, klVar2)).a(0), 0.0f, 1.0f);
            return;
        }
        float f = ((float) j2) / ((float) j3);
        float f2 = 1.0f - f;
        hi6.d = (f * 1.0f) + (f2 * klVar.a(0));
    }

    public final Object H0() {
        return this.y.getValue();
    }

    public final Object J0() {
        return this.x.getValue();
    }

    public final void O0(Object obj) {
        this.y.setValue(obj);
    }

    public final void P0(mm7 mm7) {
        mm7 mm72 = this.A;
        if (mm72 != null && !mm7.equals(mm72)) {
            mm7 mm73 = this.A;
            xm5.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + mm73 + ", new instance: " + mm7);
        }
        this.A = mm7;
    }

    public final void Q0() {
        this.A = null;
        cy6 cy6 = this.D;
        if (cy6 != null) {
            cy6.b(this);
        }
    }

    public final Object h1(h61 h61) {
        float p = i95.p(h61.r());
        int i = (p > 0.0f ? 1 : (p == 0.0f ? 0 : -1));
        vs7 vs7 = vs7.a;
        if (i <= 0) {
            j1();
            return vs7;
        }
        this.M = p;
        Object a = pd8.s(h61.r()).a(this.N, h61);
        if (a == p81.w) {
            return a;
        }
        return vs7;
    }

    public final void j1() {
        mm7 mm7 = this.A;
        if (mm7 != null) {
            mm7.c();
        }
        this.J.d();
        if (this.K != null) {
            this.K = null;
            n1(1.0f);
            m1();
        }
    }

    public final Object l1(float f, Object obj, a97 a97) {
        if (0.0f > f || f > 1.0f) {
            xm5.a("Expecting fraction between 0 and 1. Got " + f);
        }
        mm7 mm7 = this.A;
        if (mm7 != null) {
            Object a = nq4.a(this.H, new li6(obj, this.x.getValue(), this, mm7, f, (f61) null), a97);
            if (a == p81.w) {
                return a;
            }
        }
        return vs7.a;
    }

    public final void m1() {
        mm7 mm7 = this.A;
        if (mm7 != null) {
            mm7.m(dh4.D(((double) this.E.d()) * ((double) mm7.g())));
        }
    }

    public final void n1(float f) {
        this.E.e(f);
    }

    public final void o1(cy6 cy6) {
        c9 c9Var;
        if (!sg3.e(this.D, cy6)) {
            cy6 cy62 = this.D;
            if (cy62 != null) {
                cy62.b(this);
            }
            cy6 cy63 = this.D;
            if (!(cy63 == null || (c9Var = (c9) cy63.i) == null)) {
                c9Var.h();
            }
            this.D = cy6;
            if (cy6 != null) {
                cy6.f();
            }
            cy6 cy64 = this.D;
            if (cy64 != null) {
                cy64.e(this, rc9.p, this.C);
            }
        }
    }

    public final Object p1(Object obj, a97 a97) {
        mm7 mm7 = this.A;
        if (mm7 != null && (!sg3.e(this.y.getValue(), obj) || !sg3.e(this.x.getValue(), obj))) {
            Object a = nq4.a(this.H, new ii6(this, obj, mm7, (f61) null, 1), a97);
            if (a == p81.w) {
                return a;
            }
        }
        return vs7.a;
    }
}
