package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: zf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class zf0 implements Iterable, Serializable {
    public static final zf0 y = new zf0(tf3.b);
    public static final xf0 z;
    public int w = 0;
    public final byte[] x;

    static {
        xf0 xf0;
        if (gd.a()) {
            xf0 = new g22(22);
        } else {
            xf0 = new me6(21);
        }
        z = xf0;
    }

    public zf0(byte[] bArr) {
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

    public static zf0 g(byte[] bArr, int i, int i2) {
        f(i, i + i2, bArr.length);
        return new zf0(z.c(bArr, i, i2));
    }

    public byte d(int i) {
        return this.x[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zf0) || size() != ((zf0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zf0)) {
            return obj.equals(this);
        }
        zf0 zf0 = (zf0) obj;
        int i = this.w;
        int i2 = zf0.w;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > zf0.size()) {
            int size2 = size();
            throw new IllegalArgumentException("Length too large: " + size + size2);
        } else if (size <= zf0.size()) {
            byte[] bArr = zf0.x;
            int l = l() + size;
            int l2 = l();
            int l3 = zf0.l();
            while (l2 < l) {
                if (this.x[l2] != bArr[l3]) {
                    return false;
                }
                l2++;
                l3++;
            }
            return true;
        } else {
            StringBuilder o = pb4.o(size, "Ran off end of other: 0, ", ", ");
            o.append(zf0.size());
            throw new IllegalArgumentException(o.toString());
        }
    }

    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int size = size();
        int l = l();
        int i2 = size;
        for (int i3 = l; i3 < l + size; i3++) {
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

    public void k(int i, byte[] bArr) {
        System.arraycopy(this.x, 0, bArr, 0, i);
    }

    public int l() {
        return 0;
    }

    public byte n(int i) {
        return this.x[i];
    }

    public int size() {
        return this.x.length;
    }

    public final String toString() {
        String str;
        zf0 zf0;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = n85.e(this);
        } else {
            int f = f(0, 47, size());
            if (f == 0) {
                zf0 = y;
            } else {
                zf0 = new wf0(this.x, l(), f);
            }
            str = n85.e(zf0).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return f21.l(sb, str, "\">");
    }
}
