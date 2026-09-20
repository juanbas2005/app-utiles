package defpackage;

/* renamed from: y24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y24 implements x24 {
    public final /* synthetic */ ob5 a;
    public final /* synthetic */ boolean b;

    public y24(ob5 ob5, boolean z) {
        this.a = ob5;
        this.b = z;
    }

    public final int a() {
        long i;
        ob5 ob5 = this.a;
        if (ob5.m().e == z75.w) {
            i = ob5.m().i() & 4294967295L;
        } else {
            i = ob5.m().i() >> 32;
        }
        return (int) i;
    }

    public final float b() {
        return (float) fb5.f(this.a);
    }

    public final int c() {
        ob5 ob5 = this.a;
        return (-ob5.m().f) + ob5.m().d;
    }

    public final float d() {
        ob5 ob5 = this.a;
        return (float) rb5.a(ob5.m(), ob5.n());
    }

    public final Object e(int i, bi1 bi1) {
        ob5 ob5 = this.a;
        ob5.getClass();
        Object d = ob5.d(hq4.w, new bi1(ob5, i, (f61) null, 2), bi1);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (d != p81) {
            d = vs7;
        }
        if (d == p81) {
            return d;
        }
        return vs7;
    }

    public final at0 f() {
        boolean z = this.b;
        ob5 ob5 = this.a;
        if (z) {
            return new at0(ob5.n(), 1);
        }
        return new at0(1, ob5.n());
    }
}
