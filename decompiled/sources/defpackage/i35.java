package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Patterns;
import android.view.View;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: i35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i35 {
    public static x83 a;
    public static x83 b;
    public static String[] c;

    public static final void a(ArrayList arrayList, int i, vr2 vr2, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        jl4 jl4;
        ArrayList arrayList2 = arrayList;
        int i6 = i;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        vr22.getClass();
        yt22.g0(-1124073234);
        if (yt22.g(arrayList2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (yt22.e(i6)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (yt22.i(vr22)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5 | 3072;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            jl4 jl42 = jl4.w;
            ml4 M = x91.M(yu6.d(jl42, 56.0f), 16.0f, 0.0f, 2);
            t37 t37 = ch4.b;
            s87.a(M, ((zg4) yt22.k(t37)).c.c, jt0.b(0.5f, ((zg4) yt22.k(t37)).a.r), 0, 0.0f, 0.0f, su0.J(-799369079, new dj7((Object) arrayList2, i6, (Object) vr22, 0), yt22), yt22, 12582912, 120);
            jl4 = jl42;
        } else {
            yt2.Y();
            jl4 = ml4;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(arrayList2, i6, vr22, jl4, i2, 21);
        }
    }

    public static final void b(fw0 fw0, gs2 gs2, gs2 gs22, tg7 tg7, long j, long j2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        tg7 tg72;
        gs2 gs23;
        gs2 gs24;
        float f;
        int i8;
        boolean z2;
        boolean z3;
        fw0 fw02 = fw0;
        gs2 gs25 = gs2;
        gs2 gs26 = gs22;
        tg7 tg73 = tg7;
        long j3 = j;
        long j4 = j2;
        yt2 yt22 = yt2;
        yt22.g0(-321841045);
        if (yt22.i(fw02)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (yt22.i(gs25)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (yt22.i(gs26)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (yt22.g(tg73)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (yt22.f(j3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (yt22.f(j4)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if ((74899 & i14) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i14 & 1, z)) {
            if (gs26 == null) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            jl4 jl4 = jl4.w;
            ml4 O = x91.O(jl4, 16.0f, 0.0f, f, 0.0f, 10);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = new pf(12);
                yt22.o0(Q);
            }
            lh4 lh4 = (lh4) Q;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, O);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i15 = i14;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, lh4);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ml4 M = x91.M(rc9.w0(jl4, "text"), 0.0f, 6.0f, 1);
            i80 i80 = xb4.y;
            lh4 d = mb0.d(i80, false);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, M);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            f21.r(i15 & 14, fw02, yt22, true);
            if (gs2 != null) {
                yt22.e0(989211000);
                ml4 w0 = rc9.w0(jl4, "action");
                lh4 d2 = mb0.d(i80, false);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E3 = gw8.E(yt22, w0);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d2);
                g75.Q(ckVar2, yt22, m3);
                f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E3);
                tg72 = tg7;
                i8 = 8;
                gs24 = gs2;
                t49.d(new ju5[]{b81.g(j, j41.a), yf7.a.a(tg72)}, gs24, yt22, (i15 & 112) | 8);
                yt22.r(true);
                z2 = false;
                yt22.r(false);
            } else {
                tg72 = tg7;
                long j5 = j;
                i8 = 8;
                z2 = false;
                gs24 = gs2;
                yt22.e0(989526208);
                yt22.r(false);
            }
            if (gs22 != null) {
                yt22.e0(989574568);
                ml4 w02 = rc9.w0(jl4, "dismissAction");
                lh4 d3 = mb0.d(i80, z2);
                int hashCode4 = Long.hashCode(yt22.T);
                vf5 m4 = yt22.m();
                ml4 E4 = gw8.E(yt22, w02);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d3);
                g75.Q(ckVar2, yt22, m4);
                f21.s(hashCode4, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E4);
                j4 = j2;
                gs23 = gs22;
                t49.c(b81.g(j4, j41.a), gs23, yt22, i8 | ((i15 >> 3) & 112));
                z3 = true;
                yt22.r(true);
                yt22.r(false);
            } else {
                gs23 = gs22;
                z3 = true;
                j4 = j2;
                yt22.e0(989843648);
                yt22.r(z2);
            }
            yt22.r(z3);
        } else {
            gs23 = gs26;
            tg72 = tg73;
            gs24 = gs25;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new tw6(fw02, gs24, gs23, tg72, j, j4, i);
        }
    }

    public static final void c(ml4 ml4, gs2 gs2, gs2 gs22, pq6 pq6, long j, long j2, long j3, long j4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        gs2 gs23;
        gs2 gs24;
        pq6 pq62;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yt2 yt22 = yt2;
        int i13 = i;
        yt22.g0(-1218779924);
        ml4 ml42 = ml4;
        if ((i13 & 6) == 0) {
            if (yt22.g(ml42)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i13;
        } else {
            i2 = i13;
        }
        if ((i13 & 48) == 0) {
            gs23 = gs2;
            if (yt22.i(gs23)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        } else {
            gs23 = gs2;
        }
        if ((i13 & 384) == 0) {
            gs24 = gs22;
            if (yt22.i(gs24)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        } else {
            gs24 = gs22;
        }
        if ((i13 & 3072) == 0) {
            if (yt22.h(false)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i13 & 24576) == 0) {
            pq62 = pq6;
            if (yt22.g(pq62)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        } else {
            pq62 = pq6;
        }
        if ((196608 & i13) == 0) {
            if (yt22.f(j)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        } else {
            long j5 = j;
        }
        long j6 = j2;
        if ((1572864 & i13) == 0) {
            if (yt22.f(j6)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        long j7 = j3;
        if ((12582912 & i13) == 0) {
            if (yt22.f(j7)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        long j8 = j4;
        if ((100663296 & i13) == 0) {
            if (yt22.f(j8)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((805306368 & i13) == 0) {
            if (yt22.i(fw0)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        } else {
            fw0 fw02 = fw0;
        }
        if ((306783379 & i2) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            yt22.a0();
            if ((i13 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            int i14 = i2 >> 9;
            long j9 = j;
            int i15 = (i14 & 7168) | (i2 & 14) | 12779520 | (i14 & 112) | (i14 & 896);
            ml4 ml43 = ml42;
            pq6 pq63 = pq62;
            long j10 = j2;
            s87.a(ml43, pq63, j9, j10, 0.0f, ie1.Z, su0.J(-1343524879, new s03(gs23, fw0, gs24, j7, j8), yt22), yt22, i15, 80);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new sw6(ml4, gs2, gs22, pq6, j, j2, j3, j4, fw0, i13);
        }
    }

    public static final void d(nw6 nw6, ml4 ml4, pq6 pq6, long j, long j2, long j3, long j4, long j5, yt2 yt2, int i) {
        int i2;
        boolean z;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        pq6 pq62;
        ml4 ml42;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        int i3;
        jl4 jl4;
        long j16;
        fw0 fw0;
        int i4;
        nw6 nw62 = nw6;
        yt2 yt22 = yt2;
        int i5 = i;
        yt22.g0(274621471);
        if ((i5 & 6) == 0) {
            if (yt22.g(nw62)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        int i6 = i2 | 432;
        if ((i5 & 3072) == 0) {
            i6 = i2 | 1456;
        }
        if ((i5 & 24576) == 0) {
            i6 |= 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= 4194304;
        }
        if ((100663296 & i5) == 0) {
            i6 |= 33554432;
        }
        if ((38347923 & i6) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            yt22.a0();
            if ((i5 & 1) == 0 || yt22.C()) {
                pq6 a2 = hr6.a(ie1.a0, yt22);
                j15 = st0.e(ie1.Y, yt22);
                j14 = st0.e(ie1.c0, yt22);
                rt0 rt0 = ie1.W;
                j13 = st0.e(rt0, yt22);
                j12 = st0.e(rt0, yt22);
                j11 = st0.e(ie1.b0, yt22);
                i3 = i6 & -268434433;
                pq62 = a2;
                jl4 = jl4.w;
            } else {
                yt22.Y();
                pq62 = pq6;
                j15 = j;
                j14 = j2;
                j13 = j3;
                j12 = j4;
                j11 = j5;
                i3 = i6 & -268434433;
                jl4 = ml4;
            }
            yt22.s();
            String str = nw62.a.b;
            int i7 = i3;
            if (str != null) {
                yt22.e0(-663827885);
                long j17 = j13;
                j16 = j17;
                fw0 = su0.J(-1378313599, new ff(j17, (Object) nw62, (Object) str, 2), yt22);
                yt22.r(false);
            } else {
                j16 = j13;
                yt22.e0(-663528921);
                yt22.r(false);
                fw0 = null;
            }
            nw62.a.getClass();
            yt22.e0(-662527001);
            yt22.r(false);
            long j18 = j12;
            ml4 ml43 = jl4;
            j10 = j15;
            j9 = j14;
            long j19 = j18;
            long j20 = j11;
            c(x91.K(jl4, 12.0f), fw0, (gs2) null, pq62, j10, j9, j19, j20, su0.J(-1266389126, new lw6(nw62, 1), yt22), yt22, ((i7 << 3) & 7168) | 805306368);
            j6 = j20;
            ml42 = ml43;
            j7 = j19;
            j8 = j16;
        } else {
            yt2.Y();
            ml42 = ml4;
            pq62 = pq6;
            j10 = j;
            j9 = j2;
            j8 = j3;
            j7 = j4;
            j6 = j5;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new rw6(nw6, ml42, pq62, j10, j9, j8, j7, j6, i5);
        }
    }

    public static final int e(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == 10) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int f(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == 10) {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final ll5 g(View view) {
        ll5 ll5 = (ll5) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (ll5 != null) {
            return ll5;
        }
        ll5 ll52 = new ll5();
        view.setTag(R.id.pooling_container_listener_holder_tag, ll52);
        return ll52;
    }

    public static final x83 h() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Public", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e = pb4.e(12.0f, 2.0f);
        e.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e.l(4.48f, 10.0f, 10.0f, 10.0f);
        e.l(10.0f, -4.48f, 10.0f, -10.0f);
        e.k(17.52f, 2.0f, 12.0f, 2.0f);
        e.c();
        e.j(11.0f, 19.93f);
        e.e(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        e.e(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        e.h(9.0f, 15.0f);
        e.n(1.0f);
        e.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.n(1.93f);
        e.c();
        e.j(17.9f, 17.39f);
        e.e(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
        e.g(-1.0f);
        e.n(-3.0f);
        e.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.h(8.0f, 12.0f);
        e.n(-2.0f);
        e.g(2.0f);
        e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.h(11.0f, 7.0f);
        e.g(2.0f);
        e.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.n(-0.41f);
        e.e(2.93f, 1.19f, 5.0f, 4.06f, 5.0f, 7.41f);
        e.e(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static final ri6 i(Object obj) {
        if (obj != gz0.a) {
            return (ri6) obj;
        }
        h.s("Does not contain segment");
        return null;
    }

    public static final boolean j(vl vlVar) {
        int length = vlVar.x.length();
        List list = vlVar.w;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ul ulVar = (ul) list.get(i);
                if ((ulVar.a instanceof b74) && wl.b(0, length, ulVar.b, ulVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean k(Object obj) {
        if (obj == gz0.a) {
            return true;
        }
        return false;
    }

    public static final lq6 l(lq6 lq6, lq6 lq62, float f) {
        return new lq6(uq3.F(lq6.a, lq62.a, f), t35.x(lq6.b, lq62.b, f), we.E(lq6.c, lq62.c, f));
    }

    public static d71 m(qd5 qd5, CharSequence charSequence, d71 d71) {
        String str;
        charSequence.getClass();
        d71.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList I = sg3.I(new md5(d71, qd5, 0));
        while (true) {
            md5 md5 = (md5) it0.l0(I);
            if (md5 == null) {
                if (arrayList.size() > 1) {
                    ht0.g0(arrayList, new a91(22));
                }
                if (arrayList.size() == 1) {
                    str = "Position " + ((ld5) arrayList.get(0)).a + ": " + ((String) ((ld5) arrayList.get(0)).b.b());
                } else {
                    StringBuilder sb = new StringBuilder(arrayList.size() * 33);
                    dt0.D0(arrayList, sb, ", ", "Errors: ", (String) null, new ot4(24), 56);
                    str = sb.toString();
                }
                throw new Exception(str);
            }
            d71 d712 = (d71) ((d71) md5.a).copy();
            int i = md5.c;
            qd5 qd52 = md5.b;
            List list = qd52.a;
            List list2 = qd52.b;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object a2 = ((pd5) qd52.a.get(i2)).a(d712, charSequence, i);
                    if (a2 instanceof Integer) {
                        i = ((Number) a2).intValue();
                        i2++;
                    } else if (a2 instanceof ld5) {
                        arrayList.add((ld5) a2);
                    } else {
                        ta1.l("Unexpected parse result: ", a2);
                        return null;
                    }
                } else if (!list2.isEmpty()) {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            I.add(new md5(d712, (qd5) list2.get(size2), i));
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                } else if (i == charSequence.length()) {
                    return d712;
                } else {
                    arrayList.add(new ld5(i, x10.J));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    public static final mh4 n(aa6 aa6, int i, int i2, int i3, int i4, int i5, oh4 oh4, List list, eh5[] eh5Arr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        ba6 ba6;
        ie1 ie1;
        Integer num;
        int i13;
        int i14;
        float f;
        int i15;
        boolean z;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int i19;
        ie1 ie12;
        boolean z3;
        aa6 aa62 = aa6;
        int i20 = i3;
        int i21 = i4;
        int i22 = i5;
        List list2 = list;
        int i23 = i7;
        long j = (long) i22;
        int i24 = i23 - i6;
        int[] iArr2 = new int[i24];
        int i25 = i6;
        int i26 = 0;
        int i27 = 0;
        boolean z4 = false;
        int i28 = 0;
        int i29 = 0;
        float f2 = 0.0f;
        while (i25 < i23) {
            gh4 gh4 = (gh4) list2.get(i25);
            long j2 = j;
            ba6 i30 = c35.i(gh4);
            float j3 = c35.j(i30);
            if (!z4) {
                if (i30 != null) {
                    ie12 = i30.c;
                } else {
                    ie12 = null;
                }
                if (ie12 != null) {
                    z3 = ie12 instanceof cc1;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z4 = false;
                    if (j3 <= 0.0f) {
                        f2 += j3;
                        i27++;
                        i17 = i25;
                    } else {
                        eh5 eh5 = eh5Arr[i25];
                        int i31 = i20 - i28;
                        if (eh5 == null) {
                            if (i20 == Integer.MAX_VALUE) {
                                i17 = i25;
                                i18 = i27;
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i17 = i25;
                                i18 = i27;
                                if (i31 < 0) {
                                    i19 = 0;
                                } else {
                                    i19 = i31;
                                }
                            }
                            eh5 = gh4.y(aa62.g(0, i19, i21, false));
                        } else {
                            i17 = i25;
                            i18 = i27;
                        }
                        int j4 = aa62.j(eh5);
                        int i32 = aa62.i(eh5);
                        iArr2[i17 - i6] = j4;
                        int i33 = i31 - j4;
                        if (i33 < 0) {
                            i33 = 0;
                        }
                        i29 = Math.min(i22, i33);
                        i28 += j4 + i29;
                        i26 = Math.max(i26, i32);
                        eh5Arr[i17] = eh5;
                        i27 = i18;
                    }
                    i25 = i17 + 1;
                    j = j2;
                }
            }
            z4 = true;
            if (j3 <= 0.0f) {
            }
            i25 = i17 + 1;
            j = j2;
        }
        long j5 = j;
        int i34 = i27;
        boolean z5 = true;
        if (i34 == 0) {
            i28 -= i29;
            i9 = 0;
        } else {
            if (i20 != Integer.MAX_VALUE) {
                i14 = i20;
            } else {
                i14 = i;
            }
            long j6 = ((long) (i34 - 1)) * j5;
            long j7 = ((long) (i14 - i28)) - j6;
            if (j7 < 0) {
                j7 = 0;
            }
            float f3 = ((float) j7) / f2;
            int i35 = i6;
            while (i35 < i23) {
                j7 -= (long) Math.round(c35.j(c35.i((gh4) list2.get(i35))) * f3);
                i35++;
                int i36 = i3;
                j6 = j6;
            }
            long j8 = j6;
            int i37 = i6;
            int i38 = 0;
            while (i37 < i23) {
                if (eh5Arr[i37] == null) {
                    gh4 gh42 = (gh4) list2.get(i37);
                    ba6 i39 = c35.i(gh42);
                    float j9 = c35.j(i39);
                    if (j9 <= 0.0f) {
                        wb3.b("All weights <= 0 should have placeables");
                    }
                    i15 = i37;
                    int signum = Long.signum(j7);
                    f = f3;
                    j7 -= (long) signum;
                    int max = Math.max(0, Math.round(f * j9) + signum);
                    if (i39 != null) {
                        z2 = i39.b;
                    } else {
                        z2 = z5;
                    }
                    if (z2) {
                        if (max != Integer.MAX_VALUE) {
                            i16 = max;
                        }
                        i16 = 0;
                    } else {
                        i16 = 0;
                    }
                    z = z5;
                    eh5 y = gh42.y(aa62.g(i16, max, i21, z));
                    int j10 = aa62.j(y);
                    int i40 = aa62.i(y);
                    iArr2[i15 - i6] = j10;
                    i38 += j10;
                    int max2 = Math.max(i26, i40);
                    eh5Arr[i15] = y;
                    i26 = max2;
                } else {
                    i15 = i37;
                    f = f3;
                    z = z5;
                }
                list2 = list;
                z5 = z;
                i37 = i15 + 1;
                f3 = f;
            }
            i9 = (int) (((long) i38) + j8);
            int i41 = i3 - i28;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i41) {
                i9 = i41;
            }
        }
        if (z4) {
            int i42 = 0;
            i11 = 0;
            for (int i43 = i6; i43 < i23; i43++) {
                eh5 eh52 = eh5Arr[i43];
                eh52.getClass();
                Object B = eh52.B();
                if (B instanceof ba6) {
                    ba6 = (ba6) B;
                } else {
                    ba6 = null;
                }
                if (ba6 != null) {
                    ie1 = ba6.c;
                } else {
                    ie1 = null;
                }
                if (ie1 != null) {
                    num = ie1.u(eh52);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    int i44 = aa62.i(eh52);
                    if (intValue != Integer.MIN_VALUE) {
                        i13 = num.intValue();
                    } else {
                        i13 = 0;
                    }
                    i42 = Math.max(i42, i13);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = i44;
                    }
                    i11 = Math.max(i11, i44 - intValue);
                }
            }
            i10 = i42;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i45 = i28 + i9;
        if (i45 < 0) {
            i12 = 0;
        } else {
            i12 = i45;
        }
        int max3 = Math.max(i12, i);
        int max4 = Math.max(i26, Math.max(i2, i11 + i10));
        int[] iArr3 = new int[i24];
        oh4 oh42 = oh4;
        aa62.f(max3, iArr2, iArr3, oh42);
        return aa62.h(eh5Arr, oh42, i10, iArr3, max3, max4, iArr, i8, i6, i23);
    }

    public static final void o(ll4 ll4, sr2 sr2) {
        j35 j35 = ll4.C;
        if (j35 == null) {
            j35 = new j35((h35) ll4);
            ll4.C = j35;
        }
        r95 snapshotObserver = ((je) rc9.P0(ll4)).getSnapshotObserver();
        snapshotObserver.a.e(j35, xc4.C, sr2);
    }

    public static final c98 p(int i, int i2, yt2 yt2) {
        d98 d98;
        boolean z = true;
        if ((i2 & 1) != 0) {
            d98 = d98.w;
        } else {
            d98 = d98.x;
        }
        je2 H = hj8.H(vm4.w, yt2);
        Object[] objArr = new Object[0];
        kg5 kg5 = new kg5(12, new of6(18), new f08(H));
        if ((((i & 14) ^ 6) <= 4 || !yt2.e(d98.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean i3 = yt2.i(H) | z;
        Object Q = yt2.Q();
        if (i3 || Q == ay0.a) {
            Q = new fd7(d98, H);
            yt2.o0(Q);
        }
        return (c98) u55.t(objArr, kg5, (sr2) Q, yt2, 0);
    }

    public static final us1 q(h8 h8Var) {
        h8Var.getClass();
        us1 us1 = (us1) ni3.d.get(h8Var);
        if (us1 == null) {
            return vs1.g(h8Var);
        }
        return us1;
    }

    public static final void r(int i, bs8 bs8, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        rr8 rr8;
        jb9 jb9;
        jb9 jb92;
        int i6 = i;
        bs8 bs82 = bs8;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        sr22.getClass();
        yt22.g0(-158631053);
        if (true != yt22.e(i6)) {
            i3 = 2;
        } else {
            i3 = 4;
        }
        int i7 = i2 | i3;
        if (true != yt22.i(bs82)) {
            i4 = 16;
        } else {
            i4 = 32;
        }
        int i8 = i7 | i4;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i8 & 1, z)) {
            yt22.a0();
            if ((i2 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            aq4 f = u55.f(bs82.d, yt22);
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = u55.p((Object) null);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            vr8 vr8 = (vr8) f.getValue();
            if (vr8 instanceof rr8) {
                rr8 = (rr8) vr8;
            } else {
                rr8 = null;
            }
            if (rr8 != null) {
                jb9 = (jb9) dt0.z0(i6, rr8.a);
            } else {
                jb9 = null;
            }
            boolean i9 = yt22.i(jb9) | yt22.i(bs82);
            Object Q2 = yt22.Q();
            if (i9 || Q2 == obj) {
                jb92 = jb9;
                ng ngVar = new ng((Object) jb92, (Object) bs82, (Object) aq4, (f61) null, 28);
                yt22.o0(ngVar);
                Q2 = ngVar;
            } else {
                jb92 = jb9;
            }
            t49.h((gs2) Q2, yt22, jb92);
            i5 = i2;
            aa5.c((ml4) null, su0.J(-2027192017, new qq1(5, (Object) jb92, (Object) sr22), yt22), (gs2) null, (gs2) null, (gs2) null, 0, 0, 0, (aa8) null, su0.J(-148690620, new gy8(jb92, f, aq4), yt22), yt2, 805306416, 509);
        } else {
            i5 = i2;
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new d09(i6, bs82, sr22, i5);
        }
    }

    public static final void s(bs8 bs8, String str, boolean z, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        String str2;
        boolean z3;
        bs8 bs82;
        bs8 bs83;
        String str3 = str;
        boolean z4 = z;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(1574643533);
        int i5 = i4 | 2;
        if (true != yt22.g(str3)) {
            i2 = 16;
        } else {
            i2 = 32;
        }
        int i6 = i5 | i2;
        if (true != yt22.h(z4)) {
            i3 = 128;
        } else {
            i3 = 256;
        }
        int i7 = i6 | i3;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            yt22.a0();
            Activity activity = null;
            if ((i4 & 1) == 0 || yt22.C()) {
                a68 a2 = va4.a(yt22);
                if (a2 != null) {
                    bs83 = (bs8) n85.p(b26.a.b(bs8.class), a2, (w58) null, o85.k(a2), yt22);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt22.Y();
                bs83 = bs8;
            }
            yt22.s();
            d63 d63 = ay0.a;
            if (z4) {
                yt22.e0(572838453);
                boolean i8 = yt22.i(bs83);
                Object Q = yt22.Q();
                if (i8 || Q == d63) {
                    Q = new f70(bs83, (f61) null, 17);
                    yt22.o0(Q);
                }
                t49.h((gs2) Q, yt22, bs83);
                yt22.r(false);
            } else {
                yt22.e0(572899957);
                yt22.r(false);
            }
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                vu4[] vu4Arr = {m79.a};
                yx6 yx6 = new yx6();
                yx6.addAll(qs.p1(vu4Arr));
                yt22.o0(yx6);
                Q2 = yx6;
            }
            yx6 yx62 = (yx6) Q2;
            bc8 bc8 = l55.k(yt22).a;
            boolean g = yt22.g(bc8);
            Object Q3 = yt22.Q();
            if (g || Q3 == d63) {
                Q3 = new el8(bc8);
                yt22.o0(Q3);
            }
            el8 el8 = (el8) Q3;
            Context context = (Context) yt22.k(ye.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    Context baseContext = ((ContextWrapper) context).getBaseContext();
                    baseContext.getClass();
                    context = baseContext;
                }
            }
            Object Q4 = yt22.Q();
            if (Q4 == d63) {
                Q4 = new pq8(yx62, 1);
                yt22.o0(Q4);
            }
            List D = sg3.D(el8);
            yt22.e0(1403966270);
            r52 r52 = new r52(0);
            Boolean bool = Boolean.TRUE;
            Map singletonMap = Collections.singletonMap("ListDetailScene-List", bool);
            singletonMap.getClass();
            Activity activity2 = activity;
            bs8 bs84 = bs83;
            bs8 bs85 = bs84;
            str2 = str3;
            fw0 J = su0.J(1354652440, new gj7(bs84, str3, activity2, z4, yx62), yt22);
            e18 e18 = e18.y;
            c26 c26 = b26.a;
            r52.a(c26.b(m79.class), e18, new up8(singletonMap, 0), J);
            Map singletonMap2 = Collections.singletonMap("ListDetailScene-Detail", bool);
            singletonMap2.getClass();
            r52.a(c26.b(bw8.class), e18.z, new up8(singletonMap2, 1), su0.J(-88863884, new fq8(bs85, yx62), yt22));
            gg0 gg0 = new gg0(23, (Object) r52);
            yt22.r(false);
            bs8 bs86 = bs85;
            bs8 bs87 = bs86;
            z3 = z;
            rj1.k(yx62, (ml4) null, (jb) null, (sr2) Q4, (List) null, D, (List) null, (vr2) null, (vr2) null, (gs2) null, gg0, yt22, 3078);
            bs82 = bs87;
        } else {
            str2 = str3;
            z3 = z4;
            yt2.Y();
            bs82 = bs8;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new iq8(bs82, str2, z3, i4);
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void t(String str, ml4 ml4, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        String str2 = str;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        yt22.g0(-757578467);
        if (true != yt22.g(str2)) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        int i4 = i | i2;
        if (true != yt22.g(ml42)) {
            i3 = 16;
        } else {
            i3 = 32;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            tg7 tg7 = (tg7) yt22.k(yf7.a);
            long j = ((zg4) yt22.k(ch4.b)).a.a;
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Pattern pattern = Patterns.WEB_URL;
            boolean f = z2 | yt22.f(j);
            Object Q = yt22.Q();
            if (f || Q == ay0.a) {
                tl tlVar = new tl();
                Matcher matcher = pattern.matcher(str2);
                matcher.getClass();
                int i6 = 0;
                while (matcher.find()) {
                    tlVar.b(str2.substring(i6, matcher.start()));
                    String group = matcher.group();
                    group.getClass();
                    long j2 = j;
                    sl slVar = new sl((rl) new a74(group, new gg7(new yy6(j2, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, rd7.c, (lq6) null, 61438), (yy6) null, (yy6) null, (yy6) null)), tlVar.w.length(), 0, 12);
                    ArrayList arrayList = tlVar.x;
                    arrayList.add(slVar);
                    tlVar.y.add(slVar);
                    int size = arrayList.size() - 1;
                    try {
                        tlVar.b(group);
                        tlVar.c(size);
                        i6 = matcher.end();
                        j = j2;
                    } catch (Throwable th) {
                        tlVar.c(size);
                        throw th;
                    }
                }
                tlVar.b(str2.substring(i6));
                Q = tlVar.e();
                yt22.o0(Q);
            }
            yf7.c((vl) Q, ml42, 0, 0, 0, 0, 0, false, 0, 0, (Map) null, (vr2) null, tg7, yt2, i5 & 112, 0, 262140);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new qq1(str2, ml42, i);
        }
    }
}
