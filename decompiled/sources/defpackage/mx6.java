package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mx6 implements Iterable, ar3 {
    public static final mx6 A = new mx6(0, 0, 0, (long[]) null);
    public final long w;
    public final long x;
    public final long y;
    public final long[] z;

    public mx6(long j, long j2, long j3, long[] jArr) {
        this.w = j;
        this.x = j2;
        this.y = j3;
        this.z = jArr;
    }

    public final mx6 f(mx6 mx6) {
        long[] jArr;
        mx6 mx62 = this;
        mx6 mx63 = mx6;
        mx6 mx64 = A;
        if (mx63 == mx64) {
            return mx62;
        }
        if (mx62 == mx64) {
            return mx64;
        }
        long j = mx63.y;
        long j2 = mx63.y;
        long[] jArr2 = mx63.z;
        long j3 = mx63.x;
        long j4 = mx63.w;
        long j5 = mx62.y;
        if (j == j5 && jArr2 == (jArr = mx62.z)) {
            return new mx6(mx62.w & (~j4), mx62.x & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long g : jArr2) {
                mx62 = mx62.g(g);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    mx62 = mx62.g(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    mx62 = mx62.g(((long) i2) + j2 + 64);
                }
            }
        }
        return mx62;
    }

    public final mx6 g(long j) {
        long[] jArr;
        int c;
        long[] jArr2;
        long j2 = j - this.y;
        if (sg3.l(j2, 0) >= 0 && sg3.l(j2, 64) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.x;
            if ((j4 & j3) != 0) {
                return new mx6(this.w, j4 & (~j3), this.y, this.z);
            }
        } else if (sg3.l(j2, 64) >= 0 && sg3.l(j2, 128) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.w;
            if ((j6 & j5) != 0) {
                return new mx6(j6 & (~j5), this.x, this.y, this.z);
            }
        } else if (sg3.l(j2, 0) < 0 && (jArr = this.z) != null && (c = l55.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (c > 0) {
                    qs.L0(jArr, jArr3, 0, 0, c);
                }
                if (c < i) {
                    qs.L0(jArr, jArr3, c, c + 1, length);
                }
                jArr2 = jArr3;
            }
            return new mx6(this.w, this.x, this.y, jArr2);
        }
        return this;
    }

    public final Iterator iterator() {
        return t75.y(new lx6(this, (f61) null));
    }

    public final boolean k(long j) {
        long[] jArr;
        long j2 = j - this.y;
        if (sg3.l(j2, 0) < 0 || sg3.l(j2, 64) >= 0) {
            if (sg3.l(j2, 64) < 0 || sg3.l(j2, 128) >= 0) {
                if (sg3.l(j2, 0) <= 0 && (jArr = this.z) != null && l55.c(jArr, j) >= 0) {
                    return true;
                }
                return false;
            } else if (((1 << (((int) j2) - 64)) & this.w) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << ((int) j2)) & this.x) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final mx6 l(mx6 mx6) {
        mx6 mx62;
        long[] jArr;
        mx6 mx63 = this;
        mx6 mx64 = mx6;
        mx6 mx65 = A;
        if (mx64 == mx65) {
            return mx63;
        }
        if (mx63 == mx65) {
            return mx64;
        }
        long j = mx64.y;
        long j2 = mx64.y;
        long[] jArr2 = mx64.z;
        long j3 = mx64.x;
        long j4 = mx64.w;
        long j5 = mx63.y;
        long j6 = mx63.x;
        int i = (j > j5 ? 1 : (j == j5 ? 0 : -1));
        long j7 = mx63.w;
        if (i == 0 && jArr2 == (jArr = mx63.z)) {
            return new mx6(j7 | j4, j6 | j3, j5, jArr);
        }
        long j8 = j6;
        int i2 = 0;
        long[] jArr3 = mx63.z;
        if (jArr3 == null) {
            if (jArr3 != null) {
                mx62 = mx6;
                for (long n : jArr3) {
                    mx62 = mx62.n(n);
                }
            } else {
                mx62 = mx6;
            }
            int i3 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
            long j9 = mx63.y;
            if (i3 != 0) {
                for (int i4 = 0; i4 < 64; i4++) {
                    if (((1 << i4) & j8) != 0) {
                        mx62 = mx62.n(((long) i4) + j9);
                    }
                }
            }
            if (j7 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j7) != 0) {
                        mx62 = mx62.n(((long) i2) + j9 + 64);
                    }
                    i2++;
                }
            }
            return mx62;
        }
        if (jArr2 != null) {
            for (long n2 : jArr2) {
                mx63 = mx63.n(n2);
            }
        }
        if (j3 != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if (((1 << i5) & j3) != 0) {
                    mx63 = mx63.n(((long) i5) + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j4) != 0) {
                    mx63 = mx63.n(((long) i2) + j2 + 64);
                }
                i2++;
            }
        }
        return mx63;
    }

    public final mx6 n(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = j;
        long j6 = this.y;
        long j7 = j5 - j6;
        long j8 = 0;
        int l = sg3.l(j7, 0);
        long j9 = this.x;
        if (l < 0 || sg3.l(j7, 64) >= 0) {
            int l2 = sg3.l(j7, 64);
            long j10 = this.w;
            int i2 = 64;
            if (l2 < 0 || sg3.l(j7, 128) >= 0) {
                int l3 = sg3.l(j7, 128);
                long[] jArr3 = this.z;
                if (l3 >= 0) {
                    if (!k(j)) {
                        long j11 = ((j5 + 1) / 64) * 64;
                        if (sg3.l(j11, 0) < 0) {
                            j11 = 9223372036854775680L;
                        }
                        long j12 = j10;
                        uy5 uy5 = null;
                        while (true) {
                            if (sg3.l(j6, j11) >= 0) {
                                j2 = j6;
                                j3 = j9;
                                break;
                            }
                            if (j9 != j8) {
                                if (uy5 == null) {
                                    uy5 = new uy5(jArr3);
                                }
                                int i3 = 0;
                                i = i2;
                                while (i3 < i) {
                                    if ((j9 & (1 << i3)) != j8) {
                                        j4 = j8;
                                        ((cp4) uy5.x).a(((long) i3) + j6);
                                    } else {
                                        j4 = j8;
                                    }
                                    i3++;
                                    j8 = j4;
                                }
                            } else {
                                i = i2;
                            }
                            long j13 = j8;
                            if (j12 == j13) {
                                j2 = j11;
                                j3 = j13;
                                break;
                            }
                            j6 += 64;
                            j8 = j13;
                            j9 = j12;
                            i2 = i;
                            j12 = j8;
                        }
                        if (uy5 != null) {
                            cp4 cp4 = (cp4) uy5.x;
                            int i4 = cp4.b;
                            if (i4 == 0) {
                                jArr2 = null;
                            } else {
                                long[] jArr4 = new long[i4];
                                long[] jArr5 = cp4.a;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    jArr4[i5] = jArr5[i5];
                                }
                                jArr2 = jArr4;
                            }
                            if (jArr2 != null) {
                                jArr = jArr2;
                                return new mx6(j12, j3, j2, jArr).n(j5);
                            }
                        }
                        jArr = jArr3;
                        return new mx6(j12, j3, j2, jArr).n(j5);
                    }
                } else if (jArr3 == null) {
                    return new mx6(this.w, this.x, this.y, new long[]{j5});
                } else {
                    int c = l55.c(jArr3, j5);
                    if (c < 0) {
                        int i6 = -(c + 1);
                        int length = jArr3.length;
                        long[] jArr6 = new long[(length + 1)];
                        qs.L0(jArr3, jArr6, 0, 0, i6);
                        qs.L0(jArr3, jArr6, i6 + 1, i6, length);
                        jArr6[i6] = j5;
                        return new mx6(this.w, this.x, this.y, jArr6);
                    }
                }
            } else {
                long j14 = 1 << (((int) j7) - 64);
                if ((j10 & j14) == 0) {
                    return new mx6(j10 | j14, this.x, this.y, this.z);
                }
            }
        } else {
            long j15 = 1 << ((int) j7);
            if ((j9 & j15) == 0) {
                return new mx6(this.w, j9 | j15, this.y, this.z);
            }
        }
        return this;
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(et0.e0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            boolean z2 = true;
            i++;
            if (i > 1) {
                sb.append(", ");
            }
            if (obj2 != null) {
                z2 = obj2 instanceof CharSequence;
            }
            if (z2) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append(obj2.toString());
            }
        }
        sb.append("");
        return obj + " [" + sb.toString() + "]";
    }
}
