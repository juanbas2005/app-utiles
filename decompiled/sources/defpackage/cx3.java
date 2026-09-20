package defpackage;

/* renamed from: cx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cx3 implements Comparable {
    public static final cx3 z = new cx3(2, 4, 0);
    public final int w;
    public final int x;
    public final int y;

    public cx3(int i, int i2, int i3) {
        this.w = i;
        this.x = i2;
        if (i < 0 || i >= 256 || i2 < 0 || i2 >= 256) {
            throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + ".0").toString());
        }
        this.y = (i << 16) + (i2 << 8);
    }

    public final int compareTo(Object obj) {
        cx3 cx3 = (cx3) obj;
        cx3.getClass();
        return this.y - cx3.y;
    }

    public final boolean equals(Object obj) {
        cx3 cx3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cx3) {
            cx3 = (cx3) obj;
        } else {
            cx3 = null;
        }
        if (cx3 != null && this.y == cx3.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append('.');
        return hl6.n(sb, this.x, ".0");
    }
}
