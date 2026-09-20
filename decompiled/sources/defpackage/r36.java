package defpackage;

/* renamed from: r36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r36 extends h75 {
    public final h75 i;
    public final int j;

    public r36(h75 h75, int i2) {
        this.i = h75;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r36)) {
            return false;
        }
        r36 r36 = (r36) obj;
        if (!r36.i.equals(this.i) || r36.j != this.j) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.j * 31);
    }
}
