package defpackage;

/* renamed from: z34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z34 implements x24 {
    public final /* synthetic */ n04 a;

    public z34(n04 n04) {
        this.a = n04;
    }

    public final int a() {
        long i;
        n04 n04 = this.a;
        if (n04.g().q == z75.w) {
            i = n04.g().i() & 4294967295L;
        } else {
            i = n04.g().i() >> 32;
        }
        return (int) i;
    }

    public final float b() {
        n04 n04 = this.a;
        return (float) ((n04.d.b.d() * 500) + n04.d.c.d());
    }

    public final int c() {
        n04 n04 = this.a;
        return (-n04.g().n) + n04.g().r;
    }

    public final float d() {
        n04 n04 = this.a;
        int d = n04.d.b.d();
        int d2 = n04.d.c.d();
        if (n04.c()) {
            return ((float) ((d * 500) + d2)) + 100.0f;
        }
        return (float) ((d * 500) + d2);
    }

    public final Object e(int i, bi1 bi1) {
        kg5 kg5 = n04.w;
        n04 n04 = this.a;
        n04.getClass();
        Object d = n04.d(hq4.w, new ot(n04, i, (f61) null, 11), bi1);
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
        return new at0(-1, -1);
    }
}
