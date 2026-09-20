package defpackage;

import java.util.Collection;

/* renamed from: ki3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ki3 {
    public final xc8 a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ki3(xc8 xc8, Collection collection, int i) {
        this(xc8, collection, r7, r8, r9);
        boolean z;
        boolean z2;
        boolean z3;
        if (xc8.a == s15.y) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki3)) {
            return false;
        }
        ki3 ki3 = (ki3) obj;
        if (sg3.e(this.a, ki3.a) && sg3.e(this.b, ki3.b) && this.c == ki3.c && this.d == ki3.d && this.e == ki3.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + hl6.i(hl6.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ", preferQualifierOverBound=" + this.d + ", preferQualifierOverSupertype=" + this.e + ')';
    }

    public ki3(xc8 xc8, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.a = xc8;
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
