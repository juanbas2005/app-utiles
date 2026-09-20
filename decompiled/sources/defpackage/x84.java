package defpackage;

/* renamed from: x84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x84 {
    public final k68 a;
    public final String b;

    public x84(k68 k68, String str) {
        this.a = k68;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        x84 x84 = (x84) obj;
        if (this.a != x84.a || !this.b.equals(x84.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
