package defpackage;

/* renamed from: b62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b62 extends e21 {
    public final gq0 b;
    public final uq4 c;

    public b62(gq0 gq0, uq4 uq4) {
        super(new yb5(gq0, uq4));
        this.b = gq0;
        this.c = uq4;
    }

    public final vw3 a(sl4 sl4) {
        fu6 g0;
        sl4.getClass();
        gq0 gq0 = this.b;
        ql4 y = r16.y(sl4, gq0);
        if (y != null) {
            int i = rs1.a;
            if (!rs1.l(y, iq0.y)) {
                y = null;
            }
            if (!(y == null || (g0 = y.g0()) == null)) {
                return g0;
            }
        }
        String gq02 = gq0.toString();
        String str = this.c.w;
        str.getClass();
        return z62.c(x62.W, gq02, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
