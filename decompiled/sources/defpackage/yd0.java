package defpackage;

/* renamed from: yd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yd0 {
    public static final pa5 a = new pa5(24.0f, 8.0f, 24.0f, 8.0f);
    public static final pa5 b = new pa5(16.0f, 8.0f, 24.0f, 8.0f);
    public static final pa5 c = new pa5(12.0f, 8.0f, 12.0f, 8.0f);
    public static final float d = 58.0f;
    public static final float e = 18.0f;
    public static final float f = kl8.b;

    static {
        float f2 = gw8.p;
        float f3 = gw8.q;
        x91.f(12.0f, 8.0f, 16.0f, 8.0f);
    }

    public static xd0 a(long j, long j2, long j3, long j4, yt2 yt2, int i) {
        long j5;
        long j6;
        if ((i & 2) != 0) {
            j2 = jt0.g;
        }
        long j7 = j2;
        if ((i & 4) != 0) {
            j5 = jt0.g;
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            j6 = jt0.g;
        } else {
            j6 = j4;
        }
        return b(((zg4) yt2.k(ch4.b)).a).a(j, j7, j5, j6);
    }

    public static xd0 b(qt0 qt0) {
        xd0 xd0 = qt0.W;
        if (xd0 != null) {
            return xd0;
        }
        xd0 xd02 = new xd0(st0.d(qt0, ie1.C), st0.d(qt0, ie1.I), jt0.b(ie1.E, st0.d(qt0, ie1.D)), jt0.b(ie1.G, st0.d(qt0, ie1.F)));
        qt0.W = xd02;
        return xd02;
    }

    public static xd0 c(qt0 qt0) {
        xd0 xd0 = qt0.X;
        if (xd0 != null) {
            return xd0;
        }
        long j = jt0.f;
        xd0 xd02 = new xd0(j, st0.d(qt0, su0.i), j, jt0.b(su0.h, st0.d(qt0, su0.g)));
        qt0.X = xd02;
        return xd02;
    }

    public static xd0 d(qt0 qt0) {
        xd0 xd0 = qt0.Y;
        if (xd0 != null) {
            return xd0;
        }
        long j = jt0.f;
        xd0 xd02 = new xd0(j, st0.d(qt0, rt0.H), j, jt0.b(pd8.w, st0.d(qt0, pd8.v)));
        qt0.Y = xd02;
        return xd02;
    }

    public static float e() {
        if (((Boolean) rm5.a.getValue()).booleanValue()) {
            return 36.0f;
        }
        return 40.0f;
    }

    public static xd0 f(long j, yt2 yt2) {
        long j2 = jt0.g;
        return c(((zg4) yt2.k(ch4.b)).a).a(j2, j, j2, j2);
    }

    public static xd0 g(long j, yt2 yt2) {
        long j2 = jt0.g;
        return d(((zg4) yt2.k(ch4.b)).a).a(j2, j, j2, j2);
    }
}
