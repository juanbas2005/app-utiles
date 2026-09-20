package defpackage;

/* renamed from: vg2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vg2 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg2(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 2, (byte) 0);
        this.a = 2;
    }

    public static ug2 a(vg2 vg2, mf3[] mf3Arr) {
        return new ug2(vg2.b + vg2.c, mf3Arr);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [vg2, tg2] */
    public static tg2 b(vg2 vg2) {
        return new vg2(vg2.b + vg2.c, 1, 0, (byte) 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [vg2, tg2] */
    public static tg2 c() {
        return new vg2(0, 1, 0, (byte) 0);
    }

    public abstract void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75);

    public abstract Object e(int i);

    public st2 f(tt2 tt2) {
        return null;
    }

    public abstract byte[] g();

    public abstract byte[] h(int i, byte[] bArr);

    public boolean i() {
        return false;
    }

    public vg2 j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public String toString() {
        char c2;
        switch (this.a) {
            case 1:
                int i = this.b;
                byte[] bArr = new byte[i];
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i + 1) * i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr = h(i3, bArr);
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b2 = bArr[i4] & 255;
                        if (b2 < 64) {
                            c2 = '#';
                        } else if (b2 < 128) {
                            c2 = '+';
                        } else if (b2 < 192) {
                            c2 = '.';
                        } else {
                            c2 = ' ';
                        }
                        sb.append(c2);
                    }
                    sb.append(10);
                }
                return sb.toString();
            case 2:
                String A = b26.a.b(getClass()).A();
                if (A == null) {
                    return "";
                }
                return A;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vg2(int i, int i2, int i3, byte b2) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
