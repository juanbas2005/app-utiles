package defpackage;

/* renamed from: hd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class hd3 extends dd3 implements my3 {
    public aa8 M;

    public hd3(aa8 aa8) {
        this.M = aa8;
    }

    public final aa8 V0(aa8 aa8) {
        return new ss7(aa8, this.M);
    }

    public final void W0() {
        super.W0();
        su0.B(this);
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        int d = this.L.d(oh4, oh4.getLayoutDirection()) - this.K.d(oh4, oh4.getLayoutDirection());
        int a = this.L.a(oh4) - this.K.a(oh4);
        int b = (this.L.b(oh4, oh4.getLayoutDirection()) - this.K.b(oh4, oh4.getLayoutDirection())) + d;
        int c = (this.L.c(oh4) - this.K.c(oh4)) + a;
        eh5 y = gh4.y(m31.i(-b, -c, j));
        return oh4.d0(m31.g(j, y.w + b), m31.f(j, y.x + c), b42.w, new gd3(y, d, a, 0));
    }
}
