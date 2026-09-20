package defpackage;

/* renamed from: yh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yh0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public yh0(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh0)) {
            return false;
        }
        yh0 yh0 = (yh0) obj;
        if (this.a == yh0.a && this.b == yh0.b && this.c == yh0.c && this.d == yh0.d && this.e == yh0.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + f21.e(this.d, f21.e(this.c, f21.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder p = pb4.p("CalendarMonth(year=", this.a, ", month=", this.b, ", numberOfDays=");
        p.append(this.c);
        p.append(", daysFromStartOfWeekToFirstOfMonth=");
        p.append(this.d);
        p.append(", startUtcTimeMillis=");
        return f21.k(p, this.e, ")");
    }
}
