package defpackage;

/* renamed from: th0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class th0 implements Comparable {
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    public th0(int i, int i2, int i3, long j) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = j;
    }

    public final int compareTo(Object obj) {
        return sg3.l(this.z, ((th0) obj).z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th0)) {
            return false;
        }
        th0 th0 = (th0) obj;
        if (this.w == th0.w && this.x == th0.x && this.y == th0.y && this.z == th0.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.z) + f21.e(this.y, f21.e(this.x, Integer.hashCode(this.w) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder p = pb4.p("CalendarDate(year=", this.w, ", month=", this.x, ", dayOfMonth=");
        p.append(this.y);
        p.append(", utcTimeMillis=");
        p.append(this.z);
        p.append(")");
        return p.toString();
    }
}
