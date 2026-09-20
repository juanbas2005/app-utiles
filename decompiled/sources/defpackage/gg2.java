package defpackage;

import java.io.IOException;

/* renamed from: gg2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg2 extends sp2 {
    public final long x;
    public final boolean y;
    public long z;

    public gg2(oy6 oy6, long j, boolean z2) {
        super(oy6);
        this.x = j;
        this.y = z2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [sc0, java.lang.Object] */
    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        long j2 = this.z;
        long j3 = this.x;
        if (j2 > j3) {
            j = 0;
        } else if (this.y) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1;
            }
            j = Math.min(j, j4);
        }
        long Y = this.w.Y(j, sc0);
        int i = (Y > -1 ? 1 : (Y == -1 ? 0 : -1));
        if (i != 0) {
            this.z += Y;
        }
        long j5 = this.z;
        int i2 = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
        if ((i2 >= 0 || i != 0) && i2 <= 0) {
            return Y;
        }
        if (Y > 0 && i2 > 0) {
            ? obj = new Object();
            obj.t(sc0);
            sc0.g0(sc0.x - (j5 - j3), obj);
            obj.a();
        }
        StringBuilder q = hl6.q(j3, "expected ", " bytes but got ");
        q.append(this.z);
        throw new IOException(q.toString());
    }
}
