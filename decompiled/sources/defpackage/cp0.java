package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: cp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cp0 implements c55 {
    public final /* synthetic */ int w;
    public long x;
    public Object y;

    public cp0(zw5 zw5) {
        this.w = 1;
        zw5.getClass();
        this.y = zw5;
        this.x = 262144;
    }

    public static long e(cp0 cp0, long j, float f) {
        float f2;
        long j2;
        long e = l35.e(cp0.x, j);
        cp0.x = e;
        if (((z75) cp0.y) == null) {
            f2 = l35.c(e);
        } else {
            f2 = Math.abs(cp0.g(e));
        }
        if (f2 < f) {
            return 9205357640488583168L;
        }
        z75 z75 = (z75) cp0.y;
        long j3 = cp0.x;
        if (z75 == null) {
            float c = l35.c(j3);
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L)) / c;
            return l35.d(cp0.x, l35.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / c)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L)));
        }
        float g = cp0.g(j3) - (Math.signum(cp0.g(cp0.x)) * f);
        long j4 = cp0.x;
        z75 z752 = (z75) cp0.y;
        z75 z753 = z75.x;
        if (z752 == z753) {
            j2 = j4 & 4294967295L;
        } else {
            j2 = j4 >> 32;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) j2);
        if (((z75) cp0.y) == z753) {
            return (((long) Float.floatToRawIntBits(g)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L);
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat2);
        return (((long) Float.floatToRawIntBits(g)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public void a(int i) {
        if (i >= 64) {
            cp0 cp0 = (cp0) this.y;
            if (cp0 != null) {
                cp0.a(i - 64);
                return;
            }
            return;
        }
        this.x &= ~(1 << i);
    }

    public int b(int i) {
        cp0 cp0 = (cp0) this.y;
        if (cp0 == null) {
            long j = this.x;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(((1 << i) - 1) & j);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.x);
        } else {
            return Long.bitCount(this.x) + cp0.b(i - 64);
        }
    }

    public void c() {
        if (((cp0) this.y) == null) {
            this.y = new cp0();
        }
    }

    public boolean d(int i) {
        if (i >= 64) {
            c();
            return ((cp0) this.y).d(i - 64);
        }
        if (((1 << i) & this.x) != 0) {
            return true;
        }
        return false;
    }

    public void f(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            c();
            ((cp0) this.y).f(i - 64, z);
            return;
        }
        long j = this.x;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.x = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            l(i);
        } else {
            a(i);
        }
        if (z2 || ((cp0) this.y) != null) {
            c();
            ((cp0) this.y).f(0, z2);
        }
    }

    public float g(long j) {
        long j2;
        if (((z75) this.y) == z75.x) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public bz2 h() {
        zy2 zy2 = new zy2();
        while (true) {
            String H = ((ed0) this.y).H(this.x);
            this.x -= (long) H.length();
            if (H.length() == 0) {
                return zy2.a();
            }
            int F0 = d57.F0(H, ':', 1, 4);
            if (F0 != -1) {
                za5.m(zy2, H.substring(0, F0), H.substring(F0 + 1));
            } else if (H.charAt(0) == ':') {
                za5.m(zy2, "", H.substring(1));
            } else {
                za5.m(zy2, "", H);
            }
        }
    }

    public boolean i(int i) {
        boolean z;
        if (i >= 64) {
            c();
            return ((cp0) this.y).i(i - 64);
        }
        long j = 1 << i;
        long j2 = this.x;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.x = j3;
        long j4 = j - 1;
        this.x = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        cp0 cp0 = (cp0) this.y;
        if (cp0 != null) {
            if (cp0.d(0)) {
                l(63);
            }
            ((cp0) this.y).i(0);
        }
        return z;
    }

    public /* synthetic */ void j(Exception exc) {
        ((AtomicLong) ((fm8) this.y).z).set(this.x);
    }

    public void k() {
        this.x = 0;
        cp0 cp0 = (cp0) this.y;
        if (cp0 != null) {
            cp0.k();
        }
    }

    public void l(int i) {
        if (i >= 64) {
            c();
            ((cp0) this.y).l(i - 64);
            return;
        }
        this.x |= 1 << i;
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                if (((cp0) this.y) == null) {
                    return Long.toBinaryString(this.x);
                }
                return ((cp0) this.y).toString() + "xx" + Long.toBinaryString(this.x);
            default:
                return super.toString();
        }
    }

    public cp0(xb4 xb4) {
        this.w = 4;
        z65.k(xb4);
        this.y = xb4;
    }

    public /* synthetic */ cp0(int i, long j, Object obj) {
        this.w = i;
        this.y = obj;
        this.x = j;
    }

    public cp0() {
        this.w = 0;
        this.x = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp0(z75 z75) {
        this(2, 0, z75);
        this.w = 2;
    }
}
