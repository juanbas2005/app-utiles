package defpackage;

/* renamed from: uj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uj1 implements Comparable {
    public final int w;
    public final int x;

    public uj1(int i, int i2) {
        this.w = i;
        this.x = i2;
        if (i2 < 0) {
            h.j(hl6.k(i2, "Digits must be non-negative, but was "));
            throw null;
        }
    }

    public final int a(int i) {
        int[] iArr = sg3.i;
        int i2 = this.w;
        int i3 = this.x;
        if (i == i3) {
            return i2;
        }
        if (i > i3) {
            return i2 * iArr[i - i3];
        }
        return i2 / iArr[i3 - i];
    }

    public final int compareTo(Object obj) {
        uj1 uj1 = (uj1) obj;
        uj1.getClass();
        int max = Math.max(this.x, uj1.x);
        return sg3.k(a(max), uj1.a(max));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1 = (uj1) obj;
        int max = Math.max(this.x, uj1.x);
        if (sg3.k(a(max), uj1.a(max)) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = sg3.i[this.x];
        int i2 = this.w;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(d57.R0(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
