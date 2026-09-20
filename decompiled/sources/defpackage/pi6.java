package defpackage;

/* renamed from: pi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pi6 {
    public final byte[] a;
    public int b;
    public int c;
    public i06 d;
    public boolean e;
    public pi6 f;
    public pi6 g;

    public pi6() {
        this.a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final byte b(int i) {
        return this.a[this.b + i];
    }

    public final pi6 c() {
        pi6 pi6 = this.f;
        pi6 pi62 = this.g;
        if (pi62 != null) {
            pi62.getClass();
            pi62.f = this.f;
        }
        pi6 pi63 = this.f;
        if (pi63 != null) {
            pi63.getClass();
            pi63.g = this.g;
        }
        this.f = null;
        this.g = null;
        return pi6;
    }

    public final void d(pi6 pi6) {
        pi6.getClass();
        pi6.g = this;
        pi6.f = this.f;
        pi6 pi62 = this.f;
        if (pi62 != null) {
            pi62.g = pi6;
        }
        this.f = pi6;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, i06] */
    public final pi6 e() {
        i06 i06 = this.d;
        i06 i062 = i06;
        if (i06 == null) {
            pi6 pi6 = ui6.a;
            ? obj = new Object();
            this.d = obj;
            i062 = obj;
        }
        int i = this.b;
        int i2 = this.c;
        i06.b.incrementAndGet(i062);
        return new pi6(this.a, i, i2, i062);
    }

    public final void f(pi6 pi6, int i) {
        pi6.getClass();
        if (pi6.e) {
            if (pi6.c + i > 8192) {
                i06 i06 = pi6.d;
                if (i06 == null || i06.a <= 0) {
                    int i2 = pi6.c;
                    int i3 = pi6.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = pi6.a;
                        qs.O0(bArr, bArr, 0, i3, i2, 2);
                        pi6.c -= pi6.b;
                        pi6.b = 0;
                    } else {
                        ku4.v();
                        return;
                    }
                } else {
                    ku4.v();
                    return;
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = pi6.a;
            int i4 = pi6.c;
            int i5 = this.b;
            qs.I0(i4, i5, i5 + i, bArr2, bArr3);
            pi6.c += i;
            this.b += i;
            return;
        }
        h.s("only owner can write");
    }

    public pi6(byte[] bArr, int i, int i2, i06 i06) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i06;
        this.e = false;
    }
}
