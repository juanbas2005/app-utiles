package defpackage;

/* renamed from: te4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class te4 implements a76 {
    public boolean w = true;
    public boolean x;
    public boolean y;
    public final tp4 z = new tp4();

    public final void a() {
        tp4 tp4 = this.z;
        Object[] objArr = tp4.c;
        long[] jArr = tp4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof lp4) {
                                lp4 lp4 = (lp4) obj;
                                Object[] objArr2 = lp4.a;
                                int i4 = lp4.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        tp4.a();
    }
}
