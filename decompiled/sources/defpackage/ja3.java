package defpackage;

/* renamed from: ja3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ja3 extends bq7 {
    public final qp7[] b;
    public final xp7[] c;
    public final boolean d;

    public ja3(qp7[] qp7Arr, xp7[] xp7Arr, boolean z) {
        qp7Arr.getClass();
        xp7Arr.getClass();
        this.b = qp7Arr;
        this.c = xp7Arr;
        this.d = z;
    }

    public final boolean b() {
        return this.d;
    }

    public final xp7 d(vw3 vw3) {
        qp7 qp7;
        vq0 u = vw3.L().u();
        if (u instanceof qp7) {
            qp7 = (qp7) u;
        } else {
            qp7 = null;
        }
        if (qp7 != null) {
            int index = qp7.getIndex();
            qp7[] qp7Arr = this.b;
            if (index < qp7Arr.length && sg3.e(qp7Arr[index].n(), qp7.n())) {
                return this.c[index];
            }
        }
        return null;
    }

    public final boolean e() {
        if (this.c.length == 0) {
            return true;
        }
        return false;
    }
}
