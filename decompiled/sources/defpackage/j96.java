package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j96 extends bg0 {
    public static final int[] D;
    public final int A;
    public final int B;
    public int C = 0;
    public final int x;
    public final bg0 y;
    public final bg0 z;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        D = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = D;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    public j96(bg0 bg0, bg0 bg02) {
        this.y = bg0;
        this.z = bg02;
        int size = bg0.size();
        this.A = size;
        this.x = bg02.size() + size;
        this.B = Math.max(bg0.l(), bg02.l()) + 1;
    }

    public final void A(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        bg0 bg0 = this.y;
        int i4 = this.A;
        if (i3 <= i4) {
            bg0.A(outputStream, i, i2);
            return;
        }
        bg0 bg02 = this.z;
        if (i >= i4) {
            bg02.A(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        bg0.A(outputStream, i, i5);
        bg02.A(outputStream, 0, i2 - i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r12 = (defpackage.bg0) r12;
     */
    public final boolean equals(Object obj) {
        bg0 bg0;
        int i;
        boolean z2;
        int w;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bg0) && (i = this.x) == bg0.size()) {
            if (i == 0) {
                return true;
            }
            if (this.C == 0 || (w = bg0.w()) == 0 || this.C == w) {
                h96 h96 = new h96(this);
                b94 a = h96.next();
                h96 h962 = new h96(bg0);
                b94 a2 = h962.next();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int length = a.x.length - i2;
                    int length2 = a2.x.length - i3;
                    int min = Math.min(length, length2);
                    if (i2 == 0) {
                        z2 = a.B(a2, i3, min);
                    } else {
                        z2 = a2.B(a, i2, min);
                    }
                    if (!z2) {
                        break;
                    }
                    i4 += min;
                    if (i4 < i) {
                        if (min == length) {
                            a = h96.next();
                            i2 = 0;
                        } else {
                            i2 += min;
                        }
                        if (min == length2) {
                            a2 = h962.next();
                            i3 = 0;
                        } else {
                            i3 += min;
                        }
                    } else if (i4 == i) {
                        return true;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.C;
        if (i == 0) {
            int i2 = this.x;
            i = s(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.C = i;
        }
        return i;
    }

    public final Iterator iterator() {
        return new i96(this);
    }

    public final void k(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        bg0 bg0 = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            bg0.k(i, i2, i3, bArr);
            return;
        }
        bg0 bg02 = this.z;
        if (i >= i5) {
            bg02.k(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        bg0.k(i, i2, i6, bArr);
        bg02.k(0, i2 + i6, i3 - i6, bArr);
    }

    public final int l() {
        return this.B;
    }

    public final boolean n() {
        if (this.x >= D[this.B]) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        int v = this.y.v(0, 0, this.A);
        bg0 bg0 = this.z;
        if (bg0.v(v, 0, bg0.size()) == 0) {
            return true;
        }
        return false;
    }

    public final int s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        bg0 bg0 = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return bg0.s(i, i2, i3);
        }
        bg0 bg02 = this.z;
        if (i2 >= i5) {
            return bg02.s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return bg02.s(bg0.s(i, i2, i6), 0, i3 - i6);
    }

    public final int size() {
        return this.x;
    }

    public final int v(int i, int i2, int i3) {
        int i4 = i2 + i3;
        bg0 bg0 = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return bg0.v(i, i2, i3);
        }
        bg0 bg02 = this.z;
        if (i2 >= i5) {
            return bg02.v(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return bg02.v(bg0.v(i, i2, i6), 0, i3 - i6);
    }

    public final int w() {
        return this.C;
    }

    public final String y() {
        return new String(x(), "UTF-8");
    }
}
