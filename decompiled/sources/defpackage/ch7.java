package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: ch7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ch7 {
    public static final qt0 a;
    public static final qt0 b;
    public static final long c = uq3.d(4278916896L);
    public static final long d = uq3.d(4293127927L);

    static {
        long j = mt0.u;
        long j2 = jt0.c;
        long j3 = mt0.w;
        long j4 = mt0.r;
        long j5 = mt0.o;
        long j6 = mt0.q;
        long j7 = mt0.l;
        long j8 = mt0.d;
        long j9 = mt0.f;
        long j10 = mt0.a;
        long j11 = mt0.F;
        long j12 = mt0.H;
        long j13 = mt0.C;
        long j14 = mt0.k;
        long j15 = mt0.g;
        long j16 = mt0.B;
        long j17 = mt0.x;
        long j18 = j6;
        a = st0.f(j, j2, j3, j4, 0, j5, j2, j18, j7, j8, j2, j9, j10, j14, j15, j14, j15, j16, j17, 0, mt0.h, mt0.j, j11, j2, j12, j13, mt0.y, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133693424, 65535);
        long j19 = j3;
        long j20 = mt0.v;
        long j21 = mt0.s;
        long j22 = mt0.t;
        long j23 = j18;
        long j24 = mt0.p;
        long j25 = mt0.m;
        long j26 = mt0.n;
        long j27 = j15;
        long j28 = j9;
        long j29 = mt0.e;
        long j30 = mt0.b;
        long j31 = mt0.c;
        long j32 = j12;
        long j33 = mt0.G;
        long j34 = mt0.D;
        long j35 = mt0.E;
        long j36 = mt0.i;
        long j37 = j17;
        b = st0.c(j20, j21, j22, j19, 0, j24, j25, j26, j23, j29, j30, j31, j28, j27, j36, j27, j36, j37, mt0.A, 0, j36, j27, j33, j34, j35, j32, mt0.z, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133693424, 65535);
    }

    public static final void a(boolean z, boolean z2, boolean z3, fw0 fw0, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z4;
        fw0 fw02;
        qt0 qt0;
        qt0 qt02;
        zi7 zi7;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        yt2 yt22 = yt2;
        yt22.g0(1039832581);
        if (yt22.h(z5)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.h(z6)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.h(z7)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (yt22.V(i7 & 1, z4)) {
            yt22.a0();
            if ((i & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            if (d18.b() != z5) {
                d18.a.setValue(Boolean.valueOf(z5));
            }
            if (d18.a() != z6) {
                d18.b.setValue(Boolean.valueOf(z6));
            }
            if (z7 || Build.VERSION.SDK_INT < 31) {
                yt22.e0(-1448244761);
                yt22.r(false);
                if (z5) {
                    qt0 = b;
                } else {
                    qt0 = a;
                }
            } else {
                yt22.e0(-1946083486);
                Context context = (Context) yt22.k(ye.b);
                if (z5) {
                    qt0 = ed1.m(context);
                } else {
                    qt0 = ed1.n(context);
                }
                yt22.r(false);
            }
            qt0 qt03 = qt0;
            if (z6) {
                long d2 = uq3.d(4284131291L);
                long d3 = uq3.d(4278460474L);
                long d4 = uq3.d(4279391610L);
                long d5 = uq3.d(4292668147L);
                long j = jt0.b;
                long d6 = uq3.d(4279391610L);
                long d7 = uq3.d(4279242768L);
                long d8 = uq3.d(4288656326L);
                long d9 = uq3.d(4278716424L);
                long d10 = uq3.d(4278979596L);
                long d11 = uq3.d(4279374354L);
                long d12 = uq3.d(4279703319L);
                long d13 = uq3.d(4282006074L);
                long d14 = uq3.d(4280229663L);
                long j2 = d;
                qt02 = qt0.a(qt03, d2, d3, d4, d5, j, j2, j, j2, d7, d8, d6, 0, d13, d14, d10, d11, d12, d9, j, 1945116656, 65520);
            } else if (z5) {
                long d15 = uq3.d(4284131291L);
                long d16 = uq3.d(4278460474L);
                long d17 = uq3.d(4279391610L);
                long d18 = uq3.d(4292668147L);
                long d19 = uq3.d(4279391610L);
                long d20 = uq3.d(4280629322L);
                long d21 = uq3.d(4288656326L);
                long d22 = uq3.d(4278718489L);
                long d23 = uq3.d(4279180584L);
                long d24 = uq3.d(4279378478L);
                long d25 = uq3.d(4279642420L);
                long d26 = uq3.d(4279906365L);
                long d27 = uq3.d(4283724170L);
                long d28 = uq3.d(4281090902L);
                long j3 = c;
                long j4 = d;
                qt02 = qt0.a(qt03, d15, d16, d17, d18, j3, j4, j3, j4, d20, d21, d19, 0, d27, d28, d24, d25, d26, d23, d22, 1945116656, 65520);
            } else {
                long d29 = uq3.d(4279391610L);
                long d30 = uq3.d(4294967295L);
                long d31 = uq3.d(4292668147L);
                long d32 = uq3.d(4278460474L);
                long j5 = mt0.k;
                qt02 = qt0.a(qt03, d29, d30, d31, d32, j5, 0, j5, 0, 0, 0, uq3.d(4279391610L), 0, 0, 0, 0, 0, 0, 0, 0, -565264, 65535);
            }
            xw2 xw2 = new xw2(st0.g(qt02, 2.0f), 3);
            c40 c40 = new c40(2.0f, qt02.p);
            if (z7 || Build.VERSION.SDK_INT < 31) {
                zi7 = new zi7((jt0) null);
            } else {
                zi7 = new zi7(new jt0(qt02.a));
            }
            fw02 = fw0;
            t49.d(new ju5[]{yw2.a.a(xw2), a40.a.a(c40), xi7.a.a(zi7)}, su0.J(1529580229, new dx4(20, qt02, fw02), yt22), yt22, 48);
        } else {
            fw02 = fw0;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new bh7(z5, z6, z7, fw02, i);
        }
    }
}
