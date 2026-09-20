package defpackage;

/* renamed from: b  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b {
    public static final byte[] a;
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    static {
        byte[] bytes = "0123456789abcdef".getBytes(mo0.a);
        bytes.getClass();
        a = bytes;
    }

    public static final long a(sc0 sc0, dg0 dg0, long j, long j2, int i) {
        qi6 qi6;
        sc0 sc02 = sc0;
        long j3 = j;
        long j4 = j2;
        int i2 = i;
        dg0.getClass();
        long j5 = (long) i2;
        t49.x((long) dg0.d(), 0, j5);
        if (i2 <= 0) {
            h.q("byteCount == 0");
            return 0;
        } else if (j3 < 0) {
            h.j(f21.f(j3, "fromIndex < 0: "));
            return 0;
        } else if (j3 <= j4) {
            long j6 = sc02.x;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 == j4 || (qi6 = sc02.w) == null) {
                return -1;
            }
            long j7 = 0;
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    qi6 = qi6.g;
                    qi6.getClass();
                    j6 -= (long) (qi6.c - qi6.b);
                }
                byte[] h = dg0.h();
                byte b2 = h[0];
                long min = Math.min(j4, (sc02.x - j5) + 1);
                while (j6 < min) {
                    byte[] bArr = qi6.a;
                    int min2 = (int) Math.min((long) qi6.c, (((long) qi6.b) + min) - j6);
                    for (int i3 = (int) ((((long) qi6.b) + j3) - j6); i3 < min2; i3++) {
                        if (bArr[i3] == b2 && b(qi6, i3 + 1, h, 1, i2)) {
                            return ((long) (i3 - qi6.b)) + j6;
                        }
                    }
                    j6 += (long) (qi6.c - qi6.b);
                    qi6 = qi6.f;
                    qi6.getClass();
                    j3 = j6;
                }
                return -1;
            }
            while (true) {
                long j8 = j7 + ((long) (qi6.c - qi6.b));
                if (j8 > j3) {
                    break;
                }
                qi6 = qi6.f;
                qi6.getClass();
                j7 = j8;
            }
            byte[] h2 = dg0.h();
            byte b3 = h2[0];
            long min3 = Math.min(j4, (sc02.x - j5) + 1);
            while (j7 < min3) {
                byte[] bArr2 = qi6.a;
                int min4 = (int) Math.min((long) qi6.c, (((long) qi6.b) + min3) - j7);
                for (int i4 = (int) ((((long) qi6.b) + j3) - j7); i4 < min4; i4++) {
                    if (bArr2[i4] == b3 && b(qi6, i4 + 1, h2, 1, i2)) {
                        return ((long) (i4 - qi6.b)) + j7;
                    }
                }
                j7 += (long) (qi6.c - qi6.b);
                qi6 = qi6.f;
                qi6.getClass();
                j3 = j7;
            }
            return -1;
        } else {
            StringBuilder q = hl6.q(j3, "fromIndex > toIndex: ", " > ");
            q.append(j4);
            throw new IllegalArgumentException(q.toString().toString());
        }
    }

    public static final boolean b(qi6 qi6, int i, byte[] bArr, int i2, int i3) {
        int i4 = qi6.c;
        byte[] bArr2 = qi6.a;
        while (i2 < i3) {
            if (i == i4) {
                qi6 = qi6.f;
                qi6.getClass();
                byte[] bArr3 = qi6.a;
                int i5 = qi6.b;
                bArr2 = bArr3;
                i = i5;
                i4 = qi6.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(long j, sc0 sc0) {
        if (j > 0) {
            long j2 = j - 1;
            if (sc0.u(j2) == 13) {
                String I = sc0.I(j2, mo0.a);
                sc0.skip(2);
                return I;
            }
        }
        String I2 = sc0.I(j, mo0.a);
        sc0.skip(1);
        return I2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r18 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return -2;
     */
    public static final int d(sc0 sc0, u75 u75, boolean z) {
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        qi6 qi6;
        u75.getClass();
        qi6 qi62 = sc0.w;
        if (qi62 != null) {
            byte[] bArr = qi62.a;
            int i5 = qi62.b;
            int i6 = qi62.c;
            int[] iArr = u75.x;
            qi6 qi63 = qi62;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i8 + 2;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (qi63 == null) {
                    break;
                }
                if (i10 >= 0) {
                    int i13 = i5 + 1;
                    byte b2 = bArr[i5] & 255;
                    int i14 = i11 + i10;
                    while (i11 != i14) {
                        if (b2 == iArr[i11]) {
                            i3 = iArr[i11 + i10];
                            if (i13 == i6) {
                                qi63 = qi63.f;
                                qi63.getClass();
                                int i15 = qi63.b;
                                byte[] bArr2 = qi63.a;
                                i = qi63.c;
                                if (qi63 == qi62) {
                                    byte[] bArr3 = bArr2;
                                    i2 = i15;
                                    bArr = bArr3;
                                    qi63 = null;
                                } else {
                                    byte[] bArr4 = bArr2;
                                    i2 = i15;
                                    bArr = bArr4;
                                }
                            } else {
                                i = i6;
                                i2 = i13;
                            }
                        } else {
                            i11++;
                        }
                    }
                    break loop0;
                }
                int i16 = (i10 * -1) + i11;
                while (true) {
                    int i17 = i5 + 1;
                    int i18 = i11 + 1;
                    if ((bArr[i5] & 255) != iArr[i11]) {
                        break loop0;
                    }
                    if (i18 == i16) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i17 == i6) {
                        qi63.getClass();
                        qi6 qi64 = qi63.f;
                        qi64.getClass();
                        i2 = qi64.b;
                        byte[] bArr5 = qi64.a;
                        i4 = qi64.c;
                        if (qi64 == qi62) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr5;
                            qi6 = null;
                        } else {
                            byte[] bArr6 = bArr5;
                            qi6 = qi64;
                            bArr = bArr6;
                        }
                    } else {
                        qi6 = qi63;
                        i4 = i6;
                        i2 = i17;
                    }
                    if (z2) {
                        i3 = iArr[i18];
                        int i19 = i4;
                        qi63 = qi6;
                        i = i19;
                        break;
                    }
                    i5 = i2;
                    i6 = i4;
                    qi63 = qi6;
                    i11 = i18;
                }
                if (i3 >= 0) {
                    return i3;
                }
                int i20 = i;
                i8 = -i3;
                i5 = i2;
                i6 = i20;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }
}
