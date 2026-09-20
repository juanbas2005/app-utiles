package defpackage;

/* renamed from: jd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jd3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jd3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jd3) r5;
     */
    public final boolean equals(Object obj) {
        jd3 jd3;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jd3) && this.a == jd3.a && this.b == jd3.b && this.c == jd3.c && this.d == jd3.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder p = pb4.p("InsetsValues(left=", this.a, ", top=", this.b, ", right=");
        p.append(this.c);
        p.append(", bottom=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
