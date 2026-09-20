package defpackage;

/* renamed from: l11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l11 implements h11 {
    public volatile boolean A;
    public final long B;
    public final int C;
    public final cl5 w;
    public final cl5 x;
    public final g22 y = new g22(24);
    public final ThreadLocal z = new ThreadLocal();

    public l11(qc3 qc3, String str, int i) {
        str.getClass();
        xb4 xb4 = u02.x;
        this.B = gl0.e0(30, y02.SECONDS);
        this.C = 2;
        if (i > 0) {
            this.w = new cl5(i, new i11(qc3, str, 0));
            this.x = new cl5(1, new i11(qc3, str, 1));
            return;
        }
        h.q("Maximum number of readers must be greater than 0");
        throw null;
    }

    public final void close() {
        if (!this.A) {
            this.A = true;
            this.w.c();
            this.x.c();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: cl5} */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    public final Object w(boolean z2, gs2 gs2, h61 h61) {
        k11 k11;
        int i;
        h06 h06;
        cl5 cl5;
        Throwable th;
        Throwable th2;
        h06 h062;
        kl5 kl5;
        gs2 gs22;
        cl5 cl52;
        e81 e81;
        h06 h063;
        h06 h064;
        g22 g22;
        boolean z3;
        Object obj;
        cl5 cl53;
        h06 h065;
        boolean z4 = z2;
        gs2 gs23 = gs2;
        h61 h612 = h61;
        if (h612 instanceof k11) {
            k11 = (k11) h612;
            int i2 = k11.I;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k11.I = i2 - Integer.MIN_VALUE;
                Object obj2 = k11.G;
                Object obj3 = p81.w;
                i = k11.I;
                if (i != 0) {
                    o85.q(obj2);
                    if (!this.A) {
                        kl5 kl52 = (kl5) this.z.get();
                        if (kl52 == null) {
                            e81 e812 = k11.x;
                            e812.getClass();
                            g11 g11 = (g11) e812.a0(this.y);
                            if (g11 != null) {
                                kl52 = g11.x;
                            } else {
                                kl52 = null;
                            }
                        }
                        if (kl52 == null) {
                            if (z4) {
                                cl53 = this.w;
                            } else {
                                cl53 = this.x;
                            }
                            ? obj4 = new Object();
                            try {
                                e81 = k11.x;
                                e81.getClass();
                                g22 g222 = this.y;
                                long j = this.B;
                                j11 j11 = new j11(this, z4);
                                k11.A = gs23;
                                k11.B = cl53;
                                k11.C = obj4;
                                k11.D = e81;
                                k11.E = obj4;
                                k11.F = g222;
                                k11.z = z4;
                                k11.I = 3;
                                Object b = cl53.b(j, j11, k11);
                                if (b != obj3) {
                                    gs22 = gs23;
                                    g22 = g222;
                                    cl52 = cl53;
                                    obj2 = b;
                                    h063 = obj4;
                                    h064 = obj4;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cl5 = cl53;
                                h06 = obj4;
                                throw th;
                            }
                        } else if (z4 || !kl52.c) {
                            e81 e813 = k11.x;
                            e813.getClass();
                            if (e813.a0(this.y) == null) {
                                g11 g112 = new g11(this.y, kl52);
                                ThreadLocal threadLocal = this.z;
                                threadLocal.getClass();
                                e81 D0 = rc9.D0(g112, new hh7(kl52, threadLocal));
                                n0 n0Var = new n0(gs23, kl52, (f61) null, 19);
                                k11.I = 1;
                                Object e0 = ar7.e0(D0, n0Var, k11);
                                if (e0 == obj3) {
                                    return obj3;
                                }
                                return e0;
                            }
                            k11.I = 2;
                            Object H = gs23.H(kl52, k11);
                            if (H != obj3) {
                                return H;
                            }
                        } else {
                            l55.w(1, "Cannot upgrade connection from reader to writer");
                            throw null;
                        }
                        return obj3;
                    }
                    l55.w(21, "Connection pool is closed");
                    throw null;
                } else if (i == 1) {
                    o85.q(obj2);
                    return obj2;
                } else if (i == 2) {
                    o85.q(obj2);
                    return obj2;
                } else if (i == 3) {
                    z4 = k11.z;
                    g22 = k11.F;
                    h06 h066 = k11.E;
                    e81 e814 = k11.D;
                    h06 h067 = k11.C;
                    cl52 = (cl5) k11.B;
                    gs22 = (gs2) k11.A;
                    try {
                        o85.q(obj2);
                        e81 e815 = e814;
                        h063 = h066;
                        h064 = h067;
                        e81 = e815;
                    } catch (Throwable th4) {
                        th = th4;
                        h065 = h067;
                        cl5 = cl52;
                        h06 = h065;
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            su0.b(th, th5);
                        }
                    }
                } else if (i == 4) {
                    h062 = k11.B;
                    cl5 = k11.A;
                    try {
                        o85.q(obj2);
                        kl5 = (kl5) h062.w;
                        if (kl5 != null) {
                            if (!kl5.e) {
                                kl5.e = true;
                                if (kl5.b.w.Z()) {
                                    l55.m(kl5.b, "ROLLBACK TRANSACTION");
                                }
                            }
                            u11 u11 = kl5.b;
                            u11.y = null;
                            u11.z = null;
                            cl5.e(u11);
                        }
                        return obj2;
                    } catch (Throwable th6) {
                        h06 = h062;
                        th = th6;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u11 u112 = (u11) obj2;
                u112.getClass();
                e81.getClass();
                u112.y = e81;
                u112.z = new Throwable();
                if (this.w != this.x || !z4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                h063.w = new kl5(g22, u112, z3);
                obj = h064.w;
                if (obj == null) {
                    kl5 kl53 = (kl5) obj;
                    g11 g113 = new g11(this.y, kl53);
                    ThreadLocal threadLocal2 = this.z;
                    threadLocal2.getClass();
                    e81 D02 = rc9.D0(g113, new hh7(kl53, threadLocal2));
                    n0 n0Var2 = new n0(gs22, h064, (f61) null, 20);
                    k11.A = cl52;
                    k11.B = h064;
                    k11.C = null;
                    k11.D = null;
                    k11.E = null;
                    k11.F = null;
                    k11.I = 4;
                    obj2 = ar7.e0(D02, n0Var2, k11);
                    if (obj2 != obj3) {
                        h062 = h064;
                        cl5 = cl52;
                        kl5 = (kl5) h062.w;
                        if (kl5 != null) {
                        }
                        return obj2;
                    }
                    return obj3;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        k11 = new k11(this, h612);
        Object obj22 = k11.G;
        Object obj32 = p81.w;
        i = k11.I;
        if (i != 0) {
        }
        try {
            u11 u1122 = (u11) obj22;
            u1122.getClass();
            e81.getClass();
            u1122.y = e81;
            u1122.z = new Throwable();
            if (this.w != this.x) {
            }
            z3 = false;
            h063.w = new kl5(g22, u1122, z3);
            obj = h064.w;
            if (obj == null) {
            }
        } catch (Throwable th7) {
            th = th7;
            h065 = h064;
            cl5 = cl52;
            h06 = h065;
            throw th;
        }
        throw th2;
    }

    public l11(qc3 qc3) {
        xb4 xb4 = u02.x;
        this.B = gl0.e0(30, y02.SECONDS);
        this.C = 2;
        cl5 cl5 = new cl5(1, new zh(8, (Object) qc3));
        this.w = cl5;
        this.x = cl5;
    }
}
