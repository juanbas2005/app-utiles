package defpackage;

/* renamed from: bw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bw8 implements vu4 {
    public final int a;

    public bw8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bw8) && this.a == ((bw8) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 24);
        sb.append("LicenseDetailKey(index=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
