package defpackage;

/* renamed from: a61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a61 {
    public static final x51 a;

    static {
        yy0 yy0 = vh.a;
        long j = jt0.c;
        long j2 = jt0.b;
        a = new x51(j, j2, j2, jt0.b(0.38f, j2), jt0.b(0.38f, j2));
    }

    public static final void a(x51 x51, ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        ml4 ml42;
        int i3;
        int i4;
        int i5;
        x51 x512 = x51;
        ml4 ml43 = ml4;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i6 = i;
        yt22.g0(-527864079);
        if ((i6 & 6) == 0) {
            if (yt22.g(x512)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt22.g(ml43)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 384) == 0) {
            if (yt22.i(fw02)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            h80 h80 = z51.a;
            o96 a2 = q96.a(4.0f);
            if (lx1.a(3.0f, 0.0f) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j = gx2.a;
            if (lx1.a(3.0f, 0.0f) > 0 || z2) {
                ml42 = ml43.d(new mq6(a2, z2, j, j));
            } else {
                ml42 = ml43;
            }
            ml4 Z = t49.Z(x91.M(gw8.P(b96.h(ml42, x512.a, gr8.h), mg3.x), 0.0f, z51.d, 1), t49.Y(yt22), true);
            int i7 = (i2 << 3) & 7168;
            au0 a3 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, Z);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a3);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            fw02.u(bu0.a, yt22, Integer.valueOf(((i7 >> 6) & 112) | 6));
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new bi(i6, 5, (Object) x512, (Object) ml43, (Object) fw02);
        }
    }

    public static final void b(ml4 ml4, x51 x51, vr2 vr2, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        yt2.g0(-625529233);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else {
            if (yt2.g(ml4)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i4 = i3 | 48;
        } else {
            if (yt2.g(x51)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 = i3 | i6;
        }
        if (yt2.i(vr2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i4 | i5;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i10 & 1, z)) {
            if (i8 != 0) {
                ml4 = jl4.w;
            }
            if (i9 != 0) {
                x51 = a;
            }
            a(x51, ml4, su0.J(-250345048, new gc5(vr2, (Object) x51, 7), yt2), yt2, ((i10 << 3) & 112) | ((i10 >> 3) & 14) | 384);
        } else {
            yt2.Y();
        }
        ml4 ml42 = ml4;
        x51 x512 = x51;
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(ml42, x512, vr2, i, i2);
        }
    }

    public static final void c(String str, boolean z, x51 x51, ml4 ml4, hs2 hs2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2 = str;
        boolean z5 = z;
        x51 x512 = x51;
        ml4 ml42 = ml4;
        hs2 hs22 = hs2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(-2001167027);
        if ((i10 & 6) == 0) {
            if (yt22.g(str2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.h(z5)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.g(x512)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.g(ml42)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.i(hs22)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i10) == 0) {
            if (yt22.i(sr22)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            h80 h80 = z51.a;
            float f = z51.c;
            ur urVar = new ur(f, true, new h(2));
            if ((i2 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | z3;
            Object Q = yt22.Q();
            if (z6 || Q == ay0.a) {
                Q = new j11(1, sr22, z5);
                yt22.o0(Q);
            }
            ml4 M = x91.M(yu6.n(h49.u(ml42, z5, str2, (sr2) Q, 12).d(yu6.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            ea6 a2 = ca6.a(urVar, h80, yt22, 54);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, M);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            if (hs22 == null) {
                yt22.e0(-1597947094);
                yt22.r(false);
                i3 = i2;
            } else {
                yt22.e0(-1597947093);
                float f2 = z51.e;
                ml4 j3 = yu6.j(jl4.w, f2, 0.0f, f2, f2, 2);
                i3 = i2;
                lh4 d = mb0.d(xb4.y, false);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E2 = gw8.E(yt22, j3);
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
                if (z5) {
                    j2 = x512.c;
                } else {
                    j2 = x512.e;
                }
                hs22.u(new jt0(j2), yt22, 0);
                yt22.r(true);
                yt22.r(false);
            }
            if (z5) {
                j = x512.b;
            } else {
                j = x512.d;
            }
            long j4 = j;
            String str3 = str;
            t49.b(str3, new lz3(1.0f, true), new tg7(j4, z51.h, z51.i, z51.k, (l57) null, z51.b, z51.j, (dk5) null, (m64) null, 16613240), 0, false, 1, 0, yt22, (i3 & 14) | 1572864, 952);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new e70(str, z5, x512, ml42, hs22, sr2, i);
        }
    }
}
