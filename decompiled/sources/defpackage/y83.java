package defpackage;

/* renamed from: y83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y83 {
    public final x83 a;
    public final int b;

    public y83(int i, x83 x83) {
        this.a = x83;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y83)) {
            return false;
        }
        y83 y83 = (y83) obj;
        if (this.a.equals(y83.a) && this.b == y83.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
