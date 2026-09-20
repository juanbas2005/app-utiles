package defpackage;

/* renamed from: vu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vu6 implements Comparable {
    public final int w;
    public final int x;

    public vu6(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    public final vu6 a(vu6 vu6) {
        int i = vu6.x;
        int i2 = this.w;
        int i3 = i2 * i;
        int i4 = vu6.w;
        int i5 = this.x;
        if (i3 <= i4 * i5) {
            return new vu6(i4, (i5 * i4) / i2);
        }
        return new vu6((i2 * i) / i5, i);
    }

    public final vu6 b(vu6 vu6) {
        int i = vu6.x;
        int i2 = this.w;
        int i3 = i2 * i;
        int i4 = vu6.w;
        int i5 = this.x;
        if (i3 >= i4 * i5) {
            return new vu6(i4, (i5 * i4) / i2);
        }
        return new vu6((i2 * i) / i5, i);
    }

    public final int compareTo(Object obj) {
        vu6 vu6 = (vu6) obj;
        int i = this.x * this.w;
        int i2 = vu6.x * vu6.w;
        if (i2 < i) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vu6.class == obj.getClass()) {
            vu6 vu6 = (vu6) obj;
            if (this.w == vu6.w && this.x == vu6.x) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.w * 31) + this.x;
    }

    public final String toString() {
        return this.w + "x" + this.x;
    }
}
