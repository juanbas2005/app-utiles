package defpackage;

/* renamed from: dv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dv6 {
    public final vr2 a;
    public final je2 b;

    public dv6(je2 je2, vr2 vr2) {
        this.a = vr2;
        this.b = je2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv6)) {
            return false;
        }
        dv6 dv6 = (dv6) obj;
        if (this.a.equals(dv6.a) && sg3.e(this.b, dv6.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
