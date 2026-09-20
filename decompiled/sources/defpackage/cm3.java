package defpackage;

/* renamed from: cm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cm3 extends bb0 {
    public final z1 b0;
    public final z53 c0;

    public cm3(z1 z1Var, pl3 pl3) {
        pl3.getClass();
        this.b0 = z1Var;
        this.c0 = pl3.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029 A[Catch:{ IllegalArgumentException -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[Catch:{ IllegalArgumentException -> 0x0030 }] */
    public final byte A() {
        fr7 fr7;
        z1 z1Var = this.b0;
        String p = z1Var.p();
        try {
            p.getClass();
            lr7 t = f55.t(p);
            if (t != null) {
                int i = t.w;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) <= 0) {
                    fr7 = new fr7((byte) i);
                    if (fr7 == null) {
                        return fr7.w;
                    }
                    k57.o0(p);
                    throw null;
                }
            }
            fr7 = null;
            if (fr7 == null) {
            }
        } catch (IllegalArgumentException unused) {
            z1.u(z1Var, pb4.h('\'', "Failed to parse type 'UByte' for input '", p), 0, (String) null, 6);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029 A[Catch:{ IllegalArgumentException -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[Catch:{ IllegalArgumentException -> 0x0030 }] */
    public final short B() {
        bs7 bs7;
        z1 z1Var = this.b0;
        String p = z1Var.p();
        try {
            p.getClass();
            lr7 t = f55.t(p);
            if (t != null) {
                int i = t.w;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                    bs7 = new bs7((short) i);
                    if (bs7 == null) {
                        return bs7.w;
                    }
                    k57.o0(p);
                    throw null;
                }
            }
            bs7 = null;
            if (bs7 == null) {
            }
        } catch (IllegalArgumentException unused) {
            z1.u(z1Var, pb4.h('\'', "Failed to parse type 'UShort' for input '", p), 0, (String) null, 6);
            throw null;
        }
    }

    public final z53 a() {
        return this.c0;
    }

    public final int h(ll6 ll6) {
        ll6.getClass();
        throw new IllegalStateException("unsupported");
    }

    public final int o() {
        z1 z1Var = this.b0;
        String p = z1Var.p();
        try {
            p.getClass();
            lr7 t = f55.t(p);
            if (t != null) {
                return t.w;
            }
            k57.o0(p);
            throw null;
        } catch (IllegalArgumentException unused) {
            z1.u(z1Var, pb4.h('\'', "Failed to parse type 'UInt' for input '", p), 0, (String) null, 6);
            throw null;
        }
    }

    public final long v() {
        z1 z1Var = this.b0;
        String p = z1Var.p();
        try {
            p.getClass();
            qr7 u = f55.u(p);
            if (u != null) {
                return u.w;
            }
            k57.o0(p);
            throw null;
        } catch (IllegalArgumentException unused) {
            z1.u(z1Var, pb4.h('\'', "Failed to parse type 'ULong' for input '", p), 0, (String) null, 6);
            throw null;
        }
    }
}
