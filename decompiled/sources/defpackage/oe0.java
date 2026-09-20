package defpackage;

/* renamed from: oe0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oe0 extends mo5 {
    public static final oe0 c = new mo5(sf0.a);

    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    public final void f(gy0 gy0, int i, Object obj) {
        je0 je0 = (je0) obj;
        je0.getClass();
        byte m = gy0.m(this.b, i);
        je0.b(je0.d() + 1);
        byte[] bArr = je0.a;
        int i2 = je0.b;
        je0.b = i2 + 1;
        bArr[i2] = m;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [je0, java.lang.Object] */
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    public final Object j() {
        return new byte[0];
    }

    public final void k(hy0 hy0, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        hy0.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            hy0.q(this.b, i2, bArr[i2]);
        }
    }
}
