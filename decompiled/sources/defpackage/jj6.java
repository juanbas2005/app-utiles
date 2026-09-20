package defpackage;

/* renamed from: jj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jj6 {
    public final ij6 a;
    public final ij6 b;
    public final boolean c;

    public jj6(ij6 ij6, ij6 ij62, boolean z) {
        this.a = ij6;
        this.b = ij62;
        this.c = z;
    }

    public static jj6 a(jj6 jj6, ij6 ij6, ij6 ij62, boolean z, int i) {
        if ((i & 1) != 0) {
            ij6 = jj6.a;
        }
        if ((i & 2) != 0) {
            ij62 = jj6.b;
        }
        jj6.getClass();
        return new jj6(ij6, ij62, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj6)) {
            return false;
        }
        jj6 jj6 = (jj6) obj;
        if (sg3.e(this.a, jj6.a) && sg3.e(this.b, jj6.b) && this.c == jj6.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}
