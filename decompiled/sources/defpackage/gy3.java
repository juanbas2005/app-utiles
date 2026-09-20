package defpackage;

/* renamed from: gy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gy3 {
    public final int a;
    public final int b;
    public final boolean c;

    public gy3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy3)) {
            return false;
        }
        gy3 gy3 = (gy3) obj;
        if (this.a == gy3.a && this.b == gy3.b && this.c == gy3.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f21.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder p = pb4.p("BidiRun(start=", this.a, ", end=", this.b, ", isRtl=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
