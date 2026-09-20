package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: bg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bg0 implements Iterable {
    public static final b94 w = new b94(new byte[0]);

    public static bg0 d(Iterator it, int i) {
        if (i == 1) {
            return (bg0) it.next();
        }
        int i2 = i >>> 1;
        return d(it, i2).f(d(it, i - i2));
    }

    public static ag0 p() {
        return new ag0();
    }

    public abstract void A(OutputStream outputStream, int i, int i2);

    public final bg0 f(bg0 bg0) {
        j96 j96;
        int size = size();
        int size2 = bg0.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            int[] iArr = j96.D;
            if (this instanceof j96) {
                j96 = (j96) this;
            } else {
                j96 = null;
            }
            if (bg0.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return bg0;
            }
            int size3 = bg0.size() + size();
            if (size3 < 128) {
                int size4 = size();
                int size5 = bg0.size();
                byte[] bArr = new byte[(size4 + size5)];
                g(0, 0, size4, bArr);
                bg0.g(0, size4, size5, bArr);
                return new b94(bArr);
            }
            if (j96 != null) {
                bg0 bg02 = j96.z;
                if (bg0.size() + bg02.size() < 128) {
                    int size6 = bg02.size();
                    int size7 = bg0.size();
                    byte[] bArr2 = new byte[(size6 + size7)];
                    bg02.g(0, 0, size6, bArr2);
                    bg0.g(0, size6, size7, bArr2);
                    return new j96(j96.y, new b94(bArr2));
                }
            }
            if (j96 != null) {
                bg0 bg03 = j96.z;
                bg0 bg04 = j96.y;
                if (bg04.l() > bg03.l() && j96.B > bg0.l()) {
                    return new j96(bg04, new j96(bg03, bg0));
                }
            }
            if (size3 >= j96.D[Math.max(l(), bg0.l()) + 1]) {
                return new j96(this, bg0);
            }
            ay4 ay4 = new ay4(7);
            ay4.f(this);
            ay4.f(bg0);
            Stack stack = (Stack) ay4.x;
            bg0 bg05 = (bg0) stack.pop();
            while (!stack.isEmpty()) {
                bg05 = new j96((bg0) stack.pop(), bg05);
            }
            return bg05;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            h.g(30, i, "Source offset < 0: ");
        } else if (i2 < 0) {
            h.g(30, i2, "Target offset < 0: ");
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    h.g(34, i5, "Target end offset < 0: ");
                } else if (i3 > 0) {
                    k(i, i2, i3, bArr);
                }
            } else {
                h.g(34, i4, "Source end offset < 0: ");
            }
        } else {
            h.g(23, i3, "Length < 0: ");
        }
    }

    public abstract void k(int i, int i2, int i3, byte[] bArr);

    public abstract int l();

    public abstract boolean n();

    public abstract boolean o();

    public abstract int s(int i, int i2, int i3);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract int v(int i, int i2, int i3);

    public abstract int w();

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return sf3.a;
        }
        byte[] bArr = new byte[size];
        k(0, 0, size, bArr);
        return bArr;
    }

    public abstract String y();

    public final String z() {
        try {
            return y();
        } catch (UnsupportedEncodingException e) {
            ku4.o("UTF-8 not supported?", e);
            return null;
        }
    }
}
