package defpackage;

/* renamed from: ur  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ur implements tr, vr {
    public final float w;
    public final boolean x;
    public final h y;
    public final float z;

    public ur(float f, boolean z2, h hVar) {
        this.w = f;
        this.x = z2;
        this.y = hVar;
        this.z = f;
    }

    public final float a() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        if (lx1.b(this.w, urVar.w) && this.x == urVar.x && sg3.e(this.y, urVar.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = hl6.i(Float.hashCode(this.w) * 31, 31, this.x);
        h hVar = this.y;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.hashCode();
        }
        return i2 + i;
    }

    public final void s0(tp1 tp1, int i, int[] iArr, int[] iArr2) {
        u(tp1, i, iArr, ey3.w, iArr2);
    }

    public final String toString() {
        String str;
        if (this.x) {
            str = "";
        } else {
            str = "Absolute";
        }
        String c = lx1.c(this.w);
        return str + "Arrangement#spacedAligned(" + c + ", " + this.y + ")";
    }

    public final void u(tp1 tp1, int i, int[] iArr, ey3 ey3, int[] iArr2) {
        boolean z2;
        int i2;
        float f;
        if (iArr.length != 0) {
            int r0 = tp1.r0(this.w);
            if (!this.x || ey3 != ey3.x) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int max = Math.max(0, i - iArr[i3]);
                    iArr2[i5] = max;
                    i4 = Math.min(r0, max);
                    i = iArr2[i5] - i4;
                    i3++;
                    i5++;
                }
                i2 = i + i4;
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < length2) {
                    int i10 = iArr[i6];
                    int i11 = i9 + 1;
                    int min = Math.min(i7, i - i10);
                    iArr2[i9] = min;
                    int min2 = Math.min(r0, (i - min) - i10);
                    i6++;
                    int i12 = iArr2[i9] + i10 + min2;
                    i8 = min2;
                    i7 = i12;
                    i9 = i11;
                }
                i2 = i - (i7 - i8);
            }
            if (this.y != null && i2 > 0) {
                float f2 = ((float) i2) / 2.0f;
                if (ey3 == ey3.w) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                int round = Math.round((1.0f + f) * f2);
                if (z2) {
                    round -= i2;
                }
                if (round != 0) {
                    int length3 = iArr2.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        iArr2[i13] = iArr2[i13] + round;
                    }
                }
            }
        }
    }
}
