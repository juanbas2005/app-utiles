package defpackage;

/* renamed from: ud2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ud2 {
    public static final float a = 32.0f;
    public static final pa5 b = x91.e(2, 8.0f);

    public static ua0 a(boolean z, long j, long j2, yt2 yt2, int i) {
        if ((i & 4) != 0) {
            j = st0.e(h03.g0, yt2);
        }
        if ((i & 8) != 0) {
            j2 = jt0.f;
        }
        jt0.b(h03.d0, st0.e(h03.c0, yt2));
        int i2 = jt0.h;
        float f = h03.h0;
        if (z) {
            j = j2;
        }
        if (z) {
            f = 0.0f;
        }
        return uq3.a(f, j);
    }

    public static cj6 b(qt0 qt0) {
        qt0 qt02 = qt0;
        cj6 cj6 = qt02.a0;
        if (cj6 != null) {
            return cj6;
        }
        long j = jt0.f;
        long j2 = j;
        cj6 cj62 = new cj6(j, st0.d(qt02, h03.k0), st0.d(qt02, h03.o0), st0.d(qt02, h03.s0), j2, jt0.b(h03.Y, st0.d(qt02, h03.X)), jt0.b(h03.m0, st0.d(qt02, h03.l0)), jt0.b(h03.q0, st0.d(qt02, h03.p0)), st0.d(qt02, h03.e0), jt0.b(h03.b0, st0.d(qt02, h03.a0)), st0.d(qt02, h03.j0), st0.d(qt02, h03.n0), st0.d(qt02, h03.r0));
        qt02.a0 = cj62;
        return cj62;
    }
}
