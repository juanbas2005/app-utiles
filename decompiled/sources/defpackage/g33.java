package defpackage;

/* renamed from: g33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g33 extends b33 {
    public boolean A;

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        if (j < 0) {
            h.j(f21.f(j, "byteCount < 0: "));
            return 0;
        } else if (this.y) {
            h.s("closed");
            return 0;
        } else if (this.A) {
            return -1;
        } else {
            long Y = super.Y(j, sc0);
            if (Y != -1) {
                return Y;
            }
            this.A = true;
            a(bz2.x);
            return -1;
        }
    }

    public final void close() {
        if (!this.y) {
            if (!this.A) {
                a(h33.f);
            }
            this.y = true;
        }
    }
}
