package defpackage;

/* renamed from: wr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wr {
    public static final rr a = new rr(3);
    public static final rr b = new rr(2);
    public static final sr c = new sr(1);
    public static final sr d = new sr(0);
    public static final pe2 e = new pe2(20);
    public static final d63 f = new d63(20);
    public static final hz2 g = new hz2(20);

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = ((float) (i - i3)) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += (float) i7;
            } else {
                return;
            }
        }
    }

    public static void b(int i, int[] iArr, int[] iArr2, boolean z) {
        float f2;
        if (iArr.length != 0) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            float max = ((float) (i - i3)) / ((float) Math.max(iArr.length - 1, 1));
            if (!z || iArr.length != 1) {
                f2 = 0.0f;
            } else {
                f2 = max;
            }
            if (!z) {
                int length = iArr.length;
                int i5 = 0;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    iArr2[i5] = Math.round(f2);
                    f2 += ((float) i6) + max;
                    i2++;
                    i5++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += ((float) i7) + max;
            }
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = ((float) (i - i3)) / ((float) (iArr.length + 1));
        if (!z) {
            int length2 = iArr.length;
            float f2 = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        float f3 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += ((float) i7) + length;
        }
    }
}
