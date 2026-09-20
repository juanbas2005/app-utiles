package defpackage;

import java.util.ArrayList;

/* renamed from: z82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z82 {
    public final ArrayList a;
    public final int b;

    public z82(int i, ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z82) && this.a.equals(((z82) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return "{ " + this.a + " }";
    }
}
