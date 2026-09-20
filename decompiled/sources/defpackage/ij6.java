package defpackage;

/* renamed from: ij6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ij6 {
    public final p56 a;
    public final int b;
    public final long c;

    public ij6(p56 p56, int i, long j) {
        this.a = p56;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij6)) {
            return false;
        }
        ij6 ij6 = (ij6) obj;
        if (this.a == ij6.a && this.b == ij6.b && this.c == ij6.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + f21.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return f21.k(sb, this.c, ")");
    }
}
