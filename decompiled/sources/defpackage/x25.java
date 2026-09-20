package defpackage;

/* renamed from: x25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x25 {
    public final int a;
    public final Integer b;

    public x25(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x25)) {
            return false;
        }
        x25 x25 = (x25) obj;
        if (this.a == x25.a && sg3.e(this.b, x25.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ")";
    }
}
