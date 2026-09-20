package defpackage;

import java.util.List;

/* renamed from: q05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q05 {
    public final gq0 a;
    public final List b;

    public q05(gq0 gq0, List list) {
        gq0.getClass();
        this.a = gq0;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q05)) {
            return false;
        }
        q05 q05 = (q05) obj;
        if (sg3.e(this.a, q05.a) && this.b.equals(q05.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}
