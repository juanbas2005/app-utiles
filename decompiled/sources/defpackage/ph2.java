package defpackage;

import java.util.Arrays;

/* renamed from: ph2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ph2 {
    public static final float[] a = new float[0];

    static {
        int i;
        long[] jArr = bg6.a;
        int d = bg6.d(0);
        if (d > 0) {
            i = Math.max(7, bg6.c(d));
        } else {
            i = 0;
        }
        if (i != 0) {
            int i2 = ((i + 15) & -8) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        int i3 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        float[] fArr = new float[i];
    }
}
