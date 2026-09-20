package defpackage;

/* renamed from: a67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a67 {
    public static final int[] a;
    public static final long b = f(1);
    public static final long c = f(8);
    public static final long d = f(2);
    public static final long e = f(4);
    public static final long f = f(32);
    public static final long g = f(16);
    public static final int h = d(1);
    public static final int i = d(8);
    public static final int j = d(2);
    public static final int k = d(4);
    public static final int l = d(32);
    public static final int m = d(16);
    public static final z57 n = new z57();

    static {
        int[] iArr = new int[61];
        a = iArr;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = iArr[54] | 4;
        iArr[55] = iArr[55] | 2;
        iArr[56] = iArr[56] | 2;
        iArr[37] = iArr[37] | 32;
        iArr[57] = iArr[57] | 32;
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x055e, code lost:
        if (r7 < r28) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0581, code lost:
        if (r7 < r28) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0585, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0593, code lost:
        if (((double) r7) < r25) goto L_0x0597;
     */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0596  */
    public static final void a(z57 z57, z57 z572, kg5 kg5, long j2, int i2, z57 z573) {
        long j3;
        float f2;
        float f3;
        int i3;
        double d2;
        mf7 mf7;
        jg7 jg7;
        z57 z574;
        int n2;
        am2 p;
        int o;
        int q;
        int u;
        int s;
        float f4;
        z57 z575;
        long j4;
        z57 z576;
        long j5;
        z57 z577;
        long j6;
        z57 z578;
        rd7 t;
        lt0 c64;
        u90 u90;
        long j7;
        z57 z579;
        Object obj;
        pq6 pq6;
        int i4;
        int i5;
        z57 z5710 = z57;
        z57 z5711 = z572;
        kg5 kg52 = kg5;
        z57 z5712 = z573;
        long i6 = i(j2, i2);
        int h2 = h(j2, i2) & (z5710.b | z5711.b);
        long j8 = i6 & (z5710.a | z5711.a);
        if ((h2 & 135) != 0) {
            if ((h2 & 1) != 0) {
                j8 &= -34359738369L;
            }
            if ((h2 & 128) != 0) {
                j8 &= -137438953473L;
            }
            if ((h2 & 2) != 0) {
                j8 &= -17179869185L;
            }
            if ((h2 & 4) != 0) {
                j8 &= -68719476737L;
            }
        }
        if (j8 != 0 || h2 != 0) {
            if ((c & j8) != 0) {
                if ((j8 & 16) != 0) {
                    float R = kg52.R(4);
                    float f5 = z5710.g;
                    float f6 = z5711.g;
                    boolean isNaN = Float.isNaN(f5);
                    boolean isNaN2 = Float.isNaN(f6);
                    float f7 = (R * f6) + ((1.0f - R) * f5);
                    j3 = 0;
                    if (isNaN) {
                        f5 = f6;
                    } else if (!isNaN2) {
                        f5 = f7;
                    }
                    z5712.a |= 16;
                    z5712.g = f5;
                } else {
                    j3 = 0;
                }
                if ((j8 & 32) != j3) {
                    float R2 = kg52.R(5);
                    float f8 = z5710.h;
                    float f9 = z5711.h;
                    boolean isNaN3 = Float.isNaN(f8);
                    boolean isNaN4 = Float.isNaN(f9);
                    float f10 = (R2 * f9) + ((1.0f - R2) * f8);
                    if (isNaN3) {
                        f8 = f9;
                    } else if (!isNaN4) {
                        f8 = f10;
                    }
                    z5712.a = 32 | z5712.a;
                    z5712.h = f8;
                }
                if ((j8 & 64) != j3) {
                    float R3 = kg52.R(6);
                    float f11 = z5710.i;
                    float f12 = z5711.i;
                    boolean isNaN5 = Float.isNaN(f11);
                    boolean isNaN6 = Float.isNaN(f12);
                    float f13 = (R3 * f12) + ((1.0f - R3) * f11);
                    if (isNaN5) {
                        f11 = f12;
                    } else if (!isNaN6) {
                        f11 = f13;
                    }
                    z5712.a = 64 | z5712.a;
                    z5712.i = f11;
                }
                if ((j8 & 128) != j3) {
                    float R4 = kg52.R(7);
                    float f14 = z5710.j;
                    float f15 = z5711.j;
                    boolean isNaN7 = Float.isNaN(f14);
                    boolean isNaN8 = Float.isNaN(f15);
                    float f16 = (R4 * f15) + ((1.0f - R4) * f14);
                    if (isNaN7) {
                        f14 = f15;
                    } else if (!isNaN8) {
                        f14 = f16;
                    }
                    z5712.a = 128 | z5712.a;
                    z5712.j = f14;
                }
                if ((j8 & 8192) != j3) {
                    float R5 = kg52.R(13);
                    float f17 = z5710.p;
                    float f18 = z5711.p;
                    boolean isNaN9 = Float.isNaN(f17);
                    boolean isNaN10 = Float.isNaN(f18);
                    float f19 = (R5 * f18) + ((1.0f - R5) * f17);
                    if (isNaN9) {
                        f17 = f18;
                    } else if (!isNaN10) {
                        f17 = f19;
                    }
                    z5712.a = 8192 | z5712.a;
                    z5712.p = f17;
                }
                if ((j8 & 16384) != j3) {
                    float R6 = kg52.R(14);
                    float f20 = z5710.q;
                    float f21 = z5711.q;
                    boolean isNaN11 = Float.isNaN(f20);
                    boolean isNaN12 = Float.isNaN(f21);
                    float f22 = (R6 * f21) + ((1.0f - R6) * f20);
                    if (isNaN11) {
                        f20 = f21;
                    } else if (!isNaN12) {
                        f20 = f22;
                    }
                    z5712.a = 16384 | z5712.a;
                    z5712.q = f20;
                }
                if ((j8 & 32768) != j3) {
                    float R7 = kg52.R(15);
                    float f23 = z5710.r;
                    float f24 = z5711.r;
                    boolean isNaN13 = Float.isNaN(f23);
                    boolean isNaN14 = Float.isNaN(f24);
                    float f25 = (R7 * f24) + ((1.0f - R7) * f23);
                    if (isNaN13) {
                        f23 = f24;
                    } else if (!isNaN14) {
                        f23 = f25;
                    }
                    z5712.a = 32768 | z5712.a;
                    z5712.r = f23;
                }
                if ((j8 & 65536) != j3) {
                    float R8 = kg52.R(16);
                    float f26 = z5710.s;
                    float f27 = z5711.s;
                    boolean isNaN15 = Float.isNaN(f26);
                    boolean isNaN16 = Float.isNaN(f27);
                    float f28 = (R8 * f27) + ((1.0f - R8) * f26);
                    if (isNaN15) {
                        f26 = f27;
                    } else if (!isNaN16) {
                        f26 = f28;
                    }
                    z5712.a = 65536 | z5712.a;
                    z5712.s = f26;
                }
                if ((j8 & 512) != j3) {
                    float R9 = kg52.R(9);
                    float f29 = z5710.l;
                    float f30 = z5711.l;
                    boolean isNaN17 = Float.isNaN(f29);
                    boolean isNaN18 = Float.isNaN(f30);
                    float f31 = (R9 * f30) + ((1.0f - R9) * f29);
                    if (isNaN17) {
                        f29 = f30;
                    } else if (!isNaN18) {
                        f29 = f31;
                    }
                    z5712.a = (512 | z5712.a) & -2049;
                    z5712.l = f29;
                    z5712.n = Float.NaN;
                }
                if ((j8 & 1024) != j3) {
                    float R10 = kg52.R(10);
                    float f32 = z5710.m;
                    float f33 = z5711.m;
                    boolean isNaN19 = Float.isNaN(f32);
                    boolean isNaN20 = Float.isNaN(f33);
                    float f34 = (R10 * f33) + ((1.0f - R10) * f32);
                    if (isNaN19) {
                        f32 = f33;
                    } else if (!isNaN20) {
                        f32 = f34;
                    }
                    z5712.a = (1024 | z5712.a) & -4097;
                    z5712.m = f32;
                    z5712.o = Float.NaN;
                }
                if ((j8 & 2048) != j3) {
                    float R11 = kg52.R(11);
                    float f35 = z5710.n;
                    float f36 = z5711.n;
                    boolean isNaN21 = Float.isNaN(f35);
                    boolean isNaN22 = Float.isNaN(f36);
                    float f37 = (R11 * f36) + ((1.0f - R11) * f35);
                    if (isNaN21) {
                        f35 = f36;
                    } else if (!isNaN22) {
                        f35 = f37;
                    }
                    z5712.a = 2048 | (z5712.a & -513);
                    z5712.n = f35;
                    z5712.l = Float.NaN;
                }
                if ((j8 & 4096) != j3) {
                    float R12 = kg52.R(12);
                    float f38 = z5710.o;
                    float f39 = z5711.o;
                    boolean isNaN23 = Float.isNaN(f38);
                    boolean isNaN24 = Float.isNaN(f39);
                    float f40 = (R12 * f39) + ((1.0f - R12) * f38);
                    if (isNaN23) {
                        f38 = f39;
                    } else if (!isNaN24) {
                        f38 = f40;
                    }
                    z5712.a = 4096 | (z5712.a & -1025);
                    z5712.o = f38;
                    z5712.m = Float.NaN;
                }
                if ((j8 & 131072) != j3) {
                    float R13 = kg52.R(17);
                    float f41 = z5710.v;
                    float f42 = z5711.v;
                    boolean isNaN25 = Float.isNaN(f41);
                    boolean isNaN26 = Float.isNaN(f42);
                    float f43 = (R13 * f42) + ((1.0f - R13) * f41);
                    if (isNaN25) {
                        f41 = f42;
                    } else if (!isNaN26) {
                        f41 = f43;
                    }
                    z5712.a = 131072 | z5712.a;
                    z5712.v = f41;
                }
                if ((j8 & 524288) != j3) {
                    float R14 = kg52.R(19);
                    float f44 = z5710.w;
                    float f45 = z5711.w;
                    boolean isNaN27 = Float.isNaN(f44);
                    boolean isNaN28 = Float.isNaN(f45);
                    float f46 = (R14 * f45) + ((1.0f - R14) * f44);
                    if (isNaN27) {
                        f44 = f45;
                    } else if (!isNaN28) {
                        f44 = f46;
                    }
                    z5712.a = 524288 | z5712.a;
                    z5712.w = f44;
                }
                if ((j8 & 262144) != j3) {
                    float R15 = kg52.R(18);
                    float f47 = z5710.t;
                    float f48 = z5711.t;
                    boolean isNaN29 = Float.isNaN(f47);
                    boolean isNaN30 = Float.isNaN(f48);
                    float f49 = (R15 * f48) + ((1.0f - R15) * f47);
                    if (isNaN29) {
                        f47 = f48;
                    } else if (!isNaN30) {
                        f47 = f49;
                    }
                    z5712.a = 262144 | z5712.a;
                    z5712.t = f47;
                }
                if ((j8 & 1048576) != j3) {
                    float R16 = kg52.R(20);
                    float f50 = z5710.u;
                    float f51 = z5711.u;
                    boolean isNaN31 = Float.isNaN(f50);
                    boolean isNaN32 = Float.isNaN(f51);
                    float f52 = (R16 * f51) + ((1.0f - R16) * f50);
                    if (isNaN31) {
                        f50 = f51;
                    } else if (!isNaN32) {
                        f50 = f52;
                    }
                    z5712.a = 1048576 | z5712.a;
                    z5712.u = f50;
                }
            } else {
                j3 = 0;
            }
            if ((b & j8) != j3) {
                if ((j8 & 1) != j3) {
                    float E = we.E(z5710.c, z5711.c, kg52.R(0));
                    z5712.a = 1 | z5712.a;
                    z5712.c = E;
                }
                if ((j8 & 2) != j3) {
                    float E2 = we.E(z5710.d, z5711.d, kg52.R(1));
                    z5712.a = 2 | z5712.a;
                    z5712.d = E2;
                }
                if ((j8 & 4) != j3) {
                    float E3 = we.E(z5710.e, z5711.e, kg52.R(2));
                    z5712.a = 4 | z5712.a;
                    z5712.e = E3;
                }
                if ((j8 & 8) != j3) {
                    float E4 = we.E(z5710.f, z5711.f, kg52.R(3));
                    z5712.a = 8 | z5712.a;
                    z5712.f = E4;
                }
            }
            if ((d & j8) != j3) {
                if ((j8 & 256) != j3) {
                    f2 = 1.0f;
                    float E5 = we.E(z5710.k, z5711.k, kg52.R(8));
                    z5712.a |= 256;
                    z5712.k = E5;
                } else {
                    f2 = 1.0f;
                }
                if ((34359738368L & j8) != j3) {
                    z5712.d(uq3.F(z5710.x, z5711.x, kg52.R(50)));
                }
                if ((17179869184L & j8) != j3) {
                    z5712.b(uq3.F(z5710.z, z5711.z, kg52.R(51)));
                }
                if ((j8 & 68719476736L) != j3) {
                    long F = uq3.F(z5710.B, z5711.B, kg52.R(52));
                    z5712.a |= 68719476736L;
                    z5712.b &= -5;
                    z5712.B = F;
                    z5712.C = null;
                }
            } else {
                f2 = 1.0f;
            }
            if ((j & h2) != 0) {
                if ((h2 & 1) != 0) {
                    float R17 = kg52.R(50);
                    d2 = 0.5d;
                    i3 = 32;
                    f3 = 0.5f;
                    z5712.c(b(z5710.y, z5710.x, z5711.y, z5711.x, R17));
                } else {
                    d2 = 0.5d;
                    i3 = 32;
                    f3 = 0.5f;
                }
                if ((h2 & 2) != 0) {
                    z5712.a(b(z5710.A, z5710.z, z5711.A, z5711.z, kg52.R(51)));
                }
                if ((h2 & 4) != 0) {
                    z5712.m(b(z5710.C, z5710.B, z5711.C, z5711.B, kg52.R(52)));
                }
                if ((h2 & 64) != 0) {
                    Object c2 = c(z5710.G, z5711.G, kg52.R(56));
                    int i7 = z5712.b;
                    if (c2 != null) {
                        i5 = i7 | 64;
                    } else {
                        i5 = i7 & -65;
                    }
                    z5712.b = i5;
                    z5712.G = c2;
                }
                if ((h2 & 32) != 0) {
                    Object c3 = c(z5710.F, z5711.F, kg52.R(55));
                    int i8 = z5712.b;
                    if (c3 != null) {
                        i4 = i8 | 32;
                    } else {
                        i4 = i8 & -33;
                    }
                    z5712.b = i4;
                    z5712.F = c3;
                }
                if ((h2 & 8) != 0) {
                    float R18 = kg52.R(53);
                    pq6 pq62 = z5710.E;
                    Object obj2 = z5711.E;
                    if (R18 != 0.0f) {
                        if (R18 != f2) {
                            if (!sg3.e(pq62, obj2)) {
                                if (pq62 instanceof dg3) {
                                    obj = ((dg3) pq62).b(obj2, R18);
                                } else {
                                    obj = null;
                                }
                                if (obj == null && (obj2 instanceof dg3)) {
                                    obj = ((dg3) obj2).b(pq62, f2 - R18);
                                }
                                if (obj == null) {
                                }
                                if (!(obj instanceof pq6)) {
                                    pq6 = (pq6) obj;
                                } else {
                                    pq6 = null;
                                }
                                if (pq6 == null) {
                                    pq62 = pq6;
                                }
                            }
                            obj = pq62;
                            if (!(obj instanceof pq6)) {
                            }
                            if (pq6 == null) {
                            }
                        }
                        pq62 = obj2;
                    }
                    z5712.b |= 8;
                    z5712.E = pq62;
                }
            } else {
                d2 = 0.5d;
                i3 = 32;
                f3 = 0.5f;
            }
            if ((e & j8) != j3) {
                if ((j8 & 2097152) != j3) {
                    float E6 = we.E(z5710.H, z5711.H, kg52.R(21));
                    z5712.a = 2097152 | z5712.a;
                    z5712.H = E6;
                }
                if ((j8 & 4194304) != j3) {
                    float E7 = we.E(z5710.I, z5711.I, kg52.R(22));
                    z5712.a = 4194304 | z5712.a;
                    z5712.I = E7;
                }
                if ((j8 & 8388608) != j3) {
                    float E8 = we.E(z5710.J, z5711.J, kg52.R(23));
                    z5712.a = 8388608 | z5712.a;
                    z5712.J = E8;
                }
                if ((j8 & 16777216) != j3) {
                    float E9 = we.E(z5710.K, z5711.K, kg52.R(24));
                    z5712.a |= 16777216;
                    z5712.K = E9;
                }
                if ((j8 & 33554432) != j3) {
                    float E10 = we.E(z5710.L, z5711.L, kg52.R(25));
                    z5712.a |= 33554432;
                    z5712.L = E10;
                }
                if ((j8 & 67108864) != j3) {
                    j7 = 16777216;
                    float E11 = we.E(z5710.M, z5711.M, kg52.R(26));
                    z5712.a |= 67108864;
                    z5712.M = E11;
                } else {
                    j7 = 16777216;
                }
                if ((j8 & 134217728) != j3) {
                    float E12 = we.E(z5710.N, z5711.N, kg52.R(27));
                    z5712.a = 134217728 | z5712.a;
                    z5712.N = E12;
                }
                if ((j8 & 268435456) != j3) {
                    float E13 = we.E(z5710.O, z5711.O, kg52.R(28));
                    z5712.a = 268435456 | z5712.a;
                    z5712.O = E13;
                }
                if ((536870912 & j8) != j3) {
                    float E14 = we.E(z5710.P, z5711.P, kg52.R(29));
                    z5712.a |= j7;
                    z5712.K = E14;
                }
                if ((1073741824 & j8) != j3) {
                    float E15 = we.E(z5710.Q, z5711.Q, kg52.R(30));
                    z5712.a |= 33554432;
                    z5712.L = E15;
                }
                if ((4294967296L & j8) != j3) {
                    float E16 = we.E(z5710.S, z5711.S, kg52.R(i3));
                    z5712.a |= 4294967296L;
                    z5712.S = E16;
                }
                if ((2147483648L & j8) != j3) {
                    if (kg52.R(31) < f3) {
                        z579 = z5710;
                    } else {
                        z579 = z5711;
                    }
                    boolean z = z579.D;
                    z5712.a |= 2147483648L;
                    z5712.D = z;
                }
            }
            if (!((k & h2) == 0 || (h2 & 16) == 0)) {
                float R19 = kg52.R(54);
                lt0 lt0 = z5710.T;
                lt0 lt02 = z5711.T;
                if ((lt0 instanceof u90) && (lt02 instanceof u90)) {
                    u90 u902 = (u90) lt0;
                    u90 u903 = (u90) lt02;
                    if (R19 <= f3) {
                        u90 = u902;
                    } else {
                        u90 = u903;
                    }
                    c64 = new u90(uq3.F(u902.b, u903.b, R19), u90.c);
                } else if (!(lt0 instanceof c64) || !(lt02 instanceof c64)) {
                    if (R19 > f3) {
                        lt0 = lt02;
                    }
                    z5712.b |= 16;
                    z5712.T = lt0;
                } else {
                    c64 c642 = (c64) lt0;
                    c64 c643 = (c64) lt02;
                    c64 = new c64(uq3.F(c642.b, c643.b, R19), uq3.F(c642.c, c643.c, R19));
                }
                lt0 = c64;
                z5712.b |= 16;
                z5712.T = lt0;
            }
            if ((137438953472L & j8) != j3) {
                long F2 = uq3.F(z5710.U, z5711.U, kg52.R(57));
                z5712.a |= 137438953472L;
                z5712.b &= -129;
                z5712.U = F2;
                z5712.V = null;
            }
            if ((h2 & 128) != 0) {
                z5712.e(b(z5710.V, z5710.U, z5711.V, z5711.U, kg52.R(57)));
            }
            if ((g & j8) != j3) {
                if ((j8 & 274877906944L) != j3) {
                    if ((z5710.a & 274877906944L) == j3 || ((274877906944L & z5711.a) != j3 && ((double) kg52.R(38)) >= d2)) {
                        t = z5711.t();
                    } else {
                        t = z5710.t();
                    }
                    z5712.z(t);
                }
                if ((j8 & 70368744177664L) != j3) {
                    if ((z5710.a & 70368744177664L) == j3) {
                        j6 = z5711.Y;
                    } else if ((z5711.a & 70368744177664L) != j3) {
                        if (((double) kg52.R(46)) < d2) {
                            z578 = z5710;
                        } else {
                            z578 = z5711;
                        }
                        j6 = z578.Y;
                    } else {
                        j6 = z5710.Y;
                    }
                    z5712.a = 70368744177664L | z5712.a;
                    z5712.Y = j6;
                }
                if ((j8 & 140737488355328L) != j3) {
                    if ((z5710.a & 140737488355328L) == j3) {
                        j5 = z5711.Z;
                    } else if ((z5711.a & 140737488355328L) != j3) {
                        if (((double) kg52.R(47)) < d2) {
                            z577 = z5710;
                        } else {
                            z577 = z5711;
                        }
                        j5 = z577.Z;
                    } else {
                        j5 = z5710.Z;
                    }
                    z5712.a = 140737488355328L | z5712.a;
                    z5712.Z = j5;
                }
                if ((j8 & 281474976710656L) != j3) {
                    if ((z5710.a & 281474976710656L) == j3) {
                        j4 = z5711.a0;
                    } else if ((z5711.a & 281474976710656L) != j3) {
                        if (((double) kg52.R(48)) < d2) {
                            z576 = z5710;
                        } else {
                            z576 = z5711;
                        }
                        j4 = z576.a0;
                    } else {
                        j4 = z5710.a0;
                    }
                    z5712.a = 281474976710656L | z5712.a;
                    z5712.a0 = j4;
                }
                if ((j8 & 8796093022208L) != j3) {
                    if ((z5710.a & 8796093022208L) == j3) {
                        f4 = z5711.b0;
                    } else if ((z5711.a & 8796093022208L) != j3) {
                        if (((double) kg52.R(43)) < d2) {
                            z575 = z5710;
                        } else {
                            z575 = z5711;
                        }
                        f4 = z575.b0;
                    } else {
                        f4 = z5710.b0;
                    }
                    z5712.a = 8796093022208L | z5712.a;
                    z5712.b0 = f4;
                }
                if ((j8 & 562949953421312L) != j3) {
                    if (!((z5710.a & 562949953421312L) == j3 || (z5711.a & 562949953421312L) == j3)) {
                        kg52.R(49);
                    }
                    z5712.a = 562949953421312L | z5712.a;
                }
                if ((j8 & 2199023255552L) != j3) {
                    if ((z5710.a & 2199023255552L) == j3 || ((2199023255552L & z5711.a) != j3 && ((double) kg52.R(41)) >= d2)) {
                        s = z5711.s();
                    } else {
                        s = z5710.s();
                    }
                    z5712.y(s);
                }
                if ((j8 & 4398046511104L) != j3) {
                    if ((z5710.a & 4398046511104L) == j3 || ((4398046511104L & z5711.a) != j3 && ((double) kg52.R(42)) >= d2)) {
                        u = z5711.u();
                    } else {
                        u = z5710.u();
                    }
                    z5712.A(u);
                }
                if ((j8 & 17592186044416L) != j3) {
                    if ((z5710.a & 17592186044416L) == j3 || ((17592186044416L & z5711.a) != j3 && ((double) kg52.R(44)) >= d2)) {
                        q = z5711.q();
                    } else {
                        q = z5710.q();
                    }
                    z5712.x(q);
                }
                if ((j8 & 35184372088832L) != j3) {
                    if ((z5710.a & 35184372088832L) == j3 || ((35184372088832L & z5711.a) != j3 && ((double) kg52.R(45)) >= d2)) {
                        o = z5711.o();
                    } else {
                        o = z5710.o();
                    }
                    z5712.k(o);
                }
                if ((j8 & 549755813888L) != j3) {
                    if ((z5710.a & 549755813888L) == j3 || ((549755813888L & z5711.a) != j3 && ((double) kg52.R(39)) >= d2)) {
                        p = z5711.p();
                    } else {
                        p = z5710.p();
                    }
                    z5712.l(p);
                }
                if ((j8 & 1099511627776L) != j3) {
                    if ((z5710.a & 1099511627776L) == j3 || ((z5711.a & 1099511627776L) != j3 && ((double) kg52.R(40)) >= d2)) {
                        n2 = z5711.n();
                    } else {
                        n2 = z5710.n();
                    }
                    z5712.j(n2);
                }
            }
            if ((m & h2) != 0) {
                if ((h2 & 256) != 0) {
                    if (!((z5710.b & 256) == 0 || (z5711.b & 256) == 0)) {
                        kg52.R(58);
                    }
                    z5712.b |= 256;
                }
                if ((h2 & 512) != 0) {
                    if ((z5710.b & 512) == 0) {
                        jg7 = z5711.W;
                    } else if ((z5711.b & 512) != 0) {
                        if (((double) kg52.R(59)) < d2) {
                            z574 = z5710;
                        } else {
                            z574 = z5711;
                        }
                        jg7 = z574.W;
                    } else {
                        jg7 = z5710.W;
                    }
                    z5712.b |= 512;
                    z5712.W = jg7;
                }
                if ((h2 & 1024) != 0) {
                    if ((z5710.b & 1024) == 0) {
                        mf7 = z5711.X;
                    } else if ((z5711.b & 1024) == 0) {
                        mf7 = z5710.X;
                    } else if (((double) kg52.R(60)) < d2) {
                        mf7 = z5710.X;
                    } else {
                        mf7 = z5711.X;
                    }
                    mf7.getClass();
                    z5712.b |= 1024;
                    z5712.X = mf7;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r7 < 0.5f) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r7 < 0.5f) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[RETURN] */
    public static final kc0 b(kc0 kc0, long j2, kc0 kc02, long j3, float f2) {
        Object obj;
        kc0 kc03 = null;
        if (kc0 == null && kc02 == null) {
            return null;
        }
        if (kc0 == null) {
            kc0 = new ky6(j2);
        } else if (kc02 == null) {
            kc02 = new ky6(j3);
        }
        if (!kc0.equals(kc02)) {
            if (kc0 instanceof dg3) {
                obj = ((dg3) kc0).b(kc02, f2);
            } else {
                obj = null;
            }
            if (obj == null && (kc02 instanceof dg3)) {
                obj = ((dg3) kc02).b(kc0, 1.0f - f2);
            }
            if (obj == null) {
            }
            if (obj instanceof kc0) {
                kc03 = (kc0) obj;
            }
            if (kc03 == null) {
                return kc03;
            }
            if (((double) f2) < 0.5d) {
                return kc0;
            }
            return kc02;
        }
        obj = kc0;
        if (obj instanceof kc0) {
        }
        if (kc03 == null) {
        }
    }

    public static final Object c(Object obj, Object obj2, float f2) {
        kq6[] kq6Arr;
        kq6[] kq6Arr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return null;
        }
        if (z) {
            kq6Arr = (kq6[]) obj;
        } else {
            obj.getClass();
            kq6Arr = new kq6[]{obj};
        }
        if (z2) {
            kq6Arr2 = (kq6[]) obj2;
        } else {
            obj2.getClass();
            kq6Arr2 = new kq6[]{obj2};
        }
        int max = Math.max(kq6Arr.length, kq6Arr2.length);
        kq6[] kq6Arr3 = new kq6[max];
        for (int i2 = 0; i2 < max; i2++) {
            kq6Arr3[i2] = null;
        }
        for (int i3 = 0; i3 < max; i3++) {
            kq6 kq6 = (kq6) qs.b1(i3, kq6Arr);
            kq6 kq62 = (kq6) qs.b1(i3, kq6Arr2);
            kq6Arr3[i3] = null;
        }
        return kq6Arr3;
    }

    public static final int d(int i2) {
        int i3 = 0;
        for (int i4 = 50; i4 < 61; i4++) {
            if ((a[i4] & i2) != 0) {
                i3 |= 1 << (i4 - 50);
            }
        }
        return i3;
    }

    public static final int e(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if ((h & i2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i & i2) != 0) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i9 = i3 | i4;
        if ((j & i2) != 0) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        int i10 = i9 | i5;
        if ((k & i2) != 0) {
            i6 = 4;
        } else {
            i6 = 0;
        }
        int i11 = i10 | i6;
        if ((l & i2) != 0) {
            i7 = 32;
        } else {
            i7 = 0;
        }
        int i12 = i11 | i7;
        if ((i2 & m) != 0) {
            i8 = 16;
        }
        return i12 | i8;
    }

    public static final long f(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            if ((a[i3] & i2) != 0) {
                j2 |= 1 << ((byte) i3);
            }
        }
        return j2;
    }

    public static final int g(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if ((b & j2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((c & j2) != 0) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        int i8 = i2 | i3;
        if ((d & j2) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        int i9 = i8 | i4;
        if ((e & j2) != 0) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        int i10 = i9 | i5;
        if ((f & j2) != 0) {
            i6 = 32;
        } else {
            i6 = 0;
        }
        int i11 = i10 | i6;
        if ((j2 & g) != 0) {
            i7 = 16;
        }
        return i11 | i7;
    }

    public static final int h(long j2, int i2) {
        if ((257698037760L & j2) != 0) {
            if ((34359738368L & j2) != 0) {
                i2 |= 1;
            }
            if ((137438953472L & j2) != 0) {
                i2 |= 128;
            }
            if ((17179869184L & j2) != 0) {
                i2 |= 2;
            }
            if ((j2 & 68719476736L) != 0) {
                return i2 | 4;
            }
        }
        return i2;
    }

    public static final long i(long j2, int i2) {
        if ((i2 & 135) == 0) {
            return j2;
        }
        if ((i2 & 1) != 0) {
            j2 |= 34359738368L;
        }
        if ((i2 & 128) != 0) {
            j2 |= 137438953472L;
        }
        if ((i2 & 2) != 0) {
            j2 |= 17179869184L;
        }
        if ((i2 & 4) != 0) {
            return j2 | 68719476736L;
        }
        return j2;
    }
}
