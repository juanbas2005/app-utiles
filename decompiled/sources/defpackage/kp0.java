package defpackage;

/* renamed from: kp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kp0 implements tr, jk5 {
    public final float w;
    public final float x;
    public final float y;

    public kp0(float f) {
        this.w = f;
        this.x = f;
        this.y = (f + f) / 2.0f;
    }

    public float a() {
        return this.y;
    }

    public long i(float f, float f2) {
        float f3 = f + this.w;
        float f4 = this.x;
        return mh2.a(f3 / f4, (f2 + this.y) / f4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[SYNTHETIC] */
    public void u(tp1 tp1, int i, int[] iArr, ey3 ey3, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length != 0) {
            int r0 = tp1.r0(this.w);
            int r02 = tp1.r0(this.x);
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = iArr[i4];
                int i7 = i5 + 1;
                if (i5 != 0) {
                    if (i5 == 1) {
                        int i8 = iArr[0];
                        if (i8 > 0) {
                            i3 = r0;
                        } else {
                            i3 = r02;
                        }
                        i2 = i8 + i3;
                    } else if (i5 == 2) {
                        i2 = i - i6;
                    }
                    if (ey3 == ey3.w) {
                        i2 = (i - i2) - i6;
                    }
                    iArr2[i5] = i2;
                    i4++;
                    i5 = i7;
                }
                i2 = 0;
                if (ey3 == ey3.w) {
                }
                iArr2[i5] = i2;
                i4++;
                i5 = i7;
            }
        }
    }

    public kp0(float f, float f2, float f3) {
        this.w = f;
        this.x = f2;
        this.y = f3;
    }
}
