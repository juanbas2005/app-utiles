package defpackage;

/* renamed from: w92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w92 {
    public final Object a;
    public final int b;

    public w92(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w92)) {
            return false;
        }
        w92 w92 = (w92) obj;
        if (this.a == w92.a && this.b == w92.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
