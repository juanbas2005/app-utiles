package defpackage;

/* renamed from: b2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b2 extends gl0 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ an3 F;
    public final /* synthetic */ String G;
    public final Object H;

    public b2(an3 an3, String str) {
        this.F = an3;
        this.G = str;
        this.H = an3.b.b;
    }

    public void B(long j) {
        String str;
        switch (this.E) {
            case 1:
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i == 0) {
                    str = "0";
                } else if (i > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    int i2 = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i2, 64 - i2);
                }
                j0(str);
                return;
            default:
                super.B(j);
                return;
        }
    }

    public void D(String str) {
        switch (this.E) {
            case b85.b /*0*/:
                str.getClass();
                this.F.L(this.G, new nm3(str, false, (ll6) this.H));
                return;
            default:
                super.D(str);
                return;
        }
    }

    public final z53 a() {
        switch (this.E) {
            case b85.b /*0*/:
                return this.F.b.b;
            default:
                return (z53) this.H;
        }
    }

    public void i(short s) {
        switch (this.E) {
            case 1:
                j0(String.valueOf(s & 65535));
                return;
            default:
                super.i(s);
                return;
        }
    }

    public void j0(String str) {
        str.getClass();
        this.F.L(this.G, new nm3(str, false, (ll6) null));
    }

    public void k(byte b) {
        switch (this.E) {
            case 1:
                j0(String.valueOf(b & 255));
                return;
            default:
                super.k(b);
                return;
        }
    }

    public void z(int i) {
        switch (this.E) {
            case 1:
                j0(Long.toString(((long) i) & 4294967295L, 10));
                return;
            default:
                super.z(i);
                return;
        }
    }

    public b2(an3 an3, String str, ll6 ll6) {
        this.F = an3;
        this.G = str;
        this.H = ll6;
    }
}
