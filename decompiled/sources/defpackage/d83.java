package defpackage;

/* renamed from: d83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d83 {
    public static final ml4 a = yu6.l(jl4.w, x91.m);

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0075, code lost:
        if ((r16 & 8) != 0) goto L_0x0077;
     */
    public static final void a(x83 x83, String str, ml4 ml4, long j, yt2 yt2, int i, int i2) {
        int i3;
        boolean z;
        long j2;
        ml4 ml42;
        int i4;
        int i5;
        int i6;
        int i7;
        yt2.g0(-126890956);
        if ((i & 6) == 0) {
            if (yt2.g(x83)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.g(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (yt2.g(ml4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) != 0 || !yt2.f(j)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                if (i8 != 0) {
                    ml4 = jl4.w;
                }
                if ((i2 & 8) != 0) {
                    j = ((jt0) yt2.k(j41.a)).a;
                }
                ml4 ml43 = ml4;
                long j3 = j;
                yt2.s();
                k38 q = o55.q(x83, yt2);
                b(q, str, ml43, j3, yt2, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                j2 = j3;
                ml42 = ml43;
            } else {
                yt2.Y();
            }
            i3 &= -7169;
            ml4 ml432 = ml4;
            long j32 = j;
            yt2.s();
            k38 q2 = o55.q(x83, yt2);
            b(q2, str, ml432, j32, yt2, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            j2 = j32;
            ml42 = ml432;
        } else {
            yt2.Y();
            ml42 = ml4;
            j2 = j;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new c83(x83, str, ml42, j2, i, i2, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
        if ((r25 & 8) != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014e, code lost:
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r2 & 4294967295L))) != false) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void b(vb5 vb5, String str, ml4 ml4, long j, yt2 yt2, int i, int i2) {
        int i3;
        ml4 ml42;
        long j2;
        boolean z;
        long j3;
        ml4 ml43;
        yx5 v;
        long j4;
        boolean z2;
        Object Q;
        ml4 ml44;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        vb5 vb52 = vb5;
        String str2 = str;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(-2142239481);
        if ((i8 & 6) == 0) {
            if ((i8 & 8) == 0) {
                z4 = yt22.g(vb52);
            } else {
                z4 = yt22.i(vb52);
            }
            if (z4) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 48) == 0) {
            if (yt22.g(str2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i8 & 384) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
            if ((i8 & 3072) != 0) {
                j2 = j;
                if ((i2 & 8) != 0 || !yt22.f(j2)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i3 & 1, z)) {
                yt22.a0();
                int i10 = i8 & 1;
                ml4 ml45 = jl4.w;
                if (i10 == 0 || yt22.C()) {
                    if (i9 != 0) {
                        ml42 = ml45;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((jt0) yt22.k(j41.a)).a;
                    }
                    long j5 = j2;
                    ml4 ml46 = ml42;
                    j4 = j5;
                    yt22.s();
                    if ((((i3 & 7168) ^ 3072) <= 2048 || !yt22.f(j4)) && (i3 & 3072) != 2048) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    Q = yt22.Q();
                    d63 d63 = ay0.a;
                    if (z2 || Q == d63) {
                        if (!jt0.c(j4, jt0.g)) {
                            Q = null;
                        } else {
                            Q = new u90(j4, 5);
                        }
                        yt22.o0(Q);
                    }
                    lt0 lt0 = (lt0) Q;
                    if (str2 == null) {
                        yt22.e0(-537002883);
                        if ((i3 & 112) == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Object Q2 = yt22.Q();
                        if (z3 || Q2 == d63) {
                            Q2 = new cb(str2, 15);
                            yt22.o0(Q2);
                        }
                        ml4 a2 = ck6.a(ml45, false, (vr2) Q2);
                        yt22.r(false);
                        ml44 = a2;
                    } else {
                        yt22.e0(-536844101);
                        yt22.r(false);
                        ml44 = ml45;
                    }
                    long j6 = j4;
                    if (!wu6.a(vb52.i(), 9205357640488583168L)) {
                        long i11 = vb52.i();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (i11 >> 32)))) {
                        }
                        mb0.a(ed1.w(ml46.d(ml45), vb52, (jb) null, i51.b, 0.0f, lt0, 22).d(ml44), yt22, 0);
                        ml43 = ml46;
                        j3 = j6;
                    }
                    ml45 = a;
                    mb0.a(ed1.w(ml46.d(ml45), vb52, (jb) null, i51.b, 0.0f, lt0, 22).d(ml44), yt22, 0);
                    ml43 = ml46;
                    j3 = j6;
                } else {
                    yt22.Y();
                }
                i3 &= -7169;
                long j52 = j2;
                ml4 ml462 = ml42;
                j4 = j52;
                yt22.s();
                if ((((i3 & 7168) ^ 3072) <= 2048 || !yt22.f(j4)) && (i3 & 3072) != 2048) {
                }
                Q = yt22.Q();
                d63 d632 = ay0.a;
                if (!jt0.c(j4, jt0.g)) {
                }
                yt22.o0(Q);
                lt0 lt02 = (lt0) Q;
                if (str2 == null) {
                }
                long j62 = j4;
                if (!wu6.a(vb52.i(), 9205357640488583168L)) {
                }
                ml45 = a;
                mb0.a(ed1.w(ml462.d(ml45), vb52, (jb) null, i51.b, 0.0f, lt02, 22).d(ml44), yt22, 0);
                ml43 = ml462;
                j3 = j62;
            } else {
                yt22.Y();
                ml43 = ml42;
                j3 = j2;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new c83(vb5, str2, ml43, j3, i8, i2, 1);
                return;
            }
            return;
        }
        ml42 = ml4;
        if ((i8 & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (!yt22.V(i3 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }
}
