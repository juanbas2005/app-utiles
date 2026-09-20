package defpackage;

/* renamed from: ny5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ny5 {
    public final me3 a;
    public final je b;
    public final ig c;
    public final qh7 d = new qh7();
    public final lp4 e = new lp4();
    public boolean f;
    public boolean g;
    public boolean h;
    public vd i;
    public long j = -1;
    public final kh k = new kh(14, this);
    public final sp4 l = new sp4();

    public ny5(yo4 yo4, je jeVar) {
        this.a = yo4;
        this.b = jeVar;
        ig igVar = new ig(9, (byte) 0);
        igVar.c = new long[192];
        igVar.d = new long[192];
        this.c = igVar;
    }

    public static boolean c(xz4 xz4) {
        o95 o95 = xz4.l0;
        if (o95 == null || x91.D(((fx2) o95).b())) {
            return false;
        }
        return true;
    }

    public static boolean d(uy3 uy3) {
        if (uy3.C != -4) {
            return true;
        }
        return false;
    }

    public static long g(uy3 uy3) {
        o00 o00 = uy3.a0;
        xz4 xz4 = (xz4) o00.e;
        xz4 xz42 = (hc3) o00.d;
        long j2 = 0;
        while (xz42 != null && xz42 != xz4) {
            if (c(xz42)) {
                return 9223372034707292159L;
            }
            j2 = oe3.c(j2, xz42.Z);
            xz42 = xz42.Q;
        }
        return j2;
    }

    public static void j(uy3 uy3) {
        if (uy3.y && !c((xz4) uy3.a0.e)) {
            uy3.y = false;
            if (uy3.A) {
                uy3.z = g(uy3);
                uy3.A = false;
            }
            if (!oe3.a(uy3.z, 9223372034707292159L)) {
                eq4 z = uy3.z();
                Object[] objArr = z.w;
                int i2 = z.y;
                for (int i3 = 0; i3 < i2; i3++) {
                    j((uy3) objArr[i3]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0206  */
    public final void a() {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        long j4;
        ig igVar;
        long j5;
        qh7 qh7;
        long j6;
        long j7;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j8;
        long j9;
        vd vdVar = this.i;
        if (vdVar != null) {
            this.b.removeCallbacks(vdVar);
            this.i = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z7 = this.f;
        if (z7 || this.g) {
            z = true;
        } else {
            z = false;
        }
        long j10 = 0;
        ig igVar2 = this.c;
        boolean z8 = true;
        qh7 qh72 = this.d;
        if (z7) {
            this.f = false;
            lp4 lp4 = this.e;
            Object[] objArr = lp4.a;
            int i4 = lp4.b;
            for (int i5 = 0; i5 < i4; i5++) {
                ((sr2) objArr[i5]).b();
            }
            long[] jArr = (long[]) igVar2.c;
            int i6 = igVar2.b;
            int i7 = 0;
            while (i7 < jArr.length - 2 && i7 < i6) {
                boolean z9 = z8;
                int i8 = i6;
                long j11 = jArr[i7 + 2];
                boolean z10 = z9;
                boolean z11 = z;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr[i7];
                    long j13 = jArr[i7 + 1];
                    ph7 ph7 = (ph7) qh72.a.b(((int) j11) & 33554431);
                    while (ph7 != null) {
                        ph7 ph72 = ph7.f;
                        int i9 = i7;
                        long j14 = ph7.i;
                        long j15 = ph7.b;
                        long j16 = ph7.c;
                        if (currentTimeMillis - j14 >= j15 || j14 == Long.MIN_VALUE) {
                            z3 = z10;
                        } else {
                            z3 = false;
                        }
                        if (j16 == j10) {
                            z4 = z10;
                        } else {
                            z4 = false;
                        }
                        if (j15 == j10) {
                            z5 = z10;
                        } else {
                            z5 = false;
                        }
                        ph7.g = j12;
                        ph7.h = j13;
                        if ((z4 || z5) && !z4) {
                            z6 = false;
                        } else {
                            z6 = z10;
                        }
                        if (!z3 || !z6) {
                            j9 = j13;
                            j8 = j10;
                            if (!z4) {
                                ph7.j = currentTimeMillis;
                                long j17 = qh72.c;
                                long j18 = j16 + currentTimeMillis;
                                if (j17 > j8 && j18 < j17) {
                                    qh72.c = j17;
                                }
                            }
                        } else {
                            j9 = j13;
                            ph7.j = -1;
                            ph7.i = currentTimeMillis;
                            j8 = j10;
                            ph7.a(j12, j9, qh72.d, qh72.e, qh72.g);
                        }
                        i7 = i9;
                        ph7 = ph72;
                        j13 = j9;
                        j10 = j8;
                    }
                }
                i7 += 3;
                i6 = i8;
                z = z11;
                z8 = z10;
                j10 = j10;
            }
            z2 = z;
            j2 = j10;
            long[] jArr2 = (long[]) igVar2.c;
            int i10 = igVar2.b;
            int i11 = 0;
            while (i11 < jArr2.length - 2 && i11 < i10) {
                int i12 = i11 + 2;
                jArr2[i12] = jArr2[i12] & -1152921504606846977L;
                i11 += 3;
            }
        } else {
            z2 = z;
            j2 = 0;
        }
        if (this.g) {
            this.g = false;
            long j19 = qh72.d;
            long j20 = qh72.e;
            j5 = currentTimeMillis;
            float[] fArr = qh72.g;
            yo4 yo4 = qh72.a;
            j4 = 128;
            Object[] objArr2 = yo4.c;
            long[] jArr3 = yo4.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                Object[] objArr3 = objArr2;
                int i13 = 0;
                j3 = 255;
                while (true) {
                    long j21 = jArr3[i13];
                    long[] jArr4 = jArr3;
                    qh7 qh73 = qh72;
                    if ((((~j21) << 7) & j21 & -9187201950435737472L) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        long j22 = j21;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j22 & 255) < 128) {
                                ph7 ph73 = (ph7) objArr3[(i13 << 3) + i15];
                                while (ph73 != null) {
                                    ig igVar3 = igVar2;
                                    ph7 ph74 = ph73;
                                    qh73.b(ph74, j19, j20, fArr, j5);
                                    ph73 = ph74.f;
                                    igVar2 = igVar3;
                                }
                            }
                            j22 >>= 8;
                            i15++;
                            qh73 = qh73;
                            igVar2 = igVar2;
                        }
                        igVar = igVar2;
                        qh72 = qh73;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        igVar = igVar2;
                        qh72 = qh73;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    igVar2 = igVar;
                    jArr3 = jArr4;
                }
                if (z2) {
                    long j23 = qh72.d;
                    long j24 = qh72.e;
                    float[] fArr2 = qh72.g;
                    ph7 ph75 = qh72.b;
                    if (ph75 != null) {
                        ph7 ph76 = ph75;
                        while (ph76 != null) {
                            uy3 O0 = rc9.O0(ph76.d);
                            long b2 = ((je) xy3.a(O0)).getRectManager().b(O0);
                            ph76.g = b2;
                            kh4 kh4 = O0.b0.p;
                            ph76.h = (((long) (kh4.w + ((int) (b2 >> 32)))) << 32) | (((long) (kh4.x + ((int) (b2 & 4294967295L)))) & 4294967295L);
                            qh72.b(ph76, j23, j24, fArr2, j5);
                            qh7 qh74 = qh72;
                            ph76 = ph76.f;
                            igVar = igVar;
                        }
                    }
                }
                qh7 = qh72;
                ig igVar4 = igVar;
                if (this.h) {
                    this.h = false;
                    ig igVar5 = igVar4;
                    long[] jArr5 = (long[]) igVar5.c;
                    int i16 = igVar5.b;
                    long[] jArr6 = (long[]) igVar5.d;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < jArr5.length - 2 && i18 < jArr6.length - 2 && i17 < i16) {
                        int i19 = i17 + 2;
                        if (jArr5[i19] != my5.a) {
                            jArr6[i18] = jArr5[i17];
                            jArr6[i18 + 1] = jArr5[i17 + 1];
                            jArr6[i18 + 2] = jArr5[i19];
                            i18 += 3;
                        }
                        i17 += 3;
                    }
                    igVar5.b = i18;
                    igVar5.c = jArr6;
                    igVar5.d = jArr5;
                }
                if (qh7.c <= j5) {
                    long j25 = qh7.d;
                    long j26 = qh7.e;
                    float[] fArr3 = qh7.g;
                    yo4 yo42 = qh7.a;
                    Object[] objArr4 = yo42.c;
                    long[] jArr7 = yo42.a;
                    int length2 = jArr7.length - 2;
                    if (length2 >= 0) {
                        int i20 = 0;
                        Object[] objArr5 = objArr4;
                        long j27 = Long.MAX_VALUE;
                        while (true) {
                            long j28 = jArr7[i20];
                            long j29 = j25;
                            int i21 = length2;
                            if ((((~j28) << 7) & j28 & -9187201950435737472L) != -9187201950435737472L) {
                                int i22 = 8;
                                int i23 = 8 - ((~(i20 - i21)) >>> 31);
                                j6 = j27;
                                long j30 = j28;
                                int i24 = 0;
                                while (i24 < i23) {
                                    if ((j30 & j3) < j4) {
                                        ph7 ph77 = (ph7) objArr5[(i20 << 3) + i24];
                                        while (ph77 != null) {
                                            int i25 = i23;
                                            ph7 ph78 = ph77;
                                            long j31 = j29;
                                            int i26 = i24;
                                            int i27 = i22;
                                            int i28 = i20;
                                            long j32 = j5;
                                            j6 = qh7.a(ph78, j31, j26, fArr3, j32, j6);
                                            j5 = j32;
                                            i20 = i28;
                                            i22 = i27;
                                            i24 = i26;
                                            j29 = j31;
                                            i21 = i21;
                                            ph77 = ph78.f;
                                            i23 = i25;
                                        }
                                    }
                                    int i29 = i23;
                                    long j33 = j29;
                                    int i30 = i24;
                                    int i31 = i22;
                                    j30 >>= i31;
                                    int i32 = i30 + 1;
                                    j29 = j33;
                                    i21 = i21;
                                    i20 = i20;
                                    i22 = i31;
                                    i24 = i32;
                                    i23 = i29;
                                }
                                i3 = i21;
                                int i33 = i22;
                                j25 = j29;
                                i2 = i20;
                                if (i23 != i33) {
                                    break;
                                }
                                j27 = j6;
                            } else {
                                i3 = i21;
                                i2 = i20;
                                j25 = j29;
                            }
                            if (i2 == i3) {
                                j6 = j27;
                                break;
                            }
                            i20 = i2 + 1;
                            length2 = i3;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    ph7 ph79 = qh7.b;
                    if (ph79 != null) {
                        for (ph7 ph710 = ph79; ph710 != null; ph710 = ph710.f) {
                            long j34 = j5;
                            j6 = qh7.a(ph710, j25, j26, fArr3, j34, j6);
                            j5 = j34;
                        }
                    }
                    if (j6 == Long.MAX_VALUE) {
                        j7 = -1;
                    } else {
                        j7 = j6;
                    }
                    qh7.c = j7;
                }
                if (qh7.c <= j2) {
                    k();
                    return;
                }
                return;
            }
            igVar = igVar2;
        } else {
            igVar = igVar2;
            j5 = currentTimeMillis;
            j4 = 128;
        }
        j3 = 255;
        if (z2) {
        }
        qh7 = qh72;
        ig igVar42 = igVar;
        if (this.h) {
        }
        if (qh7.c <= j5) {
        }
        if (qh7.c <= j2) {
        }
    }

    public final long b(uy3 uy3) {
        if (!d(uy3)) {
            return 9223372034707292159L;
        }
        long j2 = ((long[]) this.c.c)[e(uy3)];
        return (((long) ((int) (j2 >> 32))) << 32) | (((long) ((int) j2)) & 4294967295L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    public final int e(uy3 uy3) {
        int i2 = uy3.C;
        if (i2 != -4) {
            int i3 = uy3.x;
            ig igVar = this.c;
            long[] jArr = (long[]) igVar.c;
            if (i2 < 0 || i2 >= igVar.b - 2 || (((int) jArr[i2 + 2]) & 33554431) != (i3 & 33554431)) {
                int i4 = i3 & 33554431;
                int i5 = igVar.b;
                int i6 = 0;
                while (true) {
                    if (i6 >= i5 - 2) {
                        break;
                    } else if ((((int) jArr[i6 + 2]) & 33554431) == i4) {
                        i2 = i6;
                        break;
                    } else {
                        i6 += 3;
                    }
                }
            }
            if (i2 == -4) {
                yb3.a("LayoutNode " + uy3.x + " not found in RectList");
            }
            uy3.C = i2;
            return i2;
        }
        i2 = -4;
        if (i2 == -4) {
        }
        uy3.C = i2;
        return i2;
    }

    public final void f(uy3 uy3) {
        int i2;
        uy3 uy32 = uy3;
        uy32.y = true;
        o00 o00 = uy32.a0;
        xz4 xz4 = (xz4) o00.e;
        kh4 kh4 = uy32.b0.p;
        int b0 = kh4.b0();
        sp4 sp4 = this.l;
        sp4.b = 0.0f;
        sp4.c = 0.0f;
        sp4.d = (float) b0;
        sp4.e = (float) kh4.Z();
        while (true) {
            if (xz4 == null) {
                break;
            }
            uy3 uy33 = xz4.O;
            if (xz4 == ((xz4) uy33.a0.e) && !uy33.y) {
                long b2 = b(uy33);
                if (!oe3.a(b2, 9223372034707292159L)) {
                    sp4.e((((long) Float.floatToRawIntBits((float) ((int) (b2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((float) ((int) (b2 & 4294967295L)))) & 4294967295L));
                    break;
                }
            }
            o95 o95 = xz4.l0;
            if (o95 != null) {
                float[] b3 = ((fx2) o95).b();
                if (!x91.D(b3)) {
                    eh4.c(b3, sp4);
                }
            }
            long j2 = xz4.Z;
            sp4.e((4294967295L & ((long) Float.floatToRawIntBits((float) ((int) (j2 & 4294967295L))))) | (((long) Float.floatToRawIntBits((float) ((int) (j2 >> 32)))) << 32));
            xz4 = xz4.Q;
        }
        int i3 = (int) sp4.b;
        int i4 = (int) sp4.c;
        int i5 = (int) sp4.d;
        int i6 = (int) sp4.e;
        int i7 = uy32.x;
        int i8 = uy32.C;
        ig igVar = this.c;
        int i9 = -4;
        if (i8 != -4) {
            int e2 = e(uy3);
            long[] jArr = (long[]) igVar.c;
            jArr[e2] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
            jArr[e2 + 1] = (4294967295L & ((long) i6)) | (((long) i5) << 32);
            int i10 = e2 + 2;
            long j3 = jArr[i10];
            jArr[i10] = j3 | (((j3 >> 63) & 1) << 60);
        } else {
            uy3 v = uy32.v();
            if (v != null) {
                i2 = v.x;
            } else {
                i2 = -1;
            }
            int i11 = i2;
            if (v != null) {
                i9 = e(v);
            }
            uy32.C = igVar.h(i7, i3, i4, i5, i6, i11, i9, o00.f(1024), o00.f(16), this.d.a.a(i7));
        }
        uy32.B = false;
        this.f = true;
        eq4 z = uy32.z();
        Object[] objArr = z.w;
        int i12 = z.y;
        for (int i13 = 0; i13 < i12; i13++) {
            uy3 uy34 = (uy3) objArr[i13];
            if (uy34.K()) {
                f(uy34);
            }
        }
    }

    public final void h(uy3 uy3) {
        long j2;
        uy3 uy32 = uy3;
        boolean K = uy32.K();
        o00 o00 = uy32.a0;
        if (K && uy32.B) {
            uy3 v = uy32.v();
            if (v != null && !v.y) {
                if (v.A) {
                    v.A = false;
                    v.z = g(v);
                }
                j2 = v.z;
            } else if (v == null) {
                j2 = 0;
            } else {
                j2 = 9223372034707292159L;
            }
            xz4 xz4 = (xz4) o00.e;
            if (oe3.a(j2, 9223372034707292159L) || c(xz4)) {
                f(uy3);
            } else if (!uy32.y) {
                long c2 = oe3.c(j2, xz4.Z);
                kh4 kh4 = uy32.b0.p;
                int b0 = kh4.b0();
                int Z = kh4.Z();
                int i2 = uy32.C;
                ig igVar = this.c;
                if (i2 != -4) {
                    int e2 = e(uy3);
                    if (v != null) {
                        int e3 = e(v);
                        long j3 = c2;
                        long[] jArr = (long[]) igVar.c;
                        long j4 = jArr[e3];
                        ig igVar2 = igVar;
                        int i3 = ((int) (j4 >> 32)) + ((int) (j3 >> 32));
                        int i4 = ((int) j4) + ((int) (j3 & 4294967295L));
                        long j5 = jArr[e2];
                        int i5 = i3 - ((int) (j5 >> 32));
                        int i6 = i4 - ((int) j5);
                        int i7 = e2 + 2;
                        long j6 = jArr[i7];
                        jArr[e2] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                        jArr[e2 + 1] = (((long) (b0 + i3)) << 32) | (((long) (Z + i4)) & 4294967295L);
                        jArr[i7] = j6 | (((j6 >> 63) & 1) << 60);
                        if (!(i5 == 0 && i6 == 0)) {
                            igVar2.m(e2, i5, i6, j6);
                        }
                    } else {
                        long j7 = c2;
                        int e4 = e(uy3);
                        int i8 = (int) (j7 >> 32);
                        int i9 = (int) (j7 & 4294967295L);
                        long[] jArr2 = (long[]) igVar.c;
                        long j8 = jArr2[e4];
                        jArr2[e4] = (((long) i9) & 4294967295L) | (((long) i8) << 32);
                        jArr2[e4 + 1] = (((long) (Z + i9)) & 4294967295L) | (((long) (b0 + i8)) << 32);
                        int i10 = e4 + 2;
                        long j9 = jArr2[i10];
                        jArr2[i10] = (((j9 >> 63) & 1) << 60) | j9;
                        int i11 = i8 - ((int) (j8 >> 32));
                        int i12 = i9 - ((int) j8);
                        if (!(i11 == 0 && i12 == 0)) {
                            igVar.m(e4, i11, i12, j9);
                        }
                    }
                } else {
                    long j10 = c2;
                    int i13 = uy32.x;
                    boolean f2 = o00.f(1024);
                    boolean f3 = o00.f(16);
                    boolean a2 = this.d.a.a(i13);
                    if (v != null) {
                        int i14 = v.x;
                        int e5 = e(v);
                        int i15 = (int) (j10 >> 32);
                        int i16 = (int) (j10 & 4294967295L);
                        int i17 = i13 & 33554431;
                        long[] jArr3 = (long[]) igVar.c;
                        if ((((int) jArr3[e5 + 2]) & 33554431) != (33554431 & i14)) {
                            yb3.a("Inserted child " + i17 + " without valid parent index or parent " + i14 + " not found");
                        }
                        long j11 = jArr3[e5];
                        int i18 = e5;
                        int i19 = ((int) (j11 >> 32)) + i15;
                        int i20 = ((int) j11) + i16;
                        int i21 = i18;
                        int i22 = i19;
                        uy32.C = igVar.h(i17, i22, i20, i19 + b0, i20 + Z, i14, i21, f2, f3, a2);
                    } else {
                        int i23 = (int) (j10 >> 32);
                        int i24 = (int) (j10 & 4294967295L);
                        uy32.C = igVar.h(i13, i23, i24, i23 + b0, i24 + Z, -1, -4, f2, f3, a2);
                    }
                }
            } else {
                f(uy3);
                j(uy32);
            }
            uy32.B = false;
            this.f = true;
            k();
        }
    }

    public final void i(uy3 uy3) {
        if (d(uy3)) {
            int e2 = e(uy3);
            long[] jArr = (long[]) this.c.c;
            jArr[e2] = -1;
            jArr[e2 + 1] = -1;
            jArr[e2 + 2] = my5.a;
            uy3.C = -4;
            uy3.B = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void k() {
        boolean z;
        vd vdVar = this.i;
        if (vdVar != null) {
            z = true;
        } else {
            z = false;
        }
        long j2 = this.d.c;
        if (j2 < 0 && z) {
            return;
        }
        if (this.j != j2 || !z) {
            je jeVar = this.b;
            if (vdVar != null) {
                jeVar.removeCallbacks(vdVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j2, 16 + currentTimeMillis);
            this.j = max;
            vd vdVar2 = new vd(0, this.k);
            jeVar.postDelayed(vdVar2, max - currentTimeMillis);
            this.i = vdVar2;
        }
    }
}
