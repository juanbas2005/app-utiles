package defpackage;

/* renamed from: ke1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ke1 {
    public final je1 a;
    public final je1 b;
    public final double c;

    public ke1(je1 je1, je1 je12, double d) {
        this.a = je1;
        this.b = je12;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke1)) {
            return false;
        }
        ke1 ke1 = (ke1) obj;
        if (this.a == ke1.a && this.b == ke1.b && Double.compare(this.c, ke1.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Double.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
