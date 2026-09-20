package defpackage;

/* renamed from: r53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r53 {
    public static final r53 d = new r53(3, 0, "HTTP");
    public static final r53 e = new r53(2, 0, "HTTP");
    public static final r53 f = new r53(1, 1, "HTTP");
    public static final r53 g = new r53(1, 0, "HTTP");
    public static final r53 h = new r53(3, 0, "SPDY");
    public static final r53 i = new r53(1, 0, "QUIC");
    public final String a;
    public final int b;
    public final int c;

    public r53(int i2, int i3, String str) {
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r53)) {
            return false;
        }
        r53 r53 = (r53) obj;
        if (this.a.equals(r53.a) && this.b == r53.b && this.c == r53.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f21.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
