package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: by6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class by6 {
    public final vr2 a;
    public Object b;
    public hp4 c;
    public int d = -1;
    public final tp4 e = fb5.d();
    public final tp4 f = new tp4();
    public final up4 g = new up4();
    public final eq4 h = new eq4(new oq1[16]);
    public final xt2 i = new xt2(1, this);
    public boolean j;
    public int k;
    public final tp4 l = fb5.d();
    public final HashMap m = new HashMap();

    public by6(vr2 vr2) {
        this.a = vr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        if (((defpackage.o37) r15).b(2) == false) goto L_0x02d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x048b A[Catch:{ all -> 0x041a }, LOOP:11: B:165:0x0384->B:216:0x048b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x01a0 A[EDGE_INSN: B:325:0x01a0->B:73:0x01a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x047f A[EDGE_INSN: B:345:0x047f->B:213:0x047f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01af A[Catch:{ all -> 0x0128 }, LOOP:2: B:29:0x0097->B:76:0x01af, LOOP_END] */
    public final boolean a(Set set) {
        char c2;
        long j2;
        boolean z;
        Iterator it;
        Object obj;
        boolean z2;
        Object g2;
        boolean z3;
        Object[] objArr;
        Iterator it2;
        Object obj2;
        tp4 tp4;
        int i2;
        Object[] objArr2;
        long j3;
        boolean z4;
        long[] jArr;
        int i3;
        int i4;
        eq4 eq4;
        int i5;
        Object[] objArr3;
        oq1 oq1;
        int i6;
        int i7;
        eq4 eq42;
        oq1 oq12;
        hp4 hp4;
        long[] jArr2;
        g22 g22;
        Object[] objArr4;
        tp4 tp42;
        HashMap hashMap;
        g22 g222;
        long[] jArr3;
        Object[] objArr5;
        tp4 tp43;
        HashMap hashMap2;
        int i8;
        int i9;
        int i10;
        long j4;
        HashMap hashMap3;
        Object[] objArr6;
        tp4 tp44;
        HashMap hashMap4;
        int i11;
        int i12;
        long j5;
        int i13;
        long[] jArr4;
        long[] jArr5;
        Set set2 = set;
        g22 g223 = g22.K;
        boolean z5 = set2 instanceof dg6;
        eq4 eq43 = this.h;
        tp4 tp45 = this.l;
        HashMap hashMap5 = this.m;
        tp4 tp46 = this.e;
        up4 up4 = this.g;
        if (z5) {
            up4 up42 = ((dg6) set2).w;
            Object[] objArr7 = up42.b;
            long[] jArr6 = up42.a;
            c2 = 7;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i14 = 0;
                z = false;
                j2 = -9187201950435737472L;
                while (true) {
                    int i15 = 8;
                    long j6 = jArr6[i14];
                    int i16 = i14;
                    if ((((~j6) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j6 & 255) < 128) {
                                Object obj3 = objArr7[(i16 << 3) + i18];
                                jArr3 = jArr6;
                                if (obj3 instanceof o37) {
                                    g222 = g223;
                                } else {
                                    g222 = g223;
                                }
                                if (this.j || !tp45.c(obj3)) {
                                    objArr5 = objArr7;
                                    tp43 = tp45;
                                    hashMap2 = hashMap5;
                                    i8 = length;
                                    i9 = i17;
                                    i10 = i18;
                                    j4 = j6;
                                } else {
                                    this.j = true;
                                    try {
                                        Object g3 = tp45.g(obj3);
                                        if (g3 == null) {
                                            objArr5 = objArr7;
                                            tp43 = tp45;
                                            hashMap2 = hashMap5;
                                            i8 = length;
                                            i9 = i17;
                                            i10 = i18;
                                            j4 = j6;
                                        } else if (g3 instanceof up4) {
                                            up4 up43 = (up4) g3;
                                            Object[] objArr8 = up43.b;
                                            long[] jArr7 = up43.a;
                                            Object[] objArr9 = objArr8;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                long[] jArr8 = jArr7;
                                                i10 = i18;
                                                boolean z6 = z;
                                                int i19 = 0;
                                                while (true) {
                                                    long j7 = jArr8[i19];
                                                    j4 = j6;
                                                    if ((((~j7) << 7) & j7 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j7 & 255) < 128) {
                                                                objArr6 = objArr7;
                                                                oq1 oq13 = (oq1) objArr9[(i19 << 3) + i21];
                                                                oq13.getClass();
                                                                j5 = j7;
                                                                Object obj4 = hashMap5.get(oq13);
                                                                ux6 ux6 = oq13.y;
                                                                if (ux6 == null) {
                                                                    ux6 = g222;
                                                                }
                                                                i13 = i21;
                                                                if (!ux6.i(oq13.e().f, obj4)) {
                                                                    Object g4 = tp46.g(oq13);
                                                                    if (g4 != null) {
                                                                        if (g4 instanceof up4) {
                                                                            up4 up44 = (up4) g4;
                                                                            Object[] objArr10 = up44.b;
                                                                            long[] jArr9 = up44.a;
                                                                            int length3 = jArr9.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i11 = length;
                                                                                i12 = i17;
                                                                                int i22 = 0;
                                                                                while (true) {
                                                                                    long j8 = jArr9[i22];
                                                                                    tp44 = tp45;
                                                                                    hashMap4 = hashMap5;
                                                                                    if ((((~j8) << 7) & j8 & -9187201950435737472L) != -9187201950435737472L) {
                                                                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                                                                        int i24 = 0;
                                                                                        while (i24 < i23) {
                                                                                            if ((j8 & 255) < 128) {
                                                                                                jArr5 = jArr9;
                                                                                                up4.a(objArr10[(i22 << 3) + i24]);
                                                                                                z6 = true;
                                                                                            } else {
                                                                                                jArr5 = jArr9;
                                                                                            }
                                                                                            j8 >>= i15;
                                                                                            i24++;
                                                                                            jArr9 = jArr5;
                                                                                        }
                                                                                        jArr4 = jArr9;
                                                                                        if (i23 != i15) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr9;
                                                                                    }
                                                                                    if (i22 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i22++;
                                                                                    tp45 = tp44;
                                                                                    hashMap5 = hashMap4;
                                                                                    jArr9 = jArr4;
                                                                                    i15 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            tp44 = tp45;
                                                                            hashMap4 = hashMap5;
                                                                            i11 = length;
                                                                            i12 = i17;
                                                                            up4.a(g4);
                                                                            z6 = true;
                                                                        }
                                                                    }
                                                                    tp44 = tp45;
                                                                    hashMap4 = hashMap5;
                                                                    i11 = length;
                                                                    i12 = i17;
                                                                } else {
                                                                    tp44 = tp45;
                                                                    hashMap4 = hashMap5;
                                                                    i11 = length;
                                                                    i12 = i17;
                                                                    eq43.b(oq13);
                                                                }
                                                            } else {
                                                                objArr6 = objArr7;
                                                                tp44 = tp45;
                                                                hashMap4 = hashMap5;
                                                                i11 = length;
                                                                i12 = i17;
                                                                j5 = j7;
                                                                i13 = i21;
                                                            }
                                                            j7 = j5 >> 8;
                                                            i21 = i13 + 1;
                                                            i15 = 8;
                                                            objArr7 = objArr6;
                                                            length = i11;
                                                            i17 = i12;
                                                            tp45 = tp44;
                                                            hashMap5 = hashMap4;
                                                        }
                                                        objArr5 = objArr7;
                                                        tp43 = tp45;
                                                        hashMap3 = hashMap5;
                                                        i8 = length;
                                                        i9 = i17;
                                                        if (i20 == i15) {
                                                            if (i19 != length2) {
                                                                break;
                                                            }
                                                            i19++;
                                                            j6 = j4;
                                                            objArr7 = objArr5;
                                                            length = i8;
                                                            i17 = i9;
                                                            tp45 = tp43;
                                                            hashMap5 = hashMap3;
                                                            i15 = 8;
                                                        } else {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr5 = objArr7;
                                                        tp43 = tp45;
                                                        hashMap3 = hashMap5;
                                                        i8 = length;
                                                        i9 = i17;
                                                        if (i19 != length2) {
                                                        }
                                                    }
                                                }
                                                z = z6;
                                            } else {
                                                objArr5 = objArr7;
                                                tp43 = tp45;
                                                hashMap3 = hashMap5;
                                                i8 = length;
                                                i9 = i17;
                                                i10 = i18;
                                                j4 = j6;
                                            }
                                            hashMap2 = hashMap3;
                                        } else {
                                            objArr5 = objArr7;
                                            tp43 = tp45;
                                            i8 = length;
                                            i9 = i17;
                                            i10 = i18;
                                            j4 = j6;
                                            oq1 oq14 = (oq1) g3;
                                            hashMap2 = hashMap5;
                                            Object obj5 = hashMap2.get(oq14);
                                            ux6 ux62 = oq14.y;
                                            if (ux62 == null) {
                                                ux62 = g222;
                                            }
                                            if (!ux62.i(oq14.e().f, obj5)) {
                                                Object g5 = tp46.g(oq14);
                                                if (g5 != null) {
                                                    if (g5 instanceof up4) {
                                                        up4 up45 = (up4) g5;
                                                        Object[] objArr11 = up45.b;
                                                        long[] jArr10 = up45.a;
                                                        int length4 = jArr10.length - 2;
                                                        if (length4 >= 0) {
                                                            int i25 = 0;
                                                            while (true) {
                                                                long j9 = jArr10[i25];
                                                                if ((((~j9) << 7) & j9 & -9187201950435737472L) != -9187201950435737472L) {
                                                                    int i26 = 8 - ((~(i25 - length4)) >>> 31);
                                                                    for (int i27 = 0; i27 < i26; i27++) {
                                                                        if ((j9 & 255) < 128) {
                                                                            up4.a(objArr11[(i25 << 3) + i27]);
                                                                            z = true;
                                                                        }
                                                                        j9 >>= 8;
                                                                    }
                                                                    if (i26 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i25 == length4) {
                                                                    break;
                                                                }
                                                                i25++;
                                                            }
                                                        }
                                                    } else {
                                                        up4.a(g5);
                                                        z = true;
                                                    }
                                                }
                                            } else {
                                                eq43.b(oq14);
                                            }
                                        }
                                    } finally {
                                        this.j = false;
                                    }
                                }
                                Object g6 = tp46.g(obj3);
                                if (g6 != null) {
                                    if (g6 instanceof up4) {
                                        up4 up46 = (up4) g6;
                                        Object[] objArr12 = up46.b;
                                        long[] jArr11 = up46.a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                long j10 = jArr11[i28];
                                                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                    long j11 = j10;
                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                        if ((j11 & 255) < 128) {
                                                            up4.a(objArr12[(i28 << 3) + i30]);
                                                            z = true;
                                                        }
                                                        j11 >>= 8;
                                                    }
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i28 == length5) {
                                                    break;
                                                }
                                                i28++;
                                            }
                                        }
                                    } else {
                                        up4.a(g6);
                                        z = true;
                                    }
                                }
                            } else {
                                jArr3 = jArr6;
                                g222 = g223;
                                objArr5 = objArr7;
                                tp43 = tp45;
                                hashMap2 = hashMap5;
                                i8 = length;
                                i9 = i17;
                                i10 = i18;
                                j4 = j6;
                            }
                            i18 = i10 + 1;
                            i15 = 8;
                            jArr6 = jArr3;
                            objArr7 = objArr5;
                            length = i8;
                            i17 = i9;
                            j6 = j4 >> 8;
                            tp45 = tp43;
                            hashMap5 = hashMap2;
                            g223 = g222;
                        }
                        jArr2 = jArr6;
                        g22 = g223;
                        objArr4 = objArr7;
                        tp42 = tp45;
                        hashMap = hashMap5;
                        int i31 = length;
                        if (i17 != i15) {
                            break;
                        }
                        length = i31;
                    } else {
                        jArr2 = jArr6;
                        g22 = g223;
                        objArr4 = objArr7;
                        tp42 = tp45;
                        hashMap = hashMap5;
                    }
                    int i32 = i16;
                    if (i32 == length) {
                        break;
                    }
                    i14 = i32 + 1;
                    hashMap5 = hashMap;
                    jArr6 = jArr2;
                    g223 = g22;
                    objArr7 = objArr4;
                    tp45 = tp42;
                }
            } else {
                j2 = -9187201950435737472L;
                z = false;
            }
        } else {
            g22 g224 = g223;
            tp4 tp47 = tp45;
            HashMap hashMap6 = hashMap5;
            c2 = 7;
            j2 = -9187201950435737472L;
            Iterator it3 = set2.iterator();
            boolean z7 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof o37) || ((o37) next).b(2)) {
                    if (!this.j) {
                        tp4 tp48 = tp47;
                        if (tp48.c(next)) {
                            this.j = true;
                            try {
                                Object g7 = tp48.g(next);
                                if (g7 != null) {
                                    if (g7 instanceof up4) {
                                        up4 up47 = (up4) g7;
                                        Object[] objArr13 = up47.b;
                                        long[] jArr12 = up47.a;
                                        int length6 = jArr12.length - 2;
                                        if (length6 >= 0) {
                                            boolean z8 = z7;
                                            int i33 = 0;
                                            while (true) {
                                                long j12 = jArr12[i33];
                                                long[] jArr13 = jArr12;
                                                if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i34 = 8 - ((~(i33 - length6)) >>> 31);
                                                    int i35 = 0;
                                                    while (i35 < i34) {
                                                        if ((j12 & 255) < 128) {
                                                            it2 = it3;
                                                            oq1 oq15 = (oq1) objArr13[(i33 << 3) + i35];
                                                            oq15.getClass();
                                                            tp4 = tp48;
                                                            Object obj6 = hashMap6.get(oq15);
                                                            i2 = i35;
                                                            ux6 ux63 = oq15.y;
                                                            if (ux63 == null) {
                                                                ux63 = g224;
                                                            }
                                                            objArr2 = objArr13;
                                                            if (!ux63.i(oq15.e().f, obj6)) {
                                                                Object g8 = tp46.g(oq15);
                                                                if (g8 != null) {
                                                                    if (g8 instanceof up4) {
                                                                        up4 up48 = (up4) g8;
                                                                        Object[] objArr14 = up48.b;
                                                                        long[] jArr14 = up48.a;
                                                                        int length7 = jArr14.length - 2;
                                                                        if (length7 >= 0) {
                                                                            j3 = j12;
                                                                            int i36 = 0;
                                                                            boolean z9 = z8;
                                                                            while (true) {
                                                                                long j13 = jArr14[i36];
                                                                                obj2 = next;
                                                                                Object[] objArr15 = objArr14;
                                                                                if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                                                                                    int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                                                    int i38 = 0;
                                                                                    while (i38 < i37) {
                                                                                        if ((j13 & 255) < 128) {
                                                                                            up4.a(objArr15[(i36 << 3) + i38]);
                                                                                            z9 = true;
                                                                                        }
                                                                                        j13 >>= 8;
                                                                                        i38++;
                                                                                        jArr14 = jArr14;
                                                                                    }
                                                                                    jArr = jArr14;
                                                                                    if (i37 != 8) {
                                                                                        z4 = z9;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    jArr = jArr14;
                                                                                }
                                                                                if (i36 == length7) {
                                                                                    z8 = z9;
                                                                                    break;
                                                                                }
                                                                                i36++;
                                                                                next = obj2;
                                                                                objArr14 = objArr15;
                                                                                jArr14 = jArr;
                                                                            }
                                                                            z4 = z8;
                                                                        }
                                                                    } else {
                                                                        obj2 = next;
                                                                        j3 = j12;
                                                                        up4.a(g8);
                                                                        z4 = true;
                                                                    }
                                                                    z8 = z4;
                                                                }
                                                                obj2 = next;
                                                                j3 = j12;
                                                                z4 = z8;
                                                                z8 = z4;
                                                            } else {
                                                                obj2 = next;
                                                                j3 = j12;
                                                                eq43.b(oq15);
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            obj2 = next;
                                                            tp4 = tp48;
                                                            i2 = i35;
                                                            objArr2 = objArr13;
                                                            j3 = j12;
                                                        }
                                                        i35 = i2 + 1;
                                                        it3 = it2;
                                                        j12 = j3 >> 8;
                                                        objArr13 = objArr2;
                                                        next = obj2;
                                                        tp48 = tp4;
                                                    }
                                                    it = it3;
                                                    obj = next;
                                                    tp47 = tp48;
                                                    objArr = objArr13;
                                                    if (i34 == 8) {
                                                        if (i33 != length6) {
                                                            break;
                                                        }
                                                        i33++;
                                                        it3 = it;
                                                        jArr12 = jArr13;
                                                        objArr13 = objArr;
                                                        next = obj;
                                                        tp48 = tp47;
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    obj = next;
                                                    tp47 = tp48;
                                                    objArr = objArr13;
                                                    if (i33 != length6) {
                                                    }
                                                }
                                            }
                                            z7 = z8;
                                        }
                                    } else {
                                        it = it3;
                                        obj = next;
                                        tp47 = tp48;
                                        oq1 oq16 = (oq1) g7;
                                        Object obj7 = hashMap6.get(oq16);
                                        ux6 ux64 = oq16.y;
                                        if (ux64 == null) {
                                            ux64 = g224;
                                        }
                                        if (!ux64.i(oq16.e().f, obj7)) {
                                            Object g9 = tp46.g(oq16);
                                            if (g9 != null) {
                                                if (g9 instanceof up4) {
                                                    up4 up49 = (up4) g9;
                                                    Object[] objArr16 = up49.b;
                                                    long[] jArr15 = up49.a;
                                                    int length8 = jArr15.length - 2;
                                                    if (length8 >= 0) {
                                                        boolean z10 = z7;
                                                        int i39 = 0;
                                                        while (true) {
                                                            long j14 = jArr15[i39];
                                                            if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                                                                int i40 = 8 - ((~(i39 - length8)) >>> 31);
                                                                long j15 = j14;
                                                                for (int i41 = 0; i41 < i40; i41++) {
                                                                    if ((j15 & 255) < 128) {
                                                                        up4.a(objArr16[(i39 << 3) + i41]);
                                                                        z10 = true;
                                                                    }
                                                                    j15 >>= 8;
                                                                }
                                                                if (i40 != 8) {
                                                                    z3 = z10;
                                                                    break;
                                                                }
                                                            }
                                                            if (i39 == length8) {
                                                                z7 = z10;
                                                                break;
                                                            }
                                                            i39++;
                                                        }
                                                    }
                                                } else {
                                                    up4.a(g9);
                                                    z3 = true;
                                                }
                                                z7 = z3;
                                            }
                                            z3 = z7;
                                            z7 = z3;
                                        } else {
                                            eq43.b(oq16);
                                        }
                                    }
                                    boolean z11 = z7;
                                    g2 = tp46.g(obj);
                                    if (g2 != null) {
                                        if (g2 instanceof up4) {
                                            up4 up410 = (up4) g2;
                                            Object[] objArr17 = up410.b;
                                            long[] jArr16 = up410.a;
                                            int length9 = jArr16.length - 2;
                                            if (length9 >= 0) {
                                                int i42 = z2;
                                                while (true) {
                                                    long j16 = jArr16[i42];
                                                    if ((((~j16) << 7) & j16 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i43 = 8 - ((~(i42 - length9)) >>> 31);
                                                        long j17 = j16;
                                                        for (int i44 = z2; i44 < i43; i44++) {
                                                            if ((j17 & 255) < 128) {
                                                                up4.a(objArr17[(i42 << 3) + i44]);
                                                                z11 = true;
                                                            }
                                                            j17 >>= 8;
                                                        }
                                                        if (i43 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i42 == length9) {
                                                        break;
                                                    }
                                                    i42++;
                                                }
                                            }
                                        } else {
                                            up4.a(g2);
                                            z11 = true;
                                        }
                                    }
                                    z7 = z11;
                                }
                                it = it3;
                                obj = next;
                                tp47 = tp48;
                                boolean z112 = z7;
                                g2 = tp46.g(obj);
                                if (g2 != null) {
                                }
                                z7 = z112;
                            } finally {
                                this.j = false;
                            }
                        } else {
                            tp47 = tp48;
                        }
                    }
                    it = it3;
                    obj = next;
                    z2 = false;
                    boolean z1122 = z7;
                    g2 = tp46.g(obj);
                    if (g2 != null) {
                    }
                    z7 = z1122;
                } else {
                    it = it3;
                }
                it3 = it;
            }
            z = z7;
        }
        int i45 = 0;
        if (!this.j && (i3 = eq43.y) != 0) {
            Object[] objArr18 = eq43.w;
            int i46 = 0;
            while (i46 < i3) {
                oq1 oq17 = (oq1) objArr18[i46];
                int hashCode = Long.hashCode(nx6.j().g());
                Object g10 = tp46.g(oq17);
                if (g10 != null) {
                    boolean z12 = g10 instanceof up4;
                    tp4 tp49 = this.f;
                    if (z12) {
                        up4 up411 = (up4) g10;
                        Object[] objArr19 = up411.b;
                        long[] jArr17 = up411.a;
                        int length10 = jArr17.length - 2;
                        if (length10 >= 0) {
                            int i47 = i45;
                            oq1 oq18 = oq17;
                            while (true) {
                                long j18 = jArr17[i47];
                                objArr3 = objArr18;
                                i5 = i46;
                                if ((((~j18) << c2) & j18 & j2) != j2) {
                                    int i48 = 8 - ((~(i47 - length10)) >>> 31);
                                    int i49 = 0;
                                    while (i49 < i48) {
                                        if ((j18 & 255) < 128) {
                                            i6 = i3;
                                            Object obj8 = objArr19[(i47 << 3) + i49];
                                            hp4 hp42 = (hp4) tp49.g(obj8);
                                            i7 = i49;
                                            if (hp42 == null) {
                                                hp4 = new hp4();
                                                tp49.m(obj8, hp4);
                                            } else {
                                                hp4 = hp42;
                                            }
                                            eq42 = eq43;
                                            oq12 = oq18;
                                            b(oq12, hashCode, obj8, hp4);
                                        } else {
                                            i6 = i3;
                                            i7 = i49;
                                            eq42 = eq43;
                                            oq12 = oq18;
                                        }
                                        j18 >>= 8;
                                        i49 = i7 + 1;
                                        oq18 = oq12;
                                        eq43 = eq42;
                                        i3 = i6;
                                    }
                                    i4 = i3;
                                    eq4 = eq43;
                                    oq1 = oq18;
                                    if (i48 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    eq4 = eq43;
                                    oq1 = oq18;
                                }
                                if (i47 == length10) {
                                    break;
                                }
                                i47++;
                                oq18 = oq1;
                                objArr18 = objArr3;
                                i46 = i5;
                                eq43 = eq4;
                                i3 = i4;
                            }
                        } else {
                            i4 = i3;
                            objArr3 = objArr18;
                            i5 = i46;
                            eq4 = eq43;
                        }
                    } else {
                        i4 = i3;
                        objArr3 = objArr18;
                        i5 = i46;
                        eq4 = eq43;
                        oq1 oq19 = oq17;
                        hp4 hp43 = (hp4) tp49.g(g10);
                        if (hp43 == null) {
                            hp43 = new hp4();
                            tp49.m(g10, hp43);
                        }
                        b(oq19, hashCode, g10, hp43);
                    }
                } else {
                    i4 = i3;
                    objArr3 = objArr18;
                    i5 = i46;
                    eq4 = eq43;
                }
                i46 = i5 + 1;
                objArr18 = objArr3;
                eq43 = eq4;
                i3 = i4;
                i45 = 0;
            }
            eq43.g();
        }
        return z;
    }

    public final void b(Object obj, int i2, Object obj2, hp4 hp4) {
        int i3;
        Object obj3 = obj;
        int i4 = i2;
        hp4 hp42 = hp4;
        if (this.k <= 0) {
            int c2 = hp42.c(obj3);
            if (c2 < 0) {
                c2 = ~c2;
                i3 = -1;
            } else {
                i3 = hp42.c[c2];
            }
            hp42.b[c2] = obj3;
            hp42.c[c2] = i4;
            if ((obj3 instanceof oq1) && i3 != i4) {
                nq1 e2 = ((oq1) obj3).e();
                this.m.put(obj3, e2.f);
                hp4 hp43 = e2.e;
                tp4 tp4 = this.l;
                fb5.t(tp4, obj3);
                Object[] objArr = hp43.b;
                long[] jArr = hp43.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j2 = jArr[i5];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j2 & 255) < 128) {
                                    n37 n37 = (n37) objArr[(i5 << 3) + i7];
                                    if (n37 instanceof o37) {
                                        ((o37) n37).c(2);
                                    }
                                    fb5.b(tp4, n37, obj3);
                                }
                                j2 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
            }
            if (i3 == -1) {
                if (obj3 instanceof o37) {
                    ((o37) obj3).c(2);
                }
                fb5.b(this.e, obj3, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        tp4 tp4 = this.e;
        fb5.r(tp4, obj2, obj);
        if ((obj2 instanceof oq1) && !tp4.c(obj2)) {
            fb5.t(this.l, obj2);
            this.m.remove(obj2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    public final void d() {
        long[] jArr;
        long j2;
        long[] jArr2;
        long j3;
        char c2;
        int i2;
        boolean z;
        long j4;
        tp4 tp4 = this.f;
        long[] jArr3 = tp4.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            c2 = c3;
                            Object obj = tp4.b[i7];
                            j3 = j6;
                            hp4 hp4 = (hp4) tp4.c[i7];
                            obj.getClass();
                            boolean r = ((q95) obj).r();
                            if (!r) {
                                Object[] objArr = hp4.b;
                                int[] iArr = hp4.c;
                                long[] jArr4 = hp4.a;
                                int i8 = i4;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j2 = j5;
                                    int i9 = 0;
                                    while (true) {
                                        long j7 = jArr4[i9];
                                        long[] jArr5 = jArr4;
                                        z = r;
                                        if ((((~j7) << c2) & j7 & j3) != j3) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j7 & 255) < 128) {
                                                    int i12 = (i9 << 3) + i11;
                                                    j4 = j7;
                                                    Object obj2 = objArr[i12];
                                                    int i13 = iArr[i12];
                                                    c(obj, obj2);
                                                } else {
                                                    j4 = j7;
                                                }
                                                j7 = j4 >> i8;
                                            }
                                            if (i10 != i8) {
                                                break;
                                            }
                                        }
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        r = z;
                                        jArr4 = jArr5;
                                        i8 = 8;
                                    }
                                    if (!z) {
                                        tp4.l(i7);
                                    }
                                    i2 = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j2 = j5;
                            z = r;
                            if (!z) {
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            j2 = j5;
                            c2 = c3;
                            j3 = j6;
                            i2 = i4;
                        }
                        i6++;
                        i4 = i2;
                        j5 = j2 >> i2;
                        c3 = c2;
                        j6 = j3;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i5 != i4) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 != length) {
                    i3++;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
