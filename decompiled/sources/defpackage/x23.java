package defpackage;

/* renamed from: x23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x23 extends ll4 implements tk5 {
    public ap4 K;
    public r23 L;

    /* JADX WARNING: type inference failed for: r5v3, types: [df3, r23, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object V0(x23 x23, h61 h61) {
        u23 u23;
        int i;
        r23 r23;
        if (h61 instanceof u23) {
            u23 = (u23) h61;
            int i2 = u23.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u23.C = i2 - Integer.MIN_VALUE;
                Object obj = u23.A;
                i = u23.C;
                if (i != 0) {
                    o85.q(obj);
                    if (x23.L == null) {
                        ? obj2 = new Object();
                        ap4 ap4 = x23.K;
                        u23.z = obj2;
                        u23.C = 1;
                        Object b = ap4.b(obj2, u23);
                        p81 p81 = p81.w;
                        if (b == p81) {
                            return p81;
                        }
                        r23 = obj2;
                    }
                    return vs7.a;
                } else if (i == 1) {
                    r23 = u23.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x23.L = r23;
                return vs7.a;
            }
        }
        u23 = new u23(x23, h61);
        Object obj3 = u23.A;
        i = u23.C;
        if (i != 0) {
        }
        x23.L = r23;
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object W0(x23 x23, h61 h61) {
        v23 v23;
        int i;
        if (h61 instanceof v23) {
            v23 = (v23) h61;
            int i2 = v23.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v23.B = i2 - Integer.MIN_VALUE;
                Object obj = v23.z;
                i = v23.B;
                if (i != 0) {
                    o85.q(obj);
                    r23 r23 = x23.L;
                    if (r23 != null) {
                        s23 s23 = new s23(r23);
                        ap4 ap4 = x23.K;
                        v23.B = 1;
                        Object b = ap4.b(s23, v23);
                        p81 p81 = p81.w;
                        if (b == p81) {
                            return p81;
                        }
                    }
                    return vs7.a;
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x23.L = null;
                return vs7.a;
            }
        }
        v23 = new v23(x23, h61);
        Object obj2 = v23.z;
        i = v23.B;
        if (i != 0) {
        }
        x23.L = null;
        return vs7.a;
    }

    public final void I() {
        X0();
    }

    public final void O0() {
        X0();
    }

    public final void X0() {
        r23 r23 = this.L;
        if (r23 != null) {
            this.K.c(new s23(r23));
            this.L = null;
        }
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        if (lk5 == lk5.x) {
            int i = kk5.f;
            if (i == 4) {
                ar7.H(J0(), (e81) null, (r81) null, new w23(this, (f61) null, 0), 3);
            } else if (i == 5) {
                ar7.H(J0(), (e81) null, (r81) null, new w23(this, (f61) null, 1), 3);
            }
        }
    }
}
