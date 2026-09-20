package defpackage;

/* renamed from: m42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m42 {
    public final String a;

    public m42(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ku4.j("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m42)) {
            return false;
        }
        return this.a.equals(((m42) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f21.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
