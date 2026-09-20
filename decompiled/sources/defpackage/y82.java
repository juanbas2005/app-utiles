package defpackage;

import java.util.Objects;

/* renamed from: y82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y82 {
    public final fe1 a;
    public final fe1 b;
    public final ee2 c;

    public y82(fe1 fe1, fe1 fe12, ee2 ee2) {
        this.a = fe1;
        this.b = fe12;
        this.c = ee2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y82)) {
            return false;
        }
        y82 y82 = (y82) obj;
        if (!this.a.equals(y82.a) || !Objects.equals(this.b, y82.b) || !this.c.equals(y82.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (this.a.hashCode() ^ Objects.hashCode(this.b));
    }

    public final String toString() {
        return "[ " + this.a + " , " + this.b + " : " + Integer.valueOf(this.c.a) + " ]";
    }
}
