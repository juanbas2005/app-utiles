package defpackage;

/* renamed from: ax1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ax1 extends mo5 {
    public static final ax1 c = new mo5(ix1.a);

    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        zw1 zw1 = (zw1) obj;
        zw1.getClass();
        double i2 = gy0.i(this.b, i);
        zw1.b(zw1.d() + 1);
        double[] dArr = zw1.a;
        int i3 = zw1.b;
        zw1.b = i3 + 1;
        dArr[i3] = i2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [zw1, java.lang.Object] */
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ? obj2 = new Object();
        obj2.a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new double[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        double[] dArr = (double[]) obj;
        hy0.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.d(this.b, i2, dArr[i2]);
        }
    }
}
