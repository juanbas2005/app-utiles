package defpackage;

/* renamed from: h48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h48 {
    public static final h48 d = new h48(256, 256, 256);
    public final int a;
    public final int b;
    public final int c;

    public h48(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h48)) {
            return false;
        }
        h48 h48 = (h48) obj;
        if (this.a == h48.a && this.b == h48.b && this.c == h48.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f21.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i2);
        return sb2.toString();
    }
}
