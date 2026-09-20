package defpackage;

/* renamed from: xs4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xs4 {
    public final bv4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xs4(bv4 bv4, boolean z, boolean z2) {
        if (bv4.a || !z) {
            this.a = bv4;
            this.b = z;
            this.c = z2;
            this.d = z2;
            return;
        }
        h.j(bv4.b().concat(" does not allow nullable values"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xs4.class != obj.getClass()) {
            return false;
        }
        xs4 xs4 = (xs4) obj;
        if (this.b == xs4.b && this.c == xs4.c && this.a.equals(xs4.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b26.a.b(xs4.class).A());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
