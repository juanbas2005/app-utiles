package defpackage;

/* renamed from: h63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h63 {
    public final fp7 a;
    public final Object b;

    public h63(fp7 fp7, Object obj) {
        fp7.getClass();
        obj.getClass();
        this.a = fp7;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63 = (h63) obj;
        if (sg3.e(this.a, h63.a) && sg3.e(this.b, h63.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.b + ')';
    }
}
