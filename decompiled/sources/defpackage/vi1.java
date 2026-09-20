package defpackage;

import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.DateTimePeriod;

/* renamed from: vi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vi1 {
    public static DateTimePeriod a(String str) {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        char c2;
        char c3;
        String str2 = str;
        str2.getClass();
        int i9 = 0;
        char c4 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i9 < str2.length()) {
            if (c4 == 0) {
                int i19 = i9 + 1;
                if (i19 < str2.length() || !(str2.charAt(i9) == '+' || str2.charAt(i9) == '-')) {
                    char charAt = str2.charAt(i9);
                    if (charAt != '+') {
                        c3 = '-';
                        if (charAt != '-') {
                            if (charAt == 'P') {
                                i9 = i19;
                                c4 = 1;
                            } else {
                                ta1.f(str2.charAt(i9), i9, "Expected '+', '-', 'P', got '");
                                return null;
                            }
                        }
                    } else {
                        c3 = '-';
                    }
                    if (str2.charAt(i9) == c3) {
                        i18 = -1;
                    }
                    if (str2.charAt(i19) == 'P') {
                        i9 += 2;
                        c4 = 1;
                    } else {
                        ta1.f(str2.charAt(i19), i19, "Expected 'P', got '");
                        return null;
                    }
                } else {
                    throw new IllegalArgumentException(pb4.i(i9, "Parse error at char ", ": Unexpected end of string; 'P' designator is required"));
                }
            } else {
                char charAt2 = str2.charAt(i9);
                if (charAt2 == '+' || charAt2 == '-') {
                    if (str2.charAt(i9) == '-') {
                        i3 = i18 * -1;
                    } else {
                        i3 = i18;
                    }
                    i2 = i9 + 1;
                    if (i2 < str2.length()) {
                        char charAt3 = str2.charAt(i2);
                        i = i10;
                        if ('0' <= charAt3) {
                            c = ':';
                            if (charAt3 >= ':') {
                            }
                        }
                    }
                    ta1.f(str2.charAt(i2), i2, "A number expected after '");
                    return null;
                } else if (('0' <= charAt2 && charAt2 < ':') || charAt2 != 'T') {
                    i2 = i9;
                    i = i10;
                    i3 = i18;
                    c = ':';
                } else if (c4 < 6) {
                    i9++;
                    c4 = 6;
                } else {
                    throw new IllegalArgumentException(pb4.i(i9, "Parse error at char ", ": Only one 'T' designator is allowed"));
                }
                long j2 = 0;
                while (true) {
                    if (i2 >= str2.length()) {
                        i4 = i11;
                        i5 = i12;
                        i6 = i13;
                        j = j2;
                        i7 = i3;
                        break;
                    }
                    char charAt4 = str2.charAt(i2);
                    i4 = i11;
                    if ('0' > charAt4 || charAt4 >= c) {
                        i7 = i3;
                        i5 = i12;
                        i6 = i13;
                        j = j2;
                    } else {
                        int i20 = i3;
                        int i21 = i12;
                        int i22 = i13;
                        try {
                            j2 = Math.addExact(Math.multiplyExact(j2, 10), (long) (str2.charAt(i2) - '0'));
                            i2++;
                            i3 = i20;
                            i12 = i21;
                            i11 = i4;
                            i13 = i22;
                            c = ':';
                        } catch (ArithmeticException unused) {
                            throw new IllegalArgumentException(pb4.i(i9, "Parse error at char ", ": The number is too large"));
                        }
                    }
                }
                long j3 = ((long) i7) * j;
                if (i2 != str2.length()) {
                    char upperCase = Character.toUpperCase(str2.charAt(i2));
                    int i23 = i7;
                    int i24 = i14;
                    int i25 = i15;
                    int i26 = i16;
                    if (upperCase == ',' || upperCase == '.') {
                        int i27 = i2 + 1;
                        if (i27 < str2.length()) {
                            int i28 = i27;
                            while (i2 < str2.length() && '0' <= (r8 = str2.charAt(i2)) && r8 < ':') {
                                i28 = i2 + 1;
                            }
                            int i29 = i2 - i27;
                            if (i29 <= 9) {
                                rd3.i(10);
                                int parseInt = Integer.parseInt(str2.substring(i27, i2) + k57.q0(9 - i29, "0"), 10) * i23;
                                if (str2.charAt(i2) != 'S') {
                                    throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Expected the 'S' designator after a fraction"));
                                } else if (c4 >= 9 || c4 < 6) {
                                    throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                } else if (j3 < -2147483648L || j3 > 2147483647L) {
                                    ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'S'"));
                                    return null;
                                } else {
                                    int i30 = (int) j3;
                                    i17 = parseInt;
                                    c4 = 9;
                                    i12 = i5;
                                    i11 = i4;
                                    i13 = i6;
                                    i10 = i;
                                    i14 = i24;
                                    i15 = i25;
                                    i16 = i30;
                                }
                            } else {
                                throw new IllegalArgumentException(pb4.i(i27, "Parse error at char ", ": Only the nanosecond fractions of a second are supported"));
                            }
                        } else {
                            throw new IllegalArgumentException("Parse error at char " + i27 + ": " + ("Expected designator 'S' after " + str2.charAt(i2)));
                        }
                    } else if (upperCase != 'D') {
                        if (upperCase != 'H') {
                            if (upperCase == 'M') {
                                if (c4 >= 6) {
                                    c2 = 8;
                                    if (c4 >= 8) {
                                        throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                    } else if (j3 < -2147483648L || j3 > 2147483647L) {
                                        ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'M'"));
                                        return null;
                                    } else {
                                        i15 = (int) j3;
                                        i13 = i6;
                                    }
                                } else {
                                    c2 = 3;
                                    if (c4 >= 3) {
                                        throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                    } else if (j3 < -2147483648L || j3 > 2147483647L) {
                                        ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'M'"));
                                        return null;
                                    } else {
                                        i13 = (int) j3;
                                        i15 = i25;
                                    }
                                }
                                c4 = c2;
                                i12 = i5;
                                i11 = i4;
                                i10 = i;
                                i14 = i24;
                                i16 = i26;
                            } else if (upperCase != 'S') {
                                if (upperCase != 'W') {
                                    if (upperCase != 'Y') {
                                        throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Expected a designator after the numerical value"));
                                    } else if (c4 >= 2) {
                                        throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                    } else if (j3 < -2147483648L || j3 > 2147483647L) {
                                        ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'Y'"));
                                        return null;
                                    } else {
                                        i12 = (int) j3;
                                        c4 = 2;
                                        i11 = i4;
                                    }
                                } else if (c4 >= 4) {
                                    throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                } else if (j3 < -2147483648L || j3 > 2147483647L) {
                                    ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'W'"));
                                    return null;
                                } else {
                                    i11 = (int) j3;
                                    c4 = 4;
                                    i12 = i5;
                                }
                                i8 = i6;
                                i10 = i;
                                i14 = i24;
                            } else if (c4 >= 9 || c4 < 6) {
                                throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                            } else if (j3 < -2147483648L || j3 > 2147483647L) {
                                ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'S'"));
                                return null;
                            } else {
                                i16 = (int) j3;
                                i12 = i5;
                                i11 = i4;
                                i13 = i6;
                                i10 = i;
                                i14 = i24;
                                i15 = i25;
                                c4 = 9;
                            }
                        } else if (c4 >= 7 || c4 < 6) {
                            throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                        } else if (j3 < -2147483648L || j3 > 2147483647L) {
                            ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'H'"));
                            return null;
                        } else {
                            i14 = (int) j3;
                            c4 = 7;
                            i12 = i5;
                            i11 = i4;
                            i8 = i6;
                            i10 = i;
                        }
                        i15 = i25;
                        i16 = i26;
                    } else if (c4 >= 5) {
                        throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                    } else if (j3 < -2147483648L || j3 > 2147483647L) {
                        ta1.g(i9, f21.g(j3, "Value ", " does not fit into an Int, which is required for component 'D'"));
                        return null;
                    } else {
                        int i31 = (int) j3;
                        c4 = 5;
                        i12 = i5;
                        i11 = i4;
                        i13 = i6;
                        i14 = i24;
                        i15 = i25;
                        i16 = i26;
                        i10 = i31;
                    }
                    i9 = i2 + 1;
                    z = true;
                } else {
                    throw new IllegalArgumentException(pb4.i(i2, "Parse error at char ", ": Expected a designator after the numerical value"));
                }
            }
        }
        if (c4 == 0) {
            throw new IllegalArgumentException(pb4.i(i9, "Parse error at char ", ": Unexpected end of input; 'P' designator is required"));
        } else if (c4 != 6) {
            long j4 = ((long) i10) + ((long) (i11 * 7));
            if (-2147483648L > j4 || j4 > 2147483647L) {
                throw new IllegalArgumentException("Parse error at char 0: The total number of days under 'D' and 'W' designators should fit into an Int");
            }
            int i32 = (int) j4;
            if (z) {
                long j5 = (long) i17;
                long P = pd8.P(i12, i13);
                long j6 = (j5 / 1000000000) + (((((long) i14) * 60) + ((long) i15)) * 60) + ((long) i16);
                try {
                    long j7 = j5 % 1000000000;
                    int i33 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
                    if (i33 > 0 && j7 < 0) {
                        j6--;
                        j7 += 1000000000;
                    } else if (i33 < 0 && j7 > 0) {
                        j6++;
                        j7 -= 1000000000;
                    }
                    long addExact = Math.addExact(Math.multiplyExact(j6, 1000000000), j7);
                    if (addExact != 0) {
                        return new wi1(i32, P, addExact);
                    }
                    return new DatePeriod(P, i32);
                } catch (ArithmeticException unused2) {
                    StringBuilder p = pb4.p("The total number of nanoseconds in ", i14, " hours, ", i15, " minutes, ");
                    p.append(i16);
                    p.append(" seconds, and ");
                    p.append(j5);
                    p.append(" nanoseconds overflows a Long");
                    throw new IllegalArgumentException(p.toString());
                }
            } else {
                throw new IllegalArgumentException("Parse error at char 0: At least one component is required, but none were found");
            }
        } else {
            throw new IllegalArgumentException(pb4.i(i9, "Parse error at char ", ": Unexpected end of input; at least one time component is required after 'T'"));
        }
    }

    public final zr3 serializer() {
        return yi1.b;
    }
}
