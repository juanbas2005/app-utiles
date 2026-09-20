package defpackage;

/* renamed from: b54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b54 {
    public final int a;
    public final int b;
    public final int c;
    public final mv1 d;
    public final String e;

    public b54(int i, int i2, int i3, mv1 mv1, String str) {
        mv1.getClass();
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = mv1;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b54)) {
            return false;
        }
        b54 b54 = (b54) obj;
        if (this.a == b54.a && this.b == b54.b && this.c == b54.c && this.d == b54.d && sg3.e(this.e, b54.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e2 = f21.e(this.c, f21.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        return this.e.hashCode() + ((this.d.hashCode() + e2) * 31);
    }

    public final String toString() {
        StringBuilder p = pb4.p("LicensePricing(transferAmount=", this.a, ", saldoAmount=", this.b, ", discountPercent=");
        p.append(this.c);
        p.append(", discountSource=");
        p.append(this.d);
        p.append(", couponCode=");
        return f21.l(p, this.e, ")");
    }
}
