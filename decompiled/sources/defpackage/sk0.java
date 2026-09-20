package defpackage;

/* renamed from: sk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sk0 {
    public tp1 a;
    public ey3 b;
    public qk0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk0)) {
            return false;
        }
        sk0 sk0 = (sk0) obj;
        if (sg3.e(this.a, sk0.a) && this.b == sk0.b && sg3.e(this.c, sk0.c) && wu6.a(this.d, sk0.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Long.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        tp1 tp1 = this.a;
        ey3 ey3 = this.b;
        qk0 qk0 = this.c;
        String f = wu6.f(this.d);
        return "DrawParams(density=" + tp1 + ", layoutDirection=" + ey3 + ", canvas=" + qk0 + ", size=" + f + ")";
    }
}
