package defpackage;

/* renamed from: zx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zx4 extends ll4 implements ln7, tx4 {
    public tx4 K;
    public am6 L;
    public zx4 M;
    public final String N;

    public zx4(tx4 tx4, am6 am6) {
        this.K = tx4;
        this.L = am6 == null ? new am6(18) : am6;
        this.N = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    public final Object A(long j, long j2, f61 f61) {
        xx4 xx4;
        int i;
        zx4 zx4;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        f61 f612 = f61;
        if (f612 instanceof xx4) {
            xx4 = (xx4) f612;
            int i2 = xx4.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xx4.D = i2 - Integer.MIN_VALUE;
                xx4 xx42 = xx4;
                Object obj = xx42.B;
                i = xx42.D;
                zx4 = null;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    tx4 tx4 = this.K;
                    xx42.z = j;
                    long j8 = j2;
                    xx42.A = j8;
                    xx42.D = 1;
                    obj = tx4.A(j, j8, xx42);
                    if (obj != p81) {
                        j6 = j;
                        j7 = j2;
                    }
                    return p81;
                } else if (i == 1) {
                    j7 = xx42.A;
                    j6 = xx42.z;
                    o85.q(obj);
                } else if (i == 2) {
                    j5 = xx42.z;
                    o85.q(obj);
                    j4 = ((x38) obj).a;
                    j3 = j5;
                    return new x38(x38.e(j3, j4));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = ((x38) obj).a;
                z = this.J;
                if (z) {
                    zx4 = this.M;
                } else if (z) {
                    zx4 = W0();
                }
                if (zx4 == null) {
                    long e = x38.e(j6, j3);
                    long d = x38.d(j7, j3);
                    xx42.z = j3;
                    xx42.D = 2;
                    obj = zx4.A(e, d, xx42);
                    if (obj != p81) {
                        j5 = j3;
                        j4 = ((x38) obj).a;
                        j3 = j5;
                        return new x38(x38.e(j3, j4));
                    }
                    return p81;
                }
                j4 = 0;
                return new x38(x38.e(j3, j4));
            }
        }
        xx4 = new xx4(this, (h61) f612);
        xx4 xx422 = xx4;
        Object obj2 = xx422.B;
        i = xx422.D;
        zx4 = null;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        j3 = ((x38) obj2).a;
        z = this.J;
        if (z) {
        }
        if (zx4 == null) {
        }
    }

    public final void N0() {
        am6 am6 = this.L;
        am6.x = this;
        am6.y = null;
        this.M = null;
        am6.z = new kh(12, this);
        am6.A = J0();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public final void O0() {
        ? obj = new Object();
        h75.u(this, new be(2, obj));
        zx4 zx4 = (zx4) ((ln7) obj.w);
        this.M = zx4;
        am6 am6 = this.L;
        am6.y = zx4;
        if (((zx4) am6.x) == this) {
            am6.x = null;
        }
    }

    public final o81 V0() {
        o81 o81;
        zx4 W0 = W0();
        if (W0 != null) {
            o81 = W0.V0();
        } else {
            o81 = null;
        }
        if (o81 != null && gl0.X(o81)) {
            return o81;
        }
        o81 o812 = (o81) this.L.A;
        if (o812 != null) {
            return o812;
        }
        h.s("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final zx4 W0() {
        o00 o00;
        ln7 ln7 = null;
        if (!this.J) {
            return null;
        }
        if (!this.w.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll4 = this.w.A;
        uy3 O0 = rc9.O0(this);
        loop0:
        while (true) {
            if (O0 == null) {
                break;
            }
            if ((((ll4) O0.a0.g).z & 262144) != 0) {
                while (ll4 != null) {
                    if ((ll4.y & 262144) != 0) {
                        ll4 ll42 = ll4;
                        eq4 eq4 = null;
                        while (ll42 != null) {
                            if (ll42 instanceof ln7) {
                                ln7 ln72 = (ln7) ll42;
                                if (sg3.e(this.N, ln72.m()) && zx4.class == ln72.getClass()) {
                                    ln7 = ln72;
                                    break loop0;
                                }
                            }
                            if ((ll42.y & 262144) != 0 && (ll42 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 262144) != 0) {
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
                        continue;
                    }
                    ll4 = ll4.A;
                }
            }
            O0 = O0.v();
            if (O0 == null || (o00 = O0.a0) == null) {
                ll4 = null;
            } else {
                ll4 = (ib7) o00.f;
            }
        }
        return (zx4) ln7;
    }

    public final long X(long j, int i) {
        zx4 zx4;
        long j2;
        if (this.J) {
            zx4 = W0();
        } else {
            zx4 = null;
        }
        if (zx4 != null) {
            j2 = zx4.X(j, i);
        } else {
            j2 = 0;
        }
        return l35.e(j2, this.K.X(l35.d(j, j2), i));
    }

    public final Object m() {
        return this.N;
    }

    public final long n0(int i, long j, long j2) {
        zx4 zx4;
        long j3;
        int i2 = i;
        long j4 = j;
        long j5 = j2;
        long n0 = this.K.n0(i2, j4, j5);
        if (this.J) {
            zx4 = W0();
        } else {
            zx4 = null;
        }
        zx4 zx42 = zx4;
        if (zx42 != null) {
            j3 = zx42.n0(i2, l35.e(j4, n0), l35.d(j5, n0));
        } else {
            j3 = 0;
        }
        return l35.e(n0, j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r9 == r5) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public final Object u0(long j, f61 f61) {
        yx4 yx4;
        Object obj;
        int i;
        p81 p81;
        long j2;
        long j3;
        if (f61 instanceof yx4) {
            yx4 = (yx4) f61;
            int i2 = yx4.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yx4.C = i2 - Integer.MIN_VALUE;
                obj = yx4.A;
                i = yx4.C;
                zx4 zx4 = null;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (this.J) {
                        zx4 = W0();
                    }
                    if (zx4 != null) {
                        yx4.z = j;
                        yx4.C = 1;
                        obj = zx4.u0(j, yx4);
                    } else {
                        j3 = 0;
                        tx4 tx4 = this.K;
                        long d = x38.d(j, j3);
                        yx4.z = j3;
                        yx4.C = 2;
                        obj = tx4.u0(d, yx4);
                        if (obj != p81) {
                            j2 = j3;
                            return new x38(x38.e(j2, ((x38) obj).a));
                        }
                        return p81;
                    }
                } else if (i == 1) {
                    j = yx4.z;
                    o85.q(obj);
                } else if (i == 2) {
                    j2 = yx4.z;
                    o85.q(obj);
                    return new x38(x38.e(j2, ((x38) obj).a));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = ((x38) obj).a;
                tx4 tx42 = this.K;
                long d2 = x38.d(j, j3);
                yx4.z = j3;
                yx4.C = 2;
                obj = tx42.u0(d2, yx4);
                if (obj != p81) {
                }
                return p81;
            }
        }
        yx4 = new yx4(this, (h61) f61);
        obj = yx4.A;
        i = yx4.C;
        zx4 zx42 = null;
        p81 = p81.w;
        if (i != 0) {
        }
        j3 = ((x38) obj).a;
        tx4 tx422 = this.K;
        long d22 = x38.d(j, j3);
        yx4.z = j3;
        yx4.C = 2;
        obj = tx422.u0(d22, yx4);
        if (obj != p81) {
        }
        return p81;
    }
}
