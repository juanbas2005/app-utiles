package defpackage;

/* renamed from: xt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xt7 implements mc2 {
    public final vt7 a;
    public final int b;
    public final Integer c;
    public final int d;

    public xt7(vt7 vt7, int i, Integer num) {
        vt7.getClass();
        this.a = vt7;
        this.b = i;
        this.c = num;
        int i2 = vt7.g;
        this.d = i2;
        if (i < 0) {
            h.j(pb4.i(i, "The minimum number of digits (", ") is negative"));
            throw null;
        } else if (i2 < i) {
            h.h(i2, i, ") is less than the minimum number of digits (", "The maximum number of digits (");
            throw null;
        } else if (num != null && num.intValue() <= i) {
            throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bz0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        zq5 zq5 = this.a.a;
        ? obj = new Object();
        int i = this.b;
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
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.d);
        vt7 vt7 = this.a;
        return j45.r(valueOf, valueOf2, this.c, vt7.a, vt7.d, false);
    }

    public final /* bridge */ /* synthetic */ g1 c() {
        return this.a;
    }
}
