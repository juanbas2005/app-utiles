package defpackage;

/* renamed from: jt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt0 {
    public static final long b = uq3.d(4278190080L);
    public static final long c = uq3.d(4294967295L);
    public static final long d = uq3.d(4294901760L);
    public static final long e = uq3.d(4278190335L);
    public static final long f = uq3.c(0);
    public static final long g = uq3.b(0.0f, 0.0f, 0.0f, 0.0f, vt0.u);
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        uq3.d(4282664004L);
        uq3.d(4287137928L);
        uq3.d(4291611852L);
        uq3.d(4278255360L);
        uq3.d(4294967040L);
        uq3.d(4278255615L);
        uq3.d(4294902015L);
        float[] fArr = vt0.a;
    }

    public /* synthetic */ jt0(long j) {
        this.a = j;
    }

    public static final long a(long j, tt0 tt0) {
        x11 x11;
        tt0 f2 = f(j);
        int i = f2.c;
        int i2 = tt0.c;
        if ((i | i2) < 0) {
            x11 = b96.m(f2, tt0);
        } else {
            yo4 yo4 = y11.a;
            int i3 = i | (i2 << 6);
            Object b2 = yo4.b(i3);
            if (b2 == null) {
                b2 = b96.m(f2, tt0);
                yo4.i(i3, b2);
            }
            x11 = (x11) b2;
        }
        return x11.a(j);
    }

    public static long b(float f2, long j) {
        return uq3.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float d(long j) {
        float T;
        float f2;
        if ((63 & j) == 0) {
            T = (float) z65.T((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            T = (float) z65.T((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return T / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) z65.T((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((int) ((j >>> 16) & 65535));
        short s2 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        short s3 = s & 1023;
        if (i4 != 0) {
            int i5 = s3 << 13;
            if (i4 == 31) {
                i3 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i3 = i4 + 112;
            }
            int i6 = i3;
            i = i5;
            i2 = i6;
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - hh2.a;
            if (s2 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (s2 << 16) | i);
    }

    public static final tt0 f(long j) {
        float[] fArr = vt0.a;
        return vt0.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) z65.T((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((int) ((j >>> 32) & 65535));
        short s2 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        short s3 = s & 1023;
        if (i4 != 0) {
            int i5 = s3 << 13;
            if (i4 == 31) {
                i3 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i3 = i4 + 112;
            }
            int i6 = i3;
            i = i5;
            i2 = i6;
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - hh2.a;
            if (s2 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (s2 << 16) | i);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) z65.T((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((int) ((j >>> 48) & 65535));
        short s2 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        short s3 = s & 1023;
        if (i4 != 0) {
            int i5 = s3 << 13;
            if (i4 == 31) {
                i3 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i3 = i4 + 112;
            }
            int i6 = i3;
            i = i5;
            i2 = i6;
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - hh2.a;
            if (s2 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (s2 << 16) | i);
    }

    public static String i(long j) {
        float h2 = h(j);
        float g2 = g(j);
        float e2 = e(j);
        float d2 = d(j);
        String str = f(j).a;
        StringBuilder n = f21.n("Color(", h2, ", ", g2, ", ");
        n.append(e2);
        n.append(", ");
        n.append(d2);
        n.append(", ");
        return f21.l(n, str, ")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jt0)) {
            return false;
        }
        if (this.a != ((jt0) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
