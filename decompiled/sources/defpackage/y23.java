package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: y23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y23 {
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public long c;
    public final zw5 d;
    public vy2[] e;
    public int f;
    public int g;
    public int h;

    public y23(r33 r33) {
        this.d = new zw5(r33);
        this.e = new vy2[8];
        this.f = 7;
    }

    public final void a(vy2 vy2) {
        this.b.add(vy2);
        long d2 = this.c + ((long) (vy2.b.d() + vy2.a.d()));
        this.c = d2;
        if (d2 > 262144) {
            rf2.i("header byte count limit of 262144 exceeded");
        }
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    vy2[] vy2Arr = this.e;
                    System.arraycopy(vy2Arr, i2 + 1, vy2Arr, i2 + 1 + i3, this.g);
                    this.f += i3;
                } else {
                    vy2 vy2 = this.e[length];
                    vy2.getClass();
                    int i4 = vy2.c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
            }
            vy2[] vy2Arr2 = this.e;
            System.arraycopy(vy2Arr2, i2 + 1, vy2Arr2, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final dg0 c(int i) {
        if (i >= 0) {
            vy2[] vy2Arr = a33.a;
            if (i <= vy2Arr.length - 1) {
                return vy2Arr[i].a;
            }
        }
        int length = this.f + 1 + (i - a33.a.length);
        if (length >= 0) {
            vy2[] vy2Arr2 = this.e;
            if (length < vy2Arr2.length) {
                vy2 vy2 = vy2Arr2[length];
                vy2.getClass();
                return vy2.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(vy2 vy2) {
        a(vy2);
        int i = vy2.c;
        int i2 = this.a;
        if (i > i2) {
            qs.S0(0, this.e.length, (Object) null, this.e);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
        int i3 = this.g + 1;
        vy2[] vy2Arr = this.e;
        if (i3 > vy2Arr.length) {
            vy2[] vy2Arr2 = new vy2[(vy2Arr.length * 2)];
            System.arraycopy(vy2Arr, 0, vy2Arr2, vy2Arr.length, vy2Arr.length);
            this.f = this.e.length - 1;
            this.e = vy2Arr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = vy2;
        this.g++;
        this.h += i;
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [sc0, java.lang.Object] */
    public final dg0 e() {
        boolean z;
        zw5 zw5 = this.d;
        byte readByte = zw5.readByte();
        byte[] bArr = dg8.a;
        byte b2 = readByte & 255;
        int i = 0;
        if ((readByte & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        long f2 = (long) f(b2, 127);
        if (this.c + f2 > 262144) {
            rf2.i("header byte count limit of 262144 exceeded");
            return null;
        } else if (!z) {
            return zw5.q(f2);
        } else {
            ? obj = new Object();
            int[] iArr = h73.a;
            zw5.getClass();
            o21 o21 = h73.c;
            o21 o212 = o21;
            int i2 = 0;
            for (long j = 0; j < f2; j++) {
                int readByte2 = zw5.readByte();
                byte[] bArr2 = dg8.a;
                i = (i << 8) | (readByte2 & 255);
                i2 += 8;
                while (i2 >= 8) {
                    o21[] o21Arr = (o21[]) o212.y;
                    o21Arr.getClass();
                    o212 = o21Arr[(i >>> (i2 - 8)) & 255];
                    o212.getClass();
                    if (((o21[]) o212.y) == null) {
                        obj.a0(o212.w);
                        i2 -= o212.x;
                        o212 = o21;
                    } else {
                        i2 -= 8;
                    }
                }
            }
            while (i2 > 0) {
                o21[] o21Arr2 = (o21[]) o212.y;
                o21Arr2.getClass();
                o21 o213 = o21Arr2[(i << (8 - i2)) & 255];
                o213.getClass();
                int i3 = o213.x;
                if (((o21[]) o213.y) != null || i3 > i2) {
                    break;
                }
                obj.a0(o213.w);
                i2 -= i3;
                o212 = o21;
            }
            return obj.q(obj.x);
        }
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = (long) i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte readByte = this.d.readByte();
            byte[] bArr = dg8.a;
            i4++;
            long j2 = ((long) (readByte & Byte.MAX_VALUE)) << i5;
            if (j2 <= 2147483647L - j) {
                j += j2;
                if ((readByte & 128) == 0) {
                    return (int) j;
                }
                i5 += 7;
            } else {
                rf2.i("HPACK integer overflow");
                return 0;
            }
        }
        rf2.i("HPACK integer overflow");
        return 0;
    }
}
