package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ey0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ey0 {
    public static final t55 a = new t55("provider");
    public static final t55 b = new t55("provider");
    public static final t55 c = new t55("compositionLocalMap");
    public static final t55 d = new t55("providers");
    public static final t55 e = new t55("reference");

    public static final void a(String str) {
        throw new ComposeRuntimeError(f21.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(f21.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: d63} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final gn4 c(py0 py0, hn4 hn4, jv6 jv6, kr krVar) {
        gv6 gv6;
        d63 d63;
        int i;
        d63 d632;
        a42 a42;
        long[] jArr;
        st2 st2;
        int i2;
        int i3;
        gv6 gv62;
        d63 d633;
        long j;
        long[] jArr2;
        st2 st22;
        int i4;
        boolean z;
        boolean z2;
        long[] jArr3;
        int i5;
        int i6;
        long j2;
        int i7;
        long[] jArr4;
        int i8;
        int i9;
        py0 py02 = py0;
        hn4 hn42 = hn4;
        jv6 jv62 = jv6;
        kr krVar2 = krVar;
        d63 d634 = ay0.a;
        gv6 gv63 = new gv6();
        if (jv62.e != null) {
            gv63.g();
        }
        if (jv62.f != null) {
            gv63.G = new yo4();
        }
        int i10 = jv62.t;
        if (krVar2 != null && jv62.F(i10) > 0) {
            int i11 = jv62.v;
            while (i11 > 0 && !jv62.y(i11)) {
                i11 = jv62.G(jv62.b, i11);
            }
            if (i11 >= 0 && jv62.y(i11)) {
                Object E = jv62.E(i11);
                int i12 = i11 + 1;
                int u = jv62.u(i11) + i11;
                int i13 = 0;
                while (i12 < u) {
                    int u2 = jv62.u(i12) + i12;
                    if (u2 > i10) {
                        break;
                    }
                    if (jv62.y(i12)) {
                        i9 = 1;
                    } else {
                        i9 = jv62.F(i12);
                    }
                    i13 += i9;
                    i12 = u2;
                }
                if (jv62.y(i10)) {
                    i8 = 1;
                } else {
                    i8 = jv62.F(i10);
                }
                krVar2.c(E);
                krVar2.g(i13, i8);
                krVar2.i();
            }
        }
        st2 st23 = hn42.e;
        if (st23.a()) {
            py02.getClass();
            if (py02.J.e > 0) {
                ArrayList arrayList = new ArrayList();
                tp4 tp4 = py02.J;
                long[] jArr5 = tp4.a;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j3 = jArr5[i14];
                        if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j3 & 255) < 128) {
                                    int i18 = i15;
                                    int i19 = (i14 << 3) + i17;
                                    st22 = st23;
                                    Object obj = tp4.b[i19];
                                    Object obj2 = tp4.c[i19];
                                    obj.getClass();
                                    jArr2 = jArr5;
                                    if (obj2 instanceof up4) {
                                        up4 up4 = (up4) obj2;
                                        Object[] objArr = up4.b;
                                        long[] jArr6 = up4.a;
                                        j = j3;
                                        int length2 = jArr6.length - 2;
                                        d633 = d634;
                                        gv62 = gv63;
                                        if (length2 >= 0) {
                                            int i20 = 0;
                                            while (true) {
                                                long j4 = jArr6[i20];
                                                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                    int i22 = 0;
                                                    while (i22 < i21) {
                                                        if ((j4 & 255) < 128) {
                                                            i7 = i22;
                                                            int i23 = (i20 << 3) + i7;
                                                            j2 = j4;
                                                            Object obj3 = objArr[i23];
                                                            yx5 yx5 = (yx5) obj;
                                                            jArr4 = jArr6;
                                                            st2 st24 = yx5.c;
                                                            if (st24 != null) {
                                                                st2 st25 = st24;
                                                                st2 m = hj8.m(st22);
                                                                i5 = i17;
                                                                st2 m2 = hj8.m(st25);
                                                                int c2 = jv62.c(m);
                                                                i6 = length;
                                                                int i24 = jv62.b[(c2 * 5) + 3] + c2;
                                                                int i25 = m2.a;
                                                                if (c2 <= i25 && i25 < i24) {
                                                                    arrayList.add(new yb5(yx5, obj3));
                                                                    up4.m(i23);
                                                                }
                                                                j4 = j2 >> i18;
                                                                i22 = i7 + 1;
                                                                jArr6 = jArr4;
                                                                length = i6;
                                                                i17 = i5;
                                                            }
                                                        } else {
                                                            i7 = i22;
                                                            j2 = j4;
                                                            jArr4 = jArr6;
                                                        }
                                                        i6 = length;
                                                        i5 = i17;
                                                        j4 = j2 >> i18;
                                                        i22 = i7 + 1;
                                                        jArr6 = jArr4;
                                                        length = i6;
                                                        i17 = i5;
                                                    }
                                                    jArr3 = jArr6;
                                                    i3 = length;
                                                    i2 = i17;
                                                    if (i21 != i18) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    i3 = length;
                                                    i2 = i17;
                                                }
                                                if (i20 == length2) {
                                                    break;
                                                }
                                                i20++;
                                                py0 py03 = py0;
                                                hn4 hn43 = hn4;
                                                jArr6 = jArr3;
                                                length = i3;
                                                i17 = i2;
                                                i18 = 8;
                                            }
                                        } else {
                                            i3 = length;
                                            i2 = i17;
                                        }
                                        z = up4.g();
                                    } else {
                                        d633 = d634;
                                        gv62 = gv63;
                                        i3 = length;
                                        j = j3;
                                        i2 = i17;
                                        obj2.getClass();
                                        yx5 yx52 = (yx5) obj;
                                        st2 st26 = yx52.c;
                                        if (st26 != null) {
                                            st2 m3 = hj8.m(st22);
                                            st2 m4 = hj8.m(st26);
                                            int c3 = jv62.c(m3);
                                            int i26 = jv62.b[(c3 * 5) + 3] + c3;
                                            int i27 = m4.a;
                                            if (c3 <= i27 && i27 < i26) {
                                                arrayList.add(new yb5(yx52, obj2));
                                                z2 = true;
                                                z = z2;
                                            }
                                        }
                                        z2 = false;
                                        z = z2;
                                    }
                                    if (z) {
                                        tp4.l(i19);
                                    }
                                    i4 = 8;
                                } else {
                                    st22 = st23;
                                    d633 = d634;
                                    gv62 = gv63;
                                    jArr2 = jArr5;
                                    i3 = length;
                                    j = j3;
                                    i2 = i17;
                                    i4 = i15;
                                }
                                j3 = j >> i4;
                                i17 = i2 + 1;
                                py0 py04 = py0;
                                i15 = i4;
                                st23 = st22;
                                jArr5 = jArr2;
                                d634 = d633;
                                gv63 = gv62;
                                length = i3;
                                hn4 hn44 = hn4;
                            }
                            st2 = st23;
                            d63 = d634;
                            gv6 = gv63;
                            jArr = jArr5;
                            int i28 = length;
                            if (i16 != i15) {
                                a42 = arrayList;
                                break;
                            }
                            length = i28;
                        } else {
                            st2 = st23;
                            d63 = d634;
                            gv6 = gv63;
                            jArr = jArr5;
                        }
                        if (i14 == length) {
                            a42 = arrayList;
                            break;
                        }
                        i14++;
                        py0 py05 = py0;
                        hn4 hn45 = hn4;
                        st23 = st2;
                        jArr5 = jArr;
                        d634 = d63;
                        gv63 = gv6;
                    }
                } else {
                    d63 = d634;
                    gv6 = gv63;
                    a42 = arrayList;
                }
            } else {
                d63 = d634;
                gv6 = gv63;
                a42 = a42.w;
            }
            hn42 = hn4;
            hn42.f = dt0.M0(hn42.f, a42);
        } else {
            d63 = d634;
            gv6 = gv63;
        }
        jv6 o = gv6.o();
        try {
            o.d();
            d63 d635 = d63;
            o.S(hn42.a, false, d635, 126665345);
            jv6.z(o);
            o.U(hn42.b);
            List D = jv62.D(hj8.m(hn42.e), o);
            o.N();
            o.j();
            o.k();
            o.e(true);
            gv6 gv64 = gv6;
            gn4 gn4 = new gn4(gv64);
            if (!D.isEmpty()) {
                int size = D.size();
                for (int i29 = 0; i29 < size; i29++) {
                    st2 st27 = (st2) D.get(i29);
                    if (gv64.p(st27)) {
                        int f = gv64.f(st27);
                        int b2 = iv6.b(gv64.w, f);
                        int i30 = f + 1;
                        if (i30 < gv64.x) {
                            i = gv64.w[(i30 * 5) + 4];
                        } else {
                            i = gv64.y.length;
                        }
                        if (i - b2 > 0) {
                            d632 = gv64.y[b2];
                        } else {
                            d632 = d635;
                        }
                        if (d632 instanceof yx5) {
                            qc3 qc3 = new qc3(28, (Object) py0, (Object) hn42);
                            jv6 o2 = gv64.o();
                            try {
                                t75.b(o2, D, qc3);
                                return gn4;
                            } finally {
                                o2.e(false);
                            }
                        }
                    }
                    py0 py06 = py0;
                }
            }
            return gn4;
        } catch (Throwable th) {
            o.e(false);
            throw th;
        }
    }
}
