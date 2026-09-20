package defpackage;

/* renamed from: z54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z54 extends r58 {
    public final yo4 b = new yo4();

    public z54() {
        yo4 yo4 = ne3.a;
    }

    public final void d() {
        yo4 yo4 = this.b;
        int[] iArr = yo4.b;
        Object[] objArr = yo4.c;
        long[] jArr = yo4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            lp4 lp4 = (lp4) objArr[i4];
                            Object[] objArr2 = lp4.a;
                            int i6 = lp4.b;
                            for (int i7 = 0; i7 < i6; i7++) {
                                y54 y54 = (y54) objArr2[i7];
                                mk0 mk0 = y54.d;
                                if (mk0 != null) {
                                    mk0.cancel();
                                }
                                y54.d = null;
                                te4 te4 = (te4) y54.a.x;
                                te4.x = true;
                                te4.w = false;
                                te4.a();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
