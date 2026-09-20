package defpackage;

/* renamed from: s2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class s2 extends m55 {
    public final int[] a = new int[4];
    public final int[] b;
    public final float[] c;
    public final float[] d;
    public final int[] e;
    public final int[] f;

    public s2() {
        int[] iArr = new int[8];
        this.b = iArr;
        this.c = new float[4];
        this.d = new float[4];
        this.e = new int[(iArr.length / 2)];
        this.f = new int[(iArr.length / 2)];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i = 0;
        float f2 = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f3 = fArr[i2];
            if (f3 < f2) {
                i = i2;
                f2 = f3;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void h(int[] iArr, float[] fArr) {
        int i = 0;
        float f2 = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f3 = fArr[i2];
            if (f3 > f2) {
                i = i2;
                f2 = f3;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean i(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f2 = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f2 >= 0.7916667f && f2 <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }
}
