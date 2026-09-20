package defpackage;

import java.nio.charset.StandardCharsets;

/* renamed from: ln8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ln8 {
    static {
        int i = rk8.a;
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        while (r9 < i2 && bArr[r9] >= 0) {
            i = r9 + 1;
        }
        if (r9 >= i2) {
            return true;
        }
        while (r9 < i2) {
            int i3 = r9 + 1;
            byte b = bArr[r9];
            if (b >= 0) {
                r9 = i3;
            } else if (b < -32) {
                if (i3 < i2 && b >= -62) {
                    r9 += 2;
                    if (bArr[i3] > -65) {
                    }
                }
                return false;
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i4 = r9 + 2;
                byte b2 = bArr[i3];
                if (b2 > -65 || (b == -32 && b2 < -96)) {
                    return false;
                }
                if (b == -19 && b2 >= -96) {
                    return false;
                }
                r9 += 3;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else if (i3 >= i2 - 2) {
                return false;
            } else {
                int i5 = r9 + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65) {
                    if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                        int i6 = r9 + 3;
                        if (bArr[i5] <= -65) {
                            r9 += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) >= 65536) {
                                    i2++;
                                } else {
                                    throw new Exception(mj2.c(length2, i2, (byte) 32, "Unpaired surrogate at index ", " of "));
                                }
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (kn8 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    public static int c(String str, byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        char charAt;
        int length2 = str.length();
        int i5 = 0;
        while (true) {
            int i6 = i + i2;
            if (i5 < length2 && (i4 = i5 + i) < i6 && (charAt = str.charAt(i5)) < 128) {
                bArr[i4] = (byte) charAt;
                i5++;
            } else if (i5 != length2) {
                return i + length2;
            } else {
                int i7 = i + i5;
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 128 && i7 < i6) {
                        bArr[i7] = (byte) charAt2;
                        i7++;
                    } else if (charAt2 < 2048 && i7 <= i6 - 2) {
                        bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                        bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        i7 += 2;
                    } else if ((charAt2 < 55296 || charAt2 > 57343) && i7 <= i6 - 3) {
                        bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                        bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                        i7 += 3;
                    } else {
                        if (i7 <= i6 - 4) {
                            i5++;
                            if (i5 != str.length()) {
                                char charAt3 = str.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int i8 = i7 + 3;
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i7 += 4;
                                    bArr[i8] = (byte) ((codePoint & 63) | 128);
                                }
                            }
                            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                            length = bytes.length;
                            if (length - i <= i2) {
                                System.arraycopy(bytes, 0, bArr, i, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                            }
                        } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i5 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        } else {
                            byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                            length = bytes2.length;
                            if (length - i <= i2) {
                                System.arraycopy(bytes2, 0, bArr, i, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                            }
                        }
                        return i + length;
                    }
                    i5++;
                }
                return i7;
            }
        }
        if (i5 != length2) {
        }
    }

    public static String d(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte b = bArr[r12];
                if (b < 0) {
                    break;
                }
                i = r12 + 1;
                cArr[i3] = (char) b;
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (b2 >= 0) {
                    cArr[i3] = (char) b2;
                    i3++;
                    r12 = i6;
                    while (r12 < i4) {
                        byte b3 = bArr[r12];
                        if (b3 < 0) {
                            break;
                        }
                        r12++;
                        cArr[i3] = (char) b3;
                        i3++;
                    }
                } else if (b2 < -32) {
                    if (i6 < i4) {
                        int i7 = i3 + 1;
                        r12 += 2;
                        byte b4 = bArr[i6];
                        if (b2 < -62 || b35.H(b4)) {
                            zz8.b("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        cArr[i3] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                        i3 = i7;
                    } else {
                        zz8.b("Protocol message had invalid UTF-8.");
                        return null;
                    }
                } else if (b2 < -16) {
                    if (i6 < i4 - 1) {
                        int i8 = i3 + 1;
                        int i9 = r12 + 2;
                        byte b5 = bArr[i6];
                        r12 += 3;
                        byte b6 = bArr[i9];
                        if (!b35.H(b5)) {
                            if (b2 == -32) {
                                if (b5 >= -96) {
                                    b2 = -32;
                                }
                            }
                            if (b2 == -19) {
                                if (b5 < -96) {
                                    b2 = -19;
                                }
                            }
                            if (!b35.H(b6)) {
                                cArr[i3] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                                i3 = i8;
                            }
                        }
                        zz8.b("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    zz8.b("Protocol message had invalid UTF-8.");
                    return null;
                } else if (i6 < i4 - 2) {
                    byte b7 = bArr[i6];
                    int i10 = r12 + 3;
                    byte b8 = bArr[r12 + 2];
                    r12 += 4;
                    byte b9 = bArr[i10];
                    if (!b35.H(b7)) {
                        if ((((b7 + 112) + (b2 << 28)) >> 30) == 0 && !b35.H(b8) && !b35.H(b9)) {
                            byte b10 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                            cArr[i3] = (char) ((b10 >>> 10) + 55232);
                            cArr[i3 + 1] = (char) ((b10 & 1023) + 56320);
                            i3 += 2;
                        }
                    }
                    zz8.b("Protocol message had invalid UTF-8.");
                    return null;
                } else {
                    zz8.b("Protocol message had invalid UTF-8.");
                    return null;
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}
