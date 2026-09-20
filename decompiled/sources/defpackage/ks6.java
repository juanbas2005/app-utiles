package defpackage;

/* renamed from: ks6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ks6 extends mo5 {
    public static final ks6 c = new mo5(ns6.a);

    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        js6 js6 = (js6) obj;
        js6.getClass();
        short p = gy0.p(this.b, i);
        js6.b(js6.d() + 1);
        short[] sArr = js6.a;
        int i2 = js6.b;
        js6.b = i2 + 1;
        sArr[i2] = p;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, js6] */
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new short[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        short[] sArr = (short[]) obj;
        hy0.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.v(this.b, i2, sArr[i2]);
        }
    }
}
