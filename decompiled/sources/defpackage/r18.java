package defpackage;

/* renamed from: r18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r18 implements zr3 {
    public static final r18 a = new Object();
    public static final po5 b = new po5("kotlin.uuid.Uuid", no5.t);

    public final Object deserialize(ok1 ok1) {
        String str;
        String t = ok1.t();
        t.getClass();
        int length = t.length();
        int i = 16;
        int i2 = 0;
        if (length == 32) {
            long j = 0;
            while (i2 < 16) {
                long j2 = j << 4;
                char charAt = t.charAt(i2);
                if ((charAt >>> 8) == 0) {
                    long j3 = qz2.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i2++;
                    }
                }
                f55.w(i2, t, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            while (i < 32) {
                long j5 = j4 << 4;
                char charAt2 = t.charAt(i);
                if ((charAt2 >>> 8) == 0) {
                    long j6 = qz2.b[charAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                        i++;
                    }
                }
                f55.w(i, t, "a hexadecimal digit");
                throw null;
            }
            if (!(j == 0 && j4 == 0)) {
                return new p18(j, j4);
            }
        } else if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            if (t.length() <= 64) {
                str = t;
            } else {
                str = t.substring(0, 64).concat("...");
            }
            sb.append(str);
            sb.append("\" of length ");
            sb.append(t.length());
            throw new IllegalArgumentException(sb.toString());
        } else {
            long j7 = 0;
            while (i2 < 8) {
                long j8 = j7 << 4;
                char charAt3 = t.charAt(i2);
                if ((charAt3 >>> 8) == 0) {
                    long j9 = qz2.b[charAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i2++;
                    }
                }
                f55.w(i2, t, "a hexadecimal digit");
                throw null;
            }
            if (t.charAt(8) == '-') {
                int i3 = 9;
                long j10 = 0;
                while (i3 < 13) {
                    long j11 = j10 << 4;
                    char charAt4 = t.charAt(i3);
                    if ((charAt4 >>> 8) == 0) {
                        long j12 = qz2.b[charAt4];
                        if (j12 >= 0) {
                            j10 = j11 | j12;
                            i3++;
                        }
                    }
                    f55.w(i3, t, "a hexadecimal digit");
                    throw null;
                }
                if (t.charAt(13) == '-') {
                    int i4 = 14;
                    long j13 = 0;
                    while (i4 < 18) {
                        long j14 = j13 << 4;
                        char charAt5 = t.charAt(i4);
                        if ((charAt5 >>> 8) == 0) {
                            long j15 = qz2.b[charAt5];
                            if (j15 >= 0) {
                                j13 = j14 | j15;
                                i4++;
                            }
                        }
                        f55.w(i4, t, "a hexadecimal digit");
                        throw null;
                    }
                    if (t.charAt(18) == '-') {
                        int i5 = 19;
                        long j16 = 0;
                        while (i5 < 23) {
                            long j17 = j16 << 4;
                            char charAt6 = t.charAt(i5);
                            if ((charAt6 >>> 8) == 0) {
                                long j18 = qz2.b[charAt6];
                                if (j18 >= 0) {
                                    j16 = j17 | j18;
                                    i5++;
                                }
                            }
                            f55.w(i5, t, "a hexadecimal digit");
                            throw null;
                        }
                        if (t.charAt(23) == '-') {
                            int i6 = 24;
                            long j19 = 0;
                            while (i6 < 36) {
                                long j20 = j19 << 4;
                                char charAt7 = t.charAt(i6);
                                if ((charAt7 >>> 8) == 0) {
                                    long j21 = qz2.b[charAt7];
                                    if (j21 >= 0) {
                                        j19 = j20 | j21;
                                        i6++;
                                    }
                                }
                                f55.w(i6, t, "a hexadecimal digit");
                                throw null;
                            }
                            long j22 = (j7 << 32) | (j10 << 16) | j13;
                            long j23 = (j16 << 48) | j19;
                            if (!(j22 == 0 && j23 == 0)) {
                                return new p18(j22, j23);
                            }
                        } else {
                            f55.w(23, t, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        f55.w(18, t, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    f55.w(13, t, "'-' (hyphen)");
                    throw null;
                }
            } else {
                f55.w(8, t, "'-' (hyphen)");
                throw null;
            }
        }
        return p18.y;
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        p18 p18 = (p18) obj;
        p18.getClass();
        j42.D(p18.toString());
    }
}
