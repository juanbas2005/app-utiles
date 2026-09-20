package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: p08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p08 extends o85 {
    public final /* synthetic */ int d;

    public /* synthetic */ p08(int i) {
        this.d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    public final String c(byte[] bArr, int i, int i2) {
        int i3;
        switch (this.d) {
            case b85.b:
                if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                    int i4 = i + i2;
                    char[] cArr = new char[i2];
                    int i5 = 0;
                    while (r11 < i4) {
                        byte b = bArr[r11];
                        if (b >= 0) {
                            i = r11 + 1;
                            cArr[i3] = (char) b;
                            i5 = i3 + 1;
                        } else {
                            while (r11 < i4) {
                                int i6 = r11 + 1;
                                byte b2 = bArr[r11];
                                if (b2 >= 0) {
                                    int i7 = i3 + 1;
                                    cArr[i3] = (char) b2;
                                    while (i6 < i4) {
                                        byte b3 = bArr[i6];
                                        if (b3 >= 0) {
                                            i6++;
                                            cArr[i7] = (char) b3;
                                            i7++;
                                        } else {
                                            i3 = i7;
                                            r11 = i6;
                                        }
                                    }
                                    i3 = i7;
                                    r11 = i6;
                                } else if (b2 < -32) {
                                    if (i6 < i4) {
                                        r11 += 2;
                                        byte b4 = bArr[i6];
                                        int i8 = i3 + 1;
                                        if (b2 < -62 || b85.m(b4)) {
                                            throw InvalidProtocolBufferException.a();
                                        }
                                        cArr[i3] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                        i3 = i8;
                                    } else {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                } else if (b2 < -16) {
                                    if (i6 < i4 - 1) {
                                        int i9 = r11 + 2;
                                        byte b5 = bArr[i6];
                                        r11 += 3;
                                        byte b6 = bArr[i9];
                                        int i10 = i3 + 1;
                                        if (b85.m(b5) || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || b85.m(b6)))) {
                                            throw InvalidProtocolBufferException.a();
                                        }
                                        cArr[i3] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                                        i3 = i10;
                                    } else {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                } else if (i6 < i4 - 2) {
                                    byte b7 = bArr[i6];
                                    int i11 = r11 + 3;
                                    byte b8 = bArr[r11 + 2];
                                    r11 += 4;
                                    byte b9 = bArr[i11];
                                    int i12 = i3 + 1;
                                    if (!b85.m(b7)) {
                                        if ((((b7 + 112) + (b2 << 28)) >> 30) == 0 && !b85.m(b8) && !b85.m(b9)) {
                                            byte b10 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                            cArr[i3] = (char) ((b10 >>> 10) + 55232);
                                            cArr[i12] = (char) ((b10 & 1023) + 56320);
                                            i3 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.a();
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            }
                            return new String(cArr, 0, i3);
                        }
                    }
                    while (r11 < i4) {
                    }
                    return new String(cArr, 0, i3);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            default:
                Charset charset = tf3.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    return str;
                }
                throw InvalidProtocolBufferException.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0184  */
    public final int f(String str, byte[] bArr, int i, int i2) {
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
        switch (this.d) {
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
                            throw new r08(i8 - 1, length);
                        } else if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i8 + 1) != str2.length() && Character.isSurrogatePair(charAt3, str2.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i10);
                        } else {
                            throw new r08(i8, length);
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
                    tt7.j(bArr2, j, (byte) charAt2);
                    i15++;
                    j2 = j + 1;
                }
                if (i15 != length2) {
                    while (i15 < length2) {
                        char charAt6 = str2.charAt(i15);
                        if (charAt6 < 128 && j < j3) {
                            tt7.j(bArr2, j, (byte) charAt6);
                            j++;
                        } else if (charAt6 >= c || j > j3 - 2) {
                            int i16 = i15;
                            if ((charAt6 < c2 || 57343 < charAt6) && j <= j3 - 3) {
                                tt7.j(bArr2, j, (byte) ((charAt6 >>> 12) | 480));
                                long j4 = j + 2;
                                tt7.j(bArr2, j + 1, (byte) (((charAt6 >>> 6) & 63) | 128));
                                j += 3;
                                tt7.j(bArr2, j4, (byte) ((charAt6 & '?') | 128));
                                i15 = i16;
                            } else {
                                int i17 = i16;
                                if (j <= j3 - 4) {
                                    i15 = i17 + 1;
                                    if (i15 != length2) {
                                        char charAt7 = str2.charAt(i15);
                                        if (Character.isSurrogatePair(charAt6, charAt7)) {
                                            int codePoint2 = Character.toCodePoint(charAt6, charAt7);
                                            tt7.j(bArr2, j, (byte) ((codePoint2 >>> 18) | 240));
                                            int i18 = codePoint2;
                                            tt7.j(bArr2, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j5 = j + 3;
                                            tt7.j(bArr2, j + 2, (byte) (((i18 >>> 6) & 63) | 128));
                                            j += 4;
                                            tt7.j(bArr2, j5, (byte) ((i18 & 63) | 128));
                                        }
                                    } else {
                                        i15 = i17;
                                    }
                                    throw new r08(i15 - 1, length2);
                                } else if (55296 > charAt6 || charAt6 > 57343 || ((i4 = i17 + 1) != length2 && Character.isSurrogatePair(charAt6, str2.charAt(i4)))) {
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt6 + " at index " + j);
                                } else {
                                    throw new r08(i17, length2);
                                }
                            }
                        } else {
                            long j6 = j + 1;
                            tt7.j(bArr2, j, (byte) ((charAt6 >>> 6) | 960));
                            j += 2;
                            tt7.j(bArr2, j6, (byte) ((charAt6 & '?') | 128));
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
}
