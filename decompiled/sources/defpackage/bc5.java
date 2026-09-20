package defpackage;

import java.util.List;

/* renamed from: bc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc5 {
    public final String a;
    public final String b;
    public final List c;

    public bc5(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc5)) {
            return false;
        }
        bc5 bc5 = (bc5) obj;
        if (this.a.equals(bc5.a) && this.b.equals(bc5.b) && this.c.equals(bc5.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder o = f21.o("PamarillasEntry(title=", this.a, ", description=", this.b, ", phones=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
