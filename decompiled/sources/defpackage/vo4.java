package defpackage;

import java.util.Arrays;

/* renamed from: vo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vo4 {
    public float[] a;
    public int b;

    public vo4(int i) {
        float[] fArr;
        if (i == 0) {
            fArr = ph2.a;
        } else {
            fArr = new float[i];
        }
        this.a = fArr;
    }

    public static String c(vo4 vo4, int i) {
        String str;
        String str2 = "";
        if ((i & 2) != 0) {
            str = str2;
        } else {
            str = "[";
        }
        if ((i & 4) == 0) {
            str2 = "]";
        }
        vo4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        float[] fArr = vo4.a;
        int i2 = vo4.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(str2);
                break;
            }
            float f = fArr[i3];
            if (i3 == -1) {
                sb.append("...");
                break;
            }
            if (i3 != 0) {
                sb.append(", ");
            }
            sb.append(f);
            i3++;
        }
        return sb.toString();
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        h.l("Index must be between 0 and size");
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (defpackage.vo4) r6;
     */
    public final boolean equals(Object obj) {
        vo4 vo4;
        int i;
        if (!(obj instanceof vo4) || vo4.b != (i = this.b)) {
            return false;
        }
        float[] fArr = this.a;
        float[] fArr2 = vo4.a;
        re3 V = z65.V(0, i);
        int i2 = V.w;
        int i3 = V.x;
        if (i2 > i3) {
            return true;
        }
        while (fArr[i2] == fArr2[i2]) {
            if (i2 == i3) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        return c(this, 25);
    }
}
