package defpackage;

/* renamed from: re4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class re4 implements sl5 {
    public oe3 A;
    public final ns8 w;
    public we3 x;
    public ey3 y;
    public we3 z;

    public re4(ns8 ns8) {
        this.w = ns8;
    }

    public final long y(se3 se3, long j, ey3 ey3, long j2) {
        boolean z2;
        oe3 oe3 = this.A;
        if (oe3 != null) {
            we3 we3 = this.x;
            boolean z3 = false;
            if (we3 == null) {
                z2 = false;
            } else {
                z2 = we3.a(we3.a, j);
            }
            if (z2 && this.y == ey3) {
                we3 we32 = this.z;
                if (we32 != null) {
                    z3 = we3.a(we32.a, j2);
                }
                if (z3) {
                    return oe3.a;
                }
            }
        }
        long j3 = j;
        ey3 ey32 = ey3;
        long j4 = j2;
        long y2 = this.w.y(se3, j3, ey32, j4);
        this.x = new we3(j3);
        this.y = ey32;
        this.z = new we3(j4);
        this.A = new oe3(y2);
        return y2;
    }
}
