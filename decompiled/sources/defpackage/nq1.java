package defpackage;

/* renamed from: nq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nq1 extends p37 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public hp4 e;
    public Object f = h;
    public int g;

    public nq1(long j) {
        super(j);
        hp4 hp4 = v25.a;
        hp4.getClass();
        this.e = hp4;
    }

    public final void a(p37 p37) {
        p37.getClass();
        nq1 nq1 = (nq1) p37;
        this.e = nq1.e;
        this.f = nq1.f;
        this.g = nq1.g;
    }

    public final p37 b(long j) {
        return new nq1(j);
    }

    public final boolean c(oq1 oq1, ix6 ix6) {
        boolean z;
        boolean z2;
        Object obj = nx6.c;
        synchronized (obj) {
            z = true;
            if (this.c == ix6.g() && this.d == ix6.h()) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (this.f == h || (z2 && this.g != d(oq1, ix6))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = ix6.g();
            this.d = ix6.h();
        }
        return z;
    }

    public final int d(oq1 oq1, ix6 ix6) {
        hp4 hp4;
        int i;
        int i2;
        Object[] objArr;
        long[] jArr;
        long j;
        int i3;
        Object[] objArr2;
        long j2;
        long[] jArr2;
        int i4;
        nq1 nq1;
        ix6 ix62 = ix6;
        synchronized (nx6.c) {
            hp4 = this.e;
        }
        int i5 = 7;
        if (hp4.e == 0) {
            return 7;
        }
        eq4 h2 = u55.h();
        Object[] objArr3 = h2.w;
        int i6 = h2.y;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((xt2) objArr3[i7]).b();
        }
        try {
            Object[] objArr4 = hp4.b;
            int[] iArr = hp4.c;
            long[] jArr3 = hp4.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                n37 n37 = (n37) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (n37 instanceof oq1) {
                                        oq1 oq12 = (oq1) n37;
                                        nq1 d2 = oq12.d((nq1) nx6.i(oq12.z, ix62), ix62, z, oq12.x);
                                        hp4 hp42 = d2.e;
                                        Object[] objArr5 = hp42.b;
                                        long[] jArr4 = hp42.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((n37) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        nq1 = d2;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    nq1 = d2;
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                            nq1 = d2;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        nq1 = nx6.i(n37.getFirstStateRecord(), ix62);
                                    }
                                    i = (((i * 31) + System.identityHashCode(nq1)) * 31) + Long.hashCode(nq1.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Object[] objArr6 = h2.w;
            int i18 = h2.y;
            for (int i19 = 0; i19 < i18; i19++) {
                ((xt2) objArr6[i19]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = h2.w;
            int i20 = h2.y;
            for (int i21 = 0; i21 < i20; i21++) {
                ((xt2) objArr7[i21]).a();
            }
            throw th;
        }
    }
}
