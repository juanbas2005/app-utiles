package defpackage;

/* renamed from: kf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kf {
    public static final float a = ((25.0f * 2.0f) / 2.4142137f);

    public static final void a(x35 x35, ml4 ml4, long j, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        yt2.g0(1776202187);
        if (yt2.g(x35)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (yt2.g(ml4)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 128;
        boolean z2 = true;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                i4 = i6 & -897;
                j = 9205357640488583168L;
            } else {
                yt2.Y();
                i4 = i6 & -897;
            }
            yt2.s();
            int i7 = i4 & 14;
            if (i7 != 4) {
                z2 = false;
            }
            Object Q = yt2.Q();
            if (z2 || Q == ay0.a) {
                Q = new gg0(5, (Object) x35);
                yt2.o0(Q);
            }
            r16.k(x35, xb4.z, su0.J(-1653527038, new ef(j, ck6.a(ml4, false, (vr2) Q)), yt2), yt2, i7 | 432);
        } else {
            yt2.Y();
        }
        long j2 = j;
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ff(x35, ml4, j2, i);
        }
    }

    public static final void b(ml4 ml4, yt2 yt2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        yt2.g0(694251107);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            if (yt2.g(ml4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            if (i5 != 0) {
                ml4 = jl4.w;
            }
            k75.a(yt2, pv8.y(yu6.m(ml4, a, 25.0f), new hf(((ng7) yt2.k(og7.a)).a, 0)));
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new gf(ml4, i, i2);
        }
    }
}
