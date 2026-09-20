package defpackage;

/* renamed from: rh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rh5 {
    public final jh5 a;
    public final int b;
    public final String c;
    public final String d;

    public rh5(jh5 jh5, int i, String str, String str2) {
        jh5.getClass();
        this.a = jh5;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh5)) {
            return false;
        }
        rh5 rh5 = (rh5) obj;
        if (this.a == rh5.a && this.b == rh5.b && this.c.equals(rh5.c) && this.d.equals(rh5.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl6.h(f21.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlanStatRow(category=");
        sb.append(this.a);
        sb.append(", purchases=");
        sb.append(this.b);
        sb.append(", totalAmount=");
        return pb4.n(sb, this.c, ", totalPaid=", this.d, ")");
    }
}
