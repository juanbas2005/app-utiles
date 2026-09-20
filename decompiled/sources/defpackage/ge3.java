package defpackage;

/* renamed from: ge3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ge3 extends mo5 {
    public static final ge3 c = new mo5(ue3.a);

    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        ee3 ee3 = (ee3) obj;
        ee3.getClass();
        int s = gy0.s(this.b, i);
        ee3.b(ee3.d() + 1);
        int[] iArr = ee3.a;
        int i2 = ee3.b;
        ee3.b = i2 + 1;
        iArr[i2] = s;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ee3, java.lang.Object] */
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new int[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        int[] iArr = (int[]) obj;
        hy0.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.w(i2, iArr[i2], this.b);
        }
    }
}
