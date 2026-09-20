package defpackage;

import java.util.Arrays;

/* renamed from: gt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gt3 implements v02 {
    public final ft3 a;

    public gt3(ft3 ft3) {
        this.a = ft3;
    }

    /* renamed from: f */
    public final t38 a(lo7 lo7) {
        Object[] objArr;
        int[] iArr;
        Object[] objArr2;
        int[] iArr2;
        int i;
        ft3 ft3 = this.a;
        yo4 yo4 = ft3.b;
        xo4 xo4 = new xo4(yo4.e + 2);
        yo4 yo42 = new yo4(yo4.e);
        int[] iArr3 = yo4.b;
        Object[] objArr3 = yo4.c;
        long[] jArr = yo4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            et3 et3 = (et3) objArr3[i6];
                            xo4.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            yo42.i(i7, new s38((ol) lo7.a.y(et3.a), et3.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!yo4.a(0)) {
            int i8 = xo4.b;
            if (i8 >= 0) {
                xo4.b(i8 + 1);
                int[] iArr4 = xo4.a;
                int i9 = xo4.b;
                if (i9 != 0) {
                    qs.J0(1, 0, i9, iArr4, iArr4);
                }
                iArr4[0] = 0;
                xo4.b++;
            } else {
                h.l("Index must be between 0 and size");
                return null;
            }
        }
        if (!yo4.a(ft3.a)) {
            xo4.a(ft3.a);
        }
        int i10 = xo4.b;
        if (i10 != 0) {
            int[] iArr5 = xo4.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new t38(xo4, yo42, ft3.a, j12.c);
    }
}
