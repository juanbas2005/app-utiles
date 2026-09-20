package defpackage;

import java.util.List;

/* renamed from: mu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mu6 implements eg6 {
    public final Object a;
    public final cu4 b;
    public final List c;
    public final List d;
    public final fw0 e = new fw0(-322904035, new ph6(5, this), true);

    public mu6(Object obj, cu4 cu4, List list) {
        this.a = obj;
        this.b = cu4;
        this.c = list;
        this.d = sg3.D(cu4);
    }

    public final List b() {
        return this.c;
    }

    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mu6.class != obj.getClass()) {
            return false;
        }
        mu6 mu6 = (mu6) obj;
        if (!sg3.e(this.a, mu6.a) || !sg3.e(this.b, mu6.b) || !this.c.equals(mu6.c) || !sg3.e(this.d, mu6.d)) {
            return false;
        }
        return true;
    }

    public final fw0 getContent() {
        return this.e;
    }

    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + hashCode;
    }

    public final String toString() {
        return "SinglePaneScene(key=" + this.a + ", entry=" + this.b + ", previousEntries=" + this.c + ", entries=" + this.d + ')';
    }
}
