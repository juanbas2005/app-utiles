package defpackage;

/* renamed from: kc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kc5 {
    public final dh a;
    public final int b;
    public final int c;

    public kc5(dh dhVar, int i, int i2) {
        this.a = dhVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kc5) {
            kc5 kc5 = (kc5) obj;
            if (this.a == kc5.a && this.b == kc5.b && this.c == kc5.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f21.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return hl6.n(sb, this.c, ")");
    }
}
