package defpackage;

import java.math.BigInteger;

/* renamed from: g48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g48 implements Comparable {
    public static final g48 B = new g48(0, 1, 0, "");
    public final z97 A = new z97(new fd7(6, (Object) this));
    public final int w;
    public final int x;
    public final int y;
    public final String z;

    static {
        new g48(0, 0, 0, "");
        new g48(1, 0, 0, "");
    }

    public g48(int i, int i2, int i3, String str) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = str;
    }

    public final int compareTo(Object obj) {
        g48 g48 = (g48) obj;
        g48.getClass();
        Object value = this.A.getValue();
        value.getClass();
        Object value2 = g48.A.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.g48) r4;
     */
    public final boolean equals(Object obj) {
        g48 g48;
        if ((obj instanceof g48) && this.w == g48.w && this.x == g48.x && this.y == g48.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.w) * 31) + this.x) * 31) + this.y;
    }

    public final String toString() {
        String str;
        String str2 = this.z;
        if (!d57.I0(str2)) {
            str = "-".concat(str2);
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append('.');
        sb.append(this.x);
        sb.append('.');
        return hl6.n(sb, this.y, str);
    }
}
