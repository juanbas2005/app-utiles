package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sb {
    public final k90 a;
    public final ArrayList b = new ArrayList(5);
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final int[] h;
    public final s66 i;

    public sb(k90 k90, int i2, int i3, int i4, int i5, float f2, s66 s66) {
        this.a = k90;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = f2;
        this.h = new int[3];
        this.i = s66;
    }

    public final boolean a(int[] iArr) {
        float f2 = this.g;
        float f3 = f2 / 2.0f;
        for (int i2 = 0; i2 < 3; i2++) {
            if (Math.abs(f2 - ((float) iArr[i2])) >= f3) {
                return false;
            }
        }
        return true;
    }

    public final rb b(int i2, int i3, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = i4 + i5 + i6;
        float f2 = ((float) (i3 - i6)) - (((float) i5) / 2.0f);
        int i8 = (int) f2;
        int i9 = i5 * 2;
        k90 k90 = this.a;
        int i10 = k90.x;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i11 = i2;
        while (i11 >= 0 && k90.b(i8, i11)) {
            int i12 = iArr2[1];
            if (i12 > i9) {
                break;
            }
            iArr2[1] = i12 + 1;
            i11--;
        }
        float f3 = Float.NaN;
        if (i11 >= 0 && iArr2[1] <= i9) {
            while (i11 >= 0 && !k90.b(i8, i11)) {
                int i13 = iArr2[0];
                if (i13 > i9) {
                    break;
                }
                iArr2[0] = i13 + 1;
                i11--;
            }
            if (iArr2[0] <= i9) {
                int i14 = i2 + 1;
                while (i14 < i10 && k90.b(i8, i14)) {
                    int i15 = iArr2[1];
                    if (i15 > i9) {
                        break;
                    }
                    iArr2[1] = i15 + 1;
                    i14++;
                }
                if (i14 != i10 && iArr2[1] <= i9) {
                    while (i14 < i10 && !k90.b(i8, i14)) {
                        int i16 = iArr2[2];
                        if (i16 > i9) {
                            break;
                        }
                        iArr2[2] = i16 + 1;
                        i14++;
                    }
                    int i17 = iArr2[2];
                    if (i17 <= i9 && Math.abs(((iArr2[0] + iArr2[1]) + i17) - i7) * 5 < i7 * 2 && a(iArr2)) {
                        f3 = ((float) (i14 - iArr2[2])) - (((float) iArr2[1]) / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f3)) {
            return null;
        }
        float f4 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rb rbVar = (rb) it.next();
            float f5 = rbVar.c;
            float f6 = rbVar.a;
            float f7 = rbVar.b;
            if (Math.abs(f3 - f7) <= f4 && Math.abs(f2 - f6) <= f4) {
                float abs = Math.abs(f4 - f5);
                if (abs <= 1.0f || abs <= f5) {
                    return new rb((f6 + f2) / 2.0f, (f7 + f3) / 2.0f, (rbVar.c + f4) / 2.0f);
                }
            }
        }
        rb rbVar2 = new rb(f2, f3, f4);
        arrayList.add(rbVar2);
        s66 s66 = this.i;
        if (s66 == null) {
            return null;
        }
        s66.a(rbVar2);
        return null;
    }
}
