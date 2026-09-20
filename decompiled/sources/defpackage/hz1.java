package defpackage;

/* renamed from: hz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface hz1 extends tp1 {
    static void F(wy3 wy3, hg hgVar, long j, float f, lt0 lt0, int i) {
        int i2;
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        tk0 tk0 = wy3.w;
        tk0.w.c.m(hgVar, j, tk0.c((kc0) null, rd2.a, f2, lt0, i3, 1));
    }

    static /* synthetic */ void F0(hz1 hz1, kc0 kc0, long j, long j2, long j3, float f, iz1 iz1, lt0 lt0, int i) {
        long j4;
        long j5;
        float f2;
        rd2 rd2;
        lt0 lt02;
        int i2;
        int i3 = i;
        if ((i3 & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i3 & 4) != 0) {
            j5 = T(hz1.e(), j4);
        } else {
            j5 = j2;
        }
        if ((i3 & 16) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i3 & 32) != 0) {
            rd2 = rd2.a;
        } else {
            rd2 = iz1;
        }
        if ((i3 & 64) != 0) {
            lt02 = null;
        } else {
            lt02 = lt0;
        }
        if ((i3 & 128) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hz1.z0(kc0, j4, j5, j3, f2, rd2, lt02, i2);
    }

    static void G(hz1 hz1, hg hgVar, long j, long j2, float f, lt0 lt0, int i, int i2) {
        long j3;
        float f2;
        int i3;
        int i4 = i2;
        if ((i4 & 16) != 0) {
            j3 = j;
        } else {
            j3 = j2;
        }
        if ((i4 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i4 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        hz1.t0(hgVar, 0, j, j3, f2, lt0, i3);
    }

    static long T(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [rd2] */
    /* JADX WARNING: Multi-variable type inference failed */
    static /* synthetic */ void U(hz1 hz1, eh ehVar, kc0 kc0, float f, l57 l57, lt0 lt0, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        l57 l572 = l57;
        if ((i & 8) != 0) {
            l572 = rd2.a;
        }
        l57 l573 = l572;
        if ((i & 16) != 0) {
            lt0 = null;
        }
        lt0 lt02 = lt0;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hz1.s(ehVar, kc0, f2, l573, lt02, i2);
    }

    static /* synthetic */ void f0(hz1 hz1, long j, long j2, long j3, float f, int i) {
        long j4;
        float f2;
        int i2;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j4 = T(hz1.e(), j5);
        } else {
            j4 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hz1.E0(j, j5, j4, f2, i2);
    }

    static /* synthetic */ void k0(hz1 hz1, long j, float f, long j2, iz1 iz1, int i) {
        if ((i & 4) != 0) {
            j2 = hz1.v0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            iz1 = rd2.a;
        }
        hz1.K(j, f, j3, iz1);
    }

    static /* synthetic */ void q(hz1 hz1, kc0 kc0, long j, long j2, float f, iz1 iz1, lt0 lt0, int i) {
        long j3;
        float f2;
        rd2 rd2;
        lt0 lt02;
        int i2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j3 = T(hz1.e(), j4);
        } else {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            rd2 = rd2.a;
        } else {
            rd2 = iz1;
        }
        if ((i & 32) != 0) {
            lt02 = null;
        } else {
            lt02 = lt0;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hz1.H0(kc0, j4, j3, f2, rd2, lt02, i2);
    }

    static /* synthetic */ void q0(hz1 hz1, long j, long j2, long j3, float f, int i, int i2) {
        int i3;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        hz1.C(j, j2, j3, f, i3);
    }

    static /* synthetic */ void t(hz1 hz1, l97 l97, float f, long j, long j2, l57 l57, int i) {
        float f2;
        if ((i & 64) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.22f;
        }
        hz1.I0(l97, f, j, j2, f2, l57);
    }

    static /* synthetic */ void y0(hz1 hz1, long j, long j2, long j3, long j4, iz1 iz1, int i) {
        long j5;
        if ((i & 2) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        hz1.c0(j, j5, j3, j4, iz1);
    }

    void C(long j, long j2, long j3, float f, int i);

    void E0(long j, long j2, long j3, float f, int i);

    void H0(kc0 kc0, long j, long j2, float f, iz1 iz1, lt0 lt0, int i);

    void I0(l97 l97, float f, long j, long j2, float f2, l57 l57);

    void K(long j, float f, long j2, iz1 iz1);

    void c0(long j, long j2, long j3, long j4, iz1 iz1);

    long e() {
        return j0().L();
    }

    ey3 getLayoutDirection();

    void i(long j, float f, float f2, long j2, long j3, l57 l57);

    wr0 j0();

    void o0(cx2 cx2, long j, vr2 vr2) {
        cx2 cx22 = cx2;
        cx22.e(this, getLayoutDirection(), j, new lh(8, this, vr2));
    }

    void s(eh ehVar, kc0 kc0, float f, iz1 iz1, lt0 lt0, int i);

    void t0(hg hgVar, long j, long j2, long j3, float f, lt0 lt0, int i);

    long v0() {
        return fb5.k(j0().L());
    }

    void w0(eh ehVar, long j, iz1 iz1);

    void z0(kc0 kc0, long j, long j2, long j3, float f, iz1 iz1, lt0 lt0, int i);
}
