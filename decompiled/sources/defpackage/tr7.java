package defpackage;

/* renamed from: tr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tr7 extends mo5 {
    public static final tr7 c = new mo5(ur7.a);

    public final int d(Object obj) {
        return ((rr7) obj).w.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        sr7 sr7 = (sr7) obj;
        sr7.getClass();
        long v = gy0.d(this.b, i).v();
        sr7.b(sr7.d() + 1);
        long[] jArr = sr7.a;
        int i2 = sr7.b;
        sr7.b = i2 + 1;
        jArr[i2] = v;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [sr7, java.lang.Object] */
    public final Object g(Object obj) {
        long[] jArr = ((rr7) obj).w;
        ? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new rr7(new long[0]);
    }

    public final void k(hy0 hy0, Object obj, int i) {
        long[] jArr = ((rr7) obj).w;
        hy0.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.C(this.b, i2).B(jArr[i2]);
        }
    }
}
