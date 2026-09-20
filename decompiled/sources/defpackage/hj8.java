package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: hj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hj8 implements l42 {
    public static final d48 a = d48.x;
    public static final fw0 b = new fw0(-1565195537, new ww0(8), false);
    public static final fw0 c = new fw0(-618157651, new ww0(9), false);
    public static final fw0 d = new fw0(1013255688, new uw0(28), false);
    public static final fw0 e = new fw0(988455127, new uw0(29), false);
    public static final fw0 f = new fw0(1915209880, new xw0(0), false);
    public static final float g = 360.0f;
    public static final float h = 220.0f;
    public static final rt0 i = rt0.N;
    public static final xl3 j = new xl3(2);
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static final xd9 p = new xd9(1);
    public static final yd9 q = new yd9(1);
    public static x83 r;
    public static final /* synthetic */ int s = 0;
    public static x83 t;

    public static final boolean B(long j2) {
        if ((j2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean C(long j2) {
        if ((j2 & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final Object E(Object obj) {
        if (obj instanceof av0) {
            return o85.b(((av0) obj).a);
        }
        return obj;
    }

    public static final String F(Object obj) {
        String str;
        if (obj.getClass().isAnonymousClass()) {
            str = obj.getClass().getName();
        } else {
            str = obj.getClass().getSimpleName();
        }
        return pb4.l(str, "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static kg5 G(ay4 ay4) {
        cm1 cm1 = n61.a;
        cm1.getClass();
        return new kg5(21, ay4, cm1);
    }

    public static final je2 H(vm4 vm4, yt2 yt2) {
        um4 um4 = ((zg4) yt2.k(ch4.b)).d;
        int ordinal = vm4.ordinal();
        if (ordinal == 0) {
            return um4.f();
        }
        if (ordinal == 1) {
            return um4.c();
        }
        if (ordinal == 2) {
            return um4.e();
        }
        if (ordinal == 3) {
            return um4.d();
        }
        if (ordinal == 4) {
            return um4.b();
        }
        if (ordinal == 5) {
            return um4.a();
        }
        h.c();
        return null;
    }

    public static zd9 I(Set set) {
        zd9 zd9 = new zd9();
        zd9.d = q;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            id9 id9 = (id9) it.next();
            jb5.K("key", id9);
            boolean z = id9.c;
            HashMap hashMap = zd9.b;
            HashMap hashMap2 = zd9.a;
            if (!z) {
                hashMap.remove(id9);
                hashMap2.put(id9, zd9.e);
            } else if (z) {
                hashMap2.remove(id9);
                hashMap.put(id9, zd9.f);
            } else {
                h.q("key must be repeating");
                return null;
            }
        }
        return zd9;
    }

    public static final void b(boolean z, f5 f5Var, fw0 fw0, pq6 pq6, tg7 tg7, tg7 tg72, la5 la5, float f2, float f3, fw4 fw4, ml4 ml4, gs2 gs2, int i2, ap4 ap4, yt2 yt2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        ap4 ap42;
        yt2 yt22;
        fw4 fw42;
        long j2;
        a37 a37;
        yt2 yt23;
        boolean z2;
        fw0 fw02;
        boolean z3 = z;
        fw0 fw03 = fw0;
        tg7 tg73 = tg7;
        tg7 tg74 = tg72;
        fw4 fw43 = fw4;
        gs2 gs22 = gs2;
        int i9 = i2;
        ap4 ap43 = ap4;
        yt2 yt24 = yt2;
        int i10 = i3;
        int i11 = i4;
        yt24.g0(-1169830672);
        if ((i10 & 6) == 0) {
            i5 = (yt24.h(z3) ? 4 : 2) | i10;
        } else {
            i5 = i10;
        }
        int i12 = 32;
        if ((i10 & 48) == 0) {
            i5 |= yt24.i(f5Var) ? 32 : 16;
        } else {
            f5 f5Var2 = f5Var;
        }
        int i13 = 128;
        if ((i10 & 384) == 0) {
            i5 |= yt24.i(fw03) ? 256 : 128;
        }
        int i14 = 1024;
        if ((i10 & 3072) == 0) {
            i5 |= yt24.g(pq6) ? 2048 : 1024;
        } else {
            pq6 pq62 = pq6;
        }
        int i15 = 8192;
        if ((i10 & 24576) == 0) {
            i5 |= yt24.d(56.0f) ? 16384 : 8192;
        }
        int i16 = 65536;
        if ((i10 & 196608) == 0) {
            i5 |= yt24.g(tg73) ? 131072 : 65536;
        }
        int i17 = 524288;
        if ((i10 & 1572864) == 0) {
            i5 |= yt24.g(tg74) ? 1048576 : 524288;
        }
        int i18 = 4194304;
        la5 la52 = la5;
        if ((i10 & 12582912) == 0) {
            i5 |= yt24.g(la52) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i6 = 196608;
            i5 |= yt24.d(4.0f) ? 67108864 : 33554432;
        } else {
            i6 = 196608;
        }
        if ((805306368 & i10) == 0) {
            i5 |= yt24.d(f2) ? 536870912 : 268435456;
        } else {
            float f4 = f2;
        }
        int i19 = i5;
        if ((i11 & 6) == 0) {
            i7 = (yt24.d(8.0f) ? 4 : 2) | i11;
        } else {
            i7 = i11;
        }
        float f5 = f3;
        if ((i11 & 48) == 0) {
            if (!yt24.d(f5)) {
                i12 = 16;
            }
            i7 |= i12;
        }
        if ((i11 & 384) == 0) {
            if (yt24.g(fw43)) {
                i13 = 256;
            }
            i7 |= i13;
        }
        if ((i11 & 3072) == 0) {
            if (yt24.g(ml4)) {
                i14 = 2048;
            }
            i7 |= i14;
        } else {
            ml4 ml42 = ml4;
        }
        int i20 = i7;
        if ((i11 & 24576) == 0) {
            if (yt24.h(true)) {
                i15 = 16384;
            }
            i8 = i20 | i15;
        } else {
            i8 = i20;
        }
        if ((i11 & i6) == 0) {
            if (yt24.i(gs22)) {
                i16 = 131072;
            }
            i8 |= i16;
        }
        if ((i11 & 1572864) == 0) {
            if (yt24.e(i9)) {
                i17 = 1048576;
            }
            i8 |= i17;
        }
        if ((i11 & 12582912) == 0) {
            if (yt24.g(ap43)) {
                i18 = 8388608;
            }
            i8 |= i18;
        }
        int i21 = i8;
        if (yt24.V(i19 & 1, ((i19 & 306783379) == 306783378 && (i21 & 4793491) == 4793490) ? false : true)) {
            if (z3) {
                j2 = fw43.a;
            } else {
                j2 = fw43.d;
            }
            fw0 J = su0.J(1907207050, new gw4(j2, fw03, 1), yt24);
            Object Q = yt24.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = new bd5(0);
                yt24.o0(Q);
            }
            bd5 bd5 = (bd5) Q;
            Object obj2 = obj;
            ml4 L = su0.L(ml4, z, ap43, (oa3) null, true, new s86(4), f5Var);
            ap42 = ap43;
            t37 t37 = hf3.c;
            ml4 a2 = yu6.a(L, ((lx1) yt24.k(t37)).w, ((lx1) yt24.k(t37)).w);
            Object Q2 = yt24.Q();
            if (Q2 == obj2) {
                Q2 = new fv4(bd5, 2);
                yt24.o0(Q2);
            }
            ml4 W = t49.W(a2, (vr2) Q2);
            lh4 d2 = mb0.d(xb4.C, true);
            int hashCode = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            ml4 E = gw8.E(yt24, W);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(tx0.f, yt24, d2);
            g75.Q(tx0.e, yt24, m2);
            g75.Q(tx0.g, yt24, Integer.valueOf(hashCode));
            g75.O(yt24, tx0.h);
            g75.Q(tx0.d, yt24, E);
            boolean z4 = i9 == 0;
            float f6 = 0.0f;
            float f7 = z ? 1.0f : 0.0f;
            vm4 vm4 = vm4.w;
            je2 H = H(vm4, yt24);
            yt2 yt25 = yt24;
            boolean z5 = z4;
            yt2 yt26 = yt25;
            vm4 vm42 = vm4;
            a37 b2 = vj.b(f7, H, (String) null, yt26, 0, 28);
            if (!z5) {
                f6 = 1.0f;
            }
            je2 H2 = H(vm42, yt26);
            a37 a372 = b2;
            a37 b3 = vj.b(f6, H2, (String) null, yt26, 0, 28);
            yt2 yt27 = yt26;
            Object Q3 = yt27.Q();
            if (Q3 == obj2) {
                Q3 = u55.i(new pw4(z5, tg73, tg74, b3));
                yt27.o0(Q3);
            }
            a37 a373 = (a37) Q3;
            ef3 ef3 = null;
            if (gs2 != null) {
                yt27.e0(-1950043088);
                yt23 = yt27;
                a37 = b3;
                fw42 = fw4;
                fw02 = su0.J(144656166, new ai0(z, (Object) fw42, (Object) gs2, (Object) a373, 8), yt23);
                z2 = false;
                yt23.r(false);
            } else {
                fw42 = fw4;
                a37 = b3;
                yt23 = yt27;
                z2 = false;
                yt23.e0(-1949720812);
                yt23.r(false);
                fw02 = null;
            }
            if (z5) {
                yt23.e0(-1949560201);
                tp1 tp1 = (tp1) yt23.k(xy0.h);
                boolean g2 = yt23.g(tp1) | ((i19 & 57344) == 16384 ? true : z2);
                Object Q4 = yt23.Q();
                if (g2 || Q4 == obj2) {
                    Q4 = new gv4(tp1, bd5, 1);
                    yt23.o0(Q4);
                }
                sr2 sr2 = (sr2) Q4;
                boolean g3 = yt23.g(sr2) | ((i21 & 29360128) == 8388608 ? true : z2);
                Object Q5 = yt23.Q();
                if (g3 || Q5 == obj2) {
                    Q5 = new rf4(sr2, ap42);
                    yt23.o0(Q5);
                }
                yt23.r(z2);
                ef3 = (rf4) Q5;
            } else {
                yt23.e0(-1948790440);
                yt23.r(z2);
            }
            if (ef3 == null) {
                ef3 = ap42;
            }
            long j3 = fw42.c;
            boolean g4 = yt23.g(a372);
            Object Q6 = yt23.Q();
            if (g4 || Q6 == obj2) {
                Q6 = new mu4(3, a372);
                yt23.o0(Q6);
            }
            sr2 sr22 = (sr2) Q6;
            boolean g5 = yt23.g(a37);
            Object Q7 = yt23.Q();
            if (g5 || Q7 == obj2) {
                Q7 = new mu4(4, a37);
                yt23.o0(Q7);
            }
            int i22 = i19 << 3;
            int i23 = i21 << 3;
            yt2 yt28 = yt23;
            c(ef3, j3, pq6, sr22, J, i9, (sr2) Q7, fw02, la5, f2, f3, yt28, ((i19 >> 3) & 896) | 24576 | ((i21 >> 3) & 458752) | (234881024 & i22) | (i22 & 1879048192), ((i19 >> 27) & 14) | (i23 & 112) | (i23 & 896));
            yt22 = yt28;
            yt22.r(true);
        } else {
            ap42 = ap43;
            fw42 = fw43;
            yt22 = yt24;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new hw4(z, f5Var, fw0, pq6, tg7, tg72, la5, f2, f3, fw42, ml4, gs2, i2, ap42, i3, i4);
        }
    }

    public static final void c(ef3 ef3, long j2, pq6 pq6, sr2 sr2, fw0 fw0, int i2, sr2 sr22, gs2 gs2, la5 la5, float f2, float f3, yt2 yt2, int i3, int i4) {
        int i5;
        sr2 sr23;
        int i6;
        boolean z;
        Object kk7;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ef3 ef32 = ef3;
        pq6 pq62 = pq6;
        fw0 fw02 = fw0;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i20 = i3;
        int i21 = i4;
        yt22.g0(-1964418729);
        if ((i20 & 6) == 0) {
            if (yt22.g(ef32)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i5 = i19 | i20;
        } else {
            i5 = i20;
        }
        long j3 = j2;
        if ((i20 & 48) == 0) {
            if (yt22.f(j3)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i5 |= i18;
        }
        if ((i20 & 384) == 0) {
            if (yt22.g(pq62)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i5 |= i17;
        }
        if ((i20 & 3072) == 0) {
            sr23 = sr2;
            if (yt22.i(sr23)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i5 |= i16;
        } else {
            sr23 = sr2;
        }
        if ((i20 & 24576) == 0) {
            if (yt22.i(fw02)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i5 |= i15;
        }
        if ((196608 & i20) == 0) {
            if (yt22.e(i2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        } else {
            int i22 = i2;
        }
        sr2 sr24 = sr22;
        if ((i20 & 1572864) == 0) {
            if (yt22.i(sr24)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((i20 & 12582912) == 0) {
            if (yt22.i(gs22)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        la5 la52 = la5;
        if ((i20 & 100663296) == 0) {
            if (yt22.g(la52)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        if ((i20 & 805306368) == 0) {
            if (yt22.d(4.0f)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i5 |= i10;
        }
        int i23 = i5;
        if ((i21 & 6) == 0) {
            if (yt22.d(f2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i21 | i9;
        } else {
            float f4 = f2;
            i6 = i21;
        }
        if ((i21 & 48) == 0) {
            if (yt22.d(8.0f)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i21 & 384) == 0) {
            if (yt22.d(f3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        } else {
            float f5 = f3;
        }
        int i24 = i6;
        if ((i23 & 306783379) == 306783378 && (i24 & 147) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i23 & 1, z)) {
            nw0 nw0 = new nw0(4);
            jl4 jl4 = jl4.w;
            ml4 D = we.D(jl4, nw0);
            if (gs22 != null) {
                kk7 = new ok(i2, sr22, sr23, la52, f3);
            } else {
                kk7 = new kk7(false, sr2, f2, f2, 0.0f, 0.0f);
            }
            Object obj = kk7;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, D);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, obj);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = ckVar;
            ck ckVar5 = tx0.d;
            g75.Q(ckVar5, yt22, E);
            int i25 = i23 >> 3;
            h(ef32, pq62, yt22, (i23 & 14) | (i25 & 112));
            ce ceVar2 = ceVar;
            int i26 = i25 & 1022;
            long j4 = j3;
            ce ceVar3 = ceVar2;
            ck ckVar6 = ckVar2;
            jl4 jl42 = jl4;
            g(j4, pq62, sr2, yt22, i26);
            ml4 w0 = rc9.w0(jl42, "icon");
            i80 i80 = xb4.y;
            lh4 d2 = mb0.d(i80, false);
            ck ckVar7 = ckVar4;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E2 = gw8.E(yt22, w0);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar7, yt22, d2);
            g75.Q(ckVar6, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar3);
            g75.Q(ckVar5, yt22, E2);
            f21.r((i23 >> 12) & 14, fw02, yt22, true);
            if (gs2 != null) {
                yt22.e0(1071084366);
                ml4 w02 = rc9.w0(jl42, "label");
                lh4 d3 = mb0.d(i80, false);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m4 = yt22.m();
                ml4 E3 = gw8.E(yt22, w02);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar7, yt22, d3);
                g75.Q(ckVar6, yt22, m4);
                f21.s(hashCode3, yt22, ckVar3, yt22, ceVar3);
                g75.Q(ckVar5, yt22, E3);
                gs22 = gs2;
                z2 = true;
                pb4.q((i23 >> 21) & 14, gs22, yt22, true, false);
            } else {
                gs22 = gs2;
                z2 = true;
                yt22.e0(1071165090);
                yt22.r(false);
            }
            yt22.r(z2);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new iw4(ef3, j2, pq6, sr2, fw0, i2, sr22, gs22, la5, f2, f3, i3, i4);
        }
    }

    public static final void d(ml4 ml4, yt2 yt2, int i2) {
        int i3;
        boolean z;
        float f2;
        float f3;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        yt22.g0(-1521774612);
        if (yt22.e(R.string.or)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            ml4 d2 = ml42.d(yu6.a);
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, d2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            kl8.c(yu6.d(new lz3(f2, true), 1.0f), 0.0f, 0, yt22, 0, 6);
            yf7.b(l55.u(R.string.or, yt22), x91.M(jl4.w, 16.0f, 0.0f, 2), 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(ch4.b)).b.l, yt2, 48, 0, 131068);
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            yt22 = yt2;
            kl8.c(yu6.d(new lz3(f3, true), 1.0f), 0.0f, 0, yt22, 0, 6);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new yg(i2, 10, ml4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void e(sr2 sr2, ml4 ml4, boolean z, a83 a83, pq6 pq6, gs2 gs2, yt2 yt2, int i2, int i3) {
        int i4;
        ml4 ml42;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        pq6 pq62;
        a83 a832;
        boolean z4;
        ml4 ml43;
        yx5 v;
        pq6 pq63;
        boolean z5;
        int i7;
        ml4 ml44;
        ml4 ml45;
        long j2;
        float f2;
        boolean z6;
        int i8;
        long j3;
        int i9;
        int i10;
        int i11;
        int i12;
        yt2 yt22 = yt2;
        int i13 = i2;
        yt22.g0(1413012038);
        sr2 sr22 = sr2;
        if ((i13 & 6) == 0) {
            if (yt22.i(sr22)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i12 | i13;
        } else {
            i4 = i13;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i13 & 48) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i4 |= i11;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i13 & 384) == 0) {
                z2 = z;
                if (yt22.h(z2)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i4 |= i10;
                if ((i13 & 3072) == 0) {
                    i4 |= 1024;
                }
                i6 = i4 | 24576;
                if ((196608 & i13) == 0) {
                    i6 = 90112 | i4;
                }
                if ((1572864 & i13) == 0) {
                    if (yt22.i(gs2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i6 |= i9;
                } else {
                    gs2 gs22 = gs2;
                }
                boolean z7 = true;
                if ((599187 & i6) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(i6 & 1, z3)) {
                    yt22.a0();
                    if ((i13 & 1) == 0 || yt22.C()) {
                        if (i14 != 0) {
                            ml45 = jl4.w;
                        } else {
                            ml45 = ml42;
                        }
                        if (i5 == 0) {
                            z7 = z2;
                        }
                        long j4 = ((jt0) yt22.k(j41.a)).a;
                        qt0 qt0 = ((zg4) yt22.k(ch4.b)).a;
                        a83 a833 = qt0.e0;
                        if (a833 == null) {
                            long j5 = jt0.f;
                            long b2 = jt0.b(0.38f, j4);
                            long j6 = j4;
                            f2 = 0.38f;
                            a833 = new a83(j5, j6, j5, b2);
                            j2 = j6;
                            qt0.e0 = a833;
                        } else {
                            long j7 = j4;
                            f2 = 0.38f;
                            j2 = j7;
                        }
                        long j8 = a833.b;
                        if (jt0.c(j8, j2)) {
                            i8 = -465921;
                            z6 = z7;
                        } else {
                            long b3 = jt0.b(f2, j2);
                            i8 = -465921;
                            z6 = z7;
                            long j9 = a833.a;
                            long j10 = a833.c;
                            if (j2 != 16) {
                                j3 = j2;
                            } else {
                                j3 = j8;
                            }
                            if (b3 == 16) {
                                b3 = a833.d;
                            }
                            a833 = new a83(j9, j3, j10, b3);
                        }
                        i7 = i6 & i8;
                        pq63 = hr6.a(x91.k, yt22);
                        ml44 = ml45;
                        a832 = a833;
                        z5 = z6;
                    } else {
                        yt22.Y();
                        a832 = a83;
                        i7 = i6 & -465921;
                        ml44 = ml42;
                        z5 = z2;
                        pq63 = pq6;
                    }
                    yt22.s();
                    int i15 = i7 << 3;
                    f(ml44, sr2, z5, pq63, a832, gs2, yt22, ((i7 >> 3) & 14) | (i15 & 112) | (i7 & 896) | (i15 & 458752) | (i7 & 3670016));
                    pq62 = pq63;
                    z4 = z5;
                    ml43 = ml44;
                } else {
                    yt2.Y();
                    a832 = a83;
                    ml43 = ml42;
                    z4 = z2;
                    pq62 = pq6;
                }
                v = yt2.v();
                if (v != null) {
                    v.d = new b83(sr2, ml43, z4, a832, pq62, gs2, i13, i3);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i13 & 3072) == 0) {
            }
            i6 = i4 | 24576;
            if ((196608 & i13) == 0) {
            }
            if ((1572864 & i13) == 0) {
            }
            boolean z72 = true;
            if ((599187 & i6) != 599186) {
            }
            if (yt22.V(i6 & 1, z3)) {
            }
            v = yt2.v();
            if (v != null) {
            }
        }
        ml42 = ml4;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i13 & 3072) == 0) {
        }
        i6 = i4 | 24576;
        if ((196608 & i13) == 0) {
        }
        if ((1572864 & i13) == 0) {
        }
        boolean z722 = true;
        if ((599187 & i6) != 599186) {
        }
        if (yt22.V(i6 & 1, z3)) {
        }
        v = yt2.v();
        if (v != null) {
        }
    }

    public static final void f(ml4 ml4, sr2 sr2, boolean z, pq6 pq6, a83 a83, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        long j2;
        long j3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ml4 ml42 = ml4;
        boolean z3 = z;
        pq6 pq62 = pq6;
        a83 a832 = a83;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i11 = i2;
        yt22.g0(-1134296466);
        if ((i11 & 6) == 0) {
            if (yt22.g(ml42)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i11;
        } else {
            i3 = i11;
        }
        sr2 sr22 = sr2;
        if ((i11 & 48) == 0) {
            if (yt22.i(sr22)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i11 & 384) == 0) {
            if (yt22.h(z3)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i11 & 3072) == 0) {
            if (yt22.g(pq62)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i11 & 24576) == 0) {
            if (yt22.g(a832)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i11) == 0) {
            if (yt22.g((Object) null)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i11) == 0) {
            if (yt22.i(gs22)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        int i12 = i3;
        if ((599187 & i12) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i12 & 1, z2)) {
            yt22.e0(976976045);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = b81.e(yt22);
            }
            ap4 ap4 = (ap4) Q;
            yt22.r(false);
            h23 h23 = hf3.a;
            ml4 d2 = ml42.d(al4.w);
            float f2 = x91.l;
            long c2 = pv8.c(x91.m + f2 + f2, 40.0f);
            sd2 sd2 = yu6.a;
            ml4 f3 = we.f(yu6.m(d2, px1.b(c2), px1.a(c2)), pq62);
            if (z3) {
                j2 = a832.a;
            } else {
                j2 = a832.c;
            }
            boolean z4 = z3;
            ml4 k2 = tf4.k(h49.t(b96.h(f3, j2, pq62), ap4, d86.a(false, 0.0f, 0, pq62, 247), z4, new s86(0), sr22, 8));
            lh4 d3 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, k2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d3);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            if (z) {
                j3 = a832.b;
            } else {
                j3 = a832.d;
            }
            t49.c(b81.g(j3, j41.a), gs22, yt22, ((i12 >> 15) & 112) | 8);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new e70(ml42, sr2, z, pq6, a83, gs22, i11);
        }
    }

    public static final void g(long j2, pq6 pq6, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        yt2.g0(-273382589);
        if ((i2 & 6) == 0) {
            if (yt2.f(j2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.g(pq6)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (yt2.i(sr2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z2 = true;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            ml4 w0 = rc9.w0(jl4.w, "indicator");
            if ((i3 & 896) != 256) {
                z2 = false;
            }
            Object Q = yt2.Q();
            if (z2 || Q == ay0.a) {
                Q = new sn(2, sr2);
                yt2.o0(Q);
            }
            mb0.a(b96.h(mp7.X(w0, (vr2) Q), j2, pq6), yt2, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new jg1(j2, pq6, sr2, i2);
        }
    }

    public static final void h(ef3 ef3, pq6 pq6, yt2 yt2, int i2) {
        int i3;
        boolean z;
        pq6 pq62;
        int i4;
        int i5;
        yt2.g0(-629069867);
        if ((i2 & 6) == 0) {
            if (yt2.g(ef3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.g(pq6)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            pq62 = pq6;
            mb0.a(la3.a(we.f(rc9.w0(jl4.w, "indicatorRipple"), pq6), ef3, d86.a(false, 0.0f, 0, pq62, 247)), yt2, 0);
        } else {
            pq62 = pq6;
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) ef3, (Object) pq62, i2, 11);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: int} */
    /* JADX WARNING: type inference failed for: r6v24, types: [r04, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    public static final void i(ml4 ml4, s34 s34, la5 la5, boolean z, eh2 eh2, boolean z2, xf xfVar, ib ibVar, vr vrVar, h80 h80, tr trVar, vr2 vr2, yt2 yt2, int i2, int i3, int i4) {
        int i5;
        ib ibVar2;
        int i6;
        vr vrVar2;
        int i7;
        tr trVar2;
        h80 h802;
        s34 s342;
        yx5 v;
        h80 h803;
        ib ibVar3;
        tr trVar3;
        vr vrVar3;
        int i8;
        int i9;
        Object Q;
        Object obj;
        ur3 ur3;
        Object Q2;
        Object Q3;
        boolean e2;
        Object Q4;
        Object obj2;
        ur3 ur32;
        vr vrVar4;
        int i10;
        ml4 ml42;
        ml4 ml43 = ml4;
        s34 s343 = s34;
        la5 la52 = la5;
        boolean z3 = z;
        boolean z4 = z2;
        yt2 yt22 = yt2;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        yt22.g0(924924659);
        if ((i11 & 6) == 0) {
            i5 = (yt22.g(ml43) ? 4 : 2) | i11;
        } else {
            i5 = i11;
        }
        if ((i11 & 48) == 0) {
            i5 |= yt22.g(s343) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i5 |= yt22.g(la52) ? 256 : 128;
        }
        int i14 = 1024;
        if ((i11 & 3072) == 0) {
            i5 |= yt22.h(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i5 |= yt22.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i5 |= yt22.g(eh2) ? 131072 : 65536;
        } else {
            eh2 eh22 = eh2;
        }
        if ((i11 & 1572864) == 0) {
            i5 |= yt22.h(z4) ? 1048576 : 524288;
        }
        xf xfVar2 = xfVar;
        if ((i11 & 12582912) == 0) {
            i5 |= yt22.g(xfVar2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i5 |= 33554432;
        }
        int i15 = i13 & 512;
        if (i15 != 0) {
            i5 |= 805306368;
            ibVar2 = ibVar;
        } else {
            ibVar2 = ibVar;
            if ((i11 & 805306368) == 0) {
                i5 |= yt22.g(ibVar2) ? 536870912 : 268435456;
            }
        }
        int i16 = i13 & 1024;
        if (i16 != 0) {
            i6 = i12 | 6;
            vrVar2 = vrVar;
        } else {
            vrVar2 = vrVar;
            if ((i12 & 6) == 0) {
                i6 = i12 | (yt22.g(vrVar2) ? 4 : 2);
            } else {
                i6 = i12;
            }
        }
        int i17 = i5;
        int i18 = i13 & 2048;
        if (i18 != 0) {
            i6 |= 48;
            i7 = i18;
        } else if ((i12 & 48) == 0) {
            i7 = i18;
            i6 |= yt22.g(h80) ? 32 : 16;
        } else {
            i7 = i18;
            h80 h804 = h80;
        }
        int i19 = i6;
        int i20 = i15;
        int i21 = i13 & 4096;
        if (i21 != 0) {
            i19 |= 384;
        } else if ((i12 & 384) == 0) {
            i19 |= yt22.g(trVar) ? 256 : 128;
            if ((i12 & 3072) != 0) {
                if (yt22.i(vr2)) {
                    i14 = 2048;
                }
                i19 |= i14;
            } else {
                vr2 vr22 = vr2;
            }
            if (!yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i19 & 1171) == 1170)) {
                yt22.a0();
                z53 z53 = null;
                if ((i11 & 1) == 0 || yt22.C()) {
                    i9 = i17 & -234881025;
                    if (i20 != 0) {
                        ibVar2 = null;
                    }
                    if (i16 != 0) {
                        vrVar2 = null;
                    }
                    h80 h805 = i7 != 0 ? null : h80;
                    if (i21 != 0) {
                        h803 = h805;
                        i8 = i19;
                        vrVar3 = vrVar2;
                        ibVar3 = ibVar2;
                        trVar3 = null;
                        yt22.s();
                        int i22 = i9 >> 3;
                        int i23 = i22 & 14;
                        int i24 = ((i8 >> 6) & 112) | i23;
                        int i25 = i9;
                        aq4 v2 = u55.v(vr2, yt2);
                        int i26 = i8;
                        int i27 = i23;
                        boolean z5 = (((i24 & 14) ^ 6) > 4 && yt22.g(s343)) || (i24 & 6) == 4;
                        Q = yt22.Q();
                        obj = ay0.a;
                        if (z5 || Q == obj) {
                            ? obj3 = new Object();
                            obj3.a = new bd5(Integer.MAX_VALUE);
                            obj3.b = new bd5(Integer.MAX_VALUE);
                            pe2 pe2 = pe2.L;
                            Q = new xz3(0, 2, a37.class, u55.j(new g20(u55.j(new vo2(v2, 18), pe2), s343, obj3, 12), pe2), "value", "getValue()Ljava/lang/Object;");
                            yt22.o0(Q);
                        }
                        ur3 ur33 = (ur3) Q;
                        int i28 = i25 >> 9;
                        int i29 = i27 | (i28 & 112);
                        ur3 = ur33;
                        boolean z6 = ((((i29 & 112) ^ 48) > 32 && yt22.h(z3)) || (i29 & 48) == 32) | ((((i29 & 14) ^ 6) > 4 && yt22.g(s343)) || (i29 & 6) == 4);
                        Q2 = yt22.Q();
                        if (z6 || Q2 == obj) {
                            Q2 = new z24(s343, z3);
                            yt22.o0(Q2);
                        }
                        x24 x24 = (x24) Q2;
                        Q3 = yt22.Q();
                        if (Q3 == obj) {
                            Q3 = t49.D(yt22);
                            yt22.o0(Q3);
                        }
                        o81 o81 = (o81) Q3;
                        bx2 bx2 = (bx2) yt22.k(xy0.g);
                        if (!((Boolean) yt22.k(xy0.y)).booleanValue()) {
                            z53 = z37.a;
                        }
                        z53 z532 = z53;
                        int i30 = i26 << 18;
                        int i31 = (i25 & 65520) | (i28 & 3670016) | (i30 & 29360128) | (i30 & 234881024) | ((i26 << 27) & 1879048192);
                        o81 o812 = o81;
                        e2 = ((((i31 & 112) ^ 48) > 32 && yt22.g(s343)) || (i31 & 48) == 32) | ((((i31 & 896) ^ 384) > 256 && yt22.g(la52)) || (i31 & 384) == 256) | ((((i31 & 7168) ^ 3072) > 2048 && yt22.h(false)) || (i31 & 3072) == 2048) | ((((57344 & i31) ^ 24576) > 16384 && yt22.h(z3)) || (i31 & 24576) == 16384) | yt22.e(0) | ((((i31 & 3670016) ^ 1572864) > 1048576 && yt22.g(ibVar3)) || (i31 & 1572864) == 1048576) | ((((i31 & 29360128) ^ 12582912) > 8388608 && yt22.g(h803)) || (i31 & 12582912) == 8388608) | ((((i31 & 234881024) ^ 100663296) > 67108864 && yt22.g(trVar3)) || (i31 & 100663296) == 67108864) | ((((i31 & 1879048192) ^ 805306368) > 536870912 && yt22.g(vrVar3)) || (i31 & 805306368) == 536870912) | yt22.g(bx2) | yt22.g(z532);
                        Q4 = yt22.Q();
                        if (!e2 || Q4 == obj) {
                            ur3 ur34 = ur3;
                            obj2 = obj;
                            i10 = 4;
                            Object l34 = new l34(s343, z3, la52, ur34, vrVar3, trVar3, o812, bx2, z532, ibVar3, h803);
                            ur32 = ur34;
                            vrVar4 = vrVar3;
                            trVar2 = trVar3;
                            yt22.o0(l34);
                            Q4 = l34;
                        } else {
                            vrVar4 = vrVar3;
                            trVar2 = trVar3;
                            obj2 = obj;
                            i10 = 4;
                            ur32 = ur3;
                        }
                        i24 i242 = (i24) Q4;
                        z75 z75 = !z ? z75.w : z75.x;
                        if (!z2) {
                            yt22.e0(-2077147368);
                            boolean e3 = yt22.e(0) | ((((i22 & 14) ^ 6) > i10 && yt22.g(s343)) || (i22 & 6) == i10);
                            Object Q5 = yt22.Q();
                            if (e3 || Q5 == obj2) {
                                Q5 = new e34(s343);
                                yt22.o0(Q5);
                            }
                            ml42 = bb0.t0((e34) Q5, s343.p, z75);
                            yt22.r(false);
                        } else {
                            yt22.e0(-2076718545);
                            yt22.r(false);
                            ml42 = jl4.w;
                        }
                        boolean z7 = z2;
                        s342 = s343;
                        b96.b(ur32, rc9.R0(gl0.Y(ed1.t(ml43.d(s343.m).d(s343.n), ur32, x24, z75, z7).d(ml42), s343.o), s343, z75, xfVar, z7, eh2, s343.g, (ta5) null), s342.q, i242, yt22, 0);
                        vrVar2 = vrVar4;
                        ibVar2 = ibVar3;
                        h802 = h803;
                    } else {
                        trVar3 = trVar;
                        h803 = h805;
                    }
                } else {
                    yt22.Y();
                    i9 = i17 & -234881025;
                    h803 = h80;
                    trVar3 = trVar;
                }
                i8 = i19;
                vrVar3 = vrVar2;
                ibVar3 = ibVar2;
                yt22.s();
                int i222 = i9 >> 3;
                int i232 = i222 & 14;
                int i243 = ((i8 >> 6) & 112) | i232;
                int i252 = i9;
                aq4 v22 = u55.v(vr2, yt2);
                int i262 = i8;
                int i272 = i232;
                if ((((i243 & 14) ^ 6) > 4 || yt22.g(s343)) && (i243 & 6) == 4) {
                }
                Q = yt22.Q();
                obj = ay0.a;
                ? obj32 = new Object();
                obj32.a = new bd5(Integer.MAX_VALUE);
                obj32.b = new bd5(Integer.MAX_VALUE);
                pe2 pe22 = pe2.L;
                Q = new xz3(0, 2, a37.class, u55.j(new g20(u55.j(new vo2(v22, 18), pe22), s343, obj32, 12), pe22), "value", "getValue()Ljava/lang/Object;");
                yt22.o0(Q);
                ur3 ur332 = (ur3) Q;
                int i282 = i252 >> 9;
                int i292 = i272 | (i282 & 112);
                ur3 = ur332;
                boolean z62 = ((((i292 & 112) ^ 48) > 32 && yt22.h(z3)) || (i292 & 48) == 32) | ((((i292 & 14) ^ 6) > 4 && yt22.g(s343)) || (i292 & 6) == 4);
                Q2 = yt22.Q();
                Q2 = new z24(s343, z3);
                yt22.o0(Q2);
                x24 x242 = (x24) Q2;
                Q3 = yt22.Q();
                if (Q3 == obj) {
                }
                o81 o813 = (o81) Q3;
                bx2 bx22 = (bx2) yt22.k(xy0.g);
                if (!((Boolean) yt22.k(xy0.y)).booleanValue()) {
                }
                z53 z5322 = z53;
                int i302 = i262 << 18;
                int i312 = (i252 & 65520) | (i282 & 3670016) | (i302 & 29360128) | (i302 & 234881024) | ((i262 << 27) & 1879048192);
                o81 o8122 = o813;
                e2 = ((((i312 & 112) ^ 48) > 32 && yt22.g(s343)) || (i312 & 48) == 32) | ((((i312 & 896) ^ 384) > 256 && yt22.g(la52)) || (i312 & 384) == 256) | ((((i312 & 7168) ^ 3072) > 2048 && yt22.h(false)) || (i312 & 3072) == 2048) | ((((57344 & i312) ^ 24576) > 16384 && yt22.h(z3)) || (i312 & 24576) == 16384) | yt22.e(0) | ((((i312 & 3670016) ^ 1572864) > 1048576 && yt22.g(ibVar3)) || (i312 & 1572864) == 1048576) | ((((i312 & 29360128) ^ 12582912) > 8388608 && yt22.g(h803)) || (i312 & 12582912) == 8388608) | ((((i312 & 234881024) ^ 100663296) > 67108864 && yt22.g(trVar3)) || (i312 & 100663296) == 67108864) | ((((i312 & 1879048192) ^ 805306368) > 536870912 && yt22.g(vrVar3)) || (i312 & 805306368) == 536870912) | yt22.g(bx22) | yt22.g(z5322);
                Q4 = yt22.Q();
                if (!e2) {
                }
                ur3 ur342 = ur3;
                obj2 = obj;
                i10 = 4;
                Object l342 = new l34(s343, z3, la52, ur342, vrVar3, trVar3, o8122, bx22, z5322, ibVar3, h803);
                ur32 = ur342;
                vrVar4 = vrVar3;
                trVar2 = trVar3;
                yt22.o0(l342);
                Q4 = l342;
                i24 i2422 = (i24) Q4;
                z75 z752 = !z ? z75.w : z75.x;
                if (!z2) {
                }
                boolean z72 = z2;
                s342 = s343;
                b96.b(ur32, rc9.R0(gl0.Y(ed1.t(ml43.d(s343.m).d(s343.n), ur32, x242, z752, z72).d(ml42), s343.o), s343, z752, xfVar, z72, eh2, s343.g, (ta5) null), s342.q, i2422, yt22, 0);
                vrVar2 = vrVar4;
                ibVar2 = ibVar3;
                h802 = h803;
            } else {
                s342 = s343;
                yt2.Y();
                h802 = h80;
                trVar2 = trVar;
            }
            v = yt2.v();
            if (v == null) {
                v.d = new j34(ml43, s342, la5, z, eh2, z2, xfVar, ibVar2, vrVar2, h802, trVar2, vr2, i2, i3, i4);
                return;
            }
            return;
        }
        tr trVar4 = trVar;
        if ((i12 & 3072) != 0) {
        }
        if (!yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i19 & 1171) == 1170)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void j(boolean z, f5 f5Var, fw0 fw0, tg7 tg7, pq6 pq6, float f2, float f3, fw4 fw4, ml4 ml4, gs2 gs2, int i2, ap4 ap4, yt2 yt2, int i3, int i4) {
        int i5;
        int i6;
        float f4;
        int i7;
        int i8;
        ap4 ap42;
        yt2 yt22;
        long j2;
        fw0 fw02;
        boolean z2;
        ef3 ef3;
        boolean z3 = z;
        fw0 fw03 = fw0;
        tg7 tg72 = tg7;
        fw4 fw42 = fw4;
        gs2 gs22 = gs2;
        int i9 = i2;
        ap4 ap43 = ap4;
        yt2 yt23 = yt2;
        int i10 = i3;
        int i11 = i4;
        yt23.g0(2075155418);
        if ((i10 & 6) == 0) {
            i5 = (yt23.h(z3) ? 4 : 2) | i10;
        } else {
            i5 = i10;
        }
        if ((i10 & 48) == 0) {
            i5 |= yt23.i(f5Var) ? 32 : 16;
        } else {
            f5 f5Var2 = f5Var;
        }
        int i12 = 128;
        if ((i10 & 384) == 0) {
            i5 |= yt23.i(fw03) ? 256 : 128;
        }
        int i13 = 1024;
        if ((i10 & 3072) == 0) {
            i5 |= yt23.g(tg72) ? 2048 : 1024;
        }
        int i14 = 8192;
        if ((i10 & 24576) == 0) {
            i5 |= yt23.g(pq6) ? 16384 : 8192;
        } else {
            pq6 pq62 = pq6;
        }
        int i15 = 65536;
        if ((i10 & 196608) == 0) {
            i5 |= yt23.d(56.0f) ? 131072 : 65536;
        }
        int i16 = 524288;
        if ((i10 & 1572864) == 0) {
            i6 = 1572864;
            i5 |= yt23.d(16.0f) ? 1048576 : 524288;
        } else {
            i6 = 1572864;
        }
        if ((12582912 & i10) == 0) {
            i5 |= yt23.d(f2) ? 8388608 : 4194304;
        } else {
            float f5 = f2;
        }
        if ((i10 & 100663296) == 0) {
            i5 |= yt23.d(4.0f) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            f4 = f3;
            i5 |= yt23.d(f4) ? 536870912 : 268435456;
        } else {
            f4 = f3;
        }
        int i17 = i5;
        if ((i11 & 6) == 0) {
            i7 = (yt23.d(6.0f) ? 4 : 2) | i11;
        } else {
            i7 = i11;
        }
        if ((i11 & 48) == 0) {
            i7 |= yt23.g(fw42) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            if (yt23.g(ml4)) {
                i12 = 256;
            }
            i7 |= i12;
        } else {
            ml4 ml42 = ml4;
        }
        int i18 = i7;
        if ((i11 & 3072) == 0) {
            if (yt23.h(true)) {
                i13 = 2048;
            }
            i8 = i18 | i13;
        } else {
            i8 = i18;
        }
        if ((i11 & 24576) == 0) {
            if (yt23.i(gs22)) {
                i14 = 16384;
            }
            i8 |= i14;
        }
        if ((i11 & 196608) == 0) {
            if (yt23.e(i9)) {
                i15 = 131072;
            }
            i8 |= i15;
        }
        if ((i11 & i6) == 0) {
            if (yt23.g(ap43)) {
                i16 = 1048576;
            }
            i8 |= i16;
        }
        int i19 = i8;
        if (yt23.V(i17 & 1, ((i17 & 306783379) == 306783378 && (i19 & 599187) == 599186) ? false : true)) {
            if (z3) {
                j2 = fw42.a;
            } else {
                j2 = fw42.d;
            }
            fw0 J = su0.J(1119868672, new gw4(j2, fw03, 0), yt23);
            if (gs22 == null) {
                yt23.e0(-803323188);
                yt23.r(false);
                fw02 = null;
            } else {
                yt23.e0(-803287569);
                fw0 J2 = su0.J(1062206119, new kw4(z3, tg72, fw42, gs22), yt23);
                yt23.r(false);
                fw02 = J2;
            }
            Object Q = yt23.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new bd5(0);
                yt23.o0(Q);
            }
            ap4 ap44 = ap4;
            bd5 bd5 = (bd5) Q;
            d63 d632 = d63;
            ml4 L = su0.L(ml4, z3, ap44, (oa3) null, true, new s86(4), f5Var);
            ap42 = ap44;
            t37 t37 = hf3.c;
            ml4 a2 = yu6.a(L, ((lx1) yt23.k(t37)).w, ((lx1) yt23.k(t37)).w);
            Object Q2 = yt23.Q();
            if (Q2 == d632) {
                z2 = true;
                Q2 = new fv4(bd5, 1);
                yt23.o0(Q2);
            } else {
                z2 = true;
            }
            ml4 W = t49.W(a2, (vr2) Q2);
            lh4 d2 = mb0.d(xb4.C, z2);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m2 = yt23.m();
            ml4 E = gw8.E(yt23, W);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, d2);
            g75.Q(tx0.e, yt23, m2);
            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E);
            yt22 = yt23;
            a37 b2 = vj.b(z ? 1.0f : 0.0f, H(vm4.w, yt23), (String) null, yt22, 0, 28);
            if (i9 == 0) {
                yt22.e0(484757512);
                tp1 tp1 = (tp1) yt22.k(xy0.h);
                boolean g2 = yt22.g(tp1) | ((i17 & 458752) == 131072);
                Object Q3 = yt22.Q();
                if (g2 || Q3 == d632) {
                    Q3 = new gv4(tp1, bd5, 2);
                    yt22.o0(Q3);
                }
                sr2 sr2 = (sr2) Q3;
                boolean g3 = ((i19 & 3670016) == 1048576) | yt22.g(sr2);
                Object Q4 = yt22.Q();
                if (g3 || Q4 == d632) {
                    Q4 = new rf4(sr2, ap42);
                    yt22.o0(Q4);
                }
                ef3 = (rf4) Q4;
                yt22.r(false);
            } else {
                yt22.e0(485520546);
                yt22.r(false);
                ef3 = null;
            }
            if (ef3 == null) {
                ef3 = ap42;
            }
            long j3 = fw42.c;
            boolean g4 = yt22.g(b2);
            Object Q5 = yt22.Q();
            if (g4 || Q5 == d632) {
                Q5 = new mu4(5, b2);
                yt22.o0(Q5);
            }
            int i20 = i17 << 3;
            k(ef3, j3, pq6, J, i9, fw02, (sr2) Q5, f2, f4, yt22, ((i17 >> 6) & 896) | 3072 | ((i19 >> 3) & 57344) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), ((i17 >> 27) & 14) | ((i19 << 3) & 112));
            yt22.r(true);
        } else {
            ap42 = ap43;
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ow4(z, f5Var, fw0, tg7, pq6, f2, f3, fw42, ml4, gs22, i2, ap42, i3, i4);
        }
    }

    public static final void k(ef3 ef3, long j2, pq6 pq6, fw0 fw0, int i2, gs2 gs2, sr2 sr2, float f2, float f3, yt2 yt2, int i3, int i4) {
        int i5;
        int i6;
        boolean z;
        Object obj;
        jl4 jl4;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ef3 ef32 = ef3;
        pq6 pq62 = pq6;
        fw0 fw02 = fw0;
        int i18 = i2;
        gs2 gs22 = gs2;
        sr2 sr22 = sr2;
        float f4 = f2;
        float f5 = f3;
        yt2 yt22 = yt2;
        int i19 = i3;
        yt22.g0(-1473868071);
        if ((i19 & 6) == 0) {
            if (yt22.g(ef32)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i19;
        } else {
            i5 = i19;
        }
        if ((i19 & 48) == 0) {
            if (yt22.f(j2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i5 |= i16;
        } else {
            long j3 = j2;
        }
        if ((i19 & 384) == 0) {
            if (yt22.g(pq62)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i5 |= i15;
        }
        if ((i19 & 3072) == 0) {
            if (yt22.i(fw02)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i5 |= i14;
        }
        if ((i19 & 24576) == 0) {
            if (yt22.e(i18)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i5 |= i13;
        }
        if ((196608 & i19) == 0) {
            if (yt22.i(gs22)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i5 |= i12;
        }
        if ((1572864 & i19) == 0) {
            if (yt22.i(sr22)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        if ((12582912 & i19) == 0) {
            if (yt22.d(16.0f)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i5 |= i10;
        }
        if ((100663296 & i19) == 0) {
            if (yt22.d(f4)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i5 |= i9;
        }
        int i20 = 32;
        if ((805306368 & i19) == 0) {
            if (yt22.d(4.0f)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i5 |= i8;
        }
        int i21 = i5;
        if ((i4 & 6) == 0) {
            if (yt22.d(f5)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i4 | i7;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            if (!yt22.d(6.0f)) {
                i20 = 16;
            }
            i6 |= i20;
        }
        if ((i21 & 306783379) == 306783378 && (i6 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i21 & 1, z)) {
            nw0 nw0 = new nw0(4);
            jl4 jl42 = jl4.w;
            ml4 D = we.D(jl42, nw0);
            if (gs22 == null || i18 == 0) {
                jl4 jl43 = jl42;
                sr2 sr23 = sr22;
                if (gs22 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jl4 = jl43;
                obj = new kk7(z3, sr23, 16.0f, f4, 4.0f, 6.0f);
            } else {
                obj = new u27(sr22, f4, f5);
                jl4 = jl42;
            }
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, D);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, obj);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            int i22 = i21 >> 3;
            h(ef32, pq62, yt22, (i21 & 14) | (i22 & 112));
            g(j2, pq62, sr2, yt22, (i22 & 126) | ((i21 >> 12) & 896));
            ml4 w0 = rc9.w0(jl4, "icon");
            i80 i80 = xb4.y;
            lh4 d2 = mb0.d(i80, false);
            ml4 ml4 = w0;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E2 = gw8.E(yt22, ml4);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d2);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            f21.r((i21 >> 9) & 14, fw02, yt22, true);
            if (gs22 != null) {
                yt22.e0(-2087200706);
                ml4 w02 = rc9.w0(jl4, "label");
                lh4 d3 = mb0.d(i80, false);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m4 = yt22.m();
                ml4 E3 = gw8.E(yt22, w02);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d3);
                g75.Q(ckVar2, yt22, m4);
                f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E3);
                z2 = true;
                pb4.q((i21 >> 15) & 14, gs22, yt22, true, false);
            } else {
                z2 = true;
                yt22.e0(-2087119982);
                yt22.r(false);
            }
            yt22.r(z2);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new jw4(ef3, j2, pq6, fw0, i2, gs22, sr2, f2, f3, i3, i4);
        }
    }

    public static final void l(boolean z, tg7 tg7, fw4 fw4, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        gs2 gs22;
        yt2 yt22;
        tg7 tg72;
        long j2;
        yt2.g0(-2136267443);
        if (yt2.h(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i3 | i2;
        if (yt2.g(tg7)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (yt2.g(fw4)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        boolean z2 = true;
        if (yt2.h(true)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (yt2.i(gs2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) == 9362) {
            z2 = false;
        }
        if (yt2.V(i12 & 1, z2)) {
            if (z) {
                j2 = fw4.b;
            } else {
                j2 = fw4.e;
            }
            tg72 = tg7;
            gs2 gs23 = gs2;
            yt22 = yt2;
            a35.a(j2, tg72, gs23, yt22, (i12 & 112) | ((i12 >> 6) & 896));
            gs22 = gs23;
        } else {
            tg72 = tg7;
            yt22 = yt2;
            gs22 = gs2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new kw4(z, tg72, fw4, gs22, i2);
        }
    }

    public static final st2 m(st2 st2) {
        if (st2 == null) {
            st2 = null;
        }
        if (st2 != null) {
            return st2;
        }
        ey0.b("Inconsistent composition");
        ta1.e();
        return null;
    }

    public static final aq4 n(b37 b37, yt2 yt2) {
        Object value = b37.getValue();
        in8 k2 = ((t54) yt2.k(ha4.a)).k();
        k54 k54 = k54.z;
        x32 x32 = x32.w;
        Object[] objArr = {b37, k2, k54, x32};
        boolean i2 = yt2.i(k2) | yt2.e(k54.ordinal()) | yt2.i(x32) | yt2.i(b37);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (i2 || Q == d63) {
            w6 w6Var = new w6((Object) k2, (Object) k54, (Object) x32, (Object) b37, (f61) null, 6);
            yt2.o0(w6Var);
            Q = w6Var;
        }
        gs2 gs2 = (gs2) Q;
        Object Q2 = yt2.Q();
        if (Q2 == d63) {
            Q2 = u55.p(value);
            yt2.o0(Q2);
        }
        aq4 aq4 = (aq4) Q2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean i3 = yt2.i(gs2);
        Object Q3 = yt2.Q();
        if (i3 || Q3 == d63) {
            Q3 = new wx6(gs2, aq4, (f61) null, 3);
            yt2.o0(Q3);
        }
        gs2 gs22 = (gs2) Q3;
        e81 e81 = yt2.R;
        boolean z = false;
        for (Object g2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z |= yt2.g(g2);
        }
        Object Q4 = yt2.Q();
        if (!z && Q4 != d63) {
            return aq4;
        }
        yt2.o0(new yx3(e81, gs22));
        return aq4;
    }

    public static so0 o(long j2, long j3, yt2 yt2) {
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20 = jt0.g;
        so0 u = u(((zg4) yt2.k(ch4.b)).a);
        long j21 = jt0.f;
        int i2 = (j20 > 16 ? 1 : (j20 == 16 ? 0 : -1));
        if (i2 != 0) {
            j4 = j20;
        } else {
            j4 = u.a;
        }
        int i3 = (j21 > 16 ? 1 : (j21 == 16 ? 0 : -1));
        if (i3 != 0) {
            j5 = j21;
        } else {
            j5 = u.b;
        }
        int i4 = (j2 > 16 ? 1 : (j2 == 16 ? 0 : -1));
        if (i4 != 0) {
            j6 = 16;
            j7 = j2;
        } else {
            j6 = 16;
            j7 = u.c;
        }
        if (i3 != 0) {
            j8 = j20;
            j9 = j21;
        } else {
            j8 = j20;
            j9 = u.d;
        }
        int i5 = (j8 > j6 ? 1 : (j8 == j6 ? 0 : -1));
        if (i5 != 0) {
            j10 = j9;
            j11 = j8;
        } else {
            j10 = j9;
            j11 = u.e;
        }
        if (i3 == 0) {
            j21 = u.f;
        }
        long j22 = j21;
        int i6 = (j8 > j6 ? 1 : (j8 == j6 ? 0 : -1));
        if (i6 != 0) {
            j12 = j11;
            j13 = j8;
        } else {
            j12 = j11;
            j13 = u.g;
        }
        if (i4 != 0) {
            j14 = j2;
        } else {
            j14 = u.h;
        }
        if (j3 != j6) {
            j15 = j3;
        } else {
            j15 = u.i;
        }
        if (i5 != 0) {
            j16 = j8;
        } else {
            j16 = u.j;
        }
        if (j8 != j6) {
            j17 = j8;
        } else {
            j17 = u.k;
        }
        if (i6 != 0) {
            j18 = j8;
        } else {
            j18 = u.l;
        }
        if (i2 != 0) {
            j19 = j8;
        } else {
            j19 = u.m;
        }
        return new so0(j4, j5, j7, j10, j12, j22, j13, j14, j15, j16, j17, j18, j19);
    }

    public static final int p(long j2, long j3) {
        boolean C = C(j2);
        if (C == C(j3)) {
            int signum = (int) Math.signum(v(j2) - v(j3));
            if (Math.min(v(j2), v(j3)) < 0.0f || B(j2) == B(j3)) {
                return signum;
            }
            if (B(j2)) {
                return -1;
            }
            return 1;
        } else if (C) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [gq3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final dj0 q(gw3 gw3, boolean z) {
        to3 to3;
        Method method;
        dj0 dj0;
        dj0 rj0;
        boolean z2;
        qw3 Q = gw3.Q();
        boolean v = jb5.v(Q);
        su3 su3 = Q.A;
        if (v) {
            return sh7.a;
        }
        yq3 yq3 = Q.x;
        if (z) {
            su3.getClass();
            to3 = tf4.z(su3).c;
        } else {
            su3.getClass();
            to3 = tf4.z(su3).d;
        }
        oq3 oq3 = null;
        if (to3 != null) {
            method = yq3.N(to3.C, to3.D);
        } else {
            method = null;
        }
        if (method == null) {
            if (!l55.r(Q) || Q.f() != ls3.y) {
                Field t2 = Q.t();
                if (t2 != null) {
                    if ((yq3 instanceof oq3) && ((oq3) yq3).b0() == hq0.D) {
                        Class<?> enclosingClass = kl8.u((gq3) yq3).getEnclosingClass();
                        enclosingClass.getClass();
                        ? b2 = b26.a.b(enclosingClass);
                        if (b2 instanceof oq3) {
                            oq3 = b2;
                        }
                        if (oq3 != null) {
                            if (oq3.b0() == hq0.y || oq3.b0() == hq0.B) {
                                yr3[] yr3Arr = qn3.a;
                                su3.getClass();
                                z2 = qn3.b.C(qn3.a[6], su3);
                            } else {
                                z2 = true;
                            }
                            if (!z2 && Modifier.isStatic(t2.getModifiers())) {
                                r(gw3);
                                if (z) {
                                    rj0 = new ij0(t2, false, 2);
                                } else {
                                    rj0 = new mj0(t2, !g18.k(Q.k()), false, 2);
                                }
                            } else if (z) {
                                if (r16.Z(gw3)) {
                                    rj0 = new gj0(t2, r16.F(gw3.Q()));
                                } else {
                                    rj0 = new ij0(t2, true, 0);
                                }
                            } else if (r16.Z(gw3)) {
                                rj0 = new kj0(t2, !g18.k(Q.k()), r16.F(gw3.Q()));
                            } else {
                                rj0 = new mj0(t2, !g18.k(Q.k()), true, 0);
                            }
                        }
                    }
                    z2 = false;
                    if (!z2 || Modifier.isStatic(t2.getModifiers())) {
                    }
                } else {
                    rf2.x("No accessors or field is found for property ", Q);
                    return null;
                }
            } else {
                Class x = l55.x(((t16) dt0.Q0(Q.getParameters())).y());
                if (x != null) {
                    Method n2 = l55.n(x, Q);
                    if (r16.Z(gw3)) {
                        dj0 = new bg3(n2, r16.F(gw3.Q()));
                    } else {
                        dj0 = new cg3(n2);
                    }
                    return l55.j(dj0, gw3, a42.w, false);
                }
                throw new Error("Underlying property of inline class " + Q + " should have a field");
            }
        } else if (Modifier.isStatic(method.getModifiers())) {
            r(gw3);
            if (r16.Z(gw3)) {
                rj0 = new qj0(method, false, r16.F(gw3.Q()));
            } else {
                rj0 = new rj0(method, false, 6, 2);
            }
        } else if (r16.Z(gw3)) {
            rj0 = new oj0(method, r16.F(gw3.Q()));
        } else {
            rj0 = new rj0(method, false, 6, 0);
        }
        dj0 = rj0;
        return l55.j(dj0, gw3, a42.w, false);
    }

    public static final void r(gw3 gw3) {
        if (!(gw3.Q().x instanceof pr3)) {
            StringBuilder sb = new StringBuilder("Only top-level properties are supported for now: ");
            sb.append(gw3.Q().x);
            String name = gw3.getName();
            sb.append('/');
            sb.append(name);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public static final w52 t(Enum[] enumArr) {
        enumArr.getClass();
        return new w52(enumArr);
    }

    public static so0 u(qt0 qt0) {
        qt0 qt02 = qt0;
        so0 so0 = qt02.c0;
        if (so0 != null) {
            return so0;
        }
        long d2 = st0.d(qt02, xo0.e);
        long j2 = jt0.f;
        long d3 = st0.d(qt02, xo0.d);
        rt0 rt0 = xo0.a;
        long d4 = st0.d(qt02, rt0);
        rt0 rt02 = xo0.b;
        long d5 = st0.d(qt02, rt02);
        float f2 = xo0.c;
        long b2 = jt0.b(f2, d5);
        long b3 = jt0.b(f2, st0.d(qt02, rt02));
        long d6 = st0.d(qt02, rt0);
        long d7 = st0.d(qt02, xo0.i);
        long b4 = jt0.b(f2, st0.d(qt02, rt02));
        long b5 = jt0.b(xo0.g, st0.d(qt02, xo0.h));
        long b6 = jt0.b(f2, st0.d(qt02, rt02));
        so0 so02 = new so0(d2, j2, d4, j2, b2, j2, b3, d6, d7, b4, b5, b6, d3);
        qt02.c0 = so02;
        return so02;
    }

    public static final float v(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final x83 w() {
        x83 x83 = t;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Outlined.Insights", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        long j2 = jt0.b;
        ky6 ky6 = new ky6(j2);
        be5 e2 = pb4.e(21.0f, 8.0f);
        e2.e(-1.45f, 0.0f, -2.26f, 1.44f, -1.93f, 2.51f);
        e2.i(-3.55f, 3.56f);
        e2.e(-0.3f, -0.09f, -0.74f, -0.09f, -1.04f, 0.0f);
        e2.i(-2.55f, -2.55f);
        e2.d(12.27f, 10.45f, 11.46f, 9.0f, 10.0f, 9.0f);
        e2.e(-1.45f, 0.0f, -2.27f, 1.44f, -1.93f, 2.52f);
        e2.i(-4.56f, 4.55f);
        e2.d(2.44f, 15.74f, 1.0f, 16.55f, 1.0f, 18.0f);
        e2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e2.e(1.45f, 0.0f, 2.26f, -1.44f, 1.93f, -2.51f);
        e2.i(4.55f, -4.56f);
        e2.e(0.3f, 0.09f, 0.74f, 0.09f, 1.04f, 0.0f);
        e2.i(2.55f, 2.55f);
        e2.d(12.73f, 16.55f, 13.54f, 18.0f, 15.0f, 18.0f);
        e2.e(1.45f, 0.0f, 2.27f, -1.44f, 1.93f, -2.52f);
        e2.i(3.56f, -3.55f);
        e2.d(21.56f, 12.26f, 23.0f, 11.45f, 23.0f, 10.0f);
        e2.d(23.0f, 8.9f, 22.1f, 8.0f, 21.0f, 8.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        ky6 ky62 = new ky6(j2);
        be5 f2 = pb4.f(15.0f, 9.0f, 0.94f, -2.07f);
        f2.i(2.06f, -0.93f);
        f2.i(-2.06f, -0.93f);
        f2.i(-0.94f, -2.07f);
        f2.i(-0.92f, 2.07f);
        f2.i(-2.08f, 0.93f);
        f2.i(2.08f, 0.93f);
        f2.c();
        w83.a(w83, f2.a, ky62, 14336);
        ky6 ky63 = new ky6(j2);
        be5 f3 = pb4.f(3.5f, 11.0f, 0.5f, -2.0f);
        f3.i(2.0f, -0.5f);
        f3.i(-2.0f, -0.5f);
        f3.i(-0.5f, -2.0f);
        f3.i(-0.5f, 2.0f);
        f3.i(-2.0f, 0.5f);
        f3.i(2.0f, 0.5f);
        f3.c();
        w83.a(w83, f3.a, ky63, 14336);
        x83 b2 = w83.b();
        t = b2;
        return b2;
    }

    public static final zr3 x(zr3 zr3) {
        zr3.getClass();
        if (zr3.getDescriptor().c()) {
            return zr3;
        }
        return new w15(zr3);
    }

    public static final kk0 y(f61 f61) {
        if (!(f61 instanceof sv1)) {
            return new kk0(1, f61);
        }
        kk0 l2 = ((sv1) f61).l();
        if (l2 != null) {
            if (!l2.D()) {
                l2 = null;
            }
            if (l2 != null) {
                return l2;
            }
        }
        return new kk0(2, f61);
    }

    public static byte[] z(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo c2 = cf8.a(context).c(64, str);
        Signature[] signatureArr = c2.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        break;
                    }
                    i2++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(c2.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public ns8 A(Context context, Object obj) {
        return null;
    }

    public abstract Object D(Intent intent, int i2);

    public abstract Intent s(Context context, Object obj);
}
