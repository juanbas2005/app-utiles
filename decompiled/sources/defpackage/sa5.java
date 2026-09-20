package defpackage;

/* renamed from: sa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sa5 implements c24 {
    public final ob5 a;

    public sa5(ob5 ob5) {
        this.a = ob5;
    }

    public final int a() {
        return this.a.n();
    }

    public final int b() {
        ob5 ob5 = this.a;
        return Math.min(ob5.n() - 1, ((ph4) dt0.G0(ob5.m().a)).a);
    }

    public final int c() {
        int i;
        ob5 ob5 = this.a;
        if (ob5.m().a.size() == 0) {
            return 0;
        }
        int q = za5.q(ob5.m());
        int i2 = ob5.m().b + ob5.m().c;
        if (i2 != 0 && (i = q / i2) >= 1) {
            return i;
        }
        return 1;
    }

    public final boolean d() {
        return !this.a.m().a.isEmpty();
    }

    public final int e() {
        return Math.max(0, this.a.e);
    }
}
