package defpackage;

/* renamed from: wl2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wl2 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile cz6 b = new cz6(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e(115, new xl2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e(130, new xl2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e(150, new xl2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e(180, new xl2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e(200, new xl2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((((float) b.d(0)) / 100.0f) - 0.01f <= 1.03f) {
            ac3.b("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static vl2 a(float f) {
        vl2 vl2;
        float f2;
        float f3;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        vl2 vl22 = (vl2) b.c(i);
        if (vl22 != null) {
            return vl22;
        }
        cz6 cz6 = b;
        if (cz6.w) {
            rg3.e(cz6);
        }
        int q = ie1.q(cz6.z, i, cz6.x);
        if (q >= 0) {
            return (vl2) b.g(q);
        }
        int i2 = -(q + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f()) {
            xl2 xl2 = new xl2(new float[]{1.0f}, new float[]{f});
            b(f, xl2);
            return xl2;
        }
        if (i3 < 0) {
            vl2 = new xl2(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = ((float) b.d(i3)) / 100.0f;
            vl2 = (vl2) b.g(i3);
        }
        float d = ((float) b.d(i2)) / 100.0f;
        if (f2 == d) {
            f3 = 0.0f;
        } else {
            f3 = (f - f2) / (d - f2);
        }
        float max = (Math.max(0.0f, Math.min(1.0f, f3)) * 1.0f) + 0.0f;
        vl2 vl23 = (vl2) b.g(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float b2 = vl2.b(f4);
            fArr2[i4] = ((vl23.b(f4) - b2) * max) + b2;
        }
        xl2 xl22 = new xl2(fArr, fArr2);
        b(f, xl22);
        return xl22;
    }

    public static void b(float f, xl2 xl2) {
        synchronized (c) {
            cz6 b2 = b.clone();
            b2.e((int) (f * 100.0f), xl2);
            b = b2;
        }
    }
}
