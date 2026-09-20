package defpackage;

/* renamed from: an4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class an4 {
    public final long a;
    public final long b;
    public final boolean c;

    public an4(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final an4 a(an4 an4) {
        return new an4(l35.e(this.a, an4.a), Math.max(this.b, an4.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an4)) {
            return false;
        }
        an4 an4 = (an4) obj;
        if (l35.b(this.a, an4.a) && this.b == an4.b && this.c == an4.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + pb4.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String g = l35.g(this.a);
        return "MouseWheelScrollDelta(value=" + g + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
