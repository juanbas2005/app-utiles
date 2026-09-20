package defpackage;

import java.util.List;

/* renamed from: ua5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ua5 {
    public final ay4 a;
    public final yo4 b = new yo4();
    public final zo4 c = new zo4();
    public final wo4 d;
    public final yo4 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final t24 n;
    public final cf4 o;

    public ua5(ay4 ay4, t24 t24, m24 m24) {
        this.a = ay4;
        yo4 yo4 = ne3.a;
        int i2 = he3.a;
        this.d = new wo4();
        this.e = new yo4();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = t24;
        this.o = new cf4(m24);
    }

    public final int a(cf4 cf4, int i2, boolean z) {
        List list;
        List list2;
        yo4 yo4 = this.e;
        if (yo4.a(i2)) {
            Object b2 = yo4.b(i2);
            b2.getClass();
            return ((mh0) b2).b;
        }
        yo4 yo42 = this.b;
        int i3 = 0;
        if (!yo42.a(i2)) {
            kh0 kh0 = new kh0(this, cf4, 0);
            long j2 = cf4.q().u;
            t24 t24 = (t24) cf4.z;
            if (t24 != null) {
                int i4 = i2;
                yo42.i(i4, sg3.D(t24.a(i4, j2, true, new w34(14, kh0, cf4))));
                if (!z || (list = (List) yo42.b(i4)) == null) {
                    return -1;
                }
                int size = list.size();
                while (i3 < size) {
                    ((s24) list.get(i3)).a();
                    i3++;
                }
                return -1;
            }
            sg3.a0("state");
            throw null;
        } else if (!z || (list2 = (List) yo42.b(i2)) == null) {
            return -1;
        } else {
            int size2 = list2.size();
            while (i3 < size2) {
                ((s24) list2.get(i3)).a();
                i3++;
            }
            return -1;
        }
    }

    public final boolean b() {
        if (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [mh0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    public final void c(cf4 cf4, int i2, int i3) {
        mh0 mh0;
        int i4;
        int i5;
        yo4 yo4 = this.e;
        mh0 mh02 = (mh0) yo4.b(i2);
        pe2 pe2 = mh0.c;
        if (mh02 != null) {
            mh02.b = i3;
            mh02.a = pe2;
            mh0 = mh02;
        } else {
            ? obj = new Object();
            obj.a = pe2;
            obj.b = i3;
            mh0 = obj;
        }
        yo4.i(i2, mh0);
        if (i2 > this.i) {
            this.i = i2;
            this.k -= i3;
        } else if (i2 < this.h) {
            this.h = i2;
            this.j -= i3;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i5 = this.i + 1;
            }
            i4 = -1;
            if (i4 > 0) {
                cf4.getClass();
                if (i4 != -1 && i4 < this.m) {
                    kh0 kh0 = new kh0(this, cf4, 1);
                    long j2 = cf4.q().u;
                    t24 t24 = (t24) cf4.z;
                    if (t24 != null) {
                        this.b.i(i4, sg3.D(t24.a(i4, j2, true, new w34(14, kh0, cf4))));
                    } else {
                        sg3.a0("state");
                        throw null;
                    }
                }
            }
            h();
        }
        if (Math.signum(this.f) > 0.0f && this.j > 0) {
            i5 = this.h - 1;
        }
        i4 = -1;
        if (i4 > 0) {
        }
        h();
        i4 = i5;
        if (i4 > 0) {
        }
        h();
    }

    public final void d(cf4 cf4, int i2, int i3, int i4, int i5, int i6, float f2, boolean z) {
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        if (Math.signum(f2) == Math.signum(this.f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || this.l) {
                this.k = i4 - i5;
                this.i = i3;
            } else {
                int C = dh4.C(Math.abs(f2)) + this.k;
                int i9 = i4 - i5;
                if (C > i9) {
                    C = i9;
                }
                this.k = C;
            }
            while (this.k > 0) {
                int i10 = this.i;
                cf4.getClass();
                if (i10 != -1 && (i8 = this.i) < this.m - 1) {
                    if (i8 + 1 != i3 + 1 || f2 == 0.0f || Math.abs(f2) < ((float) i5)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int a2 = a(cf4, this.i + 1, z4);
                    if (a2 != -1) {
                        this.i++;
                        this.k -= a2;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            return;
        }
        if (!z2 || this.l) {
            this.j = i4 - i6;
            this.h = i2;
        } else {
            int C2 = dh4.C(Math.abs(f2)) + this.j;
            int i11 = i4 - i6;
            if (C2 > i11) {
                C2 = i11;
            }
            this.j = C2;
        }
        while (this.j > 0 && (i7 = this.h) > 0) {
            if (i7 - 1 != i2 - 1 || f2 == 0.0f || Math.abs(f2) < ((float) i6)) {
                z3 = false;
            } else {
                z3 = true;
            }
            int a3 = a(cf4, this.h - 1, z3);
            if (a3 != -1) {
                this.h--;
                this.j -= a3;
            } else {
                return;
            }
        }
    }

    public final void e(float f2, db5 db5) {
        ua5 ua5;
        boolean z;
        int i2;
        boolean z2;
        cf4 cf4 = this.o;
        cf4.y = db5;
        cf4.z = this.n;
        float f3 = -f2;
        h();
        if (cf4.o()) {
            za5.q(cf4.q());
            cf4.q();
            this.m = cf4.t();
            int l2 = cf4.l();
            int p = cf4.p();
            int t = cf4.t();
            int s = cf4.s();
            int r = cf4.r();
            int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            yo4 yo4 = this.e;
            if (i3 <= 0) {
                this.j = 0 - s;
                this.h = l2;
                while (this.j > 0 && (r11 = this.h) > 0 && yo4.a(r11 - 1)) {
                    Object b2 = yo4.b(this.h - 1);
                    b2.getClass();
                    this.h--;
                    this.j -= ((mh0) b2).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - r;
                this.i = p;
                while (this.k > 0 && (r11 = this.i) < t - 1 && yo4.a(r11 + 1)) {
                    Object b3 = yo4.b(this.i + 1);
                    b3.getClass();
                    int i4 = ((mh0) b3).b;
                    this.i++;
                    this.k -= i4;
                }
                f(this.i + 1, t - 1);
            }
        }
        if (cf4.o()) {
            za5.q(cf4.q());
            if (cf4.q().t != null) {
                i2 = ((ob5) this.a.x).o;
                z = false;
            } else {
                z = false;
                i2 = 0;
            }
            int l3 = cf4.l();
            int p2 = cf4.p();
            int s2 = cf4.s();
            int r2 = cf4.r();
            if (f3 <= 0.0f) {
                z2 = true;
            } else {
                z2 = z;
            }
            ua5 = this;
            ua5.d(cf4, l3, p2, i2, r2, s2, f3, z2);
        } else {
            ua5 = this;
        }
        ua5.f = f3;
        ua5.h();
    }

    public final void f(int i2, int i3) {
        long j2;
        long j3;
        long j4;
        char c2;
        char c3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i4;
        char c4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        zo4 zo4 = this.c;
        zo4.b();
        yo4 yo4 = this.b;
        int[] iArr3 = yo4.b;
        long[] jArr3 = yo4.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i8 = 0;
            j4 = 128;
            j3 = 255;
            while (true) {
                long j5 = jArr3[i8];
                c2 = 7;
                j2 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j5 & 255) < 128 && i6 <= (i5 = iArr3[(i8 << 3) + i10]) && i5 <= i7) {
                            zo4.a(i5);
                        }
                        j5 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        } else {
            c2 = 7;
            j4 = 128;
            j3 = 255;
            j2 = -9187201950435737472L;
        }
        wo4 wo4 = this.d;
        int[] iArr4 = wo4.b;
        long[] jArr4 = wo4.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr4[i11];
                if ((((~j6) << c2) & j6 & j2) != j2) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j6 & j3) < j4) {
                            c4 = c2;
                            int i14 = iArr4[(i11 << 3) + i13];
                            if (i6 <= i14 && i14 <= i7) {
                                zo4.a(i14);
                            }
                        } else {
                            c4 = c2;
                        }
                        j6 >>= 8;
                        i13++;
                        c2 = c4;
                    }
                    c3 = c2;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c3 = c2;
                }
                if (i11 == length2) {
                    break;
                }
                i11++;
                c2 = c3;
            }
        } else {
            c3 = c2;
        }
        yo4 yo42 = this.e;
        int[] iArr5 = yo42.b;
        long[] jArr5 = yo42.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i15 = 0;
            while (true) {
                long j7 = jArr5[i15];
                if ((((~j7) << c3) & j7 & j2) != j2) {
                    int i16 = 8 - ((~(i15 - length3)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j7 & j3) < j4 && i6 <= (i4 = iArr5[(i15 << 3) + i17]) && i4 <= i7) {
                            zo4.a(i4);
                        }
                        j7 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length3) {
                    break;
                }
                i15++;
            }
        }
        int[] iArr6 = zo4.b;
        long[] jArr6 = zo4.a;
        int length4 = jArr6.length - 2;
        if (length4 >= 0) {
            int i18 = 0;
            while (true) {
                long j8 = jArr6[i18];
                if ((((~j8) << c3) & j8 & j2) != j2) {
                    int i19 = 8 - ((~(i18 - length4)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j8 & j3) < j4) {
                            int i21 = iArr6[(i18 << 3) + i20];
                            List list = (List) yo4.g(i21);
                            if (list != null) {
                                int size = list.size();
                                for (int i22 = 0; i22 < size; i22++) {
                                    ((s24) list.get(i22)).cancel();
                                }
                            }
                            int c5 = wo4.c(i21);
                            if (c5 >= 0) {
                                wo4.e--;
                                long[] jArr7 = wo4.a;
                                int i23 = wo4.d;
                                int i24 = c5 >> 3;
                                int i25 = (c5 & 7) << 3;
                                iArr2 = iArr6;
                                jArr2 = jArr6;
                                long j9 = (jArr7[i24] & (~(j3 << i25))) | (254 << i25);
                                jArr7[i24] = j9;
                                jArr7[(((c5 - 7) & i23) + (i23 & 7)) >> 3] = j9;
                            } else {
                                iArr2 = iArr6;
                                jArr2 = jArr6;
                            }
                            yo42.g(i21);
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        j8 >>= 8;
                        i20++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    iArr = iArr6;
                    jArr = jArr6;
                    if (i19 != 8) {
                        return;
                    }
                } else {
                    iArr = iArr6;
                    jArr = jArr6;
                }
                if (i18 != length4) {
                    i18++;
                    iArr6 = iArr;
                    jArr6 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        yo4 yo4 = this.b;
        long[] jArr = yo4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = yo4.b[i5];
                            List list = (List) yo4.c[i5];
                            int size = list.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((s24) list.get(i7)).cancel();
                            }
                            yo4.h(i5);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        ag8.L((long) this.j, "prefetchWindowStartExtraSpace");
        ag8.L((long) this.k, "prefetchWindowEndExtraSpace");
        ag8.L((long) this.h, "prefetchWindowStartIndex");
        ag8.L((long) this.i, "prefetchWindowEndIndex");
    }
}
