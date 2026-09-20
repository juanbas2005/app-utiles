package defpackage;

/* renamed from: o08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o08 extends n85 {
    public final /* synthetic */ int l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o08(int i) {
        super(12);
        this.l = i;
    }

    public static int r(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            n85 n85 = s08.a;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 == 1) {
            return s08.c(i, st7.g(bArr, j));
        } else {
            if (i2 == 2) {
                return s08.d(i, st7.g(bArr, j), st7.g(bArr, j + 1));
            }
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0184  */
    public final int d(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        long j;
        int i4;
        char charAt2;
        String str2 = str;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        char c = 2048;
        char c2 = 55296;
        switch (this.l) {
            case b85.b:
                int length = str2.length();
                int i7 = i6 + i5;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8 + i5;
                    if (i9 < i7 && (charAt = str2.charAt(i8)) < 128) {
                        bArr2[i9] = (byte) charAt;
                        i8++;
                    }
                    if (i8 != length) {
                        return i5 + length;
                    }
                    int i10 = i5 + i8;
                    while (i8 < length) {
                        char charAt3 = str2.charAt(i8);
                        if (charAt3 < 128 && i10 < i7) {
                            bArr2[i10] = (byte) charAt3;
                            i10++;
                        } else if (charAt3 < 2048 && i10 <= i7 - 2) {
                            int i11 = i10 + 1;
                            bArr2[i10] = (byte) ((charAt3 >>> 6) | 960);
                            i10 += 2;
                            bArr2[i11] = (byte) ((charAt3 & '?') | 128);
                        } else if ((charAt3 < 55296 || 57343 < charAt3) && i10 <= i7 - 3) {
                            bArr2[i10] = (byte) ((charAt3 >>> 12) | 480);
                            int i12 = i10 + 2;
                            bArr2[i10 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i10 += 3;
                            bArr2[i12] = (byte) ((charAt3 & '?') | 128);
                        } else if (i10 <= i7 - 4) {
                            int i13 = i8 + 1;
                            if (i13 != str2.length()) {
                                char charAt4 = str2.charAt(i13);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr2[i10] = (byte) ((codePoint >>> 18) | 240);
                                    bArr2[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i10 + 3;
                                    bArr2[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArr2[i14] = (byte) ((codePoint & 63) | 128);
                                    i8 = i13;
                                } else {
                                    i8 = i13;
                                }
                            }
                            throw new q08(i8 - 1, length);
                        } else if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i8 + 1) != str2.length() && Character.isSurrogatePair(charAt3, str2.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i10);
                        } else {
                            throw new q08(i8, length);
                        }
                        i8++;
                    }
                    return i10;
                }
                if (i8 != length) {
                }
                break;
            default:
                long j2 = (long) i5;
                long j3 = ((long) i6) + j2;
                int length2 = str2.length();
                if (length2 > i6 || bArr2.length - i6 < i5) {
                    char charAt5 = str2.charAt(length2 - 1);
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + (i5 + i6));
                }
                int i15 = 0;
                while (i15 < length2 && (charAt2 = str2.charAt(i15)) < 128) {
                    st7.k(bArr2, j, (byte) charAt2);
                    i15++;
                    j2 = j + 1;
                }
                if (i15 != length2) {
                    while (i15 < length2) {
                        char charAt6 = str2.charAt(i15);
                        if (charAt6 < 128 && j < j3) {
                            st7.k(bArr2, j, (byte) charAt6);
                            j++;
                        } else if (charAt6 >= c || j > j3 - 2) {
                            int i16 = i15;
                            if ((charAt6 < c2 || 57343 < charAt6) && j <= j3 - 3) {
                                st7.k(bArr2, j, (byte) ((charAt6 >>> 12) | 480));
                                long j4 = j + 2;
                                st7.k(bArr2, j + 1, (byte) (((charAt6 >>> 6) & 63) | 128));
                                j += 3;
                                st7.k(bArr2, j4, (byte) ((charAt6 & '?') | 128));
                                i15 = i16;
                            } else {
                                int i17 = i16;
                                if (j <= j3 - 4) {
                                    i15 = i17 + 1;
                                    if (i15 != length2) {
                                        char charAt7 = str2.charAt(i15);
                                        if (Character.isSurrogatePair(charAt6, charAt7)) {
                                            int codePoint2 = Character.toCodePoint(charAt6, charAt7);
                                            st7.k(bArr2, j, (byte) ((codePoint2 >>> 18) | 240));
                                            int i18 = codePoint2;
                                            st7.k(bArr2, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j5 = j + 3;
                                            st7.k(bArr2, j + 2, (byte) (((i18 >>> 6) & 63) | 128));
                                            j += 4;
                                            st7.k(bArr2, j5, (byte) ((i18 & 63) | 128));
                                        }
                                    } else {
                                        i15 = i17;
                                    }
                                    throw new q08(i15 - 1, length2);
                                } else if (55296 > charAt6 || charAt6 > 57343 || ((i4 = i17 + 1) != length2 && Character.isSurrogatePair(charAt6, str2.charAt(i4)))) {
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt6 + " at index " + j);
                                } else {
                                    throw new q08(i17, length2);
                                }
                            }
                        } else {
                            long j6 = j + 1;
                            st7.k(bArr2, j, (byte) ((charAt6 >>> 6) | 960));
                            j += 2;
                            st7.k(bArr2, j6, (byte) ((charAt6 & '?') | 128));
                            i15 = i15;
                        }
                        i15++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }

    public final int m(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        switch (this.l) {
            case b85.b:
                break;
            default:
                if ((i5 | i6 | (bArr2.length - i6)) >= 0) {
                    long j2 = (long) i5;
                    int i7 = (int) (((long) i6) - j2);
                    if (i7 < 16) {
                        j = 1;
                        i4 = 0;
                    } else {
                        int i8 = 8 - (((int) j2) & 7);
                        long j3 = j2;
                        j = 1;
                        i4 = 0;
                        while (true) {
                            if (i4 < i8) {
                                long j4 = j3 + 1;
                                if (st7.g(bArr2, j3) >= 0) {
                                    i4++;
                                    j3 = j4;
                                }
                            } else {
                                while (true) {
                                    int i9 = i4 + 8;
                                    if (i9 <= i7) {
                                        int i10 = i9;
                                        if ((st7.c.h(st7.f + j3, bArr2) & -9187201950435737472L) == 0) {
                                            j3 += 8;
                                            i4 = i10;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i4 < i7) {
                                        long j5 = j3 + 1;
                                        if (st7.g(bArr2, j3) >= 0) {
                                            i4++;
                                            j3 = j5;
                                        }
                                    } else {
                                        i4 = i7;
                                    }
                                }
                            }
                        }
                    }
                    int i11 = i7 - i4;
                    long j6 = j2 + ((long) i4);
                    while (true) {
                        byte b = 0;
                        while (true) {
                            if (i11 > 0) {
                                long j7 = j6 + j;
                                b = st7.g(bArr2, j6);
                                if (b >= 0) {
                                    i11--;
                                    j6 = j7;
                                } else {
                                    j6 = j7;
                                }
                            }
                        }
                        if (i11 == 0) {
                            return 0;
                        }
                        int i12 = i11 - 1;
                        if (b < -32) {
                            if (i12 == 0) {
                                return b;
                            }
                            i11 -= 2;
                            if (b >= -62) {
                                long j8 = j6 + j;
                                if (st7.g(bArr2, j6) <= -65) {
                                    j6 = j8;
                                }
                            }
                        } else if (b < -16) {
                            if (i12 < 2) {
                                return r(j6, bArr2, b, i12);
                            }
                            i11 -= 3;
                            long j9 = j6 + j;
                            byte g = st7.g(bArr2, j6);
                            if (g <= -65 && ((b != -32 || g >= -96) && (b != -19 || g < -96))) {
                                j6 += 2;
                                if (st7.g(bArr2, j9) > -65) {
                                }
                            }
                        } else if (i12 < 3) {
                            return r(j6, bArr2, b, i12);
                        } else {
                            i11 -= 4;
                            long j10 = j6 + j;
                            byte g2 = st7.g(bArr2, j6);
                            if (g2 <= -65) {
                                if ((((g2 + 112) + (b << 28)) >> 30) == 0) {
                                    long j11 = 2 + j6;
                                    if (st7.g(bArr2, j10) <= -65) {
                                        j6 += 3;
                                        if (st7.g(bArr2, j11) > -65) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i5), Integer.valueOf(i6)}));
        }
        while (i3 < i6 && bArr2[i3] >= 0) {
            i5 = i3 + 1;
        }
        if (i3 < i6) {
            while (i3 < i6) {
                int i13 = i3 + 1;
                byte b2 = bArr2[i3];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i13 >= i6) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i3 += 2;
                            if (bArr2[i13] > -65) {
                            }
                        }
                    } else if (b2 < -16) {
                        if (i13 >= i6 - 1) {
                            return s08.a(bArr2, i13, i6);
                        }
                        int i14 = i3 + 2;
                        byte b3 = bArr2[i13];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i3 += 3;
                            if (bArr2[i14] > -65) {
                            }
                        }
                    } else if (i13 >= i6 - 2) {
                        return s08.a(bArr2, i13, i6);
                    } else {
                        int i15 = i3 + 2;
                        byte b4 = bArr2[i13];
                        if (b4 <= -65) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i16 = i3 + 3;
                                if (bArr2[i15] <= -65) {
                                    i3 += 4;
                                    if (bArr2[i16] > -65) {
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                i3 = i13;
            }
        }
        return 0;
    }
}
