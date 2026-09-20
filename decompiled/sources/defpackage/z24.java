package defpackage;

/* renamed from: z24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z24 implements x24 {
    public final oq1 a;
    public final /* synthetic */ s34 b;
    public final /* synthetic */ boolean c;

    public z24(s34 s34, boolean z) {
        this.b = s34;
        this.c = z;
        this.a = u55.i(new rh1(s34, 1));
    }

    public final int a() {
        long i;
        s34 s34 = this.b;
        if (s34.j().o == z75.w) {
            i = s34.j().i() & 4294967295L;
        } else {
            i = s34.j().i() >> 32;
        }
        return (int) i;
    }

    public final float b() {
        s34 s34 = this.b;
        return (float) ((s34.h() * 500) + s34.i());
    }

    public final int c() {
        s34 s34 = this.b;
        return (-s34.j().l) + s34.j().p;
    }

    public final float d() {
        s34 s34 = this.b;
        int h = s34.h();
        int i = s34.i();
        if (s34.c()) {
            return ((float) ((h * 500) + i)) + 100.0f;
        }
        return (float) ((h * 500) + i);
    }

    public final Object e(int i, bi1 bi1) {
        Object l = s34.l(this.b, i, bi1);
        if (l == p81.w) {
            return l;
        }
        return vs7.a;
    }

    public final at0 f() {
        boolean z = this.c;
        oq1 oq1 = this.a;
        if (z) {
            return new at0(((Number) oq1.getValue()).intValue(), 1);
        }
        return new at0(1, ((Number) oq1.getValue()).intValue());
    }
}
