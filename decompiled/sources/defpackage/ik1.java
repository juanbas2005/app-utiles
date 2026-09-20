package defpackage;

import com.google.zxing.FormatException;
import java.math.BigInteger;

/* renamed from: ik1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ik1 {
    public static final char[] a = {';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', '!', 13, 9, ',', ':', 10, '-', '.', '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\''};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', 13, 9, ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^'};
    public static final BigInteger[] c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    public static String a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(c[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.a();
    }

    public static int b(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i >= i3 || z) {
                return i;
            }
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i4 == i3) {
                z = true;
            }
            if (i5 < 900) {
                iArr2[i2] = i5;
                i2++;
            } else {
                if (!(i5 == 900 || i5 == 901 || i5 == 928)) {
                    switch (i5) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                z = true;
                if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                    sb.append(a(iArr2, i2));
                    i2 = 0;
                }
            }
            i = i4;
            sb.append(a(iArr2, i2));
            i2 = 0;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        if (r12 != 900) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d2, code lost:
        r11 = r8;
        r8 = 6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0134 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0131  */
    public static int c(int[] iArr, int i, StringBuilder sb) {
        char c2;
        char c3;
        int i2;
        StringBuilder sb2 = sb;
        int i3 = 1;
        int i4 = (iArr[0] - i) << 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int i5 = i;
        boolean z = false;
        int i6 = 0;
        while (i5 < iArr[0] && !z) {
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            if (i8 < 900) {
                iArr2[i6] = i8 / 30;
                iArr2[i6 + 1] = i8 % 30;
                i6 += 2;
            } else if (i8 != 913) {
                if (i8 != 928) {
                    switch (i8) {
                        case 900:
                            iArr2[i6] = 900;
                            i6++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i8) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                z = true;
            } else {
                iArr2[i6] = 913;
                i5 += 2;
                iArr3[i6] = iArr[i7];
                i6++;
            }
            i5 = i7;
        }
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        while (i9 < i6) {
            int i12 = iArr2[i9];
            int B = b81.B(i10);
            char c4 = ' ';
            if (B != 0) {
                if (B != i3) {
                    if (B != 2) {
                        char[] cArr = a;
                        if (B != 3) {
                            if (B != 4) {
                                if (B == 5) {
                                    if (i12 < 29) {
                                        c4 = cArr[i12];
                                    } else if (!(i12 == 29 || i12 == 900)) {
                                        if (i12 == 913) {
                                            sb2.append((char) iArr3[i9]);
                                        }
                                        i10 = i11;
                                    }
                                }
                                c3 = 913;
                                c2 = 0;
                                if (c2 == 0) {
                                    sb2.append(c2);
                                }
                                i9++;
                                char c5 = c3;
                                i3 = 1;
                            } else if (i12 < 26) {
                                c2 = (char) (i12 + 65);
                                i10 = i11;
                            } else if (i12 != 26) {
                            }
                            i10 = i11;
                        } else if (i12 < 29) {
                            c4 = cArr[i12];
                        } else if (!(i12 == 29 || i12 == 900)) {
                            if (i12 == 913) {
                                sb2.append((char) iArr3[i9]);
                            }
                            c3 = 913;
                            c2 = 0;
                            if (c2 == 0) {
                            }
                            i9++;
                            char c52 = c3;
                            i3 = 1;
                        }
                    } else if (i12 < 25) {
                        c4 = b[i12];
                    } else if (i12 != 900) {
                        if (i12 != 913) {
                            switch (i12) {
                                case 25:
                                    i10 = 4;
                                    break;
                                case 26:
                                    break;
                                case 27:
                                    i10 = 2;
                                    break;
                                case 28:
                                    break;
                                case 29:
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i9]);
                        }
                        c3 = 913;
                        c2 = 0;
                        if (c2 == 0) {
                        }
                        i9++;
                        char c522 = c3;
                        i3 = 1;
                    }
                    c3 = 913;
                    c2 = 0;
                    i10 = 1;
                    if (c2 == 0) {
                    }
                    i9++;
                    char c5222 = c3;
                    i3 = 1;
                } else if (i12 < 26) {
                    i2 = i12 + 97;
                    c2 = (char) i2;
                } else {
                    if (i12 != 900) {
                        if (i12 != 913) {
                            switch (i12) {
                                case 26:
                                    break;
                                case 27:
                                    i11 = i10;
                                    c2 = 0;
                                    i10 = 5;
                                    break;
                                case 28:
                                    i10 = 3;
                                    break;
                                case 29:
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i9]);
                        }
                        c3 = 913;
                        c2 = 0;
                        if (c2 == 0) {
                        }
                        i9++;
                        char c52222 = c3;
                        i3 = 1;
                    }
                    i10 = 1;
                    c3 = 913;
                    c2 = 0;
                    if (c2 == 0) {
                    }
                    i9++;
                    char c522222 = c3;
                    i3 = 1;
                }
                c2 = c4;
            } else if (i12 < 26) {
                i2 = i12 + 65;
                c2 = (char) i2;
            } else {
                if (i12 != 900) {
                    c3 = 913;
                    if (i12 != 913) {
                        switch (i12) {
                            case 26:
                                c2 = ' ';
                                break;
                            case 27:
                                i10 = 2;
                                break;
                            case 28:
                                i10 = 3;
                                break;
                            case 29:
                                i11 = i10;
                                i10 = 6;
                                break;
                        }
                    } else {
                        sb2.append((char) iArr3[i9]);
                    }
                } else {
                    c3 = 913;
                    i10 = 1;
                }
                c2 = 0;
                if (c2 == 0) {
                }
                i9++;
                char c5222222 = c3;
                i3 = 1;
            }
            c3 = 913;
            if (c2 == 0) {
            }
            i9++;
            char c52222222 = c3;
            i3 = 1;
        }
        return i5;
    }
}
