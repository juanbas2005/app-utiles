package defpackage;

/* renamed from: n56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n56 implements tp1, qy0 {
    public z57 A;
    public z57 B;
    public yo4 C;
    public yo4 D;
    public yo4 E;
    public long F;
    public int G;
    public hl H;
    public hl I;
    public kg5 J;
    public float w;
    public y57 x;
    public z57 y;
    public z57 z;

    public final float Y() {
        return 1.0f;
    }

    public final void a(long j) {
        int i;
        f((byte) 34, this.H, this.I);
        hl hlVar = this.H;
        hl hlVar2 = this.I;
        cu7 cu7 = cu7.a;
        if (hlVar == cu7) {
            if ((this.G & 2) != 0) {
                yo4 yo4 = this.C;
                if (yo4 == null || (hlVar = (hl) yo4.b(51)) == null) {
                    hlVar = o56.a;
                }
            } else {
                hlVar = null;
            }
        }
        if (hlVar2 == cu7) {
            if ((this.G & 2) != 0) {
                yo4 yo42 = this.D;
                if (yo42 == null || (hlVar2 = (hl) yo42.b(51)) == null) {
                    hlVar2 = o56.a;
                }
            } else {
                hlVar2 = null;
            }
        }
        if (hlVar == null || hlVar2 == null) {
            i = this.G & -3;
        } else {
            i = this.G | 2;
        }
        this.G = i;
        g(51, hlVar, hlVar2);
        z57 z57 = this.y;
        if (z57 != null) {
            z57.b(j);
        }
    }

    public final float b() {
        return this.w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3 != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0147 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014c A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015b A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0172 A[Catch:{ all -> 0x0121 }] */
    public final void c() {
        z57 z57;
        long j;
        long j2;
        boolean z2;
        hl hlVar;
        long j3;
        boolean z3;
        q57 q57;
        hl hlVar2;
        long j4;
        int i;
        boolean z4;
        y57 y57 = this.x;
        y57.getClass();
        this.x = null;
        kg5 kg5 = this.J;
        if (kg5 != null) {
            synchronized (kg5.x) {
                if (((yo4) kg5.y).e == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
        }
        if (this.F == 0 && this.G == 0) {
            return;
        }
        z57 z572 = this.y;
        if (z572 != null && (z57 = this.z) != null) {
            int h = a67.h(this.F, this.G);
            long i2 = a67.i(this.F, this.G);
            int h2 = z57.h(h, z572);
            long i3 = z57.i(z572, i2);
            if (i3 != 0 || h2 != 0) {
                kg5 kg52 = this.J;
                if (kg52 == null) {
                    kg52 = new kg5(20);
                    this.J = kg52;
                }
                long h3 = (((long) a67.h(i3, h2)) << 50) | (-257698037761L & i3);
                long j5 = (((long) h) << 50) | i2;
                yo4 yo4 = this.C;
                yo4 yo42 = this.D;
                yo4 yo43 = this.E;
                synchronized (kg52.x) {
                    try {
                        yo4 yo44 = (yo4) kg52.y;
                        int[] iArr = yo44.b;
                        Object[] objArr = yo44.c;
                        long[] jArr = yo44.a;
                        Object[] objArr2 = objArr;
                        int length = jArr.length - 2;
                        long j6 = j5;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j7 = jArr[i4];
                                j = h3;
                                if ((((~j7) << 7) & j7 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((j7 & 255) < 128) {
                                            int i7 = (i4 << 3) + i6;
                                            int i8 = iArr[i7];
                                            j4 = j7;
                                            q57 q572 = (q57) objArr2[i7];
                                            int ordinal = q572.c.ordinal();
                                            i = i6;
                                            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                                                q572.c = r57.w;
                                            }
                                        } else {
                                            j4 = j7;
                                            i = i6;
                                        }
                                        j7 = j4 >> 8;
                                        i6 = i + 1;
                                    }
                                    if (i5 != 8) {
                                        break;
                                    }
                                }
                                if (i4 == length) {
                                    break;
                                }
                                i4++;
                                h3 = j;
                            }
                        } else {
                            j = h3;
                        }
                        j2 = 0;
                        if (j6 != 0) {
                            long j8 = j6;
                            while (j8 != 0) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                                if (yo4 != null) {
                                    hlVar = (hl) yo4.b(numberOfTrailingZeros);
                                    if (hlVar == null) {
                                    }
                                    j3 = 1 << numberOfTrailingZeros;
                                    if ((j & j3) == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    long j9 = j8;
                                    yo4 yo45 = (yo4) kg52.y;
                                    q57 = (q57) yo45.b(numberOfTrailingZeros);
                                    if (q57 == null) {
                                        if (!z3) {
                                            if (sg3.e(q57.a, hlVar)) {
                                                q57.c = r57.x;
                                                j8 = j9 ^ j3;
                                            }
                                        }
                                        q57.a = hlVar;
                                        q57.c = r57.y;
                                    } else if (z3) {
                                        yo45.i(numberOfTrailingZeros, new q57(kg52, hlVar));
                                    }
                                    j2 |= j3;
                                    j8 = j9 ^ j3;
                                }
                                if (yo43 != null) {
                                    hlVar = (hl) yo43.b(numberOfTrailingZeros);
                                } else {
                                    hlVar = null;
                                }
                                if (hlVar == null) {
                                    if (yo42 != null) {
                                        hlVar2 = (hl) yo42.b(numberOfTrailingZeros);
                                    } else {
                                        hlVar2 = null;
                                    }
                                    if (hlVar == null) {
                                        hlVar = o56.a;
                                    }
                                }
                                j3 = 1 << numberOfTrailingZeros;
                                if ((j & j3) == 0) {
                                }
                                long j92 = j8;
                                yo4 yo452 = (yo4) kg52.y;
                                q57 = (q57) yo452.b(numberOfTrailingZeros);
                                if (q57 == null) {
                                }
                                j2 |= j3;
                                j8 = j92 ^ j3;
                            }
                        }
                        kg52.J(y57);
                    } finally {
                    }
                }
                if (j2 != 0) {
                    z57 z573 = this.B;
                    if (z573 == null) {
                        z573 = new z57();
                        this.B = z573;
                    }
                    long j10 = 2251799813685247L & j2;
                    int i9 = (int) (j2 >> 50);
                    long i10 = a67.i(j10, i9);
                    int h4 = a67.h(j10, i9);
                    z57.g(z573, i10, h4);
                    z57 z574 = this.A;
                    if (z574 != null) {
                        z574.g(z573, i10, h4);
                    }
                    this.A = null;
                }
                synchronized (kg52.x) {
                    if (((yo4) kg52.y).e == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    this.J = null;
                }
            }
        }
    }

    public final int d() {
        int i;
        kg5 kg5 = this.J;
        int i2 = 0;
        if (kg5 == null) {
            return 0;
        }
        yo4 yo4 = (yo4) kg5.y;
        int[] iArr = yo4.b;
        Object[] objArr = yo4.c;
        long[] jArr = yo4.a;
        int length = jArr.length - 2;
        long j = 0;
        if (length >= 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            q57 q57 = (q57) objArr[i6];
                            if (i7 < 50) {
                                j |= 1 << ((byte) i7);
                            } else {
                                i |= 1 << (i7 - 50);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    i2 = i;
                    break;
                }
                i3++;
            }
        }
        i = i2;
        return a67.e(i) | a67.g(j);
    }

    public final void f(byte b, hl hlVar, hl hlVar2) {
        long j;
        cu7 cu7 = cu7.a;
        if (hlVar == cu7) {
            long j2 = this.F;
            if (b >= 50 || (j2 & (1 << b)) == 0) {
                hlVar = null;
            } else {
                yo4 yo4 = this.C;
                if (yo4 == null || (hlVar = (hl) yo4.b(b)) == null) {
                    hlVar = o56.a;
                }
            }
        }
        if (hlVar2 == cu7) {
            long j3 = this.F;
            if (b >= 50 || (j3 & (1 << b)) == 0) {
                hlVar2 = null;
            } else {
                yo4 yo42 = this.D;
                if (yo42 == null || (hlVar2 = (hl) yo42.b(b)) == null) {
                    hlVar2 = o56.a;
                }
            }
        }
        if (hlVar == null || hlVar2 == null) {
            j = this.F & (~(1 << b));
        } else {
            j = this.F | (1 << b);
        }
        this.F = j;
        g(b, hlVar, hlVar2);
    }

    public final void g(int i, hl hlVar, hl hlVar2) {
        if (hlVar == null || hlVar.equals(o56.a)) {
            yo4 yo4 = this.C;
            if (yo4 != null) {
                hl hlVar3 = (hl) yo4.g(i);
            }
        } else {
            yo4 yo42 = this.C;
            if (yo42 == null) {
                yo4 yo43 = ne3.a;
                yo42 = new yo4();
                this.C = yo42;
            }
            yo42.i(i, hlVar);
        }
        if (hlVar2 == null || hlVar2.equals(o56.a)) {
            yo4 yo44 = this.D;
            if (yo44 != null) {
                hl hlVar4 = (hl) yo44.b(i);
                yo44.g(i);
                if (hlVar4 != null) {
                    yo4 yo45 = this.E;
                    if (yo45 == null) {
                        yo4 yo46 = ne3.a;
                        yo45 = new yo4();
                        this.E = yo45;
                    }
                    yo45.i(i, hlVar4);
                    return;
                }
                return;
            }
            return;
        }
        yo4 yo47 = this.D;
        if (yo47 == null) {
            yo4 yo48 = ne3.a;
            yo47 = new yo4();
            this.D = yo47;
        }
        yo47.i(i, hlVar2);
    }

    public final Object g0(hu5 hu5) {
        y57 y57 = this.x;
        y57.getClass();
        return h49.w(y57, hu5);
    }

    public final void h(int i, z57 z57) {
        int i2;
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        z57 z572 = this.y;
        if (z572 == null) {
            z572 = a67.n;
        }
        z57 z573 = z57;
        z57 z574 = z572;
        z574.f(z573);
        kg5 kg5 = this.J;
        if (kg5 != null) {
            z57 z575 = this.B;
            if (z575 != null || (z575 = this.z) != null) {
                z57 z576 = z575;
                synchronized (kg5.x) {
                    i2 = 0;
                    if (((yo4) kg5.y).e == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    this.B = null;
                    this.J = null;
                    return;
                }
                int i8 = i & 1;
                if (i8 != 0) {
                    j = a67.b;
                } else {
                    j = 0;
                }
                int i9 = i & 8;
                if (i9 != 0) {
                    j2 = a67.c;
                } else {
                    j2 = 0;
                }
                long j7 = j | j2;
                int i10 = i & 2;
                if (i10 != 0) {
                    j3 = a67.d;
                } else {
                    j3 = 0;
                }
                long j8 = j7 | j3;
                int i11 = i & 4;
                if (i11 != 0) {
                    j4 = a67.e;
                } else {
                    j4 = 0;
                }
                long j9 = j8 | j4;
                int i12 = i & 32;
                if (i12 != 0) {
                    j5 = a67.f;
                } else {
                    j5 = 0;
                }
                long j10 = j9 | j5;
                int i13 = i & 16;
                if (i13 != 0) {
                    j6 = a67.g;
                } else {
                    j6 = 0;
                }
                long j11 = j10 | j6;
                if (i8 != 0) {
                    i3 = a67.h;
                } else {
                    i3 = 0;
                }
                if (i9 != 0) {
                    i4 = a67.i;
                } else {
                    i4 = 0;
                }
                int i14 = i3 | i4;
                if (i10 != 0) {
                    i5 = a67.j;
                } else {
                    i5 = 0;
                }
                int i15 = i14 | i5;
                if (i11 != 0) {
                    i6 = a67.k;
                } else {
                    i6 = 0;
                }
                int i16 = i15 | i6;
                if (i12 != 0) {
                    i7 = a67.l;
                } else {
                    i7 = 0;
                }
                int i17 = i16 | i7;
                if (i13 != 0) {
                    i2 = a67.m;
                }
                long y2 = kg5.y();
                int i18 = (int) (y2 >> 50);
                long i19 = a67.i(2251799813685247L & y2, i18) & j11;
                int h = a67.h(i19, i18) & (i17 | i2);
                if (i19 != 0 || h != 0) {
                    a67.a(z576, z574, kg5, i19, h, z573);
                }
            }
        }
    }
}
