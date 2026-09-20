package defpackage;

import java.util.List;

/* renamed from: l44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l44 extends vw3 {
    public final kb4 x;
    public final sr2 y;
    public final ib4 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [ib4, hb4] */
    public l44(kb4 kb4, sr2 sr2) {
        kb4.getClass();
        this.x = kb4;
        this.y = sr2;
        this.z = new hb4(kb4, sr2);
    }

    public final List G() {
        return o0().G();
    }

    public final ro7 J() {
        return o0().J();
    }

    public final wo7 L() {
        return o0().L();
    }

    public final boolean Q() {
        return o0().Q();
    }

    public final ji4 R() {
        return o0().R();
    }

    public final vw3 Y(ax3 ax3) {
        ax3.getClass();
        return new l44(this.x, new p3(ax3, false, this, 22));
    }

    public final du7 n0() {
        vw3 o0 = o0();
        while (o0 instanceof l44) {
            o0 = ((l44) o0).o0();
        }
        o0.getClass();
        return (du7) o0;
    }

    public final vw3 o0() {
        return (vw3) this.z.b();
    }

    public final String toString() {
        ib4 ib4 = this.z;
        if (ib4.y == jb4.w || ib4.y == jb4.x) {
            return "<Not computed yet>";
        }
        return o0().toString();
    }
}
