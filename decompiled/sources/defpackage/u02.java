package defpackage;

/* renamed from: u02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u02 implements Comparable {
    public static final long A = 9223372036854759646L;
    public static final xb4 x = new xb4(27);
    public static final long y = gl0.M(4611686018427387903L);
    public static final long z = gl0.M(-4611686018427387903L);
    public final long w;

    public /* synthetic */ u02(long j) {
        this.w = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long H = gl0.H(j, j3);
        if (-4611686018426L > H || H >= 4611686018427L) {
            return gl0.M(H);
        }
        return gl0.O((H * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z2) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String O0 = d57.O0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = O0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (O0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z2 || i6 >= 3) {
                sb.append(O0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append(O0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return sg3.l(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        if (j < 0) {
            return -i;
        }
        return i;
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long e(long j) {
        if ((((int) j) & 1) != 1 || g(j)) {
            return j(j, y02.MILLISECONDS);
        }
        return j >> 1;
    }

    public static final int f(long j) {
        long j2;
        if (g(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % 1000000000;
        }
        return (int) j2;
    }

    public static final boolean g(long j) {
        if (j == y || j == z) {
            return true;
        }
        return false;
    }

    public static final long h(long j, long j2) {
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            if (i == 0) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                    return gl0.M(j3 / 1000000);
                }
                return gl0.O(j3);
            }
            long H = gl0.H(j >> 1, j2 >> 1);
            if (H == 9223372036854759646L) {
                h.q("Summing infinite durations of different signs yields an undefined result.");
                return 0;
            } else if (H == 4611686018427387903L || H == -4611686018427387903L) {
                return gl0.M(H);
            } else {
                return gl0.N(H);
            }
        } else if (i == 1) {
            return a(j >> 1, j2 >> 1);
        } else {
            return a(j2 >> 1, j >> 1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [qc4, sc4] */
    /* JADX WARNING: type inference failed for: r0v30, types: [qc4, sc4] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4 A[RETURN] */
    public static final long i(long j, double d) {
        y02 y02;
        double d2;
        y02 y022;
        long j2 = j;
        int B = dh4.B(d);
        int i = (((double) B) > d ? 1 : (((double) B) == d ? 0 : -1));
        long j3 = y;
        long j4 = z;
        if (i != 0) {
            int i2 = ((int) j2) & 1;
            y02 y023 = y02.MILLISECONDS;
            y02 y024 = y02.NANOSECONDS;
            if (i2 == 0) {
                y02 = y024;
            } else {
                y02 = y023;
            }
            if (j2 == j3) {
                d2 = Double.POSITIVE_INFINITY;
            } else if (j2 == j4) {
                d2 = Double.NEGATIVE_INFINITY;
            } else {
                double d3 = (double) (j2 >> 1);
                if (i2 == 0) {
                    y022 = y024;
                } else {
                    y022 = y023;
                }
                d2 = x91.s(d3, y022, y02);
            }
            double d4 = d2 * d;
            double s = x91.s(d4, y02, y024);
            if (!Double.isNaN(s)) {
                long D = dh4.D(s);
                if (-4611686018426999999L > D || D >= 4611686018427000000L) {
                    return gl0.N(dh4.D(x91.s(d4, y02, y023)));
                }
                return gl0.O(D);
            }
            h.q("Duration value cannot be NaN.");
            return 0;
        } else if (g(j2)) {
            if (B == 0) {
                h.q("Multiplying infinite duration by zero yields an undefined result.");
                return 0;
            } else if (B > 0) {
                return j2;
            } else {
                return l(j2);
            }
        } else if (B == 0) {
            return 0;
        } else {
            long j5 = j2 >> 1;
            long j6 = (long) B;
            long j7 = j5 * j6;
            if ((((int) j2) & 1) == 0) {
                if (-2147483647L <= j5 && j5 < 2147483648L) {
                    return gl0.O(j7);
                }
                if (j7 / j6 != j5) {
                    long j8 = j5 / 1000000;
                    long j9 = j8 * j6;
                    long j10 = (((j5 - (j8 * 1000000)) * j6) / 1000000) + j9;
                    if (j9 / j6 == j8 && (j10 ^ j9) >= 0) {
                        return gl0.M(z65.r(j10, new qc4(-4611686018427387903L, 4611686018427387903L)));
                    }
                    if (Integer.signum(B) * Long.signum(j5) > 0) {
                        return j3;
                    }
                    return j4;
                } else if (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) {
                    return gl0.M(j7 / 1000000);
                } else {
                    return gl0.O(j7);
                }
            } else if (j7 / j6 == j5) {
                return gl0.M(z65.r(j7, new qc4(-4611686018427387903L, 4611686018427387903L)));
            } else {
                if (Integer.signum(B) * Long.signum(j5) > 0) {
                }
            }
            return j3;
        }
    }

    public static final long j(long j, y02 y02) {
        y02 y022;
        if (j == y) {
            return Long.MAX_VALUE;
        }
        if (j == z) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            y022 = y02.NANOSECONDS;
        } else {
            y022 = y02.MILLISECONDS;
        }
        return y02.w.convert(j2, y022.w);
    }

    public static String k(long j) {
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i4 == 0) {
            return "0s";
        }
        if (j == y) {
            return "Infinity";
        }
        if (j == z) {
            return "-Infinity";
        }
        int i5 = 0;
        if (i4 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (i4 < 0) {
            j = l(j);
        }
        long j2 = j(j, y02.DAYS);
        if (g(j)) {
            i = 0;
        } else {
            i = (int) (j(j, y02.HOURS) % 24);
        }
        if (g(j)) {
            i2 = 0;
        } else {
            i2 = (int) (j(j, y02.MINUTES) % 60);
        }
        if (g(j)) {
            i3 = 0;
        } else {
            i3 = (int) (j(j, y02.SECONDS) % 60);
        }
        int f = f(j);
        if (j2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i2 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i3 == 0 && f == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z3) {
            sb.append(j2);
            sb.append('d');
            i5 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append('h');
            i5 = i6;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i7 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('m');
            i5 = i7;
        }
        if (z6) {
            int i8 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            if (i3 != 0 || z3 || z4 || z5) {
                b(sb, i3, f, 9, "s", false);
            } else if (f >= 1000000) {
                b(sb, f / 1000000, f % 1000000, 6, "ms", false);
            } else if (f >= 1000) {
                b(sb, f / 1000, f % 1000, 3, "us", false);
            } else {
                sb.append(f);
                sb.append("ns");
            }
            i5 = i8;
        }
        if (z2 && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long l(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = w02.a;
        return j2;
    }

    public final int compareTo(Object obj) {
        return c(this.w, ((u02) obj).w);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u02)) {
            return false;
        }
        if (this.w != ((u02) obj).w) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.w);
    }

    public final String toString() {
        return k(this.w);
    }
}
