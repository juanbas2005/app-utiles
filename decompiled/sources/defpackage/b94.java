package defpackage;

import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: b94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class b94 extends bg0 {
    public final byte[] x;
    public int y = 0;

    public b94(byte[] bArr) {
        this.x = bArr;
    }

    public final void A(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.x, i, i2);
    }

    public final boolean B(b94 b94, int i, int i2) {
        byte[] bArr = b94.x;
        int length = bArr.length;
        byte[] bArr2 = this.x;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        } else {
            int length3 = bArr.length;
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            h.q(hl6.p(sb2, ", ", length3));
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bg0) || size() != ((bg0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof b94) {
            return B((b94) obj, 0, size());
        }
        if (obj instanceof j96) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        h.q(f21.l(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
        return false;
    }

    public final int hashCode() {
        int i = this.y;
        if (i == 0) {
            int size = size();
            i = s(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.y = i;
        }
        return i;
    }

    public Iterator iterator() {
        return new uf0(this);
    }

    public void k(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.x, i, bArr, i2, i3);
    }

    public final int l() {
        return 0;
    }

    public final boolean n() {
        return true;
    }

    public final boolean o() {
        byte[] bArr = this.x;
        if (z85.u(bArr, 0, bArr.length) == 0) {
            return true;
        }
        return false;
    }

    public final int s(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.x[i4];
        }
        return i;
    }

    public int size() {
        return this.x.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r6[r8] > -65) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0092, code lost:
        if (r6[r7] > -65) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6[r8] > -65) goto L_0x0094;
     */
    public final int v(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.x;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return z85.r(b2, b4);
                    }
                    byte b5 = b4;
                    i2 = i7;
                    b3 = b5;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    i4 = i2 + 1;
                    b6 = bArr[i2];
                    if (i4 >= i6) {
                        return z85.r(b2, b6);
                    }
                    b = 0;
                } else {
                    int i8 = i2;
                    b = (byte) (i >> 16);
                    i4 = i8;
                }
                if (b == 0) {
                    int i9 = i4 + 1;
                    byte b7 = bArr[i4];
                    if (i9 < i6) {
                        int i10 = i9;
                        b = b7;
                        i4 = i10;
                    } else if (b2 > -12 || b6 > -65 || b7 > -65) {
                        return -1;
                    } else {
                        return ((b6 << 8) ^ b2) ^ (b7 << 16);
                    }
                }
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
            i2 = i5;
        }
        return z85.u(bArr, i2, i6);
    }

    public final int w() {
        return this.y;
    }

    public final String y() {
        byte[] bArr = this.x;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }
}
