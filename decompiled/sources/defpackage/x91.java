package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: x91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x91 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781};
    public static final fw0 e = new fw0(-1571120048, new Object(), false);
    public static final fw0 f = new fw0(-1455401925, new nw0(0), false);
    public static final fw0 g = new fw0(552730965, new xw0(23), false);
    public static final vq6 h = vq6.B;
    public static final float i = 40.0f;
    public static final wh j = new wh(8);
    public static final vq6 k = vq6.y;
    public static final float l = 8.0f;
    public static final float m = 24.0f;
    public static x83 n;
    public static x83 o;
    public static es6 p;
    public static x83 q;
    public static x83 r;

    public static final x83 A() {
        x83 x83 = n;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, true, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(20.0f, 11.0f);
        be5.f(7.83f);
        be5.i(5.59f, -5.59f);
        be5.h(12.0f, 4.0f);
        be5.i(-8.0f, 8.0f);
        be5.i(8.0f, 8.0f);
        be5.i(1.41f, -1.41f);
        be5.h(7.83f, 13.0f);
        be5.f(20.0f);
        be5.n(-2.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        n = b2;
        return b2;
    }

    public static Object B(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.get(arrayList.size() - 1);
        }
        rf2.c();
        return null;
    }

    public static gs3 C(as3 as3) {
        as3.getClass();
        return new gs3(as3, ks3.w);
    }

    public static final boolean D(float[] fArr) {
        if (fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            return true;
        }
        return false;
    }

    public static bj0 E(e81 e81, gs2 gs2) {
        e81.getClass();
        return ar7.v(new yz0(e81, r81.w, gs2, 4));
    }

    public static final int F(k24 k24, boolean z) {
        int i2;
        int a2;
        if (z) {
            i2 = k24.c();
            a2 = k24.e();
        } else {
            i2 = k24.i();
            a2 = k24.a();
        }
        return a2 + i2;
    }

    public static final void G() {
        try {
            if (p == null) {
                es6 es6 = (es6) ((yd1) ((tf2) oe2.c().b(tf2.class))).o.get();
                es6.getClass();
                p = es6;
            }
            es6 es62 = p;
            if (es62 == null) {
                sg3.a0("sharedSessionRepository");
                throw null;
            } else if (!es62.i) {
            } else {
                if (es62 != null) {
                    es62.b();
                } else {
                    sg3.a0("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final ml4 I(ml4 ml4, vr2 vr2) {
        return ml4.d(new t31(vr2));
    }

    public static final ml4 J(ml4 ml4, la5 la5) {
        return ml4.d(new oa5(la5));
    }

    public static final ml4 K(ml4 ml4, float f2) {
        return ml4.d(new ja5(f2, f2, f2, f2));
    }

    public static final ml4 L(ml4 ml4, float f2, float f3) {
        return ml4.d(new ja5(f2, f3, f2, f3));
    }

    public static ml4 M(ml4 ml4, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return L(ml4, f2, f3);
    }

    public static final ml4 N(ml4 ml4, float f2, float f3, float f4, float f5) {
        return ml4.d(new ja5(f2, f3, f4, f5));
    }

    public static ml4 O(ml4 ml4, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return N(ml4, f2, f3, f4, f5);
    }

    public static final zw3 R(zw3 zw3, zw3 zw32) {
        zg2 p2;
        hz2 hz2 = hz2.L;
        fu6 s = rc9.s(zw3);
        if (s == null && ((p2 = rc9.p(zw3)) == null || (s = rc9.x0(p2)) == null)) {
            s = rc9.s(zw3);
            s.getClass();
        }
        if (rc9.U(rc9.b1(s)) == null) {
            qo7 qo7 = (qo7) dt0.Q0(rc9.L(zw3));
            if (a92.a[rc9.V(qo7).ordinal()] != 1) {
                du7 T = rc9.T(hz2, qo7);
                T.getClass();
                zw3 R = R(T, zw32);
                R.getClass();
                if (R instanceof vw3) {
                    hz2.g();
                    throw null;
                }
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(hz2);
                sb.append(", ");
                throw new IllegalArgumentException(hl6.m(b26.a, hz2.getClass(), sb).toString());
            }
            hz2.g();
            throw null;
        } else if (rc9.p0(zw3)) {
            return hz2.K0(zw32);
        } else {
            return zw32;
        }
    }

    public static final List S(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return a42.w;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k24 k24 = (k24) arrayList.get(i4);
            int index = k24.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(k24);
            }
        }
        ht0.g0(arrayList2, j);
        return arrayList2;
    }

    public static final ml4 T(ml4 ml4, aa8 aa8) {
        return ml4.d(new fd3(aa8));
    }

    public static Object U(fg0 fg0, qj qjVar, w42 w42) {
        tc0 e2 = fg0.e();
        e2.c();
        pi6 B = e2.B(1);
        byte[] bArr = B.a;
        int i2 = B.c;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
        wrap.getClass();
        qjVar.y(wrap);
        int position = wrap.position() - i2;
        if (position == 1) {
            B.c += position;
            e2.y += (long) position;
        } else {
            if (position >= 0) {
                int length = bArr.length;
                int i3 = B.c;
                if (position <= length - i3) {
                    if (position != 0) {
                        B.c = i3 + position;
                        e2.y += (long) position;
                    } else if (B.a() == 0) {
                        pi6 pi6 = e2.x;
                        pi6.getClass();
                        pi6 pi62 = pi6.g;
                        e2.x = pi62;
                        if (pi62 == null) {
                            e2.w = null;
                        } else {
                            pi62.f = null;
                        }
                        pi6.g = null;
                        ui6.a(pi6);
                    }
                }
            }
            StringBuilder o2 = pb4.o(position, "Invalid number of bytes written: ", ". Should be in 0..");
            o2.append(bArr.length - B.c);
            throw new IllegalStateException(o2.toString().toString());
        }
        Object c2 = fg0.c(w42);
        if (c2 == p81.w) {
            return c2;
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(ml4 ml4, s34 s34, la5 la5, vr vrVar, ib ibVar, eh2 eh2, boolean z, xf xfVar, vr2 vr2, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        s34 s342;
        int i6;
        la5 la52;
        vr vrVar2;
        int i7;
        int i8;
        boolean z2;
        xf xfVar2;
        boolean z3;
        eh2 eh22;
        ib ibVar2;
        vr vrVar3;
        la5 la53;
        s34 s343;
        yx5 v;
        int i9;
        vr vrVar4;
        g80 g80;
        xf xfVar3;
        boolean z4;
        rl1 rl1;
        la5 la54;
        la5 la55;
        vr vrVar5;
        int i10;
        int i11;
        int i12;
        yt2 yt22 = yt2;
        int i13 = i2;
        yt22.g0(53695811);
        if ((i13 & 6) == 0) {
            if (yt22.g(ml4)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i12 | i13;
        } else {
            ml4 ml42 = ml4;
            i4 = i13;
        }
        if ((i3 & 2) == 0) {
            s342 = s34;
            if (yt22.g(s342)) {
                i5 = 32;
                int i14 = i4 | i5;
                i6 = i3 & 4;
                if (i6 == 0) {
                    i14 |= 384;
                } else if ((i13 & 384) == 0) {
                    la52 = la5;
                    if (yt22.g(la52)) {
                        i11 = 256;
                    } else {
                        i11 = 128;
                    }
                    i14 |= i11;
                    int i15 = i14 | 3072;
                    if ((i13 & 24576) == 0) {
                        if ((i3 & 16) == 0) {
                            vrVar2 = vrVar;
                            if (yt22.g(vrVar2)) {
                                i10 = 16384;
                                i15 |= i10;
                            }
                        } else {
                            vrVar2 = vrVar;
                        }
                        i10 = 8192;
                        i15 |= i10;
                    } else {
                        vrVar2 = vrVar;
                    }
                    int i16 = i15 | 46858240;
                    if (yt22.i(vr2)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i8 = i16 | i7;
                    if ((306783379 & i8) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (yt22.V(i8 & 1, z2)) {
                        yt22.a0();
                        if ((i13 & 1) == 0 || yt22.C()) {
                            if ((i3 & 2) != 0) {
                                s342 = t34.a(0, 3, yt22);
                                i8 &= -113;
                            }
                            if (i6 != 0) {
                                la55 = new pa5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                la55 = la52;
                            }
                            if ((i3 & 16) != 0) {
                                i8 &= -57345;
                                vrVar5 = wr.c;
                            } else {
                                vrVar5 = vrVar2;
                            }
                            g80 g802 = xb4.K;
                            tj1 a2 = j07.a(yt22);
                            boolean g2 = yt22.g(a2);
                            Object Q = yt22.Q();
                            if (g2 || Q == ay0.a) {
                                Q = new rl1(a2);
                                yt22.o0(Q);
                            }
                            i9 = i8 & -238551041;
                            la54 = la55;
                            rl1 = (rl1) Q;
                            g80 = g802;
                            xfVar3 = l95.b(yt22);
                            vrVar4 = vrVar5;
                            z4 = true;
                        } else {
                            yt22.Y();
                            if ((i3 & 2) != 0) {
                                i8 &= -113;
                            }
                            if ((i3 & 16) != 0) {
                                i8 &= -57345;
                            }
                            g80 = ibVar;
                            rl1 = eh2;
                            i9 = i8 & -238551041;
                            la54 = la52;
                            vrVar4 = vrVar2;
                            z4 = z;
                            xfVar3 = xfVar;
                        }
                        yt22.s();
                        s34 s344 = s342;
                        hj8.i(ml4, s344, la54, true, rl1, z4, xfVar3, g80, vrVar4, (h80) null, (tr) null, vr2, yt22, 806882304 | (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                        xf xfVar4 = xfVar3;
                        eh22 = rl1;
                        vrVar3 = vrVar4;
                        xfVar2 = xfVar4;
                        ib ibVar3 = g80;
                        z3 = z4;
                        ibVar2 = ibVar3;
                        la53 = la54;
                        s343 = s344;
                    } else {
                        yt2.Y();
                        z3 = z;
                        xfVar2 = xfVar;
                        s343 = s342;
                        la53 = la52;
                        vrVar3 = vrVar2;
                        ibVar2 = ibVar;
                        eh22 = eh2;
                    }
                    v = yt2.v();
                    if (v != null) {
                        v.d = new he0(ml4, s343, la53, vrVar3, ibVar2, eh22, z3, xfVar2, vr2, i2, i3);
                        return;
                    }
                    return;
                }
                la52 = la5;
                int i152 = i14 | 3072;
                if ((i13 & 24576) == 0) {
                }
                int i162 = i152 | 46858240;
                if (yt22.i(vr2)) {
                }
                i8 = i162 | i7;
                if ((306783379 & i8) != 306783378) {
                }
                if (yt22.V(i8 & 1, z2)) {
                }
                v = yt2.v();
                if (v != null) {
                }
            }
        } else {
            s342 = s34;
        }
        i5 = 16;
        int i142 = i4 | i5;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        la52 = la5;
        int i1522 = i142 | 3072;
        if ((i13 & 24576) == 0) {
        }
        int i1622 = i1522 | 46858240;
        if (yt22.i(vr2)) {
        }
        i8 = i1622 | i7;
        if ((306783379 & i8) != 306783378) {
        }
        if (yt22.V(i8 & 1, z2)) {
        }
        v = yt2.v();
        if (v != null) {
        }
    }

    public static final void b(ml4 ml4, s34 s34, la5 la5, tr trVar, h80 h80, eh2 eh2, boolean z, xf xfVar, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        xf xfVar2;
        boolean z3;
        h80 h802;
        tr trVar2;
        la5 la52;
        rr rrVar;
        h80 h803;
        xf xfVar3;
        la5 la53;
        int i7;
        yt2 yt22 = yt2;
        yt22.g0(-1884325601);
        ml4 ml42 = ml4;
        if (yt22.g(ml42)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (yt22.g(s34)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4 | 208256;
        if (yt22.g(eh2)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i10 = i9 | i5 | 46137344;
        if (yt22.i(vr2)) {
            i6 = 536870912;
        } else {
            i6 = 268435456;
        }
        int i11 = i10 | i6;
        boolean z4 = true;
        if ((306783379 & i11) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i11 & 1, z2)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                la53 = new pa5(0.0f, 0.0f, 0.0f, 0.0f);
                h80 h804 = xb4.H;
                xf b2 = l95.b(yt22);
                i7 = i11 & -234938369;
                rrVar = wr.a;
                h803 = h804;
                xfVar3 = b2;
            } else {
                yt22.Y();
                i7 = i11 & -234938369;
                la53 = la5;
                rrVar = trVar;
                h803 = h80;
                z4 = z;
                xfVar3 = xfVar;
            }
            yt22.s();
            hj8.i(ml42, s34, la53, false, eh2, z4, xfVar3, (ib) null, (vr) null, h803, rrVar, vr2, yt22, (i7 & 14) | 24576 | (i7 & 112) | 3456 | (458752 & (i7 >> 3)) | 1572864, 48 | ((i7 >> 18) & 7168), 1792);
            h80 h805 = h803;
            xfVar2 = xfVar3;
            h802 = h805;
            la52 = la53;
            z3 = z4;
            trVar2 = rrVar;
        } else {
            yt2.Y();
            la52 = la5;
            trVar2 = trVar;
            h802 = h80;
            z3 = z;
            xfVar2 = xfVar;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new rz3(ml4, s34, la52, trVar2, h802, eh2, z3, xfVar2, vr2, i2);
        }
    }

    public static final void c(zs4 zs4, oe6 oe6, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        yt2.g0(233973821);
        if (yt2.i(zs4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.i(oe6)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        if (((i5 | i4) & 147) != 146 || !yt2.F()) {
            t49.d(new ju5[]{va4.a.a(zs4), ha4.a.a(zs4), oa4.a.a(zs4)}, su0.J(1808964477, new qq1(2, (Object) oe6, (Object) fw0), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i2, 29, zs4, oe6, fw0);
        }
    }

    public static final pa5 d(float f2, float f3) {
        return new pa5(f2, f3, f2, f3);
    }

    public static pa5 e(int i2, float f2) {
        float f3 = 0.0f;
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) == 0) {
            f3 = 12.0f;
        }
        return new pa5(f2, f3, f2, f3);
    }

    public static final pa5 f(float f2, float f3, float f4, float f5) {
        return new pa5(f2, f3, f4, f5);
    }

    public static pa5 g(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new pa5(f2, f3, f4, f5);
    }

    public static final void h(oe6 oe6, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        ib1 ib1;
        yt2.g0(832919318);
        if (yt2.i(oe6)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.i(fw0)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18 || !yt2.F()) {
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new tm3(24);
                yt2.o0(Q);
            }
            vr2 vr2 = (vr2) Q;
            a68 a2 = va4.a(yt2);
            if (a2 != null) {
                c26 c26 = b26.a;
                Class<p30> cls = p30.class;
                gq3 b2 = c26.b(cls);
                tb3 tb3 = new tb3(0);
                tb3.a(c26.b(cls), vr2);
                f9 b3 = tb3.b();
                if (a2 instanceof ry2) {
                    ib1 = ((ry2) a2).d();
                } else {
                    ib1 = gb1.b;
                }
                p30 p30 = (p30) n85.p(b2, a2, b3, ib1, yt2);
                p30.c = new uy5(oe6);
                oe6.b(p30.b, fw0, yt2, ((i6 << 6) & 896) | (i6 & 112));
            } else {
                h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(oe6, fw0, i2, 27);
        }
    }

    public static final void i(c5 c5Var, fk6 fk6) {
        if (fd1.o(fk6)) {
            ak6 ak6 = fk6.d;
            Object g2 = ak6.w.g(zj6.i);
            if (g2 == null) {
                g2 = null;
            }
            h4 h4Var = (h4) g2;
            if (h4Var != null) {
                c5Var.b(new w4(16908349, h4Var.a));
            }
        }
    }

    public static final sp7 j(zw3 zw3) {
        boolean z;
        du7 du7;
        zg2 p2;
        fu6 s = rc9.s(zw3);
        if (s == null && ((p2 = rc9.p(zw3)) == null || (s = rc9.x0(p2)) == null)) {
            s = rc9.s(zw3);
            s.getClass();
        }
        qp7 U = rc9.U(rc9.b1(s));
        if (U != null) {
            return U;
        }
        if (zw3 instanceof vw3) {
            z = fv3.z((vw3) zw3);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zw3);
            sb.append(", ");
            h.j(hl6.m(b26.a, zw3.getClass(), sb));
            z = false;
        }
        if (z) {
            qo7 qo7 = (qo7) dt0.Q0(rc9.L(zw3));
            qo7.getClass();
            if (rc9.t0(qo7)) {
                du7 = null;
            } else if (qo7 instanceof xp7) {
                du7 = ((xp7) qo7).b().n0();
            } else {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(qo7);
                sb2.append(", ");
                h.j(hl6.m(b26.a, qo7.getClass(), sb2));
                return null;
            }
            if (du7 != null) {
                return j(du7);
            }
        }
        return null;
    }

    public static final float k(la5 la5, ey3 ey3) {
        if (ey3 == ey3.w) {
            return la5.c(ey3);
        }
        return la5.b(ey3);
    }

    public static final float l(la5 la5, ey3 ey3) {
        if (ey3 == ey3.w) {
            return la5.b(ey3);
        }
        return la5.c(ey3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cd  */
    public static final zw3 q(zw3 zw3, HashSet hashSet) {
        fu6 fu6;
        zw3 zw32;
        zw3 q2;
        ql4 ql4;
        cc3 cc3;
        wo7 wo7;
        hz2 hz2 = hz2.L;
        xo7 i0 = hz2.i0(zw3);
        if (hashSet.add(i0)) {
            qp7 U = rc9.U(i0);
            boolean z = true;
            int i2 = 0;
            if (U != null) {
                vw3 S = rc9.S(U);
                zw3 q3 = q(S, hashSet);
                if (q3 != null) {
                    if (!rc9.k0(hz2.i0(S)) && (!(S instanceof hu6) || !rc9.q0((hu6) S))) {
                        z = false;
                    }
                    if ((q3 instanceof hu6) && rc9.q0((hu6) q3) && rc9.p0(zw3) && z) {
                        return hz2.K0(S);
                    }
                    if (rc9.p0(q3) || !rc9.n0(zw3)) {
                        return q3;
                    }
                    return hz2.K0(q3);
                }
            } else if (!rc9.k0(i0)) {
                return zw3;
            } else {
                List<sp7> R = rc9.R(hz2.i0(zw3));
                List L = rc9.L(zw3);
                ArrayList arrayList = new ArrayList(et0.e0(L, 10));
                for (Object next : L) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Object T = rc9.T(hz2, (qo7) next);
                        if (T == null) {
                            T = rc9.S((sp7) R.get(i2));
                        }
                        arrayList.add(T);
                        i2 = i3;
                    } else {
                        sg3.Z();
                        throw null;
                    }
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(R, 10));
                for (sp7 sp7 : R) {
                    sp7.getClass();
                    if (sp7 instanceof qp7) {
                        wo7 = ((qp7) sp7).n();
                        wo7.getClass();
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(sp7);
                        sb.append(", ");
                        h.j(hl6.m(b26.a, sp7.getClass(), sb));
                        wo7 = null;
                    }
                    arrayList2.add(wo7);
                }
                Map a0 = sf4.a0(dt0.i1(arrayList2, arrayList));
                ArrayList arrayList3 = new ArrayList(a0.size());
                for (Map.Entry entry : a0.entrySet()) {
                    xo7 xo7 = (xo7) entry.getKey();
                    zw3 zw33 = (zw3) entry.getValue();
                    xo7.getClass();
                    zw33.getClass();
                    arrayList3.add(new yb5((wo7) xo7, new p27((vw3) zw33)));
                }
                dq7 dq7 = new dq7(new q27(1, sf4.a0(arrayList3)));
                zw3.getClass();
                if (zw3 instanceof vw3) {
                    int i4 = dc3.a;
                    vq0 u = ((vw3) zw3).L().u();
                    if (u instanceof ql4) {
                        ql4 = (ql4) u;
                    } else {
                        ql4 = null;
                    }
                    if (ql4 != null) {
                        int i5 = ts1.a;
                        y18 v0 = ql4.v0();
                        if (v0 instanceof cc3) {
                            cc3 = (cc3) v0;
                        } else {
                            cc3 = null;
                        }
                        if (cc3 != null) {
                            fu6 = (fu6) cc3.b;
                            if (fu6 != null) {
                                zw32 = null;
                            } else {
                                sp7 j2 = j(fu6);
                                if (j2 == null) {
                                    zw32 = rc9.Q0(dq7, fu6);
                                } else {
                                    zw32 = R(fu6, rc9.Q0(dq7, rc9.S(j2)));
                                }
                            }
                            if (!(zw32 == null || (q2 = q(zw32, hashSet)) == null)) {
                                if (rc9.p0(zw3)) {
                                    return q2;
                                }
                                if (rc9.p0(q2)) {
                                    return zw3;
                                }
                                if (!(q2 instanceof hu6) || !rc9.q0((hu6) q2)) {
                                    return hz2.K0(q2);
                                }
                                return zw3;
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(zw3);
                    sb2.append(", ");
                    h.j(hl6.m(b26.a, zw3.getClass(), sb2));
                }
                fu6 = null;
                if (fu6 != null) {
                }
                if (rc9.p0(zw3)) {
                }
            }
        }
        return null;
    }

    public static final ml4 r(aa8 aa8) {
        return new ts7(aa8);
    }

    public static final double s(double d2, y02 y02, y02 y022) {
        TimeUnit timeUnit = y022.w;
        TimeUnit timeUnit2 = y02.w;
        long convert = timeUnit.convert(1, timeUnit2);
        if (convert > 0) {
            return d2 * ((double) convert);
        }
        return d2 / ((double) timeUnit2.convert(1, timeUnit));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064 A[RETURN] */
    public static final long t(long j2, y02 y02) {
        long j3;
        int ordinal = y02.ordinal();
        if (ordinal == 2) {
            j3 = 1;
        } else if (ordinal == 3) {
            j3 = 1000;
        } else if (ordinal == 4) {
            j3 = 60000;
        } else if (ordinal == 5) {
            j3 = 3600000;
        } else if (ordinal == 6) {
            j3 = 86400000;
        } else {
            ta1.l("Wrong unit for millisMultiplier: ", y02);
            return 0;
        }
        if (j2 == 0) {
            return 0;
        }
        if (j2 == 1) {
            if (j3 > 4611686018427387903L) {
                return 4611686018427387903L;
            }
            return j3;
        } else if (j3 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j2)) - Long.numberOfLeadingZeros(j3);
            if (numberOfLeadingZeros < 63) {
                return j2 * j3;
            }
            if (numberOfLeadingZeros <= 63) {
                long j4 = j2 * j3;
                if (j4 <= 4611686018427387903L) {
                    return j4;
                }
            }
        } else if (j2 <= 4611686018427387903L) {
            return j2;
        }
        return 4611686018427387903L;
    }

    public static Handler u(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return bn.b(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e2) {
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e2);
            return new Handler(looper);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (!(cause instanceof Error)) {
                rf2.o(cause);
                return null;
            } else {
                throw ((Error) cause);
            }
        }
    }

    public static final el2 v(Context context) {
        int i2;
        xb4 xb4 = new xb4(19);
        context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = bm2.a.a(context);
        } else {
            i2 = 0;
        }
        return new el2(xb4, new dg(i2));
    }

    public static long w(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = 262142;
        int min = Math.min(i4, 262142);
        int i9 = Integer.MAX_VALUE;
        if (i5 == Integer.MAX_VALUE) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = Math.min(i5, 262142);
        }
        if (i6 == Integer.MAX_VALUE) {
            i7 = min;
        } else {
            i7 = i6;
        }
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i8 = 65534;
            } else if (i7 < 65535) {
                i8 = 32766;
            } else if (i7 < 262143) {
                i8 = 8190;
            } else {
                m31.l(i7);
                ta1.e();
                return 0;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            i9 = Math.min(i8, i3);
        }
        return m31.a(Math.min(i8, i2), i9, min, i6);
    }

    public static long x(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = 262142;
        int min = Math.min(i2, 262142);
        int i9 = Integer.MAX_VALUE;
        if (i3 == Integer.MAX_VALUE) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = Math.min(i3, 262142);
        }
        if (i6 == Integer.MAX_VALUE) {
            i7 = min;
        } else {
            i7 = i6;
        }
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i8 = 65534;
            } else if (i7 < 65535) {
                i8 = 32766;
            } else if (i7 < 262143) {
                i8 = 8190;
            } else {
                m31.l(i7);
                ta1.e();
                return 0;
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            i9 = Math.min(i8, i5);
        }
        return m31.a(min, i6, Math.min(i8, i4), i9);
    }

    public abstract void P(w1 w1Var, w1 w1Var2);

    public abstract void Q(w1 w1Var, Thread thread);

    public abstract boolean m(x1 x1Var, l1 l1Var, l1 l1Var2);

    public abstract boolean n(x1 x1Var, Object obj, Object obj2);

    public abstract boolean o(x1 x1Var, w1 w1Var, w1 w1Var2);

    public abstract List p(String str, List list);

    public abstract l1 y(x1 x1Var);

    public abstract w1 z(x1 x1Var);

    public void H(b90 b90) {
    }
}
