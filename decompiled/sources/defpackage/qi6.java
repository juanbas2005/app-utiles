package defpackage;

/* renamed from: qi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qi6 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public qi6 f;
    public qi6 g;

    public qi6(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final qi6 a() {
        qi6 qi6 = this.f;
        if (qi6 == this) {
            qi6 = null;
        }
        qi6 qi62 = this.g;
        qi62.getClass();
        qi62.f = this.f;
        qi6 qi63 = this.f;
        qi63.getClass();
        qi63.g = this.g;
        this.f = null;
        this.g = null;
        return qi6;
    }

    public final void b(qi6 qi6) {
        qi6.getClass();
        qi6.g = this;
        qi6.f = this.f;
        qi6 qi62 = this.f;
        qi62.getClass();
        qi62.g = qi6;
        this.f = qi6;
    }

    public final qi6 c() {
        this.d = true;
        return new qi6(this.a, this.b, this.c, true, false);
    }

    public final void d(qi6 qi6, int i) {
        qi6.getClass();
        if (qi6.e) {
            int i2 = qi6.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!qi6.d) {
                    int i4 = qi6.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = qi6.a;
                        qs.O0(bArr, bArr, 0, i4, i2, 2);
                        qi6.c -= qi6.b;
                        qi6.b = 0;
                    } else {
                        ku4.v();
                        return;
                    }
                } else {
                    ku4.v();
                    return;
                }
            }
            byte[] bArr2 = qi6.a;
            int i5 = qi6.c;
            int i6 = this.b;
            qs.I0(i5, i6, i6 + i, this.a, bArr2);
            qi6.c += i;
            this.b += i;
            return;
        }
        h.s("only owner can write");
    }

    public qi6() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
