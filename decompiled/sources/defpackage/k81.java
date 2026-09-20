package defpackage;

/* renamed from: k81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k81 extends c1 {
    public static final g22 y = new g22(25);
    public final String x;

    public k81(String str) {
        super(y);
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k81) && sg3.e(this.x, ((k81) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return hl6.o(new StringBuilder("CoroutineName("), this.x, ')');
    }
}
