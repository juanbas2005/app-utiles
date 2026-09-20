package defpackage;

/* renamed from: gi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gi6 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ oi6 x;

    public /* synthetic */ gi6(oi6 oi6, int i) {
        this.w = i;
        this.x = oi6;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        oi6 oi6 = this.x;
        long longValue = ((Long) obj).longValue();
        switch (i) {
            case b85.b:
                oi6.I = longValue;
                return vs7;
            default:
                oi6.I = longValue;
                long D = dh4.D(((double) (longValue - oi6.I)) / ((double) oi6.M));
                lp4 lp4 = oi6.J;
                if (lp4.i()) {
                    Object[] objArr = lp4.a;
                    int i2 = lp4.b;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        hi6 hi6 = (hi6) objArr[i4];
                        oi6.k1(hi6, D);
                        hi6.c = true;
                    }
                    mm7 mm7 = oi6.A;
                    if (mm7 != null) {
                        mm7.p();
                    }
                    int i5 = lp4.b;
                    Object[] objArr2 = lp4.a;
                    re3 V = z65.V(0, i5);
                    int i6 = V.w;
                    int i7 = V.x;
                    if (i6 <= i7) {
                        while (true) {
                            objArr2[i6 - i3] = objArr2[i6];
                            if (((hi6) objArr2[i6]).c) {
                                i3++;
                            }
                            if (i6 != i7) {
                                i6++;
                            }
                        }
                    }
                    qs.S0(i5 - i3, i5, (Object) null, objArr2);
                    lp4.b -= i3;
                }
                hi6 hi62 = oi6.K;
                if (hi62 != null) {
                    hi62.g = oi6.B;
                    oi6.k1(hi62, D);
                    oi6.n1(hi62.d);
                    if (hi62.d == 1.0f) {
                        oi6.K = null;
                    }
                    oi6.m1();
                }
                return vs7;
        }
    }
}
