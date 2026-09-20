package defpackage;

/* renamed from: m52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m52 extends ng3 {
    public mm7 L;
    public bm7 M;
    public bm7 N;
    public bm7 O;
    public n52 P;
    public x82 Q;
    public tr6 R;
    public sr2 S;
    public c52 T;
    public long U = -9223372034707292160L;
    public jb V;
    public final l52 W;
    public final l52 X;

    public m52(mm7 mm7, bm7 bm7, bm7 bm72, bm7 bm73, n52 n52, x82 x82, tr6 tr6, sr2 sr2, c52 c52) {
        super(1);
        this.L = mm7;
        this.M = bm7;
        this.N = bm72;
        this.O = bm73;
        this.P = n52;
        this.Q = x82;
        this.R = tr6;
        this.S = sr2;
        this.T = c52;
        m31.b(0, 0, 0, 0, 15);
        this.W = new l52(this, 0);
        this.X = new l52(this, 1);
    }

    public final void N0() {
        this.U = -9223372034707292160L;
    }

    public final jb X0() {
        jb jbVar;
        jb jbVar2;
        if (this.L.f().c(a52.w, a52.x)) {
            cn0 cn0 = this.P.a.c;
            if (cn0 != null && (jbVar2 = cn0.a) != null) {
                return jbVar2;
            }
            cn0 cn02 = this.Q.a.c;
            if (cn02 != null) {
                return cn02.a;
            }
            return null;
        }
        cn0 cn03 = this.Q.a.c;
        if (cn03 != null && (jbVar = cn03.a) != null) {
            return jbVar;
        }
        cn0 cn04 = this.P.a.c;
        if (cn04 != null) {
            return cn04.a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: am7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: am7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: am7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.Float} */
    /* JADX WARNING: type inference failed for: r3v13, types: [ol] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c1  */
    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        long j2;
        am7 am7;
        am7 am72;
        ql7 ql7;
        am7 am73;
        long j3;
        bm7 bm7;
        am7 am74;
        long j4;
        bm7 bm72;
        long j5;
        am7 am75;
        long j6;
        long j7;
        bm7 bm73;
        long j8;
        am7 am76;
        Object obj;
        float f;
        float f2;
        ql7 ql72;
        Float f3;
        kl klVar;
        float f4;
        Float f5;
        oh4 oh42 = oh4;
        if (this.L.a.H0() == this.L.d.getValue()) {
            this.V = null;
        } else if (this.V == null) {
            jb X0 = X0();
            if (X0 == null) {
                X0 = xb4.y;
            }
            this.V = X0;
        }
        boolean a0 = oh42.a0();
        b42 b42 = b42.w;
        if (a0) {
            eh5 y = gh4.y(j);
            long j9 = (((long) y.w) << 32) | (((long) y.x) & 4294967295L);
            this.U = j9;
            return oh42.d0((int) (j9 >> 32), (int) (j9 & 4294967295L), b42, new wd(y, 3));
        } else if (((Boolean) this.S.b()).booleanValue()) {
            c52 c52 = this.T;
            bm7 bm74 = c52.a;
            tr6 tr6 = c52.b;
            bm7 bm75 = c52.c;
            mm7 mm7 = c52.d;
            n52 n52 = c52.e;
            nm7 nm7 = n52.a;
            x82 x82 = c52.f;
            bm7 bm76 = c52.g;
            if (bm74 != null) {
                d52 d52 = new d52(n52, x82, 0);
                if (tr6.a()) {
                    j2 = 4294967295L;
                    f5 = Float.valueOf(tr6.f);
                } else {
                    j2 = 4294967295L;
                    f5 = null;
                }
                am7 = bm74.a(d52, f5, (ol) null, new e52(n52, x82, tr6, 0));
            } else {
                j2 = 4294967295L;
                am7 = null;
            }
            if (bm75 != null) {
                d52 d522 = new d52(n52, x82, 1);
                if (tr6.a()) {
                    f3 = Float.valueOf(tr6.g);
                } else {
                    f3 = null;
                }
                if (tr6.a()) {
                    z38 z38 = tr6.j;
                    if (z38 != null) {
                        float b = z38.b();
                        Float valueOf = Float.valueOf(b);
                        if (Float.isNaN(b)) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            f4 = valueOf.floatValue();
                            klVar = new kl(f4);
                        }
                    }
                    f4 = 0.0f;
                    klVar = new kl(f4);
                } else {
                    klVar = null;
                }
                am72 = bm75.a(d522, f3, klVar, new e52(n52, x82, tr6, 1));
            } else {
                am72 = null;
            }
            if (mm7.a.H0() == a52.w) {
                xf6 xf6 = nm7.d;
                if (xf6 != null) {
                    ql7 = new ql7(xf6.b);
                } else {
                    xf6 xf62 = x82.a.d;
                    if (xf62 != null) {
                        ql7 = new ql7(xf62.b);
                    }
                }
                if (bm76 != null) {
                    ce ceVar = ce.W;
                    if (tr6.a()) {
                        ql72 = new ql7(tr6.h);
                    } else {
                        ql72 = null;
                    }
                    am73 = bm76.a(ceVar, ql72, (ol) null, new f52(ql7, n52, x82, tr6));
                } else {
                    am73 = null;
                }
                f52 f52 = new f52(tr6, am7, am72, am73);
                eh5 y2 = gh4.y(j);
                long j10 = (((long) y2.w) << 32) | (((long) y2.x) & j2);
                if (!we3.a(this.U, -9223372034707292160L)) {
                    j3 = this.U;
                } else {
                    j3 = j10;
                }
                bm7 = this.M;
                if (bm7 != null) {
                    am74 = bm7.a(this.W, (Object) null, (ol) null, new k52(this, j3, 0));
                } else {
                    am74 = null;
                }
                if (am74 != null) {
                    j4 = ((we3) am74.getValue()).a;
                } else {
                    j4 = j10;
                }
                long j11 = j3;
                long d = m31.d(j, j4);
                bm72 = this.N;
                if (bm72 != null) {
                    j7 = j11;
                    j5 = 0;
                    am75 = null;
                    j6 = ((oe3) bm72.a(ce.X, (Object) null, (ol) null, new k52(this, j7, 2)).getValue()).a;
                } else {
                    j7 = j11;
                    j5 = 0;
                    am75 = null;
                    j6 = 0;
                }
                bm73 = this.O;
                if (bm73 != null) {
                    tr6 tr62 = this.R;
                    if (tr62.a()) {
                        j8 = j10;
                        obj = new oe3(tr62.i);
                    } else {
                        j8 = j10;
                        obj = am75;
                    }
                    Object obj2 = am75;
                    if (this.R.a()) {
                        float b2 = x38.b(j5);
                        Float valueOf2 = Float.valueOf(b2);
                        if (Float.isNaN(b2)) {
                            valueOf2 = am75;
                        }
                        if (valueOf2 != null) {
                            f = valueOf2.floatValue();
                        } else {
                            f = 0.0f;
                        }
                        float c = x38.c(j5);
                        Float valueOf3 = Float.valueOf(c);
                        Float f6 = am75;
                        if (!Float.isNaN(c)) {
                            f6 = valueOf3;
                        }
                        if (f6 != 0) {
                            f2 = f6.floatValue();
                        } else {
                            f2 = 0.0f;
                        }
                        obj2 = new ll(f, f2);
                    }
                    am76 = bm73.a(this.X, obj, obj2, new k52(this, j7, 1));
                } else {
                    j8 = j10;
                    am76 = am75;
                }
                return oh42.d0((int) (d >> 32), (int) (d & j2), b42, new j52(this, am76, j8, j7, d, y2, j6, f52));
            }
            xf6 xf63 = x82.a.d;
            if (xf63 != null) {
                ql7 = new ql7(xf63.b);
            } else {
                xf6 xf64 = nm7.d;
                if (xf64 != null) {
                    ql7 = new ql7(xf64.b);
                }
            }
            if (bm76 != null) {
            }
            f52 f522 = new f52(tr6, am7, am72, am73);
            eh5 y22 = gh4.y(j);
            long j102 = (((long) y22.w) << 32) | (((long) y22.x) & j2);
            if (!we3.a(this.U, -9223372034707292160L)) {
            }
            bm7 = this.M;
            if (bm7 != null) {
            }
            if (am74 != null) {
            }
            long j112 = j3;
            long d2 = m31.d(j, j4);
            bm72 = this.N;
            if (bm72 != null) {
            }
            bm73 = this.O;
            if (bm73 != null) {
            }
            return oh42.d0((int) (d2 >> 32), (int) (d2 & j2), b42, new j52(this, am76, j8, j7, d2, y22, j6, f522));
            ql7 = null;
            if (bm76 != null) {
            }
            f52 f5222 = new f52(tr6, am7, am72, am73);
            eh5 y222 = gh4.y(j);
            long j1022 = (((long) y222.w) << 32) | (((long) y222.x) & j2);
            if (!we3.a(this.U, -9223372034707292160L)) {
            }
            bm7 = this.M;
            if (bm7 != null) {
            }
            if (am74 != null) {
            }
            long j1122 = j3;
            long d22 = m31.d(j, j4);
            bm72 = this.N;
            if (bm72 != null) {
            }
            bm73 = this.O;
            if (bm73 != null) {
            }
            return oh42.d0((int) (d22 >> 32), (int) (d22 & j2), b42, new j52(this, am76, j8, j7, d22, y222, j6, f5222));
        } else {
            long j12 = j;
            eh5 y3 = gh4.y(j);
            return oh42.d0(y3.w, y3.x, b42, new wd(y3, 4));
        }
    }
}
