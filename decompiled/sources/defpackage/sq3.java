package defpackage;

/* renamed from: sq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sq3 extends e21 {
    public sq3(gq0 gq0, int i) {
        super(new qq3(new jq0(gq0, i)));
    }

    public final vw3 a(sl4 sl4) {
        vw3 vw3;
        sl4.getClass();
        ro7.x.getClass();
        ro7 ro7 = ro7.y;
        fv3 g = sl4.g();
        g.getClass();
        ql4 j = g.j(m27.Q.i());
        Object obj = this.a;
        rq3 rq3 = (rq3) obj;
        if (rq3 instanceof pq3) {
            vw3 = ((pq3) obj).a;
        } else if (rq3 instanceof qq3) {
            jq0 jq0 = ((qq3) obj).a;
            gq0 gq0 = jq0.a;
            int i = jq0.b;
            ql4 y = r16.y(sl4, gq0);
            if (y == null) {
                vw3 = z62.c(x62.z, gq0.toString(), String.valueOf(i));
            } else {
                fu6 g0 = y.g0();
                g0.getClass();
                vw3 F = jb5.F(g0);
                for (int i2 = 0; i2 < i; i2++) {
                    F = sl4.g().h(F);
                }
                vw3 = F;
            }
        } else {
            h.c();
            return null;
        }
        return kl8.H(ro7, j, sg3.D(new p27(vw3)));
    }
}
