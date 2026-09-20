package defpackage;

/* renamed from: ia0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ia0 extends mo5 {
    public static final ia0 c = new mo5(ja0.a);

    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        ha0 ha0 = (ha0) obj;
        ha0.getClass();
        boolean z = gy0.z(this.b, i);
        ha0.b(ha0.d() + 1);
        boolean[] zArr = ha0.a;
        int i2 = ha0.b;
        ha0.b = i2 + 1;
        zArr[i2] = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ha0, java.lang.Object] */
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ? obj2 = new Object();
        obj2.a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new boolean[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        hy0.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.n(this.b, i2, zArr[i2]);
        }
    }
}
