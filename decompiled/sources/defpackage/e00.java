package defpackage;

/* renamed from: e00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e00 extends ja1 {
    public final String a;

    public e00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja1)) {
            return false;
        }
        return this.a.equals(((e00) ((ja1) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f21.l(new StringBuilder("Log{content="), this.a, "}");
    }
}
