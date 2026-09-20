package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: dd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dd4 extends eh5 implements rm4, q95, oh4 {
    public yc4 B;
    public vr2 C;
    public gs2 D;
    public vr2 E;
    public gh5 F;
    public tp4 G;
    public boolean H;
    public tp4 I;
    public boolean J;
    public boolean K;
    public final ed4 L = new ed4(0, this);
    public ao M;
    public tp4 N;

    public static void N0(xz4 xz4) {
        uy3 uy3;
        vy3 vy3;
        xz4 xz42 = xz4.P;
        uy3 uy32 = xz4.O;
        if (xz42 != null) {
            uy3 = xz42.O;
        } else {
            uy3 = null;
        }
        if (!sg3.e(uy3, uy32)) {
            uy32.b0.p.T.f();
            return;
        }
        qb g = uy32.b0.p.g();
        if (g != null && (vy3 = ((kh4) g).T) != null) {
            vy3.f();
        }
    }

    public abstract dy3 B0();

    public abstract boolean D0();

    public final mh4 E(int i, int i2, pb pbVar, z0 z0Var, Map map, wd wdVar) {
        if (!((i & -16777216) == 0 && (-16777216 & i2) == 0)) {
            yb3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new cd4(i, i2, map, pbVar, z0Var, wdVar, this);
    }

    public abstract uy3 G0();

    public final void I(boolean z) {
        uy3 uy3;
        qy3 qy3;
        dd4 K0 = K0();
        qy3 qy32 = null;
        if (K0 != null) {
            uy3 = K0.G0();
        } else {
            uy3 = null;
        }
        if (sg3.e(uy3, G0())) {
            this.H = z;
            return;
        }
        if (uy3 != null) {
            qy3 = uy3.b0.d;
        } else {
            qy3 = null;
        }
        if (qy3 != qy3.y) {
            if (uy3 != null) {
                qy32 = uy3.b0.d;
            }
            if (qy32 != qy3.z) {
                return;
            }
        }
        this.H = z;
    }

    public abstract mh4 J0();

    public abstract dd4 K0();

    public abstract long L0();

    public final yc4 M0() {
        yc4 yc4 = this.B;
        if (yc4 != null) {
            return yc4;
        }
        yc4 yc42 = new yc4(this);
        this.B = yc42;
        return yc42;
    }

    public final void O0(up4 up4) {
        uy3 uy3;
        Object[] objArr = up4.b;
        long[] jArr = up4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (uy3 = (uy3) ((n88) objArr[(i << 3) + i3]).get()) != null) {
                            if (a0()) {
                                uy3.W(false);
                            } else {
                                uy3.Y(false);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void P0();

    public final void Q0() {
        ao aoVar = this.M;
        if (aoVar != null) {
            int i = aoVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((k23[]) aoVar.b)[i2] = null;
                ((float[]) aoVar.c)[i2] = Float.NaN;
                ((byte[]) aoVar.d)[i2] = 0;
            }
            aoVar.a = 0;
        }
        tp4 tp4 = this.N;
        if (tp4 != null) {
            Object[] objArr = tp4.c;
            long[] jArr = tp4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                O0((up4) objArr[(i3 << 3) + i5]);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            tp4.a();
        }
    }

    public final int X(kb kbVar) {
        int p0;
        long j;
        if (!D0() || (p0 = p0(kbVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = kbVar instanceof m48;
        long j2 = this.A;
        if (z) {
            j = j2 >> 32;
        } else {
            j = 4294967295L & j2;
        }
        return p0 + ((int) j);
    }

    public boolean a0() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0175  */
    public final void n0(uy3 uy3, k23 k23) {
        long j;
        long j2;
        char c;
        long j3;
        tp4 tp4;
        tp4 tp42;
        Object g;
        long[] jArr;
        int i;
        long j4;
        long[] jArr2;
        long j5;
        long j6;
        char c2;
        int i2;
        int i3;
        int i4;
        k23 k232 = k23;
        tp4 tp43 = this.N;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (tp43 != null) {
            Object[] objArr = tp43.c;
            long[] jArr3 = tp43.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j3 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                up4 up4 = (up4) objArr[(i6 << 3) + i8];
                                j6 = j7;
                                Object[] objArr2 = up4.b;
                                long[] jArr4 = up4.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j5 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j6) != j6) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j5) {
                                                    int i14 = (i9 << 3) + i13;
                                                    uy3 uy32 = (uy3) ((n88) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (uy32 != null) {
                                                        boolean J2 = uy32.J();
                                                        i4 = i8;
                                                        if (J2) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    up4.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j5 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j6 = j7;
                                j5 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j6;
                            j8 = j5;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j2 = j7;
                        j = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j2 = j7;
                        j = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j2;
                    j8 = j;
                    jArr3 = jArr;
                    i5 = 8;
                }
                tp4 = this.N;
                if (tp4 != null) {
                    long[] jArr5 = tp4.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j2) != j2) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j3) < j) {
                                        int i18 = (i15 << 3) + i17;
                                        k23 k233 = (k23) tp4.b[i18];
                                        if (((up4) tp4.c[i18]).g()) {
                                            tp4.l(i18);
                                        }
                                    }
                                    j11 >>= 8;
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
                }
                tp42 = this.N;
                if (tp42 == null) {
                    tp42 = new tp4();
                    this.N = tp42;
                }
                g = tp42.g(k232);
                if (g == null) {
                    g = new up4();
                    tp42.m(k232, g);
                }
                ((up4) g).k(new WeakReference(uy3));
            }
        }
        c = 7;
        j2 = -9187201950435737472L;
        j3 = 255;
        j = 128;
        tp4 = this.N;
        if (tp4 != null) {
        }
        tp42 = this.N;
        if (tp42 == null) {
        }
        g = tp42.g(k232);
        if (g == null) {
        }
        ((up4) g).k(new WeakReference(uy3));
    }

    public abstract int p0(kb kbVar);

    public boolean r() {
        return G0().J();
    }

    public final void s0(gh5 gh5, long j, long j2) {
        char c;
        long j3;
        boolean z;
        long j4;
        long j5;
        uy3 uy3;
        char c2;
        boolean z2;
        int i;
        long j6;
        dd4 dd4;
        up4 up4;
        r95 snapshotObserver;
        tp4 tp4 = this.N;
        ao aoVar = this.M;
        if (aoVar == null) {
            aoVar = new ao();
            this.M = aoVar;
        }
        ao aoVar2 = aoVar;
        p95 p95 = G0().J;
        if (!(p95 == null || (snapshotObserver = ((je) p95).getSnapshotObserver()) == null)) {
            gh5 gh52 = gh5;
            snapshotObserver.a.e(gh52, xc4.y, new zc4(this, j, j2, gh52));
        }
        boolean a0 = a0();
        up4 up42 = (up4) aoVar2.e;
        up4 up43 = (up4) aoVar2.f;
        int i2 = aoVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) aoVar2.d)[i3];
            if (b == 3) {
                k23 k23 = ((k23[]) aoVar2.b)[i3];
                k23.getClass();
                up43.k(k23);
            } else if (!(b == 0 || tp4 == null)) {
                k23 k232 = ((k23[]) aoVar2.b)[i3];
                k232.getClass();
                up4 up44 = (up4) tp4.k(k232);
                if (up44 != null) {
                    up42.j(up44);
                }
            }
        }
        int i4 = aoVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) aoVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                k23[] k23Arr = (k23[]) aoVar2.b;
                k23Arr[i6 - i5] = k23Arr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = aoVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((k23[]) aoVar2.b)[i8] = null;
        }
        aoVar2.a -= i5;
        dd4 K0 = K0();
        Object[] objArr = up43.b;
        long[] jArr = up43.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j3 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            k23 k233 = (k23) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (K0 == null) {
                                dd4 = this;
                            } else {
                                dd4 = K0;
                            }
                            i = i9;
                            dd4 dd42 = dd4;
                            while (true) {
                                ao aoVar3 = dd42.M;
                                if (aoVar3 != null) {
                                    z2 = a0;
                                    if (qs.F0(k233, (k23[]) aoVar3.b)) {
                                        break;
                                    }
                                } else {
                                    z2 = a0;
                                }
                                dd4 K02 = dd42.K0();
                                if (K02 == null) {
                                    break;
                                }
                                dd42 = K02;
                                a0 = z2;
                            }
                            tp4 tp42 = dd42.N;
                            if (tp42 != null) {
                                up4 = (up4) tp42.k(k233);
                            } else {
                                up4 = null;
                            }
                            if (up4 != null) {
                                dd4.O0(up4);
                            }
                        } else {
                            z2 = a0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        a0 = z2;
                    }
                    z = a0;
                    c = c3;
                    j4 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = a0;
                    c = c3;
                    j4 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j4;
                a0 = z;
                i9 = 8;
            }
        } else {
            z = a0;
            c = 7;
            j4 = -9187201950435737472L;
            j3 = 128;
            j5 = 255;
        }
        up43.b();
        Object[] objArr2 = up42.b;
        long[] jArr2 = up42.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j4) != j4) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j3 && (uy3 = (uy3) ((n88) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                uy3.W(false);
                            } else {
                                uy3.Y(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                }
                i13++;
            }
        }
        up42.b();
    }

    public final mh4 u(int i, int i2, Map map, vr2 vr2, vr2 vr22) {
        if (!((i & -16777216) == 0 && (-16777216 & i2) == 0)) {
            yb3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new bd4(i, i2, map, vr2, vr22, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: up4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r21v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0141 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    public final void u0(mh4 mh4) {
        boolean z;
        char c;
        long j;
        long j2;
        long j3;
        yc4 yc4;
        tp4 tp4;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        int i2;
        Object[] objArr2;
        boolean z2;
        up4 up4;
        yc4 yc42;
        long j4;
        mh4 mh42 = mh4;
        if (!this.K) {
            vr2 g = mh42.g();
            gs2 f = mh42.f();
            vr2 d = mh42.d();
            long j5 = 0;
            if (f == null) {
                long j6 = 9223372034707292159L;
                if (g == null) {
                    Q0();
                    this.C = null;
                    this.D = null;
                    this.E = null;
                    yc4 yc43 = this.B;
                    if (yc43 != null) {
                        yc43.w = false;
                    }
                    if (yc43 != null) {
                        yc43.x = 9223372034707292159L;
                        return;
                    }
                    return;
                }
                boolean z3 = false;
                this.D = null;
                this.E = null;
                if (this.C != g) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && M0().w) {
                    dy3 B0 = B0();
                    j6 = gr8.V(B0.w(0));
                    j5 = B0.k();
                    if (!oe3.a(j6, M0().x) || !we3.a(j5, M0().y)) {
                        z3 = true;
                    }
                    z = z3;
                }
                if (z) {
                    gh5 gh5 = this.F;
                    if (gh5 != null) {
                        gh5.w = mh42;
                    } else {
                        gh5 = new gh5(mh42, this, (k23) null);
                        this.F = gh5;
                    }
                    s0(gh5, j6, j5);
                    this.C = mh42.g();
                }
            } else if (f == this.D && d == this.E) {
                tp4 tp42 = this.I;
                long j7 = -9187201950435737472L;
                int i3 = 8;
                if (tp42 != null) {
                    Object[] objArr3 = tp42.c;
                    long[] jArr3 = tp42.a;
                    j3 = 128;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        c = 7;
                        int i4 = 0;
                        yc42 = null;
                        while (true) {
                            long j8 = jArr3[i4];
                            j2 = 255;
                            if ((((~j8) << 7) & j8 & j7) != j7) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                int i6 = 0;
                                while (i6 < i5) {
                                    if ((j8 & 255) < 128) {
                                        j4 = j7;
                                        yc4 yc44 = objArr3[(i4 << 3) + i6];
                                        if (yc44.w) {
                                            yc42 = yc44;
                                        }
                                    } else {
                                        j4 = j7;
                                    }
                                    j8 >>= 8;
                                    i6++;
                                    j7 = j4;
                                }
                                j = j7;
                                if (i5 != 8) {
                                    break;
                                }
                            } else {
                                j = j7;
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                            j7 = j;
                        }
                    } else {
                        j = -9187201950435737472L;
                        c = 7;
                        j2 = 255;
                        yc42 = null;
                    }
                    yc4 = yc42;
                } else {
                    j = -9187201950435737472L;
                    c = 7;
                    j3 = 128;
                    j2 = 255;
                    yc4 = null;
                }
                if (yc4 != null) {
                    dy3 B02 = B0();
                    long V = gr8.V(B02.w(0));
                    long k = B02.k();
                    if ((!oe3.a(V, yc4.x) || !we3.a(k, yc4.y)) && (tp4 = this.I) != null) {
                        Object[] objArr4 = tp4.b;
                        Object[] objArr5 = tp4.c;
                        long[] jArr4 = tp4.a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j9 = jArr4[i7];
                                int i8 = length2;
                                if ((((~j9) << c) & j9 & j) != j) {
                                    int i9 = 8 - ((~(i7 - i8)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((j9 & j2) < j3) {
                                            int i11 = (i7 << 3) + i10;
                                            Object obj = objArr4[i11];
                                            yc4 yc45 = (yc4) objArr5[i11];
                                            i2 = i3;
                                            k23 k23 = (k23) obj;
                                            jArr2 = jArr4;
                                            if (yc45.w) {
                                                objArr2 = objArr4;
                                                if (!we3.a(yc45.y, k) || !oe3.a(yc45.x, V)) {
                                                    z2 = true;
                                                    yc45.y = k;
                                                    yc45.x = V;
                                                    yc45.w = false;
                                                    if (z2) {
                                                        ao aoVar = this.M;
                                                        if (aoVar != null) {
                                                            aoVar.h(k23);
                                                        }
                                                        tp4 tp43 = this.N;
                                                        if (tp43 != null) {
                                                            up4 = tp43.g(k23);
                                                        } else {
                                                            up4 = null;
                                                        }
                                                        if (up4 != null) {
                                                            O0(up4);
                                                            up4.b();
                                                        }
                                                    }
                                                }
                                            } else {
                                                objArr2 = objArr4;
                                            }
                                            z2 = false;
                                            yc45.y = k;
                                            yc45.x = V;
                                            yc45.w = false;
                                            if (z2) {
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            objArr2 = objArr4;
                                            i2 = i3;
                                        }
                                        j9 >>= i2;
                                        i10++;
                                        objArr4 = objArr2;
                                        i3 = i2;
                                        jArr4 = jArr2;
                                    }
                                    jArr = jArr4;
                                    objArr = objArr4;
                                    i = i3;
                                    if (i9 != i) {
                                        return;
                                    }
                                } else {
                                    jArr = jArr4;
                                    objArr = objArr4;
                                    i = i3;
                                }
                                length2 = i8;
                                if (i7 != length2) {
                                    i7++;
                                    i3 = i;
                                    objArr4 = objArr;
                                    jArr4 = jArr;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                this.D = f;
                this.E = d;
                Q0();
            }
        }
    }

    public abstract dd4 x0();
}
