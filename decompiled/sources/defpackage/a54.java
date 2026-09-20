package defpackage;

/* renamed from: a54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a54 {
    public final g54 a;
    public final String b;
    public final long c;

    public a54(g54 g54, String str, long j) {
        g54.getClass();
        str.getClass();
        this.a = g54;
        this.b = str;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        if (j > 0) {
            return j + 31536000000L;
        }
        return 0;
    }

    public final boolean b() {
        if (this.a != g54.y || c()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        g54 g54 = g54.z;
        g54 g542 = this.a;
        if (g542 == g54) {
            return true;
        }
        if (g542 != g54.y) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = a();
        if (1 > a2 || a2 > currentTimeMillis) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a54)) {
            return false;
        }
        a54 a54 = (a54) obj;
        if (this.a == a54.a && sg3.e(this.b, a54.b) && this.c == a54.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("License(status=");
        sb.append(this.a);
        sb.append(", transferId=");
        sb.append(this.b);
        sb.append(", activatedAt=");
        return f21.k(sb, this.c, ")");
    }
}
