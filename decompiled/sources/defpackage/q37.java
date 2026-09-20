package defpackage;

import java.util.List;

/* renamed from: q37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q37 {
    public final hq6 a;
    public final List b;

    public q37(hq6 hq6, List list) {
        this.a = hq6;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q37)) {
            return false;
        }
        q37 q37 = (q37) obj;
        if (this.a == q37.a && this.b.equals(q37.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StaticConfig(minSeverity=" + this.a + ", logWriterList=" + this.b + ')';
    }
}
