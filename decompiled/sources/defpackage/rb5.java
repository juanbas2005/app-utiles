package defpackage;

/* renamed from: rb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rb5 {
    public static final qb5 a;
    public static final db5 b;

    static {
        qb5 qb5 = new qb5(0);
        a = qb5;
        b = new db5(0, 0, 0, 0, 0, 0, kw5.L, new p04(2), gl0.E(x32.w), qb5, m31.b(0, 0, 0, 0, 15));
    }

    public static final long a(db5 db5, int i) {
        long i2;
        int i3 = db5.c;
        int i4 = db5.b;
        int i5 = -db5.f;
        int i6 = db5.d;
        long j = (((((long) i) * ((long) (i3 + i4))) + ((long) i5)) + ((long) i6)) - ((long) i3);
        if (db5.e == z75.x) {
            i2 = db5.i() >> 32;
        } else {
            i2 = db5.i() & 4294967295L;
        }
        int i7 = (int) i2;
        long p = j - ((long) (i7 - z65.p(db5.n.f(i7, i4, i5, i6), 0, i7)));
        if (p < 0) {
            return 0;
        }
        return p;
    }

    public static final um1 b(int i, sr2 sr2, yt2 yt2, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        kg5 kg5 = um1.H;
        if ((((i2 & 14) ^ 6) <= 4 || !yt2.e(i)) && (i2 & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        if ((((i2 & 112) ^ 48) <= 32 || !yt2.d(0.0f)) && (i2 & 48) != 32) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z4 = z | z2;
        if ((((i2 & 896) ^ 384) <= 256 || !yt2.g(sr2)) && (i2 & 384) != 256) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object Q = yt2.Q();
        if (z5 || Q == ay0.a) {
            Q = new pb5(i, sr2);
            yt2.o0(Q);
        }
        um1 um1 = (um1) u55.t(objArr, kg5, (sr2) Q, yt2, 0);
        um1.G.setValue(sr2);
        return um1;
    }
}
