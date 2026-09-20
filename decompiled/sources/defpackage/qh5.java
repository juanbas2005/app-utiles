package defpackage;

/* renamed from: qh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh5 {
    public final jh5 a;
    public final String b;
    public final double c;
    public final double d;
    public final long e;

    public qh5(jh5 jh5, String str, double d2, double d3, long j) {
        this.a = jh5;
        this.b = str;
        this.c = d2;
        this.d = d3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh5)) {
            return false;
        }
        qh5 qh5 = (qh5) obj;
        if (this.a == qh5.a && this.b.equals(qh5.b) && Double.compare(this.c, qh5.c) == 0 && Double.compare(this.d, qh5.d) == 0 && this.e == qh5.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int h = hl6.h(this.a.hashCode() * 31, 31, this.b);
        int hashCode = Double.hashCode(this.d);
        return Long.hashCode(this.e) + ((hashCode + ((Double.hashCode(this.c) + h) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlanPurchase(category=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", amount=");
        sb.append(this.c);
        sb.append(", paid=");
        sb.append(this.d);
        sb.append(", dateMillis=");
        return f21.k(sb, this.e, ")");
    }
}
