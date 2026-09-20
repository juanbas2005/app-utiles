package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: qz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class qz8 implements Iterable, Serializable {
    public static final qz8 y = new qz8(i09.a);
    public int w = 0;
    public final byte[] x;

    static {
        int i = gz8.a;
    }

    public qz8(byte[] bArr) {
        bArr.getClass();
        this.x = bArr;
    }

    public static int o(int i, int i2, int i3) {
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

    public static qz8 p(int i, byte[] bArr) {
        o(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new qz8(bArr2);
    }

    public byte d(int i) {
        return this.x[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof qz8) && k() == ((qz8) obj).k()) {
            if (k() == 0) {
                return true;
            }
            if (!(obj instanceof qz8)) {
                return obj.equals(this);
            }
            qz8 qz8 = (qz8) obj;
            int i = this.w;
            int i2 = qz8.w;
            if (i == 0 || i2 == 0 || i == i2) {
                int k = k();
                if (k > qz8.k()) {
                    int k2 = k();
                    throw new IllegalArgumentException("Length too large: " + k + k2);
                } else if (k <= qz8.k()) {
                    byte[] bArr = qz8.x;
                    int g = g() + k;
                    int g2 = g();
                    int g3 = qz8.g();
                    while (g2 < g) {
                        if (this.x[g2] == bArr[g3]) {
                            g2++;
                            g3++;
                        }
                    }
                    return true;
                } else {
                    h.q(b81.l(k, qz8.k(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.x[i];
    }

    public int g() {
        return 0;
    }

    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int k = k();
        int g = g();
        byte[] bArr = i09.a;
        int i2 = k;
        for (int i3 = g; i3 < g + k; i3++) {
            i2 = (i2 * 31) + this.x[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.w = i2;
        return i2;
    }

    public final /* synthetic */ Iterator iterator() {
        return new uf0(this);
    }

    public int k() {
        return this.x.length;
    }

    public void l(int i, byte[] bArr) {
        System.arraycopy(this.x, 0, bArr, 0, i);
    }

    public final ByteArrayInputStream n() {
        return new ByteArrayInputStream(this.x, g(), k());
    }

    public final byte[] s() {
        int k = k();
        if (k == 0) {
            return i09.a;
        }
        byte[] bArr = new byte[k];
        l(k, bArr);
        return bArr;
    }

    public final String toString() {
        String str;
        qz8 qz8;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k = k();
        if (k() <= 50) {
            str = wn6.y(this);
        } else {
            int o = o(0, 47, k());
            if (o == 0) {
                qz8 = y;
            } else {
                qz8 = new lz8(this.x, g(), o);
            }
            str = wn6.y(qz8).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(k);
        sb.append(" contents=\"");
        return f21.l(sb, str, "\">");
    }
}
