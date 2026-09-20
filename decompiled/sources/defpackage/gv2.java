package defpackage;

/* renamed from: gv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv2 {
    public static final gv2 h = new gv2(4201, 4096, 1);
    public static final gv2 i = new gv2(1033, 1024, 1);
    public static final gv2 j;
    public static final gv2 k = new gv2(19, 16, 1);
    public static final gv2 l = new gv2(285, 256, 0);
    public static final gv2 m;
    public static final gv2 n;
    public static final gv2 o;
    public final int[] a;
    public final int[] b;
    public final hv2 c;
    public final hv2 d;
    public final int e;
    public final int f;
    public final int g;

    static {
        gv2 gv2 = new gv2(67, 64, 1);
        j = gv2;
        gv2 gv22 = new gv2(301, 256, 1);
        m = gv22;
        n = gv22;
        o = gv2;
    }

    public gv2(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new hv2(this, new int[]{0});
        this.d = new hv2(this, new int[]{1});
    }

    public final int a(int i2) {
        if (i2 != 0) {
            int i3 = this.b[i2];
            return this.a[(this.e - i3) - 1];
        }
        throw new ArithmeticException();
    }

    public final int b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(',');
        return f21.j(sb, this.e, ')');
    }
}
