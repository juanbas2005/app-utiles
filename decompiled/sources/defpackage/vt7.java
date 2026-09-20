package defpackage;

/* renamed from: vt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vt7 extends g1 {
    public final zq5 a;
    public final int b;
    public final int c;
    public final String d;
    public final Integer e;
    public final q35 f;
    public final int g;

    public vt7(zq5 zq5, int i, int i2, q35 q35, int i3) {
        int i4;
        int i5 = 0;
        String str = zq5.x;
        i5 = (i3 & 16) != 0 ? null : i5;
        q35 = (i3 & 32) != 0 ? null : q35;
        str.getClass();
        this.a = zq5;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = i5;
        this.f = q35;
        if (i2 < 10) {
            i4 = 1;
        } else if (i2 < 100) {
            i4 = 2;
        } else if (i2 < 1000) {
            i4 = 3;
        } else {
            h.q(pb4.i(i2, "Max value ", " is too large"));
            throw null;
        }
        this.g = i4;
    }

    public final zq5 a() {
        return this.a;
    }

    public final Object b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final q35 d() {
        return this.f;
    }
}
