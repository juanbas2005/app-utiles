package defpackage;

import java.io.IOException;

/* renamed from: ef0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ef0 {
    public final hf0 a;
    public final cg0 b;
    public final fg0 c;
    public final long d;
    public final py6 e;
    public final int[] f;
    public final tc0 g;
    public long h;
    public int i;

    /* JADX WARNING: type inference failed for: r3v4, types: [tc0, java.lang.Object] */
    public ef0(hf0 hf0, cg0 cg0, fg0 fg0, long j) {
        hf0.getClass();
        cg0.getClass();
        fg0.getClass();
        this.a = hf0;
        this.b = cg0;
        this.c = fg0;
        this.d = j;
        byte[] bArr = cg0.w;
        if (bArr.length > 0) {
            this.e = hf0.g();
            int[] iArr = new int[bArr.length];
            int length = bArr.length;
            int i2 = 0;
            int i3 = 1;
            while (i3 < length) {
                while (i2 > 0 && cg0.a(i3) != cg0.a(i2)) {
                    i2 = iArr[i2 - 1];
                }
                if (cg0.a(i3) == cg0.a(i2)) {
                    i2++;
                }
                iArr[i3] = i2;
                i3++;
            }
            this.f = iArr;
            this.g = new Object();
            return;
        }
        h.q("Empty match string not permitted for scanning");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r13 == r7) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (defpackage.gl0.S(r1, r0) == r7) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public final Object a(h61 h61) {
        bf0 bf0;
        int i2;
        py6 py6;
        int i3;
        if (h61 instanceof bf0) {
            bf0 = (bf0) h61;
            int i4 = bf0.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bf0.B = i4 - Integer.MIN_VALUE;
                Object obj = bf0.z;
                i2 = bf0.B;
                vs7 vs7 = vs7.a;
                py6 = this.e;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    if (i2 == 1) {
                        o85.q(obj);
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            o85.q(obj);
                            return vs7;
                        }
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                o85.q(obj);
                if (py6.x()) {
                    bf0.B = 1;
                    gf0 gf0 = hf0.a;
                    obj = this.a.d(1, bf0);
                }
                long g2 = i75.g(py6, this.b.a(0), 0, 6);
                i3 = (g2 > -1 ? 1 : (g2 == -1 ? 0 : -1));
                fg0 fg0 = this.c;
                if (i3 != 0) {
                    py6.getClass();
                    tc0 tc0 = (tc0) py6;
                    b(tc0.y);
                    this.h = tc0.v(fg0.e()) + this.h;
                    bf0.B = 2;
                } else {
                    b(g2);
                    long j = this.h;
                    tc0 e2 = fg0.e();
                    e2.getClass();
                    this.h = py6.y(e2, g2) + j;
                    bf0.B = 3;
                    if (gl0.S(fg0, bf0) == p81) {
                        return p81;
                    }
                    return vs7;
                }
                return p81;
            }
        }
        bf0 = new bf0(this, h61);
        Object obj2 = bf0.z;
        i2 = bf0.B;
        vs7 vs72 = vs7.a;
        py6 = this.e;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        o85.q(obj2);
        if (py6.x()) {
        }
        long g22 = i75.g(py6, this.b.a(0), 0, 6);
        i3 = (g22 > -1 ? 1 : (g22 == -1 ? 0 : -1));
        fg0 fg02 = this.c;
        if (i3 != 0) {
        }
        return p812;
    }

    public final void b(long j) {
        long j2 = this.h + j;
        long j3 = this.d;
        if (j2 > j3) {
            StringBuilder q = hl6.q(j3, "Limit of ", " bytes exceeded while searching for \"");
            cg0 cg0 = this.b;
            cg0.getClass();
            q.append(k57.s0(k57.k0(cg0.w), "\n", "\\n"));
            q.append('\"');
            throw new IOException(q.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r14 == r2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r14 == r2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[LOOP:0: B:28:0x006e->B:32:0x0078, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[EDGE_INSN: B:49:0x0082->B:33:0x0082 ?: BREAK  
    EDGE_INSN: B:50:0x0082->B:33:0x0082 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object c(h61 h61) {
        cf0 cf0;
        int i2;
        p81 p81;
        py6 py6;
        byte readByte;
        tc0 tc0;
        cg0 cg0;
        int i3;
        Object S;
        if (h61 instanceof cf0) {
            cf0 = (cf0) h61;
            int i4 = cf0.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cf0.B = i4 - Integer.MIN_VALUE;
                Object obj = cf0.z;
                i2 = cf0.B;
                p81 = p81.w;
                py6 = this.e;
                if (i2 != 0) {
                    o85.q(obj);
                } else if (i2 == 1) {
                    o85.q(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    readByte = py6.readByte();
                    int i5 = this.i;
                    tc0 = this.g;
                    cg0 = this.b;
                    if (i5 > 0 && readByte != cg0.a(i5)) {
                        int i6 = this.i;
                        while (true) {
                            i3 = this.i;
                            if (i3 <= 0 || readByte == cg0.a(i3)) {
                                long j = (long) (i6 - this.i);
                                b(j);
                                long j2 = this.h;
                                fg0 fg0 = this.c;
                                tc0 e2 = fg0.e();
                                e2.getClass();
                                this.h = tc0.y(e2, j) + j2;
                                int i7 = this.i;
                            } else {
                                this.i = this.f[this.i - 1];
                            }
                            break;
                        }
                        long j3 = (long) (i6 - this.i);
                        b(j3);
                        long j22 = this.h;
                        fg0 fg02 = this.c;
                        tc0 e22 = fg02.e();
                        e22.getClass();
                        this.h = tc0.y(e22, j3) + j22;
                        int i72 = this.i;
                        if (i72 == 0 && readByte != cg0.a(i72)) {
                            cf0.B = 2;
                            fg02.e().G((byte) readByte);
                            S = gl0.S(fg02, cf0);
                            if (S != p81) {
                                S = vs7.a;
                            }
                        }
                    }
                    int i8 = this.i + 1;
                    this.i = i8;
                    if (i8 != cg0.w.length) {
                        tc0.G((byte) readByte);
                    }
                    return Boolean.TRUE;
                } else if (i2 == 2) {
                    o85.q(obj);
                    this.h++;
                    return Boolean.FALSE;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (py6.x()) {
                    cf0.B = 1;
                    gf0 gf0 = hf0.a;
                    obj = this.a.d(1, cf0);
                }
                readByte = py6.readByte();
                int i52 = this.i;
                tc0 = this.g;
                cg0 = this.b;
                int i62 = this.i;
                while (true) {
                    i3 = this.i;
                    if (i3 <= 0 || readByte == cg0.a(i3)) {
                    }
                    break;
                    this.i = this.f[this.i - 1];
                }
                long j32 = (long) (i62 - this.i);
                b(j32);
                long j222 = this.h;
                fg0 fg022 = this.c;
                tc0 e222 = fg022.e();
                e222.getClass();
                this.h = tc0.y(e222, j32) + j222;
                int i722 = this.i;
                cf0.B = 2;
                fg022.e().G((byte) readByte);
                S = gl0.S(fg022, cf0);
                if (S != p81) {
                }
            }
        }
        cf0 = new cf0(this, h61);
        Object obj2 = cf0.z;
        i2 = cf0.B;
        p81 = p81.w;
        py6 = this.e;
        if (i2 != 0) {
        }
        if (py6.x()) {
        }
        readByte = py6.readByte();
        int i522 = this.i;
        tc0 = this.g;
        cg0 = this.b;
        int i622 = this.i;
        while (true) {
            i3 = this.i;
            if (i3 <= 0 || readByte == cg0.a(i3)) {
            }
            break;
            this.i = this.f[this.i - 1];
        }
        long j322 = (long) (i622 - this.i);
        b(j322);
        long j2222 = this.h;
        fg0 fg0222 = this.c;
        tc0 e2222 = fg0222.e();
        e2222.getClass();
        this.h = tc0.y(e2222, j322) + j2222;
        int i7222 = this.i;
        cf0.B = 2;
        fg0222.e().G((byte) readByte);
        S = gl0.S(fg0222, cf0);
        if (S != p81) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r11 == r6) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        if (r1.c(r0) == r6) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (a(r0) == r6) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if (r11 == r6) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object d(boolean z, h61 h61) {
        df0 df0;
        int i2;
        if (h61 instanceof df0) {
            df0 = (df0) h61;
            int i3 = df0.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                df0.C = i3 - Integer.MIN_VALUE;
                Object obj = df0.A;
                i2 = df0.C;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    this.h = 0;
                } else if (i2 == 1) {
                    z = df0.z;
                    o85.q(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        if (z) {
                            long j = this.h;
                            tc0 tc0 = this.g;
                            fg0 fg0 = this.c;
                            this.h = tc0.v(fg0.e()) + j;
                            df0.z = z;
                            df0.C = 4;
                        } else {
                            cg0 cg0 = this.b;
                            cg0.getClass();
                            String s0 = k57.s0(k57.k0(cg0.w), "\n", "\\n");
                            throw new IOException("Expected \"" + s0 + "\" but encountered end of input");
                        }
                    }
                    df0.z = z;
                    df0.C = 2;
                } else if (i2 == 2) {
                    z = df0.z;
                    o85.q(obj);
                    df0.z = z;
                    df0.C = 3;
                    obj = c(df0);
                } else if (i2 == 3) {
                    z = df0.z;
                    o85.q(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return new Long(this.h);
                    }
                } else if (i2 == 4) {
                    o85.q(obj);
                    return new Long(this.h);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.e.x()) {
                    df0.z = z;
                    df0.C = 1;
                    gf0 gf0 = hf0.a;
                    obj = this.a.d(1, df0);
                }
                df0.z = z;
                df0.C = 2;
            }
        }
        df0 = new df0(this, h61);
        Object obj2 = df0.A;
        i2 = df0.C;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        if (this.e.x()) {
        }
        df0.z = z;
        df0.C = 2;
    }
}
