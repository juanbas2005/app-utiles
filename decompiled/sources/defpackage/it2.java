package defpackage;

/* renamed from: it2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class it2 {
    public final ht2 a;
    public final int b;

    public it2(ht2 ht2, int i) {
        this.a = ht2;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it2)) {
            return false;
        }
        it2 it2 = (it2) obj;
        if (this.a.equals(it2.a) && this.b == it2.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return f21.j(sb, this.b, ')');
    }
}
