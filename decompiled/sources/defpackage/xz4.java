package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: xz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xz4 extends dd4 implements gh4, dy3 {
    public static final l76 m0 = new l76();
    public static final ay3 n0 = new ay3();
    public static final float[] o0 = eh4.a();
    public static final uz4 p0 = new Object();
    public static final hr2 q0 = new hr2(5);
    public final uy3 O;
    public xz4 P;
    public xz4 Q;
    public boolean R;
    public boolean S;
    public vr2 T;
    public tp1 U;
    public ey3 V;
    public float W = 0.8f;
    public mh4 X;
    public hp4 Y;
    public long Z = 0;
    public float a0;
    public sp4 b0;
    public ay3 c0;
    public pq6 d0 = gr8.h;
    public boolean e0;
    public boolean f0;
    public cx2 g0;
    public qk0 h0;
    public af i0;
    public final wz4 j0 = new wz4(this, 1);
    public boolean k0;
    public o95 l0;

    public xz4(uy3 uy3) {
        this.O = uy3;
        this.U = uy3.T;
        this.V = uy3.U;
    }

    public static xz4 x1(dy3 dy3) {
        gd4 gd4;
        xz4 xz4;
        if (dy3 instanceof gd4) {
            gd4 = (gd4) dy3;
        } else {
            gd4 = null;
        }
        if (gd4 != null && (xz4 = gd4.w.O) != null) {
            return xz4;
        }
        dy3.getClass();
        return (xz4) dy3;
    }

    public final long A(long j) {
        if (!c1().J) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        dy3 I = t49.I(this);
        je jeVar = (je) xy3.a(this.O);
        jeVar.A();
        return O(I, l35.d(eh4.b(j, jeVar.s0), I.R(0)));
    }

    public final void A1(xz4 xz4, float[] fArr) {
        while (!this.equals(xz4)) {
            o95 o95 = this.l0;
            if (o95 != null) {
                eh4.g(fArr, ((fx2) o95).b());
            }
            long j = this.Z;
            if (!oe3.a(j, 0)) {
                float[] fArr2 = o0;
                eh4.d(fArr2);
                eh4.h(fArr2, (float) ((int) (j >> 32)), (float) ((int) (j & 4294967295L)));
                eh4.g(fArr, fArr2);
            }
            this = this.Q;
            this.getClass();
        }
    }

    public final Object B() {
        uy3 uy3 = this.O;
        if (!uy3.a0.f(64)) {
            return null;
        }
        c1();
        Object obj = null;
        for (ll4 ll4 = (ib7) uy3.a0.f; ll4 != null; ll4 = ll4.A) {
            if ((ll4.y & 64) != 0) {
                ll4 ll42 = ll4;
                eq4 eq4 = null;
                while (ll42 != null) {
                    if (ll42 instanceof gd5) {
                        obj = ((gd5) ll42).v(uy3.T, obj);
                    } else if ((ll42.y & 64) != 0 && (ll42 instanceof wo1)) {
                        int i = 0;
                        for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                            if ((ll43.y & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    ll42 = ll43;
                                } else {
                                    if (eq4 == null) {
                                        eq4 = new eq4(new ll4[16]);
                                    }
                                    if (ll42 != null) {
                                        eq4.b(ll42);
                                        ll42 = null;
                                    }
                                    eq4.b(ll43);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    ll42 = rc9.j(eq4);
                }
            }
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[LOOP_START] */
    public final void B1(vr2 vr2, boolean z) {
        boolean z2;
        p95 p95;
        eq4 eq4;
        Reference poll;
        af afVar;
        eq4 eq42;
        Reference poll2;
        Object obj;
        uy3 uy3 = this.O;
        if (z || this.T != vr2 || !sg3.e(this.U, uy3.T) || this.V != uy3.U) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.U = uy3.T;
        this.V = uy3.U;
        boolean J = uy3.J();
        wz4 wz4 = this.j0;
        if (!J || vr2 == null) {
            this.T = null;
            o95 o95 = this.l0;
            if (o95 != null) {
                fx2 fx2 = (fx2) o95;
                if (!x91.D(fx2.b())) {
                    uy3.P(this);
                }
                fx2.z = null;
                fx2.A = null;
                fx2.C = true;
                fx2.f(false);
                bx2 bx2 = fx2.x;
                if (bx2 != null) {
                    bx2.a(fx2.w);
                    je jeVar = fx2.y;
                    k68 k68 = jeVar.I0;
                    do {
                        eq4 = (eq4) k68.x;
                        poll = ((ReferenceQueue) k68.y).poll();
                        if (poll != null) {
                            eq4.k(poll);
                            continue;
                        }
                    } while (poll != null);
                    eq4.b(new WeakReference(fx2, (ReferenceQueue) k68.y));
                    jeVar.V.j(fx2);
                }
                this.l0 = null;
                uy3.e0 = true;
                wz4.b();
                if (c1().J && uy3.K() && (p95 = uy3.J) != null) {
                    ((je) p95).t(uy3);
                }
            }
            this.k0 = false;
            return;
        }
        this.T = vr2;
        if (this.l0 == null) {
            p95 a = xy3.a(uy3);
            af afVar2 = this.i0;
            if (afVar2 == null) {
                af afVar3 = new af(3, (Object) this, (Object) new wz4(this, 0));
                this.i0 = afVar3;
                afVar = afVar3;
            } else {
                afVar = afVar2;
            }
            je jeVar2 = (je) a;
            k68 k682 = jeVar2.I0;
            do {
                eq42 = (eq4) k682.x;
                poll2 = ((ReferenceQueue) k682.y).poll();
                if (poll2 != null) {
                    eq42.k(poll2);
                    continue;
                }
            } while (poll2 != null);
            while (true) {
                int i = eq42.y;
                if (i == 0) {
                    obj = null;
                    break;
                }
                obj = ((Reference) eq42.l(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
            o95 o952 = (o95) obj;
            if (o952 != null) {
                fx2 fx22 = (fx2) o952;
                bx2 bx22 = fx22.x;
                if (bx22 != null) {
                    if (!fx22.w.s) {
                        yb3.a("layer should have been released before reuse");
                    }
                    fx22.w = bx22.c();
                    fx22.C = false;
                    fx22.z = afVar;
                    fx22.A = wz4;
                    fx22.M = false;
                    fx22.N = false;
                    fx22.O = true;
                    eh4.d(fx22.D);
                    float[] fArr = fx22.E;
                    if (fArr != null) {
                        eh4.d(fArr);
                    }
                    fx22.K = ql7.b;
                    fx22.P = false;
                    fx22.B = 9223372034707292159L;
                    fx22.L = null;
                    fx22.J = 0;
                } else {
                    throw b81.t("currently reuse is only supported when we manage the layer lifecycle");
                }
            } else {
                o952 = new fx2(jeVar2.getGraphicsContext().c(), jeVar2.getGraphicsContext(), jeVar2, afVar, wz4);
            }
            fx2 fx23 = (fx2) o952;
            fx23.e(this.y);
            fx23.d(this.Z);
            this.l0 = o952;
            C1(true);
            uy3.e0 = true;
            wz4.b();
        } else if (z2) {
            C1(true);
        }
    }

    public final void C1(boolean z) {
        char c;
        int i;
        boolean z2;
        boolean z3;
        p95 p95;
        sr2 sr2;
        int i2;
        sr2 sr22;
        o95 o95 = this.l0;
        vr2 vr2 = this.T;
        if (o95 != null) {
            if (vr2 != null) {
                l76 l76 = m0;
                l76.a();
                uy3 uy3 = this.O;
                l76.P = uy3.T;
                l76.Q = uy3.U;
                l76.N = pv8.O(this.y);
                ((je) xy3.a(uy3)).getSnapshotObserver().a.e(this, xc4.B, new ae(7, vr2, this));
                ay3 ay3 = this.c0;
                if (ay3 == null) {
                    ay3 = new ay3();
                    this.c0 = ay3;
                }
                ay3 ay32 = n0;
                ay32.getClass();
                ay32.a = ay3.a;
                ay32.b = ay3.b;
                ay32.c = ay3.c;
                ay32.d = ay3.d;
                ay32.e = ay3.e;
                ay32.f = ay3.f;
                ay32.g = ay3.g;
                ay32.h = ay3.h;
                ay32.i = ay3.i;
                ay3.a = l76.x;
                ay3.b = l76.y;
                ay3.c = l76.A;
                ay3.d = l76.B;
                ay3.e = l76.F;
                ay3.f = l76.G;
                ay3.g = l76.H;
                ay3.h = l76.I;
                ay3.i = l76.J;
                fx2 fx2 = (fx2) o95;
                je jeVar = fx2.y;
                int i3 = l76.w | fx2.J;
                fx2.H = l76.Q;
                tp1 tp1 = l76.P;
                fx2.G = tp1;
                if ((1048576 & i3) != 0) {
                    cx2 cx2 = fx2.w;
                    l76.O.getClass();
                    int r0 = tp1.r0(0.0f);
                    l76.O.getClass();
                    int r02 = tp1.r0(0.0f);
                    l76.O.getClass();
                    int r03 = tp1.r0(0.0f);
                    l76.O.getClass();
                    int r04 = tp1.r0(0.0f);
                    cx2.v = r0;
                    cx2.w = r02;
                    cx2.x = r03;
                    cx2.y = r04;
                    cx2.a.v(r0, r02, r03, r04);
                    fx2.c();
                }
                int i4 = i3 & 4096;
                if (i4 != 0) {
                    fx2.K = l76.J;
                }
                if ((i3 & 1) != 0) {
                    cx2 cx22 = fx2.w;
                    float f = l76.x;
                    ex2 ex2 = cx22.a;
                    if (ex2.c() != f) {
                        ex2.z(f);
                    }
                }
                if ((i3 & 2) != 0) {
                    cx2 cx23 = fx2.w;
                    float f2 = l76.y;
                    ex2 ex22 = cx23.a;
                    if (ex22.L() != f2) {
                        ex22.m(f2);
                    }
                }
                if ((i3 & 4) != 0) {
                    cx2 cx24 = fx2.w;
                    float f3 = l76.z;
                    ex2 ex23 = cx24.a;
                    if (ex23.a() != f3) {
                        ex23.t(f3);
                    }
                }
                if ((i3 & 8) != 0) {
                    cx2 cx25 = fx2.w;
                    float f4 = l76.A;
                    ex2 ex24 = cx25.a;
                    if (ex24.B() != f4) {
                        ex24.G(f4);
                    }
                }
                if ((i3 & 16) != 0) {
                    cx2 cx26 = fx2.w;
                    float f5 = l76.B;
                    ex2 ex25 = cx26.a;
                    if (ex25.w() != f5) {
                        ex25.f(f5);
                    }
                }
                if ((i3 & 32) != 0) {
                    cx2 cx27 = fx2.w;
                    float f6 = l76.C;
                    ex2 ex26 = cx27.a;
                    if (ex26.K() != f6) {
                        ex26.d(f6);
                        cx27.g = true;
                        cx27.a();
                    }
                    if (l76.C > 0.0f && !fx2.P && (sr22 = fx2.A) != null) {
                        sr22.b();
                    }
                }
                if ((i3 & 64) != 0) {
                    cx2 cx28 = fx2.w;
                    long j = l76.D;
                    ex2 ex27 = cx28.a;
                    if (!jt0.c(j, ex27.s())) {
                        ex27.y(j);
                    }
                }
                if ((i3 & 128) != 0) {
                    cx2 cx29 = fx2.w;
                    long j2 = l76.E;
                    ex2 ex28 = cx29.a;
                    if (!jt0.c(j2, ex28.x())) {
                        ex28.H(j2);
                    }
                }
                if ((i3 & 1024) != 0) {
                    cx2 cx210 = fx2.w;
                    float f7 = l76.H;
                    ex2 ex29 = cx210.a;
                    if (ex29.q() != f7) {
                        ex29.e(f7);
                    }
                }
                if ((i3 & 256) != 0) {
                    cx2 cx211 = fx2.w;
                    float f8 = l76.F;
                    ex2 ex210 = cx211.a;
                    if (ex210.D() != f8) {
                        ex210.M(f8);
                    }
                }
                if ((i3 & 512) != 0) {
                    cx2 cx212 = fx2.w;
                    float f9 = l76.G;
                    ex2 ex211 = cx212.a;
                    if (ex211.o() != f9) {
                        ex211.b(f9);
                    }
                }
                if ((i3 & 2048) != 0) {
                    cx2 cx213 = fx2.w;
                    float f10 = l76.I;
                    ex2 ex212 = cx213.a;
                    if (ex212.A() != f10) {
                        ex212.J(f10);
                    }
                }
                if (i4 != 0) {
                    c = ' ';
                    boolean a = ql7.a(fx2.K, ql7.b);
                    cx2 cx214 = fx2.w;
                    if (!a) {
                        long floatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fx2.K >> 32)) * ((float) ((int) (fx2.B >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fx2.K & 4294967295L)) * ((float) ((int) (fx2.B & 4294967295L))))) & 4294967295L);
                        if (!l35.b(cx214.z, floatToRawIntBits)) {
                            cx214.z = floatToRawIntBits;
                            cx214.a.r(floatToRawIntBits);
                        }
                    } else if (!l35.b(cx214.z, 9205357640488583168L)) {
                        cx214.z = 9205357640488583168L;
                        cx214.a.r(9205357640488583168L);
                    }
                } else {
                    c = ' ';
                }
                if ((i3 & 16384) != 0) {
                    cx2 cx215 = fx2.w;
                    boolean z4 = l76.L;
                    if (cx215.A != z4) {
                        cx215.A = z4;
                        cx215.g = true;
                        cx215.a();
                    }
                }
                if ((131072 & i3) != 0) {
                    ex2 ex213 = fx2.w.a;
                }
                if ((262144 & i3) != 0) {
                    cx2 cx216 = fx2.w;
                    lt0 lt0 = l76.R;
                    ex2 ex214 = cx216.a;
                    if (!sg3.e(ex214.l(), lt0)) {
                        ex214.u(lt0);
                    }
                }
                if ((524288 & i3) != 0) {
                    cx2 cx217 = fx2.w;
                    int i5 = l76.S;
                    ex2 ex215 = cx217.a;
                    if (ex215.N() != i5) {
                        ex215.h(i5);
                    }
                }
                if ((32768 & i3) != 0) {
                    cx2 cx218 = fx2.w;
                    int i6 = l76.M;
                    if (i6 == 0) {
                        i2 = 0;
                    } else if (i6 == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                        if (i6 != 2) {
                            h.s("Not supported composition strategy");
                            return;
                        }
                    }
                    ex2 ex216 = cx218.a;
                    if (ex216.k() != i2) {
                        ex216.F(i2);
                    }
                }
                if ((i3 & 7963) != 0) {
                    fx2.M = true;
                    fx2.N = true;
                }
                if (!sg3.e(fx2.L, l76.T)) {
                    n85 n85 = l76.T;
                    fx2.L = n85;
                    if (n85 == null) {
                        i = i3;
                    } else {
                        cx2 cx219 = fx2.w;
                        if (n85 instanceof l85) {
                            ly5 ly5 = ((l85) n85).l;
                            float f11 = ly5.a;
                            float f12 = ly5.b;
                            i = i3;
                            cx219.f((((long) Float.floatToRawIntBits(f11)) << c) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(ly5.c - f11)) << c) | (((long) Float.floatToRawIntBits(ly5.d - f12)) & 4294967295L), 0.0f);
                        } else {
                            i = i3;
                            cx2 cx220 = cx219;
                            if (n85 instanceof k85) {
                                eh ehVar = ((k85) n85).l;
                                cx220.k = null;
                                cx220.i = 9205357640488583168L;
                                cx220.h = 0;
                                cx220.j = 0.0f;
                                cx220.g = true;
                                cx220.n = false;
                                cx220.l = ehVar;
                                cx220.a();
                            } else if (n85 instanceof m85) {
                                m85 m85 = (m85) n85;
                                eh ehVar2 = m85.m;
                                if (ehVar2 != null) {
                                    cx220.k = null;
                                    cx220.i = 9205357640488583168L;
                                    cx220.h = 0;
                                    cx220.j = 0.0f;
                                    cx220.g = true;
                                    cx220.n = false;
                                    cx220.l = ehVar2;
                                    cx220.a();
                                } else {
                                    l96 l96 = m85.l;
                                    cx2 cx221 = cx220;
                                    cx221.f((((long) Float.floatToRawIntBits(l96.a)) << c) | (((long) Float.floatToRawIntBits(l96.b)) & 4294967295L), (((long) Float.floatToRawIntBits(l96.b())) << c) | (((long) Float.floatToRawIntBits(l96.a())) & 4294967295L), Float.intBitsToFloat((int) (l96.h >> c)));
                                }
                            } else {
                                h.c();
                                return;
                            }
                        }
                        if (Build.VERSION.SDK_INT < 33 && (((n85 instanceof k85) || ((n85 instanceof m85) && !p25.t(((m85) n85).l))) && (sr2 = fx2.A) != null)) {
                            sr2.b();
                        }
                    }
                    z2 = true;
                } else {
                    i = i3;
                    z2 = false;
                }
                fx2.J = l76.w;
                if (i != 0 || z2) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ViewParent parent = jeVar.getParent();
                        if (parent != null) {
                            parent.onDescendantInvalidated(jeVar, jeVar);
                        }
                    } else {
                        jeVar.invalidate();
                    }
                    if (je.j()) {
                        jeVar.M(0.0f);
                    }
                }
                boolean z5 = this.S;
                this.S = l76.L;
                this.W = l76.z;
                if (ay32.a == ay3.a && ay32.b == ay3.b && ay32.c == ay3.c && ay32.d == ay3.d && ay32.e == ay3.e && ay32.f == ay3.f && ay32.g == ay3.g && ay32.h == ay3.h && ql7.a(ay32.i, ay3.i)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && ((!z3 || z5 != this.S) && (p95 = uy3.J) != null)) {
                    ((je) p95).t(uy3);
                }
                if (!z3) {
                    uy3.P(this);
                    if (uy3.i0 > 0) {
                        je jeVar2 = (je) xy3.a(uy3);
                        hv2 hv2 = jeVar2.m0.e;
                        hv2.getClass();
                        if (uy3.i0 > 0) {
                            ((eq4) hv2.y).b(uy3);
                            uy3.h0 = true;
                        }
                        jeVar2.F((uy3) null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw b81.t("updateLayerParameters requires a non-null layerBlock");
        } else if (vr2 != null) {
            yb3.b("null layer with a non-null layerBlock");
        }
    }

    public final dy3 D() {
        boolean z = c1().J;
        uy3 uy3 = this.O;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (uy3 uy32 = uy3; uy32 != null; uy32 = uy32.v()) {
                sb.append("\n|");
                sb.append(uy32);
                sb.append(" isAttached=");
                sb.append(uy32.J());
                sb.append(" modifier=");
                sb.append(uy32.f0);
                sb.append(" tail=");
                sb.append(c1());
            }
            yb3.b(sb.toString());
        }
        l1();
        return ((xz4) uy3.a0.e).Q;
    }

    public final boolean D0() {
        if (this.X != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    public final boolean D1(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & -9223372034707292160L) != 0) {
            return false;
        }
        o95 o95 = this.l0;
        if (o95 == null || !this.S) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        cx2 cx2 = ((fx2) o95).w;
        if (cx2.A) {
            n85 d = cx2.d();
            if (d instanceof l85) {
                ly5 ly5 = ((l85) d).l;
                if (ly5.a > intBitsToFloat || intBitsToFloat >= ly5.c || ly5.b > intBitsToFloat2 || intBitsToFloat2 >= ly5.d) {
                    z2 = false;
                    z = true;
                }
            } else {
                if (d instanceof m85) {
                    l96 l96 = ((m85) d).l;
                    float f = l96.a;
                    long j2 = l96.f;
                    long j3 = l96.h;
                    long j4 = l96.g;
                    float f2 = l96.d;
                    float f3 = l96.b;
                    z2 = false;
                    float f4 = l96.c;
                    float f5 = intBitsToFloat2;
                    z = true;
                    long j5 = l96.e;
                    if (intBitsToFloat >= f && intBitsToFloat < f4 && f5 >= f3 && f5 < f2) {
                        int i = (int) (j5 >> 32);
                        float f6 = f4;
                        long j6 = j5;
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= l96.b()) {
                            int i3 = (int) (j3 >> 32);
                            int i4 = i2;
                            int i5 = i3;
                            int i6 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i3) <= l96.b()) {
                                int i7 = (int) (j6 & 4294967295L);
                                int i8 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= l96.a()) {
                                    int i9 = (int) (j2 & 4294967295L);
                                    int i10 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i10) + Float.intBitsToFloat(i9) <= l96.a()) {
                                        float intBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                        float intBitsToFloat4 = Float.intBitsToFloat(i7) + f3;
                                        float intBitsToFloat5 = f6 - Float.intBitsToFloat(i4);
                                        float intBitsToFloat6 = Float.intBitsToFloat(i9) + f3;
                                        float intBitsToFloat7 = f6 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat8 = f2 - Float.intBitsToFloat(i10);
                                        float intBitsToFloat9 = f2 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat10 = Float.intBitsToFloat(i5) + f;
                                        if (intBitsToFloat >= intBitsToFloat3 || f5 >= intBitsToFloat4) {
                                            float f7 = f5;
                                            if (intBitsToFloat >= intBitsToFloat10 || f7 <= intBitsToFloat9) {
                                                float f8 = intBitsToFloat5;
                                                if (intBitsToFloat <= f8 || f7 >= intBitsToFloat6) {
                                                    if (intBitsToFloat > intBitsToFloat7 && f7 > intBitsToFloat8) {
                                                        float f9 = intBitsToFloat7;
                                                        z3 = t35.w(intBitsToFloat, f7, f9, intBitsToFloat8, l96.g);
                                                    }
                                                    z3 = z;
                                                } else {
                                                    z3 = t35.w(intBitsToFloat, f7, f8, intBitsToFloat6, l96.f);
                                                }
                                            } else {
                                                z3 = t35.w(intBitsToFloat, f7, intBitsToFloat10, intBitsToFloat9, l96.h);
                                            }
                                        } else {
                                            float f10 = intBitsToFloat3;
                                            float f11 = f5;
                                            z3 = t35.w(intBitsToFloat, f11, f10, intBitsToFloat4, l96.e);
                                        }
                                    }
                                }
                            }
                        }
                        eh a = gh.a();
                        eh.c(a, l96);
                        z3 = t35.v(intBitsToFloat, f5, a);
                    }
                } else {
                    float f12 = intBitsToFloat2;
                    z2 = false;
                    z = true;
                    if (d instanceof k85) {
                        z3 = t35.v(intBitsToFloat, f12, ((k85) d).l);
                    } else {
                        h.c();
                        return false;
                    }
                }
                if (z3) {
                    return z;
                }
                return z2;
            }
            z3 = z2;
            if (z3) {
            }
        }
        z2 = false;
        z = true;
        z3 = z;
        if (z3) {
        }
    }

    public final uy3 G0() {
        return this.O;
    }

    public final mh4 J0() {
        mh4 mh4 = this.X;
        if (mh4 != null) {
            return mh4;
        }
        h.s("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final dd4 K0() {
        return this.Q;
    }

    public final long L0() {
        return this.Z;
    }

    public final long M(dy3 dy3, long j) {
        return O(dy3, j);
    }

    public final long N(long j) {
        if (!c1().J) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return O(t49.I(this), ((je) xy3.a(this.O)).G(j));
    }

    public final long O(dy3 dy3, long j) {
        if (dy3 instanceof gd4) {
            gd4 gd4 = (gd4) dy3;
            gd4.w.O.l1();
            return gd4.O(this, j ^ -9223372034707292160L) ^ -9223372034707292160L;
        }
        xz4 x1 = x1(dy3);
        x1.l1();
        xz4 Y0 = Y0(x1);
        while (x1 != Y0) {
            o95 o95 = x1.l0;
            if (o95 != null) {
                fx2 fx2 = (fx2) o95;
                float[] b = fx2.b();
                if (!fx2.O) {
                    j = eh4.b(j, b);
                }
            }
            j = gr8.T(j, x1.Z);
            x1 = x1.Q;
            x1.getClass();
        }
        return S0(Y0, j);
    }

    public final void P0() {
        h0(this.Z, this.a0, this.T);
    }

    public final ly5 Q(dy3 dy3, boolean z) {
        if (!c1().J) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!dy3.n()) {
            yb3.b("LayoutCoordinates " + dy3 + " is not attached!");
        }
        xz4 x1 = x1(dy3);
        x1.l1();
        xz4 Y0 = Y0(x1);
        sp4 sp4 = this.b0;
        if (sp4 == null) {
            sp4 = new sp4();
            this.b0 = sp4;
        }
        sp4.b = 0.0f;
        sp4.c = 0.0f;
        sp4.d = (float) ((int) (dy3.k() >> 32));
        sp4.e = (float) ((int) (dy3.k() & 4294967295L));
        while (x1 != Y0) {
            x1.t1(sp4, z, false);
            if (sp4.b()) {
                return ly5.e;
            }
            x1 = x1.Q;
            x1.getClass();
        }
        R0(Y0, sp4, z);
        return new ly5(sp4.b, sp4.c, sp4.d, sp4.e);
    }

    public final long R(long j) {
        if (!c1().J) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l1();
        while (this != null) {
            uy3 uy3 = this.O;
            if (this == ((xz4) uy3.a0.e) && !uy3.y) {
                long b = ((je) xy3.a(uy3)).getRectManager().b(uy3);
                if (!oe3.a(b, 9223372034707292159L)) {
                    return gr8.T(j, b);
                }
            }
            o95 o95 = this.l0;
            if (o95 != null) {
                fx2 fx2 = (fx2) o95;
                float[] b2 = fx2.b();
                if (!fx2.O) {
                    j = eh4.b(j, b2);
                }
            }
            j = gr8.T(j, this.Z);
            this = this.Q;
        }
        return j;
    }

    public final void R0(xz4 xz4, sp4 sp4, boolean z) {
        if (xz4 != this) {
            xz4 xz42 = this.Q;
            if (xz42 != null) {
                xz42.R0(xz4, sp4, z);
            }
            long j = this.Z;
            float f = (float) ((int) (j >> 32));
            sp4.b -= f;
            sp4.d -= f;
            float f2 = (float) ((int) (j & 4294967295L));
            sp4.c -= f2;
            sp4.e -= f2;
            o95 o95 = this.l0;
            if (o95 != null) {
                fx2 fx2 = (fx2) o95;
                float[] a = fx2.a();
                if (!fx2.O) {
                    if (a == null) {
                        sp4.b = 0.0f;
                        sp4.c = 0.0f;
                        sp4.d = 0.0f;
                        sp4.e = 0.0f;
                    } else {
                        eh4.c(a, sp4);
                    }
                }
                if (this.S && z) {
                    long j2 = this.y;
                    sp4.a(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) ((int) (j2 & 4294967295L)));
                }
            }
        }
    }

    public final long S0(xz4 xz4, long j) {
        if (xz4 == this) {
            return j;
        }
        xz4 xz42 = this.Q;
        if (xz42 == null || sg3.e(xz4, xz42)) {
            return Z0(j);
        }
        return Z0(xz42.S0(xz4, j));
    }

    public final long T0(long j) {
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat((int) (j >> 32)) - ((float) b0())) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat((int) (j & 4294967295L)) - ((float) Z())) / 2.0f))) & 4294967295L);
    }

    public final float U0(long j, long j2) {
        float f;
        float f2;
        if (((float) b0()) >= Float.intBitsToFloat((int) (j2 >> 32)) && ((float) Z()) >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long T0 = T0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (T0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (T0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat3 < 0.0f) {
            f = -intBitsToFloat3;
        } else {
            f = intBitsToFloat3 - ((float) b0());
        }
        float max = Math.max(0.0f, f);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat4 < 0.0f) {
            f2 = -intBitsToFloat4;
        } else {
            f2 = intBitsToFloat4 - ((float) Z());
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(max)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, f2))) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i);
                    float intBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void V0(qk0 qk0, cx2 cx2) {
        boolean z;
        o95 o95 = this.l0;
        if (o95 != null) {
            fx2 fx2 = (fx2) o95;
            tk0 tk0 = fx2.I;
            fx2.g();
            if (fx2.w.a.K() > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            fx2.P = z;
            wr0 wr0 = tk0.x;
            wr0.b0(qk0);
            wr0.y = cx2;
            t49.H(tk0, fx2.w);
            return;
        }
        long j = this.Z;
        float f = (float) ((int) (j >> 32));
        float f2 = (float) ((int) (j & 4294967295L));
        qk0.o(f, f2);
        W0(qk0, cx2);
        qk0.o(-f, -f2);
    }

    public final void W0(qk0 qk0, cx2 cx2) {
        cx2 cx22;
        xz4 xz4;
        qk0 qk02;
        ll4 d1 = d1(4);
        if (d1 == null) {
            r1(qk0, cx2);
            return;
        }
        uy3 uy3 = this.O;
        uy3.getClass();
        wy3 sharedDrawScope = ((je) xy3.a(uy3)).getSharedDrawScope();
        long O2 = pv8.O(this.y);
        sharedDrawScope.getClass();
        eq4 eq4 = null;
        while (d1 != null) {
            if (d1 instanceof gz1) {
                xz4 = this;
                qk02 = qk0;
                cx22 = cx2;
                sharedDrawScope.c(qk02, O2, xz4, (gz1) d1, cx22);
                d1 = rc9.j(eq4);
            } else {
                xz4 = this;
                qk02 = qk0;
                cx22 = cx2;
                if ((d1.y & 4) != 0 && (d1 instanceof wo1)) {
                    int i = 0;
                    for (ll4 ll4 = ((wo1) d1).L; ll4 != null; ll4 = ll4.B) {
                        if ((ll4.y & 4) != 0) {
                            i++;
                            if (i == 1) {
                                d1 = ll4;
                            } else {
                                if (eq4 == null) {
                                    eq4 = new eq4(new ll4[16]);
                                }
                                if (d1 != null) {
                                    eq4.b(d1);
                                    d1 = null;
                                }
                                eq4.b(ll4);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                d1 = rc9.j(eq4);
            }
            qk0 = qk02;
            this = xz4;
            cx2 = cx22;
        }
    }

    public abstract void X0();

    public final float Y() {
        return this.O.T.Y();
    }

    public final xz4 Y0(xz4 xz4) {
        uy3 uy3 = xz4.O;
        uy3 uy32 = this.O;
        if (uy3 == uy32) {
            ll4 c1 = xz4.c1();
            ll4 c12 = c1();
            if (!c12.w.J) {
                yb3.b("visitLocalAncestors called on an unattached node");
            }
            for (ll4 ll4 = c12.w.A; ll4 != null; ll4 = ll4.A) {
                if ((ll4.y & 2) != 0 && ll4 == c1) {
                    return xz4;
                }
            }
        } else {
            while (uy3.K > uy32.K) {
                uy3 = uy3.v();
                uy3.getClass();
            }
            uy3 uy33 = uy32;
            while (uy33.K > uy3.K) {
                uy33 = uy33.v();
                uy33.getClass();
            }
            while (uy3 != uy33) {
                uy3 = uy3.v();
                uy33 = uy33.v();
                if (uy3 != null) {
                    if (uy33 == null) {
                    }
                }
                h.q("layouts are not part of the same hierarchy");
                return null;
            }
            if (uy33 != uy32) {
                if (uy3 != xz4.O) {
                    return (hc3) uy3.a0.d;
                }
                return xz4;
            }
        }
        return this;
    }

    public final long Z0(long j) {
        long j2 = this.Z;
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((float) ((int) (j2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((float) ((int) (j2 >> 32))))) << 32);
        o95 o95 = this.l0;
        if (o95 != null) {
            fx2 fx2 = (fx2) o95;
            float[] a = fx2.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!fx2.O) {
                return eh4.b(floatToRawIntBits, a);
            }
        }
        return floatToRawIntBits;
    }

    public abstract fd4 a1();

    public final float b() {
        return this.O.T.b();
    }

    public final long b1() {
        return this.U.A0(this.O.V.d());
    }

    public abstract ll4 c1();

    public final long d(long j) {
        long R2 = R(j);
        je jeVar = (je) xy3.a(this.O);
        jeVar.A();
        return eh4.b(R2, jeVar.r0);
    }

    public final ll4 d1(int i) {
        boolean g = yz4.g(i);
        ll4 c1 = c1();
        if (!g && (c1 = c1.A) == null) {
            return null;
        }
        ll4 e1 = e1(g);
        while (e1 != null && (e1.z & i) != 0) {
            if ((e1.y & i) != 0) {
                return e1;
            }
            if (e1 == c1) {
                return null;
            }
            e1 = e1.B;
        }
        return null;
    }

    public final ll4 e1(boolean z) {
        ll4 c1;
        o00 o00 = this.O.a0;
        if (((xz4) o00.e) == this) {
            return (ll4) o00.g;
        }
        xz4 xz4 = this.Q;
        if (z) {
            if (xz4 == null || (c1 = xz4.c1()) == null) {
                return null;
            }
            return c1.B;
        } else if (xz4 != null) {
            return xz4.c1();
        } else {
            return null;
        }
    }

    public final void f1(ll4 ll4, vz4 vz4, long j, f03 f03, int i, boolean z) {
        if (ll4 == null) {
            i1(vz4, j, f03, i, z);
        } else if (!vz4.d(ll4)) {
            f1(h49.n(ll4, vz4.c()), vz4, j, f03, i, z);
        } else {
            int i2 = f03.y;
            lp4 lp4 = f03.w;
            f03.g(i2 + 1, lp4.b);
            f03.y++;
            lp4.a(ll4);
            f03.x.a(mp7.q(-1.0f, z, false));
            f1(h49.n(ll4, vz4.c()), vz4, j, f03, i, z);
            f03.y = i2;
        }
    }

    public final void g1(ll4 ll4, vz4 vz4, long j, f03 f03, int i, boolean z, float f) {
        if (ll4 == null) {
            i1(vz4, j, f03, i, z);
        } else if (!vz4.d(ll4)) {
            g1(h49.n(ll4, vz4.c()), vz4, j, f03, i, z, f);
        } else {
            f03 f032 = f03;
            int i2 = f032.y;
            lp4 lp4 = f032.w;
            f032.g(i2 + 1, lp4.b);
            f032.y++;
            lp4.a(ll4);
            boolean z2 = z;
            float f2 = f;
            f032.x.a(mp7.q(f2, z2, false));
            q1(h49.n(ll4, vz4.c()), vz4, j, f032, i, z2, f2, true);
            f032.y = i2;
        }
    }

    public final ey3 getLayoutDirection() {
        return this.O.U;
    }

    public final void h(float[] fArr) {
        p95 a = xy3.a(this.O);
        xz4 x1 = x1(t49.I(this));
        A1(x1, fArr);
        if (a instanceof fh4) {
            ((je) ((fh4) a)).p(fArr);
            return;
        }
        long w = x1.w(0);
        if ((9223372034707292159L & w) != 9205357640488583168L) {
            eh4.h(fArr, Float.intBitsToFloat((int) (w >> 32)), Float.intBitsToFloat((int) (w & 4294967295L)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c4, code lost:
        if (defpackage.hj8.p(r5.f(), defpackage.mp7.q(r2, r7, false)) > 0) goto L_0x00c6;
     */
    public final void h1(vz4 vz4, long j, f03 f03, int i, boolean z) {
        float f;
        boolean z2;
        boolean z3;
        long j2 = j;
        f03 f032 = f03;
        int i2 = i;
        ll4 d1 = d1(vz4.c());
        if (!D1(j2)) {
            if (i2 == 1) {
                float U0 = U0(j2, b1());
                if ((Float.floatToRawIntBits(U0) & Integer.MAX_VALUE) < 2139095040) {
                    if (f032.y != f032.w.b - 1) {
                        if (hj8.p(f032.f(), mp7.q(U0, false, false)) <= 0) {
                            return;
                        }
                    }
                    g1(d1, vz4, j2, f032, i2, false, U0);
                }
            }
        } else if (d1 == null) {
            i1(vz4, j, f03, i, z);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat < 0.0f || intBitsToFloat2 < 0.0f || intBitsToFloat >= ((float) b0()) || intBitsToFloat2 >= ((float) Z())) {
                long j3 = j;
                f03 f033 = f03;
                int i3 = i;
                if (i3 == 1) {
                    f = U0(j3, b1());
                } else {
                    f = Float.POSITIVE_INFINITY;
                }
                if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
                    if (f033.y == f033.w.b - 1) {
                        z2 = z;
                    } else {
                        z2 = z;
                    }
                    z3 = true;
                } else {
                    z2 = z;
                    z3 = false;
                }
                q1(d1, vz4, j3, f033, i3, z2, f, z3);
                return;
            }
            f1(d1, vz4, j, f03, i, z);
        }
    }

    public void i1(vz4 vz4, long j, f03 f03, int i, boolean z) {
        xz4 xz4 = this.P;
        if (xz4 != null) {
            xz4.h1(vz4, xz4.Z0(j), f03, i, z);
        }
    }

    public final void j(dy3 dy3, float[] fArr) {
        xz4 x1 = x1(dy3);
        x1.l1();
        xz4 Y0 = Y0(x1);
        eh4.d(fArr);
        x1.A1(Y0, fArr);
        z1(Y0, fArr);
    }

    public final void j1() {
        o95 o95 = this.l0;
        if (o95 != null) {
            ((fx2) o95).c();
            return;
        }
        xz4 xz4 = this.Q;
        if (xz4 != null) {
            xz4.j1();
        }
    }

    public final long k() {
        return this.y;
    }

    public final boolean k1() {
        if (this.l0 != null && this.W <= 0.0f) {
            return true;
        }
        xz4 xz4 = this.Q;
        if (xz4 != null) {
            return xz4.k1();
        }
        return false;
    }

    public final void l1() {
        this.O.b0.b();
    }

    public final void m1() {
        vr2 vr2;
        ll4 ll4;
        boolean g = yz4.g(128);
        ll4 e1 = e1(g);
        if (e1 != null && (e1.w.z & 128) != 0) {
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            } else {
                vr2 = null;
            }
            ix6 j = j45.j(h);
            if (g) {
                try {
                    ll4 = c1();
                } catch (Throwable th) {
                    j45.m(h, j, vr2);
                    throw th;
                }
            } else {
                ll4 = c1().A;
                if (ll4 == null) {
                    j45.m(h, j, vr2);
                }
            }
            ll4 e12 = e1(g);
            while (e12 != null && (e12.z & 128) != 0) {
                if ((e12.y & 128) != 0) {
                    ll4 ll42 = e12;
                    eq4 eq4 = null;
                    while (ll42 != null) {
                        if (ll42 instanceof sh4) {
                            ((sh4) ll42).a(this.y);
                        } else if ((ll42.y & 128) != 0 && (ll42 instanceof wo1)) {
                            int i = 0;
                            for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                if ((ll43.y & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        ll42 = ll43;
                                    } else {
                                        if (eq4 == null) {
                                            eq4 = new eq4(new ll4[16]);
                                        }
                                        if (ll42 != null) {
                                            eq4.b(ll42);
                                            ll42 = null;
                                        }
                                        eq4.b(ll43);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        ll42 = rc9.j(eq4);
                    }
                }
                if (e12 == ll4) {
                    break;
                }
                e12 = e12.B;
            }
            j45.m(h, j, vr2);
        }
    }

    public final boolean n() {
        return c1().J;
    }

    public final void n1() {
        boolean g = yz4.g(4194304);
        ll4 c1 = c1();
        if (g || (c1 = c1.A) != null) {
            ll4 e1 = e1(g);
            while (e1 != null && (e1.z & 4194304) != 0) {
                if ((e1.y & 4194304) != 0) {
                    ll4 ll4 = e1;
                    eq4 eq4 = null;
                    while (ll4 != null) {
                        if (ll4 instanceof by3) {
                            ((by3) ll4).l(this);
                        } else if ((ll4.y & 4194304) != 0 && (ll4 instanceof wo1)) {
                            int i = 0;
                            for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                                if ((ll42.y & 4194304) != 0) {
                                    i++;
                                    if (i == 1) {
                                        ll4 = ll42;
                                    } else {
                                        if (eq4 == null) {
                                            eq4 = new eq4(new ll4[16]);
                                        }
                                        if (ll4 != null) {
                                            eq4.b(ll4);
                                            ll4 = null;
                                        }
                                        eq4.b(ll42);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        ll4 = rc9.j(eq4);
                    }
                }
                if (e1 != c1) {
                    e1 = e1.B;
                } else {
                    return;
                }
            }
        }
    }

    public final void o1() {
        this.R = true;
        this.j0.b();
        u1();
        if (!oe3.a(this.Z, 0)) {
            this.O.P(this);
        }
    }

    public final void p1() {
        boolean g = yz4.g(1048576);
        ll4 e1 = e1(g);
        if (e1 != null && (e1.w.z & 1048576) != 0) {
            ll4 c1 = c1();
            if (g || (c1 = c1.A) != null) {
                ll4 e12 = e1(g);
                while (e12 != null && (e12.z & 1048576) != 0) {
                    if ((e12.y & 1048576) != 0) {
                        ll4 ll4 = e12;
                        eq4 eq4 = null;
                        while (ll4 != null) {
                            if (!(ll4 instanceof vk2) && (ll4.y & 1048576) != 0 && (ll4 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                                    if ((ll42.y & 1048576) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll4 = ll42;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll4 != null) {
                                                eq4.b(ll4);
                                                ll4 = null;
                                            }
                                            eq4.b(ll42);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll4 = rc9.j(eq4);
                        }
                    }
                    if (e12 != c1) {
                        e12 = e12.B;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void q1(ll4 ll4, vz4 vz4, long j, f03 f03, int i, boolean z, float f, boolean z2) {
        int i2;
        int i3;
        ll4 ll42 = ll4;
        if (ll42 == null) {
            i1(vz4, j, f03, i, z);
            return;
        }
        vz4 vz42 = vz4;
        if (!vz42.d(ll42)) {
            q1(h49.n(ll42, vz42.c()), vz42, j, f03, i, z, f, z2);
            return;
        }
        f03 f032 = f03;
        int i4 = i;
        boolean z3 = z;
        char c = 3;
        if (i4 == 3 || i4 == 4) {
            ll4 ll43 = ll42;
            eq4 eq4 = null;
            while (true) {
                if (ll43 == null) {
                    break;
                }
                int i5 = 0;
                if (ll43 instanceof tk5) {
                    long n = ((tk5) ll43).n();
                    int i6 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i6);
                    uy3 uy3 = this.O;
                    ey3 ey3 = uy3.U;
                    int i7 = sk7.b;
                    int i8 = ((Long.MIN_VALUE & n) > 0 ? 1 : ((Long.MIN_VALUE & n) == 0 ? 0 : -1));
                    ey3 ey32 = ey3.w;
                    if (i8 == 0 || ey3 == ey32) {
                        i2 = ts2.j(n, 0);
                    } else {
                        i2 = ts2.j(n, 2);
                    }
                    if (intBitsToFloat >= ((float) (-i2))) {
                        float intBitsToFloat2 = Float.intBitsToFloat(i6);
                        int b02 = b0();
                        ey3 ey33 = uy3.U;
                        if (i8 == 0 || ey33 == ey32) {
                            i3 = ts2.j(n, 2);
                        } else {
                            i3 = ts2.j(n, 0);
                        }
                        if (intBitsToFloat2 < ((float) (b02 + i3))) {
                            int i9 = (int) (j & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat(i9);
                            int i10 = sk7.b;
                            if (intBitsToFloat3 >= ((float) (-ts2.j(n, 1)))) {
                                if (Float.intBitsToFloat(i9) < ((float) (ts2.j(n, 3) + Z()))) {
                                    cp4 cp4 = f032.x;
                                    lp4 lp4 = f032.w;
                                    int i11 = f032.y;
                                    int i12 = lp4.b;
                                    if (i11 == i12 - 1) {
                                        f032.g(i11 + 1, i12);
                                        f032.y++;
                                        lp4.a(ll42);
                                        cp4.a(mp7.q(0.0f, z3, true));
                                        q1(h49.n(ll42, vz4.c()), vz4, j, f032, i4, z3, f, z2);
                                        f032.y = i11;
                                        return;
                                    }
                                    long f2 = f032.f();
                                    int i13 = f032.y;
                                    if (hj8.B(f2)) {
                                        int i14 = lp4.b;
                                        int i15 = i14 - 1;
                                        f032.y = i15;
                                        f032.g(i14, lp4.b);
                                        f032.y++;
                                        lp4.a(ll42);
                                        cp4.a(mp7.q(0.0f, z3, true));
                                        q1(h49.n(ll42, vz4.c()), vz4, j, f032, i, z3, f, z2);
                                        f032.y = i15;
                                        if (hj8.v(f032.f()) < 0.0f) {
                                            f032.g(i13 + 1, f032.y + 1);
                                        }
                                        f032.y = i13;
                                        return;
                                    } else if (hj8.v(f2) > 0.0f) {
                                        int i16 = f032.y;
                                        f032.g(i16 + 1, lp4.b);
                                        f032.y++;
                                        lp4.a(ll42);
                                        cp4.a(mp7.q(0.0f, z3, true));
                                        q1(h49.n(ll42, vz4.c()), vz4, j, f032, i, z3, f, z2);
                                        f032.y = i16;
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((ll43.y & 16) != 0 && (ll43 instanceof wo1)) {
                        for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                            if ((ll44.y & 16) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    ll43 = ll44;
                                } else {
                                    if (eq4 == null) {
                                        eq4 = new eq4(new ll4[16]);
                                    }
                                    if (ll43 != null) {
                                        eq4.b(ll43);
                                        ll43 = null;
                                    }
                                    eq4.b(ll44);
                                }
                            }
                        }
                        if (i5 == 1) {
                            i4 = i;
                            z3 = z;
                            c = c2;
                        }
                    }
                    ll43 = rc9.j(eq4);
                    i4 = i;
                    z3 = z;
                    c = c2;
                }
            }
        }
        if (z2) {
            g1(ll4, vz4, j, f03, i, z, f);
        } else {
            w1(ll4, vz4, j, f03, i, z, f);
        }
    }

    public final boolean r() {
        if (this.l0 == null || this.R || !this.O.J()) {
            return false;
        }
        return true;
    }

    public abstract void r1(qk0 qk0, cx2 cx2);

    public final void s1(long j, float f, vr2 vr2) {
        B1(vr2, false);
        boolean a = oe3.a(this.Z, j);
        uy3 uy3 = this.O;
        if (!a) {
            ((je) xy3.a(uy3)).M(-4.0f);
            this.Z = j;
            o95 o95 = this.l0;
            if (o95 != null) {
                ((fx2) o95).d(j);
            } else {
                xz4 xz4 = this.Q;
                if (xz4 != null) {
                    xz4.j1();
                }
            }
            uy3.P(this);
            dd4.N0(this);
            p95 p95 = uy3.J;
            if (p95 != null) {
                ((je) p95).t(uy3);
            }
        }
        this.a0 = f;
        if (this == ((xz4) uy3.a0.e)) {
            ((je) xy3.a(uy3)).getRectManager().h(uy3);
        }
        if (!this.K) {
            u0(J0());
        }
    }

    public final void t1(sp4 sp4, boolean z, boolean z2) {
        long j;
        o95 o95 = this.l0;
        if (o95 != null) {
            if (this.S) {
                if (z2) {
                    long b1 = b1();
                    float f = sp4.b;
                    float f2 = sp4.c;
                    if (sp4.d >= 0.0f) {
                        long j2 = this.y;
                        if (f <= ((float) ((int) (j2 >> 32))) && sp4.e >= 0.0f && f2 <= ((float) ((int) (j2 & 4294967295L)))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (b1 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (b1 & 4294967295L));
                            float f3 = (intBitsToFloat - (sp4.d - sp4.b)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (sp4.e - sp4.c)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.y;
                            float f7 = (float) ((int) (j3 >> 32));
                            int i = (int) (b1 >> 32);
                            float f8 = (float) ((int) (j3 & 4294967295L));
                            int i2 = (int) (b1 & 4294967295L);
                            sp4.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.y;
                    float f72 = (float) ((int) (j32 >> 32));
                    int i3 = (int) (b1 >> 32);
                    float f82 = (float) ((int) (j32 & 4294967295L));
                    int i22 = (int) (b1 & 4294967295L);
                    sp4.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.y;
                    sp4.a(0.0f, 0.0f, (float) ((int) (j4 >> 32)), (float) ((int) (j4 & 4294967295L)));
                }
                if (sp4.b()) {
                    return;
                }
            }
            fx2 fx2 = (fx2) o95;
            float[] b = fx2.b();
            if (!fx2.O) {
                if (b == null) {
                    sp4.b = 0.0f;
                    sp4.c = 0.0f;
                    sp4.d = 0.0f;
                    sp4.e = 0.0f;
                } else {
                    eh4.c(b, sp4);
                }
            }
        }
        long j5 = this.Z;
        float f9 = (float) ((int) (j5 >> 32));
        sp4.b += f9;
        sp4.d += f9;
        float f10 = (float) ((int) (j5 & 4294967295L));
        sp4.c += f10;
        sp4.e += f10;
    }

    public final void u1() {
        if (this.l0 != null) {
            B1((vr2) null, false);
            this.O.Y(false);
        }
    }

    public final void v1(mh4 mh4) {
        xz4 xz4;
        mh4 mh42 = mh4;
        mh4 mh43 = this.X;
        if (mh42 != mh43) {
            this.X = mh42;
            uy3 uy3 = this.O;
            int i = 0;
            if (!(mh43 != null && mh42.e() == mh43.e() && mh42.c() == mh43.c())) {
                int e = mh42.e();
                int c = mh42.c();
                o95 o95 = this.l0;
                if (o95 != null) {
                    ((fx2) o95).e((((long) e) << 32) | (((long) c) & 4294967295L));
                } else if (uy3.K() && (xz4 = this.Q) != null) {
                    xz4.j1();
                }
                i0((((long) c) & 4294967295L) | (((long) e) << 32));
                if (this.T != null) {
                    C1(false);
                }
                boolean g = yz4.g(4);
                ll4 c1 = c1();
                if (g || (c1 = c1.A) != null) {
                    ll4 e1 = e1(g);
                    while (e1 != null && (e1.z & 4) != 0) {
                        if ((e1.y & 4) != 0) {
                            ll4 ll4 = e1;
                            eq4 eq4 = null;
                            while (ll4 != null) {
                                if (ll4 instanceof gz1) {
                                    ((gz1) ll4).M();
                                } else if ((ll4.y & 4) != 0 && (ll4 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                                        if ((ll42.y & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll4 = ll42;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll4 != null) {
                                                    eq4.b(ll4);
                                                    ll4 = null;
                                                }
                                                eq4.b(ll42);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll4 = rc9.j(eq4);
                            }
                        }
                        if (e1 == c1) {
                            break;
                        }
                        e1 = e1.B;
                    }
                }
                p95 p95 = uy3.J;
                if (p95 != null) {
                    ((je) p95).t(uy3);
                }
                uy3.P(this);
            }
            hp4 hp4 = this.Y;
            if ((hp4 != null && hp4.e != 0) || !mh42.a().isEmpty()) {
                hp4 hp42 = this.Y;
                Map a = mh42.a();
                if (hp42 != null && hp42.e == a.size()) {
                    Object[] objArr = hp42.b;
                    int[] iArr = hp42.c;
                    long[] jArr = hp42.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        loop3:
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = i; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i3 << 3) + i5;
                                        Object obj = objArr[i6];
                                        int i7 = iArr[i6];
                                        Integer num = (Integer) a.get((kb) obj);
                                        if (num == null || num.intValue() != i7) {
                                            break loop3;
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    return;
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                i = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                uy3.b0.p.T.f();
                hp4 hp43 = this.Y;
                if (hp43 == null) {
                    hp4 hp44 = v25.a;
                    hp43 = new hp4();
                    this.Y = hp43;
                }
                hp43.a();
                for (Map.Entry entry : mh42.a().entrySet()) {
                    hp43.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    public final long w(long j) {
        if (!c1().J) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((je) xy3.a(this.O)).q(R(j));
    }

    public final void w1(ll4 ll4, vz4 vz4, long j, f03 f03, int i, boolean z, float f) {
        int i2;
        int i3;
        ll4 ll42 = ll4;
        if (ll42 == null) {
            i1(vz4, j, f03, i, z);
            return;
        }
        vz4 vz42 = vz4;
        if (!vz42.d(ll42)) {
            w1(h49.n(ll42, vz42.c()), vz42, j, f03, i, z, f);
            return;
        }
        f03 f032 = f03;
        boolean z2 = z;
        float f2 = f;
        if (vz42.b(ll42)) {
            cp4 cp4 = f032.x;
            lp4 lp4 = f032.w;
            int i4 = f032.y;
            int i5 = lp4.b;
            if (i4 == i5 - 1) {
                int i6 = i4 + 1;
                f032.g(i6, i5);
                f032.y++;
                lp4.a(ll42);
                cp4.a(mp7.q(f2, z2, false));
                q1(h49.n(ll42, vz42.c()), vz42, j, f032, i, z2, f2, false);
                f032.y = i4;
                if (i6 == lp4.b - 1 || hj8.B(f032.f())) {
                    int i7 = f032.y;
                    int i8 = i7 + 1;
                    lp4.k(i8);
                    if (i8 < 0 || i8 >= (i3 = cp4.b)) {
                        h.l("Index must be between 0 and size");
                        return;
                    }
                    long[] jArr = cp4.a;
                    long j2 = jArr[i8];
                    if (i8 != i3 - 1) {
                        qs.L0(jArr, jArr, i8, i7 + 2, i3);
                    }
                    cp4.b--;
                    return;
                }
                return;
            }
            long f3 = f032.f();
            int i9 = f032.y;
            int i10 = lp4.b;
            int i11 = i10 - 1;
            f032.y = i11;
            f032.g(i10, lp4.b);
            f032.y++;
            lp4.a(ll42);
            cp4.a(mp7.q(f2, z2, false));
            q1(h49.n(ll42, vz4.c()), vz4, j, f032, i, z2, f2, false);
            f032.y = i11;
            long f4 = f032.f();
            if (f032.y + 1 >= lp4.b - 1 || hj8.p(f3, f4) <= 0) {
                f032.g(f032.y + 1, lp4.b);
            } else {
                int i12 = i9 + 1;
                boolean B = hj8.B(f4);
                int i13 = f032.y;
                if (B) {
                    i2 = i13 + 2;
                } else {
                    i2 = i13 + 1;
                }
                f032.g(i12, i2);
            }
            f032.y = i9;
            return;
        }
        q1(h49.n(ll42, vz4.c()), vz4, j, f032, i, z, f, false);
    }

    public final dd4 x0() {
        return this.P;
    }

    public final ly5 y1() {
        if (c1().J) {
            dy3 I = t49.I(this);
            sp4 sp4 = this.b0;
            if (sp4 == null) {
                sp4 = new sp4();
                this.b0 = sp4;
            }
            long T0 = T0(b1());
            int i = (int) (T0 >> 32);
            sp4.b = -Float.intBitsToFloat(i);
            int i2 = (int) (T0 & 4294967295L);
            sp4.c = -Float.intBitsToFloat(i2);
            sp4.d = Float.intBitsToFloat(i) + ((float) b0());
            sp4.e = Float.intBitsToFloat(i2) + ((float) Z());
            while (this != I) {
                this.t1(sp4, false, true);
                if (!sp4.b()) {
                    this = this.Q;
                    this.getClass();
                }
            }
            return new ly5(sp4.b, sp4.c, sp4.d, sp4.e);
        }
        return ly5.e;
    }

    public final void z1(xz4 xz4, float[] fArr) {
        float[] a;
        if (!sg3.e(xz4, this)) {
            xz4 xz42 = this.Q;
            xz42.getClass();
            xz42.z1(xz4, fArr);
            if (!oe3.a(this.Z, 0)) {
                float[] fArr2 = o0;
                eh4.d(fArr2);
                long j = this.Z;
                eh4.h(fArr2, -((float) ((int) (j >> 32))), -((float) ((int) (j & 4294967295L))));
                eh4.g(fArr, fArr2);
            }
            o95 o95 = this.l0;
            if (o95 != null && (a = ((fx2) o95).a()) != null) {
                eh4.g(fArr, a);
            }
        }
    }

    public final dy3 B0() {
        return this;
    }
}
