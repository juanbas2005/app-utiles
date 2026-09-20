package defpackage;

/* renamed from: kh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kh2 extends mo5 {
    public static final kh2 c = new mo5(oh2.a);

    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        jh2 jh2 = (jh2) obj;
        jh2.getClass();
        float k = gy0.k(this.b, i);
        jh2.b(jh2.d() + 1);
        float[] fArr = jh2.a;
        int i2 = jh2.b;
        jh2.b = i2 + 1;
        fArr[i2] = k;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [jh2, java.lang.Object] */
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ? obj2 = new Object();
        obj2.a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new float[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        float[] fArr = (float[]) obj;
        hy0.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.t(this.b, i2, fArr[i2]);
        }
    }
}
