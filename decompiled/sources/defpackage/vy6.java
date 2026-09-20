package defpackage;

import java.util.Iterator;

/* renamed from: vy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy6 implements my0, Iterable, ar3 {
    public final gv6 w;
    public final int x;
    public final r36 y;

    public vy6(gv6 gv6, int i, au2 au2, r36 r36) {
        this.w = gv6;
        this.x = i;
        this.y = r36;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vy6)) {
            return false;
        }
        vy6 vy6 = (vy6) obj;
        if (vy6.x == this.x && vy6.w == this.w && vy6.y.equals(this.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.w.hashCode();
        return this.y.hashCode() + ((hashCode + (this.x * 31)) * 31);
    }

    public final Iterator iterator() {
        return new uy6(this.w, this.x, (au2) null, this.y);
    }
}
