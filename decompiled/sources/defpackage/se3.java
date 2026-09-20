package defpackage;

/* renamed from: se3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class se3 {
    public static final se3 e = new se3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public se3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        int d2 = (d() / 2) + this.a;
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) d2) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3 = (se3) obj;
        if (this.a == se3.a && this.b == se3.b && this.c == se3.c && this.d == se3.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f21.e(this.c, f21.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder p = pb4.p("IntRect.fromLTRB(", this.a, ", ", this.b, ", ");
        p.append(this.c);
        p.append(", ");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
