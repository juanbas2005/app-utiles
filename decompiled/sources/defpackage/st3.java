package defpackage;

/* renamed from: st3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class st3 extends xt3 {
    public final double a;

    public st3(double d) {
        this.a = d;
    }

    public final Object a() {
        return Double.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof st3) && Double.compare(this.a, ((st3) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
