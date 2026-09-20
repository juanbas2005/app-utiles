package defpackage;

/* renamed from: wd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wd3 implements zr3 {
    public static final wd3 a = new Object();
    public static final po5 b = new po5("kotlin.time.Instant", no5.t);

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02af, code lost:
        r5 = defpackage.tf4.f;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b3, code lost:
        if (r13 >= 6) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b5, code lost:
        r14 = r5[r13] + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bc, code lost:
        if (r14 < r0.length()) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02bf, code lost:
        r11 = r0.charAt(r14);
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c7, code lost:
        if ('0' > r11) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02cb, code lost:
        if (r11 >= ':') goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02cd, code lost:
        r13 = r13 + 1;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d3, code lost:
        r1 = defpackage.pb4.o(r14, "Expected an ASCII digit at index ", ", got '");
        r1.append(r0.charAt(r14));
        r1.append('\'');
        r1 = defpackage.tf4.K(r0, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ef, code lost:
        r5 = defpackage.tf4.L(r8 + 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f6, code lost:
        if (r12 <= 3) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f8, code lost:
        r6 = defpackage.tf4.L(r8 + 4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0300, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0302, code lost:
        if (r12 <= 6) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0304, code lost:
        r11 = defpackage.tf4.L(r8 + 7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x030d, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x030f, code lost:
        if (r6 <= 59) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0311, code lost:
        r1 = defpackage.tf4.K(r0, "Expected offset-minute-of-hour in 0..59, got " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0325, code lost:
        if (r11 <= 59) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0327, code lost:
        r1 = defpackage.tf4.K(r0, "Expected offset-second-of-minute in 0..59, got " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x033d, code lost:
        if (r5 <= 17) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0341, code lost:
        if (r5 != 18) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0343, code lost:
        if (r6 != 0) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0345, code lost:
        if (r11 == 0) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0347, code lost:
        r1 = defpackage.tf4.K(r0, "Expected an offset in -18:00..+18:00, got " + r0.subSequence(r8, r0.length()).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0367, code lost:
        r6 = ((r6 * 60) + (r5 * 3600)) + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x036f, code lost:
        if (r3 != '-') goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0371, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0373, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0375, code lost:
        r6 = r6 * r3;
     */
    public final Object deserialize(ok1 ok1) {
        vd3 vd3;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        long j;
        qd3 qd3 = qd3.y;
        String t = ok1.t();
        t.getClass();
        if (t.length() == 0) {
            vd3 = new yt1("An empty string is not a valid Instant", t);
        } else {
            char charAt = t.charAt(0);
            if (charAt == '+' || charAt == '-') {
                i = 1;
            } else {
                i = 0;
                charAt = ' ';
            }
            int i5 = 0;
            int i6 = i;
            while (i6 < t.length() && '0' <= (r10 = t.charAt(i6)) && r10 < ':') {
                i5 = (i5 * 10) + (t.charAt(i6) - '0');
                i6++;
            }
            int i7 = i6 - i;
            if (i7 > 10) {
                vd3 = tf4.K(t, "Expected at most 10 digits for the year number, got " + i7 + " digits");
            } else if (i7 == 10 && t.charAt(i) >= '2') {
                vd3 = tf4.K(t, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
            } else if (i7 < 4) {
                vd3 = tf4.K(t, "The year number must be padded to 4 digits, got " + i7 + " digits");
            } else if (charAt == '+' && i7 == 4) {
                vd3 = tf4.K(t, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt != ' ' || i7 == 4) {
                if (charAt == '-') {
                    i5 = -i5;
                }
                int i8 = i6 + 16;
                if (t.length() < i8) {
                    vd3 = tf4.K(t, "The input string is too short");
                } else {
                    yt1 J = tf4.J(t, new vd2(21), "'-'", i6);
                    if (J != null) {
                        vd3 = J;
                    } else {
                        vd3 = tf4.J(t, new vd2(22), "'-'", i6 + 3);
                        if (vd3 == null && (vd3 = tf4.J(t, new vd2(23), "'T' or 't'", i6 + 6)) == null && (vd3 = tf4.J(t, new vd2(24), "':'", i6 + 9)) == null && (vd3 = tf4.J(t, new vd2(25), "':'", i6 + 12)) == null) {
                            int[] iArr = tf4.d;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= 10) {
                                    int L = tf4.L(i6 + 1, t);
                                    int L2 = tf4.L(i6 + 4, t);
                                    int L3 = tf4.L(i6 + 7, t);
                                    int L4 = tf4.L(i6 + 10, t);
                                    int L5 = tf4.L(i6 + 13, t);
                                    int i10 = i6 + 15;
                                    if (t.charAt(i10) == '.') {
                                        i10 = i8;
                                        int i11 = 0;
                                        while (i10 < t.length() && '0' <= (r5 = t.charAt(i10)) && r5 < ':') {
                                            i11 = (i11 * 10) + (t.charAt(i10) - '0');
                                            i10++;
                                        }
                                        int i12 = i10 - i8;
                                        if (1 > i12 || i12 >= 10) {
                                            vd3 = tf4.K(t, "1..9 digits are supported for the fraction of the second, got " + i12 + " digits");
                                        } else {
                                            i2 = i11 * tf4.c[9 - i12];
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i10 >= t.length()) {
                                        vd3 = tf4.K(t, "The UTC offset at the end of the string is missing");
                                    } else {
                                        char charAt2 = t.charAt(i10);
                                        int i13 = 2;
                                        if (charAt2 == '+' || charAt2 == '-') {
                                            int length = t.length() - i10;
                                            if (length > 9) {
                                                vd3 = tf4.K(t, "The UTC offset string \"" + tf4.R(16, t.subSequence(i10, t.length()).toString()) + "\" is too long");
                                            } else if (length % 3 != 0) {
                                                vd3 = tf4.K(t, "Invalid UTC offset string \"" + t.subSequence(i10, t.length()).toString() + '\"');
                                            } else {
                                                int[] iArr2 = tf4.e;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 >= i13) {
                                                        break;
                                                    }
                                                    int i15 = i10 + iArr2[i14];
                                                    if (i15 >= t.length()) {
                                                        break;
                                                    } else if (t.charAt(i15) != ':') {
                                                        StringBuilder o = pb4.o(i15, "Expected ':' at index ", ", got '");
                                                        o.append(t.charAt(i15));
                                                        o.append('\'');
                                                        vd3 = tf4.K(t, o.toString());
                                                        break;
                                                    } else {
                                                        i14++;
                                                        i13 = 2;
                                                    }
                                                }
                                            }
                                        } else if (charAt2 == 'Z' || charAt2 == 'z') {
                                            int i16 = i10 + 1;
                                            if (t.length() == i16) {
                                                i3 = 0;
                                            } else {
                                                vd3 = tf4.K(t, "Extra text after the instant at position " + i16);
                                            }
                                        } else {
                                            vd3 = tf4.K(t, "Expected the UTC offset at position " + i10 + ", got '" + charAt2 + '\'');
                                        }
                                        if (1 > L || L >= 13) {
                                            vd3 = tf4.K(t, "Expected a month number in 1..12, got " + L);
                                        } else {
                                            if (1 <= L2) {
                                                int i17 = i5 & 3;
                                                if (i17 != 0 || (i5 % 100 == 0 && i5 % 400 != 0)) {
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                if (L != 2) {
                                                    if (L == 4 || L == 6 || L == 9 || L == 11) {
                                                        i4 = 30;
                                                    } else {
                                                        i4 = 31;
                                                    }
                                                } else if (z) {
                                                    i4 = 29;
                                                } else {
                                                    i4 = 28;
                                                }
                                                if (L2 <= i4) {
                                                    if (L3 > 23) {
                                                        vd3 = tf4.K(t, "Expected hour in 0..23, got " + L3);
                                                    } else if (L4 > 59) {
                                                        vd3 = tf4.K(t, "Expected minute-of-hour in 0..59, got " + L4);
                                                    } else if (L5 > 59) {
                                                        vd3 = tf4.K(t, "Expected second-of-minute in 0..59, got " + L5);
                                                    } else {
                                                        long j2 = (long) i5;
                                                        long j3 = 365 * j2;
                                                        if (j2 >= 0) {
                                                            j = ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3;
                                                        } else {
                                                            j = j3 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
                                                        }
                                                        long j4 = j + ((long) (((L * 367) - 362) / 12)) + ((long) (L2 - 1));
                                                        if (L > 2) {
                                                            long j5 = -1 + j4;
                                                            if (i17 != 0 || (i5 % 100 == 0 && i5 % 400 != 0)) {
                                                                j4 -= 2;
                                                            } else {
                                                                j4 = j5;
                                                            }
                                                        }
                                                        vd3 = new ud3((((j4 - 719528) * 86400) + ((long) (((L4 * 60) + (L3 * 3600)) + L5))) - ((long) i3), i2);
                                                    }
                                                }
                                            }
                                            StringBuilder p = pb4.p("Expected a valid day-of-month for month ", L, " of year ", i5, ", got ");
                                            p.append(L2);
                                            vd3 = tf4.K(t, p.toString());
                                        }
                                    }
                                } else {
                                    yt1 J2 = tf4.J(t, new vd2(26), "an ASCII digit", iArr[i9] + i6);
                                    if (J2 != null) {
                                        vd3 = J2;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                    }
                }
            } else {
                vd3 = tf4.K(t, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return vd3.toInstant();
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        qd3 qd3 = (qd3) obj;
        qd3.getClass();
        j42.D(qd3.toString());
    }
}
