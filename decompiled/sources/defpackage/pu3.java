package defpackage;

/* renamed from: pu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pu3 {
    public uu3 a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu3)) {
            return false;
        }
        pu3 pu3 = (pu3) obj;
        if (this.a.equals(pu3.a) && sg3.e(this.b, pu3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.a);
        sb.append(", typeFlexibilityId=");
        return hl6.o(sb, this.b, ')');
    }
}
