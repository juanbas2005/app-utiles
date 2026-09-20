package defpackage;

/* renamed from: uu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uu6 {
    public static final uu6 c;
    public final mp7 a;
    public final mp7 b;

    static {
        cv1 cv1 = cv1.L;
        c = new uu6(cv1, cv1);
    }

    public uu6(mp7 mp7, mp7 mp72) {
        this.a = mp7;
        this.b = mp72;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu6)) {
            return false;
        }
        uu6 uu6 = (uu6) obj;
        if (this.a.equals(uu6.a) && this.b.equals(uu6.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
