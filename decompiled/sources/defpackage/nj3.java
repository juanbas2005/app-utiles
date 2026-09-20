package defpackage;

/* renamed from: nj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nj3 {
    public static final nj3 d = new nj3(x46.STRICT, 6);
    public final x46 a;
    public final cx3 b;
    public final x46 c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public nj3(x46 x46, int i) {
        this(x46, r4, x46);
        cx3 cx3;
        if ((i & 2) != 0) {
            cx3 = new cx3(1, 0, 0);
        } else {
            cx3 = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj3)) {
            return false;
        }
        nj3 nj3 = (nj3) obj;
        if (this.a == nj3.a && sg3.e(this.b, nj3.b) && this.c == nj3.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        cx3 cx3 = this.b;
        if (cx3 == null) {
            i = 0;
        } else {
            i = cx3.y;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public nj3(x46 x46, cx3 cx3, x46 x462) {
        this.a = x46;
        this.b = cx3;
        this.c = x462;
    }
}
