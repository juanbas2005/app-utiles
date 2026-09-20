package defpackage;

import java.util.List;

/* renamed from: xp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xp2 implements mc2 {
    public static final List g = sg3.E(0, null, null, null, null, null, null, null, null);
    public final g1 a;
    public final int b = 1;
    public final int c = 9;
    public final List d;
    public final int e;
    public final int f;

    static {
        sg3.E(2, 1, null, 2, 1, null, 2, 1, null);
    }

    public xp2() {
        List list = g;
        list.getClass();
        ev2 ev2 = li7.d;
        ev2.getClass();
        this.a = ev2;
        this.d = list;
        this.e = 1;
        this.f = 9;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        this.a.a();
        this.d.getClass();
        ? obj = new Object();
        int i = this.b;
        if (1 > i || i >= 10) {
            h.j(pb4.i(i, "The minimum number of digits (", ") is not in range 1..9"));
            return null;
        }
        int i2 = this.c;
        if (i <= i2 && i2 < 10) {
            return obj;
        }
        h.j(pb4.k("The maximum number of digits (", i2, ") is not in range ", i, "..9"));
        return null;
    }

    public final qd5 b() {
        g1 g1Var = this.a;
        return new qd5(sg3.D(new z15(sg3.D(new wp2(this.b, this.c, g1Var.a(), g1Var.c())))), a42.w);
    }

    public final g1 c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (defpackage.xp2) r3;
     */
    public final boolean equals(Object obj) {
        xp2 xp2;
        if ((obj instanceof xp2) && this.e == xp2.e && this.f == xp2.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.e * 31) + this.f;
    }
}
