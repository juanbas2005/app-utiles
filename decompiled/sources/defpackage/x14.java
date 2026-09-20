package defpackage;

/* renamed from: x14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x14 {
    public final int a;
    public final int b;

    public x14(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bc3.a("negative start index");
        }
        if (!(i2 >= i ? true : z2)) {
            bc3.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x14)) {
            return false;
        }
        x14 x14 = (x14) obj;
        if (this.a == x14.a && this.b == x14.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pb4.k("Interval(start=", this.a, ", end=", this.b, ")");
    }
}
