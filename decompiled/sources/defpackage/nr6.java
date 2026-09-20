package defpackage;

/* renamed from: nr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nr6 implements mw1 {
    public final pr6 w;
    public final long x;
    public final Object y;
    public final kk0 z;

    public nr6(pr6 pr6, long j, Object obj, kk0 kk0) {
        this.w = pr6;
        this.x = j;
        this.y = obj;
        this.z = kk0;
    }

    public final void b() {
        pr6 pr6 = this.w;
        synchronized (pr6) {
            if (this.x >= pr6.p()) {
                Object[] objArr = pr6.D;
                objArr.getClass();
                long j = this.x;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    qr6.b(objArr, j, qr6.a);
                    pr6.j();
                }
            }
        }
    }
}
