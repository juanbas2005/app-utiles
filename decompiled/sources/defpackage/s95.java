package defpackage;

import java.lang.reflect.Array;

/* renamed from: s95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class s95 {
    public static final float[][] a;

    static {
        int i;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = 2787;
        a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = gl0.r;
            if (i2 < 2787) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    a[i2][7 - i5] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
