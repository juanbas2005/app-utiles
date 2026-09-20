package defpackage;

/* renamed from: ir7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ir7 extends mo5 {
    public static final ir7 c = new mo5(jr7.a);

    public final int d(Object obj) {
        return ((gr7) obj).w.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        hr7 hr7 = (hr7) obj;
        hr7.getClass();
        byte A = gy0.d(this.b, i).A();
        hr7.b(hr7.d() + 1);
        byte[] bArr = hr7.a;
        int i2 = hr7.b;
        hr7.b = i2 + 1;
        bArr[i2] = A;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, hr7] */
    public final Object g(Object obj) {
        byte[] bArr = ((gr7) obj).w;
        ? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new gr7(new byte[0]);
    }

    public final void k(hy0 hy0, Object obj, int i) {
        byte[] bArr = ((gr7) obj).w;
        hy0.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.C(this.b, i2).k(bArr[i2]);
        }
    }
}
