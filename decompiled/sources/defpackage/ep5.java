package defpackage;

/* renamed from: ep5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ep5 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public ep5(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep5)) {
            return false;
        }
        ep5 ep5 = (ep5) obj;
        if (this.a.equals(ep5.a) && this.b == ep5.b && this.c == ep5.c && this.d == ep5.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f21.e(this.c, f21.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
