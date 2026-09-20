package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: yt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yt2 {
    public int A;
    public int B;
    public boolean C;
    public final xt2 D;
    public final ArrayList E;
    public boolean F;
    public fv6 G;
    public gv6 H;
    public jv6 I;
    public boolean J;
    public vf5 K;
    public bn0 L;
    public final by0 M;
    public st2 N;
    public kg2 O;
    public ps6 P;
    public final ny0 Q;
    public final e81 R;
    public boolean S;
    public long T;
    public zt2 U;
    public final gs7 a;
    public final ky0 b;
    public final gv6 c;
    public final wp4 d;
    public final bn0 e;
    public final bn0 f;
    public final f96 g;
    public final py0 h;
    public final ArrayList i = new ArrayList();
    public bu2 j;
    public int k;
    public int l;
    public int m;
    public final xe3 n = new xe3();
    public int[] o;
    public wo4 p;
    public boolean q;
    public boolean r;
    public final ArrayList s = new ArrayList();
    public final xe3 t = new xe3();
    public vf5 u = vf5.z;
    public yo4 v;
    public boolean w;
    public final xe3 x = new xe3();
    public boolean y;
    public int z = -1;

    /* JADX INFO: finally extract failed */
    public yt2(gs7 gs7, ky0 ky0, gv6 gv6, wp4 wp4, bn0 bn0, bn0 bn02, f96 f96, py0 py0) {
        boolean z2;
        this.a = gs7;
        this.b = ky0;
        this.c = gv6;
        this.d = wp4;
        this.e = bn0;
        this.f = bn02;
        this.g = f96;
        this.h = py0;
        if (ky0.g() || ky0.e()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.C = z2;
        this.D = new xt2(0, this);
        this.E = new ArrayList();
        fv6 n2 = gv6.n();
        n2.c();
        this.G = n2;
        gv6 gv62 = new gv6();
        if (ky0.g()) {
            gv62.g();
        }
        if (ky0.e()) {
            gv62.G = new yo4();
        }
        this.H = gv62;
        jv6 o2 = gv62.o();
        o2.e(true);
        this.I = o2;
        this.M = new by0(this, bn0);
        fv6 n3 = this.H.n();
        try {
            st2 a2 = n3.a(0);
            n3.c();
            this.N = a2;
            this.O = new kg2();
            this.Q = new ny0(this);
            e81 k2 = ky0.k();
            e81 D2 = D();
            this.R = k2.X(D2 == null ? x32.w : D2);
        } catch (Throwable th) {
            n3.c();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    public static final hn4 S(int i2, yt2 yt2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int r2;
        int i3 = yt2.G.i(i2);
        fv6 fv6 = yt2.G;
        Object p2 = fv6.p(fv6.b, i2);
        if (i3 != 126665345 || !(p2 instanceof fn4)) {
            return null;
        }
        if (yt2.G.d(i2)) {
            ArrayList arrayList3 = new ArrayList();
            T(yt2, arrayList3, i2);
            if (!arrayList3.isEmpty()) {
                arrayList = arrayList3;
                fv6 fv62 = yt2.G;
                Object p3 = fv62.p(fv62.b, i2);
                p3.getClass();
                fn4 fn4 = (fn4) p3;
                Object h2 = yt2.G.h(i2, 0);
                st2 a2 = yt2.G.a(i2);
                int i4 = yt2.G.b[(i2 * 5) + 3] + i2;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = yt2.s;
                r2 = b96.r(i2, arrayList2);
                if (r2 < 0) {
                    r2 = -(r2 + 1);
                }
                while (r2 < arrayList2.size()) {
                    ch3 ch3 = (ch3) arrayList2.get(r2);
                    if (ch3.b >= i4) {
                        break;
                    }
                    arrayList4.add(new yb5(ch3.a, ch3.c));
                    r2++;
                }
                return new hn4(fn4, h2, yt2.h, yt2.c, a2, arrayList4, yt2.n(i2), arrayList);
            }
        }
        arrayList = null;
        fv6 fv622 = yt2.G;
        Object p32 = fv622.p(fv622.b, i2);
        p32.getClass();
        fn4 fn42 = (fn4) p32;
        Object h22 = yt2.G.h(i2, 0);
        st2 a22 = yt2.G.a(i2);
        int i42 = yt2.G.b[(i2 * 5) + 3] + i2;
        ArrayList arrayList42 = new ArrayList();
        arrayList2 = yt2.s;
        r2 = b96.r(i2, arrayList2);
        if (r2 < 0) {
        }
        while (r2 < arrayList2.size()) {
        }
        return new hn4(fn42, h22, yt2.h, yt2.c, a22, arrayList42, yt2.n(i2), arrayList);
    }

    public static final void T(yt2 yt2, ArrayList arrayList, int i2) {
        int i3 = yt2.G.b[(i2 * 5) + 3] + i2;
        int i4 = i2 + 1;
        while (i4 < i3) {
            if (yt2.G.j(i4)) {
                hn4 S2 = S(i4, yt2);
                if (S2 != null) {
                    arrayList.add(S2);
                }
            } else if (yt2.G.d(i4)) {
                T(yt2, arrayList, i4);
            }
            i4 += yt2.G.b[(i4 * 5) + 3];
        }
    }

    public static final int U(yt2 yt2, int i2, int i3, boolean z2, int i4) {
        int i5;
        boolean z3;
        int i6;
        cu2 cu2;
        v36 v36;
        Object[] objArr;
        long[] jArr;
        int i7;
        Object[] objArr2;
        long[] jArr2;
        int i8;
        int i9;
        by0 by0;
        bn0 bn0;
        int i10;
        yt2 yt22 = yt2;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        fv6 fv6 = yt22.G;
        int i14 = 0;
        if (fv6.j(i12)) {
            int i15 = fv6.i(i12);
            Object p2 = fv6.p(fv6.b, i12);
            if (i15 == 126665345 && (p2 instanceof fn4)) {
                hn4 S2 = S(i12, yt22);
                if (S2 != null) {
                    yt22.b.c(S2);
                    yt22.M.e();
                    by0 by02 = yt22.M;
                    py0 py0 = yt22.h;
                    ky0 ky0 = yt22.b;
                    j75 j75 = by02.b.u;
                    j75.s(o65.d);
                    i75.n(j75, py0, ky0, S2);
                }
                if (!z2 || i12 == i11) {
                    return fv6.o(i12);
                }
                by0 by03 = yt22.M;
                by03.c();
                by03.b();
                yt2 yt23 = by03.a;
                if (yt23.G.l(i12)) {
                    i10 = 1;
                } else {
                    i10 = yt23.G.o(i12);
                }
                if (i10 > 0) {
                    by03.f(i13, i10);
                }
                return 0;
            } else if (i15 != 206 || !sg3.e(p2, ey0.e)) {
                i5 = 1;
                if (!fv6.l(i12)) {
                    return fv6.o(i12);
                }
            } else {
                Object h2 = fv6.h(i12, 0);
                vt2 vt2 = null;
                if (h2 instanceof cu2) {
                    cu2 = (cu2) h2;
                } else {
                    cu2 = null;
                }
                if (cu2 != null) {
                    v36 = cu2.a;
                } else {
                    v36 = null;
                }
                if (v36 instanceof vt2) {
                    vt2 = (vt2) v36;
                }
                if (vt2 != null) {
                    up4 up4 = vt2.w.e;
                    Object[] objArr3 = up4.b;
                    long[] jArr3 = up4.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j2 = jArr3[i16];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i17 = 8;
                                int i18 = 8 - ((~(i16 - length)) >>> 31);
                                int i19 = i14;
                                while (i19 < i18) {
                                    if ((255 & j2) < 128) {
                                        yt2 yt24 = (yt2) objArr3[(i16 << 3) + i19];
                                        gv6 gv6 = yt24.c;
                                        if (gv6.x <= 0 || (gv6.w[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i9 = i14;
                                            i8 = i17;
                                        } else {
                                            py0 py02 = yt24.h;
                                            synchronized (py02.z) {
                                                py02.s();
                                                i8 = i17;
                                                tp4 tp4 = py02.J;
                                                py02.J = fb5.d();
                                                try {
                                                    py02.R.l0(tp4);
                                                } catch (Throwable th) {
                                                    py02.J = tp4;
                                                    throw th;
                                                }
                                            }
                                            bn0 bn02 = new bn0();
                                            yt24.L = bn02;
                                            fv6 n2 = yt24.c.n();
                                            try {
                                                yt24.G = n2;
                                                by0 = yt24.M;
                                                bn0 = by0.b;
                                                by0.b = bn02;
                                                yt24.R(0);
                                                by0 by04 = yt24.M;
                                                by04.b();
                                                jArr2 = jArr3;
                                                if (by04.c) {
                                                    objArr2 = objArr3;
                                                    by04.b.u.s(v65.d);
                                                    if (by04.c) {
                                                        by04.d(false);
                                                        by04.d(false);
                                                        by04.b.u.s(e65.d);
                                                        i9 = 0;
                                                        by04.c = false;
                                                        by0.b = bn0;
                                                        n2.c();
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                i9 = 0;
                                                by0.b = bn0;
                                                n2.c();
                                            } catch (Throwable th2) {
                                                n2.c();
                                                throw th2;
                                            }
                                        }
                                        yt22.b.u(yt24.h);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i9 = i14;
                                        i8 = i17;
                                    }
                                    j2 >>= i8;
                                    i19++;
                                    i17 = i8;
                                    objArr3 = objArr2;
                                    i14 = i9;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                i7 = i14;
                                if (i18 != i17) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i7 = i14;
                            }
                            if (i16 == length) {
                                break;
                            }
                            i16++;
                            objArr3 = objArr;
                            i14 = i7;
                            jArr3 = jArr;
                        }
                    }
                }
                return fv6.o(i12);
            }
        } else {
            i5 = 1;
            if (fv6.d(i12)) {
                int i20 = fv6.b[(i12 * 5) + 3] + i12;
                int i21 = 0;
                for (int i22 = i12 + 1; i22 < i20; i22 += fv6.b[(i22 * 5) + 3]) {
                    boolean l2 = fv6.l(i22);
                    if (l2) {
                        yt22.M.c();
                        by0 by05 = yt22.M;
                        Object n3 = fv6.n(i22);
                        by05.c();
                        by05.h.add(n3);
                    }
                    if (l2 || z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l2) {
                        i6 = 0;
                    } else {
                        i6 = i13 + i21;
                    }
                    i21 += U(yt22, i11, i22, z3, i6);
                    if (l2) {
                        yt22.M.c();
                        yt22.M.a();
                    }
                }
                if (fv6.l(i12)) {
                    return i5;
                }
                return i21;
            } else if (!fv6.l(i12)) {
                return fv6.o(i12);
            }
        }
        return i5;
    }

    public final vf5 A() {
        return m();
    }

    public final yx5 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            return (yx5) b81.k(1, arrayList);
        }
        return null;
    }

    public final boolean C() {
        if (!F() || this.w) {
            return true;
        }
        yx5 B2 = B();
        if (B2 == null || (B2.b & 4) == 0) {
            return false;
        }
        return true;
    }

    public final ny0 D() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        yx5 B2;
        if (this.S || this.y || this.w || (B2 = B()) == null || (B2.b & 8) != 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: st2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012d A[Catch:{ all -> 0x025f, all -> 0x00af, all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f A[Catch:{ all -> 0x025f, all -> 0x00af, all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f5 A[Catch:{ all -> 0x021d }] */
    public final void G(ArrayList arrayList) {
        ky0 ky0;
        int i2;
        int i3;
        gv6 gv6;
        gv6 gv62;
        gn4 gn4;
        st2 st2;
        ArrayList arrayList2;
        fv6 n2;
        st2 st22;
        fv6 n3;
        fv6 fv6;
        fv6 fv62;
        int[] iArr;
        yo4 yo4;
        yo4 yo42;
        int[] iArr2;
        bn0 bn0;
        bn0 bn02;
        bn0 bn03;
        boolean z2;
        int[] iArr3;
        boolean z3;
        yo4 yo43;
        py0 py0;
        py0 py02;
        Integer valueOf;
        boolean z4;
        fv6 fv63;
        yt2 yt2 = this;
        ky0 ky02 = yt2.b;
        bn0 bn04 = yt2.f;
        by0 by0 = yt2.M;
        bn0 bn05 = by0.b;
        by0.b = bn04;
        bn04.u.s(t65.d);
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            yb5 yb5 = (yb5) arrayList.get(i5);
            hn4 hn4 = (hn4) yb5.w;
            hn4 hn42 = (hn4) yb5.x;
            st2 m2 = hj8.m(hn4.e);
            gv6 d2 = iv6.d(hn4.d);
            int f2 = d2.f(m2);
            te3 te3 = new te3();
            by0.b();
            j75 j75 = by0.b.u;
            j75.s(b65.d);
            i75.m(j75, i4, te3, 1, m2);
            if (hn42 == null) {
                if (d2 == yt2.H) {
                    if (!yt2.I.w) {
                        ey0.a("Check failed");
                    }
                    yt2.y();
                }
                fv6 n4 = d2.n();
                try {
                    n4.r(f2);
                    by0.f = f2;
                    bn0 bn06 = new bn0();
                    mm0 mm0 = new mm0((Object) yt2, (Object) bn06, (Object) n4, (Object) hn4, 1);
                    bn0 bn07 = bn06;
                    fv63 = n4;
                    try {
                        yt2 = this;
                        yt2.L((py0) null, (py0) null, (Integer) null, a42.w, mm0);
                        bn0 bn08 = by0.b;
                        bn08.getClass();
                        if (!bn07.u.r()) {
                            j75 j752 = bn08.u;
                            j752.s(x55.d);
                            i75.m(j752, i4, bn07, 1, te3);
                        }
                        fv63.c();
                        ky0 = ky02;
                        i3 = size;
                        i2 = i5;
                    } catch (Throwable th) {
                        th = th;
                        fv63.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    by0.b = bn05;
                    throw th2;
                }
            } else {
                gn4 p2 = ky02.p(hn42);
                if (p2 != null) {
                    gv6 = iv6.d(p2.a);
                } else {
                    gv6 = null;
                }
                if (gv6 == null) {
                    gv62 = iv6.d(hn42.d);
                } else {
                    gv62 = gv6;
                }
                if (gv6 != null) {
                    if (gv6.C) {
                        ey0.a("use active SlotWriter to create an anchor location instead");
                    }
                    if (gv6.x <= 0) {
                        vm5.a("Parameter index is out of range");
                    }
                    ArrayList arrayList3 = gv6.E;
                    gn4 = p2;
                    int e2 = iv6.e(arrayList3, 0, gv6.x);
                    if (e2 < 0) {
                        ky0 = ky02;
                        st2 = new st2(0);
                        arrayList3.add(-(e2 + 1), st2);
                    } else {
                        ky0 = ky02;
                        st2 = arrayList3.get(e2);
                    }
                    if (st2 != null) {
                        st2 m3 = hj8.m(st2);
                        arrayList2 = new ArrayList();
                        n2 = gv62.n();
                        b96.j(n2, arrayList2, gv62.f(m3));
                        n2.c();
                        if (arrayList2.isEmpty()) {
                            bn0 bn09 = by0.b;
                            bn09.getClass();
                            if (!arrayList2.isEmpty()) {
                                j75 j753 = bn09.u;
                                j753.s(y55.d);
                                st22 = m3;
                                i75.m(j753, 1, arrayList2, 0, te3);
                            } else {
                                st22 = m3;
                            }
                            gv6 gv63 = yt2.c;
                            if (d2 == gv63) {
                                int f3 = gv63.f(m2);
                                yt2.m0(f3, yt2.q0(f3) + arrayList2.size());
                            }
                        } else {
                            st22 = m3;
                        }
                        j75 j754 = by0.b.u;
                        j754.s(z55.d);
                        int i6 = j754.l - j754.g[j754.h - 1].c;
                        Object[] objArr = j754.k;
                        objArr[i6] = gn4;
                        objArr[i6 + 1] = ky0;
                        objArr[i6 + 3] = hn4;
                        objArr[i6 + 2] = hn42;
                        n3 = gv62.n();
                        fv62 = yt2.G;
                        iArr = yt2.o;
                        yo4 = yt2.v;
                        yt2.o = null;
                        yt2.v = null;
                        yt2.G = n3;
                        int f4 = gv62.f(hj8.m(st22));
                        n3.r(f4);
                        by0.f = f4;
                        bn0 = new bn0();
                        bn02 = by0.b;
                        try {
                            by0.b = bn0;
                            z2 = by0.e;
                            iArr3 = iArr;
                            by0.e = false;
                            py0 py03 = hn42.c;
                            yo43 = yo4;
                            try {
                                py0 = hn4.c;
                                py02 = py03;
                                valueOf = Integer.valueOf(n3.g);
                                z4 = z2;
                            } catch (Throwable th3) {
                                th = th3;
                                bn03 = bn02;
                                z3 = z2;
                                fv6 = n3;
                                iArr2 = iArr3;
                                yo42 = yo43;
                                by0.e = z3;
                                throw th;
                            }
                            try {
                                List list = hn42.f;
                                fv6 = n3;
                                i3 = size;
                                iArr2 = iArr3;
                                yo42 = yo43;
                                z3 = z4;
                                i2 = i5;
                                bn03 = bn02;
                                yt2.L(py02, py0, valueOf, list, new f5(22, yt2, hn4));
                            } catch (Throwable th4) {
                                th = th4;
                                bn03 = bn02;
                                fv6 = n3;
                                iArr2 = iArr3;
                                yo42 = yo43;
                                z3 = z4;
                                by0.e = z3;
                                throw th;
                            }
                            try {
                                by0.e = z3;
                                try {
                                    by0.b = bn03;
                                    bn03.getClass();
                                    if (!bn0.u.r()) {
                                        j75 j755 = bn03.u;
                                        j755.s(x55.d);
                                        i75.m(j755, 0, bn0, 1, te3);
                                    }
                                    yt2.G = fv62;
                                    yt2.o = iArr2;
                                    yt2.v = yo42;
                                    fv6.c();
                                } catch (Throwable th5) {
                                    th = th5;
                                    yt2.G = fv62;
                                    yt2.o = iArr2;
                                    yt2.v = yo42;
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                by0.b = bn03;
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            yo42 = yo4;
                            bn03 = bn02;
                            fv6 = n3;
                            iArr2 = iArr;
                            by0.b = bn03;
                            throw th;
                        }
                    }
                } else {
                    gn4 = p2;
                    ky0 = ky02;
                }
                st2 = hn42.e;
                st2 m32 = hj8.m(st2);
                arrayList2 = new ArrayList();
                n2 = gv62.n();
                b96.j(n2, arrayList2, gv62.f(m32));
                n2.c();
                if (arrayList2.isEmpty()) {
                }
                j75 j7542 = by0.b.u;
                j7542.s(z55.d);
                int i62 = j7542.l - j7542.g[j7542.h - 1].c;
                Object[] objArr2 = j7542.k;
                objArr2[i62] = gn4;
                objArr2[i62 + 1] = ky0;
                objArr2[i62 + 3] = hn4;
                objArr2[i62 + 2] = hn42;
                n3 = gv62.n();
                try {
                    fv62 = yt2.G;
                    iArr = yt2.o;
                    yo4 = yt2.v;
                    yt2.o = null;
                    yt2.v = null;
                    try {
                        yt2.G = n3;
                        int f42 = gv62.f(hj8.m(st22));
                        n3.r(f42);
                        by0.f = f42;
                        bn0 = new bn0();
                        bn02 = by0.b;
                        by0.b = bn0;
                        z2 = by0.e;
                        iArr3 = iArr;
                        try {
                            by0.e = false;
                            py0 py032 = hn42.c;
                            yo43 = yo4;
                            py0 = hn4.c;
                            py02 = py032;
                            valueOf = Integer.valueOf(n3.g);
                            z4 = z2;
                            List list2 = hn42.f;
                            fv6 = n3;
                            i3 = size;
                            iArr2 = iArr3;
                            yo42 = yo43;
                            z3 = z4;
                            i2 = i5;
                            bn03 = bn02;
                            try {
                                yt2.L(py02, py0, valueOf, list2, new f5(22, yt2, hn4));
                                by0.e = z3;
                                by0.b = bn03;
                                bn03.getClass();
                                if (!bn0.u.r()) {
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                by0.e = z3;
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            yo42 = yo4;
                            bn03 = bn02;
                            z3 = z2;
                            fv6 = n3;
                            iArr2 = iArr3;
                            by0.e = z3;
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        yo42 = yo4;
                        fv6 = n3;
                        iArr2 = iArr;
                        yt2.G = fv62;
                        yt2.o = iArr2;
                        yt2.v = yo42;
                        throw th;
                    }
                    try {
                        yt2.G = fv62;
                        yt2.o = iArr2;
                        yt2.v = yo42;
                        fv6.c();
                    } catch (Throwable th11) {
                        th = th11;
                        fv6.c();
                        throw th;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    fv6 = n3;
                    fv6.c();
                    throw th;
                }
            }
            by0.b.u.s(v65.d);
            i5 = i2 + 1;
            size = i3;
            ky02 = ky0;
            i4 = 0;
        }
        by0.b();
        by0.b.u.s(f65.d);
        by0.f = 0;
        by0.b = bn05;
    }

    public final void H(fn4 fn4, vf5 vf5, Object obj, boolean z2) {
        boolean z3;
        fn4 fn42 = fn4;
        vf5 vf52 = vf5;
        Object obj2 = obj;
        c0(126665345, fn42);
        I();
        p0(obj2);
        long j2 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                jv6.z(this.I);
            }
            if (!this.S && !sg3.e(this.G.f(), vf52)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                O(vf52);
            }
            Z(ey0.c, 202, vf52, 0);
            this.K = null;
            if (!this.S || z2) {
                boolean z4 = this.w;
                this.w = z3;
                ed1.r(this, new fw0(-59194059, new p13(16, (Object) fn42, obj2), true));
                this.w = z4;
            } else {
                this.J = true;
                jv6 jv6 = this.I;
                this.b.m(new hn4(fn42, obj2, this.h, this.H, jv6.b(jv6.G(jv6.b, jv6.v)), a42.w, m(), (ArrayList) null));
            }
            r(false);
            this.K = null;
            this.T = j2;
            r(false);
        } catch (Throwable th) {
            r(false);
            this.K = null;
            this.T = j2;
            r(false);
            throw th;
        }
    }

    public final Object I() {
        boolean z2 = this.S;
        d63 d63 = ay0.a;
        if (!z2) {
            Object m2 = this.G.m();
            if (!this.y || (m2 instanceof k76)) {
                return m2;
            }
        } else if (this.r) {
            ey0.a("A call to createNode(), emitNode() or useNode() expected");
            return d63;
        }
        return d63;
    }

    /* JADX INFO: finally extract failed */
    public final List J() {
        py0 py0;
        ky0 ky0 = this.b;
        jy0 i2 = ky0.i();
        if (i2 != null) {
            py0 = (py0) i2;
        } else {
            py0 = null;
        }
        if (py0 != null) {
            gv6 gv6 = py0.B;
            fv6 n2 = iv6.d(gv6).n();
            try {
                Integer G2 = gr8.G(n2, ky0, 0, n2.c);
                if (G2 != null) {
                    fv6 n3 = iv6.d(gv6).n();
                    try {
                        ArrayList Z = gr8.Z(n3, G2.intValue(), 0);
                        n3.c();
                        return dt0.M0(Z, py0.R.J());
                    } catch (Throwable th) {
                        n3.c();
                        throw th;
                    }
                }
            } finally {
                n2.c();
            }
        }
        return a42.w;
    }

    public final int K(int i2) {
        int q2 = this.G.q(i2) + 1;
        int i3 = 0;
        while (q2 < i2) {
            if (!this.G.k(q2)) {
                i3++;
            }
            q2 += this.G.b[(q2 * 5) + 3];
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r10 == null) goto L_0x0055;
     */
    public final Object L(py0 py0, py0 py02, Integer num, List list, sr2 sr2) {
        Object obj;
        int i2;
        boolean z2 = this.F;
        int i3 = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                yb5 yb5 = (yb5) list.get(i4);
                yx5 yx5 = (yx5) yb5.w;
                Object obj2 = yb5.x;
                if (obj2 != null) {
                    k0(yx5, obj2);
                } else {
                    k0(yx5, (Object) null);
                }
            }
            if (py0 != null) {
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                if (py02 == null || py02 == py0 || i2 < 0) {
                    obj = sr2.b();
                } else {
                    py0.N = py02;
                    py0.O = i2;
                    obj = sr2.b();
                    py0.N = null;
                    py0.O = 0;
                }
            }
            obj = sr2.b();
            this.F = z2;
            this.k = i3;
            return obj;
        } catch (Throwable th) {
            this.F = z2;
            this.k = i3;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (r4.b < r6) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139  */
    public final void M() {
        ch3 ch3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int r2;
        ch3 ch32;
        hp4 hp4;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        Object b2;
        int i11;
        int hashCode;
        int i12;
        long j3;
        int i13;
        g22 g22 = g22.K;
        boolean z4 = this.F;
        this.F = true;
        fv6 fv6 = this.G;
        int i14 = fv6.i;
        int i15 = (i14 * 5) + 3;
        int i16 = fv6.b[i15] + i14;
        int i17 = this.k;
        long j4 = this.T;
        int i18 = this.l;
        int i19 = this.m;
        int i20 = fv6.g;
        ArrayList arrayList = this.s;
        int r3 = b96.r(i20, arrayList);
        if (r3 < 0) {
            r3 = -(r3 + 1);
        }
        if (r3 < arrayList.size()) {
            ch3 = (ch3) arrayList.get(r3);
        }
        ch3 = null;
        boolean z5 = true;
        int i21 = i14;
        boolean z6 = false;
        while (ch3 != null) {
            yx5 yx5 = ch3.a;
            int i22 = ch3.b;
            g22 g222 = g22;
            int r4 = b96.r(i22, arrayList);
            if (r4 >= 0) {
                ch3 ch33 = (ch3) arrayList.remove(r4);
            }
            Object obj = ch3.c;
            if (obj == null) {
                yx5.getClass();
                i2 = i16;
                i6 = i15;
                i5 = i17;
            } else {
                int i23 = 8;
                tp4 tp4 = yx5.g;
                if (tp4 == null) {
                    i2 = i16;
                    i6 = i15;
                    i5 = i17;
                } else {
                    i6 = i15;
                    if (obj instanceof oq1) {
                        oq1 oq1 = (oq1) obj;
                        ux6 ux6 = oq1.y;
                        if (ux6 == null) {
                            ux6 = g222;
                        }
                        i5 = i17;
                        z2 = !ux6.i(oq1.e().f, tp4.g(oq1));
                        i2 = i16;
                        i4 = i18;
                        i3 = i19;
                    } else {
                        i5 = i17;
                        if (obj instanceof up4) {
                            up4 up4 = (up4) obj;
                            if (up4.h()) {
                                Object[] objArr = up4.b;
                                long[] jArr = up4.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    long[] jArr2 = jArr;
                                    i4 = i18;
                                    i3 = i19;
                                    int i24 = 0;
                                    while (true) {
                                        long j5 = jArr2[i24];
                                        i2 = i16;
                                        Object[] objArr2 = objArr;
                                        if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i25 = 8 - ((~(i24 - length)) >>> 31);
                                            int i26 = 0;
                                            while (i26 < i25) {
                                                if ((j5 & 255) < 128) {
                                                    i13 = i26;
                                                    Object obj2 = objArr2[(i24 << 3) + i26];
                                                    j3 = j5;
                                                    if (!(obj2 instanceof oq1)) {
                                                        break;
                                                    }
                                                    oq1 oq12 = (oq1) obj2;
                                                    ux6 ux62 = oq12.y;
                                                    if (ux62 == null) {
                                                        ux62 = g222;
                                                    }
                                                    if (!ux62.i(oq12.e().f, tp4.g(oq12))) {
                                                        break;
                                                    }
                                                } else {
                                                    i13 = i26;
                                                    j3 = j5;
                                                }
                                                j5 = j3 >> i23;
                                                i26 = i13 + 1;
                                            }
                                            if (i25 != i23) {
                                                break;
                                            }
                                        }
                                        if (i24 == length) {
                                            break;
                                        }
                                        i24++;
                                        i16 = i2;
                                        objArr = objArr2;
                                        i23 = 8;
                                    }
                                    z2 = false;
                                }
                            }
                            i2 = i16;
                            i4 = i18;
                            i3 = i19;
                            z2 = false;
                        } else {
                            i2 = i16;
                        }
                    }
                    if (!z2) {
                        this.G.r(i22);
                        int i27 = this.G.g;
                        P(i21, i27, i14);
                        int q2 = this.G.q(i27);
                        while (i7 != i14 && !this.G.l(i7)) {
                            q2 = this.G.q(i7);
                        }
                        if (this.G.l(i7)) {
                            i8 = 0;
                        } else {
                            i8 = i5;
                        }
                        if (i7 != i27) {
                            int q0 = (q0(i7) - this.G.o(i27)) + i8;
                            while (i8 < q0 && i7 != i22) {
                                i7++;
                                while (true) {
                                    if (i7 >= i22) {
                                        break;
                                    }
                                    fv6 fv62 = this.G;
                                    int i28 = fv62.b[(i7 * 5) + 3] + i7;
                                    if (i22 >= i28) {
                                        if (fv62.l(i7)) {
                                            i12 = z5;
                                        } else {
                                            i12 = q0(i7);
                                        }
                                        i8 += i12;
                                        i7 = i28;
                                    }
                                }
                            }
                        }
                        this.k = i8;
                        this.m = K(i27);
                        int q3 = this.G.q(i27);
                        long j6 = 0;
                        int i29 = 3;
                        int i30 = 0;
                        while (true) {
                            if (q3 < 0) {
                                break;
                            } else if (q3 == i14) {
                                j6 ^= Long.rotateLeft(j4, i30);
                                break;
                            } else {
                                fv6 fv63 = this.G;
                                boolean k2 = fv63.k(q3);
                                int[] iArr = fv63.b;
                                i9 = i27;
                                if (k2) {
                                    Object p2 = fv63.p(iArr, q3);
                                    if (p2 != null) {
                                        if (p2 instanceof Enum) {
                                            hashCode = ((Enum) p2).ordinal();
                                        } else if (p2 instanceof fn4) {
                                            i10 = 126665345;
                                        } else {
                                            hashCode = p2.hashCode();
                                        }
                                        i10 = hashCode;
                                    } else {
                                        i10 = 0;
                                    }
                                } else {
                                    int i31 = fv63.i(q3);
                                    if (i31 != 207 || (b2 = fv63.b(iArr, q3)) == null || b2.equals(ay0.a)) {
                                        i10 = i31;
                                    } else {
                                        i10 = b2.hashCode();
                                    }
                                }
                                if (i10 == 126665345) {
                                    j6 ^= Long.rotateLeft((long) i10, i30);
                                    break;
                                }
                                if (this.G.k(q3)) {
                                    i11 = 0;
                                } else {
                                    i11 = K(q3);
                                }
                                j6 = (j6 ^ Long.rotateLeft((long) i10, i29)) ^ Long.rotateLeft((long) i11, i30);
                                i29 = (i29 + 6) % 64;
                                i30 = (i30 + 6) % 64;
                                q3 = this.G.q(q3);
                                i27 = i9;
                            }
                        }
                        i9 = i27;
                        this.T = j6;
                        this.K = null;
                        gs2 gs2 = yx5.d;
                        if (gs2 != null) {
                            gs2.H(this, Integer.valueOf(z5 ? 1 : 0));
                            this.K = null;
                            fv6 fv64 = this.G;
                            int i32 = fv64.b[i6] + i14;
                            int i33 = fv64.g;
                            if (i33 < i14 || i33 > i32) {
                                ey0.a("Index " + i14 + " is not a parent of " + i33);
                            }
                            fv64.i = i14;
                            fv64.h = i32;
                            fv64.l = 0;
                            fv64.m = 0;
                            z3 = z4;
                            i21 = i9;
                            z6 = z5;
                        } else {
                            h.s("Invalid restart scope");
                            return;
                        }
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(yx5);
                        this.g.o();
                        zx5 zx5 = yx5.a;
                        if (zx5 == null || (hp4 = yx5.f) == null) {
                            z3 = z4;
                        } else {
                            yx5.d(z5);
                            try {
                                Object[] objArr3 = hp4.b;
                                int[] iArr2 = hp4.c;
                                long[] jArr3 = hp4.a;
                                int length2 = jArr3.length - 2;
                                z3 = z4;
                                if (length2 >= 0) {
                                    int i34 = 0;
                                    while (true) {
                                        long j7 = jArr3[i34];
                                        long[] jArr4 = jArr3;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j7) << 7) & j7 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i35 = 8 - ((~(i34 - length2)) >>> 31);
                                            int i36 = 0;
                                            while (i36 < i35) {
                                                if ((j7 & 255) < 128) {
                                                    int i37 = (i34 << 3) + i36;
                                                    j2 = j7;
                                                    Object obj3 = objArr4[i37];
                                                    int i38 = iArr2[i37];
                                                    zx5.h(obj3);
                                                } else {
                                                    j2 = j7;
                                                }
                                                i36++;
                                                j7 = j2 >> 8;
                                            }
                                            if (i35 != 8) {
                                                break;
                                            }
                                        }
                                        if (i34 == length2) {
                                            break;
                                        }
                                        i34++;
                                        objArr3 = objArr4;
                                        jArr3 = jArr4;
                                    }
                                }
                            } finally {
                                yx5.d(false);
                            }
                        }
                        z5 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    r2 = b96.r(this.G.g, arrayList);
                    if (r2 < 0) {
                        r2 = -(r2 + 1);
                    }
                    if (r2 >= arrayList.size()) {
                        ch3 ch34 = (ch3) arrayList.get(r2);
                        i16 = i2;
                        if (ch34.b < i16) {
                            ch32 = ch34;
                            z4 = z3;
                            g22 = g222;
                            i15 = i6;
                            i17 = i5;
                            i18 = i4;
                            i19 = i3;
                        }
                    } else {
                        i16 = i2;
                    }
                    ch32 = null;
                    z4 = z3;
                    g22 = g222;
                    i15 = i6;
                    i17 = i5;
                    i18 = i4;
                    i19 = i3;
                }
            }
            i4 = i18;
            i3 = i19;
            z2 = z5;
            if (!z2) {
            }
            r2 = b96.r(this.G.g, arrayList);
            if (r2 < 0) {
            }
            if (r2 >= arrayList.size()) {
            }
            ch32 = null;
            z4 = z3;
            g22 = g222;
            i15 = i6;
            i17 = i5;
            i18 = i4;
            i19 = i3;
        }
        boolean z7 = z4;
        int i39 = i17;
        int i40 = i18;
        int i41 = i19;
        if (z6) {
            P(i21, i14, i14);
            this.G.t();
            int q02 = q0(i14);
            this.k = i39 + q02;
            this.l = i40 + q02;
            this.m = i41;
        } else {
            X();
        }
        this.T = j4;
        this.F = z7;
    }

    public final void N() {
        R(this.G.g);
        by0 by0 = this.M;
        by0.d(false);
        by0.e();
        by0.b.u.s(r65.d);
        int i2 = by0.f;
        fv6 fv6 = by0.a.G;
        by0.f = fv6.b[(fv6.g * 5) + 3] + i2;
    }

    public final void O(vf5 vf5) {
        yo4 yo4 = this.v;
        if (yo4 == null) {
            yo4 = new yo4();
            this.v = yo4;
        }
        yo4.i(this.G.g, vf5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007a A[SYNTHETIC] */
    public final void P(int i2, int i3, int i4) {
        fv6 fv6 = this.G;
        if (i2 != i3) {
            if (!(i2 == i4 || i3 == i4)) {
                if (fv6.q(i2) == i3) {
                    i4 = i3;
                } else if (fv6.q(i3) != i2) {
                    if (fv6.q(i2) == fv6.q(i3)) {
                        i4 = fv6.q(i2);
                    } else {
                        int i5 = i2;
                        int i6 = 0;
                        while (i5 > 0 && i5 != i4) {
                            i5 = fv6.q(i5);
                            i6++;
                        }
                        int i7 = i3;
                        int i8 = 0;
                        while (i7 > 0 && i7 != i4) {
                            i7 = fv6.q(i7);
                            i8++;
                        }
                        int i9 = i6 - i8;
                        int i10 = i2;
                        for (int i11 = 0; i11 < i9; i11++) {
                            i10 = fv6.q(i10);
                        }
                        int i12 = i8 - i6;
                        int i13 = i3;
                        for (int i14 = 0; i14 < i12; i14++) {
                            i13 = fv6.q(i13);
                        }
                        i4 = i10;
                        for (int i15 = i13; i4 != i15; i15 = fv6.q(i15)) {
                            i4 = fv6.q(i4);
                        }
                    }
                }
            }
            while (i2 > 0 && i2 != i4) {
                if (!fv6.l(i2)) {
                    this.M.a();
                }
                i2 = fv6.q(i2);
            }
            q(i3, i4);
        }
        i4 = i2;
        while (i2 > 0) {
            if (!fv6.l(i2)) {
            }
            i2 = fv6.q(i2);
        }
        q(i3, i4);
    }

    public final Object Q() {
        boolean z2 = this.S;
        d63 d63 = ay0.a;
        if (!z2) {
            Object m2 = this.G.m();
            if (!this.y || (m2 instanceof k76)) {
                if (m2 instanceof cu2) {
                    return ((cu2) m2).a;
                }
                return m2;
            }
        } else if (this.r) {
            ey0.a("A call to createNode(), emitNode() or useNode() expected");
            return d63;
        }
        return d63;
    }

    public final void R(int i2) {
        boolean l2 = this.G.l(i2);
        by0 by0 = this.M;
        if (l2) {
            by0.c();
            Object n2 = this.G.n(i2);
            by0.c();
            by0.h.add(n2);
        }
        U(this, i2, i2, l2, 0);
        by0.c();
        if (l2) {
            by0.a();
        }
    }

    public final boolean V(int i2, boolean z2) {
        yx5 B2;
        int i3;
        if ((i2 & 1) == 0 && (this.S || this.y)) {
            ps6 ps6 = this.P;
            if (!(ps6 == null || (B2 = B()) == null || !ps6.a())) {
                int i4 = B2.b;
                if ((i4 & 512) != 0) {
                    return true;
                }
                int i5 = i4 | 1;
                B2.b = i5;
                if (this.y) {
                    i3 = i4 | 129;
                } else {
                    i3 = i5 & -129;
                }
                B2.b = i3 | 256;
                j75 j75 = this.M.b.u;
                j75.s(q65.d);
                i75.l(j75, 0, B2);
                this.b.t(B2);
                return false;
            }
        } else if (z2 || !F()) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    public final void W() {
        Object obj;
        int hashCode;
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        fv6 fv6 = this.G;
        int g2 = fv6.g();
        int[] iArr = fv6.b;
        int i2 = fv6.g;
        if (i2 < fv6.h) {
            obj = fv6.p(iArr, i2);
        } else {
            obj = null;
        }
        Object f2 = fv6.f();
        int i3 = this.m;
        d63 d63 = ay0.a;
        if (obj != null) {
            if (obj instanceof Enum) {
                hashCode = ((Enum) obj).ordinal();
            } else {
                hashCode = obj.hashCode();
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) hashCode), 3);
        } else if (f2 == null || g2 != 207 || f2.equals(d63)) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) g2), 3) ^ ((long) i3);
        } else {
            this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) f2.hashCode()), 3) ^ ((long) i3);
            boolean z2 = true;
            if ((iArr[(fv6.g * 5) + 1] & 1073741824) == 0) {
                z2 = false;
            }
            d0((Object) null, z2);
            M();
            fv6.e();
            if (obj != null) {
                if (f2 == null || g2 != 207 || f2.equals(d63)) {
                    this.T = Long.rotateRight(((long) g2) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
                    return;
                }
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i3), 3) ^ ((long) f2.hashCode()), 3);
                return;
            } else if (obj instanceof Enum) {
                this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) obj).ordinal()), 3);
                return;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) obj.hashCode()), 3);
                return;
            }
        }
        this.T = rotateLeft;
        boolean z22 = true;
        if ((iArr[(fv6.g * 5) + 1] & 1073741824) == 0) {
        }
        d0((Object) null, z22);
        M();
        fv6.e();
        if (obj != null) {
        }
    }

    public final void X() {
        int i2;
        fv6 fv6 = this.G;
        int i3 = fv6.i;
        if (i3 >= 0) {
            i2 = fv6.b[(i3 * 5) + 1] & 67108863;
        } else {
            i2 = 0;
        }
        this.l = i2;
        fv6.t();
    }

    public final void Y() {
        if (this.l != 0) {
            ey0.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            yx5 B2 = B();
            if (B2 != null) {
                int i2 = B2.b;
                if ((i2 & 128) == 0) {
                    B2.b = i2 | 16;
                }
            }
            if (this.s.isEmpty()) {
                X();
            } else {
                M();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014d  */
    public final void Z(Object obj, int i2, Object obj2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        bu2 bu2;
        bu2 bu22;
        Object obj3;
        int i4;
        int i5;
        Object obj4;
        int i6;
        int i7;
        int i8;
        Object[] objArr;
        Object[] objArr2;
        int i9;
        int i10;
        boolean z5;
        int i11;
        Object obj5;
        int hashCode;
        long rotateLeft;
        Object obj6 = obj;
        int i12 = i2;
        Object obj7 = obj2;
        int i13 = i3;
        if (this.r) {
            ey0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.m;
        Object obj8 = ay0.a;
        if (obj6 != null) {
            if (obj6 instanceof Enum) {
                hashCode = ((Enum) obj6).ordinal();
            } else {
                hashCode = obj6.hashCode();
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) hashCode), 3);
        } else if (obj7 == null || i12 != 207 || obj7.equals(obj8)) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i12), 3) ^ ((long) i14);
        } else {
            this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj7.hashCode()), 3) ^ ((long) i14);
            if (obj6 == null) {
                this.m++;
            }
            if (i13 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!this.S) {
                this.G.k++;
                jv6 jv6 = this.I;
                int i15 = jv6.t;
                if (z2) {
                    jv6.S(obj8, true, obj8, i12);
                } else if (obj7 != null) {
                    if (obj6 == null) {
                        obj6 = obj8;
                    }
                    jv6.S(obj6, false, obj7, i12);
                } else {
                    if (obj6 == null) {
                        obj6 = obj8;
                    }
                    jv6.S(obj6, false, obj8, i12);
                }
                bu2 bu23 = this.j;
                if (bu23 != null) {
                    int i16 = -2 - i15;
                    ss3 ss3 = new ss3(-1, i12, i16, -1);
                    bu23.e.i(i16, new tx2(-1, this.k - bu23.b, 0));
                    bu23.d.add(ss3);
                }
                x(z2, (bu2) null);
                return;
            }
            if (i13 == 1 && this.y) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.j == null) {
                int g2 = this.G.g();
                if (!z3 && g2 == i12) {
                    fv6 fv6 = this.G;
                    int i17 = fv6.g;
                    if (i17 < fv6.h) {
                        obj5 = fv6.p(fv6.b, i17);
                    } else {
                        obj5 = null;
                    }
                    if (sg3.e(obj6, obj5)) {
                        d0(obj7, z2);
                    }
                }
                fv6 fv62 = this.G;
                int[] iArr = fv62.b;
                ArrayList arrayList = new ArrayList();
                if (fv62.k <= 0) {
                    int i18 = fv62.g;
                    while (i18 < fv62.h) {
                        int i19 = i18 * 5;
                        int i20 = iArr[i19];
                        Object p2 = fv62.p(iArr, i18);
                        int i21 = iArr[i19 + 1];
                        if ((i21 & 1073741824) != 0) {
                            z5 = z3;
                            i11 = 1;
                        } else {
                            z5 = z3;
                            i11 = i21 & 67108863;
                        }
                        arrayList.add(new ss3(p2, i20, i18, i11));
                        i18 += iArr[i19 + 3];
                        z3 = z5;
                    }
                }
                z4 = z3;
                this.j = new bu2(this.k, arrayList);
                bu2 = this.j;
                if (bu2 != null) {
                    ArrayList arrayList2 = bu2.d;
                    yo4 yo4 = bu2.e;
                    int i22 = bu2.b;
                    if (obj6 != null) {
                        obj3 = new nl3(Integer.valueOf(i12), obj6);
                    } else {
                        obj3 = Integer.valueOf(i12);
                    }
                    tp4 tp4 = ((co4) bu2.f.getValue()).a;
                    Object g3 = tp4.g(obj3);
                    if (g3 == null) {
                        g3 = null;
                    } else if (g3 instanceof lp4) {
                        lp4 lp4 = (lp4) g3;
                        Object k2 = lp4.k(0);
                        if (lp4.h()) {
                            tp4.k(obj3);
                        }
                        if (lp4.b == 1) {
                            tp4.m(obj3, lp4.e());
                        }
                        g3 = k2;
                    } else {
                        tp4.k(obj3);
                    }
                    ss3 ss32 = (ss3) g3;
                    if (z4 || ss32 == null) {
                        this.G.k++;
                        this.S = true;
                        this.K = null;
                        if (this.I.w) {
                            jv6 o2 = this.H.o();
                            this.I = o2;
                            o2.O();
                            this.J = false;
                            this.K = null;
                        }
                        this.I.d();
                        jv6 jv62 = this.I;
                        int i23 = jv62.t;
                        if (z2) {
                            jv62.S(obj8, true, obj8, i12);
                            i4 = 0;
                        } else if (obj7 != null) {
                            if (obj != null) {
                                obj8 = obj;
                            }
                            i4 = 0;
                            jv62.S(obj8, false, obj7, i12);
                        } else {
                            i4 = 0;
                            if (obj == null) {
                                obj4 = obj8;
                            } else {
                                obj4 = obj;
                            }
                            jv62.S(obj4, false, obj8, i12);
                        }
                        this.N = this.I.b(i23);
                        int i24 = -2 - i23;
                        ss3 ss33 = new ss3(-1, i12, i24, -1);
                        yo4.i(i24, new tx2(-1, this.k - i22, i4));
                        arrayList2.add(ss33);
                        ArrayList arrayList3 = new ArrayList();
                        if (z2) {
                            i5 = i4;
                        } else {
                            i5 = this.k;
                        }
                        bu22 = new bu2(i5, arrayList3);
                        x(z2, bu22);
                        return;
                    }
                    int i25 = ss32.c;
                    arrayList2.add(ss32);
                    tx2 tx2 = (tx2) yo4.b(i25);
                    if (tx2 != null) {
                        i6 = tx2.b;
                    } else {
                        i6 = -1;
                    }
                    this.k = i6 + i22;
                    tx2 tx22 = (tx2) yo4.b(i25);
                    if (tx22 != null) {
                        i7 = tx22.a;
                    } else {
                        i7 = -1;
                    }
                    int i26 = bu2.c;
                    int i27 = i7 - i26;
                    int i28 = 8;
                    if (i7 > i26) {
                        Object[] objArr3 = yo4.c;
                        long[] jArr = yo4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j2 = jArr[i29];
                                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j2 & 255) < 128) {
                                            i10 = i28;
                                            tx2 tx23 = (tx2) objArr3[(i29 << 3) + i31];
                                            i9 = i27;
                                            int i32 = tx23.a;
                                            if (i32 == i7) {
                                                tx23.a = i26;
                                            } else if (i26 <= i32 && i32 < i7) {
                                                tx23.a = i32 + 1;
                                            }
                                        } else {
                                            i9 = i27;
                                            i10 = i28;
                                        }
                                        j2 >>= i10;
                                        i31++;
                                        i28 = i10;
                                        i27 = i9;
                                    }
                                    i8 = i27;
                                    if (i30 != i28) {
                                        break;
                                    }
                                } else {
                                    i8 = i27;
                                }
                                if (i29 == length) {
                                    break;
                                }
                                i29++;
                                i27 = i8;
                                i28 = 8;
                            }
                        } else {
                            i8 = i27;
                        }
                    } else {
                        i8 = i27;
                        if (i26 > i7) {
                            Object[] objArr4 = yo4.c;
                            long[] jArr2 = yo4.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j3 = jArr2[i33];
                                    if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length2)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j3 & 255) < 128) {
                                                tx2 tx24 = (tx2) objArr4[(i33 << 3) + i35];
                                                int i36 = tx24.a;
                                                if (i36 == i7) {
                                                    tx24.a = i26;
                                                } else {
                                                    objArr2 = objArr4;
                                                    if (i7 + 1 <= i36 && i36 < i26) {
                                                        tx24.a = i36 - 1;
                                                    }
                                                    j3 >>= 8;
                                                    i35++;
                                                    objArr4 = objArr2;
                                                }
                                            }
                                            objArr2 = objArr4;
                                            j3 >>= 8;
                                            i35++;
                                            objArr4 = objArr2;
                                        }
                                        objArr = objArr4;
                                        if (i34 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr4;
                                    }
                                    if (i33 == length2) {
                                        break;
                                    }
                                    i33++;
                                    objArr4 = objArr;
                                }
                            }
                        }
                    }
                    by0 by0 = this.M;
                    by0.f = (i25 - by0.a.G.g) + by0.f;
                    this.G.r(i25);
                    if (i8 > 0) {
                        by0.d(false);
                        by0.e();
                        j75 j75 = by0.b.u;
                        j75.s(m65.d);
                        j75.i[j75.j - j75.g[j75.h - 1].b] = i8;
                    }
                    d0(obj7, z2);
                }
                bu22 = null;
                x(z2, bu22);
                return;
            }
            z4 = z3;
            bu2 = this.j;
            if (bu2 != null) {
            }
            bu22 = null;
            x(z2, bu22);
            return;
        }
        this.T = rotateLeft;
        if (obj6 == null) {
        }
        if (i13 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void a() {
        j();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        kg2 kg2 = this.O;
        kg2.h.p();
        kg2.g.p();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        fv6 fv6 = this.G;
        if (!fv6.f) {
            fv6.c();
        }
        if (!this.I.w) {
            y();
        }
    }

    public final void a0() {
        Z((Object) null, -127, (Object) null, 0);
    }

    public final void b(gs2 gs2, Object obj) {
        if (this.S) {
            j75 j75 = this.O.g;
            j75.s(c75.d);
            i75.l(j75, 0, obj);
            gs2.getClass();
            mp7.Q(2, gs2);
            i75.l(j75, 1, gs2);
            return;
        }
        by0 by0 = this.M;
        by0.b();
        j75 j752 = by0.b.u;
        j752.s(c75.d);
        gs2.getClass();
        mp7.Q(2, gs2);
        i75.m(j752, 0, obj, 1, gs2);
    }

    public final void b0(int i2, t55 t55) {
        Z(t55, i2, (Object) null, 0);
    }

    public final boolean c(double d2) {
        Object I2 = I();
        if ((I2 instanceof Double) && d2 == ((Number) I2).doubleValue()) {
            return false;
        }
        p0(Double.valueOf(d2));
        return true;
    }

    public final void c0(int i2, Object obj) {
        Z(obj, i2, (Object) null, 0);
    }

    public final boolean d(float f2) {
        Object I2 = I();
        if ((I2 instanceof Float) && f2 == ((Number) I2).floatValue()) {
            return false;
        }
        p0(Float.valueOf(f2));
        return true;
    }

    public final void d0(Object obj, boolean z2) {
        if (z2) {
            fv6 fv6 = this.G;
            if (fv6.k <= 0) {
                if ((fv6.b[(fv6.g * 5) + 1] & 1073741824) == 0) {
                    vm5.a("Expected a node group");
                }
                fv6.u();
                return;
            }
            return;
        }
        if (!(obj == null || this.G.f() == obj)) {
            by0 by0 = this.M;
            by0.getClass();
            by0.d(false);
            j75 j75 = by0.b.u;
            j75.s(b75.d);
            i75.l(j75, 0, obj);
        }
        this.G.u();
    }

    public final boolean e(int i2) {
        Object I2 = I();
        if ((I2 instanceof Integer) && i2 == ((Number) I2).intValue()) {
            return false;
        }
        p0(Integer.valueOf(i2));
        return true;
    }

    public final void e0(int i2) {
        int i3;
        int i4;
        if (this.j != null) {
            Z((Object) null, i2, (Object) null, 0);
            return;
        }
        if (this.r) {
            ey0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i2), 3) ^ ((long) this.m);
        this.m++;
        fv6 fv6 = this.G;
        boolean z2 = this.S;
        d63 d63 = ay0.a;
        if (z2) {
            fv6.k++;
            this.I.S(d63, false, d63, i2);
            x(false, (bu2) null);
        } else if (fv6.g() != i2 || ((i4 = fv6.g) < fv6.h && (fv6.b[(i4 * 5) + 1] & 536870912) != 0)) {
            if (fv6.k <= 0 && (i3 = fv6.g) != fv6.h) {
                int i5 = this.k;
                N();
                this.M.f(i5, fv6.s());
                b96.d(this.s, i3, fv6.g);
            }
            fv6.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                jv6 o2 = this.H.o();
                this.I = o2;
                o2.O();
                this.J = false;
                this.K = null;
            }
            jv6 jv6 = this.I;
            jv6.d();
            int i6 = jv6.t;
            jv6.S(d63, false, d63, i2);
            this.N = jv6.b(i6);
            x(false, (bu2) null);
        } else {
            fv6.u();
            x(false, (bu2) null);
        }
    }

    public final boolean f(long j2) {
        Object I2 = I();
        if ((I2 instanceof Long) && j2 == ((Number) I2).longValue()) {
            return false;
        }
        p0(Long.valueOf(j2));
        return true;
    }

    public final void f0(int i2) {
        Z((Object) null, i2, (Object) null, 0);
    }

    public final boolean g(Object obj) {
        if (sg3.e(I(), obj)) {
            return false;
        }
        p0(obj);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    public final yt2 g0(int i2) {
        ch3 ch3;
        yx5 yx5;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        e0(i2);
        boolean z4 = this.S;
        f96 f96 = this.g;
        ArrayList arrayList = this.E;
        py0 py0 = this.h;
        if (z4) {
            yx5 yx52 = new yx5(py0);
            arrayList.add(yx52);
            p0(yx52);
            yx52.e = this.B;
            yx52.b &= -17;
            f96.o();
            return this;
        }
        int i5 = this.G.i;
        ArrayList arrayList2 = this.s;
        int r2 = b96.r(i5, arrayList2);
        if (r2 >= 0) {
            ch3 = (ch3) arrayList2.remove(r2);
        } else {
            ch3 = null;
        }
        Object m2 = this.G.m();
        if (sg3.e(m2, ay0.a)) {
            yx5 = new yx5(py0);
            p0(yx5);
        } else {
            m2.getClass();
            yx5 = (yx5) m2;
        }
        if (ch3 == null) {
            int i6 = yx5.b;
            if ((i6 & 64) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                yx5.b = i6 & -65;
            }
            if (!z3) {
                z2 = false;
                int i7 = yx5.b;
                if (!z2) {
                    i3 = i7 | 8;
                } else {
                    i3 = i7 & -9;
                }
                yx5.b = i3;
                arrayList.add(yx5);
                yx5.e = this.B;
                yx5.b &= -17;
                f96.o();
                i4 = yx5.b;
                if ((i4 & 256) != 0) {
                    yx5.b = (i4 & -257) | 512;
                    j75 j75 = this.M.b.u;
                    j75.s(w65.d);
                    i75.l(j75, 0, yx5);
                    if (!this.y) {
                        int i8 = yx5.b;
                        if ((i8 & 128) != 0) {
                            this.y = true;
                            this.z = this.G.i;
                            yx5.b = i8 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z2 = true;
        int i72 = yx5.b;
        if (!z2) {
        }
        yx5.b = i3;
        arrayList.add(yx5);
        yx5.e = this.B;
        yx5.b &= -17;
        f96.o();
        i4 = yx5.b;
        if ((i4 & 256) != 0) {
        }
        return this;
    }

    public final boolean h(boolean z2) {
        Object I2 = I();
        if ((I2 instanceof Boolean) && z2 == ((Boolean) I2).booleanValue()) {
            return false;
        }
        p0(Boolean.valueOf(z2));
        return true;
    }

    public final void h0(Object obj) {
        if (!this.S && this.G.g() == 207 && !sg3.e(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        Z((Object) null, 207, obj, 0);
    }

    public final boolean i(Object obj) {
        if (I() == obj) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final void i0() {
        Z((Object) null, 125, (Object) null, 2);
        this.r = true;
    }

    public final void j() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0;
        this.r = false;
        by0 by0 = this.M;
        by0.c = false;
        by0.d.b = 0;
        by0.f = 0;
        by0.e = true;
        by0.g = 0;
        by0.h.clear();
        by0.i = -1;
        by0.j = -1;
        by0.k = -1;
        by0.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void j0() {
        this.m = 0;
        this.G = this.c.n();
        Z((Object) null, 100, (Object) null, 0);
        ky0 ky0 = this.b;
        ky0.w();
        vf5 j2 = ky0.j();
        this.x.c(this.w ? 1 : 0);
        this.w = g(j2);
        this.K = null;
        if (!this.q) {
            this.q = ky0.f();
        }
        if (!this.C) {
            this.C = ky0.g();
        }
        if (this.C) {
            t37 t37 = oy0.a;
            t37.getClass();
            j2 = j2.g(t37, new w37(D()));
        }
        this.u = j2;
        Set set = (Set) rc9.G0(j2, ld3.a);
        if (set != null) {
            set.add(z());
            ky0.r(set);
        }
        Z((Object) null, Long.hashCode(ky0.h()), (Object) null, 0);
    }

    public final Object k(hu5 hu5) {
        return rc9.G0(m(), hu5);
    }

    public final boolean k0(yx5 yx5, Object obj) {
        st2 st2 = yx5.c;
        if (st2 == null) {
            return false;
        }
        int f2 = this.G.a.f(hj8.m(st2));
        if (!this.F || f2 < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int r2 = b96.r(f2, arrayList);
        if (r2 < 0) {
            int i2 = -(r2 + 1);
            if (!(obj instanceof oq1)) {
                obj = null;
            }
            arrayList.add(i2, new ch3(yx5, f2, obj));
            return true;
        }
        ch3 ch3 = (ch3) arrayList.get(r2);
        if (obj instanceof oq1) {
            Object obj2 = ch3.c;
            if (obj2 == null) {
                ch3.c = obj;
                return true;
            } else if (obj2 instanceof up4) {
                ((up4) obj2).a(obj);
                return true;
            } else {
                up4 up4 = cg6.a;
                up4 up42 = new up4(2);
                up42.k(obj2);
                up42.k(obj);
                ch3.c = up42;
                return true;
            }
        } else {
            ch3.c = null;
            return true;
        }
    }

    public final void l(sr2 sr2) {
        if (!this.r) {
            ey0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            ey0.a("createNode() can only be called when inserting");
        }
        xe3 xe3 = this.n;
        int i2 = xe3.a[xe3.b - 1];
        jv6 jv6 = this.I;
        st2 b2 = jv6.b(jv6.v);
        this.l++;
        kg2 kg2 = this.O;
        j75 j75 = kg2.g;
        j75.s(j65.e);
        i75.l(j75, 0, sr2);
        j75.i[j75.j - j75.g[j75.h - 1].b] = i2;
        i75.l(j75, 1, b2);
        j75 j752 = kg2.h;
        j752.s(j65.f);
        j752.i[j752.j - j752.g[j752.h - 1].b] = i2;
        i75.l(j752, 0, b2);
    }

    public final void l0(tp4 tp4) {
        st2 st2;
        tp4 tp42 = tp4;
        ArrayList arrayList = this.s;
        for (int x2 = sg3.x(arrayList); -1 < x2; x2--) {
            ch3 ch3 = (ch3) arrayList.get(x2);
            st2 st22 = ch3.a.c;
            if (st22 != null) {
                st2 = hj8.m(st22);
            } else {
                st2 = null;
            }
            if (st2 == null || !st2.a()) {
                arrayList.remove(x2);
            } else {
                int i2 = ch3.b;
                int i3 = st2.a;
                if (i2 != i3) {
                    ch3.b = i3;
                }
            }
        }
        Object[] objArr = tp42.b;
        Object[] objArr2 = tp42.c;
        long[] jArr = tp42.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr[i4];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            obj.getClass();
                            yx5 yx5 = (yx5) obj;
                            st2 st23 = yx5.c;
                            if (st23 != null) {
                                int i8 = hj8.m(st23).a;
                                if (obj2 == g22.J) {
                                    obj2 = null;
                                }
                                arrayList.add(new ch3(yx5, i8, obj2));
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        ht0.g0(arrayList, b96.g);
    }

    public final vf5 m() {
        vf5 vf5 = this.K;
        if (vf5 != null) {
            return vf5;
        }
        return n(this.G.i);
    }

    public final void m0(int i2, int i3) {
        if (q0(i2) == i3) {
            return;
        }
        if (i2 < 0) {
            wo4 wo4 = this.p;
            if (wo4 == null) {
                wo4 = new wo4();
                this.p = wo4;
            }
            wo4.f(i2, i3);
            return;
        }
        int[] iArr = this.o;
        if (iArr == null) {
            int i4 = this.G.c;
            int[] iArr2 = new int[i4];
            Arrays.fill(iArr2, 0, i4, -1);
            this.o = iArr2;
            iArr = iArr2;
        }
        iArr[i2] = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: vf5} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final vf5 n(int i2) {
        vf5 vf5;
        boolean z2 = this.S;
        t55 t55 = ey0.c;
        if (z2 && this.J) {
            int i3 = this.I.v;
            while (i3 > 0) {
                if (this.I.s(i3) != 202 || !sg3.e(this.I.t(i3), t55)) {
                    jv6 jv6 = this.I;
                    i3 = jv6.G(jv6.b, i3);
                } else {
                    Object q2 = this.I.q(i3);
                    q2.getClass();
                    vf5 vf52 = (vf5) q2;
                    this.K = vf52;
                    return vf52;
                }
            }
        }
        if (this.G.c > 0) {
            while (i2 > 0) {
                if (this.G.i(i2) == 202) {
                    fv6 fv6 = this.G;
                    if (sg3.e(fv6.p(fv6.b, i2), t55)) {
                        yo4 yo4 = this.v;
                        if (yo4 == null || (vf5 = (vf5) yo4.b(i2)) == null) {
                            fv6 fv62 = this.G;
                            Object b2 = fv62.b(fv62.b, i2);
                            b2.getClass();
                            vf5 = b2;
                        }
                        this.K = vf5;
                        return vf5;
                    }
                }
                i2 = this.G.q(i2);
            }
        }
        vf5 vf53 = this.u;
        this.K = vf53;
        return vf53;
    }

    public final void n0(int i2, int i3) {
        int q0 = q0(i2);
        if (q0 != i3) {
            int i4 = i3 - q0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i2 != -1) {
                int q02 = q0(i2) + i4;
                m0(i2, q02);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        bu2 bu2 = (bu2) arrayList.get(i5);
                        if (bu2 != null && bu2.a(i2, q02)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                fv6 fv6 = this.G;
                if (i2 < 0) {
                    i2 = fv6.i;
                } else if (!fv6.l(i2)) {
                    i2 = this.G.q(i2);
                } else {
                    return;
                }
            }
        }
    }

    public final qx0 o() {
        Collection collection;
        Object obj;
        if (!this.b.l()) {
            return null;
        }
        n74 m2 = sg3.m();
        jv6 jv6 = this.I;
        m2.addAll(gr8.v(jv6, (Integer) null, jv6.t, (Integer) null));
        fv6 fv6 = this.G;
        boolean z2 = fv6.f;
        int[] iArr = fv6.b;
        if (z2 || fv6.c == 0) {
            collection = a42.w;
        } else {
            tw5 tw5 = new tw5(fv6);
            int i2 = fv6.i;
            Object valueOf = Integer.valueOf(fv6.l - iv6.b(iArr, i2));
            while (i2 >= 0) {
                if (fv6.k(i2)) {
                    obj = fv6.p(iArr, i2);
                } else {
                    obj = ay0.a;
                }
                tw5.h(fv6.i(i2), obj, fv6.a.s(i2), valueOf);
                valueOf = fv6.a(i2);
                i2 = fv6.q(i2);
            }
            collection = tw5.w;
        }
        m2.addAll(collection);
        m2.addAll(J());
        return new qx0(sg3.i(m2), this.C);
    }

    public final void o0(Object obj) {
        if (obj instanceof v36) {
            cu2 cu2 = new cu2((v36) obj, this.m - 1);
            if (this.S) {
                j75 j75 = this.M.b.u;
                j75.s(p65.d);
                i75.l(j75, 0, cu2);
            }
            this.d.add(obj);
            obj = cu2;
        }
        p0(obj);
    }

    public final void p(tp4 tp4, gs2 gs2) {
        eq4 h2;
        ArrayList arrayList = this.s;
        if (this.F) {
            ey0.a("Reentrant composition is not supported");
        }
        this.g.o();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(nx6.j().g());
            this.v = null;
            l0(tp4);
            this.k = 0;
            this.F = true;
            try {
                j0();
                Object I2 = I();
                if (!(I2 == gs2 || gs2 == null)) {
                    p0(gs2);
                }
                xt2 xt2 = this.D;
                h2 = u55.h();
                h2.b(xt2);
                t55 t55 = ey0.a;
                if (gs2 != null) {
                    b0(200, t55);
                    ed1.r(this, gs2);
                    r(false);
                } else if (!this.w || I2 == null || I2.equals(ay0.a)) {
                    W();
                } else {
                    b0(200, t55);
                    mp7.Q(2, I2);
                    ed1.r(this, (gs2) I2);
                    r(false);
                }
                h2.l(h2.y - 1);
                w();
                this.F = false;
                arrayList.clear();
                if (!this.I.w) {
                    ey0.a("Check failed");
                }
                y();
            } catch (Throwable th) {
                this.F = false;
                arrayList.clear();
                a();
                if (!this.I.w) {
                    ey0.a("Check failed");
                }
                y();
                throw th;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        fv6 fv6 = this.G;
        boolean z2 = fv6.n;
        by0 by0 = this.M;
        if (z2) {
            int b2 = (fv6.l - iv6.b(fv6.b, fv6.i)) - 1;
            if (by0.a.G.i - by0.f < 0) {
                fv6 fv62 = this.G;
                st2 a2 = fv62.a(fv62.i);
                j75 j75 = by0.b.u;
                j75.s(j65.g);
                i75.m(j75, 0, obj, 1, a2);
                j75.i[j75.j - j75.g[j75.h - 1].b] = b2;
                return;
            }
            by0.d(true);
            j75 j752 = by0.b.u;
            j752.s(j65.h);
            i75.l(j752, 0, obj);
            j752.i[j752.j - j752.g[j752.h - 1].b] = b2;
            return;
        }
        st2 a3 = fv6.a(fv6.i);
        j75 j753 = by0.b.u;
        j753.s(w55.d);
        i75.m(j753, 0, a3, 1, obj);
    }

    public final void q(int i2, int i3) {
        if (i2 > 0 && i2 != i3) {
            q(this.G.q(i2), i3);
            if (this.G.l(i2)) {
                Object n2 = this.G.n(i2);
                by0 by0 = this.M;
                by0.c();
                by0.h.add(n2);
            }
        }
    }

    public final int q0(int i2) {
        int i3;
        if (i2 < 0) {
            wo4 wo4 = this.p;
            if (wo4 != null && wo4.c(i2) >= 0) {
                int c2 = wo4.c(i2);
                if (c2 >= 0) {
                    return wo4.c[c2];
                }
                kj6.i(hl6.k(i2, "Cannot find value for key "));
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr == null || (i3 = iArr[i2]) < 0) {
            return this.G.o(i2);
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0546 A[LOOP:6: B:154:0x03da->B:196:0x0546, LOOP_END] */
    public final void r(boolean z2) {
        ArrayList arrayList;
        xe3 xe3;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        fv6 fv6;
        bu2 bu2;
        boolean z5;
        int i4;
        up4 up4;
        xe3 xe32;
        int i5;
        ArrayList arrayList2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i6;
        int i7;
        up4 up42;
        bu2 bu22;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        int i16;
        Object[] objArr4;
        int i17;
        int hashCode;
        long rotateRight;
        int hashCode2;
        long rotateRight2;
        xe3 xe33 = this.n;
        int i18 = xe33.a[xe33.b - 2] - 1;
        boolean z6 = this.S;
        d63 d63 = ay0.a;
        if (z6) {
            jv6 jv6 = this.I;
            int i19 = jv6.v;
            int s2 = jv6.s(i19);
            Object t2 = this.I.t(i19);
            Object q2 = this.I.q(i19);
            if (t2 != null) {
                if (t2 instanceof Enum) {
                    hashCode2 = ((Enum) t2).ordinal();
                } else {
                    hashCode2 = t2.hashCode();
                }
                rotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) hashCode2);
            } else if (q2 == null || s2 != 207 || q2.equals(d63)) {
                rotateRight2 = Long.rotateRight(this.T ^ ((long) i18), 3) ^ ((long) s2);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i18), 3) ^ ((long) q2.hashCode()), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            fv6 fv62 = this.G;
            int i20 = fv62.i;
            int i21 = fv62.i(i20);
            fv6 fv63 = this.G;
            Object p2 = fv63.p(fv63.b, i20);
            fv6 fv64 = this.G;
            Object b2 = fv64.b(fv64.b, i20);
            if (p2 != null) {
                if (p2 instanceof Enum) {
                    hashCode = ((Enum) p2).ordinal();
                } else {
                    hashCode = p2.hashCode();
                }
                rotateRight = Long.rotateRight(this.T, 3) ^ ((long) hashCode);
            } else if (b2 == null || i21 != 207 || b2.equals(d63)) {
                rotateRight = Long.rotateRight(this.T ^ ((long) i18), 3) ^ ((long) i21);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i18), 3) ^ ((long) b2.hashCode()), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i22 = this.l;
        bu2 bu23 = this.j;
        ArrayList arrayList5 = this.s;
        by0 by0 = this.M;
        if (bu23 != null) {
            yo4 yo4 = bu23.e;
            int i23 = bu23.b;
            ArrayList arrayList6 = bu23.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = bu23.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i24 = 0; i24 < size; i24++) {
                    hashSet2.add(arrayList7.get(i24));
                }
                i2 = -1;
                up4 up43 = cg6.a;
                new up4
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0119: CONSTRUCTOR  (r6v9 ? I:up4) =  call: up4.<init>():void type: CONSTRUCTOR in method: yt2.r(boolean):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v9 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 39 more
                    */
                /* JADX WARNING: Removed duplicated region for block: B:148:0x03a8  */
                /* JADX WARNING: Removed duplicated region for block: B:159:0x03e9  */
                /* JADX WARNING: Removed duplicated region for block: B:176:0x04cc  */
                /* JADX WARNING: Removed duplicated region for block: B:196:0x0546 A[LOOP:6: B:154:0x03da->B:196:0x0546, LOOP_END] */
                /*
                    this = this;
                    r0 = r42
                    xe3 r1 = r0.n
                    int[] r2 = r1.a
                    int r3 = r1.b
                    int r3 = r3 + -2
                    r2 = r2[r3]
                    r3 = 1
                    int r2 = r2 - r3
                    boolean r4 = r0.S
                    d63 r5 = defpackage.ay0.a
                    r6 = 207(0xcf, float:2.9E-43)
                    r7 = 3
                    if (r4 == 0) goto L_0x0079
                    jv6 r4 = r0.I
                    int r8 = r4.v
                    int r4 = r4.s(r8)
                    jv6 r9 = r0.I
                    java.lang.Object r9 = r9.t(r8)
                    jv6 r10 = r0.I
                    java.lang.Object r8 = r10.q(r8)
                    if (r9 != 0) goto L_0x0061
                    if (r8 == 0) goto L_0x004e
                    if (r4 != r6) goto L_0x004e
                    boolean r5 = r8.equals(r5)
                    if (r5 != 0) goto L_0x004e
                    int r4 = r8.hashCode()
                    long r5 = r0.T
                    long r8 = (long) r2
                    long r5 = r5 ^ r8
                    long r5 = java.lang.Long.rotateRight(r5, r7)
                    long r8 = (long) r4
                    long r4 = r5 ^ r8
                    long r4 = java.lang.Long.rotateRight(r4, r7)
                    r0.T = r4
                    goto L_0x00dd
                L_0x004e:
                    long r5 = r0.T
                    long r8 = (long) r2
                    long r5 = r5 ^ r8
                    long r5 = java.lang.Long.rotateRight(r5, r7)
                    long r8 = (long) r4
                    long r4 = r5 ^ r8
                L_0x0059:
                    long r4 = java.lang.Long.rotateRight(r4, r7)
                    r0.T = r4
                    goto L_0x00dd
                L_0x0061:
                    boolean r2 = r9 instanceof java.lang.Enum
                    if (r2 == 0) goto L_0x0074
                    java.lang.Enum r9 = (java.lang.Enum) r9
                    int r2 = r9.ordinal()
                L_0x006b:
                    long r4 = r0.T
                    long r4 = java.lang.Long.rotateRight(r4, r7)
                    long r8 = (long) r2
                    long r4 = r4 ^ r8
                    goto L_0x0059
                L_0x0074:
                    int r2 = r9.hashCode()
                    goto L_0x006b
                L_0x0079:
                    fv6 r4 = r0.G
                    int r8 = r4.i
                    int r4 = r4.i(r8)
                    fv6 r9 = r0.G
                    int[] r10 = r9.b
                    java.lang.Object r9 = r9.p(r10, r8)
                    fv6 r10 = r0.G
                    int[] r11 = r10.b
                    java.lang.Object r8 = r10.b(r11, r8)
                    if (r9 != 0) goto L_0x00c5
                    if (r8 == 0) goto L_0x00b3
                    if (r4 != r6) goto L_0x00b3
                    boolean r5 = r8.equals(r5)
                    if (r5 != 0) goto L_0x00b3
                    int r4 = r8.hashCode()
                    long r5 = r0.T
                    long r8 = (long) r2
                    long r5 = r5 ^ r8
                    long r5 = java.lang.Long.rotateRight(r5, r7)
                    long r8 = (long) r4
                    long r4 = r5 ^ r8
                    long r4 = java.lang.Long.rotateRight(r4, r7)
                    r0.T = r4
                    goto L_0x00dd
                L_0x00b3:
                    long r5 = r0.T
                    long r8 = (long) r2
                    long r5 = r5 ^ r8
                    long r5 = java.lang.Long.rotateRight(r5, r7)
                    long r8 = (long) r4
                    long r4 = r5 ^ r8
                L_0x00be:
                    long r4 = java.lang.Long.rotateRight(r4, r7)
                    r0.T = r4
                    goto L_0x00dd
                L_0x00c5:
                    boolean r2 = r9 instanceof java.lang.Enum
                    if (r2 == 0) goto L_0x00d8
                    java.lang.Enum r9 = (java.lang.Enum) r9
                    int r2 = r9.ordinal()
                L_0x00cf:
                    long r4 = r0.T
                    long r4 = java.lang.Long.rotateRight(r4, r7)
                    long r8 = (long) r2
                    long r4 = r4 ^ r8
                    goto L_0x00be
                L_0x00d8:
                    int r2 = r9.hashCode()
                    goto L_0x00cf
                L_0x00dd:
                    int r2 = r0.l
                    bu2 r4 = r0.j
                    java.util.ArrayList r5 = r0.s
                    by0 r9 = r0.M
                    if (r4 == 0) goto L_0x039c
                    yo4 r10 = r4.e
                    int r11 = r4.b
                    java.util.ArrayList r12 = r4.a
                    int r13 = r12.size()
                    if (r13 <= 0) goto L_0x039c
                    java.util.ArrayList r13 = r4.d
                    java.util.HashSet r14 = new java.util.HashSet
                    int r15 = r13.size()
                    r14.<init>(r15)
                    int r15 = r13.size()
                    r16 = r7
                    r7 = 0
                L_0x0105:
                    if (r7 >= r15) goto L_0x0113
                    r17 = -1
                    java.lang.Object r6 = r13.get(r7)
                    r14.add(r6)
                    int r7 = r7 + 1
                    goto L_0x0105
                L_0x0113:
                    r17 = -1
                    up4 r6 = defpackage.cg6.a
                    up4 r6 = new up4
                    r6.<init>()
                    int r7 = r13.size()
                    int r15 = r12.size()
                    r18 = r3
                    r3 = 0
                    r19 = 0
                    r20 = 0
                L_0x012b:
                    if (r3 >= r15) goto L_0x0379
                    java.lang.Object r21 = r12.get(r3)
                    r8 = r21
                    ss3 r8 = (defpackage.ss3) r8
                    boolean r21 = r14.contains(r8)
                    if (r21 != 0) goto L_0x018a
                    r21 = r1
                    int r1 = r8.c
                    java.lang.Object r1 = r10.b(r1)
                    tx2 r1 = (defpackage.tx2) r1
                    if (r1 == 0) goto L_0x014c
                    int r1 = r1.b
                    r22 = r1
                    goto L_0x014e
                L_0x014c:
                    r22 = r17
                L_0x014e:
                    int r1 = r8.c
                    r23 = r3
                    int r3 = r22 + r11
                    int r8 = r8.d
                    r9.f(r3, r8)
                    r3 = 0
                    r4.a(r1, r3)
                    int r3 = r9.f
                    yt2 r8 = r9.a
                    fv6 r8 = r8.G
                    int r8 = r8.g
                    int r8 = r1 - r8
                    int r8 = r8 + r3
                    r9.f = r8
                    fv6 r3 = r0.G
                    r3.r(r1)
                    r0.N()
                    fv6 r3 = r0.G
                    r3.s()
                    fv6 r3 = r0.G
                    int[] r3 = r3.b
                    int r8 = r1 * 5
                    int r8 = r8 + 3
                    r3 = r3[r8]
                    int r3 = r3 + r1
                    defpackage.b96.d(r5, r1, r3)
                L_0x0185:
                    int r3 = r23 + 1
                L_0x0187:
                    r1 = r21
                    goto L_0x012b
                L_0x018a:
                    r21 = r1
                    r23 = r3
                    boolean r1 = r6.c(r8)
                    if (r1 == 0) goto L_0x0195
                    goto L_0x0185
                L_0x0195:
                    r1 = r19
                    if (r1 >= r7) goto L_0x036f
                    java.lang.Object r3 = r13.get(r1)
                    ss3 r3 = (defpackage.ss3) r3
                    if (r3 == r8) goto L_0x0332
                    int r8 = r3.c
                    java.lang.Object r8 = r10.b(r8)
                    tx2 r8 = (defpackage.tx2) r8
                    if (r8 == 0) goto L_0x01ae
                    int r8 = r8.b
                    goto L_0x01b0
                L_0x01ae:
                    r8 = r17
                L_0x01b0:
                    r6.a(r3)
                    r19 = r1
                    r1 = r20
                    r20 = r4
                    if (r8 == r1) goto L_0x0321
                    int r4 = r3.c
                    java.lang.Object r4 = r10.b(r4)
                    tx2 r4 = (defpackage.tx2) r4
                    if (r4 == 0) goto L_0x01ca
                    int r4 = r4.c
                L_0x01c7:
                    r22 = r6
                    goto L_0x01cd
                L_0x01ca:
                    int r4 = r3.d
                    goto L_0x01c7
                L_0x01cd:
                    int r6 = r8 + r11
                    r24 = r7
                    int r7 = r1 + r11
                    if (r4 <= 0) goto L_0x01fc
                    r25 = r11
                    int r11 = r9.l
                    if (r11 <= 0) goto L_0x01f0
                    r26 = r11
                    int r11 = r9.j
                    r27 = r12
                    int r12 = r6 - r26
                    if (r11 != r12) goto L_0x01f2
                    int r11 = r9.k
                    int r12 = r7 - r26
                    if (r11 != r12) goto L_0x01f2
                    int r11 = r26 + r4
                    r9.l = r11
                    goto L_0x0203
                L_0x01f0:
                    r27 = r12
                L_0x01f2:
                    r9.c()
                    r9.j = r6
                    r9.k = r7
                    r9.l = r4
                    goto L_0x0203
                L_0x01fc:
                    r25 = r11
                    r27 = r12
                    r9.getClass()
                L_0x0203:
                    r26 = 7
                    r28 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    r30 = 128(0x80, double:6.3E-322)
                    if (r8 <= r1) goto L_0x0293
                    java.lang.Object[] r7 = r10.c
                    r32 = 255(0xff, double:1.26E-321)
                    long[] r11 = r10.a
                    int r12 = r11.length
                    int r12 = r12 + -2
                    if (r12 < 0) goto L_0x028f
                    r35 = r13
                    r36 = r14
                    r6 = 0
                L_0x021e:
                    r34 = 8
                    r13 = r11[r6]
                    r38 = r4
                    r37 = r5
                    long r4 = ~r13
                    long r4 = r4 << r26
                    long r4 = r4 & r13
                    long r4 = r4 & r28
                    int r4 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
                    if (r4 == 0) goto L_0x027e
                    int r4 = r6 - r12
                    int r4 = ~r4
                    int r4 = r4 >>> 31
                    int r4 = 8 - r4
                    r5 = 0
                L_0x0238:
                    if (r5 >= r4) goto L_0x0275
                    long r39 = r13 & r32
                    int r39 = (r39 > r30 ? 1 : (r39 == r30 ? 0 : -1))
                    if (r39 >= 0) goto L_0x0266
                    int r39 = r6 << 3
                    int r39 = r39 + r5
                    r39 = r7[r39]
                    r40 = r5
                    r5 = r39
                    tx2 r5 = (defpackage.tx2) r5
                    r39 = r7
                    int r7 = r5.b
                    r41 = r11
                    if (r8 > r7) goto L_0x025d
                    int r11 = r8 + r38
                    if (r7 >= r11) goto L_0x025d
                    int r7 = r7 - r8
                    int r7 = r7 + r1
                    r5.b = r7
                    goto L_0x026c
                L_0x025d:
                    if (r1 > r7) goto L_0x026c
                    if (r7 >= r8) goto L_0x026c
                    int r7 = r7 + r38
                    r5.b = r7
                    goto L_0x026c
                L_0x0266:
                    r40 = r5
                    r39 = r7
                    r41 = r11
                L_0x026c:
                    long r13 = r13 >> r34
                    int r5 = r40 + 1
                    r7 = r39
                    r11 = r41
                    goto L_0x0238
                L_0x0275:
                    r39 = r7
                    r41 = r11
                    r5 = r34
                    if (r4 != r5) goto L_0x032f
                    goto L_0x0282
                L_0x027e:
                    r39 = r7
                    r41 = r11
                L_0x0282:
                    if (r6 == r12) goto L_0x032f
                    int r6 = r6 + 1
                    r5 = r37
                    r4 = r38
                    r7 = r39
                    r11 = r41
                    goto L_0x021e
                L_0x028f:
                    r37 = r5
                    goto L_0x032b
                L_0x0293:
                    r38 = r4
                    r37 = r5
                    r35 = r13
                    r36 = r14
                    r32 = 255(0xff, double:1.26E-321)
                    if (r1 <= r8) goto L_0x032f
                    java.lang.Object[] r4 = r10.c
                    long[] r5 = r10.a
                    int r6 = r5.length
                    int r6 = r6 + -2
                    if (r6 < 0) goto L_0x032f
                    r7 = 0
                L_0x02a9:
                    r11 = r5[r7]
                    long r13 = ~r11
                    long r13 = r13 << r26
                    long r13 = r13 & r11
                    long r13 = r13 & r28
                    int r13 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
                    if (r13 == 0) goto L_0x030e
                    int r13 = r7 - r6
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    r34 = 8
                    int r13 = 8 - r13
                    r14 = 0
                L_0x02bf:
                    if (r14 >= r13) goto L_0x0303
                    long r39 = r11 & r32
                    int r39 = (r39 > r30 ? 1 : (r39 == r30 ? 0 : -1))
                    if (r39 >= 0) goto L_0x02f2
                    int r39 = r7 << 3
                    int r39 = r39 + r14
                    r39 = r4[r39]
                    r40 = r4
                    r4 = r39
                    tx2 r4 = (defpackage.tx2) r4
                    r39 = r5
                    int r5 = r4.b
                    r41 = r8
                    if (r8 > r5) goto L_0x02e5
                    int r8 = r41 + r38
                    if (r5 >= r8) goto L_0x02e5
                    int r5 = r5 - r41
                    int r5 = r5 + r1
                    r4.b = r5
                    goto L_0x02ef
                L_0x02e5:
                    int r8 = r41 + 1
                    if (r8 > r5) goto L_0x02ef
                    if (r5 >= r1) goto L_0x02ef
                    int r5 = r5 - r38
                    r4.b = r5
                L_0x02ef:
                    r5 = 8
                    goto L_0x02f9
                L_0x02f2:
                    r40 = r4
                    r39 = r5
                    r41 = r8
                    goto L_0x02ef
                L_0x02f9:
                    long r11 = r11 >> r5
                    int r14 = r14 + 1
                    r5 = r39
                    r4 = r40
                    r8 = r41
                    goto L_0x02bf
                L_0x0303:
                    r40 = r4
                    r39 = r5
                    r41 = r8
                    r5 = 8
                    if (r13 != r5) goto L_0x032f
                    goto L_0x0316
                L_0x030e:
                    r40 = r4
                    r39 = r5
                    r41 = r8
                    r5 = 8
                L_0x0316:
                    if (r7 == r6) goto L_0x032f
                    int r7 = r7 + 1
                    r5 = r39
                    r4 = r40
                    r8 = r41
                    goto L_0x02a9
                L_0x0321:
                    r37 = r5
                    r22 = r6
                    r24 = r7
                    r25 = r11
                    r27 = r12
                L_0x032b:
                    r35 = r13
                    r36 = r14
                L_0x032f:
                    r4 = r23
                    goto L_0x0348
                L_0x0332:
                    r19 = r1
                    r37 = r5
                    r22 = r6
                    r24 = r7
                    r25 = r11
                    r27 = r12
                    r35 = r13
                    r36 = r14
                    r1 = r20
                    r20 = r4
                    int r4 = r23 + 1
                L_0x0348:
                    int r19 = r19 + 1
                    int r5 = r3.c
                    java.lang.Object r5 = r10.b(r5)
                    tx2 r5 = (defpackage.tx2) r5
                    if (r5 == 0) goto L_0x0357
                    int r3 = r5.c
                    goto L_0x0359
                L_0x0357:
                    int r3 = r3.d
                L_0x0359:
                    int r1 = r1 + r3
                    r3 = r4
                    r4 = r20
                    r6 = r22
                    r7 = r24
                    r11 = r25
                    r12 = r27
                    r13 = r35
                    r14 = r36
                    r5 = r37
                    r20 = r1
                    goto L_0x0187
                L_0x036f:
                    r19 = r1
                    r1 = r20
                    r1 = r21
                    r3 = r23
                    goto L_0x012b
                L_0x0379:
                    r21 = r1
                    r37 = r5
                    r27 = r12
                    r9.c()
                    int r1 = r27.size()
                    if (r1 <= 0) goto L_0x03a4
                    fv6 r1 = r0.G
                    int r3 = r1.h
                    int r4 = r9.f
                    yt2 r5 = r9.a
                    fv6 r5 = r5.G
                    int r5 = r5.g
                    int r3 = r3 - r5
                    int r3 = r3 + r4
                    r9.f = r3
                    r1.t()
                    goto L_0x03a4
                L_0x039c:
                    r21 = r1
                    r18 = r3
                    r37 = r5
                    r17 = -1
                L_0x03a4:
                    boolean r1 = r0.S
                    if (r1 != 0) goto L_0x03d8
                    fv6 r3 = r0.G
                    int r4 = r3.m
                    int r3 = r3.l
                    int r4 = r4 - r3
                    if (r4 <= 0) goto L_0x03d8
                    if (r4 <= 0) goto L_0x03d5
                    r3 = 0
                    r9.d(r3)
                    r9.e()
                    bn0 r3 = r9.b
                    j75 r3 = r3.u
                    a75 r5 = defpackage.a75.d
                    r3.s(r5)
                    int[] r5 = r3.i
                    int r6 = r3.j
                    vg2[] r7 = r3.g
                    int r3 = r3.h
                    int r3 = r3 + -1
                    r3 = r7[r3]
                    int r3 = r3.b
                    int r6 = r6 - r3
                    r5[r6] = r4
                    goto L_0x03d8
                L_0x03d5:
                    r9.getClass()
                L_0x03d8:
                    int r3 = r0.k
                L_0x03da:
                    fv6 r4 = r0.G
                    int r5 = r4.k
                    if (r5 <= 0) goto L_0x03e1
                    goto L_0x03e7
                L_0x03e1:
                    int r5 = r4.g
                    int r4 = r4.h
                    if (r5 != r4) goto L_0x0546
                L_0x03e7:
                    if (r1 == 0) goto L_0x04cc
                    if (r43 == 0) goto L_0x0441
                    kg2 r2 = r0.O
                    j75 r3 = r2.h
                    int r4 = r3.h
                    if (r4 == 0) goto L_0x03f4
                    goto L_0x03f9
                L_0x03f4:
                    java.lang.String r4 = "Cannot end node insertion, there are no pending operations that can be realized."
                    defpackage.ey0.a(r4)
                L_0x03f9:
                    j75 r2 = r2.g
                    vg2[] r4 = r3.g
                    int r5 = r3.h
                    int r5 = r5 + -1
                    r3.h = r5
                    r6 = r4[r5]
                    r7 = 0
                    r4[r5] = r7
                    r2.s(r6)
                    java.lang.Object[] r4 = r3.k
                    java.lang.Object[] r5 = r2.k
                    int r8 = r2.l
                    int r10 = r6.c
                    int r8 = r8 - r10
                    int r11 = r3.l
                    int r12 = r11 - r10
                    int r11 = r11 - r12
                    java.lang.System.arraycopy(r4, r12, r5, r8, r11)
                    java.lang.Object[] r4 = r3.k
                    int r5 = r3.l
                    int r8 = r5 - r10
                    java.util.Arrays.fill(r4, r8, r5, r7)
                    int[] r4 = r3.i
                    int[] r5 = r2.i
                    int r2 = r2.j
                    int r6 = r6.b
                    int r2 = r2 - r6
                    int r7 = r3.j
                    int r8 = r7 - r6
                    defpackage.qs.J0(r2, r8, r7, r4, r5)
                    int r2 = r3.l
                    int r2 = r2 - r10
                    r3.l = r2
                    int r2 = r3.j
                    int r2 = r2 - r6
                    r3.j = r2
                    r2 = r18
                L_0x0441:
                    fv6 r3 = r0.G
                    int r4 = r3.k
                    if (r4 <= 0) goto L_0x0448
                    goto L_0x044d
                L_0x0448:
                    java.lang.String r4 = "Unbalanced begin/end empty"
                    defpackage.vm5.a(r4)
                L_0x044d:
                    int r4 = r3.k
                    int r4 = r4 + -1
                    r3.k = r4
                    jv6 r3 = r0.I
                    int r4 = r3.v
                    r3.j()
                    fv6 r3 = r0.G
                    int r3 = r3.k
                    if (r3 <= 0) goto L_0x0462
                    goto L_0x0515
                L_0x0462:
                    int r3 = -2 - r4
                    jv6 r4 = r0.I
                    r4.k()
                    jv6 r4 = r0.I
                    r5 = r18
                    r4.e(r5)
                    st2 r4 = r0.N
                    kg2 r5 = r0.O
                    j75 r5 = r5.g
                    boolean r5 = r5.r()
                    gv6 r6 = r0.H
                    if (r5 == 0) goto L_0x0499
                    r9.b()
                    r5 = 0
                    r9.d(r5)
                    r9.e()
                    r9.c()
                    bn0 r7 = r9.b
                    j75 r7 = r7.u
                    k65 r8 = defpackage.k65.d
                    r7.s(r8)
                    r8 = 1
                    defpackage.i75.m(r7, r5, r4, r8, r6)
                    goto L_0x04bc
                L_0x0499:
                    r5 = 0
                    kg2 r7 = r0.O
                    r9.b()
                    r9.d(r5)
                    r9.e()
                    r9.c()
                    bn0 r5 = r9.b
                    j75 r5 = r5.u
                    l65 r8 = defpackage.l65.d
                    r5.s(r8)
                    defpackage.i75.n(r5, r4, r6, r7)
                    kg2 r4 = new kg2
                    r4.<init>()
                    r0.O = r4
                    r5 = 0
                L_0x04bc:
                    r0.S = r5
                    gv6 r4 = r0.c
                    int r4 = r4.x
                    if (r4 != 0) goto L_0x04c5
                    goto L_0x0515
                L_0x04c5:
                    r0.m0(r3, r5)
                    r0.n0(r3, r2)
                    goto L_0x0515
                L_0x04cc:
                    if (r43 == 0) goto L_0x04d1
                    r9.a()
                L_0x04d1:
                    yt2 r3 = r9.a
                    fv6 r3 = r3.G
                    int r3 = r3.i
                    xe3 r4 = r9.d
                    r6 = r17
                    int r5 = r4.a(r6)
                    if (r5 > r3) goto L_0x04e2
                    goto L_0x04e7
                L_0x04e2:
                    java.lang.String r5 = "Missed recording an endGroup"
                    defpackage.ey0.a(r5)
                L_0x04e7:
                    int r5 = r4.a(r6)
                    if (r5 != r3) goto L_0x04fd
                    r7 = 0
                    r9.d(r7)
                    r4.b()
                    bn0 r3 = r9.b
                    j75 r3 = r3.u
                    e65 r4 = defpackage.e65.d
                    r3.s(r4)
                L_0x04fd:
                    fv6 r3 = r0.G
                    int r3 = r3.i
                    int r4 = r0.q0(r3)
                    if (r2 == r4) goto L_0x050a
                    r0.n0(r3, r2)
                L_0x050a:
                    if (r43 == 0) goto L_0x050d
                    r2 = 1
                L_0x050d:
                    fv6 r3 = r0.G
                    r3.e()
                    r9.c()
                L_0x0515:
                    java.util.ArrayList r3 = r0.i
                    int r4 = r3.size()
                    r18 = 1
                    int r4 = r4 + -1
                    java.lang.Object r3 = r3.remove(r4)
                    bu2 r3 = (defpackage.bu2) r3
                    if (r3 == 0) goto L_0x052f
                    if (r1 != 0) goto L_0x052f
                    int r1 = r3.c
                    int r1 = r1 + 1
                    r3.c = r1
                L_0x052f:
                    r0.j = r3
                    int r1 = r21.b()
                    int r1 = r1 + r2
                    r0.k = r1
                    int r1 = r21.b()
                    r0.m = r1
                    int r1 = r21.b()
                    int r1 = r1 + r2
                    r0.l = r1
                    return
                L_0x0546:
                    r6 = r17
                    r7 = 0
                    r0.N()
                    fv6 r4 = r0.G
                    int r4 = r4.s()
                    r9.f(r3, r4)
                    fv6 r4 = r0.G
                    int r4 = r4.g
                    r8 = r37
                    defpackage.b96.d(r8, r5, r4)
                    goto L_0x03da
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.yt2.r(boolean):void");
            }

            public final void r0() {
                if (!this.r) {
                    ey0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
                }
                this.r = false;
                if (this.S) {
                    ey0.a("useNode() called while inserting");
                }
                fv6 fv6 = this.G;
                Object n2 = fv6.n(fv6.i);
                by0 by0 = this.M;
                by0.c();
                by0.h.add(n2);
                if (this.y && (n2 instanceof jx0)) {
                    by0.b();
                    by0.b.u.s(e75.d);
                }
            }

            public final void s() {
                r(false);
                yx5 B2 = B();
                if (B2 != null) {
                    int i2 = B2.b;
                    if ((i2 & 1) != 0) {
                        B2.b = i2 | 2;
                    }
                }
            }

            public final void t() {
                r(true);
            }

            public final void u() {
                r(false);
            }

            public final yx5 v() {
                yx5 yx5;
                yx5 yx52;
                st2 st2;
                mp2 mp2;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty()) {
                    yx5 = (yx5) arrayList.remove(arrayList.size() - 1);
                } else {
                    yx5 = null;
                }
                if (yx5 != null) {
                    yx5.b &= -9;
                    this.g.o();
                    int i2 = this.B;
                    hp4 hp4 = yx5.f;
                    if (hp4 != null && (yx5.b & 16) == 0) {
                        Object[] objArr = hp4.b;
                        int[] iArr = hp4.c;
                        long[] jArr = hp4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            loop0:
                            while (true) {
                                long j2 = jArr[i3];
                                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((j2 & 255) < 128) {
                                            int i6 = (i3 << 3) + i5;
                                            Object obj = objArr[i6];
                                            if (iArr[i6] != i2) {
                                                mp2 = new mp2(yx5, i2, hp4, 2);
                                                break loop0;
                                            }
                                        }
                                        j2 >>= 8;
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
                    }
                    mp2 = null;
                    by0 by0 = this.M;
                    if (mp2 != null) {
                        j75 j75 = by0.b.u;
                        j75.s(d65.d);
                        i75.m(j75, 0, mp2, 1, this.h);
                    }
                    int i7 = yx5.b;
                    if ((i7 & 512) != 0) {
                        yx5.b = i7 & -513;
                        j75 j752 = by0.b.u;
                        j752.s(g65.d);
                        i75.l(j752, 0, yx5);
                        int i8 = yx5.b;
                        yx5.b = i8 & -129;
                        if ((i8 & 1024) != 0) {
                            yx5.b = i8 & -1153;
                            if (this.z == this.G.i) {
                                this.y = false;
                                this.z = -1;
                            }
                        }
                    }
                }
                if (yx5 != null) {
                    int i9 = yx5.b;
                    if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                        if (yx5.c == null) {
                            if (this.S) {
                                jv6 jv6 = this.I;
                                st2 = jv6.b(jv6.v);
                            } else {
                                fv6 fv6 = this.G;
                                st2 = fv6.a(fv6.i);
                            }
                            yx5.c = st2;
                        }
                        yx5.b &= -5;
                        yx52 = yx5;
                        r(false);
                        return yx52;
                    }
                }
                yx52 = null;
                r(false);
                return yx52;
            }

            public final void w() {
                boolean z2 = false;
                r(false);
                this.b.d();
                r(false);
                by0 by0 = this.M;
                if (by0.c) {
                    by0.d(false);
                    by0.d(false);
                    by0.b.u.s(e65.d);
                    by0.c = false;
                }
                by0.b();
                if (by0.d.b != 0) {
                    ey0.a("Missed recording an endGroup()");
                }
                if (!this.i.isEmpty()) {
                    ey0.a("Start/end imbalance");
                }
                j();
                this.G.c();
                if (this.x.b() != 0) {
                    z2 = true;
                }
                this.w = z2;
            }

            public final void x(boolean z2, bu2 bu2) {
                this.i.add(this.j);
                this.j = bu2;
                int i2 = this.l;
                xe3 xe3 = this.n;
                xe3.c(i2);
                xe3.c(this.m);
                xe3.c(this.k);
                if (z2) {
                    this.k = 0;
                }
                this.l = 0;
                this.m = 0;
            }

            public final void y() {
                gv6 gv6 = new gv6();
                if (this.C) {
                    gv6.g();
                }
                if (this.b.e()) {
                    gv6.G = new yo4();
                }
                this.H = gv6;
                jv6 o2 = gv6.o();
                o2.e(true);
                this.I = o2;
            }

            public final my0 z() {
                zt2 zt2 = this.U;
                if (zt2 != null) {
                    return zt2;
                }
                zt2 zt22 = new zt2(this.h);
                this.U = zt22;
                return zt22;
            }
        }
