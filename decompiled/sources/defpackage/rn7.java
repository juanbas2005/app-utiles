package defpackage;

import java.util.Arrays;

/* renamed from: rn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rn7 {
    public static final rn7 e = new rn7(0, 0, new Object[0], (jv2) null);
    public int a;
    public int b;
    public final jv2 c;
    public Object[] d;

    public rn7(int i, int i2, Object[] objArr, jv2 jv2) {
        this.a = i;
        this.b = i2;
        this.c = jv2;
        this.d = objArr;
    }

    public static rn7 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, jv2 jv2) {
        Object obj5 = obj4;
        int i4 = i3;
        jv2 jv22 = jv2;
        if (i4 > 30) {
            return new rn7(0, 0, new Object[]{obj, obj2, obj3, obj5}, jv22);
        }
        int k = k75.k(i, i4);
        int k2 = k75.k(i2, i4);
        if (k != k2) {
            return new rn7((1 << k) | (1 << k2), 0, k < k2 ? new Object[]{obj, obj2, obj3, obj5} : new Object[]{obj3, obj5, obj, obj2}, jv22);
        }
        return new rn7(0, 1 << k, new Object[]{j(i, obj, obj2, i2, obj3, obj5, i4 + 5, jv22)}, jv22);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, jv2 jv2) {
        int i5;
        Object obj3 = this.d[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        rn7 j = j(i5, obj3, x(i), i3, obj, obj2, i4 + 5, jv2);
        int t = t(i2);
        int i6 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[(objArr.length - 1)];
        qs.N0(0, i, 6, objArr, objArr2);
        qs.K0(i, i + 2, i6, objArr, objArr2);
        objArr2[t - 1] = j;
        qs.K0(t, i6, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        pe3 Q = z65.Q(z65.V(0, this.d.length), 2);
        int i = Q.w;
        int i2 = Q.x;
        int i3 = Q.y;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!sg3.e(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int k = 1 << k75.k(i, i2);
        if (h(k)) {
            return sg3.e(obj, this.d[f(k)]);
        } else if (!i(k)) {
            return false;
        } else {
            rn7 s = s(t(k));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(i, i2 + 5, obj);
        }
    }

    public final boolean e(rn7 rn7) {
        if (this == rn7) {
            return true;
        }
        if (this.b == rn7.b && this.a == rn7.a) {
            int length = this.d.length;
            int i = 0;
            while (i < length) {
                if (this.d[i] == rn7.d[i]) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int k = 1 << k75.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (sg3.e(obj, this.d[f])) {
                return x(f);
            }
            return null;
        } else if (!i(k)) {
            return null;
        } else {
            rn7 s = s(t(k));
            if (i2 != 30) {
                return s.g(i, i2 + 5, obj);
            }
            pe3 Q = z65.Q(z65.V(0, s.d.length), 2);
            int i3 = Q.w;
            int i4 = Q.x;
            int i5 = Q.y;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                return null;
            }
            while (!sg3.e(obj, s.d[i3])) {
                if (i3 == i4) {
                    return null;
                }
                i3 += i5;
            }
            return s.x(i3);
        }
    }

    public final boolean h(int i) {
        if ((this.a & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final rn7 k(int i, yf5 yf5) {
        yf5.e(yf5.B - 1);
        yf5.z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != yf5.x) {
            return new rn7(0, 0, k75.e(i, objArr), yf5.x);
        }
        this.d = k75.e(i, objArr);
        return this;
    }

    public final rn7 l(int i, Object obj, Object obj2, int i2, yf5 yf5) {
        rn7 rn7;
        yf5 yf52;
        int k = 1 << k75.k(i, i2);
        boolean h = h(k);
        jv2 jv2 = this.c;
        if (h) {
            int f = f(k);
            if (sg3.e(obj, this.d[f])) {
                yf5.z = x(f);
                if (x(f) == obj2) {
                    return this;
                }
                if (jv2 == yf5.x) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                yf5.A++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new rn7(this.a, this.b, copyOf, yf5.x);
            }
            yf5.e(yf5.B + 1);
            jv2 jv22 = yf5.x;
            if (jv2 == jv22) {
                this.d = a(f, k, i, obj, obj2, i2, jv22);
                this.a ^= k;
                this.b |= k;
                return this;
            }
            Object[] a2 = a(f, k, i, obj, obj2, i2, jv22);
            return new rn7(this.a ^ k, this.b | k, a2, jv22);
        }
        int i3 = i;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i4 = i2;
        if (i(k)) {
            int t = t(k);
            rn7 s = s(t);
            if (i4 == 30) {
                pe3 Q = z65.Q(z65.V(0, s.d.length), 2);
                int i5 = Q.w;
                int i6 = Q.x;
                int i7 = Q.y;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        if (!sg3.e(obj3, s.d[i5])) {
                            if (i5 == i6) {
                                break;
                            }
                            i5 += i7;
                        } else {
                            yf5.z = s.x(i5);
                            if (s.c == yf5.x) {
                                s.d[i5 + 1] = obj4;
                                rn7 = s;
                            } else {
                                yf5.A++;
                                Object[] objArr2 = s.d;
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                copyOf2[i5 + 1] = obj4;
                                rn7 = new rn7(0, 0, copyOf2, yf5.x);
                            }
                        }
                    }
                }
                yf5.e(yf5.B + 1);
                rn7 = new rn7(0, 0, k75.d(s.d, 0, obj3, obj4), yf5.x);
                yf52 = yf5;
            } else {
                yf52 = yf5;
                rn7 = s.l(i3, obj3, obj4, i4 + 5, yf52);
            }
            if (s == rn7) {
                return this;
            }
            return r(t, rn7, yf52.x);
        }
        yf5 yf53 = yf5;
        yf53.e(yf53.B + 1);
        jv2 jv23 = yf53.x;
        int f2 = f(k);
        Object[] objArr3 = this.d;
        if (jv2 == jv23) {
            this.d = k75.d(objArr3, f2, obj3, obj4);
            this.a |= k;
            return this;
        }
        return new rn7(this.a | k, this.b, k75.d(objArr3, f2, obj3, obj4), jv23);
    }

    public final rn7 m(rn7 rn7, int i, sp1 sp1, yf5 yf5) {
        rn7 rn72;
        Object[] objArr;
        rn7 rn73;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        rn7 rn74 = rn7;
        int i7 = i;
        sp1 sp12 = sp1;
        yf5 yf52 = yf5;
        if (this == rn74) {
            sp12.a += b();
            return this;
        }
        int i8 = 0;
        if (i7 > 30) {
            jv2 jv2 = yf52.x;
            int i9 = rn74.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + rn74.d.length);
            int length = this.d.length;
            pe3 Q = z65.Q(z65.V(0, rn74.d.length), 2);
            int i10 = Q.w;
            int i11 = Q.x;
            int i12 = Q.y;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    if (!c(rn74.d[i10])) {
                        Object[] objArr3 = rn74.d;
                        copyOf[length] = objArr3[i10];
                        copyOf[length + 1] = objArr3[i10 + 1];
                        length += 2;
                    } else {
                        sp12.a++;
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
            if (length != this.d.length) {
                if (length == rn74.d.length) {
                    return rn74;
                }
                if (length == copyOf.length) {
                    return new rn7(0, 0, copyOf, jv2);
                }
                return new rn7(0, 0, Arrays.copyOf(copyOf, length), jv2);
            }
        } else {
            int i13 = this.b | rn74.b;
            int i14 = this.a;
            int i15 = rn74.a;
            int i16 = i14 & i15;
            int i17 = (i14 ^ i15) & (~i13);
            while (i16 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i16);
                if (sg3.e(this.d[f(lowestOneBit)], rn74.d[rn74.f(lowestOneBit)])) {
                    i17 |= lowestOneBit;
                } else {
                    i13 |= lowestOneBit;
                }
                i16 ^= lowestOneBit;
            }
            if ((i13 & i17) != 0) {
                vm5.b("Check failed.");
            }
            if (sg3.e(this.c, yf52.x) && this.a == i17 && this.b == i13) {
                rn72 = this;
            } else {
                rn72 = new rn7(i17, i13, new Object[(Integer.bitCount(i13) + (Integer.bitCount(i17) * 2))], (jv2) null);
            }
            int i18 = i13;
            int i19 = 0;
            while (i18 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i18);
                Object[] objArr4 = rn72.d;
                int length2 = (objArr4.length - 1) - i19;
                if (i(lowestOneBit2)) {
                    rn73 = s(t(lowestOneBit2));
                    if (rn74.i(lowestOneBit2)) {
                        rn73 = rn73.m(rn74.s(rn74.t(lowestOneBit2)), i7 + 5, sp12, yf52);
                        objArr = objArr4;
                    } else if (rn74.h(lowestOneBit2)) {
                        int f = rn74.f(lowestOneBit2);
                        Object obj = rn74.d[f];
                        Object x = rn74.x(f);
                        int i20 = yf52.B;
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = i8;
                        }
                        int i21 = i6;
                        objArr = objArr4;
                        rn7 rn75 = rn73;
                        int i22 = i21;
                        Object obj2 = obj;
                        Object obj3 = x;
                        Object obj4 = obj2;
                        int i23 = i20;
                        rn73 = rn75.l(i22, obj4, obj3, i7 + 5, yf52);
                        if (yf52.B == i23) {
                            sp12.a++;
                        }
                    } else {
                        objArr = objArr4;
                        rn7 rn76 = rn73;
                    }
                } else {
                    objArr = objArr4;
                    if (rn74.i(lowestOneBit2)) {
                        rn7 s = rn74.s(rn74.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj5 = this.d[f2];
                            if (obj5 != null) {
                                i4 = obj5.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i24 = i7 + 5;
                            if (s.d(i4, i24, obj5)) {
                                sp12.a++;
                            } else {
                                Object x2 = x(f2);
                                if (obj5 != null) {
                                    i5 = obj5.hashCode();
                                } else {
                                    i5 = 0;
                                }
                                rn73 = s.l(i5, obj5, x2, i24, yf52);
                            }
                        }
                        rn73 = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj6 = this.d[f3];
                        Object x3 = x(f3);
                        int f4 = rn74.f(lowestOneBit2);
                        Object obj7 = rn74.d[f4];
                        Object x4 = rn74.x(f4);
                        if (obj6 != null) {
                            i2 = obj6.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj7 != null) {
                            i3 = obj7.hashCode();
                        } else {
                            i3 = 0;
                        }
                        rn73 = j(i2, obj6, x3, i3, obj7, x4, i7 + 5, yf52.x);
                    }
                }
                objArr[length2] = rn73;
                i19++;
                i18 ^= lowestOneBit2;
                i8 = 0;
            }
            int i25 = 0;
            while (i17 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i17);
                int i26 = i25 * 2;
                if (!rn74.h(lowestOneBit3)) {
                    int f5 = f(lowestOneBit3);
                    Object[] objArr5 = rn72.d;
                    objArr5[i26] = this.d[f5];
                    objArr5[i26 + 1] = x(f5);
                } else {
                    int f6 = rn74.f(lowestOneBit3);
                    Object[] objArr6 = rn72.d;
                    objArr6[i26] = rn74.d[f6];
                    objArr6[i26 + 1] = rn74.x(f6);
                    if (h(lowestOneBit3)) {
                        sp12.a++;
                    }
                }
                i25++;
                i17 ^= lowestOneBit3;
            }
            if (!e(rn72)) {
                if (rn74.e(rn72)) {
                    return rn74;
                }
                return rn72;
            }
        }
        return this;
    }

    public final rn7 n(int i, Object obj, int i2, yf5 yf5) {
        rn7 n;
        int k = 1 << k75.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (sg3.e(obj, this.d[f])) {
                return p(f, k, yf5);
            }
        } else if (i(k)) {
            int t = t(k);
            rn7 s = s(t);
            if (i2 == 30) {
                pe3 Q = z65.Q(z65.V(0, s.d.length), 2);
                int i3 = Q.w;
                int i4 = Q.x;
                int i5 = Q.y;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!sg3.e(obj, s.d[i3])) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            n = s.k(i3, yf5);
                            break;
                        }
                    }
                }
                n = s;
            } else {
                n = s.n(i, obj, i2 + 5, yf5);
            }
            return q(s, n, t, k, yf5.x);
        }
        return this;
    }

    public final rn7 o(int i, Object obj, Object obj2, int i2, yf5 yf5) {
        yf5 yf52;
        rn7 o;
        int k = 1 << k75.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (!sg3.e(obj, this.d[f]) || !sg3.e(obj2, x(f))) {
                return this;
            }
            return p(f, k, yf5);
        } else if (!i(k)) {
            return this;
        } else {
            Object obj3 = obj2;
            int t = t(k);
            rn7 s = s(t);
            if (i2 == 30) {
                pe3 Q = z65.Q(z65.V(0, s.d.length), 2);
                int i3 = Q.w;
                int i4 = Q.x;
                int i5 = Q.y;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!sg3.e(obj, s.d[i3]) || !sg3.e(obj3, s.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            o = s.k(i3, yf5);
                            break;
                        }
                    }
                    yf52 = yf5;
                }
                o = s;
                yf52 = yf5;
            } else {
                yf52 = yf5;
                o = s.o(i, obj, obj3, i2 + 5, yf52);
            }
            rn7 rn7 = o;
            return q(s, rn7, t, k, yf52.x);
        }
    }

    public final rn7 p(int i, int i2, yf5 yf5) {
        yf5.e(yf5.B - 1);
        yf5.z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == yf5.x) {
            this.d = k75.e(i, objArr);
            this.a ^= i2;
            return this;
        }
        return new rn7(i2 ^ this.a, this.b, k75.e(i, objArr), yf5.x);
    }

    public final rn7 q(rn7 rn7, rn7 rn72, int i, int i2, jv2 jv2) {
        jv2 jv22 = this.c;
        if (rn72 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (jv22 == jv2) {
                this.d = k75.f(i, objArr);
                this.b ^= i2;
                return this;
            }
            return new rn7(this.a, this.b ^ i2, k75.f(i, objArr), jv2);
        } else if (jv22 == jv2 || rn7 != rn72) {
            return r(i, rn72, jv2);
        } else {
            return this;
        }
    }

    public final rn7 r(int i, rn7 rn7, jv2 jv2) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && rn7.d.length == 2 && rn7.b == 0) {
            rn7.a = this.b;
            return rn7;
        } else if (this.c == jv2) {
            objArr[i] = rn7;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = rn7;
            return new rn7(this.a, this.b, copyOf, jv2);
        }
    }

    public final rn7 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (rn7) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        if (r15 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (r15 == null) goto L_0x00d1;
     */
    public final qa u(Object obj, int i, Object obj2, int i2) {
        qa qaVar;
        int i3 = i;
        Object obj3 = obj2;
        int i4 = i2;
        int k = 1 << k75.k(i3, i4);
        if (h(k)) {
            int f = f(k);
            if (!sg3.e(obj, this.d[f])) {
                return new qa(1, 11, new rn7(this.a ^ k, this.b | k, a(f, k, i3, obj, obj3, i4, (jv2) null), (jv2) null));
            } else if (x(f) != obj3) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj3;
                return new qa(0, 11, new rn7(this.a, this.b, copyOf, (jv2) null));
            }
        } else if (i(k)) {
            int t = t(k);
            rn7 s = s(t);
            if (i4 == 30) {
                pe3 Q = z65.Q(z65.V(0, s.d.length), 2);
                int i5 = Q.w;
                int i6 = Q.x;
                int i7 = Q.y;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        if (!sg3.e(obj, s.d[i5])) {
                            if (i5 == i6) {
                                break;
                            }
                            i5 += i7;
                        } else if (obj3 == s.x(i5)) {
                            qaVar = null;
                        } else {
                            Object[] objArr2 = s.d;
                            Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            copyOf2[i5 + 1] = obj3;
                            qaVar = new qa(0, 11, new rn7(0, 0, copyOf2, (jv2) null));
                        }
                    }
                }
                qaVar = new qa(1, 11, new rn7(0, 0, k75.d(s.d, 0, obj, obj3), (jv2) null));
            } else {
                qaVar = s.u(obj, i3, obj3, i4 + 5);
            }
            qaVar.y = w(t, k, (rn7) qaVar.y);
            return qaVar;
        } else {
            return new qa(1, 11, new rn7(k | this.a, this.b, k75.d(this.d, f(k), obj, obj3), (jv2) null));
        }
        return null;
    }

    public final rn7 v(int i, int i2, Object obj) {
        rn7 rn7;
        int k = 1 << k75.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (!sg3.e(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new rn7(this.a ^ k, this.b, k75.e(f, objArr), (jv2) null);
            }
        } else if (!i(k)) {
            return this;
        } else {
            int t = t(k);
            rn7 s = s(t);
            if (i2 == 30) {
                pe3 Q = z65.Q(z65.V(0, s.d.length), 2);
                int i3 = Q.w;
                int i4 = Q.x;
                int i5 = Q.y;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!sg3.e(obj, s.d[i3])) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = s.d;
                            if (objArr2.length == 2) {
                                rn7 = null;
                            } else {
                                rn7 = new rn7(0, 0, k75.e(i3, objArr2), (jv2) null);
                            }
                        }
                    }
                }
                rn7 = s;
            } else {
                rn7 = s.v(i, i2 + 5, obj);
            }
            if (rn7 == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new rn7(this.a, this.b ^ k, k75.f(t, objArr3), (jv2) null);
                }
            } else if (s != rn7) {
                return w(t, k, rn7);
            } else {
                return this;
            }
        }
        return null;
    }

    public final rn7 w(int i, int i2, rn7 rn7) {
        Object[] objArr = rn7.d;
        if (objArr.length != 2 || rn7.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = rn7;
            return new rn7(this.a, this.b, copyOf, (jv2) null);
        } else if (this.d.length == 1) {
            rn7.a = this.b;
            return rn7;
        } else {
            int f = f(i2);
            Object[] objArr3 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
            qs.K0(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
            qs.K0(f + 2, f, i, copyOf2, copyOf2);
            copyOf2[f] = obj;
            copyOf2[f + 1] = obj2;
            return new rn7(this.a ^ i2, this.b ^ i2, copyOf2, (jv2) null);
        }
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
