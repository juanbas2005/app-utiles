package defpackage;

/* renamed from: or7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class or7 extends mo5 {
    public static final or7 c = new mo5(pr7.a);

    public final int d(Object obj) {
        return ((mr7) obj).w.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        nr7 nr7 = (nr7) obj;
        nr7.getClass();
        int o = gy0.d(this.b, i).o();
        nr7.b(nr7.d() + 1);
        int[] iArr = nr7.a;
        int i2 = nr7.b;
        nr7.b = i2 + 1;
        iArr[i2] = o;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [nr7, java.lang.Object] */
    public final Object g(Object obj) {
        int[] iArr = ((mr7) obj).w;
        ? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new mr7(new int[0]);
    }

    public final void k(hy0 hy0, Object obj, int i) {
        int[] iArr = ((mr7) obj).w;
        hy0.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.C(this.b, i2).z(iArr[i2]);
        }
    }
}
