package defpackage;

import java.util.ArrayList;

/* renamed from: pn2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn2 {
    public final ArrayList a;
    public final boolean b;

    public pn2(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn2)) {
            return false;
        }
        pn2 pn2 = (pn2) obj;
        if (this.a.equals(pn2.a) && this.b == pn2.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ForumPostPage(posts=" + this.a + ", hasMore=" + this.b + ")";
    }
}
