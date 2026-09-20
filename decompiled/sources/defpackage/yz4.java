package defpackage;

/* renamed from: yz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yz4 {
    public static final hp4 a = new hp4();

    static {
        hp4 hp4 = v25.a;
    }

    public static final void a(ll4 ll4, int i, int i2) {
        if (ll4 instanceof wo1) {
            wo1 wo1 = (wo1) ll4;
            int i3 = wo1.K;
            b(ll4, i3 & i, i2);
            int i4 = (~i3) & i;
            for (ll4 ll42 = wo1.L; ll42 != null; ll42 = ll42.B) {
                a(ll42, i4, i2);
            }
            return;
        }
        b(ll4, i & ll4.y, i2);
    }

    public static final void b(ll4 ll4, int i, int i2) {
        if (i2 != 0 || ll4.K0()) {
            if ((i & 2) != 0 && (ll4 instanceof my3)) {
                su0.B((my3) ll4);
                if (i2 == 2) {
                    rc9.M0(ll4, 2).o1();
                }
            }
            if (!((i & 128) == 0 || i2 == 2)) {
                rc9.O0(ll4).G();
            }
            if (!((4194304 & i) == 0 || i2 == 2)) {
                rc9.O0(ll4).Y(false);
            }
            if ((i & 256) != 0 && (ll4 instanceof aw2)) {
                if (i2 == 1) {
                    uy3 O0 = rc9.O0(ll4);
                    O0.e0(O0.i0 + 1);
                } else if (i2 == 2) {
                    uy3 O02 = rc9.O0(ll4);
                    O02.e0(O02.i0 - 1);
                }
                if (i2 != 2) {
                    uy3 O03 = rc9.O0(ll4);
                    if (O03.i0 != 0 && !O03.p() && !O03.q() && !O03.h0) {
                        je jeVar = (je) xy3.a(O03);
                        hv2 hv2 = jeVar.m0.e;
                        hv2.getClass();
                        if (O03.i0 > 0) {
                            ((eq4) hv2.y).b(O03);
                            O03.h0 = true;
                        }
                        jeVar.F((uy3) null);
                    }
                }
            }
            if ((i & 4) != 0 && (ll4 instanceof gz1)) {
                rc9.e0((gz1) ll4);
            }
            if ((i & 8) != 0 && (ll4 instanceof dk6)) {
                rc9.O0(ll4).M = true;
            }
            if ((i & 64) != 0 && (ll4 instanceof gd5)) {
                yy3 yy3 = rc9.O0((gd5) ll4).b0;
                yy3.p.M = true;
                jd4 jd4 = yy3.q;
                if (jd4 != null) {
                    jd4.S = true;
                }
            }
            if ((i & 2048) == 0 || !(ll4 instanceof e40)) {
                if ((i & 4096) != 0 && (ll4 instanceof ck2)) {
                    ck2 ck2 = (ck2) ll4;
                    gk2 gk2 = ((lk2) ((je) rc9.P0(ck2)).getFocusOwner()).d;
                    if (gk2.d.a(ck2)) {
                        gk2.a();
                    }
                }
                if ((i & 2097152) != 0 && (ll4 instanceof bb3) && i2 == 2) {
                    ((bb3) ll4).h0();
                    return;
                }
                return;
            }
            kl4 kl4 = ((e40) ll4).K;
            yb3.b("applyFocusProperties called on wrong node");
            kl4.getClass();
            ku4.a();
        }
    }

    public static final void c(ll4 ll4) {
        if (!ll4.J) {
            yb3.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(ll4, -1, 0);
    }

    public static final int d(kl4 kl4) {
        int i;
        if (kl4 instanceof ky3) {
            i = 3;
        } else {
            i = 1;
        }
        if (kl4 instanceof fz1) {
            i |= 4;
        }
        if (kl4 instanceof bk6) {
            i |= 8;
        }
        if (kl4 instanceof fd5) {
            i |= 64;
        }
        if (kl4 instanceof vb0) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(ll4 ll4) {
        int i;
        int i2 = ll4.y;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = ll4.getClass();
        hp4 hp4 = a;
        int d = hp4.d(cls);
        if (d >= 0) {
            return hp4.c[d];
        }
        if (ll4 instanceof my3) {
            i = 3;
        } else {
            i = 1;
        }
        if (ll4 instanceof gz1) {
            i |= 4;
        }
        if (ll4 instanceof dk6) {
            i |= 8;
        }
        if (ll4 instanceof tk5) {
            i |= 16;
        }
        if (ll4 instanceof ol4) {
            i |= 32;
        }
        if (ll4 instanceof gd5) {
            i |= 64;
        }
        if (ll4 instanceof by3) {
            i |= 4194432;
        } else if (ll4 instanceof sh4) {
            i |= 128;
        }
        if (ll4 instanceof aw2) {
            i |= 256;
        }
        boolean z = ll4 instanceof vk2;
        if (z) {
            i |= 1024;
        }
        if (ll4 instanceof e40) {
            i |= 2048;
        }
        if (ll4 instanceof ck2) {
            i |= 4096;
        }
        if (ll4 instanceof us3) {
            i |= 8192;
        }
        if (ll4 instanceof xd) {
            i |= 16384;
        }
        if (ll4 instanceof ry0) {
            i |= 32768;
        }
        if (ll4 instanceof ln7) {
            i |= 262144;
        }
        if (ll4 instanceof vb0) {
            i |= 524288;
        }
        if (z) {
            i |= 1048576;
        }
        if (ll4 instanceof bb3) {
            i |= 2097152;
        }
        if (ll4 instanceof b24) {
            i |= 8388608;
        }
        hp4.g(i, cls);
        return i;
    }

    public static final int f(ll4 ll4) {
        if (!(ll4 instanceof wo1)) {
            return e(ll4);
        }
        wo1 wo1 = (wo1) ll4;
        int i = wo1.K;
        for (ll4 ll42 = wo1.L; ll42 != null; ll42 = ll42.B) {
            i |= f(ll42);
        }
        return i;
    }

    public static final boolean g(int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4194304) != 0) {
            z2 = true;
        }
        return z | z2;
    }
}
