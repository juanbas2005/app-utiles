package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ty1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ty1 extends wo1 implements tk5, bb3, ry0, yy1 {
    public z75 M;
    public vr2 N;
    public boolean O;
    public ap4 P;
    public ad0 Q;
    public vy1 R;
    public boolean S;
    public boolean T;
    public wx1 U;
    public long V = 0;
    public kv2 W;
    public kv2 X;
    public zx1 Y;
    public yx1 Z;
    public xx1 a0;
    public t49 b0;
    public uy5 c0;
    public cp0 d0;
    public ab3 e0;

    public ty1(vr2 vr2, boolean z, ap4 ap4, z75 z75) {
        this.M = z75;
        this.N = vr2;
        this.O = z;
        this.P = ap4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object Y0(ty1 ty1, h61 h61) {
        py1 py1;
        int i;
        if (h61 instanceof py1) {
            py1 = (py1) h61;
            int i2 = py1.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                py1.B = i2 - Integer.MIN_VALUE;
                Object obj = py1.z;
                i = py1.B;
                if (i != 0) {
                    o85.q(obj);
                    vy1 vy1 = ty1.R;
                    if (vy1 != null) {
                        ap4 ap4 = ty1.P;
                        if (ap4 != null) {
                            uy1 uy1 = new uy1(vy1);
                            py1.B = 1;
                            Object b = ap4.b(uy1, py1);
                            p81 p81 = p81.w;
                            if (b == p81) {
                                return p81;
                            }
                        }
                    }
                    ty1.i1(new dy1(false, 0));
                    return vs7.a;
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ty1.R = null;
                ty1.i1(new dy1(false, 0));
                return vs7.a;
            }
        }
        py1 = new py1(ty1, h61);
        Object obj2 = py1.z;
        i = py1.B;
        if (i != 0) {
        }
        ty1.R = null;
        ty1.i1(new dy1(false, 0));
        return vs7.a;
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [df3, java.lang.Object, vy1] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1.b(r5, r0) == r4) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object Z0(ty1 ty1, cy1 cy1, h61 h61) {
        qy1 qy1;
        int i;
        vy1 vy1;
        vy1 vy12;
        cy1 cy12;
        ap4 ap4;
        if (h61 instanceof qy1) {
            qy1 = (qy1) h61;
            int i2 = qy1.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qy1.D = i2 - Integer.MIN_VALUE;
                Object obj = qy1.B;
                i = qy1.D;
                Object obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    vy1 vy13 = ty1.R;
                    if (!(vy13 == null || (r1 = ty1.P) == null)) {
                        uy1 uy1 = new uy1(vy13);
                        qy1.z = cy1;
                        qy1.D = 1;
                    }
                } else if (i == 1) {
                    cy1 = qy1.z;
                    o85.q(obj);
                } else if (i == 2) {
                    vy12 = qy1.A;
                    cy12 = qy1.z;
                    o85.q(obj);
                    vy1 = vy12;
                    cy1 = cy12;
                    ty1.R = vy1;
                    ty1.h1(cy1.a);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ? obj3 = new Object();
                ap4 = ty1.P;
                vy1 = obj3;
                if (ap4 != null) {
                    qy1.z = cy1;
                    qy1.A = obj3;
                    qy1.D = 2;
                    if (ap4.b(obj3, qy1) != obj2) {
                        cy12 = cy1;
                        vy12 = obj3;
                        vy1 = vy12;
                        cy1 = cy12;
                    }
                    return obj2;
                }
                ty1.R = vy1;
                ty1.h1(cy1.a);
                return vs7.a;
            }
        }
        qy1 = new qy1(ty1, h61);
        Object obj4 = qy1.B;
        i = qy1.D;
        Object obj22 = p81.w;
        if (i != 0) {
        }
        ? obj32 = new Object();
        ap4 = ty1.P;
        vy1 = obj32;
        if (ap4 != null) {
        }
        ty1.R = vy1;
        ty1.h1(cy1.a);
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object a1(ty1 ty1, dy1 dy1, h61 h61) {
        ry1 ry1;
        int i;
        if (h61 instanceof ry1) {
            ry1 = (ry1) h61;
            int i2 = ry1.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ry1.C = i2 - Integer.MIN_VALUE;
                Object obj = ry1.A;
                i = ry1.C;
                if (i != 0) {
                    o85.q(obj);
                    vy1 vy1 = ty1.R;
                    if (vy1 != null) {
                        ap4 ap4 = ty1.P;
                        if (ap4 != null) {
                            wy1 wy1 = new wy1(vy1);
                            ry1.z = dy1;
                            ry1.C = 1;
                            Object b = ap4.b(wy1, ry1);
                            p81 p81 = p81.w;
                            if (b == p81) {
                                return p81;
                            }
                        }
                    }
                    ty1.i1(dy1);
                    return vs7.a;
                } else if (i == 1) {
                    dy1 = ry1.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ty1.R = null;
                ty1.i1(dy1);
                return vs7.a;
            }
        }
        ry1 = new ry1(ty1, h61);
        Object obj2 = ry1.A;
        i = ry1.C;
        if (i != 0) {
        }
        ty1.R = null;
        ty1.i1(dy1);
        return vs7.a;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [yx1, java.lang.Object] */
    public static void f1(ty1 ty1, qk5 qk5, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        yx1 yx1 = ty1.Z;
        yx1 yx12 = yx1;
        if (yx1 == null) {
            ? obj = new Object();
            obj.f = null;
            obj.g = Long.MAX_VALUE;
            obj.h = false;
            ty1.Z = obj;
            yx12 = obj;
        }
        yx12.f = qk5;
        yx12.g = j;
        cp0 cp0 = ty1.d0;
        z75 z75 = ty1.M;
        if (cp0 == null) {
            ty1.d0 = new cp0(z75);
        } else {
            cp0.y = z75;
            cp0.x = j2;
        }
        yx12.h = false;
        ty1.b0 = yx12;
    }

    public final void I() {
        if (this.T) {
            d1();
            if (this.S) {
                j1().c(ay1.a);
            }
            this.c0 = null;
        }
        this.T = false;
    }

    public final String O() {
        if (!this.O) {
            return "idle";
        }
        t49 t49 = this.b0;
        if (t49 instanceof wx1) {
            if (((wx1) t49).h) {
                return "waiting";
            }
            return "idle";
        } else if ((t49 instanceof yx1) || (t49 instanceof xx1)) {
            return "waiting";
        } else {
            if (t49 instanceof zx1) {
                return "recognized";
            }
            return "idle";
        }
    }

    public final void O0() {
        this.S = false;
        b1();
        kv2 kv2 = this.X;
        if (kv2 != null) {
            W0(kv2);
        }
        kv2 kv22 = this.W;
        if (kv22 != null) {
            W0(kv22);
        }
        this.X = null;
        this.W = null;
    }

    public final z75 W() {
        return this.M;
    }

    public final void b1() {
        vy1 vy1 = this.R;
        if (vy1 != null) {
            ap4 ap4 = this.P;
            if (ap4 != null) {
                ap4.c(new uy1(vy1));
            }
            this.R = null;
        }
    }

    public abstract Object c1(sy1 sy1, sy1 sy12);

    /* JADX WARNING: type inference failed for: r0v3, types: [wx1, java.lang.Object] */
    public final void d1() {
        this.V = 0;
        wx1 wx1 = this.U;
        vx1 vx1 = vx1.y;
        wx1 wx12 = wx1;
        if (wx1 == null) {
            ? obj = new Object();
            obj.f = vx1;
            obj.g = false;
            obj.h = false;
            this.U = obj;
            wx12 = obj;
        }
        wx12.f = vx1;
        wx12.g = false;
        wx12.h = false;
        this.b0 = wx12;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [xx1, java.lang.Object] */
    public final void e1(qk5 qk5, long j, cp0 cp0) {
        xx1 xx1 = this.a0;
        xx1 xx12 = xx1;
        if (xx1 == null) {
            ? obj = new Object();
            obj.f = null;
            obj.g = Long.MAX_VALUE;
            this.a0 = obj;
            xx12 = obj;
        }
        xx12.f = qk5;
        xx12.g = j;
        cp0.x = 0;
        this.b0 = xx12;
    }

    public final void g1(ey1 ey1) {
        if ((ey1 instanceof cy1) && !this.S) {
            this.S = true;
            o1();
        }
        j1().c(ey1);
    }

    public final void h0() {
        ab3 ab3 = this.e0;
        if (ab3 != null) {
            ab3.a();
            ty1 ty1 = ab3.w;
            if (ty1.S) {
                ty1.g1(ay1.a);
            }
            ab3.C = null;
            qa qaVar = ab3.F;
            qaVar.x = 0;
            ((cp4) qaVar.y).b = 0;
        }
    }

    public abstract void h1(long j);

    public abstract void i1(dy1 dy1);

    public final en0 j1() {
        ad0 ad0 = this.Q;
        if (ad0 != null) {
            return ad0;
        }
        h.q("Events channel not initialized.");
        return null;
    }

    public final uy5 k1() {
        uy5 uy5 = this.c0;
        if (uy5 != null) {
            return uy5;
        }
        h.q("Velocity Tracker not initialized.");
        return null;
    }

    public final void l1(long j, qk5 qk5) {
        this.V = l35.e(this.V, j);
        z65.b(k1(), qk5);
        j1().c(new by1(false, j));
    }

    public final void m1(qk5 qk5, qk5 qk52, long j) {
        if (this.c0 == null) {
            this.c0 = new uy5(9);
        }
        z65.b(k1(), qk5);
        long d = l35.d(qk52.c, j);
        if (((Boolean) this.N.y(new wk5(qk5.i))).booleanValue()) {
            if (!this.S) {
                if (this.Q == null) {
                    this.Q = rj1.c(Integer.MAX_VALUE, 6, (vc0) null);
                }
                o1();
            }
            j1().c(new cy1(d));
        }
    }

    public abstract boolean n1();

    public final void o1() {
        this.S = true;
        if (this.Q == null) {
            this.Q = rj1.c(Integer.MAX_VALUE, 6, (vc0) null);
        }
        ar7.H(J0(), (e81) null, (r81) null, new sy1(this, (f61) null), 3);
    }

    public final void p1(vr2 vr2, boolean z, ap4 ap4, z75 z75, boolean z2) {
        this.N = vr2;
        boolean z3 = true;
        if (this.O != z) {
            this.O = z;
            if (!z) {
                kv2 kv2 = this.X;
                if (kv2 != null) {
                    W0(kv2);
                }
                kv2 kv22 = this.W;
                if (kv22 != null) {
                    W0(kv22);
                }
                this.X = null;
                this.W = null;
                b1();
                this.e0 = null;
            }
            z2 = true;
        }
        if (!sg3.e(this.P, ap4)) {
            b1();
            this.P = ap4;
        }
        if (this.M != z75) {
            this.M = z75;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.T;
            ay1 ay1 = ay1.a;
            if (z4) {
                d1();
                if (this.S) {
                    j1().c(ay1);
                }
                this.c0 = null;
            }
            ab3 ab3 = this.e0;
            if (ab3 != null) {
                ab3.a();
                ty1 ty1 = ab3.w;
                if (ty1.S) {
                    ty1.g1(ay1);
                }
                ab3.C = null;
                qa qaVar = ab3.F;
                qaVar.x = 0;
                ((cp4) qaVar.y).b = 0;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: ta3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: ta3} */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.Object, ya3] */
    /* JADX WARNING: type inference failed for: r2v22, types: [java.lang.Object, ya3] */
    /* JADX WARNING: type inference failed for: r4v34, types: [va3, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    public final void w(ig igVar, lk5 lk5) {
        Object obj;
        Object obj2;
        float f;
        long j;
        char c;
        float f2;
        ab3 ab3;
        Object obj3;
        lk5 lk52;
        ab3 ab32;
        ta3 ta3;
        ta3 ta32;
        ua3 ua3;
        ig igVar2 = igVar;
        lk5 lk53 = lk5;
        int i = igVar2.b;
        ArrayList arrayList = (ArrayList) igVar2.c;
        if (this.O) {
            if (this.e0 == null) {
                this.e0 = new ab3(this);
            }
            if (this.X == null) {
                ab3 ab33 = this.e0;
                ab33.getClass();
                kv2 kv2 = new kv2(ab33);
                V0(kv2);
                this.X = kv2;
            }
            ab3 ab34 = this.e0;
            if (ab34 != null) {
                ty1 ty1 = ab34.w;
                int i2 = 0;
                if (ab34.B == null) {
                    va3 va3 = ab34.x;
                    va3 va32 = va3;
                    if (va3 == null) {
                        ? obj4 = new Object();
                        obj4.N0 = ua3.y;
                        obj4.O0 = false;
                        obj4.P0 = false;
                        ab34.x = obj4;
                        va32 = obj4;
                    }
                    ab34.B = va32;
                }
                h03 h03 = ab34.B;
                if (h03 != null) {
                    boolean z = h03 instanceof va3;
                    lk5 lk54 = lk5.w;
                    boolean z2 = true;
                    lk5 lk55 = lk5.x;
                    if (z) {
                        va3 va33 = (va3) h03;
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                if (rd3.h((ta3) arrayList.get(i2))) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                            ta3 ta33 = (ta3) dt0.w0(arrayList);
                            int i3 = za3.a[va33.N0.ordinal()];
                            ua3 ua32 = ua3.x;
                            ua3 ua33 = ua3.w;
                            if (i3 != 1) {
                                ua3 = va33.N0;
                            } else if (!ty1.n1()) {
                                ua3 = ua33;
                            } else {
                                ua3 = ua32;
                            }
                            va33.N0 = ua3;
                            if (lk53 == lk54) {
                                if (ua3 == ua32) {
                                    ta33.i = true;
                                    va33.O0 = true;
                                }
                                va33.P0 = true;
                            }
                            if (lk53 != lk55) {
                                return;
                            }
                            if (ua3 == ua33) {
                                ab3.c(ab34, ta33, ta33.a, 0, 12);
                            } else if (va33.O0) {
                                ab34.f(ta33, ta33, new sa3(i), 0);
                                ab34.e(ta33, new sa3(i), 0);
                                long j2 = ta33.a;
                                ya3 ya3 = ab34.y;
                                ya3 ya32 = ya3;
                                if (ya3 == null) {
                                    ? obj5 = new Object();
                                    obj5.N0 = Long.MAX_VALUE;
                                    ab34.y = obj5;
                                    ya32 = obj5;
                                }
                                ya32.N0 = j2;
                                ab34.B = ya32;
                            }
                        }
                    } else {
                        boolean z3 = h03 instanceof xa3;
                        lk5 lk56 = lk5.y;
                        if (z3) {
                            xa3 xa3 = (xa3) h03;
                            if (lk53 != lk54) {
                                int size2 = arrayList.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        ab3 = ab34;
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = arrayList.get(i4);
                                    ab3 = ab34;
                                    if (a35.i(((ta3) obj3).a, xa3.O0)) {
                                        break;
                                    }
                                    i4++;
                                    ab34 = ab3;
                                }
                                ta3 ta34 = (ta3) obj3;
                                if (ta34 == null) {
                                    int size3 = arrayList.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size3) {
                                            ta32 = null;
                                            break;
                                        }
                                        Object obj6 = arrayList.get(i5);
                                        if (obj6.d) {
                                            ta32 = obj6;
                                            break;
                                        }
                                        i5++;
                                    }
                                    ta34 = ta32;
                                    if (ta34 == null) {
                                        ab3.a();
                                        return;
                                    }
                                    xa3.O0 = ta34.a;
                                }
                                ta3 ta35 = ta34;
                                if (lk53 == lk55) {
                                    if (ta35.i) {
                                        lk52 = lk56;
                                        ab32 = ab3;
                                        ta3 ta36 = xa3.N0;
                                        if (ta36 != null) {
                                            long j3 = xa3.O0;
                                            cp0 cp0 = ab32.D;
                                            if (cp0 != null) {
                                                ab32.b(ta36, j3, cp0);
                                            } else {
                                                h.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                        } else {
                                            h.q("AwaitTouchSlop.initialDown was not initialized");
                                            return;
                                        }
                                    } else if (rd3.c(ta35)) {
                                        int size4 = arrayList.size();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= size4) {
                                                ta3 = null;
                                                break;
                                            }
                                            Object obj7 = arrayList.get(i6);
                                            if (obj7.d) {
                                                ta3 = obj7;
                                                break;
                                            }
                                            i6++;
                                        }
                                        ta3 ta37 = ta3;
                                        if (ta37 == null) {
                                            ab3.a();
                                        } else {
                                            xa3.O0 = ta37.a;
                                        }
                                    } else {
                                        float f3 = my1.a;
                                        float f4 = ((g58) h49.w(ty1, xy0.u)).f();
                                        ab32 = ab3;
                                        cp0 cp02 = ab32.D;
                                        if (cp02 != null) {
                                            long e = cp0.e(cp02, rd3.E(ta35, ty1.M, new sa3(i), true), f4);
                                            if ((9223372034707292159L & e) != 9205357640488583168L) {
                                                ta35.i = true;
                                                ta3 ta38 = xa3.N0;
                                                ta38.getClass();
                                                lk52 = lk56;
                                                long j4 = e;
                                                ab32.f(ta38, ta35, new sa3(i), j4);
                                                ab32.e(ta35, new sa3(i), j4);
                                                long j5 = ta35.a;
                                                ya3 ya33 = ab32.y;
                                                ya3 ya34 = ya33;
                                                if (ya33 == null) {
                                                    ? obj8 = new Object();
                                                    obj8.N0 = Long.MAX_VALUE;
                                                    ab32.y = obj8;
                                                    ya34 = obj8;
                                                }
                                                ya34.N0 = j5;
                                                ab32.B = ya34;
                                            } else {
                                                lk52 = lk56;
                                                xa3.P0 = true;
                                            }
                                        } else {
                                            h.q("Touch slop detector not initialized.");
                                            return;
                                        }
                                    }
                                    if (lk53 == lk52 && xa3.P0) {
                                        if (ta35.i) {
                                            ta3 ta39 = xa3.N0;
                                            if (ta39 != null) {
                                                long j6 = xa3.O0;
                                                cp0 cp03 = ab32.D;
                                                if (cp03 != null) {
                                                    ab32.b(ta39, j6, cp03);
                                                    return;
                                                } else {
                                                    h.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                    return;
                                                }
                                            } else {
                                                h.q("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                        } else {
                                            xa3.P0 = false;
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                lk52 = lk56;
                                ab32 = ab3;
                                if (lk53 == lk52 || xa3.P0) {
                                }
                            }
                        } else {
                            lk5 lk57 = lk56;
                            if (h03 instanceof wa3) {
                                wa3 wa3 = (wa3) h03;
                                if (lk53 == lk57) {
                                    int size5 = arrayList.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= size5) {
                                            break;
                                        } else if (((ta3) arrayList.get(i7)).i) {
                                            z2 = false;
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                    int size6 = arrayList.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= size6) {
                                            break;
                                        } else if (!((ta3) arrayList.get(i8)).d) {
                                            i8++;
                                        } else if (!arrayList.isEmpty()) {
                                            if (z2) {
                                                long F = rd3.F((ta3) dt0.w0(arrayList), ty1.M, new sa3(i));
                                                ta3 ta310 = wa3.N0;
                                                ta310.getClass();
                                                long d = l35.d(F, rd3.F(ta310, ty1.M, new sa3(i)));
                                                ta3 ta311 = wa3.N0;
                                                if (ta311 != null) {
                                                    ab3.c(ab34, ta311, wa3.O0, d, 8);
                                                    return;
                                                } else {
                                                    h.q("AwaitGesturePickup.initialDown was not initialized.");
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    ab34.a();
                                }
                            } else if (h03 instanceof ya3) {
                                ya3 ya35 = (ya3) h03;
                                if (lk53 == lk55) {
                                    long j7 = ya35.N0;
                                    int size7 = arrayList.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size7) {
                                            obj = null;
                                            break;
                                        }
                                        obj = arrayList.get(i9);
                                        if (a35.i(((ta3) obj).a, j7)) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    ta3 ta312 = (ta3) obj;
                                    if (ta312 != null) {
                                        long j8 = ta312.c;
                                        boolean c2 = rd3.c(ta312);
                                        ay1 ay1 = ay1.a;
                                        if (c2) {
                                            int size8 = arrayList.size();
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= size8) {
                                                    obj2 = null;
                                                    break;
                                                }
                                                obj2 = arrayList.get(i10);
                                                if (((ta3) obj2).d) {
                                                    break;
                                                }
                                                i10++;
                                            }
                                            ta3 ta313 = (ta3) obj2;
                                            if (ta313 == null) {
                                                if (ta312.i || !rd3.c(ta312)) {
                                                    ty1.g1(ay1);
                                                } else {
                                                    uy5 d2 = ab34.d();
                                                    z75 z75 = ty1.M;
                                                    qa qaVar = ab34.E;
                                                    lp4 lp4 = (lp4) qaVar.y;
                                                    char c3 = ' ';
                                                    float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                                                    long j9 = 4294967295L;
                                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                                                    if (rd3.h(ta312)) {
                                                        qaVar.x = 0;
                                                        lp4.d();
                                                    }
                                                    if (rd3.c(ta312) || rd3.h(ta312)) {
                                                        c = ' ';
                                                        j = 4294967295L;
                                                        f = 0.0f;
                                                    } else {
                                                        if (lp4.b == 3) {
                                                            int i11 = qaVar.x;
                                                            qaVar.x = i11 + 1;
                                                            lp4.n(i11, ta312);
                                                        } else {
                                                            lp4.a(ta312);
                                                        }
                                                        if (qaVar.x == 3) {
                                                            qaVar.x = 0;
                                                        }
                                                        Object[] objArr = lp4.a;
                                                        int i12 = lp4.b;
                                                        int i13 = 0;
                                                        float f5 = 0.0f;
                                                        while (i13 < i12) {
                                                            char c4 = c3;
                                                            f5 = Float.intBitsToFloat((int) (((ta3) objArr[i13]).c >> c4)) + f5;
                                                            i13++;
                                                            c3 = c4;
                                                        }
                                                        c = c3;
                                                        f = 0.0f;
                                                        int i14 = lp4.b;
                                                        intBitsToFloat = f5 / ((float) i14);
                                                        Object[] objArr2 = lp4.a;
                                                        float f6 = 0.0f;
                                                        int i15 = 0;
                                                        while (i15 < i14) {
                                                            long j10 = j9;
                                                            f6 += Float.intBitsToFloat((int) (((ta3) objArr2[i15]).c & j10));
                                                            i15++;
                                                            j9 = j10;
                                                        }
                                                        j = j9;
                                                        intBitsToFloat2 = f6 / ((float) lp4.b);
                                                    }
                                                    long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & j);
                                                    if (z75 != null) {
                                                        if (i == 1) {
                                                            f2 = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
                                                        } else if (i == 2) {
                                                            f2 = Float.intBitsToFloat((int) (floatToRawIntBits & j));
                                                        }
                                                        if (z75 == z75.x) {
                                                            floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) & j) | (((long) Float.floatToRawIntBits(f2)) << c);
                                                        } else {
                                                            floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(f2)) & j);
                                                        }
                                                    }
                                                    ((md4) d2.x).a(ta312.b, floatToRawIntBits);
                                                    float e2 = ((g58) h49.w(ty1, xy0.u)).e();
                                                    long d3 = ab34.d().d(u55.b(e2, e2));
                                                    md4 md4 = (md4) ab34.d().x;
                                                    z38 z38 = (z38) md4.b;
                                                    qs.S0(0, z38.d.length, (Object) null, z38.d);
                                                    z38.e = 0;
                                                    z38 z382 = (z38) md4.c;
                                                    qs.S0(0, z382.d.length, (Object) null, z382.d);
                                                    z382.e = 0;
                                                    md4.a = 0;
                                                    ty1.g1(new dy1(true, az1.a(d3)));
                                                }
                                                ab34.a();
                                                return;
                                            }
                                            ya35.N0 = ta313.a;
                                        } else if (ta312.i) {
                                            ty1.g1(ay1);
                                        } else if (l35.c(rd3.E(ta312, ty1.M, new sa3(i), true)) != 0.0f) {
                                            ab34.e(ta312, new sa3(i), rd3.E(ta312, ty1.M, new sa3(i), false));
                                            ta312.i = true;
                                        }
                                    }
                                }
                            } else {
                                h.c();
                            }
                        }
                    }
                } else {
                    h.q("currentDragState should not be null");
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: qk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: qk5} */
    /* JADX WARNING: type inference failed for: r12v5, types: [java.lang.Object, d06] */
    /* JADX WARNING: type inference failed for: r1v45, types: [zx1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v16, types: [zx1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v18, types: [wx1, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ec  */
    public void y(kk5 kk5, lk5 lk5, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        ? obj4;
        qk5 qk5;
        qk5 qk52;
        vx1 vx1;
        kk5 kk52 = kk5;
        lk5 lk52 = lk5;
        boolean z2 = true;
        this.T = true;
        if (this.O) {
            if (this.W == null) {
                kv2 kv2 = new kv2(this);
                V0(kv2);
                this.W = kv2;
            }
            int i = 0;
            if (this.b0 == null) {
                wx1 wx1 = this.U;
                wx1 wx12 = wx1;
                if (wx1 == null) {
                    ? obj5 = new Object();
                    obj5.f = vx1.y;
                    obj5.g = false;
                    obj5.h = false;
                    this.U = obj5;
                    wx12 = obj5;
                }
                this.b0 = wx12;
            }
            t49 t49 = this.b0;
            if (t49 != null) {
                boolean z3 = t49 instanceof wx1;
                lk5 lk53 = lk5.w;
                lk5 lk54 = lk5.x;
                if (z3) {
                    wx1 wx13 = (wx1) t49;
                    if (!kk52.a.isEmpty() && sb7.e(kk52, false)) {
                        qk5 qk53 = (qk5) dt0.w0(kk52.a);
                        int i2 = oy1.a[wx13.f.ordinal()];
                        vx1 vx12 = vx1.x;
                        vx1 vx13 = vx1.w;
                        if (i2 != 1) {
                            vx1 = wx13.f;
                        } else if (!n1()) {
                            vx1 = vx13;
                        } else {
                            vx1 = vx12;
                        }
                        wx13.f = vx1;
                        if (lk52 == lk53) {
                            if (vx1 == vx12) {
                                qk53.a();
                                wx13.g = true;
                            }
                            wx13.h = true;
                        }
                        if (lk52 != lk54) {
                            return;
                        }
                        if (vx1 == vx13) {
                            f1(this, qk53, qk53.a, 0, 12);
                        } else if (wx13.g) {
                            m1(qk53, qk53, 0);
                            l1(0, qk53);
                            long j2 = qk53.a;
                            zx1 zx1 = this.Y;
                            zx1 zx12 = zx1;
                            if (zx1 == null) {
                                ? obj6 = new Object();
                                obj6.f = Long.MAX_VALUE;
                                this.Y = obj6;
                                zx12 = obj6;
                            }
                            zx12.f = j2;
                            this.b0 = zx12;
                        }
                    }
                } else {
                    boolean z4 = t49 instanceof yx1;
                    lk5 lk55 = lk5.y;
                    if (z4) {
                        yx1 yx1 = (yx1) t49;
                        if (lk52 != lk53) {
                            List list = kk52.a;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i3);
                                if (a35.i(((qk5) obj3).a, yx1.g)) {
                                    break;
                                }
                                i3++;
                            }
                            qk5 qk54 = (qk5) obj3;
                            if (qk54 == null) {
                                int size2 = list.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        qk52 = null;
                                        break;
                                    }
                                    Object obj7 = list.get(i4);
                                    if (obj7.d) {
                                        qk52 = obj7;
                                        break;
                                    }
                                    i4++;
                                }
                                qk54 = qk52;
                                if (qk54 == null) {
                                    d1();
                                    return;
                                }
                                yx1.g = qk54.a;
                            }
                            if (lk52 == lk54) {
                                if (qk54.c()) {
                                    qk5 qk55 = yx1.f;
                                    if (qk55 != null) {
                                        long j3 = yx1.g;
                                        cp0 cp0 = this.d0;
                                        if (cp0 != null) {
                                            e1(qk55, j3, cp0);
                                        } else {
                                            h.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    } else {
                                        h.q("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                } else if (ub5.d(qk54)) {
                                    int size3 = list.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size3) {
                                            qk5 = null;
                                            break;
                                        }
                                        Object obj8 = list.get(i5);
                                        if (obj8.d) {
                                            qk5 = obj8;
                                            break;
                                        }
                                        i5++;
                                    }
                                    qk5 qk56 = qk5;
                                    if (qk56 == null) {
                                        d1();
                                    } else {
                                        yx1.g = qk56.a;
                                    }
                                } else {
                                    float h = my1.h((g58) h49.w(this, xy0.u), qk54.i);
                                    cp0 cp02 = this.d0;
                                    if (cp02 != null) {
                                        long e = cp0.e(cp02, ub5.q(qk54, true), h);
                                        if ((9223372034707292159L & e) != 9205357640488583168L) {
                                            long e2 = l35.e(this.V, ub5.q(qk54, false));
                                            this.V = e2;
                                            float atan2 = ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat((int) (this.V & 4294967295L))), (double) Math.abs(Float.intBitsToFloat((int) (e2 >> 32))))) * 57.29578f;
                                            z75 z75 = this.M;
                                            if (z75 != null) {
                                                int i6 = az1.a;
                                                if (z75 != z75.x ? atan2 <= 30.0f || atan2 > 90.0f : atan2 > 30.0f) {
                                                    z = false;
                                                    obj4 = new Object();
                                                    ny1 ny1 = new ny1(atan2, obj4);
                                                    int i7 = az1.a;
                                                    h75.t(this, kv2.L, new vz1(1, new gg0(21, (Object) ny1)));
                                                    if (z || !obj4.w) {
                                                        qk54.a();
                                                        qk5 qk57 = yx1.f;
                                                        qk57.getClass();
                                                        m1(qk57, qk54, e);
                                                        l1(e, qk54);
                                                        long j4 = qk54.a;
                                                        zx1 zx13 = this.Y;
                                                        zx1 zx14 = zx13;
                                                        if (zx13 == null) {
                                                            ? obj9 = new Object();
                                                            obj9.f = Long.MAX_VALUE;
                                                            this.Y = obj9;
                                                            zx14 = obj9;
                                                        }
                                                        zx14.f = j4;
                                                        this.b0 = zx14;
                                                    } else {
                                                        yx1.h = true;
                                                    }
                                                }
                                            }
                                            z = true;
                                            obj4 = new Object();
                                            ny1 ny12 = new ny1(atan2, obj4);
                                            int i72 = az1.a;
                                            h75.t(this, kv2.L, new vz1(1, new gg0(21, (Object) ny12)));
                                            if (z || !obj4.w) {
                                            }
                                        } else {
                                            yx1.h = true;
                                            this.V = l35.e(this.V, ub5.q(qk54, true));
                                        }
                                    } else {
                                        h.q("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            }
                            if (lk52 == lk55 && yx1.h) {
                                if (qk54.c()) {
                                    qk5 qk58 = yx1.f;
                                    if (qk58 != null) {
                                        long j5 = yx1.g;
                                        cp0 cp03 = this.d0;
                                        if (cp03 != null) {
                                            e1(qk58, j5, cp03);
                                        } else {
                                            h.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        }
                                    } else {
                                        h.q("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                } else {
                                    yx1.h = false;
                                }
                            }
                        }
                    } else if (t49 instanceof xx1) {
                        xx1 xx1 = (xx1) t49;
                        if (lk52 == lk55) {
                            List list2 = kk52.a;
                            int size4 = list2.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size4) {
                                    break;
                                } else if (((qk5) list2.get(i8)).c()) {
                                    z2 = false;
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            int size5 = list2.size();
                            while (true) {
                                if (i >= size5) {
                                    break;
                                } else if (!((qk5) list2.get(i)).d) {
                                    i++;
                                } else if (!list2.isEmpty()) {
                                    if (z2) {
                                        long j6 = ((qk5) dt0.w0(list2)).c;
                                        qk5 qk59 = xx1.f;
                                        qk59.getClass();
                                        long d = l35.d(j6, qk59.c);
                                        qk5 qk510 = xx1.f;
                                        if (qk510 != null) {
                                            f1(this, qk510, xx1.g, d, 8);
                                            return;
                                        }
                                        h.q("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                    return;
                                }
                            }
                            d1();
                        }
                    } else if (t49 instanceof zx1) {
                        zx1 zx15 = (zx1) t49;
                        if (lk52 == lk54) {
                            long j7 = zx15.f;
                            List list3 = kk52.a;
                            int size6 = list3.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size6) {
                                    obj = null;
                                    break;
                                }
                                obj = list3.get(i9);
                                if (a35.i(((qk5) obj).a, j7)) {
                                    break;
                                }
                                i9++;
                            }
                            qk5 qk511 = (qk5) obj;
                            if (qk511 != null) {
                                boolean d2 = ub5.d(qk511);
                                ay1 ay1 = ay1.a;
                                if (d2) {
                                    List list4 = kk52.a;
                                    int size7 = list4.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= size7) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = list4.get(i10);
                                        if (((qk5) obj2).d) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    qk5 qk512 = (qk5) obj2;
                                    if (qk512 == null) {
                                        if (qk511.c() || !ub5.d(qk511)) {
                                            j1().c(ay1);
                                        } else {
                                            z65.b(k1(), qk511);
                                            float e3 = ((g58) h49.w(this, xy0.u)).e();
                                            long d3 = k1().d(u55.b(e3, e3));
                                            md4 md4 = (md4) k1().x;
                                            z38 z38 = (z38) md4.b;
                                            qs.S0(0, z38.d.length, (Object) null, z38.d);
                                            z38.e = 0;
                                            z38 z382 = (z38) md4.c;
                                            qs.S0(0, z382.d.length, (Object) null, z382.d);
                                            z382.e = 0;
                                            md4.a = 0;
                                            j1().c(new dy1(false, az1.a(d3)));
                                            this.T = false;
                                        }
                                        d1();
                                        return;
                                    }
                                    zx15.f = qk512.a;
                                } else if (qk511.c()) {
                                    j1().c(ay1);
                                } else if (l35.c(ub5.q(qk511, true)) != 0.0f) {
                                    l1(ub5.q(qk511, false), qk511);
                                    qk511.a();
                                }
                            }
                        }
                    } else {
                        h.c();
                    }
                }
            } else {
                h.q("currentDragState should not be null");
            }
        }
    }
}
