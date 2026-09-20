package defpackage;

/* renamed from: me7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class me7 {
    public final g80 a;
    public final g80 b;

    public me7() {
        g80 g80 = xb4.K;
        this.a = g80;
        this.b = g80;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me7)) {
            return false;
        }
        me7 me7 = (me7) obj;
        if (sg3.e(this.a, me7.a) && sg3.e(this.b, me7.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + f21.d(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Cutout(isAlwaysMinimized=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ")";
    }
}
