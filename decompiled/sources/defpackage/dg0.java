package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: dg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class dg0 implements Serializable, Comparable {
    public static final dg0 z = new dg0(new byte[0]);
    public final byte[] w;
    public transient int x;
    public transient String y;

    public dg0(byte[] bArr) {
        bArr.getClass();
        this.w = bArr;
    }

    public static int g(dg0 dg0, dg0 dg02) {
        dg0.getClass();
        dg02.getClass();
        return dg0.f(0, dg02.h());
    }

    public static int k(dg0 dg0, dg0 dg02) {
        int d = dg0.d();
        dg0.getClass();
        dg02.getClass();
        return dg0.j(d, dg02.h());
    }

    public static dg0 p(dg0 dg0, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dg0.d();
        }
        return dg0.o(i, i2);
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.w;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, mo0.a);
    }

    /* renamed from: b */
    public final int compareTo(dg0 dg0) {
        dg0.getClass();
        int d = d();
        int d2 = dg0.d();
        int min = Math.min(d, d2);
        int i = 0;
        while (i < min) {
            byte i2 = i(i) & 255;
            byte i3 = dg0.i(i) & 255;
            if (i2 == i3) {
                i++;
            } else if (i2 < i3) {
                return -1;
            } else {
                return 1;
            }
        }
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public dg0 c(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.w, 0, d());
        byte[] digest = instance.digest();
        digest.getClass();
        return new dg0(digest);
    }

    public int d() {
        return this.w.length;
    }

    public String e() {
        byte[] bArr = this.w;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = su0.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dg0) {
            dg0 dg0 = (dg0) obj;
            int d = dg0.d();
            byte[] bArr = this.w;
            if (d != bArr.length || !dg0.l(0, 0, bArr.length, bArr)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int f(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.w;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!t49.q(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] h() {
        return this.w;
    }

    public int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.w);
        this.x = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.w[i];
    }

    public int j(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.w;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (t49.q(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.w;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3 || !t49.q(i, i2, i3, bArr2, bArr)) {
            return false;
        }
        return true;
    }

    public boolean m(int i, dg0 dg0, int i2) {
        dg0.getClass();
        return dg0.l(0, i, i2, this.w);
    }

    public String n(Charset charset) {
        charset.getClass();
        return new String(this.w, charset);
    }

    public dg0 o(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.w;
            if (i2 > bArr.length) {
                h.j(f21.j(new StringBuilder("endIndex > length("), bArr.length, ')'));
                return null;
            } else if (i2 - i < 0) {
                h.q("endIndex < beginIndex");
                return null;
            } else if (i == 0 && i2 == bArr.length) {
                return this;
            } else {
                return new dg0(qs.P0(bArr, i, i2));
            }
        } else {
            h.q("beginIndex < 0");
            return null;
        }
    }

    public dg0 q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.w;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new dg0(copyOf);
            }
        }
    }

    public final String r() {
        String str = this.y;
        if (str != null) {
            return str;
        }
        byte[] h = h();
        h.getClass();
        String str2 = new String(h, mo0.a);
        this.y = str2;
        return str2;
    }

    public void s(sc0 sc0, int i) {
        sc0.write(this.w, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0140, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x016c, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0173, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x017a, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01aa, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01ad, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01b0, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01b3, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b6, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0096, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c4, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d6, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f6, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00fe, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0130, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0134, code lost:
        if (r6 == 64) goto L_0x01b7;
     */
    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        dg0 dg0 = this;
        byte[] bArr = dg0.w;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        loop0:
        while (true) {
            if (i6 >= length) {
                break;
            }
            byte b2 = bArr[i6];
            int i9 = 2;
            if (b2 >= 0) {
                int i10 = i8 + 1;
                if (i8 != 64) {
                    if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                        break;
                    }
                    if (b2 < 65536) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    i7 += i4;
                    i6++;
                    while (true) {
                        i8 = i10;
                        if (i6 >= length || (b = bArr[i6]) < 0) {
                            break;
                        }
                        i6++;
                        i10 = i8 + 1;
                        if (i8 != 64) {
                            if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                                break loop0;
                            }
                            if (b < 65536) {
                                i5 = 1;
                            } else {
                                i5 = 2;
                            }
                            i7 += i5;
                        } else {
                            break loop0;
                        }
                    }
                } else {
                    break;
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i11 = i6 + 1;
                    if (length > i11) {
                        byte b3 = bArr[i11];
                        if ((b3 & 192) == 128) {
                            byte b4 = (b3 ^ 3968) ^ (b2 << 6);
                            if (b4 >= 128) {
                                i = i8 + 1;
                                if (i8 != 64) {
                                    if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                                        break;
                                    }
                                    if (b4 < 65536) {
                                        i9 = 1;
                                    }
                                    i2 = i7 + i9;
                                    i3 = i6 + 2;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                } else if ((b2 >> 4) == -2) {
                    int i12 = i6 + 2;
                    if (length > i12) {
                        byte b5 = bArr[i6 + 1];
                        if ((b5 & 192) == 128) {
                            byte b6 = bArr[i12];
                            if ((b6 & 192) == 128) {
                                byte b7 = ((b6 ^ -123008) ^ (b5 << 6)) ^ (b2 << 12);
                                if (b7 >= 2048) {
                                    if (55296 > b7 || b7 >= 57344) {
                                        i = i8 + 1;
                                        if (i8 != 64) {
                                            if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (Byte.MAX_VALUE <= b7 && b7 < 160))) || b7 == 65533) {
                                                break;
                                            }
                                            if (b7 < 65536) {
                                                i9 = 1;
                                            }
                                            i2 = i7 + i9;
                                            i3 = i6 + 3;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i13 = i6 + 3;
                    if (length > i13) {
                        byte b8 = bArr[i6 + 1];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i6 + 2];
                            if ((b9 & 192) == 128) {
                                byte b10 = bArr[i13];
                                if ((b10 & 192) == 128) {
                                    byte b11 = (((b10 ^ 3678080) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b2 << 18);
                                    if (b11 <= 1114111) {
                                        if (55296 > b11 || b11 >= 57344) {
                                            if (b11 >= 65536) {
                                                i = i8 + 1;
                                                if (i8 != 64) {
                                                    if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (Byte.MAX_VALUE <= b11 && b11 < 160))) || b11 == 65533) {
                                                        break;
                                                    }
                                                    if (b11 < 65536) {
                                                        i9 = 1;
                                                    }
                                                    i2 = i7 + i9;
                                                    i3 = i6 + 4;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i8 = i;
            }
        }
        if (i7 != -1) {
            String r = dg0.r();
            String s0 = k57.s0(k57.s0(k57.s0(r.substring(0, i7), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i7 >= r.length()) {
                return pb4.h(']', "[text=", s0);
            }
            return "[size=" + bArr.length + " text=" + s0 + "…]";
        } else if (bArr.length <= 64) {
            return "[hex=" + dg0.e() + ']';
        } else {
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 <= bArr.length) {
                if (64 != bArr.length) {
                    dg0 = new dg0(qs.P0(bArr, 0, 64));
                }
                sb.append(dg0.e());
                sb.append("…]");
                return sb.toString();
            }
            h.j(f21.j(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
    }
}
