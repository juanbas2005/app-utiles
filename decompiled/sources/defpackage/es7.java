package defpackage;

/* renamed from: es7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class es7 extends mo5 {
    public static final es7 c = new mo5(fs7.a);

    public final int d(Object obj) {
        return ((cs7) obj).w.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        ds7 ds7 = (ds7) obj;
        ds7.getClass();
        short B = gy0.d(this.b, i).B();
        ds7.b(ds7.d() + 1);
        short[] sArr = ds7.a;
        int i2 = ds7.b;
        ds7.b = i2 + 1;
        sArr[i2] = B;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ds7, java.lang.Object] */
    public final Object g(Object obj) {
        short[] sArr = ((cs7) obj).w;
        ? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new cs7(new short[0]);
    }

    public final void k(hy0 hy0, Object obj, int i) {
        short[] sArr = ((cs7) obj).w;
        hy0.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.C(this.b, i2).i(sArr[i2]);
        }
    }
}
