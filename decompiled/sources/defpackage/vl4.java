package defpackage;

/* renamed from: vl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vl4 {
    public static final vl4 e = new vl4();
    public final int[] a = new int[929];
    public final int[] b = new int[929];
    public final hv2 c;
    public final hv2 d;

    public vl4() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.a[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.b[this.a[i3]] = i3;
        }
        this.c = new hv2(this, new int[]{0});
        this.d = new hv2(this, new int[]{1});
    }

    public final int a(int i, int i2) {
        return (i + i2) % 929;
    }

    public final int b(int i) {
        if (i != 0) {
            return this.a[928 - this.b[i]];
        }
        throw new ArithmeticException();
    }

    public final int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i] + iArr[i2]) % 928];
    }
}
