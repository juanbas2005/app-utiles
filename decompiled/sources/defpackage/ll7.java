package defpackage;

/* renamed from: ll7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ll7 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public ll7(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
        this.g = d8;
        if (Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d2)) {
            h.q("Parameters cannot be NaN");
            throw null;
        } else if (d2 != -2.0d && d2 != -3.0d) {
            if (d6 < 0.0d || d6 > 1.0d) {
                throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d6);
            } else if (d6 == 0.0d && (d3 == 0.0d || d2 == 0.0d)) {
                h.q("Parameter a or g is zero, the transfer function is constant");
                throw null;
            } else if (d6 >= 1.0d && d5 == 0.0d) {
                h.q("Parameter c is zero, the transfer function is constant");
                throw null;
            } else if ((d3 == 0.0d || d2 == 0.0d) && d5 == 0.0d) {
                h.q("Parameter a or g is zero, and c is zero, the transfer function is constant");
                throw null;
            } else if (d5 < 0.0d) {
                h.q("The transfer function must be increasing");
                throw null;
            } else if (d3 < 0.0d || d2 < 0.0d) {
                h.q("The transfer function must be positive or increasing");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll7)) {
            return false;
        }
        ll7 ll7 = (ll7) obj;
        if (Double.compare(this.a, ll7.a) == 0 && Double.compare(this.b, ll7.b) == 0 && Double.compare(this.c, ll7.c) == 0 && Double.compare(this.d, ll7.d) == 0 && Double.compare(this.e, ll7.e) == 0 && Double.compare(this.f, ll7.f) == 0 && Double.compare(this.g, ll7.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.b);
        int hashCode2 = Double.hashCode(this.c);
        int hashCode3 = Double.hashCode(this.d);
        int hashCode4 = Double.hashCode(this.e);
        int hashCode5 = Double.hashCode(this.f);
        return Double.hashCode(this.g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ")";
    }

    public /* synthetic */ ll7(double d2, double d3, double d4, double d5, double d6) {
        this(d2, d3, d4, d5, d6, 0.0d, 0.0d);
    }
}
