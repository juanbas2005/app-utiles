package defpackage;

/* renamed from: u44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u44 {
    public final ed5 A;
    public final ed5 B;
    public td7 a;
    public final yx5 b;
    public final gy6 c;
    public final jz0 d;
    public vf7 e;
    public final ed5 f;
    public final ed5 g = u55.p(new lx1(0.0f));
    public dy3 h;
    public final ed5 i = u55.p((Object) null);
    public vl j;
    public final ed5 k = u55.p(ey2.w);
    public final ed5 l;
    public final ed5 m;
    public final ed5 n;
    public final ed5 o;
    public boolean p;
    public final ed5 q;
    public final ys3 r;
    public final ed5 s;
    public final ed5 t;
    public vr2 u;
    public final j71 v;
    public final j71 w;
    public final j71 x;
    public final kb9 y;
    public long z;

    public u44(td7 td7, yx5 yx5, gy6 gy6) {
        this.a = td7;
        this.b = yx5;
        this.c = gy6;
        jz0 jz0 = new jz0(18, false);
        vl vlVar = wl.a;
        long j2 = lg7.b;
        hf7 hf7 = new hf7(vlVar, j2, (lg7) null);
        jz0.x = hf7;
        jz0.y = new i22(vlVar, hf7.b);
        this.d = jz0;
        Boolean bool = Boolean.FALSE;
        this.f = u55.p(bool);
        this.l = u55.p(bool);
        this.m = u55.p(bool);
        this.n = u55.p(bool);
        this.o = u55.p(bool);
        this.p = true;
        this.q = u55.p(Boolean.TRUE);
        this.r = new ys3(gy6);
        this.s = u55.p(bool);
        this.t = u55.p(bool);
        this.u = new tm3(9);
        this.v = new j71(this, 1);
        this.w = new j71(this, 2);
        this.x = new j71(this, 3);
        this.y = dh4.b();
        this.z = jt0.g;
        this.A = u55.p(new lg7(j2));
        this.B = u55.p(new lg7(j2));
    }

    public final ey2 a() {
        return (ey2) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final dy3 c() {
        dy3 dy3 = this.h;
        if (dy3 == null || !dy3.n()) {
            return null;
        }
        return dy3;
    }

    public final cg7 d() {
        return (cg7) this.i.getValue();
    }

    public final void e(long j2) {
        this.B.setValue(new lg7(j2));
    }

    public final void f(long j2) {
        this.A.setValue(new lg7(j2));
    }
}
