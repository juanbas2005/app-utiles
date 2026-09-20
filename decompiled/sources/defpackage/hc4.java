package defpackage;

/* renamed from: hc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hc4 extends mo5 {
    public static final hc4 c = new mo5(tc4.a);

    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        gc4 gc4 = (gc4) obj;
        gc4.getClass();
        long D = gy0.D(this.b, i);
        gc4.b(gc4.d() + 1);
        long[] jArr = gc4.a;
        int i2 = gc4.b;
        gc4.b = i2 + 1;
        jArr[i2] = D;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [gc4, java.lang.Object] */
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new long[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        long[] jArr = (long[]) obj;
        hy0.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.j(this.b, i2, jArr[i2]);
        }
    }
}
