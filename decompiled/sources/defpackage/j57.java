package defpackage;

/* renamed from: j57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j57 extends i57 {
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[LOOP:1: B:8:0x001a->B:11:0x0022, LOOP_START, PHI: r1 
      PHI: (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:6:0x0017, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final boolean h0(String str) {
        int i;
        boolean z;
        boolean z2;
        char charAt;
        char c;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        String str2;
        boolean z5;
        boolean z6;
        String str3 = str;
        boolean z7 = true;
        int length = str3.length() - 1;
        int i4 = 0;
        while (true) {
            char c2 = ' ';
            if (i4 <= length && str3.charAt(i4) <= ' ') {
                i4++;
            } else if (i4 <= length) {
                return false;
            } else {
                while (length > i4 && str3.charAt(length) <= ' ') {
                    length--;
                }
                if (str3.charAt(i4) == '+' || str3.charAt(i4) == '-') {
                    i4++;
                }
                if (i > length) {
                    return false;
                }
                if (str3.charAt(i) == '0') {
                    int i5 = i + 1;
                    if (i5 > length) {
                        return true;
                    }
                    if ((str3.charAt(i5) | ' ') == 'x') {
                        int i6 = i + 2;
                        int i7 = i6;
                        while (true) {
                            if (i7 > length) {
                                z = z7;
                                break;
                            }
                            char charAt2 = str3.charAt(i7);
                            z = z7;
                            if (((charAt2 - '0') & 65535) >= 10 && (((charAt2 | ' ') - 'a') & 65535) >= 6) {
                                break;
                            }
                            i7++;
                            z7 = z;
                        }
                        if (i6 != i7) {
                            z5 = z;
                        } else {
                            z5 = false;
                        }
                        if (i7 <= length) {
                            if (str3.charAt(i7) == '.') {
                                int i8 = i7 + 1;
                                int i9 = i8;
                                while (true) {
                                    if (i9 > length) {
                                        char c3 = c2;
                                        break;
                                    }
                                    char charAt3 = str3.charAt(i9);
                                    char c4 = c2;
                                    if (((charAt3 - '0') & 65535) >= 10 && (((charAt3 | ' ') - 'a') & 65535) >= 6) {
                                        break;
                                    }
                                    i9++;
                                    c2 = c4;
                                }
                                if (i8 != i9) {
                                    z6 = z;
                                } else {
                                    z6 = false;
                                }
                                i7 = i9;
                            } else {
                                z6 = false;
                            }
                            if (z5 || z6) {
                                i = i7;
                                if (i != -1 || i > length) {
                                    return false;
                                }
                                z2 = z;
                                if (!z2) {
                                    int i10 = i;
                                    while (i10 <= length && ((str3.charAt(i10) - '0') & 65535) < 10) {
                                        i10++;
                                    }
                                    if (i != i10) {
                                        z3 = z;
                                    } else {
                                        z3 = false;
                                    }
                                    if (i10 > length) {
                                        i3 = i10;
                                    } else {
                                        if (str3.charAt(i10) == '.') {
                                            int i11 = i10 + 1;
                                            i2 = i11;
                                            while (i2 <= length && ((str3.charAt(i2) - '0') & 65535) < 10) {
                                                i2++;
                                            }
                                            if (i11 != i2) {
                                                z4 = z;
                                                if (!z3 || z4) {
                                                    i3 = i2;
                                                } else {
                                                    if (length == i2 + 2) {
                                                        str2 = "NaN";
                                                    } else if (length == i2 + 7) {
                                                        str2 = "Infinity";
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (str2 != null && d57.D0(str3, str2, i2, false) == i2) {
                                                        i3 = length + 1;
                                                    } else {
                                                        i3 = -1;
                                                    }
                                                }
                                            }
                                        } else {
                                            i2 = i10;
                                        }
                                        z4 = false;
                                        if (!z3) {
                                        }
                                        i3 = i2;
                                    }
                                    if (i == -1) {
                                        return false;
                                    }
                                    if (i > length) {
                                        return z;
                                    }
                                }
                                int i12 = i + 1;
                                charAt = str3.charAt(i) | ' ';
                                if (!z2) {
                                    c = 'p';
                                } else {
                                    c = 'e';
                                }
                                if (charAt == c) {
                                    if (z2 || ((charAt != 'f' && charAt != 'd') || i12 <= length)) {
                                        return false;
                                    }
                                    return z;
                                } else if (i12 > length) {
                                    return false;
                                } else {
                                    if ((str3.charAt(i12) == '+' || str3.charAt(i12) == '-') && (i12 = i + 2) > length) {
                                        return false;
                                    }
                                    while (i12 <= length && ((str3.charAt(i12) - '0') & 65535) < 10) {
                                        i12++;
                                    }
                                    if (i12 > length) {
                                        return z;
                                    }
                                    if (i12 != length) {
                                        return false;
                                    }
                                    char charAt4 = str3.charAt(i12) | ' ';
                                    if (charAt4 == 'f' || charAt4 == 'd') {
                                        return z;
                                    }
                                    return false;
                                }
                            }
                        }
                        i = -1;
                        if (i != -1) {
                        }
                        return false;
                    }
                }
                z = true;
                z2 = false;
                if (!z2) {
                }
                int i122 = i + 1;
                charAt = str3.charAt(i) | ' ';
                if (!z2) {
                }
                if (charAt == c) {
                }
            }
        }
        if (i4 <= length) {
        }
    }

    public static Double i0(String str) {
        str.getClass();
        try {
            if (h0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
