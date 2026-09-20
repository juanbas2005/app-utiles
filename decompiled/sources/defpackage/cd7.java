package defpackage;

/* renamed from: cd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cd7 implements zc7 {
    public final long w;
    public final /* synthetic */ dd7 x;

    public cd7(dd7 dd7, long j) {
        this.x = dd7;
        this.w = j;
    }

    public final yc7 Q() {
        return f55.g(this.x);
    }

    public final long g(dy3 dy3) {
        dy3 dy32 = (dy3) this.x.N.getValue();
        if (dy32 == null) {
            bc3.d("Tried to open context menu before the anchor was placed.");
            ta1.e();
            return 0;
        } else if (!dy32.n()) {
            return 0;
        } else {
            return dy3.N(dy32.w(this.w));
        }
    }

    public final ly5 k(dy3 dy3) {
        return z85.c(g(dy3), 0);
    }
}
