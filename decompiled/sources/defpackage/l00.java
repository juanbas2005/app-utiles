package defpackage;

/* renamed from: l00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l00 extends pa1 {
    public final String a;

    public l00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa1)) {
            return false;
        }
        return this.a.equals(((l00) ((pa1) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f21.l(new StringBuilder("User{identifier="), this.a, "}");
    }
}
