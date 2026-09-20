package defpackage;

/* renamed from: dy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dy0 extends v70 {
    public final boolean z;

    public dy0(qa qaVar, boolean z2) {
        super(3, (Object) qaVar);
        this.z = z2;
    }

    public final void f(byte b) {
        if (this.z) {
            k(String.valueOf(b & 255));
            return;
        }
        String valueOf = String.valueOf(b & 255);
        valueOf.getClass();
        ((qa) this.y).n(valueOf);
    }

    public final void h(int i) {
        if (this.z) {
            k(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String l = Long.toString(((long) i) & 4294967295L, 10);
        l.getClass();
        ((qa) this.y).n(l);
    }

    public final void i(long j) {
        int i = 63;
        String str = "0";
        if (this.z) {
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i2 != 0) {
                if (i2 > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            k(str);
            return;
        }
        int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i3 != 0) {
            if (i3 > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((qa) this.y).n(str);
    }

    public final void j(short s) {
        if (this.z) {
            k(String.valueOf(s & 65535));
            return;
        }
        String valueOf = String.valueOf(s & 65535);
        valueOf.getClass();
        ((qa) this.y).n(valueOf);
    }
}
