package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: aj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aj6 extends dg0 {
    public final transient byte[][] A;
    public final transient int[] B;

    public aj6(byte[][] bArr, int[] iArr) {
        super(dg0.z.w);
        this.A = bArr;
        this.B = iArr;
    }

    public final String a() {
        throw null;
    }

    public final dg0 c(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        byte[][] bArr = this.A;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.B;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        digest.getClass();
        return new dg0(digest);
    }

    public final int d() {
        return this.B[this.A.length - 1];
    }

    public final String e() {
        return u().e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dg0) {
            dg0 dg0 = (dg0) obj;
            if (dg0.d() != d() || !m(0, dg0, d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return u().f(i, bArr);
    }

    public final byte[] h() {
        return t();
    }

    public final int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.B;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.x = i3;
        return i3;
    }

    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.A;
        int[] iArr = this.B;
        t49.x((long) iArr[bArr.length - 1], (long) i, 1);
        int O = h49.O(this, i);
        if (O == 0) {
            i2 = 0;
        } else {
            i2 = iArr[O - 1];
        }
        return bArr[O][(i - i2) + iArr[bArr.length + O]];
    }

    public final int j(int i, byte[] bArr) {
        bArr.getClass();
        return u().j(i, bArr);
    }

    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int O = h49.O(this, i);
        while (i < i5) {
            int[] iArr = this.B;
            if (O == 0) {
                i4 = 0;
            } else {
                i4 = iArr[O - 1];
            }
            byte[][] bArr2 = this.A;
            int i6 = iArr[bArr2.length + O];
            int min = Math.min(i5, (iArr[O] - i4) + i4) - i;
            if (!t49.q((i - i4) + i6, i2, min, bArr2[O], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            O++;
        }
        return true;
    }

    public final boolean m(int i, dg0 dg0, int i2) {
        int i3;
        dg0.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i4 = i2 + i;
            int O = h49.O(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.B;
                if (O == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[O - 1];
                }
                byte[][] bArr = this.A;
                int i6 = iArr[bArr.length + O];
                int min = Math.min(i4, (iArr[O] - i3) + i3) - i;
                if (dg0.l(i5, (i - i3) + i6, min, bArr[O])) {
                    i5 += min;
                    i += min;
                    O++;
                }
            }
            return true;
        }
        return false;
    }

    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    public final dg0 o(int i, int i2) {
        if (i < 0) {
            h.j(pb4.i(i, "beginIndex=", " < 0"));
            return null;
        } else if (i2 <= d()) {
            int i3 = i2 - i;
            if (i3 < 0) {
                h.j(b81.l(i2, i, "endIndex=", " < beginIndex="));
                return null;
            } else if (i == 0 && i2 == d()) {
                return this;
            } else {
                if (i == i2) {
                    return dg0.z;
                }
                int O = h49.O(this, i);
                int O2 = h49.O(this, i2 - 1);
                byte[][] bArr = this.A;
                byte[][] bArr2 = (byte[][]) qs.Q0(bArr, O, O2 + 1);
                int[] iArr = new int[(bArr2.length * 2)];
                int i4 = 0;
                int[] iArr2 = this.B;
                if (O <= O2) {
                    int i5 = O;
                    int i6 = 0;
                    while (true) {
                        iArr[i6] = Math.min(iArr2[i5] - i, i3);
                        int i7 = i6 + 1;
                        iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                        if (i5 == O2) {
                            break;
                        }
                        i5++;
                        i6 = i7;
                    }
                }
                if (O != 0) {
                    i4 = iArr2[O - 1];
                }
                int length = bArr2.length;
                iArr[length] = (i - i4) + iArr[length];
                return new aj6(bArr2, iArr);
            }
        } else {
            StringBuilder o = pb4.o(i2, "endIndex=", " > length(");
            o.append(d());
            o.append(')');
            throw new IllegalArgumentException(o.toString().toString());
        }
    }

    public final dg0 q() {
        return u().q();
    }

    public final void s(sc0 sc0, int i) {
        int i2;
        int O = h49.O(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.B;
            if (O == 0) {
                i2 = 0;
            } else {
                i2 = iArr[O - 1];
            }
            byte[][] bArr = this.A;
            int i4 = iArr[bArr.length + O];
            int min = Math.min(i, (iArr[O] - i2) + i2) - i3;
            int i5 = (i3 - i2) + i4;
            qi6 qi6 = new qi6(bArr[O], i5, i5 + min, true, false);
            qi6 qi62 = sc0.w;
            if (qi62 == null) {
                qi6.g = qi6;
                qi6.f = qi6;
                sc0.w = qi6;
            } else {
                qi6 qi63 = qi62.g;
                qi63.getClass();
                qi63.b(qi6);
            }
            i3 += min;
            O++;
        }
        sc0.x += (long) i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.A;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.B;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            qs.I0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final String toString() {
        return u().toString();
    }

    public final dg0 u() {
        return new dg0(t());
    }
}
