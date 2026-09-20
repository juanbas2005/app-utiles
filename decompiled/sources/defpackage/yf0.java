package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: yf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class yf0 implements Iterable, Serializable {
    public static final yf0 y = new yf0(rf3.b);
    public int w = 0;
    public final byte[] x;

    static {
        Class cls = fd.a;
    }

    public yf0(byte[] bArr) {
        bArr.getClass();
        this.x = bArr;
    }

    public static int f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            h.l(pb4.i(i, "Beginning index: ", " < 0"));
            return 0;
        } else if (i2 < i) {
            h.l(b81.l(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        } else {
            h.l(b81.l(i2, i3, "End index: ", " >= "));
            return 0;
        }
    }

    public byte d(int i) {
        return this.x[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yf0) || size() != ((yf0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof yf0)) {
            return obj.equals(this);
        }
        yf0 yf0 = (yf0) obj;
        int i = this.w;
        int i2 = yf0.w;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > yf0.size()) {
            int size2 = size();
            throw new IllegalArgumentException("Length too large: " + size + size2);
        } else if (size <= yf0.size()) {
            byte[] bArr = yf0.x;
            int g = g() + size;
            int g2 = g();
            int g3 = yf0.g();
            while (g2 < g) {
                if (this.x[g2] != bArr[g3]) {
                    return false;
                }
                g2++;
                g3++;
            }
            return true;
        } else {
            StringBuilder o = pb4.o(size, "Ran off end of other: 0, ", ", ");
            o.append(yf0.size());
            throw new IllegalArgumentException(o.toString());
        }
    }

    public int g() {
        return 0;
    }

    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int size = size();
        int g = g();
        int i2 = size;
        for (int i3 = g; i3 < g + size; i3++) {
            i2 = (i2 * 31) + this.x[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.w = i2;
        return i2;
    }

    public final Iterator iterator() {
        return new uf0(this);
    }

    public byte k(int i) {
        return this.x[i];
    }

    public int size() {
        return this.x.length;
    }

    public final String toString() {
        String str;
        yf0 yf0;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = b85.k(this);
        } else {
            int f = f(0, 47, size());
            if (f == 0) {
                yf0 = y;
            } else {
                yf0 = new vf0(this.x, g(), f);
            }
            str = b85.k(yf0).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return f21.l(sb, str, "\">");
    }
}
