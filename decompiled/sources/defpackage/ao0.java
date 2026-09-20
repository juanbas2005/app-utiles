package defpackage;

/* renamed from: ao0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ao0 extends mo5 {
    public static final ao0 c = new mo5(ho0.a);

    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        vn0 vn0 = (vn0) obj;
        vn0.getClass();
        char j = gy0.j(this.b, i);
        vn0.b(vn0.d() + 1);
        char[] cArr = vn0.a;
        int i2 = vn0.b;
        vn0.b = i2 + 1;
        cArr[i2] = j;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [vn0, java.lang.Object] */
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new char[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        char[] cArr = (char[]) obj;
        hy0.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.y(this.b, i2, cArr[i2]);
        }
    }
}
