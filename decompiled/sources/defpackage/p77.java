package defpackage;

import java.util.List;

/* renamed from: p77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p77 {
    public final boolean a;
    public final q43 b;
    public final List c;
    public final long d;

    public p77(boolean z, q43 q43, List list, long j) {
        list.getClass();
        this.a = z;
        this.b = q43;
        this.c = list;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p77)) {
            return false;
        }
        p77 p77 = (p77) obj;
        if (this.a == p77.a && sg3.e(this.b, p77.b) && sg3.e(this.c, p77.c) && u02.d(this.d, p77.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Boolean.hashCode(this.a) * 31;
        q43 q43 = this.b;
        if (q43 == null) {
            i = 0;
        } else {
            i = q43.hashCode();
        }
        int j = hl6.j(this.c, (hashCode + i) * 31, 31);
        xb4 xb4 = u02.x;
        return Long.hashCode(this.d) + j;
    }

    public final String toString() {
        return "SupabaseNetworkConfig(useHTTPS=" + this.a + ", httpEngine=" + this.b + ", httpConfigOverrides=" + this.c + ", requestTimeout=" + u02.k(this.d) + ')';
    }
}
