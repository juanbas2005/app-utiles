package defpackage;

import java.util.ArrayList;

/* renamed from: if8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class if8 implements mc2 {
    public final g1 a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final ia5 e;

    public if8(ia5 ia5) {
        Integer num;
        ev2 ev2 = pf8.a;
        Integer valueOf = Integer.valueOf(ia5 != ia5.x ? 1 : 4);
        if (ia5 == ia5.y) {
            num = 4;
        } else {
            num = null;
        }
        ev2.getClass();
        this.a = ev2;
        this.b = valueOf;
        this.c = num;
        this.d = 4;
        this.e = ia5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bz0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v6, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        int i;
        this.a.a();
        Integer num = this.b;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ? obj = new Object();
        if (i < 0) {
            h.j(pb4.i(i, "The minimum number of digits (", ") is negative"));
            return null;
        } else if (i > 9) {
            h.j(pb4.i(i, "The minimum number of digits (", ") exceeds the length of an Int"));
            return null;
        } else if (this.c != null) {
            return new Object();
        } else {
            return obj;
        }
    }

    public final qd5 b() {
        g1 g1Var = this.a;
        zq5 a2 = g1Var.a();
        String c2 = g1Var.c();
        a2.getClass();
        c2.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList I = sg3.I(j45.r(num, (Integer) null, num2, a2, c2, true));
        Integer num3 = this.d;
        a42 a42 = a42.w;
        if (num3 != null) {
            I.add(j45.r(num, num3, num2, a2, c2, false));
            I.add(new qd5(sg3.E(new ih5("+"), new z15(sg3.D(new wt7(Integer.valueOf(num3.intValue() + 1), (Integer) null, a2, c2, false)))), a42));
        } else {
            I.add(j45.r(num, (Integer) null, num2, a2, c2, false));
        }
        return new qd5(a42, I);
    }

    public final g1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof if8) || this.e != ((if8) obj).e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.e.hashCode() * 31);
    }
}
